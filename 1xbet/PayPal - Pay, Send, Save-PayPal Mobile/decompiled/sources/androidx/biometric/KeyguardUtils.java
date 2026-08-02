package androidx.biometric;

/* loaded from: classes3.dex */
class KeyguardUtils {
    private KeyguardUtils() {
    }

    static android.app.KeyguardManager getHighSpeedVideoSizes(android.content.Context context) {
        return androidx.biometric.KeyguardUtils.Api23Impl.Camera2StreamConfigurationMap(context);
    }

    static class Api23Impl {
        private Api23Impl() {
        }

        static android.app.KeyguardManager Camera2StreamConfigurationMap(android.content.Context context) {
            return (android.app.KeyguardManager) context.getSystemService(android.app.KeyguardManager.class);
        }

        static boolean getHighSpeedVideoFpsRangesFor(android.app.KeyguardManager keyguardManager) {
            return keyguardManager.isDeviceSecure();
        }
    }

    /* loaded from: classes5.dex */
    static class Api16Impl {
        private Api16Impl() {
        }
    }

    static boolean getHighSpeedVideoFpsRangesFor(android.content.Context context) {
        android.app.KeyguardManager Camera2StreamConfigurationMap = androidx.biometric.KeyguardUtils.Api23Impl.Camera2StreamConfigurationMap(context);
        if (Camera2StreamConfigurationMap == null) {
            return false;
        }
        return androidx.biometric.KeyguardUtils.Api23Impl.getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap);
    }
}
