package org.modelmapper.internal.bytebuddy.implementation.bind.annotation;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.method.ParameterDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.MethodAccessorFactory;
import org.modelmapper.internal.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.modelmapper.internal.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.assign.Assigner;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.MethodConstant;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.NullConstant;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.FieldAccess;

@Target({ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes4.dex */
public @interface SuperMethod {
    boolean cached() default true;

    boolean fallbackToDefault() default true;

    boolean nullIfImpossible() default false;

    boolean privileged() default false;

    public enum Binder implements TargetMethodAnnotationDrivenBinder.ParameterBinder<SuperMethod> {
        INSTANCE;

        @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public Class<SuperMethod> getHandledType() {
            return SuperMethod.class;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public MethodDelegationBinder.ParameterBinding<?> bind(AnnotationDescription.Loadable<SuperMethod> loadable, MethodDescription methodDescription, ParameterDescription parameterDescription, Implementation.Target target, Assigner assigner, Assigner.Typing typing) {
            Implementation.SpecialMethodInvocation invokeSuper;
            if (!parameterDescription.getType().asErasure().isAssignableFrom(Method.class)) {
                throw new IllegalStateException("Cannot assign Method type to " + parameterDescription);
            }
            if (methodDescription.isMethod()) {
                if (loadable.loadSilent().fallbackToDefault()) {
                    invokeSuper = target.invokeDominant(methodDescription.asSignatureToken());
                } else {
                    invokeSuper = target.invokeSuper(methodDescription.asSignatureToken());
                }
                if (invokeSuper.isValid()) {
                    return new MethodDelegationBinder.ParameterBinding.Anonymous(new DelegationMethod(invokeSuper, loadable.loadSilent().cached(), loadable.loadSilent().privileged()));
                }
                if (loadable.loadSilent().nullIfImpossible()) {
                    return new MethodDelegationBinder.ParameterBinding.Anonymous(NullConstant.INSTANCE);
                }
                return MethodDelegationBinder.ParameterBinding.Illegal.INSTANCE;
            }
            if (loadable.loadSilent().nullIfImpossible()) {
                return new MethodDelegationBinder.ParameterBinding.Anonymous(NullConstant.INSTANCE);
            }
            return MethodDelegationBinder.ParameterBinding.Illegal.INSTANCE;
        }

        @HashCodeAndEqualsPlugin.Enhance
        protected static class DelegationMethod implements StackManipulation {
            private final boolean cached;
            private final boolean privileged;
            private final Implementation.SpecialMethodInvocation specialMethodInvocation;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                DelegationMethod delegationMethod = (DelegationMethod) obj;
                return this.specialMethodInvocation.equals(delegationMethod.specialMethodInvocation) && this.cached == delegationMethod.cached && this.privileged == delegationMethod.privileged;
            }

            public int hashCode() {
                return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.specialMethodInvocation.hashCode()) * 31) + (this.cached ? 1 : 0)) * 31) + (this.privileged ? 1 : 0);
            }

            protected DelegationMethod(Implementation.SpecialMethodInvocation specialMethodInvocation, boolean z, boolean z2) {
                this.specialMethodInvocation = specialMethodInvocation;
                this.cached = z;
                this.privileged = z2;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public boolean isValid() {
                return this.specialMethodInvocation.isValid();
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                StackManipulation of;
                if (this.privileged) {
                    of = MethodConstant.ofPrivileged(context.registerAccessorFor(this.specialMethodInvocation, MethodAccessorFactory.AccessType.PUBLIC));
                } else {
                    of = MethodConstant.of(context.registerAccessorFor(this.specialMethodInvocation, MethodAccessorFactory.AccessType.PUBLIC));
                }
                if (this.cached) {
                    of = FieldAccess.forField(context.cache(of, TypeDescription.ForLoadedType.of(Method.class))).read();
                }
                return of.apply(methodVisitor, context);
            }
        }
    }
}
