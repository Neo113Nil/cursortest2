package kotlin.reflect.jvm.internal.impl.load.java;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class AnnotationQualifierApplicabilityType {
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType[] Camera2StreamConfigurationMap;
    public static final kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType FIELD;
    public static final kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType METHOD_RETURN_TYPE;
    public static final kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType TYPE_PARAMETER;
    public static final kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType TYPE_PARAMETER_BOUNDS;
    public static final kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType TYPE_USE;
    public static final kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType VALUE_PARAMETER;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private final java.lang.String getHighSpeedVideoSizes;

    private AnnotationQualifierApplicabilityType(java.lang.String str, int i, java.lang.String str2) {
        this.getHighSpeedVideoSizes = str2;
    }

    public final java.lang.String getJavaTarget() {
        return this.getHighSpeedVideoSizes;
    }

    static {
        kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = new kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType("METHOD_RETURN_TYPE", 0, "METHOD");
        METHOD_RETURN_TYPE = annotationQualifierApplicabilityType;
        kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType2 = new kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType("VALUE_PARAMETER", 1, "PARAMETER");
        VALUE_PARAMETER = annotationQualifierApplicabilityType2;
        kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType3 = new kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType("FIELD", 2, "FIELD");
        FIELD = annotationQualifierApplicabilityType3;
        kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType4 = new kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType("TYPE_USE", 3, "TYPE_USE");
        TYPE_USE = annotationQualifierApplicabilityType4;
        kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType5 = new kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType("TYPE_PARAMETER_BOUNDS", 4, "TYPE_USE");
        TYPE_PARAMETER_BOUNDS = annotationQualifierApplicabilityType5;
        kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType6 = new kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType("TYPE_PARAMETER", 5, "TYPE_PARAMETER");
        TYPE_PARAMETER = annotationQualifierApplicabilityType6;
        kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType[] annotationQualifierApplicabilityTypeArr = {annotationQualifierApplicabilityType, annotationQualifierApplicabilityType2, annotationQualifierApplicabilityType3, annotationQualifierApplicabilityType4, annotationQualifierApplicabilityType5, annotationQualifierApplicabilityType6};
        Camera2StreamConfigurationMap = annotationQualifierApplicabilityTypeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(annotationQualifierApplicabilityTypeArr);
    }

    public static kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType[] values() {
        return (kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType[]) Camera2StreamConfigurationMap.clone();
    }

    public static kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType valueOf(java.lang.String str) {
        return (kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.class, str);
    }
}
