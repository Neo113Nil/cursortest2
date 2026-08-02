package androidx.camera.core.impl.utils;

/* loaded from: classes6.dex */
public final class CameraOrientationUtil {
    private CameraOrientationUtil() {
    }

    public static int getRelativeImageRotation(int i, int i2, boolean z) {
        int i3;
        if (z) {
            i3 = ((i2 - i) + 360) % 360;
        } else {
            i3 = (i2 + i) % 360;
        }
        if (androidx.camera.core.Logger.isVerboseEnabled("CameraOrientationUtil")) {
            androidx.camera.core.Logger.d("CameraOrientationUtil", java.lang.String.format("getRelativeImageRotation: destRotationDegrees=%s, sourceRotationDegrees=%s, isOppositeFacing=%s, result=%s", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Boolean.valueOf(z), java.lang.Integer.valueOf(i3)));
        }
        return i3;
    }

    public static int surfaceRotationToDegrees(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 90;
        }
        if (i == 2) {
            return com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE;
        }
        if (i == 3) {
            return 270;
        }
        throw new java.lang.IllegalArgumentException("Unsupported surface rotation: ".concat(java.lang.String.valueOf(i)));
    }

    public static int degreesToSurfaceRotation(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 90) {
            return 1;
        }
        if (i == 180) {
            return 2;
        }
        if (i == 270) {
            return 3;
        }
        throw new java.lang.IllegalStateException("Invalid sensor rotation: ".concat(java.lang.String.valueOf(i)));
    }
}
