package kotlin.annotation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0011\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012"}, d2 = {"Lkotlin/annotation/AnnotationTarget;", "", "<init>", "(Ljava/lang/String;I)V", "CLASS", "ANNOTATION_CLASS", "TYPE_PARAMETER", "PROPERTY", "FIELD", "LOCAL_VARIABLE", "VALUE_PARAMETER", "CONSTRUCTOR", "FUNCTION", "PROPERTY_GETTER", "PROPERTY_SETTER", "TYPE", "EXPRESSION", "FILE", "TYPEALIAS"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnnotationTarget {
    public static final kotlin.annotation.AnnotationTarget ANNOTATION_CLASS;
    public static final kotlin.annotation.AnnotationTarget CLASS;
    public static final kotlin.annotation.AnnotationTarget CONSTRUCTOR;
    public static final kotlin.annotation.AnnotationTarget EXPRESSION;
    public static final kotlin.annotation.AnnotationTarget FIELD;
    public static final kotlin.annotation.AnnotationTarget FILE;
    public static final kotlin.annotation.AnnotationTarget FUNCTION;
    public static final kotlin.annotation.AnnotationTarget LOCAL_VARIABLE;
    public static final kotlin.annotation.AnnotationTarget PROPERTY;
    public static final kotlin.annotation.AnnotationTarget PROPERTY_GETTER;
    public static final kotlin.annotation.AnnotationTarget PROPERTY_SETTER;
    public static final kotlin.annotation.AnnotationTarget TYPE;
    public static final kotlin.annotation.AnnotationTarget TYPEALIAS;
    public static final kotlin.annotation.AnnotationTarget TYPE_PARAMETER;
    public static final kotlin.annotation.AnnotationTarget VALUE_PARAMETER;
    private static final /* synthetic */ kotlin.annotation.AnnotationTarget[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private AnnotationTarget(java.lang.String str, int i) {
    }

    static {
        kotlin.annotation.AnnotationTarget annotationTarget = new kotlin.annotation.AnnotationTarget("CLASS", 0);
        CLASS = annotationTarget;
        kotlin.annotation.AnnotationTarget annotationTarget2 = new kotlin.annotation.AnnotationTarget("ANNOTATION_CLASS", 1);
        ANNOTATION_CLASS = annotationTarget2;
        kotlin.annotation.AnnotationTarget annotationTarget3 = new kotlin.annotation.AnnotationTarget("TYPE_PARAMETER", 2);
        TYPE_PARAMETER = annotationTarget3;
        kotlin.annotation.AnnotationTarget annotationTarget4 = new kotlin.annotation.AnnotationTarget("PROPERTY", 3);
        PROPERTY = annotationTarget4;
        kotlin.annotation.AnnotationTarget annotationTarget5 = new kotlin.annotation.AnnotationTarget("FIELD", 4);
        FIELD = annotationTarget5;
        kotlin.annotation.AnnotationTarget annotationTarget6 = new kotlin.annotation.AnnotationTarget("LOCAL_VARIABLE", 5);
        LOCAL_VARIABLE = annotationTarget6;
        kotlin.annotation.AnnotationTarget annotationTarget7 = new kotlin.annotation.AnnotationTarget("VALUE_PARAMETER", 6);
        VALUE_PARAMETER = annotationTarget7;
        kotlin.annotation.AnnotationTarget annotationTarget8 = new kotlin.annotation.AnnotationTarget("CONSTRUCTOR", 7);
        CONSTRUCTOR = annotationTarget8;
        kotlin.annotation.AnnotationTarget annotationTarget9 = new kotlin.annotation.AnnotationTarget("FUNCTION", 8);
        FUNCTION = annotationTarget9;
        kotlin.annotation.AnnotationTarget annotationTarget10 = new kotlin.annotation.AnnotationTarget("PROPERTY_GETTER", 9);
        PROPERTY_GETTER = annotationTarget10;
        kotlin.annotation.AnnotationTarget annotationTarget11 = new kotlin.annotation.AnnotationTarget("PROPERTY_SETTER", 10);
        PROPERTY_SETTER = annotationTarget11;
        kotlin.annotation.AnnotationTarget annotationTarget12 = new kotlin.annotation.AnnotationTarget("TYPE", 11);
        TYPE = annotationTarget12;
        kotlin.annotation.AnnotationTarget annotationTarget13 = new kotlin.annotation.AnnotationTarget("EXPRESSION", 12);
        EXPRESSION = annotationTarget13;
        kotlin.annotation.AnnotationTarget annotationTarget14 = new kotlin.annotation.AnnotationTarget("FILE", 13);
        FILE = annotationTarget14;
        kotlin.annotation.AnnotationTarget annotationTarget15 = new kotlin.annotation.AnnotationTarget("TYPEALIAS", 14);
        TYPEALIAS = annotationTarget15;
        kotlin.annotation.AnnotationTarget[] annotationTargetArr = {annotationTarget, annotationTarget2, annotationTarget3, annotationTarget4, annotationTarget5, annotationTarget6, annotationTarget7, annotationTarget8, annotationTarget9, annotationTarget10, annotationTarget11, annotationTarget12, annotationTarget13, annotationTarget14, annotationTarget15};
        getHighResolutionOutputSizeshNQ4ISI = annotationTargetArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(annotationTargetArr);
    }

    public static kotlin.annotation.AnnotationTarget[] values() {
        return (kotlin.annotation.AnnotationTarget[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static kotlin.annotation.AnnotationTarget valueOf(java.lang.String str) {
        return (kotlin.annotation.AnnotationTarget) java.lang.Enum.valueOf(kotlin.annotation.AnnotationTarget.class, str);
    }

    public static kotlin.enums.EnumEntries<kotlin.annotation.AnnotationTarget> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
