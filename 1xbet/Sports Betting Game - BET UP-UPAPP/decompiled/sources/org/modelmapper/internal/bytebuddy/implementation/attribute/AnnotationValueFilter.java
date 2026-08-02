package org.modelmapper.internal.bytebuddy.implementation.attribute;

import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationDescription;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationValue;
import org.modelmapper.internal.bytebuddy.description.field.FieldDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;

/* loaded from: classes4.dex */
public interface AnnotationValueFilter {

    public enum Default implements AnnotationValueFilter, Factory {
        SKIP_DEFAULTS { // from class: org.modelmapper.internal.bytebuddy.implementation.attribute.AnnotationValueFilter.Default.1
            @Override // org.modelmapper.internal.bytebuddy.implementation.attribute.AnnotationValueFilter
            public boolean isRelevant(AnnotationDescription annotationDescription, MethodDescription.InDefinedShape inDefinedShape) {
                AnnotationValue<?, ?> defaultValue = inDefinedShape.getDefaultValue();
                return defaultValue == null || !defaultValue.equals(annotationDescription.getValue(inDefinedShape));
            }
        },
        APPEND_DEFAULTS { // from class: org.modelmapper.internal.bytebuddy.implementation.attribute.AnnotationValueFilter.Default.2
            @Override // org.modelmapper.internal.bytebuddy.implementation.attribute.AnnotationValueFilter
            public boolean isRelevant(AnnotationDescription annotationDescription, MethodDescription.InDefinedShape inDefinedShape) {
                return true;
            }
        };

        @Override // org.modelmapper.internal.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory
        public AnnotationValueFilter on(FieldDescription fieldDescription) {
            return this;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory
        public AnnotationValueFilter on(MethodDescription methodDescription) {
            return this;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory
        public AnnotationValueFilter on(TypeDescription typeDescription) {
            return this;
        }
    }

    public interface Factory {
        AnnotationValueFilter on(FieldDescription fieldDescription);

        AnnotationValueFilter on(MethodDescription methodDescription);

        AnnotationValueFilter on(TypeDescription typeDescription);
    }

    boolean isRelevant(AnnotationDescription annotationDescription, MethodDescription.InDefinedShape inDefinedShape);
}
