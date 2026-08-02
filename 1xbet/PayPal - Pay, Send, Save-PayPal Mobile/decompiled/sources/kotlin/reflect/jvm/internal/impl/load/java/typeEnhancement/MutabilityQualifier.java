package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class MutabilityQualifier {
    public static final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier MUTABLE;
    public static final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier READ_ONLY;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier[] getHighSpeedVideoFpsRanges;

    private MutabilityQualifier(java.lang.String str, int i) {
    }

    static {
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier mutabilityQualifier = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier("READ_ONLY", 0);
        READ_ONLY = mutabilityQualifier;
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier mutabilityQualifier2 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier("MUTABLE", 1);
        MUTABLE = mutabilityQualifier2;
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier[] mutabilityQualifierArr = {mutabilityQualifier, mutabilityQualifier2};
        getHighSpeedVideoFpsRanges = mutabilityQualifierArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(mutabilityQualifierArr);
    }

    public static kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier[] values() {
        return (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier valueOf(java.lang.String str) {
        return (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.class, str);
    }
}
