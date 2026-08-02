package androidx.camera.camera2.compat.workaround;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/camera/camera2/impl/Camera2ImplConfig$Builder;", "Landroidx/camera/core/impl/ImageCaptureConfig;", "imageCaptureConfig", "", "toggleHDRPlus", "(Landroidx/camera/camera2/impl/Camera2ImplConfig$Builder;Landroidx/camera/core/impl/ImageCaptureConfig;)V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ImageCapturePixelHDRPlusKt {
    public static final void toggleHDRPlus(androidx.camera.camera2.impl.Camera2ImplConfig.Builder builder, androidx.camera.core.impl.ImageCaptureConfig imageCaptureConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageCaptureConfig, "");
        if (((androidx.camera.camera2.compat.quirk.ImageCapturePixelHDRPlusQuirk) androidx.camera.camera2.compat.quirk.DeviceQuirks.INSTANCE.get(androidx.camera.camera2.compat.quirk.ImageCapturePixelHDRPlusQuirk.class)) == null || !imageCaptureConfig.hasCaptureMode()) {
            return;
        }
        int captureMode = imageCaptureConfig.getCaptureMode();
        if (captureMode == 0) {
            android.hardware.camera2.CaptureRequest.Key key = android.hardware.camera2.CaptureRequest.CONTROL_ENABLE_ZSL;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
            builder.setCaptureRequestOption(key, java.lang.Boolean.TRUE);
        } else {
            if (captureMode != 1) {
                return;
            }
            android.hardware.camera2.CaptureRequest.Key key2 = android.hardware.camera2.CaptureRequest.CONTROL_ENABLE_ZSL;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key2, "");
            builder.setCaptureRequestOption(key2, java.lang.Boolean.FALSE);
        }
    }
}
