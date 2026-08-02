package org.modelmapper.internal.bytebuddy.implementation.bind.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.method.ParameterDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.modelmapper.internal.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.assign.Assigner;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.ClassConstant;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.IntegerConstant;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.JavaConstantValue;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.MethodConstant;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.TextConstant;
import org.modelmapper.internal.bytebuddy.utility.JavaConstant;
import org.modelmapper.internal.bytebuddy.utility.JavaType;

@Target({ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes4.dex */
public @interface Origin {
    boolean cache() default true;

    boolean privileged() default false;

    public enum Binder implements TargetMethodAnnotationDrivenBinder.ParameterBinder<Origin> {
        INSTANCE;

        private static StackManipulation methodConstant(Origin origin, MethodDescription.InDefinedShape inDefinedShape) {
            MethodConstant.CanCache of;
            if (origin.privileged()) {
                of = MethodConstant.ofPrivileged(inDefinedShape);
            } else {
                of = MethodConstant.of(inDefinedShape);
            }
            return origin.cache() ? of.cached() : of;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public Class<Origin> getHandledType() {
            return Origin.class;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public MethodDelegationBinder.ParameterBinding<?> bind(AnnotationDescription.Loadable<Origin> loadable, MethodDescription methodDescription, ParameterDescription parameterDescription, Implementation.Target target, Assigner assigner, Assigner.Typing typing) {
            TypeDescription asErasure = parameterDescription.getType().asErasure();
            if (asErasure.represents(Class.class)) {
                return new MethodDelegationBinder.ParameterBinding.Anonymous(ClassConstant.of(target.getOriginType().asErasure()));
            }
            if (asErasure.represents(Method.class)) {
                return methodDescription.isMethod() ? new MethodDelegationBinder.ParameterBinding.Anonymous(methodConstant(loadable.loadSilent(), methodDescription.asDefined())) : MethodDelegationBinder.ParameterBinding.Illegal.INSTANCE;
            }
            if (asErasure.represents(Constructor.class)) {
                return methodDescription.isConstructor() ? new MethodDelegationBinder.ParameterBinding.Anonymous(methodConstant(loadable.loadSilent(), methodDescription.asDefined())) : MethodDelegationBinder.ParameterBinding.Illegal.INSTANCE;
            }
            if (JavaType.EXECUTABLE.getTypeStub().equals(asErasure)) {
                return new MethodDelegationBinder.ParameterBinding.Anonymous(methodConstant(loadable.loadSilent(), methodDescription.asDefined()));
            }
            if (asErasure.represents(String.class)) {
                return new MethodDelegationBinder.ParameterBinding.Anonymous(new TextConstant(methodDescription.toString()));
            }
            if (asErasure.represents(Integer.TYPE)) {
                return new MethodDelegationBinder.ParameterBinding.Anonymous(IntegerConstant.forValue(methodDescription.getModifiers()));
            }
            if (asErasure.equals(JavaType.METHOD_HANDLE.getTypeStub())) {
                return new MethodDelegationBinder.ParameterBinding.Anonymous(new JavaConstantValue(JavaConstant.MethodHandle.of(methodDescription.asDefined())));
            }
            if (asErasure.equals(JavaType.METHOD_TYPE.getTypeStub())) {
                return new MethodDelegationBinder.ParameterBinding.Anonymous(new JavaConstantValue(JavaConstant.MethodType.of(methodDescription.asDefined())));
            }
            throw new IllegalStateException("The " + parameterDescription + " method's " + parameterDescription.getIndex() + " parameter is annotated with a Origin annotation with an argument not representing a Class, Method, Constructor, String, int, MethodType or MethodHandle type");
        }
    }
}
