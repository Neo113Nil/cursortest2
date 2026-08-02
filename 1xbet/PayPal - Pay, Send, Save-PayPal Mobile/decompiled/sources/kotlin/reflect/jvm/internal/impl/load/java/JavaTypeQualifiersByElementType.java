package kotlin.reflect.jvm.internal.impl.load.java;

/* loaded from: classes5.dex */
public final class JavaTypeQualifiersByElementType {
    private final java.util.EnumMap<kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType, kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers> getHighSpeedVideoSizes;

    public JavaTypeQualifiersByElementType(java.util.EnumMap<kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType, kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers> enumMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enumMap, "");
        this.getHighSpeedVideoSizes = enumMap;
    }

    public final java.util.EnumMap<kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType, kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers> getDefaultQualifiers() {
        return this.getHighSpeedVideoSizes;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers get(kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType) {
        return this.getHighSpeedVideoSizes.get(annotationQualifierApplicabilityType);
    }
}
