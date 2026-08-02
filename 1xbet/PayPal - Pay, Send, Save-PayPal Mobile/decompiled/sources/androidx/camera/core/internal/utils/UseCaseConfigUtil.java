package androidx.camera.core.internal.utils;

/* loaded from: classes6.dex */
public final class UseCaseConfigUtil {
    private UseCaseConfigUtil() {
    }

    public static void updateTargetRotationAndRelatedConfigs(androidx.camera.core.impl.UseCaseConfig.Builder<?, ?, ?> builder, int i) {
        android.util.Size targetResolution;
        androidx.camera.core.impl.ImageOutputConfig imageOutputConfig = (androidx.camera.core.impl.ImageOutputConfig) builder.getUseCaseConfig();
        int targetRotation = imageOutputConfig.getTargetRotation(-1);
        if (targetRotation == -1 || targetRotation != i) {
            ((androidx.camera.core.impl.ImageOutputConfig.Builder) builder).setTargetRotation(i);
        }
        if (targetRotation == -1 || i == -1 || targetRotation == i) {
            return;
        }
        if (java.lang.Math.abs(androidx.camera.core.impl.utils.CameraOrientationUtil.surfaceRotationToDegrees(i) - androidx.camera.core.impl.utils.CameraOrientationUtil.surfaceRotationToDegrees(targetRotation)) % com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE != 90 || (targetResolution = imageOutputConfig.getTargetResolution(null)) == null) {
            return;
        }
        ((androidx.camera.core.impl.ImageOutputConfig.Builder) builder).setTargetResolution(new android.util.Size(targetResolution.getHeight(), targetResolution.getWidth()));
    }
}
