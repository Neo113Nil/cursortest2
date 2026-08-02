package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class NullabilityQualifier {
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier[] Camera2StreamConfigurationMap;
    public static final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier FORCE_FLEXIBILITY;
    public static final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier NOT_NULL;
    public static final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier NULLABLE;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private NullabilityQualifier(java.lang.String str, int i) {
    }

    static {
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier nullabilityQualifier = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier("FORCE_FLEXIBILITY", 0);
        FORCE_FLEXIBILITY = nullabilityQualifier;
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier nullabilityQualifier2 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier("NULLABLE", 1);
        NULLABLE = nullabilityQualifier2;
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier nullabilityQualifier3 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier("NOT_NULL", 2);
        NOT_NULL = nullabilityQualifier3;
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier[] nullabilityQualifierArr = {nullabilityQualifier, nullabilityQualifier2, nullabilityQualifier3};
        Camera2StreamConfigurationMap = nullabilityQualifierArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(nullabilityQualifierArr);
    }

    public static kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier[] values() {
        return (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier[]) Camera2StreamConfigurationMap.clone();
    }

    public static kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier valueOf(java.lang.String str) {
        return (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.class, str);
    }
}
