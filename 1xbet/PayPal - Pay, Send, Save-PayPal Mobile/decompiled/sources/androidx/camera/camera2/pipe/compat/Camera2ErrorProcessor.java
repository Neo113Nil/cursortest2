package androidx.camera.camera2.pipe.compat;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/camera/camera2/pipe/compat/Camera2ErrorProcessor;", "Landroidx/camera/camera2/pipe/internal/CameraErrorListener;", "<init>", "()V", "Landroidx/camera/camera2/pipe/CameraId;", "cameraId", "Landroidx/camera/camera2/pipe/CameraError;", "cameraError", "", "willAttemptRetry", "", "onCameraError-3M5Xam4", "(Ljava/lang/String;IZ)V", "onCameraError", "Landroidx/camera/camera2/pipe/compat/VirtualCameraState;", "virtualCameraState", "setActiveVirtualCamera-0r8Bogc$camera_camera2_pipe", "(Ljava/lang/String;Landroidx/camera/camera2/pipe/compat/VirtualCameraState;)V", "setActiveVirtualCamera", "", "getHighSpeedVideoSizes", "Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "", "getHighSpeedVideoFpsRanges", "Ljava/util/Map;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Camera2ErrorProcessor implements androidx.camera.camera2.pipe.internal.CameraErrorListener {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.Object getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object();

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.Map<androidx.camera.camera2.pipe.CameraId, androidx.camera.camera2.pipe.compat.VirtualCameraState> Camera2StreamConfigurationMap = new java.util.LinkedHashMap();

    @javax.inject.Inject
    public Camera2ErrorProcessor() {
    }

    @Override // androidx.camera.camera2.pipe.internal.CameraErrorListener
    /* renamed from: onCameraError-3M5Xam4, reason: not valid java name */
    public final void mo790onCameraError3M5Xam4(java.lang.String cameraId, int cameraError, boolean willAttemptRetry) {
        androidx.camera.camera2.pipe.compat.VirtualCameraState virtualCameraState;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraId, "");
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            virtualCameraState = this.Camera2StreamConfigurationMap.get(androidx.camera.camera2.pipe.CameraId.m392boximpl(cameraId));
        }
        if (virtualCameraState == null) {
            return;
        }
        virtualCameraState.getGraphListener().onGraphError(new androidx.camera.camera2.pipe.GraphState.GraphStateError(cameraError, willAttemptRetry, null));
    }

    /* renamed from: setActiveVirtualCamera-0r8Bogc$camera_camera2_pipe, reason: not valid java name */
    public final void m791setActiveVirtualCamera0r8Bogc$camera_camera2_pipe(java.lang.String cameraId, androidx.camera.camera2.pipe.compat.VirtualCameraState virtualCameraState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(virtualCameraState, "");
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            this.Camera2StreamConfigurationMap.put(androidx.camera.camera2.pipe.CameraId.m392boximpl(cameraId), virtualCameraState);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }
}
