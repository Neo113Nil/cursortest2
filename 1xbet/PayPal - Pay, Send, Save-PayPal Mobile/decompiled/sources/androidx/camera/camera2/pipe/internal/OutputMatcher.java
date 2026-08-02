package androidx.camera.camera2.pipe.internal;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001b\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u001d\u0010\r\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/camera/camera2/pipe/internal/OutputMatcher;", "", "", "initialOffset", "errorDelta", "<init>", "(JJ)V", "cameraOutputNumber", "outputNumber", "", "fuzzyEqual", "(JJ)Z", "fuzzyLessThan", "fuzzyLessThanOrEqual", "sensorTimestampNs", "imageTimestampNs", "fuzzyGreaterThanOrEqual", "fuzzyGreaterThan", "Camera2StreamConfigurationMap", "J", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/atomicfu/AtomicRef;", "getHighSpeedVideoFpsRanges", "Lkotlinx/atomicfu/AtomicRef;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OutputMatcher {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.pipe.internal.OutputMatcher.Companion INSTANCE = new androidx.camera.camera2.pipe.internal.OutputMatcher.Companion(null);
    private static final androidx.camera.camera2.pipe.internal.OutputMatcher EXACT = new androidx.camera.camera2.pipe.internal.OutputMatcher(0, 0);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final long getHighSpeedVideoFpsRangesFor;
    private final kotlinx.atomicfu.AtomicRef<java.lang.Long> getHighSpeedVideoFpsRanges;

    public OutputMatcher(long j, long j2) {
        this.getHighSpeedVideoFpsRangesFor = j2;
        this.getHighSpeedVideoFpsRanges = kotlinx.atomicfu.AtomicFU.atomic(java.lang.Long.valueOf(j));
    }

    public /* synthetic */ OutputMatcher(long j, long j2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, j2);
    }

    public final boolean fuzzyEqual(long cameraOutputNumber, long outputNumber) {
        long longValue = this.getHighSpeedVideoFpsRanges.getValue().longValue();
        long j = (cameraOutputNumber - outputNumber) + longValue;
        if (j == 0) {
            return true;
        }
        long j2 = this.getHighSpeedVideoFpsRangesFor;
        if (j2 == 0 || j >= j2 || j <= (-j2)) {
            return false;
        }
        this.getHighSpeedVideoFpsRanges.compareAndSet(java.lang.Long.valueOf(longValue), java.lang.Long.valueOf(longValue - j));
        return true;
    }

    public final boolean fuzzyLessThan(long cameraOutputNumber, long outputNumber) {
        return ((outputNumber - cameraOutputNumber) - this.getHighSpeedVideoFpsRanges.getValue().longValue()) + this.getHighSpeedVideoFpsRangesFor < 0;
    }

    public final boolean fuzzyLessThanOrEqual(long cameraOutputNumber, long outputNumber) {
        return ((outputNumber - cameraOutputNumber) - this.getHighSpeedVideoFpsRanges.getValue().longValue()) - this.getHighSpeedVideoFpsRangesFor <= 0;
    }

    public final boolean fuzzyGreaterThanOrEqual(long sensorTimestampNs, long imageTimestampNs) {
        return !fuzzyLessThan(sensorTimestampNs, imageTimestampNs);
    }

    public final boolean fuzzyGreaterThan(long sensorTimestampNs, long imageTimestampNs) {
        return !fuzzyLessThanOrEqual(sensorTimestampNs, imageTimestampNs);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Landroidx/camera/camera2/pipe/internal/OutputMatcher$Companion;", "", "<init>", "()V", "", "initialOffset", "errorDelta", "Landroidx/camera/camera2/pipe/internal/OutputMatcher;", "forTimestampsWithOffset", "(JJ)Landroidx/camera/camera2/pipe/internal/OutputMatcher;", "EXACT", "Landroidx/camera/camera2/pipe/internal/OutputMatcher;", "getEXACT", "()Landroidx/camera/camera2/pipe/internal/OutputMatcher;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.camera.camera2.pipe.internal.OutputMatcher getEXACT() {
            return androidx.camera.camera2.pipe.internal.OutputMatcher.EXACT;
        }

        public static /* synthetic */ androidx.camera.camera2.pipe.internal.OutputMatcher forTimestampsWithOffset$default(androidx.camera.camera2.pipe.internal.OutputMatcher.Companion companion, long j, long j2, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                j2 = 8333333;
            }
            return companion.forTimestampsWithOffset(j, j2);
        }

        public final androidx.camera.camera2.pipe.internal.OutputMatcher forTimestampsWithOffset(long initialOffset, long errorDelta) {
            return new androidx.camera.camera2.pipe.internal.OutputMatcher(initialOffset, errorDelta);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
