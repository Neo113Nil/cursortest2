package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/camera/camera2/pipe/compat/Camera2DeviceSetup;", "Landroidx/camera/camera2/pipe/compat/Camera2DeviceSetupWrapper;", "Landroid/hardware/camera2/CameraDevice$CameraDeviceSetup;", "cameraDeviceSetup", "Landroidx/camera/camera2/pipe/CameraId;", "cameraId", "Landroidx/camera/camera2/pipe/internal/CameraErrorListener;", "cameraErrorListener", "<init>", "(Landroid/hardware/camera2/CameraDevice$CameraDeviceSetup;Ljava/lang/String;Landroidx/camera/camera2/pipe/internal/CameraErrorListener;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "templateType", "Landroid/hardware/camera2/CaptureRequest$Builder;", "createCaptureRequest", "(I)Landroid/hardware/camera2/CaptureRequest$Builder;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/hardware/camera2/CameraDevice$CameraDeviceSetup;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Landroidx/camera/camera2/pipe/internal/CameraErrorListener;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Camera2DeviceSetup implements androidx.camera.camera2.pipe.compat.Camera2DeviceSetupWrapper {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.internal.CameraErrorListener getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.hardware.camera2.CameraDevice.CameraDeviceSetup getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoSizes;

    private Camera2DeviceSetup(android.hardware.camera2.CameraDevice.CameraDeviceSetup cameraDeviceSetup, java.lang.String str, androidx.camera.camera2.pipe.internal.CameraErrorListener cameraErrorListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraDeviceSetup, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraErrorListener, "");
        this.getHighSpeedVideoFpsRangesFor = cameraDeviceSetup;
        this.getHighSpeedVideoSizes = str;
        this.getHighResolutionOutputSizeshNQ4ISI = cameraErrorListener;
    }

    @Override // androidx.camera.camera2.pipe.compat.Camera2DeviceSetupWrapper
    public final android.hardware.camera2.CaptureRequest.Builder createCaptureRequest(int templateType) {
        java.lang.String str = this.getHighSpeedVideoSizes;
        androidx.camera.camera2.pipe.internal.CameraErrorListener cameraErrorListener = this.getHighResolutionOutputSizeshNQ4ISI;
        try {
            return this.getHighSpeedVideoFpsRangesFor.createCaptureRequest(templateType);
        } catch (java.lang.Exception e) {
            if (e instanceof android.hardware.camera2.CameraAccessException) {
                if (androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE()) {
                    e.getMessage();
                }
                cameraErrorListener.mo790onCameraError3M5Xam4(str, androidx.camera.camera2.pipe.CameraError.INSTANCE.m328fromPVuDhNw$camera_camera2_pipe((android.hardware.camera2.CameraAccessException) e), true);
                return null;
            }
            if ((e instanceof java.lang.IllegalArgumentException) || (e instanceof java.lang.SecurityException) || (e instanceof java.lang.UnsupportedOperationException) || (e instanceof java.lang.NullPointerException)) {
                if (androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE()) {
                    e.getMessage();
                }
                cameraErrorListener.mo790onCameraError3M5Xam4(str, androidx.camera.camera2.pipe.CameraError.INSTANCE.m339getERROR_GRAPH_CONFIGv7Vf74A(), false);
                return null;
            }
            if (e instanceof java.lang.IllegalStateException) {
                androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE();
                return null;
            }
            throw e;
        }
    }

    public /* synthetic */ Camera2DeviceSetup(android.hardware.camera2.CameraDevice.CameraDeviceSetup cameraDeviceSetup, java.lang.String str, androidx.camera.camera2.pipe.internal.CameraErrorListener cameraErrorListener, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(cameraDeviceSetup, str, cameraErrorListener);
    }
}
