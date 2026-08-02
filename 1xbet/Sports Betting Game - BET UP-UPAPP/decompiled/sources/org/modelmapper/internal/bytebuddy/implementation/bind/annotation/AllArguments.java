package org.modelmapper.internal.bytebuddy.implementation.bind.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.method.ParameterDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.modelmapper.internal.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.assign.Assigner;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.collection.ArrayFactory;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodVariableAccess;
import org.modelmapper.internal.bytebuddy.utility.CompoundList;

@Target({ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes4.dex */
public @interface AllArguments {
    boolean includeSelf() default false;

    Assignment value() default Assignment.STRICT;

    public enum Assignment {
        STRICT(true),
        SLACK(false);

        private final boolean strict;

        Assignment(boolean z) {
            this.strict = z;
        }

        protected boolean isStrict() {
            return this.strict;
        }
    }

    public enum Binder implements TargetMethodAnnotationDrivenBinder.ParameterBinder<AllArguments> {
        INSTANCE;

        @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public Class<AllArguments> getHandledType() {
            return AllArguments.class;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public MethodDelegationBinder.ParameterBinding<?> bind(AnnotationDescription.Loadable<AllArguments> loadable, MethodDescription methodDescription, ParameterDescription parameterDescription, Implementation.Target target, Assigner assigner, Assigner.Typing typing) {
            TypeDescription.Generic componentType;
            List<TypeDescription.Generic> asTypeList;
            if (parameterDescription.getType().represents(Object.class)) {
                componentType = TypeDescription.Generic.OBJECT;
            } else if (parameterDescription.getType().isArray()) {
                componentType = parameterDescription.getType().getComponentType();
            } else {
                throw new IllegalStateException("Expected an array type for all argument annotation on " + methodDescription);
            }
            int i = (methodDescription.isStatic() || !loadable.loadSilent().includeSelf()) ? 0 : 1;
            ArrayList arrayList = new ArrayList(methodDescription.getParameters().size() + i);
            int i2 = (methodDescription.isStatic() || i != 0) ? 0 : 1;
            if (i != 0) {
                asTypeList = CompoundList.of(target.getInstrumentedType().asGenericType(), methodDescription.getParameters().asTypeList());
            } else {
                asTypeList = methodDescription.getParameters().asTypeList();
            }
            for (TypeDescription.Generic generic : asTypeList) {
                StackManipulation.Compound compound = new StackManipulation.Compound(MethodVariableAccess.of(generic).loadFrom(i2), assigner.assign(generic, componentType, typing));
                if (compound.isValid()) {
                    arrayList.add(compound);
                } else if (loadable.loadSilent().value().isStrict()) {
                    return MethodDelegationBinder.ParameterBinding.Illegal.INSTANCE;
                }
                i2 += generic.getStackSize().getSize();
            }
            return new MethodDelegationBinder.ParameterBinding.Anonymous(ArrayFactory.forType(componentType).withValues(arrayList));
        }
    }
}
