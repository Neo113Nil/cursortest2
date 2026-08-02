package androidx.camera.camera2.compat.workaround;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/camera/camera2/impl/CameraProperties;", "", "allowRethrowOnError", "isFlashAvailable", "(Landroidx/camera/camera2/impl/CameraProperties;Z)Z"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FlashAvailabilityCheckerKt {
    public static /* synthetic */ boolean isFlashAvailable$default(androidx.camera.camera2.impl.CameraProperties cameraProperties, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return isFlashAvailable(cameraProperties, z);
    }

    public static final boolean isFlashAvailable(androidx.camera.camera2.impl.CameraProperties cameraProperties, boolean z) {
        java.lang.Boolean bool;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraProperties, "");
        try {
            androidx.camera.camera2.pipe.CameraMetadata metadata = cameraProperties.getMetadata();
            android.hardware.camera2.CameraCharacteristics.Key key = android.hardware.camera2.CameraCharacteristics.FLASH_INFO_AVAILABLE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
            bool = (java.lang.Boolean) metadata.get(key);
        } catch (java.nio.BufferUnderflowException e) {
            if (androidx.camera.camera2.compat.quirk.DeviceQuirks.INSTANCE.get(androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk.class) != null) {
                androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                    java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                }
            } else {
                androidx.camera.camera2.impl.Camera2Logger camera2Logger2 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                if (androidx.camera.core.Logger.isErrorEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                    java.lang.String unused2 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                }
            }
            if (z) {
                throw e;
            }
            bool = java.lang.Boolean.FALSE;
        }
        if (bool == null) {
            androidx.camera.camera2.impl.Camera2Logger camera2Logger3 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            if (androidx.camera.core.Logger.isWarnEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                java.lang.String unused3 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
            }
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
