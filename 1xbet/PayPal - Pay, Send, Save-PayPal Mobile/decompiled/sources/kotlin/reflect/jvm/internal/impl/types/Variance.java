package kotlin.reflect.jvm.internal.impl.types;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class Variance {
    public static final kotlin.reflect.jvm.internal.impl.types.Variance INVARIANT;
    public static final kotlin.reflect.jvm.internal.impl.types.Variance IN_VARIANCE;
    public static final kotlin.reflect.jvm.internal.impl.types.Variance OUT_VARIANCE;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.Variance[] getHighSpeedVideoSizes;
    private final boolean Camera2StreamConfigurationMap;
    private final boolean getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;
    private final int getInputSizeshNQ4ISI;

    private Variance(java.lang.String str, int i, java.lang.String str2, boolean z, boolean z2, int i2) {
        this.getHighSpeedVideoFpsRangesFor = str2;
        this.Camera2StreamConfigurationMap = z;
        this.getHighResolutionOutputSizeshNQ4ISI = z2;
        this.getInputSizeshNQ4ISI = i2;
    }

    public final java.lang.String getLabel() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final boolean getAllowsOutPosition() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    static {
        kotlin.reflect.jvm.internal.impl.types.Variance variance = new kotlin.reflect.jvm.internal.impl.types.Variance("INVARIANT", 0, "", true, true, 0);
        INVARIANT = variance;
        kotlin.reflect.jvm.internal.impl.types.Variance variance2 = new kotlin.reflect.jvm.internal.impl.types.Variance("IN_VARIANCE", 1, "in", true, false, -1);
        IN_VARIANCE = variance2;
        kotlin.reflect.jvm.internal.impl.types.Variance variance3 = new kotlin.reflect.jvm.internal.impl.types.Variance("OUT_VARIANCE", 2, "out", false, true, 1);
        OUT_VARIANCE = variance3;
        kotlin.reflect.jvm.internal.impl.types.Variance[] varianceArr = {variance, variance2, variance3};
        getHighSpeedVideoSizes = varianceArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(varianceArr);
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static kotlin.reflect.jvm.internal.impl.types.Variance[] values() {
        return (kotlin.reflect.jvm.internal.impl.types.Variance[]) getHighSpeedVideoSizes.clone();
    }

    public static kotlin.reflect.jvm.internal.impl.types.Variance valueOf(java.lang.String str) {
        return (kotlin.reflect.jvm.internal.impl.types.Variance) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.types.Variance.class, str);
    }
}
