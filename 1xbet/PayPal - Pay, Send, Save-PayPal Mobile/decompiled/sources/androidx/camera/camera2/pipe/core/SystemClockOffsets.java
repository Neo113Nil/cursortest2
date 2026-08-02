package androidx.camera.camera2.pipe.core;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u000b\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n"}, d2 = {"Landroidx/camera/camera2/pipe/core/SystemClockOffsets;", "", "", "p0", "p1", "<init>", "(JJ)V", "realtimeNsToUtcMs", "J", "getRealtimeNsToUtcMs", "()J", "realtimeNsToMonotonicNs", "getRealtimeNsToMonotonicNs", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SystemClockOffsets {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.pipe.core.SystemClockOffsets.Companion INSTANCE = new androidx.camera.camera2.pipe.core.SystemClockOffsets.Companion(null);
    private final long realtimeNsToMonotonicNs;
    private final long realtimeNsToUtcMs;

    private SystemClockOffsets(long j, long j2) {
        this.realtimeNsToUtcMs = j;
        this.realtimeNsToMonotonicNs = j2;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0016\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u001b\u0010\t\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0011\u0010\u0010J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0013\u0010\u0010J\u001b\u0010\u0014\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0014\u0010\u0010J\u001b\u0010\u0015\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0015\u0010\u0010J\u001b\u0010\u0017\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0017\u0010\u0010J\u001b\u0010\u0018\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0018\u0010\u0010J\u001b\u0010\u0019\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0019\u0010\u0010J\u001b\u0010\u001b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001b\u0010\u0010J\u001b\u0010\u001c\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001c\u0010\u0010J\u001b\u0010\u001d\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001d\u0010\u0010"}, d2 = {"Landroidx/camera/camera2/pipe/core/SystemClockOffsets$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/core/SystemClockOffsets;", "estimate", "()Landroidx/camera/camera2/pipe/core/SystemClockOffsets;", "", "realtimeNsToUtcMs", "realtimeNsToMonotonicNs", "fixed", "(JJ)Landroidx/camera/camera2/pipe/core/SystemClockOffsets;", "getHighSpeedVideoSizes", "()J", "Camera2StreamConfigurationMap", "realtimeNs", "(Landroidx/camera/camera2/pipe/core/SystemClockOffsets;J)J", "realtimeNsToMonotonicMs", "realtimeMs", "realtimeMsToMonotonicNs", "realtimeMsToMonotonicMs", "realtimeMsToUtcMs", "monotonicNs", "monotonicNsToRealtimeNs", "monotonicNsToRealtimeMs", "monotonicNsToUtcMs", "monotonicMs", "monotonicMsToRealtimeNs", "monotonicMsToRealtimeMs", "monotonicMsToUtcMs"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.camera.camera2.pipe.core.SystemClockOffsets estimate() {
            return new androidx.camera.camera2.pipe.core.SystemClockOffsets(getHighSpeedVideoSizes(), Camera2StreamConfigurationMap(), null);
        }

        @kotlin.jvm.JvmStatic
        public final androidx.camera.camera2.pipe.core.SystemClockOffsets fixed(long realtimeNsToUtcMs, long realtimeNsToMonotonicNs) {
            return new androidx.camera.camera2.pipe.core.SystemClockOffsets(realtimeNsToUtcMs, realtimeNsToMonotonicNs, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @kotlin.jvm.JvmStatic
        public static long getHighSpeedVideoSizes() {
            long j = Long.MAX_VALUE;
            long j2 = 0;
            for (int i = 0; i < 3; i++) {
                long elapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                long elapsedRealtimeNanos2 = android.os.SystemClock.elapsedRealtimeNanos();
                long j3 = elapsedRealtimeNanos2 - elapsedRealtimeNanos;
                if (j3 < j) {
                    j2 = ((elapsedRealtimeNanos + elapsedRealtimeNanos2) / 2000000) - currentTimeMillis;
                    j = j3;
                }
            }
            return j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @kotlin.jvm.JvmStatic
        public static long Camera2StreamConfigurationMap() {
            long j = Long.MAX_VALUE;
            long j2 = 0;
            for (int i = 0; i < 3; i++) {
                long nanoTime = java.lang.System.nanoTime();
                long elapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
                long nanoTime2 = java.lang.System.nanoTime();
                long j3 = nanoTime2 - nanoTime;
                if (j3 < j) {
                    j2 = elapsedRealtimeNanos - ((nanoTime + nanoTime2) / 2);
                    j = j3;
                }
            }
            return j2;
        }

        @kotlin.jvm.JvmStatic
        public final long realtimeNsToMonotonicNs(androidx.camera.camera2.pipe.core.SystemClockOffsets systemClockOffsets, long j) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(systemClockOffsets, "");
            return j - systemClockOffsets.getRealtimeNsToMonotonicNs();
        }

        @kotlin.jvm.JvmStatic
        public final long realtimeNsToMonotonicMs(androidx.camera.camera2.pipe.core.SystemClockOffsets systemClockOffsets, long j) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(systemClockOffsets, "");
            return realtimeNsToMonotonicNs(systemClockOffsets, j) / 1000000;
        }

        @kotlin.jvm.JvmStatic
        public final long realtimeNsToUtcMs(androidx.camera.camera2.pipe.core.SystemClockOffsets systemClockOffsets, long j) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(systemClockOffsets, "");
            return (j / 1000000) - systemClockOffsets.getRealtimeNsToUtcMs();
        }

        @kotlin.jvm.JvmStatic
        public final long realtimeMsToMonotonicNs(androidx.camera.camera2.pipe.core.SystemClockOffsets systemClockOffsets, long j) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(systemClockOffsets, "");
            return (j * 1000000) - systemClockOffsets.getRealtimeNsToMonotonicNs();
        }

        @kotlin.jvm.JvmStatic
        public final long realtimeMsToMonotonicMs(androidx.camera.camera2.pipe.core.SystemClockOffsets systemClockOffsets, long j) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(systemClockOffsets, "");
            return realtimeMsToMonotonicNs(systemClockOffsets, j) / 1000000;
        }

        @kotlin.jvm.JvmStatic
        public final long realtimeMsToUtcMs(androidx.camera.camera2.pipe.core.SystemClockOffsets systemClockOffsets, long j) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(systemClockOffsets, "");
            return j - systemClockOffsets.getRealtimeNsToUtcMs();
        }

        @kotlin.jvm.JvmStatic
        public final long monotonicNsToRealtimeNs(androidx.camera.camera2.pipe.core.SystemClockOffsets systemClockOffsets, long j) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(systemClockOffsets, "");
            return systemClockOffsets.getRealtimeNsToMonotonicNs() + j;
        }

        @kotlin.jvm.JvmStatic
        public final long monotonicNsToRealtimeMs(androidx.camera.camera2.pipe.core.SystemClockOffsets systemClockOffsets, long j) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(systemClockOffsets, "");
            return monotonicNsToRealtimeNs(systemClockOffsets, j) / 1000000;
        }

        @kotlin.jvm.JvmStatic
        public final long monotonicNsToUtcMs(androidx.camera.camera2.pipe.core.SystemClockOffsets systemClockOffsets, long j) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(systemClockOffsets, "");
            return realtimeNsToUtcMs(systemClockOffsets, monotonicNsToRealtimeNs(systemClockOffsets, j));
        }

        @kotlin.jvm.JvmStatic
        public final long monotonicMsToRealtimeNs(androidx.camera.camera2.pipe.core.SystemClockOffsets systemClockOffsets, long j) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(systemClockOffsets, "");
            return systemClockOffsets.getRealtimeNsToMonotonicNs() + (j * 1000000);
        }

        @kotlin.jvm.JvmStatic
        public final long monotonicMsToRealtimeMs(androidx.camera.camera2.pipe.core.SystemClockOffsets systemClockOffsets, long j) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(systemClockOffsets, "");
            return monotonicMsToRealtimeNs(systemClockOffsets, j) / 1000000;
        }

        @kotlin.jvm.JvmStatic
        public final long monotonicMsToUtcMs(androidx.camera.camera2.pipe.core.SystemClockOffsets systemClockOffsets, long j) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(systemClockOffsets, "");
            return realtimeNsToUtcMs(systemClockOffsets, monotonicMsToRealtimeNs(systemClockOffsets, j));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final long getRealtimeNsToMonotonicNs() {
        return this.realtimeNsToMonotonicNs;
    }

    public final long getRealtimeNsToUtcMs() {
        return this.realtimeNsToUtcMs;
    }

    @kotlin.jvm.JvmStatic
    public static final long realtimeNsToUtcMs(androidx.camera.camera2.pipe.core.SystemClockOffsets systemClockOffsets, long j) {
        return INSTANCE.realtimeNsToUtcMs(systemClockOffsets, j);
    }

    @kotlin.jvm.JvmStatic
    public static final long realtimeNsToMonotonicNs(androidx.camera.camera2.pipe.core.SystemClockOffsets systemClockOffsets, long j) {
        return INSTANCE.realtimeNsToMonotonicNs(systemClockOffsets, j);
    }

    @kotlin.jvm.JvmStatic
    public static final long realtimeNsToMonotonicMs(androidx.camera.camera2.pipe.core.SystemClockOffsets systemClockOffsets, long j) {
        return INSTANCE.realtimeNsToMonotonicMs(systemClockOffsets, j);
    }

    @kotlin.jvm.JvmStatic
    public static final long realtimeMsToUtcMs(androidx.camera.camera2.pipe.core.SystemClockOffsets systemClockOffsets, long j) {
        return INSTANCE.realtimeMsToUtcMs(systemClockOffsets, j);
    }

    @kotlin.jvm.JvmStatic
    public static final long realtimeMsToMonotonicNs(androidx.camera.camera2.pipe.core.SystemClockOffsets systemClockOffsets, long j) {
        return INSTANCE.realtimeMsToMonotonicNs(systemClockOffsets, j);
    }

    @kotlin.jvm.JvmStatic
    public static final long realtimeMsToMonotonicMs(androidx.camera.camera2.pipe.core.SystemClockOffsets systemClockOffsets, long j) {
        return INSTANCE.realtimeMsToMonotonicMs(systemClockOffsets, j);
    }

    @kotlin.jvm.JvmStatic
    public static final long monotonicNsToUtcMs(androidx.camera.camera2.pipe.core.SystemClockOffsets systemClockOffsets, long j) {
        return INSTANCE.monotonicNsToUtcMs(systemClockOffsets, j);
    }

    @kotlin.jvm.JvmStatic
    public static final long monotonicNsToRealtimeNs(androidx.camera.camera2.pipe.core.SystemClockOffsets systemClockOffsets, long j) {
        return INSTANCE.monotonicNsToRealtimeNs(systemClockOffsets, j);
    }

    @kotlin.jvm.JvmStatic
    public static final long monotonicNsToRealtimeMs(androidx.camera.camera2.pipe.core.SystemClockOffsets systemClockOffsets, long j) {
        return INSTANCE.monotonicNsToRealtimeMs(systemClockOffsets, j);
    }

    @kotlin.jvm.JvmStatic
    public static final long monotonicMsToUtcMs(androidx.camera.camera2.pipe.core.SystemClockOffsets systemClockOffsets, long j) {
        return INSTANCE.monotonicMsToUtcMs(systemClockOffsets, j);
    }

    @kotlin.jvm.JvmStatic
    public static final long monotonicMsToRealtimeNs(androidx.camera.camera2.pipe.core.SystemClockOffsets systemClockOffsets, long j) {
        return INSTANCE.monotonicMsToRealtimeNs(systemClockOffsets, j);
    }

    @kotlin.jvm.JvmStatic
    public static final long monotonicMsToRealtimeMs(androidx.camera.camera2.pipe.core.SystemClockOffsets systemClockOffsets, long j) {
        return INSTANCE.monotonicMsToRealtimeMs(systemClockOffsets, j);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.camera2.pipe.core.SystemClockOffsets fixed(long j, long j2) {
        return INSTANCE.fixed(j, j2);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.camera2.pipe.core.SystemClockOffsets estimate() {
        return INSTANCE.estimate();
    }

    public /* synthetic */ SystemClockOffsets(long j, long j2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }
}
