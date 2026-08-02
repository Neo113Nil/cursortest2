package androidx.camera.camera2.pipe.graph;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a#\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\n\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\n\u0010\t\u001a\u001b\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\t\u001a\u001b\u0010\f\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\f\u0010\t\u001a\u001b\u0010\r\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\t\u001a\u001b\u0010\u000e\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\t"}, d2 = {"Landroidx/camera/camera2/pipe/graph/State3A;", "", "Landroid/hardware/camera2/CaptureRequest$Key;", "", "toCaptureRequestParameterMap", "(Landroidx/camera/camera2/pipe/graph/State3A;)Ljava/util/Map;", "current", "", "wasAeLocked", "(Landroidx/camera/camera2/pipe/graph/State3A;Landroidx/camera/camera2/pipe/graph/State3A;)Z", "wasAeUnlocked", "wasAfLocked", "wasAfUnlocked", "wasAwbLocked", "wasAwbUnlocked"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GraphState3AKt {
    public static final java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> toCaptureRequestParameterMap(androidx.camera.camera2.pipe.graph.State3A state3A) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state3A, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        androidx.camera.camera2.pipe.AeMode m935getAeModeO_cDUUs = state3A.m935getAeModeO_cDUUs();
        if (m935getAeModeO_cDUUs != null) {
            int m157unboximpl = m935getAeModeO_cDUUs.m157unboximpl();
            android.hardware.camera2.CaptureRequest.Key key = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
            linkedHashMap.put(key, java.lang.Integer.valueOf(m157unboximpl));
        }
        androidx.camera.camera2.pipe.AfMode m936getAfMode32_E3BI = state3A.m936getAfMode32_E3BI();
        if (m936getAfMode32_E3BI != null) {
            int m176unboximpl = m936getAfMode32_E3BI.m176unboximpl();
            android.hardware.camera2.CaptureRequest.Key key2 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key2, "");
            linkedHashMap.put(key2, java.lang.Integer.valueOf(m176unboximpl));
        }
        androidx.camera.camera2.pipe.AwbMode m937getAwbModeaLFtWSU = state3A.m937getAwbModeaLFtWSU();
        if (m937getAwbModeaLFtWSU != null) {
            int m202unboximpl = m937getAwbModeaLFtWSU.m202unboximpl();
            android.hardware.camera2.CaptureRequest.Key key3 = android.hardware.camera2.CaptureRequest.CONTROL_AWB_MODE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key3, "");
            linkedHashMap.put(key3, java.lang.Integer.valueOf(m202unboximpl));
        }
        androidx.camera.camera2.pipe.FlashMode m938getFlashModecL19HE = state3A.m938getFlashModecL19HE();
        if (m938getFlashModecL19HE != null) {
            int m452unboximpl = m938getFlashModecL19HE.m452unboximpl();
            android.hardware.camera2.CaptureRequest.Key key4 = android.hardware.camera2.CaptureRequest.FLASH_MODE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key4, "");
            linkedHashMap.put(key4, java.lang.Integer.valueOf(m452unboximpl));
        }
        java.util.List<android.hardware.camera2.params.MeteringRectangle> aeRegions = state3A.getAeRegions();
        if (aeRegions != null) {
            android.hardware.camera2.CaptureRequest.Key key5 = android.hardware.camera2.CaptureRequest.CONTROL_AE_REGIONS;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key5, "");
            linkedHashMap.put(key5, aeRegions.toArray(new android.hardware.camera2.params.MeteringRectangle[0]));
        }
        java.util.List<android.hardware.camera2.params.MeteringRectangle> afRegions = state3A.getAfRegions();
        if (afRegions != null) {
            android.hardware.camera2.CaptureRequest.Key key6 = android.hardware.camera2.CaptureRequest.CONTROL_AF_REGIONS;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key6, "");
            linkedHashMap.put(key6, afRegions.toArray(new android.hardware.camera2.params.MeteringRectangle[0]));
        }
        java.util.List<android.hardware.camera2.params.MeteringRectangle> awbRegions = state3A.getAwbRegions();
        if (awbRegions != null) {
            android.hardware.camera2.CaptureRequest.Key key7 = android.hardware.camera2.CaptureRequest.CONTROL_AWB_REGIONS;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key7, "");
            linkedHashMap.put(key7, awbRegions.toArray(new android.hardware.camera2.params.MeteringRectangle[0]));
        }
        java.lang.Boolean aeLock = state3A.getAeLock();
        if (aeLock != null) {
            boolean booleanValue = aeLock.booleanValue();
            android.hardware.camera2.CaptureRequest.Key key8 = android.hardware.camera2.CaptureRequest.CONTROL_AE_LOCK;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key8, "");
            linkedHashMap.put(key8, java.lang.Boolean.valueOf(booleanValue));
        }
        java.lang.Boolean awbLock = state3A.getAwbLock();
        if (awbLock != null) {
            boolean booleanValue2 = awbLock.booleanValue();
            android.hardware.camera2.CaptureRequest.Key key9 = android.hardware.camera2.CaptureRequest.CONTROL_AWB_LOCK;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key9, "");
            linkedHashMap.put(key9, java.lang.Boolean.valueOf(booleanValue2));
        }
        return linkedHashMap;
    }

    public static final boolean wasAeLocked(androidx.camera.camera2.pipe.graph.State3A state3A, androidx.camera.camera2.pipe.graph.State3A state3A2) {
        java.lang.Boolean aeLock;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state3A, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state3A2, "");
        java.lang.Boolean aeLock2 = state3A.getAeLock();
        return (aeLock2 == null || !aeLock2.booleanValue()) && (aeLock = state3A2.getAeLock()) != null && aeLock.booleanValue();
    }

    public static final boolean wasAeUnlocked(androidx.camera.camera2.pipe.graph.State3A state3A, androidx.camera.camera2.pipe.graph.State3A state3A2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state3A, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state3A2, "");
        java.lang.Boolean aeLock = state3A.getAeLock();
        if (aeLock == null || !aeLock.booleanValue()) {
            return false;
        }
        java.lang.Boolean aeLock2 = state3A2.getAeLock();
        return aeLock2 == null || !aeLock2.booleanValue();
    }

    public static final boolean wasAfLocked(androidx.camera.camera2.pipe.graph.State3A state3A, androidx.camera.camera2.pipe.graph.State3A state3A2) {
        java.lang.Boolean afLock;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state3A, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state3A2, "");
        java.lang.Boolean afLock2 = state3A.getAfLock();
        return (afLock2 == null || !afLock2.booleanValue()) && (afLock = state3A2.getAfLock()) != null && afLock.booleanValue();
    }

    public static final boolean wasAfUnlocked(androidx.camera.camera2.pipe.graph.State3A state3A, androidx.camera.camera2.pipe.graph.State3A state3A2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state3A, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state3A2, "");
        java.lang.Boolean afLock = state3A.getAfLock();
        if (afLock == null || !afLock.booleanValue()) {
            return false;
        }
        java.lang.Boolean afLock2 = state3A2.getAfLock();
        return afLock2 == null || !afLock2.booleanValue();
    }

    public static final boolean wasAwbLocked(androidx.camera.camera2.pipe.graph.State3A state3A, androidx.camera.camera2.pipe.graph.State3A state3A2) {
        java.lang.Boolean awbLock;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state3A, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state3A2, "");
        java.lang.Boolean awbLock2 = state3A.getAwbLock();
        return (awbLock2 == null || !awbLock2.booleanValue()) && (awbLock = state3A2.getAwbLock()) != null && awbLock.booleanValue();
    }

    public static final boolean wasAwbUnlocked(androidx.camera.camera2.pipe.graph.State3A state3A, androidx.camera.camera2.pipe.graph.State3A state3A2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state3A, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state3A2, "");
        java.lang.Boolean awbLock = state3A.getAwbLock();
        if (awbLock == null || !awbLock.booleanValue()) {
            return false;
        }
        java.lang.Boolean awbLock2 = state3A2.getAwbLock();
        return awbLock2 == null || !awbLock2.booleanValue();
    }
}
