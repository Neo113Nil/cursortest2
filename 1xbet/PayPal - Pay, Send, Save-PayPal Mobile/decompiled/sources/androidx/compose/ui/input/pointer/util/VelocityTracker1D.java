package androidx.compose.ui.input.pointer.util;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001,B\u001d\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0013J\r\u0010\u0014\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u0003\u0010\u001eR\u0014\u0010!\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0%8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010\"\u001a\u00020\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b)\u0010#R\u0014\u0010)\u001a\u00020\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010*R\u0014\u0010+\u001a\u00020\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010*R\u0014\u0010\u001f\u001a\u00020\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010*"}, d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityTracker1D;", "", "", "isDataDifferential", "Landroidx/compose/ui/input/pointer/util/VelocityTracker1D$Strategy;", "strategy", "<init>", "(ZLandroidx/compose/ui/input/pointer/util/VelocityTracker1D$Strategy;)V", "(Z)V", "", "timeMillis", "", "dataPoint", "", "addDataPoint", "(JF)V", "calculateVelocity", "()F", "maximumVelocity", "(F)F", "resetTracking", "()V", "", "p0", "p1", "", "p2", "Camera2StreamConfigurationMap", "([F[FI)F", "Z", "()Z", "getHighSpeedVideoSizesFor", "Landroidx/compose/ui/input/pointer/util/VelocityTracker1D$Strategy;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "", "Landroidx/compose/ui/input/pointer/util/DataPointAtTime;", "getInputSizeshNQ4ISI", "[Landroidx/compose/ui/input/pointer/util/DataPointAtTime;", "getHighSpeedVideoFpsRangesFor", "[F", "getOutputMinFrameDuration", "Strategy"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VelocityTracker1D {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final float[] getOutputMinFrameDuration;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final float[] getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final float[] getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final androidx.compose.ui.input.pointer.util.VelocityTracker1D.Strategy getHighSpeedVideoSizes;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.ui.input.pointer.util.DataPointAtTime[] Camera2StreamConfigurationMap;
    private final boolean isDataDifferential;

    public VelocityTracker1D(boolean z, androidx.compose.ui.input.pointer.util.VelocityTracker1D.Strategy strategy) {
        this.isDataDifferential = z;
        this.getHighSpeedVideoSizes = strategy;
        if (z && strategy.equals(androidx.compose.ui.input.pointer.util.VelocityTracker1D.Strategy.Lsq2)) {
            throw new java.lang.IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int i = androidx.compose.ui.input.pointer.util.VelocityTracker1D.WhenMappings.$EnumSwitchMapping$0[strategy.ordinal()];
        int i2 = 2;
        if (i != 1) {
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            i2 = 3;
        }
        this.getHighSpeedVideoFpsRanges = i2;
        this.Camera2StreamConfigurationMap = new androidx.compose.ui.input.pointer.util.DataPointAtTime[20];
        this.getHighSpeedVideoFpsRangesFor = new float[20];
        this.getOutputMinFrameDuration = new float[20];
        this.getHighSpeedVideoSizesFor = new float[3];
    }

    /* renamed from: isDataDifferential, reason: from getter */
    public final boolean getIsDataDifferential() {
        return this.isDataDifferential;
    }

    public /* synthetic */ VelocityTracker1D(boolean z, androidx.compose.ui.input.pointer.util.VelocityTracker1D.Strategy strategy, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? androidx.compose.ui.input.pointer.util.VelocityTracker1D.Strategy.Lsq2 : strategy);
    }

    public VelocityTracker1D(boolean z) {
        this(z, androidx.compose.ui.input.pointer.util.VelocityTracker1D.Strategy.Impulse);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityTracker1D$Strategy;", "", "<init>", "(Ljava/lang/String;I)V", "Lsq2", "Impulse"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Strategy {
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
        private static final /* synthetic */ androidx.compose.ui.input.pointer.util.VelocityTracker1D.Strategy[] getHighSpeedVideoSizes;
        public static final androidx.compose.ui.input.pointer.util.VelocityTracker1D.Strategy Lsq2 = new androidx.compose.ui.input.pointer.util.VelocityTracker1D.Strategy("Lsq2", 0);
        public static final androidx.compose.ui.input.pointer.util.VelocityTracker1D.Strategy Impulse = new androidx.compose.ui.input.pointer.util.VelocityTracker1D.Strategy("Impulse", 1);

        private Strategy(java.lang.String str, int i) {
        }

        static {
            androidx.compose.ui.input.pointer.util.VelocityTracker1D.Strategy[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
            getHighSpeedVideoSizes = highSpeedVideoFpsRangesFor;
            getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(highSpeedVideoFpsRangesFor);
        }

        public static androidx.compose.ui.input.pointer.util.VelocityTracker1D.Strategy[] values() {
            return (androidx.compose.ui.input.pointer.util.VelocityTracker1D.Strategy[]) getHighSpeedVideoSizes.clone();
        }

        public static androidx.compose.ui.input.pointer.util.VelocityTracker1D.Strategy valueOf(java.lang.String str) {
            return (androidx.compose.ui.input.pointer.util.VelocityTracker1D.Strategy) java.lang.Enum.valueOf(androidx.compose.ui.input.pointer.util.VelocityTracker1D.Strategy.class, str);
        }

        public static kotlin.enums.EnumEntries<androidx.compose.ui.input.pointer.util.VelocityTracker1D.Strategy> getEntries() {
            return getHighResolutionOutputSizeshNQ4ISI;
        }

        private static final /* synthetic */ androidx.compose.ui.input.pointer.util.VelocityTracker1D.Strategy[] getHighSpeedVideoFpsRangesFor() {
            return new androidx.compose.ui.input.pointer.util.VelocityTracker1D.Strategy[]{Lsq2, Impulse};
        }
    }

    public final void addDataPoint(long timeMillis, float dataPoint) {
        int i = (this.getHighResolutionOutputSizeshNQ4ISI + 1) % 20;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        androidx.compose.ui.input.pointer.util.VelocityTrackerKt.getHighSpeedVideoFpsRanges(this.Camera2StreamConfigurationMap, i, timeMillis, dataPoint);
    }

    public final float calculateVelocity() {
        float highResolutionOutputSizeshNQ4ISI;
        float[] fArr = this.getHighSpeedVideoFpsRangesFor;
        float[] fArr2 = this.getOutputMinFrameDuration;
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        androidx.compose.ui.input.pointer.util.DataPointAtTime dataPointAtTime = this.Camera2StreamConfigurationMap[i];
        if (dataPointAtTime == null) {
            return 0.0f;
        }
        int i2 = 0;
        androidx.compose.ui.input.pointer.util.DataPointAtTime dataPointAtTime2 = dataPointAtTime;
        while (true) {
            androidx.compose.ui.input.pointer.util.DataPointAtTime dataPointAtTime3 = this.Camera2StreamConfigurationMap[i];
            if (dataPointAtTime3 != null) {
                float time = dataPointAtTime.getTime() - dataPointAtTime3.getTime();
                float abs = java.lang.Math.abs(dataPointAtTime3.getTime() - dataPointAtTime2.getTime());
                androidx.compose.ui.input.pointer.util.DataPointAtTime dataPointAtTime4 = (this.getHighSpeedVideoSizes == androidx.compose.ui.input.pointer.util.VelocityTracker1D.Strategy.Lsq2 || this.isDataDifferential) ? dataPointAtTime3 : dataPointAtTime;
                if (time > 100.0f || abs > 40.0f) {
                    break;
                }
                fArr[i2] = dataPointAtTime3.getDataPoint();
                fArr2[i2] = -time;
                if (i == 0) {
                    i = 20;
                }
                i--;
                i2++;
                if (i2 >= 20) {
                    break;
                }
                dataPointAtTime2 = dataPointAtTime4;
            } else {
                break;
            }
        }
        if (i2 < this.getHighSpeedVideoFpsRanges) {
            return 0.0f;
        }
        int i3 = androidx.compose.ui.input.pointer.util.VelocityTracker1D.WhenMappings.$EnumSwitchMapping$0[this.getHighSpeedVideoSizes.ordinal()];
        if (i3 == 1) {
            highResolutionOutputSizeshNQ4ISI = androidx.compose.ui.input.pointer.util.VelocityTrackerKt.getHighResolutionOutputSizeshNQ4ISI(fArr, fArr2, i2, this.isDataDifferential);
        } else {
            if (i3 != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            highResolutionOutputSizeshNQ4ISI = Camera2StreamConfigurationMap(fArr, fArr2, i2);
        }
        return highResolutionOutputSizeshNQ4ISI * 1000.0f;
    }

    public final float calculateVelocity(float maximumVelocity) {
        if (maximumVelocity <= 0.0f) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("maximumVelocity should be a positive value. You specified=".concat(java.lang.String.valueOf(maximumVelocity)));
        }
        float calculateVelocity = calculateVelocity();
        if (calculateVelocity == 0.0f || java.lang.Float.isNaN(calculateVelocity)) {
            return 0.0f;
        }
        if (calculateVelocity > 0.0f) {
            return kotlin.ranges.RangesKt.coerceAtMost(calculateVelocity, maximumVelocity);
        }
        return kotlin.ranges.RangesKt.coerceAtLeast(calculateVelocity, -maximumVelocity);
    }

    public final void resetTracking() {
        kotlin.collections.ArraysKt.fill$default(this.Camera2StreamConfigurationMap, (java.lang.Object) null, 0, 0, 6, (java.lang.Object) null);
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
    }

    private final float Camera2StreamConfigurationMap(float[] p0, float[] p1, int p2) {
        try {
            return androidx.compose.ui.input.pointer.util.VelocityTrackerKt.polyFitLeastSquares(p1, p0, p2, 2, this.getHighSpeedVideoSizesFor)[1];
        } catch (java.lang.IllegalArgumentException unused) {
            return 0.0f;
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.ui.input.pointer.util.VelocityTracker1D.Strategy.values().length];
            try {
                iArr[androidx.compose.ui.input.pointer.util.VelocityTracker1D.Strategy.Impulse.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.ui.input.pointer.util.VelocityTracker1D.Strategy.Lsq2.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VelocityTracker1D() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }
}
