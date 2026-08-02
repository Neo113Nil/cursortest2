package org.modelmapper.internal.bytebuddy.implementation.bind.annotation;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodList;
import org.modelmapper.internal.bytebuddy.description.method.ParameterDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;
import org.modelmapper.internal.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.modelmapper.internal.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.assign.Assigner;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatchers;

@Target({ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes4.dex */
public @interface Default {
    Class<?> proxyType() default void.class;

    boolean serializableProxy() default false;

    public enum Binder implements TargetMethodAnnotationDrivenBinder.ParameterBinder<Default> {
        INSTANCE;

        private static final MethodDescription.InDefinedShape PROXY_TYPE;
        private static final MethodDescription.InDefinedShape SERIALIZABLE_PROXY;

        static {
            MethodList<MethodDescription.InDefinedShape> declaredMethods = TypeDescription.ForLoadedType.of(Default.class).getDeclaredMethods();
            SERIALIZABLE_PROXY = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("serializableProxy")).getOnly();
            PROXY_TYPE = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("proxyType")).getOnly();
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public Class<Default> getHandledType() {
            return Default.class;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public MethodDelegationBinder.ParameterBinding<?> bind(AnnotationDescription.Loadable<Default> loadable, MethodDescription methodDescription, ParameterDescription parameterDescription, Implementation.Target target, Assigner assigner, Assigner.Typing typing) {
            TypeDescription resolve = TypeLocator.ForType.of((TypeDescription) loadable.getValue(PROXY_TYPE).resolve(TypeDescription.class)).resolve(parameterDescription.getType());
            if (!resolve.isInterface()) {
                throw new IllegalStateException(parameterDescription + " uses the @Default annotation on an invalid type");
            }
            if (methodDescription.isStatic() || !target.getInstrumentedType().getInterfaces().asErasures().contains(resolve)) {
                return MethodDelegationBinder.ParameterBinding.Illegal.INSTANCE;
            }
            return new MethodDelegationBinder.ParameterBinding.Anonymous(new TypeProxy.ForDefaultMethod(resolve, target, ((Boolean) loadable.getValue(SERIALIZABLE_PROXY).resolve(Boolean.class)).booleanValue()));
        }

        protected interface TypeLocator {
            TypeDescription resolve(TypeDescription.Generic generic);

            public enum ForParameterType implements TypeLocator {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.Default.Binder.TypeLocator
                public TypeDescription resolve(TypeDescription.Generic generic) {
                    return generic.asErasure();
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
                    if (!typeDescription.isInterface()) {
                        throw new IllegalStateException("Cannot assign proxy to " + typeDescription);
                    }
                    return new ForType(typeDescription);
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.Default.Binder.TypeLocator
                public TypeDescription resolve(TypeDescription.Generic generic) {
                    if (!this.typeDescription.isAssignableTo(generic.asErasure())) {
                        throw new IllegalStateException("Impossible to assign " + this.typeDescription + " to parameter of type " + generic);
                    }
                    return this.typeDescription;
                }
            }
        }
    }
}
