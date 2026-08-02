package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class AnnotationUseSiteTarget {
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget ALL;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget CONSTRUCTOR_PARAMETER;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget FIELD;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget FILE;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget PROPERTY;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget PROPERTY_DELEGATE_FIELD;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget PROPERTY_GETTER;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget PROPERTY_SETTER;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget RECEIVER;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget SETTER_PARAMETER;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private final java.lang.String getHighSpeedVideoSizes;

    private /* synthetic */ AnnotationUseSiteTarget(java.lang.String str, int i) {
        this(str, i, null);
    }

    private AnnotationUseSiteTarget(java.lang.String str, int i, java.lang.String str2) {
        this.getHighSpeedVideoSizes = str2 == null ? kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt.toLowerCaseAsciiOnly(name()) : str2;
    }

    static {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget annotationUseSiteTarget = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget("ALL", 0);
        ALL = annotationUseSiteTarget;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget annotationUseSiteTarget2 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget("FIELD", 1);
        FIELD = annotationUseSiteTarget2;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget annotationUseSiteTarget3 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget("FILE", 2);
        FILE = annotationUseSiteTarget3;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget annotationUseSiteTarget4 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget("PROPERTY", 3);
        PROPERTY = annotationUseSiteTarget4;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget annotationUseSiteTarget5 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget("PROPERTY_GETTER", 4, "get");
        PROPERTY_GETTER = annotationUseSiteTarget5;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget annotationUseSiteTarget6 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget("PROPERTY_SETTER", 5, "set");
        PROPERTY_SETTER = annotationUseSiteTarget6;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget annotationUseSiteTarget7 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget("RECEIVER", 6);
        RECEIVER = annotationUseSiteTarget7;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget annotationUseSiteTarget8 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget("CONSTRUCTOR_PARAMETER", 7, "param");
        CONSTRUCTOR_PARAMETER = annotationUseSiteTarget8;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget annotationUseSiteTarget9 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget("SETTER_PARAMETER", 8, "setparam");
        SETTER_PARAMETER = annotationUseSiteTarget9;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget annotationUseSiteTarget10 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget("PROPERTY_DELEGATE_FIELD", 9, "delegate");
        PROPERTY_DELEGATE_FIELD = annotationUseSiteTarget10;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget[] annotationUseSiteTargetArr = {annotationUseSiteTarget, annotationUseSiteTarget2, annotationUseSiteTarget3, annotationUseSiteTarget4, annotationUseSiteTarget5, annotationUseSiteTarget6, annotationUseSiteTarget7, annotationUseSiteTarget8, annotationUseSiteTarget9, annotationUseSiteTarget10};
        getHighResolutionOutputSizeshNQ4ISI = annotationUseSiteTargetArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(annotationUseSiteTargetArr);
    }

    public final java.lang.String getRenderName() {
        return this.getHighSpeedVideoSizes;
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget[] values() {
        return (kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget valueOf(java.lang.String str) {
        return (kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget.class, str);
    }
}
