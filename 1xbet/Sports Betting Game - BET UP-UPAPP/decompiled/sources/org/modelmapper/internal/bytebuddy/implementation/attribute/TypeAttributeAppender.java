package org.modelmapper.internal.bytebuddy.implementation.attribute;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.modelmapper.internal.asm.ClassVisitor;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationDescription;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationList;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeList;
import org.modelmapper.internal.bytebuddy.implementation.attribute.AnnotationAppender;

/* loaded from: classes4.dex */
public interface TypeAttributeAppender {

    public enum NoOp implements TypeAttributeAppender {
        INSTANCE;

        @Override // org.modelmapper.internal.bytebuddy.implementation.attribute.TypeAttributeAppender
        public void apply(ClassVisitor classVisitor, TypeDescription typeDescription, AnnotationValueFilter annotationValueFilter) {
        }
    }

    void apply(ClassVisitor classVisitor, TypeDescription typeDescription, AnnotationValueFilter annotationValueFilter);

    public enum ForInstrumentedType implements TypeAttributeAppender {
        INSTANCE;

        @Override // org.modelmapper.internal.bytebuddy.implementation.attribute.TypeAttributeAppender
        public void apply(ClassVisitor classVisitor, TypeDescription typeDescription, AnnotationValueFilter annotationValueFilter) {
            AnnotationAppender ofTypeVariable = AnnotationAppender.ForTypeAnnotations.ofTypeVariable(new AnnotationAppender.Default(new AnnotationAppender.Target.OnType(classVisitor)), annotationValueFilter, true, typeDescription.getTypeVariables());
            TypeDescription.Generic superClass = typeDescription.getSuperClass();
            if (superClass != null) {
                ofTypeVariable = (AnnotationAppender) superClass.accept(AnnotationAppender.ForTypeAnnotations.ofSuperClass(ofTypeVariable, annotationValueFilter));
            }
            Iterator it = typeDescription.getInterfaces().iterator();
            int i = 0;
            while (it.hasNext()) {
                ofTypeVariable = (AnnotationAppender) ((TypeDescription.Generic) it.next()).accept(AnnotationAppender.ForTypeAnnotations.ofInterfaceType(ofTypeVariable, annotationValueFilter, i));
                i++;
            }
            Iterator it2 = typeDescription.getDeclaredAnnotations().iterator();
            while (it2.hasNext()) {
                ofTypeVariable = ofTypeVariable.append((AnnotationDescription) it2.next(), annotationValueFilter);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class Differentiating implements TypeAttributeAppender {
            private final int annotationIndex;
            private final int interfaceTypeIndex;
            private final int typeVariableIndex;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Differentiating differentiating = (Differentiating) obj;
                return this.annotationIndex == differentiating.annotationIndex && this.typeVariableIndex == differentiating.typeVariableIndex && this.interfaceTypeIndex == differentiating.interfaceTypeIndex;
            }

            public int hashCode() {
                return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.annotationIndex) * 31) + this.typeVariableIndex) * 31) + this.interfaceTypeIndex;
            }

            public Differentiating(TypeDescription typeDescription) {
                this(typeDescription.getDeclaredAnnotations().size(), typeDescription.getTypeVariables().size(), typeDescription.getInterfaces().size());
            }

            protected Differentiating(int i, int i2, int i3) {
                this.annotationIndex = i;
                this.typeVariableIndex = i2;
                this.interfaceTypeIndex = i3;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.attribute.TypeAttributeAppender
            public void apply(ClassVisitor classVisitor, TypeDescription typeDescription, AnnotationValueFilter annotationValueFilter) {
                AnnotationAppender annotationAppender = new AnnotationAppender.Default(new AnnotationAppender.Target.OnType(classVisitor));
                AnnotationAppender.ForTypeAnnotations.ofTypeVariable(annotationAppender, annotationValueFilter, true, this.typeVariableIndex, typeDescription.getTypeVariables());
                TypeList.Generic interfaces = typeDescription.getInterfaces();
                int i = this.interfaceTypeIndex;
                Iterator it = interfaces.subList(i, interfaces.size()).iterator();
                while (it.hasNext()) {
                    annotationAppender = (AnnotationAppender) ((TypeDescription.Generic) it.next()).accept(AnnotationAppender.ForTypeAnnotations.ofInterfaceType(annotationAppender, annotationValueFilter, i));
                    i++;
                }
                AnnotationList declaredAnnotations = typeDescription.getDeclaredAnnotations();
                Iterator it2 = declaredAnnotations.subList(this.annotationIndex, declaredAnnotations.size()).iterator();
                while (it2.hasNext()) {
                    annotationAppender = annotationAppender.append((AnnotationDescription) it2.next(), annotationValueFilter);
                }
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class Explicit implements TypeAttributeAppender {
        private final List<? extends AnnotationDescription> annotations;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.annotations.equals(((Explicit) obj).annotations);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.annotations.hashCode();
        }

        public Explicit(List<? extends AnnotationDescription> list) {
            this.annotations = list;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.attribute.TypeAttributeAppender
        public void apply(ClassVisitor classVisitor, TypeDescription typeDescription, AnnotationValueFilter annotationValueFilter) {
            AnnotationAppender annotationAppender = new AnnotationAppender.Default(new AnnotationAppender.Target.OnType(classVisitor));
            Iterator<? extends AnnotationDescription> it = this.annotations.iterator();
            while (it.hasNext()) {
                annotationAppender = annotationAppender.append(it.next(), annotationValueFilter);
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class Compound implements TypeAttributeAppender {
        private final List<TypeAttributeAppender> typeAttributeAppenders;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.typeAttributeAppenders.equals(((Compound) obj).typeAttributeAppenders);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.typeAttributeAppenders.hashCode();
        }

        public Compound(TypeAttributeAppender... typeAttributeAppenderArr) {
            this((List<? extends TypeAttributeAppender>) Arrays.asList(typeAttributeAppenderArr));
        }

        public Compound(List<? extends TypeAttributeAppender> list) {
            this.typeAttributeAppenders = new ArrayList();
            for (TypeAttributeAppender typeAttributeAppender : list) {
                if (typeAttributeAppender instanceof Compound) {
                    this.typeAttributeAppenders.addAll(((Compound) typeAttributeAppender).typeAttributeAppenders);
                } else if (!(typeAttributeAppender instanceof NoOp)) {
                    this.typeAttributeAppenders.add(typeAttributeAppender);
                }
            }
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.attribute.TypeAttributeAppender
        public void apply(ClassVisitor classVisitor, TypeDescription typeDescription, AnnotationValueFilter annotationValueFilter) {
            Iterator<TypeAttributeAppender> it = this.typeAttributeAppenders.iterator();
            while (it.hasNext()) {
                it.next().apply(classVisitor, typeDescription, annotationValueFilter);
            }
        }
    }
}
