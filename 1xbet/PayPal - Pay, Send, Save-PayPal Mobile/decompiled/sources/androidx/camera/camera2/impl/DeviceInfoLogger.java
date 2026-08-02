package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/camera2/impl/DeviceInfoLogger;", "", "<init>", "()V", "Landroidx/camera/camera2/impl/CameraProperties;", "cameraProperties", "", "logDeviceInfo", "(Landroidx/camera/camera2/impl/CameraProperties;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DeviceInfoLogger {
    public static final androidx.camera.camera2.impl.DeviceInfoLogger INSTANCE = new androidx.camera.camera2.impl.DeviceInfoLogger();

    private DeviceInfoLogger() {
    }

    public final void logDeviceInfo(androidx.camera.camera2.impl.CameraProperties cameraProperties) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraProperties, "");
        androidx.camera.camera2.pipe.CameraMetadata metadata = cameraProperties.getMetadata();
        android.hardware.camera2.CameraCharacteristics.Key key = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
        androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isInfoEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
        }
    }
}
