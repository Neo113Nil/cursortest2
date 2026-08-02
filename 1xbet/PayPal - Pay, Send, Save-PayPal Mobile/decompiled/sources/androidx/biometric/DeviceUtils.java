package androidx.biometric;

/* loaded from: classes3.dex */
class DeviceUtils {
    private DeviceUtils() {
    }

    static boolean getHighSpeedVideoFpsRanges(android.content.Context context, java.lang.String str, java.lang.String str2) {
        if (android.os.Build.VERSION.SDK_INT != 28) {
            return false;
        }
        return getHighResolutionOutputSizeshNQ4ISI(context, str, androidx.biometric.R.array.crypto_fingerprint_fallback_vendors) || getHighSpeedVideoFpsRangesFor(context, str2, androidx.biometric.R.array.crypto_fingerprint_fallback_prefixes);
    }

    static boolean getHighResolutionOutputSizeshNQ4ISI(android.content.Context context, java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT != 28) {
            return false;
        }
        return getHighSpeedVideoFpsRangesFor(context, str, androidx.biometric.R.array.hide_fingerprint_instantly_prefixes);
    }

    static boolean getHighSpeedVideoFpsRanges(android.content.Context context, java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT != 29) {
            return false;
        }
        return Camera2StreamConfigurationMap(context, str, androidx.biometric.R.array.delay_showing_prompt_models);
    }

    static boolean getHighSpeedVideoFpsRangesFor(android.content.Context context, java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            return false;
        }
        return Camera2StreamConfigurationMap(context, str, androidx.biometric.R.array.assume_strong_biometrics_models);
    }

    static boolean Camera2StreamConfigurationMap(android.content.Context context, java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT != 29) {
            return false;
        }
        return !getHighResolutionOutputSizeshNQ4ISI(context, str, androidx.biometric.R.array.keyguard_biometric_and_credential_exclude_vendors);
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI(android.content.Context context, java.lang.String str, int i) {
        if (str == null) {
            return false;
        }
        for (java.lang.String str2 : context.getResources().getStringArray(i)) {
            if (str.equalsIgnoreCase(str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean getHighSpeedVideoFpsRangesFor(android.content.Context context, java.lang.String str, int i) {
        if (str == null) {
            return false;
        }
        for (java.lang.String str2 : context.getResources().getStringArray(i)) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean Camera2StreamConfigurationMap(android.content.Context context, java.lang.String str, int i) {
        if (str == null) {
            return false;
        }
        for (java.lang.String str2 : context.getResources().getStringArray(i)) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }
}
