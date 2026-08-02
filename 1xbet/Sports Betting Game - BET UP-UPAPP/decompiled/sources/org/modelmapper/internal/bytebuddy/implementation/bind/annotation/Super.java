package org.modelmapper.internal.bytebuddy.implementation.bind.annotation;

import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationDescription;
import org.modelmapper.internal.bytebuddy.description.enumeration.EnumerationDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodList;
import org.modelmapper.internal.bytebuddy.description.method.ParameterDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.dynamic.TargetType;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;
import org.modelmapper.internal.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.modelmapper.internal.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.assign.Assigner;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatchers;

@Target({ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes4.dex */
public @interface Super {
    Class<?>[] constructorParameters() default {};

    boolean ignoreFinalizer() default true;

    Class<?> proxyType() default void.class;

    boolean serializableProxy() default false;

    Instantiation strategy() default Instantiation.CONSTRUCTOR;

    public enum Instantiation {
        CONSTRUCTOR { // from class: org.modelmapper.internal.bytebuddy.implementation.bind.annotation.Super.Instantiation.1
            @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.Super.Instantiation
            protected StackManipulation proxyFor(TypeDescription typeDescription, Implementation.Target target, AnnotationDescription.Loadable<Super> loadable) {
                return new TypeProxy.ForSuperMethodByConstructor(typeDescription, target, Arrays.asList((Object[]) loadable.getValue(Instantiation.CONSTRUCTOR_PARAMETERS).resolve(TypeDescription[].class)), ((Boolean) loadable.getValue(Instantiation.IGNORE_FINALIZER).resolve(Boolean.class)).booleanValue(), ((Boolean) loadable.getValue(Instantiation.SERIALIZABLE_PROXY).resolve(Boolean.class)).booleanValue());
            }
        },
        UNSAFE { // from class: org.modelmapper.internal.bytebuddy.implementation.bind.annotation.Super.Instantiation.2
            @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.Super.Instantiation
            protected StackManipulation proxyFor(TypeDescription typeDescription, Implementation.Target target, AnnotationDescription.Loadable<Super> loadable) {
                return new TypeProxy.ForSuperMethodByReflectionFactory(typeDescription, target, ((Boolean) loadable.getValue(Instantiation.IGNORE_FINALIZER).resolve(Boolean.class)).booleanValue(), ((Boolean) loadable.getValue(Instantiation.SERIALIZABLE_PROXY).resolve(Boolean.class)).booleanValue());
            }
        };

        private static final MethodDescription.InDefinedShape CONSTRUCTOR_PARAMETERS;
        private static final MethodDescription.InDefinedShape IGNORE_FINALIZER;
        private static final MethodDescription.InDefinedShape SERIALIZABLE_PROXY;

        protected abstract StackManipulation proxyFor(TypeDescription typeDescription, Implementation.Target target, AnnotationDescription.Loadable<Super> loadable);

        static {
            MethodList<MethodDescription.InDefinedShape> declaredMethods = TypeDescription.ForLoadedType.of(Super.class).getDeclaredMethods();
            IGNORE_FINALIZER = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("ignoreFinalizer")).getOnly();
            SERIALIZABLE_PROXY = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("serializableProxy")).getOnly();
            CONSTRUCTOR_PARAMETERS = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("constructorParameters")).getOnly();
        }
    }

    public enum Binder implements TargetMethodAnnotationDrivenBinder.ParameterBinder<Super> {
        INSTANCE;

        private static final MethodDescription.InDefinedShape PROXY_TYPE;
        private static final MethodDescription.InDefinedShape STRATEGY;

        static {
            MethodList<MethodDescription.InDefinedShape> declaredMethods = TypeDescription.ForLoadedType.of(Super.class).getDeclaredMethods();
            STRATEGY = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named(X3.f.e)).getOnly();
            PROXY_TYPE = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("proxyType")).getOnly();
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public Class<Super> getHandledType() {
            return Super.class;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public MethodDelegationBinder.ParameterBinding<?> bind(AnnotationDescription.Loadable<Super> loadable, MethodDescription methodDescription, ParameterDescription parameterDescription, Implementation.Target target, Assigner assigner, Assigner.Typing typing) {
            if (parameterDescription.getType().isPrimitive() || parameterDescription.getType().isArray()) {
                throw new IllegalStateException(parameterDescription + " uses the @Super annotation on an invalid type");
            }
            TypeDescription resolve = TypeLocator.ForType.of((TypeDescription) loadable.getValue(PROXY_TYPE).resolve(TypeDescription.class)).resolve(target.getInstrumentedType(), parameterDescription.getType());
            if (resolve.isFinal()) {
                throw new IllegalStateException("Cannot extend final type as @Super proxy: " + resolve);
            }
            if (methodDescription.isStatic() || !target.getInstrumentedType().isAssignableTo(resolve)) {
                return MethodDelegationBinder.ParameterBinding.Illegal.INSTANCE;
            }
            return new MethodDelegationBinder.ParameterBinding.Anonymous(((Instantiation) ((EnumerationDescription) loadable.getValue(STRATEGY).resolve(EnumerationDescription.class)).load(Instantiation.class)).proxyFor(resolve, target, loadable));
        }

        protected interface TypeLocator {

            public enum ForInstrumentedType implements TypeLocator {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.Super.Binder.TypeLocator
                public TypeDescription resolve(TypeDescription typeDescription, TypeDescription.Generic generic) {
                    return typeDescription;
                }
            }

            TypeDescription resolve(TypeDescription typeDescription, TypeDescription.Generic generic);

            public enum ForParameterType implements TypeLocator {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.Super.Binder.TypeLocator
                public TypeDescription resolve(TypeDescription typeDescription, TypeDescription.Generic generic) {
                    TypeDescription asErasure = generic.asErasure();
                    return asErasure.equals(typeDescription) ? typeDescription : asErasure;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForType implements TypeLocator {
                private final TypeDescription typeDescription;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.typeDescription.equals(((ForType) obj).typeDescription);
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.typeDescription.hashCode();
                }

                protected ForType(TypeDescription typeDescription) {
                    this.typeDescription = typeDescription;
                }

                protected static TypeLocator of(TypeDescription typeDescription) {
                    if (typeDescription.represents(Void.TYPE)) {
                        return ForParameterType.INSTANCE;
                    }
                    if (typeDescription.represents(TargetType.class)) {
                        return ForInstrumentedType.INSTANCE;
                    }
                    if (typeDescription.isPrimitive() || typeDescription.isArray()) {
                        throw new IllegalStateException("Cannot assign proxy to " + typeDescription);
                    }
                    return new ForType(typeDescription);
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.Super.Binder.TypeLocator
                public TypeDescription resolve(TypeDescription typeDescription, TypeDescription.Generic generic) {
                    if (!this.typeDescription.isAssignableTo(generic.asErasure())) {
                        throw new IllegalStateException("Impossible to assign " + this.typeDescription + " to parameter of type " + generic);
                    }
                    return this.typeDescription;
                }
            }
        }
    }
}
