package kotlin.annotation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Annotations.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lkotlin/annotation/AnnotationTarget;", "", "<init>", "(Ljava/lang/String;I)V", "CLASS", "ANNOTATION_CLASS", "TYPE_PARAMETER", "PROPERTY", "FIELD", "LOCAL_VARIABLE", "VALUE_PARAMETER", "CONSTRUCTOR", "FUNCTION", "PROPERTY_GETTER", "PROPERTY_SETTER", "TYPE", "EXPRESSION", "FILE", "TYPEALIAS", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnnotationTarget {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ kotlin.annotation.AnnotationTarget[] $VALUES;
    public static final kotlin.annotation.AnnotationTarget CLASS = new kotlin.annotation.AnnotationTarget("CLASS", 0);
    public static final kotlin.annotation.AnnotationTarget ANNOTATION_CLASS = new kotlin.annotation.AnnotationTarget("ANNOTATION_CLASS", 1);
    public static final kotlin.annotation.AnnotationTarget TYPE_PARAMETER = new kotlin.annotation.AnnotationTarget("TYPE_PARAMETER", 2);
    public static final kotlin.annotation.AnnotationTarget PROPERTY = new kotlin.annotation.AnnotationTarget("PROPERTY", 3);
    public static final kotlin.annotation.AnnotationTarget FIELD = new kotlin.annotation.AnnotationTarget("FIELD", 4);
    public static final kotlin.annotation.AnnotationTarget LOCAL_VARIABLE = new kotlin.annotation.AnnotationTarget("LOCAL_VARIABLE", 5);
    public static final kotlin.annotation.AnnotationTarget VALUE_PARAMETER = new kotlin.annotation.AnnotationTarget("VALUE_PARAMETER", 6);
    public static final kotlin.annotation.AnnotationTarget CONSTRUCTOR = new kotlin.annotation.AnnotationTarget("CONSTRUCTOR", 7);
    public static final kotlin.annotation.AnnotationTarget FUNCTION = new kotlin.annotation.AnnotationTarget("FUNCTION", 8);
    public static final kotlin.annotation.AnnotationTarget PROPERTY_GETTER = new kotlin.annotation.AnnotationTarget("PROPERTY_GETTER", 9);
    public static final kotlin.annotation.AnnotationTarget PROPERTY_SETTER = new kotlin.annotation.AnnotationTarget("PROPERTY_SETTER", 10);
    public static final kotlin.annotation.AnnotationTarget TYPE = new kotlin.annotation.AnnotationTarget("TYPE", 11);
    public static final kotlin.annotation.AnnotationTarget EXPRESSION = new kotlin.annotation.AnnotationTarget("EXPRESSION", 12);
    public static final kotlin.annotation.AnnotationTarget FILE = new kotlin.annotation.AnnotationTarget("FILE", 13);
    public static final kotlin.annotation.AnnotationTarget TYPEALIAS = new kotlin.annotation.AnnotationTarget("TYPEALIAS", 14);

    private static final /* synthetic */ kotlin.annotation.AnnotationTarget[] $values() {
        return new kotlin.annotation.AnnotationTarget[]{CLASS, ANNOTATION_CLASS, TYPE_PARAMETER, PROPERTY, FIELD, LOCAL_VARIABLE, VALUE_PARAMETER, CONSTRUCTOR, FUNCTION, PROPERTY_GETTER, PROPERTY_SETTER, TYPE, EXPRESSION, FILE, TYPEALIAS};
    }

    public static kotlin.enums.EnumEntries<kotlin.annotation.AnnotationTarget> getEntries() {
        return $ENTRIES;
    }

    private AnnotationTarget(java.lang.String str, int i) {
    }

    static {
        kotlin.annotation.AnnotationTarget[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    public static kotlin.annotation.AnnotationTarget valueOf(java.lang.String str) {
        return (kotlin.annotation.AnnotationTarget) java.lang.Enum.valueOf(kotlin.annotation.AnnotationTarget.class, str);
    }

    public static kotlin.annotation.AnnotationTarget[] values() {
        return (kotlin.annotation.AnnotationTarget[]) $VALUES.clone();
    }
}
