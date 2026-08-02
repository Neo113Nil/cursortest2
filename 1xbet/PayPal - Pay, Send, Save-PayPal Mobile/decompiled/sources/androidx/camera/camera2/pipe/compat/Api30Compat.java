package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/camera/camera2/pipe/compat/Api30Compat;", "", "<init>", "()V", "Landroid/hardware/camera2/CameraManager;", "cameraManager", "", "", "getConcurrentCameraIds", "(Landroid/hardware/camera2/CameraManager;)Ljava/util/Set;", "Landroid/hardware/camera2/CameraDevice;", "cameraDevice", "", "getCameraAudioRestriction", "(Landroid/hardware/camera2/CameraDevice;)I", "mode", "", "setCameraAudioRestriction", "(Landroid/hardware/camera2/CameraDevice;I)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Api30Compat {
    public static final androidx.camera.camera2.pipe.compat.Api30Compat INSTANCE = new androidx.camera.camera2.pipe.compat.Api30Compat();

    private Api30Compat() {
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.Set<java.util.Set<java.lang.String>> getConcurrentCameraIds(android.hardware.camera2.CameraManager cameraManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraManager, "");
        java.util.Set<java.util.Set<java.lang.String>> concurrentCameraIds = cameraManager.getConcurrentCameraIds();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(concurrentCameraIds, "");
        return concurrentCameraIds;
    }

    @kotlin.jvm.JvmStatic
    public static final int getCameraAudioRestriction(android.hardware.camera2.CameraDevice cameraDevice) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraDevice, "");
        return cameraDevice.getCameraAudioRestriction();
    }

    @kotlin.jvm.JvmStatic
    public static final void setCameraAudioRestriction(android.hardware.camera2.CameraDevice cameraDevice, int mode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraDevice, "");
        cameraDevice.setCameraAudioRestriction(mode);
    }
}
