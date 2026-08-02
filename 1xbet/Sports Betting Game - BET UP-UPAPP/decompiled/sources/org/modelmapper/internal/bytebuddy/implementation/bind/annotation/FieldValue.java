package org.modelmapper.internal.bytebuddy.implementation.bind.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationDescription;
import org.modelmapper.internal.bytebuddy.description.field.FieldDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodList;
import org.modelmapper.internal.bytebuddy.description.method.ParameterDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.modelmapper.internal.bytebuddy.implementation.bind.annotation.RuntimeType;
import org.modelmapper.internal.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.assign.Assigner;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.FieldAccess;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodVariableAccess;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatchers;

@Target({ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes4.dex */
public @interface FieldValue {
    Class<?> declaringType() default void.class;

    String value() default "";

    public enum Binder implements TargetMethodAnnotationDrivenBinder.ParameterBinder<FieldValue> {
        INSTANCE(new Delegate());

        private static final MethodDescription.InDefinedShape DECLARING_TYPE;
        private static final MethodDescription.InDefinedShape FIELD_NAME;
        private final TargetMethodAnnotationDrivenBinder.ParameterBinder<FieldValue> delegate;

        static {
            MethodList<MethodDescription.InDefinedShape> declaredMethods = TypeDescription.ForLoadedType.of(FieldValue.class).getDeclaredMethods();
            DECLARING_TYPE = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("declaringType")).getOnly();
            FIELD_NAME = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("value")).getOnly();
        }

        Binder(TargetMethodAnnotationDrivenBinder.ParameterBinder parameterBinder) {
            this.delegate = parameterBinder;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public Class<FieldValue> getHandledType() {
            return this.delegate.getHandledType();
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public MethodDelegationBinder.ParameterBinding<?> bind(AnnotationDescription.Loadable<FieldValue> loadable, MethodDescription methodDescription, ParameterDescription parameterDescription, Implementation.Target target, Assigner assigner, Assigner.Typing typing) {
            return this.delegate.bind(loadable, methodDescription, parameterDescription, target, assigner, typing);
        }

        protected static class Delegate extends TargetMethodAnnotationDrivenBinder.ParameterBinder.ForFieldBinding<FieldValue> {
            protected Delegate() {
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
            public Class<FieldValue> getHandledType() {
                return FieldValue.class;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder.ForFieldBinding
            protected MethodDelegationBinder.ParameterBinding<?> bind(FieldDescription fieldDescription, AnnotationDescription.Loadable<FieldValue> loadable, MethodDescription methodDescription, ParameterDescription parameterDescription, Implementation.Target target, Assigner assigner) {
                StackManipulation[] stackManipulationArr = new StackManipulation[3];
                stackManipulationArr[0] = fieldDescription.isStatic() ? StackManipulation.Trivial.INSTANCE : MethodVariableAccess.loadThis();
                stackManipulationArr[1] = FieldAccess.forField(fieldDescription).read();
                stackManipulationArr[2] = assigner.assign(fieldDescription.getType(), parameterDescription.getType(), RuntimeType.Verifier.check(parameterDescription));
                StackManipulation.Compound compound = new StackManipulation.Compound(stackManipulationArr);
                return compound.isValid() ? new MethodDelegationBinder.ParameterBinding.Anonymous(compound) : MethodDelegationBinder.ParameterBinding.Illegal.INSTANCE;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder.ForFieldBinding
            protected String fieldName(AnnotationDescription.Loadable<FieldValue> loadable) {
                return (String) loadable.getValue(Binder.FIELD_NAME).resolve(String.class);
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder.ForFieldBinding
            protected TypeDescription declaringType(AnnotationDescription.Loadable<FieldValue> loadable) {
                return (TypeDescription) loadable.getValue(Binder.DECLARING_TYPE).resolve(TypeDescription.class);
            }
        }
    }
}
