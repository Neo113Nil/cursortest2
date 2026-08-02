package org.modelmapper.internal.bytebuddy.implementation.bind.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.method.ParameterDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.modelmapper.internal.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.assign.Assigner;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.DefaultValue;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.NullConstant;

@Target({ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes4.dex */
public @interface StubValue {

    public enum Binder implements TargetMethodAnnotationDrivenBinder.ParameterBinder<StubValue> {
        INSTANCE;

        @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public Class<StubValue> getHandledType() {
            return StubValue.class;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public MethodDelegationBinder.ParameterBinding<?> bind(AnnotationDescription.Loadable<StubValue> loadable, MethodDescription methodDescription, ParameterDescription parameterDescription, Implementation.Target target, Assigner assigner, Assigner.Typing typing) {
            if (!parameterDescription.getType().represents(Object.class)) {
                throw new IllegalStateException(parameterDescription + " uses StubValue annotation on non-Object type");
            }
            return new MethodDelegationBinder.ParameterBinding.Anonymous(methodDescription.getReturnType().represents(Void.TYPE) ? NullConstant.INSTANCE : new StackManipulation.Compound(DefaultValue.of(methodDescription.getReturnType().asErasure()), assigner.assign(methodDescription.getReturnType(), TypeDescription.Generic.OBJECT, typing)));
        }
    }
}
