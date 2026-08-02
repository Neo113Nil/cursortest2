package org.modelmapper.internal.bytebuddy.implementation.attribute;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.method.ParameterDescription;
import org.modelmapper.internal.bytebuddy.description.method.ParameterList;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.implementation.attribute.AnnotationAppender;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatchers;

/* loaded from: classes4.dex */
public interface MethodAttributeAppender {

    public enum NoOp implements MethodAttributeAppender, Factory {
        INSTANCE;

        @Override // org.modelmapper.internal.bytebuddy.implementation.attribute.MethodAttributeAppender
        public void apply(MethodVisitor methodVisitor, MethodDescription methodDescription, AnnotationValueFilter annotationValueFilter) {
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory
        public MethodAttributeAppender make(TypeDescription typeDescription) {
            return this;
        }
    }

    void apply(MethodVisitor methodVisitor, MethodDescription methodDescription, AnnotationValueFilter annotationValueFilter);

    public interface Factory {
        MethodAttributeAppender make(TypeDescription typeDescription);

        @HashCodeAndEqualsPlugin.Enhance
        public static class Compound implements Factory {
            private final List<Factory> factories;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.factories.equals(((Compound) obj).factories);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.factories.hashCode();
            }

            public Compound(Factory... factoryArr) {
                this((List<? extends Factory>) Arrays.asList(factoryArr));
            }

            public Compound(List<? extends Factory> list) {
                this.factories = new ArrayList();
                for (Factory factory : list) {
                    if (factory instanceof Compound) {
                        this.factories.addAll(((Compound) factory).factories);
                    } else if (!(factory instanceof NoOp)) {
                        this.factories.add(factory);
                    }
                }
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory
            public MethodAttributeAppender make(TypeDescription typeDescription) {
                ArrayList arrayList = new ArrayList(this.factories.size());
                Iterator<Factory> it = this.factories.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().make(typeDescription));
                }
                return new Compound(arrayList);
            }
        }
    }

    public enum ForInstrumentedMethod implements MethodAttributeAppender, Factory {
        EXCLUDING_RECEIVER { // from class: org.modelmapper.internal.bytebuddy.implementation.attribute.MethodAttributeAppender.ForInstrumentedMethod.1
            @Override // org.modelmapper.internal.bytebuddy.implementation.attribute.MethodAttributeAppender.ForInstrumentedMethod
            protected AnnotationAppender appendReceiver(AnnotationAppender annotationAppender, AnnotationValueFilter annotationValueFilter, MethodDescription methodDescription) {
                return annotationAppender;
            }
        },
        INCLUDING_RECEIVER { // from class: org.modelmapper.internal.bytebuddy.implementation.attribute.MethodAttributeAppender.ForInstrumentedMethod.2
            @Override // org.modelmapper.internal.bytebuddy.implementation.attribute.MethodAttributeAppender.ForInstrumentedMethod
            protected AnnotationAppender appendReceiver(AnnotationAppender annotationAppender, AnnotationValueFilter annotationValueFilter, MethodDescription methodDescription) {
                TypeDescription.Generic receiverType = methodDescription.getReceiverType();
                return receiverType == null ? annotationAppender : (AnnotationAppender) receiverType.accept(AnnotationAppender.ForTypeAnnotations.ofReceiverType(annotationAppender, annotationValueFilter));
            }
        };

        protected abstract AnnotationAppender appendReceiver(AnnotationAppender annotationAppender, AnnotationValueFilter annotationValueFilter, MethodDescription methodDescription);

        @Override // org.modelmapper.internal.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory
        public MethodAttributeAppender make(TypeDescription typeDescription) {
            return this;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.attribute.MethodAttributeAppender
        public void apply(MethodVisitor methodVisitor, MethodDescription methodDescription, AnnotationValueFilter annotationValueFilter) {
            int i = 0;
            AnnotationAppender ofTypeVariable = AnnotationAppender.ForTypeAnnotations.ofTypeVariable((AnnotationAppender) methodDescription.getReturnType().accept(AnnotationAppender.ForTypeAnnotations.ofMethodReturnType(new AnnotationAppender.Default(new AnnotationAppender.Target.OnMethod(methodVisitor)), annotationValueFilter)), annotationValueFilter, false, methodDescription.getTypeVariables());
            Iterator it = methodDescription.getDeclaredAnnotations().filter(ElementMatchers.not(ElementMatchers.annotationType(ElementMatchers.nameStartsWith("jdk.internal.")))).iterator();
            while (it.hasNext()) {
                ofTypeVariable = ofTypeVariable.append((AnnotationDescription) it.next(), annotationValueFilter);
            }
            Iterator it2 = methodDescription.getParameters().iterator();
            while (it2.hasNext()) {
                ParameterDescription parameterDescription = (ParameterDescription) it2.next();
                AnnotationAppender annotationAppender = (AnnotationAppender) parameterDescription.getType().accept(AnnotationAppender.ForTypeAnnotations.ofMethodParameterType(new AnnotationAppender.Default(new AnnotationAppender.Target.OnMethodParameter(methodVisitor, parameterDescription.getIndex())), annotationValueFilter, parameterDescription.getIndex()));
                Iterator it3 = parameterDescription.getDeclaredAnnotations().iterator();
                while (it3.hasNext()) {
                    annotationAppender = annotationAppender.append((AnnotationDescription) it3.next(), annotationValueFilter);
                }
            }
            AnnotationAppender appendReceiver = appendReceiver(ofTypeVariable, annotationValueFilter, methodDescription);
            Iterator it4 = methodDescription.getExceptionTypes().iterator();
            while (it4.hasNext()) {
                appendReceiver = (AnnotationAppender) ((TypeDescription.Generic) it4.next()).accept(AnnotationAppender.ForTypeAnnotations.ofExceptionType(appendReceiver, annotationValueFilter, i));
                i++;
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class Explicit implements MethodAttributeAppender, Factory {
        private final List<? extends AnnotationDescription> annotations;
        private final Target target;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Explicit explicit = (Explicit) obj;
            return this.target.equals(explicit.target) && this.annotations.equals(explicit.annotations);
        }

        public int hashCode() {
            return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.target.hashCode()) * 31) + this.annotations.hashCode();
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory
        public MethodAttributeAppender make(TypeDescription typeDescription) {
            return this;
        }

        public Explicit(int i, List<? extends AnnotationDescription> list) {
            this(new Target.OnMethodParameter(i), list);
        }

        public Explicit(List<? extends AnnotationDescription> list) {
            this(Target.OnMethod.INSTANCE, list);
        }

        protected Explicit(Target target, List<? extends AnnotationDescription> list) {
            this.target = target;
            this.annotations = list;
        }

        public static Factory of(MethodDescription methodDescription) {
            ParameterList<?> parameters = methodDescription.getParameters();
            ArrayList arrayList = new ArrayList(parameters.size() + 1);
            arrayList.add(new Explicit(methodDescription.getDeclaredAnnotations()));
            Iterator it = parameters.iterator();
            while (it.hasNext()) {
                ParameterDescription parameterDescription = (ParameterDescription) it.next();
                arrayList.add(new Explicit(parameterDescription.getIndex(), parameterDescription.getDeclaredAnnotations()));
            }
            return new Factory.Compound(arrayList);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.attribute.MethodAttributeAppender
        public void apply(MethodVisitor methodVisitor, MethodDescription methodDescription, AnnotationValueFilter annotationValueFilter) {
            AnnotationAppender annotationAppender = new AnnotationAppender.Default(this.target.make(methodVisitor, methodDescription));
            Iterator<? extends AnnotationDescription> it = this.annotations.iterator();
            while (it.hasNext()) {
                annotationAppender = annotationAppender.append(it.next(), annotationValueFilter);
            }
        }

        protected interface Target {
            AnnotationAppender.Target make(MethodVisitor methodVisitor, MethodDescription methodDescription);

            public enum OnMethod implements Target {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.implementation.attribute.MethodAttributeAppender.Explicit.Target
                public AnnotationAppender.Target make(MethodVisitor methodVisitor, MethodDescription methodDescription) {
                    return new AnnotationAppender.Target.OnMethod(methodVisitor);
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class OnMethodParameter implements Target {
                private final int parameterIndex;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.parameterIndex == ((OnMethodParameter) obj).parameterIndex;
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.parameterIndex;
                }

                protected OnMethodParameter(int i) {
                    this.parameterIndex = i;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.attribute.MethodAttributeAppender.Explicit.Target
                public AnnotationAppender.Target make(MethodVisitor methodVisitor, MethodDescription methodDescription) {
                    if (this.parameterIndex >= methodDescription.getParameters().size()) {
                        throw new IllegalArgumentException("Method " + methodDescription + " has less then " + this.parameterIndex + " parameters");
                    }
                    return new AnnotationAppender.Target.OnMethodParameter(methodVisitor, this.parameterIndex);
                }
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class ForReceiverType implements MethodAttributeAppender, Factory {
        private final TypeDescription.Generic receiverType;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.receiverType.equals(((ForReceiverType) obj).receiverType);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.receiverType.hashCode();
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory
        public MethodAttributeAppender make(TypeDescription typeDescription) {
            return this;
        }

        public ForReceiverType(TypeDescription.Generic generic) {
            this.receiverType = generic;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.attribute.MethodAttributeAppender
        public void apply(MethodVisitor methodVisitor, MethodDescription methodDescription, AnnotationValueFilter annotationValueFilter) {
            this.receiverType.accept(AnnotationAppender.ForTypeAnnotations.ofReceiverType(new AnnotationAppender.Default(new AnnotationAppender.Target.OnMethod(methodVisitor)), annotationValueFilter));
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class Compound implements MethodAttributeAppender {
        private final List<MethodAttributeAppender> methodAttributeAppenders;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.methodAttributeAppenders.equals(((Compound) obj).methodAttributeAppenders);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.methodAttributeAppenders.hashCode();
        }

        public Compound(MethodAttributeAppender... methodAttributeAppenderArr) {
            this((List<? extends MethodAttributeAppender>) Arrays.asList(methodAttributeAppenderArr));
        }

        public Compound(List<? extends MethodAttributeAppender> list) {
            this.methodAttributeAppenders = new ArrayList();
            for (MethodAttributeAppender methodAttributeAppender : list) {
                if (methodAttributeAppender instanceof Compound) {
                    this.methodAttributeAppenders.addAll(((Compound) methodAttributeAppender).methodAttributeAppenders);
                } else if (!(methodAttributeAppender instanceof NoOp)) {
                    this.methodAttributeAppenders.add(methodAttributeAppender);
                }
            }
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.attribute.MethodAttributeAppender
        public void apply(MethodVisitor methodVisitor, MethodDescription methodDescription, AnnotationValueFilter annotationValueFilter) {
            Iterator<MethodAttributeAppender> it = this.methodAttributeAppenders.iterator();
            while (it.hasNext()) {
                it.next().apply(methodVisitor, methodDescription, annotationValueFilter);
            }
        }
    }
}
