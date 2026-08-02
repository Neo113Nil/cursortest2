package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B)\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0016\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0013*\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/camera/camera2/pipe/compat/AndroidCameraConstrainedHighSpeedCaptureSession;", "Landroidx/camera/camera2/pipe/compat/AndroidCameraCaptureSession;", "Landroidx/camera/camera2/pipe/compat/CameraConstrainedHighSpeedCaptureSessionWrapper;", "Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;", "device", "Landroid/hardware/camera2/CameraConstrainedHighSpeedCaptureSession;", "session", "Landroidx/camera/camera2/pipe/internal/CameraErrorListener;", "cameraErrorListener", "Landroid/os/Handler;", "callbackHandler", "<init>", "(Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;Landroid/hardware/camera2/CameraConstrainedHighSpeedCaptureSession;Landroidx/camera/camera2/pipe/internal/CameraErrorListener;Landroid/os/Handler;)V", "Landroid/hardware/camera2/CaptureRequest;", "request", "", "createHighSpeedRequestList", "(Landroid/hardware/camera2/CaptureRequest;)Ljava/util/List;", "", "T", "Lkotlin/reflect/KClass;", "type", "unwrapAs", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Landroid/hardware/camera2/CameraConstrainedHighSpeedCaptureSession;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidCameraConstrainedHighSpeedCaptureSession extends androidx.camera.camera2.pipe.compat.AndroidCameraCaptureSession implements androidx.camera.camera2.pipe.compat.CameraConstrainedHighSpeedCaptureSessionWrapper {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCameraConstrainedHighSpeedCaptureSession(androidx.camera.camera2.pipe.compat.CameraDeviceWrapper cameraDeviceWrapper, android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession cameraConstrainedHighSpeedCaptureSession, androidx.camera.camera2.pipe.internal.CameraErrorListener cameraErrorListener, android.os.Handler handler) {
        super(cameraDeviceWrapper, cameraConstrainedHighSpeedCaptureSession, cameraErrorListener, handler);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraDeviceWrapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraConstrainedHighSpeedCaptureSession, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraErrorListener, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "");
        this.getHighSpeedVideoFpsRangesFor = cameraConstrainedHighSpeedCaptureSession;
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraConstrainedHighSpeedCaptureSessionWrapper
    public final java.util.List<android.hardware.camera2.CaptureRequest> createHighSpeedRequestList(android.hardware.camera2.CaptureRequest request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        try {
            androidx.camera.camera2.pipe.core.Debug debug = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
            try {
                android.os.Trace.beginSection("CXCP#createHighSpeedRequestList");
                return this.getHighSpeedVideoFpsRangesFor.createHighSpeedRequestList(request);
            } finally {
                android.os.Trace.endSection();
            }
        } catch (java.lang.IllegalArgumentException unused) {
            if (!androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE()) {
                return null;
            }
            java.util.Objects.toString(getDevice());
            return null;
        } catch (java.lang.IllegalStateException unused2) {
            if (!androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE()) {
                return null;
            }
            java.util.Objects.toString(getDevice());
            return null;
        } catch (java.lang.UnsupportedOperationException unused3) {
            if (!androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE()) {
                return null;
            }
            java.util.Objects.toString(getDevice());
            return null;
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.AndroidCameraCaptureSession, androidx.camera.camera2.pipe.UnsafeWrapper
    public final <T> T unwrapAs(kotlin.reflect.KClass<T> type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(type, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession.class)) ? (T) this.getHighSpeedVideoFpsRangesFor : (T) super.unwrapAs(type);
    }
}
