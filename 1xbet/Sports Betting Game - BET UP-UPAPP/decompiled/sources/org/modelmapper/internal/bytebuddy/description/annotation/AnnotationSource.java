package org.modelmapper.internal.bytebuddy.description.annotation;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.List;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationList;

/* loaded from: classes4.dex */
public interface AnnotationSource {
    AnnotationList getDeclaredAnnotations();

    public enum Empty implements AnnotationSource {
        INSTANCE;

        @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
        public AnnotationList getDeclaredAnnotations() {
            return new AnnotationList.Empty();
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class Explicit implements AnnotationSource {
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

        public Explicit(AnnotationDescription... annotationDescriptionArr) {
            this((List<? extends AnnotationDescription>) Arrays.asList(annotationDescriptionArr));
        }

        public Explicit(List<? extends AnnotationDescription> list) {
            this.annotations = list;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
        public AnnotationList getDeclaredAnnotations() {
            return new AnnotationList.Explicit(this.annotations);
        }
    }
}
