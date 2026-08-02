package androidx.biometric;

/* loaded from: classes3.dex */
class PackageUtils {
    private PackageUtils() {
    }

    static boolean getHighSpeedVideoFpsRanges(android.content.Context context) {
        return (context == null || context.getPackageManager() == null || !androidx.biometric.PackageUtils.Api23Impl.getHighResolutionOutputSizeshNQ4ISI(context.getPackageManager())) ? false : true;
    }

    static boolean getHighSpeedVideoFpsRangesFor(android.content.Context context) {
        return android.os.Build.VERSION.SDK_INT >= 29 && context != null && context.getPackageManager() != null && androidx.biometric.PackageUtils.Api29Impl.getHighSpeedVideoSizes(context.getPackageManager());
    }

    static boolean getHighResolutionOutputSizeshNQ4ISI(android.content.Context context) {
        return android.os.Build.VERSION.SDK_INT >= 29 && context != null && context.getPackageManager() != null && androidx.biometric.PackageUtils.Api29Impl.getHighResolutionOutputSizeshNQ4ISI(context.getPackageManager());
    }

    static class Api23Impl {
        private Api23Impl() {
        }

        static boolean getHighResolutionOutputSizeshNQ4ISI(android.content.pm.PackageManager packageManager) {
            return packageManager.hasSystemFeature("android.hardware.fingerprint");
        }
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static boolean getHighSpeedVideoSizes(android.content.pm.PackageManager packageManager) {
            return packageManager.hasSystemFeature("android.hardware.biometrics.face");
        }

        static boolean getHighResolutionOutputSizeshNQ4ISI(android.content.pm.PackageManager packageManager) {
            return packageManager.hasSystemFeature("android.hardware.biometrics.iris");
        }
    }
}
