package kotlin.reflect.jvm.internal.impl.km;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class KmVariance {
    public static final kotlin.reflect.jvm.internal.impl.km.KmVariance IN;
    public static final kotlin.reflect.jvm.internal.impl.km.KmVariance INVARIANT;
    public static final kotlin.reflect.jvm.internal.impl.km.KmVariance OUT;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.km.KmVariance[] getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private KmVariance(java.lang.String str, int i) {
    }

    static {
        kotlin.reflect.jvm.internal.impl.km.KmVariance kmVariance = new kotlin.reflect.jvm.internal.impl.km.KmVariance("INVARIANT", 0);
        INVARIANT = kmVariance;
        kotlin.reflect.jvm.internal.impl.km.KmVariance kmVariance2 = new kotlin.reflect.jvm.internal.impl.km.KmVariance("IN", 1);
        IN = kmVariance2;
        kotlin.reflect.jvm.internal.impl.km.KmVariance kmVariance3 = new kotlin.reflect.jvm.internal.impl.km.KmVariance("OUT", 2);
        OUT = kmVariance3;
        kotlin.reflect.jvm.internal.impl.km.KmVariance[] kmVarianceArr = {kmVariance, kmVariance2, kmVariance3};
        getHighSpeedVideoFpsRangesFor = kmVarianceArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(kmVarianceArr);
    }

    public static kotlin.reflect.jvm.internal.impl.km.KmVariance[] values() {
        return (kotlin.reflect.jvm.internal.impl.km.KmVariance[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static kotlin.reflect.jvm.internal.impl.km.KmVariance valueOf(java.lang.String str) {
        return (kotlin.reflect.jvm.internal.impl.km.KmVariance) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.km.KmVariance.class, str);
    }
}
