package androidx.camera.camera2.pipe.graph;

@androidx.camera.camera2.pipe.config.CameraGraphScope
@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0097\u0001\u0010\u0018\u001a\u00020\u00152\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a\u0012\u0004\u0012\u00020\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R$\u0010'\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u001e8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&"}, d2 = {"Landroidx/camera/camera2/pipe/graph/GraphState3A;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/AeMode;", "aeMode", "Landroidx/camera/camera2/pipe/AfMode;", "afMode", "Landroidx/camera/camera2/pipe/AwbMode;", "awbMode", "Landroidx/camera/camera2/pipe/FlashMode;", "flashMode", "", "Landroid/hardware/camera2/params/MeteringRectangle;", "aeRegions", "afRegions", "awbRegions", "", "aeLock", "afLock", "awbLock", "", "update-7jOEVJU", "(Landroidx/camera/camera2/pipe/AeMode;Landroidx/camera/camera2/pipe/AfMode;Landroidx/camera/camera2/pipe/AwbMode;Landroidx/camera/camera2/pipe/FlashMode;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "update", "", "Landroid/hardware/camera2/CaptureRequest$Key;", "toCaptureRequestParametersMap", "()Ljava/util/Map;", "Lkotlinx/atomicfu/AtomicRef;", "Landroidx/camera/camera2/pipe/graph/State3A;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/atomicfu/AtomicRef;", "getHighSpeedVideoSizes", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getCurrent", "()Landroidx/camera/camera2/pipe/graph/State3A;", "setCurrent", "(Landroidx/camera/camera2/pipe/graph/State3A;)V", "current"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GraphState3A {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.atomicfu.AtomicRef<androidx.camera.camera2.pipe.graph.State3A> getHighSpeedVideoSizes = kotlinx.atomicfu.AtomicFU.atomic(new androidx.camera.camera2.pipe.graph.State3A(null, null, null, null, null, null, null, null, null, null, 1023, null));

    @javax.inject.Inject
    public GraphState3A() {
    }

    public final androidx.camera.camera2.pipe.graph.State3A getCurrent() {
        return this.getHighSpeedVideoSizes.getValue();
    }

    public final void setCurrent(androidx.camera.camera2.pipe.graph.State3A state3A) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state3A, "");
        this.getHighSpeedVideoSizes.setValue(state3A);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: update-7jOEVJU$default, reason: not valid java name */
    public static /* synthetic */ void m918update7jOEVJU$default(androidx.camera.camera2.pipe.graph.GraphState3A graphState3A, androidx.camera.camera2.pipe.AeMode aeMode, androidx.camera.camera2.pipe.AfMode afMode, androidx.camera.camera2.pipe.AwbMode awbMode, androidx.camera.camera2.pipe.FlashMode flashMode, java.util.List list, java.util.List list2, java.util.List list3, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            aeMode = null;
        }
        if ((i & 2) != 0) {
            afMode = null;
        }
        if ((i & 4) != 0) {
            awbMode = null;
        }
        if ((i & 8) != 0) {
            flashMode = null;
        }
        if ((i & 16) != 0) {
            list = null;
        }
        if ((i & 32) != 0) {
            list2 = null;
        }
        if ((i & 64) != 0) {
            list3 = null;
        }
        if ((i & 128) != 0) {
            bool = null;
        }
        if ((i & 256) != 0) {
            bool2 = null;
        }
        if ((i & 512) != 0) {
            bool3 = null;
        }
        graphState3A.m919update7jOEVJU(aeMode, afMode, awbMode, flashMode, list, list2, list3, bool, bool2, bool3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        if (r9 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if (r10 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0068, code lost:
    
        if (r8 == null) goto L37;
     */
    /* renamed from: update-7jOEVJU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m919update7jOEVJU(androidx.camera.camera2.pipe.AeMode aeMode, androidx.camera.camera2.pipe.AfMode afMode, androidx.camera.camera2.pipe.AwbMode awbMode, androidx.camera.camera2.pipe.FlashMode flashMode, java.util.List<android.hardware.camera2.params.MeteringRectangle> aeRegions, java.util.List<android.hardware.camera2.params.MeteringRectangle> afRegions, java.util.List<android.hardware.camera2.params.MeteringRectangle> awbRegions, java.lang.Boolean aeLock, java.lang.Boolean afLock, java.lang.Boolean awbLock) {
        androidx.camera.camera2.pipe.graph.State3A value;
        androidx.camera.camera2.pipe.graph.State3A state3A;
        androidx.camera.camera2.pipe.AeMode m935getAeModeO_cDUUs;
        androidx.camera.camera2.pipe.AfMode m936getAfMode32_E3BI;
        androidx.camera.camera2.pipe.AwbMode m937getAwbModeaLFtWSU;
        androidx.camera.camera2.pipe.FlashMode m938getFlashModecL19HE;
        java.util.List<android.hardware.camera2.params.MeteringRectangle> aeRegions2;
        java.util.List<android.hardware.camera2.params.MeteringRectangle> afRegions2;
        java.util.List<android.hardware.camera2.params.MeteringRectangle> awbRegions2;
        kotlinx.atomicfu.AtomicRef<androidx.camera.camera2.pipe.graph.State3A> atomicRef = this.getHighSpeedVideoSizes;
        do {
            value = atomicRef.getValue();
            state3A = value;
            m935getAeModeO_cDUUs = aeMode == null ? state3A.m935getAeModeO_cDUUs() : aeMode;
            m936getAfMode32_E3BI = afMode == null ? state3A.m936getAfMode32_E3BI() : afMode;
            m937getAwbModeaLFtWSU = awbMode == null ? state3A.m937getAwbModeaLFtWSU() : awbMode;
            m938getFlashModecL19HE = flashMode == null ? state3A.m938getFlashModecL19HE() : flashMode;
            if (aeRegions != null) {
                java.util.List<android.hardware.camera2.params.MeteringRectangle> list = aeRegions;
                if (list.isEmpty()) {
                    list = null;
                }
                aeRegions2 = list;
            }
            aeRegions2 = state3A.getAeRegions();
            if (afRegions != null) {
                java.util.List<android.hardware.camera2.params.MeteringRectangle> list2 = afRegions;
                if (list2.isEmpty()) {
                    list2 = null;
                }
                afRegions2 = list2;
            }
            afRegions2 = state3A.getAfRegions();
            if (awbRegions != null) {
                java.util.List<android.hardware.camera2.params.MeteringRectangle> list3 = awbRegions;
                awbRegions2 = list3.isEmpty() ? null : list3;
            }
            awbRegions2 = state3A.getAwbRegions();
        } while (!atomicRef.compareAndSet(value, state3A.m934copy7jOEVJU(m935getAeModeO_cDUUs, m936getAfMode32_E3BI, m937getAwbModeaLFtWSU, m938getFlashModecL19HE, aeRegions2, afRegions2, awbRegions2, aeLock == null ? state3A.getAeLock() : aeLock, afLock == null ? state3A.getAfLock() : afLock, awbLock == null ? state3A.getAwbLock() : awbLock)));
    }

    public final java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> toCaptureRequestParametersMap() {
        return androidx.camera.camera2.pipe.graph.GraphState3AKt.toCaptureRequestParameterMap(getCurrent());
    }
}
