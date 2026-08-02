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
import org.modelmapper.internal.bytebuddy.implementation.bind.ArgumentTypeResolver;
import org.modelmapper.internal.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.modelmapper.internal.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.assign.Assigner;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodVariableAccess;

@Target({ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes4.dex */
public @interface Argument {

    public enum BindingMechanic {
        UNIQUE { // from class: org.modelmapper.internal.bytebuddy.implementation.bind.annotation.Argument.BindingMechanic.1
            @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.Argument.BindingMechanic
            protected MethodDelegationBinder.ParameterBinding<?> makeBinding(TypeDescription.Generic generic, TypeDescription.Generic generic2, int i, Assigner assigner, Assigner.Typing typing, int i2) {
                return MethodDelegationBinder.ParameterBinding.Unique.of(new StackManipulation.Compound(MethodVariableAccess.of(generic).loadFrom(i2), assigner.assign(generic, generic2, typing)), new ArgumentTypeResolver.ParameterIndexToken(i));
            }
        },
        ANONYMOUS { // from class: org.modelmapper.internal.bytebuddy.implementation.bind.annotation.Argument.BindingMechanic.2
            @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.Argument.BindingMechanic
            protected MethodDelegationBinder.ParameterBinding<?> makeBinding(TypeDescription.Generic generic, TypeDescription.Generic generic2, int i, Assigner assigner, Assigner.Typing typing, int i2) {
                return new MethodDelegationBinder.ParameterBinding.Anonymous(new StackManipulation.Compound(MethodVariableAccess.of(generic).loadFrom(i2), assigner.assign(generic, generic2, typing)));
            }
        };

        protected abstract MethodDelegationBinder.ParameterBinding<?> makeBinding(TypeDescription.Generic generic, TypeDescription.Generic generic2, int i, Assigner assigner, Assigner.Typing typing, int i2);
    }

    BindingMechanic bindingMechanic() default BindingMechanic.UNIQUE;

    int value();

    public enum Binder implements TargetMethodAnnotationDrivenBinder.ParameterBinder<Argument> {
        INSTANCE;

        @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public Class<Argument> getHandledType() {
            return Argument.class;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public MethodDelegationBinder.ParameterBinding<?> bind(AnnotationDescription.Loadable<Argument> loadable, MethodDescription methodDescription, ParameterDescription parameterDescription, Implementation.Target target, Assigner assigner, Assigner.Typing typing) {
            Argument loadSilent = loadable.loadSilent();
            if (loadSilent.value() < 0) {
                throw new IllegalArgumentException("@Argument annotation on " + parameterDescription + " specifies negative index");
            }
            if (methodDescription.getParameters().size() <= loadSilent.value()) {
                return MethodDelegationBinder.ParameterBinding.Illegal.INSTANCE;
            }
            return loadSilent.bindingMechanic().makeBinding(((ParameterDescription) methodDescription.getParameters().get(loadSilent.value())).getType(), parameterDescription.getType(), loadSilent.value(), assigner, typing, ((ParameterDescription) methodDescription.getParameters().get(loadSilent.value())).getOffset());
        }
    }
}
