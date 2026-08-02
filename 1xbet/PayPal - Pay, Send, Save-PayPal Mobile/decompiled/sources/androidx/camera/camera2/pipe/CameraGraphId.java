package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t"}, d2 = {"Landroidx/camera/camera2/pipe/CameraGraphId;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CameraGraphId {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.pipe.CameraGraphId.Companion INSTANCE = new androidx.camera.camera2.pipe.CameraGraphId.Companion(null);
    private static final kotlinx.atomicfu.AtomicInt getHighResolutionOutputSizeshNQ4ISI = kotlinx.atomicfu.AtomicFU.atomic(0);

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    private CameraGraphId(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }

    /* renamed from: toString, reason: from getter */
    public final java.lang.String getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t"}, d2 = {"Landroidx/camera/camera2/pipe/CameraGraphId$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/CameraGraphId;", "nextId", "()Landroidx/camera/camera2/pipe/CameraGraphId;", "Lkotlinx/atomicfu/AtomicInt;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/atomicfu/AtomicInt;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.camera.camera2.pipe.CameraGraphId nextId() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CameraGraph-");
            sb.append(androidx.camera.camera2.pipe.CameraGraphId.getHighResolutionOutputSizeshNQ4ISI.incrementAndGet());
            return new androidx.camera.camera2.pipe.CameraGraphId(sb.toString(), null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.camera2.pipe.CameraGraphId nextId() {
        return INSTANCE.nextId();
    }

    public /* synthetic */ CameraGraphId(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
