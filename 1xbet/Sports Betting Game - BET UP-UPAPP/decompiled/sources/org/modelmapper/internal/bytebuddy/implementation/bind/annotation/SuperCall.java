package org.modelmapper.internal.bytebuddy.implementation.bind.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.concurrent.Callable;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.method.ParameterDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.MethodCallProxy;
import org.modelmapper.internal.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.modelmapper.internal.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.assign.Assigner;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.NullConstant;

@Target({ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes4.dex */
public @interface SuperCall {
    boolean fallbackToDefault() default true;

    boolean nullIfImpossible() default false;

    boolean serializableProxy() default false;

    public enum Binder implements TargetMethodAnnotationDrivenBinder.ParameterBinder<SuperCall> {
        INSTANCE;

        @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public Class<SuperCall> getHandledType() {
            return SuperCall.class;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public MethodDelegationBinder.ParameterBinding<?> bind(AnnotationDescription.Loadable<SuperCall> loadable, MethodDescription methodDescription, ParameterDescription parameterDescription, Implementation.Target target, Assigner assigner, Assigner.Typing typing) {
            Implementation.SpecialMethodInvocation invokeSuper;
            StackManipulation stackManipulation;
            TypeDescription asErasure = parameterDescription.getType().asErasure();
            if (!asErasure.represents(Runnable.class) && !asErasure.represents(Callable.class) && !asErasure.represents(Object.class)) {
                throw new IllegalStateException("A super method call proxy can only be assigned to Runnable or Callable types: " + parameterDescription);
            }
            if (methodDescription.isConstructor()) {
                return loadable.loadSilent().nullIfImpossible() ? new MethodDelegationBinder.ParameterBinding.Anonymous(NullConstant.INSTANCE) : MethodDelegationBinder.ParameterBinding.Illegal.INSTANCE;
            }
            if (loadable.loadSilent().fallbackToDefault()) {
                invokeSuper = target.invokeDominant(methodDescription.asSignatureToken());
            } else {
                invokeSuper = target.invokeSuper(methodDescription.asSignatureToken());
            }
            if (invokeSuper.isValid()) {
                stackManipulation = new MethodCallProxy.AssignableSignatureCall(invokeSuper, loadable.loadSilent().serializableProxy());
            } else if (loadable.loadSilent().nullIfImpossible()) {
                stackManipulation = NullConstant.INSTANCE;
            } else {
                return MethodDelegationBinder.ParameterBinding.Illegal.INSTANCE;
            }
            return new MethodDelegationBinder.ParameterBinding.Anonymous(stackManipulation);
        }
    }
}
