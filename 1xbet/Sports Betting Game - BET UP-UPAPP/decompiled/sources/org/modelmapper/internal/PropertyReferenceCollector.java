package org.modelmapper.internal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import org.modelmapper.internal.ExplicitMappingBuilder;
import org.modelmapper.internal.PropertyInfoImpl;
import org.modelmapper.spi.NameableType;
import org.modelmapper.spi.TypeSafeSourceGetter;

/* loaded from: classes4.dex */
class PropertyReferenceCollector {
    private InheritingConfiguration config;
    private Object constant;
    private ExplicitMappingBuilder.MappingOptions options;
    private Class<?> sourceType;
    private List<Accessor> accessors = new ArrayList();
    private List<Mutator> mutators = new ArrayList();
    private Errors errors = new Errors();
    private Errors proxyErrors = new Errors();

    /* JADX WARN: Multi-variable type inference failed */
    public static <S, D> List<Accessor> collect(TypeMapImpl<S, D> typeMapImpl, TypeSafeSourceGetter<S, ?> typeSafeSourceGetter) {
        PropertyReferenceCollector propertyReferenceCollector = new PropertyReferenceCollector(typeMapImpl.configuration, null);
        try {
            Object proxyFor = ProxyFactory.proxyFor(typeMapImpl.getSourceType(), propertyReferenceCollector.newSourceInterceptor(), propertyReferenceCollector.getProxyErrors());
            Object obj = typeSafeSourceGetter.get(proxyFor);
            if (proxyFor == obj) {
                propertyReferenceCollector.mapFromSource(typeMapImpl.getSourceType());
            }
            if (propertyReferenceCollector.isNoSourceGetter()) {
                propertyReferenceCollector.mapFromConstant(obj);
            }
            return propertyReferenceCollector.accessors;
        } catch (NullPointerException e) {
            if (propertyReferenceCollector.getProxyErrors().hasErrors()) {
                throw propertyReferenceCollector.getProxyErrors().toException();
            }
            throw e;
        } catch (ErrorsException e2) {
            throw e2.getErrors().toConfigurationException();
        }
    }

    PropertyReferenceCollector(InheritingConfiguration inheritingConfiguration, ExplicitMappingBuilder.MappingOptions mappingOptions) {
        this.config = inheritingConfiguration;
        this.options = mappingOptions;
    }

    public final class SourceInterceptor implements InvocationHandler {
        public SourceInterceptor() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            PropertyReferenceCollector.this.visitSource(obj.getClass(), method);
            if (Void.class.isAssignableFrom(method.getReturnType())) {
                return null;
            }
            try {
                return ProxyFactory.proxyFor(PropertyReferenceCollector.resolveReturnType(method), this, PropertyReferenceCollector.this.proxyErrors);
            } catch (ErrorsException unused) {
                return null;
            }
        }
    }

    public final class DestinationInterceptor implements InvocationHandler {
        public DestinationInterceptor() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            PropertyReferenceCollector.this.visitDestination(obj.getClass(), method);
            if (Void.class.isAssignableFrom(method.getReturnType())) {
                return null;
            }
            try {
                return ProxyFactory.proxyFor(PropertyReferenceCollector.resolveReturnType(method), this, PropertyReferenceCollector.this.proxyErrors);
            } catch (ErrorsException unused) {
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Class<?> resolveReturnType(Method method) {
        return new PropertyInfoImpl.MethodAccessor(method.getDeclaringClass(), method, method.getName()).getType();
    }

    SourceInterceptor newSourceInterceptor() {
        return new SourceInterceptor();
    }

    DestinationInterceptor newDestinationInterceptor() {
        return new DestinationInterceptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void visitSource(Class<?> cls, Method method) {
        if (PropertyInfoResolver.ACCESSORS.isValid(method)) {
            this.accessors.add(PropertyInfoRegistry.accessorFor(cls, method, this.config, this.config.getSourceNameTransformer().transform(method.getName(), NameableType.METHOD)));
        } else {
            this.errors.addMessage("Illegal SourceGetter method: %s.%s", cls.getName(), method.getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void visitDestination(Class<?> cls, Method method) {
        if (PropertyInfoResolver.MUTATORS.isValid(method)) {
            this.mutators.add(PropertyInfoRegistry.mutatorFor(cls, method, this.config, this.config.getDestinationNameTransformer().transform(method.getName(), NameableType.METHOD)));
        } else {
            if (PropertyInfoResolver.ACCESSORS.isValid(method)) {
                Mutator mutatorForAccessorMethod = TypeInfoRegistry.typeInfoFor(cls, this.config).mutatorForAccessorMethod(method.getName());
                if (mutatorForAccessorMethod != null) {
                    this.mutators.add(mutatorForAccessorMethod);
                    return;
                } else {
                    this.errors.addMessage("No setter found: %s.%s", cls.getName(), method.getName());
                    return;
                }
            }
            this.errors.addMessage("Illegal DestinationSetter method: %s.%s", cls.getName(), method.getName());
        }
    }

    MappingImpl collect() {
        if (this.mutators.isEmpty()) {
            this.errors.addMessage("Illegal DestinationSetter defined", new Object[0]);
        }
        this.errors.throwConfigurationExceptionIfErrorsExist();
        if (this.sourceType != null) {
            return new SourceMappingImpl(this.sourceType, this.mutators, this.options);
        }
        if (this.accessors.isEmpty()) {
            return new ConstantMappingImpl(this.constant, this.mutators, this.options);
        }
        return new PropertyMappingImpl(this.accessors, this.mutators, this.options);
    }

    public Errors getErrors() {
        return this.errors;
    }

    Errors getProxyErrors() {
        return this.proxyErrors;
    }

    void mapFromSource(Class<?> cls) {
        this.sourceType = cls;
    }

    void mapFromConstant(Object obj) {
        this.constant = obj;
    }

    boolean isNoSourceGetter() {
        return this.accessors.isEmpty();
    }
}
