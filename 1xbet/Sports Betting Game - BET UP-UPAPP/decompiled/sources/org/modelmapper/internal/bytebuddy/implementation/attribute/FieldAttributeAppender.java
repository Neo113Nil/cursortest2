package org.modelmapper.internal.bytebuddy.implementation.attribute;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.modelmapper.internal.asm.FieldVisitor;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationDescription;
import org.modelmapper.internal.bytebuddy.description.field.FieldDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.implementation.attribute.AnnotationAppender;

/* loaded from: classes4.dex */
public interface FieldAttributeAppender {

    public enum NoOp implements FieldAttributeAppender, Factory {
        INSTANCE;

        @Override // org.modelmapper.internal.bytebuddy.implementation.attribute.FieldAttributeAppender
        public void apply(FieldVisitor fieldVisitor, FieldDescription fieldDescription, AnnotationValueFilter annotationValueFilter) {
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.attribute.FieldAttributeAppender.Factory
        public FieldAttributeAppender make(TypeDescription typeDescription) {
            return this;
        }
    }

    void apply(FieldVisitor fieldVisitor, FieldDescription fieldDescription, AnnotationValueFilter annotationValueFilter);

    public interface Factory {
        FieldAttributeAppender make(TypeDescription typeDescription);

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

            @Override // org.modelmapper.internal.bytebuddy.implementation.attribute.FieldAttributeAppender.Factory
            public FieldAttributeAppender make(TypeDescription typeDescription) {
                ArrayList arrayList = new ArrayList(this.factories.size());
                Iterator<Factory> it = this.factories.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().make(typeDescription));
                }
                return new Compound(arrayList);
            }
        }
    }

    public enum ForInstrumentedField implements FieldAttributeAppender, Factory {
        INSTANCE;

        @Override // org.modelmapper.internal.bytebuddy.implementation.attribute.FieldAttributeAppender.Factory
        public FieldAttributeAppender make(TypeDescription typeDescription) {
            return this;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.attribute.FieldAttributeAppender
        public void apply(FieldVisitor fieldVisitor, FieldDescription fieldDescription, AnnotationValueFilter annotationValueFilter) {
            AnnotationAppender annotationAppender = (AnnotationAppender) fieldDescription.getType().accept(AnnotationAppender.ForTypeAnnotations.ofFieldType(new AnnotationAppender.Default(new AnnotationAppender.Target.OnField(fieldVisitor)), annotationValueFilter));
            Iterator it = fieldDescription.getDeclaredAnnotations().iterator();
            while (it.hasNext()) {
                annotationAppender = annotationAppender.append((AnnotationDescription) it.next(), annotationValueFilter);
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class Explicit implements FieldAttributeAppender, Factory {
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

        @Override // org.modelmapper.internal.bytebuddy.implementation.attribute.FieldAttributeAppender.Factory
        public FieldAttributeAppender make(TypeDescription typeDescription) {
            return this;
        }

        public Explicit(List<? extends AnnotationDescription> list) {
            this.annotations = list;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.attribute.FieldAttributeAppender
        public void apply(FieldVisitor fieldVisitor, FieldDescription fieldDescription, AnnotationValueFilter annotationValueFilter) {
            AnnotationAppender annotationAppender = new AnnotationAppender.Default(new AnnotationAppender.Target.OnField(fieldVisitor));
            Iterator<? extends AnnotationDescription> it = this.annotations.iterator();
            while (it.hasNext()) {
                annotationAppender = annotationAppender.append(it.next(), annotationValueFilter);
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class Compound implements FieldAttributeAppender {
        private final List<FieldAttributeAppender> fieldAttributeAppenders;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.fieldAttributeAppenders.equals(((Compound) obj).fieldAttributeAppenders);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.fieldAttributeAppenders.hashCode();
        }

        public Compound(FieldAttributeAppender... fieldAttributeAppenderArr) {
            this((List<? extends FieldAttributeAppender>) Arrays.asList(fieldAttributeAppenderArr));
        }

        public Compound(List<? extends FieldAttributeAppender> list) {
            this.fieldAttributeAppenders = new ArrayList();
            for (FieldAttributeAppender fieldAttributeAppender : list) {
                if (fieldAttributeAppender instanceof Compound) {
                    this.fieldAttributeAppenders.addAll(((Compound) fieldAttributeAppender).fieldAttributeAppenders);
                } else if (!(fieldAttributeAppender instanceof NoOp)) {
                    this.fieldAttributeAppenders.add(fieldAttributeAppender);
                }
            }
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.attribute.FieldAttributeAppender
        public void apply(FieldVisitor fieldVisitor, FieldDescription fieldDescription, AnnotationValueFilter annotationValueFilter) {
            Iterator<FieldAttributeAppender> it = this.fieldAttributeAppenders.iterator();
            while (it.hasNext()) {
                it.next().apply(fieldVisitor, fieldDescription, annotationValueFilter);
            }
        }
    }
}
