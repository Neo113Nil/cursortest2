package androidx.biometric;

/* loaded from: classes3.dex */
public class BiometricManager {
    public static final int BIOMETRIC_ERROR_HW_UNAVAILABLE = 1;
    public static final int BIOMETRIC_ERROR_NONE_ENROLLED = 11;
    public static final int BIOMETRIC_ERROR_NO_HARDWARE = 12;
    public static final int BIOMETRIC_ERROR_SECURITY_UPDATE_REQUIRED = 15;
    public static final int BIOMETRIC_ERROR_UNSUPPORTED = -2;
    public static final int BIOMETRIC_STATUS_UNKNOWN = -1;
    public static final int BIOMETRIC_SUCCESS = 0;
    private final androidx.biometric.BiometricManager.Injector Camera2StreamConfigurationMap;
    private final androidx.core.hardware.fingerprint.FingerprintManagerCompat getHighSpeedVideoFpsRanges;
    private final android.hardware.biometrics.BiometricManager getHighSpeedVideoSizes;

    /* loaded from: classes5.dex */
    public interface Authenticators {
        public static final int BIOMETRIC_STRONG = 15;
        public static final int BIOMETRIC_WEAK = 255;
        public static final int DEVICE_CREDENTIAL = 32768;
    }

    interface Injector {
        android.hardware.biometrics.BiometricManager C_();

        boolean Camera2StreamConfigurationMap();

        boolean getHighResolutionOutputSizeshNQ4ISI();

        androidx.core.hardware.fingerprint.FingerprintManagerCompat getHighSpeedVideoFpsRanges();

        android.content.res.Resources getHighSpeedVideoFpsRangesFor();

        boolean getHighSpeedVideoSizesFor();

        boolean getInputFormats();

        boolean getOutputFormats();

        boolean getOutputMinFrameDuration();
    }

    /* loaded from: classes5.dex */
    public static class Strings {
        private final android.hardware.biometrics.BiometricManager.Strings getHighResolutionOutputSizeshNQ4ISI;
        private final androidx.biometric.BiometricManager.StringsCompat getHighSpeedVideoFpsRanges;

        Strings(android.hardware.biometrics.BiometricManager.Strings strings) {
            this.getHighResolutionOutputSizeshNQ4ISI = strings;
            this.getHighSpeedVideoFpsRanges = null;
        }

        Strings(androidx.biometric.BiometricManager.StringsCompat stringsCompat) {
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            this.getHighSpeedVideoFpsRanges = stringsCompat;
        }

        public java.lang.CharSequence getButtonLabel() {
            android.hardware.biometrics.BiometricManager.Strings strings;
            if (android.os.Build.VERSION.SDK_INT >= 31 && (strings = this.getHighResolutionOutputSizeshNQ4ISI) != null) {
                return androidx.biometric.BiometricManager.Api31Impl.w_(strings);
            }
            androidx.biometric.BiometricManager.StringsCompat stringsCompat = this.getHighSpeedVideoFpsRanges;
            if (stringsCompat != null) {
                return stringsCompat.getHighSpeedVideoSizes();
            }
            return null;
        }

        public java.lang.CharSequence getPromptMessage() {
            android.hardware.biometrics.BiometricManager.Strings strings;
            if (android.os.Build.VERSION.SDK_INT >= 31 && (strings = this.getHighResolutionOutputSizeshNQ4ISI) != null) {
                return androidx.biometric.BiometricManager.Api31Impl.x_(strings);
            }
            androidx.biometric.BiometricManager.StringsCompat stringsCompat = this.getHighSpeedVideoFpsRanges;
            if (stringsCompat != null) {
                return stringsCompat.Camera2StreamConfigurationMap();
            }
            return null;
        }

        public java.lang.CharSequence getSettingName() {
            android.hardware.biometrics.BiometricManager.Strings strings;
            if (android.os.Build.VERSION.SDK_INT >= 31 && (strings = this.getHighResolutionOutputSizeshNQ4ISI) != null) {
                return androidx.biometric.BiometricManager.Api31Impl.y_(strings);
            }
            androidx.biometric.BiometricManager.StringsCompat stringsCompat = this.getHighSpeedVideoFpsRanges;
            if (stringsCompat != null) {
                return stringsCompat.getHighSpeedVideoFpsRangesFor();
            }
            return null;
        }
    }

    /* loaded from: classes5.dex */
    class StringsCompat {
        private final int Camera2StreamConfigurationMap;
        private final android.content.res.Resources getHighSpeedVideoFpsRanges;
        private final int getHighSpeedVideoFpsRangesFor;

        StringsCompat(android.content.res.Resources resources, int i, boolean z, boolean z2, boolean z3, boolean z4) {
            this.getHighSpeedVideoFpsRanges = resources;
            this.getHighSpeedVideoFpsRangesFor = i;
            int i2 = (z4 && androidx.biometric.AuthenticatorUtils.Camera2StreamConfigurationMap(i)) ? 1 : 0;
            if (androidx.biometric.AuthenticatorUtils.getHighSpeedVideoSizes(i)) {
                i2 = z ? i2 | 4 : i2;
                i2 = z2 ? i2 | 8 : i2;
                if (z3) {
                    i2 |= 2;
                }
            }
            this.Camera2StreamConfigurationMap = i2;
        }

        java.lang.CharSequence getHighSpeedVideoSizes() {
            if (androidx.biometric.BiometricManager.this.canAuthenticate(androidx.biometric.AuthenticatorUtils.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor)) == 0) {
                int i = this.Camera2StreamConfigurationMap & (-2);
                if (i == 4) {
                    return this.getHighSpeedVideoFpsRanges.getString(androidx.biometric.R.string.use_fingerprint_label);
                }
                if (i == 8) {
                    return this.getHighSpeedVideoFpsRanges.getString(androidx.biometric.R.string.use_face_label);
                }
                return this.getHighSpeedVideoFpsRanges.getString(androidx.biometric.R.string.use_biometric_label);
            }
            if ((this.Camera2StreamConfigurationMap & 1) != 0) {
                return this.getHighSpeedVideoFpsRanges.getString(androidx.biometric.R.string.use_screen_lock_label);
            }
            return null;
        }

        java.lang.CharSequence Camera2StreamConfigurationMap() {
            int i;
            if (androidx.biometric.BiometricManager.this.canAuthenticate(androidx.biometric.AuthenticatorUtils.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor)) == 0) {
                int i2 = this.Camera2StreamConfigurationMap & (-2);
                if (i2 != 4) {
                    if (i2 == 8) {
                        if (androidx.biometric.AuthenticatorUtils.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor)) {
                            i = androidx.biometric.R.string.face_or_screen_lock_prompt_message;
                        } else {
                            i = androidx.biometric.R.string.face_prompt_message;
                        }
                    } else if (androidx.biometric.AuthenticatorUtils.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor)) {
                        i = androidx.biometric.R.string.biometric_or_screen_lock_prompt_message;
                    } else {
                        i = androidx.biometric.R.string.biometric_prompt_message;
                    }
                } else if (androidx.biometric.AuthenticatorUtils.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor)) {
                    i = androidx.biometric.R.string.fingerprint_or_screen_lock_prompt_message;
                } else {
                    i = androidx.biometric.R.string.fingerprint_prompt_message;
                }
                return this.getHighSpeedVideoFpsRanges.getString(i);
            }
            if ((this.Camera2StreamConfigurationMap & 1) != 0) {
                return this.getHighSpeedVideoFpsRanges.getString(androidx.biometric.R.string.screen_lock_prompt_message);
            }
            return null;
        }

        java.lang.CharSequence getHighSpeedVideoFpsRangesFor() {
            int i = this.Camera2StreamConfigurationMap;
            if (i == 0) {
                return null;
            }
            if (i == 1) {
                return this.getHighSpeedVideoFpsRanges.getString(androidx.biometric.R.string.use_screen_lock_label);
            }
            if (i == 2) {
                return this.getHighSpeedVideoFpsRanges.getString(androidx.biometric.R.string.use_biometric_label);
            }
            if (i == 4) {
                return this.getHighSpeedVideoFpsRanges.getString(androidx.biometric.R.string.use_fingerprint_label);
            }
            if (i == 8) {
                return this.getHighSpeedVideoFpsRanges.getString(androidx.biometric.R.string.use_face_label);
            }
            if ((i & 1) == 0) {
                return this.getHighSpeedVideoFpsRanges.getString(androidx.biometric.R.string.use_biometric_label);
            }
            int i2 = i & (-2);
            if (i2 == 4) {
                return this.getHighSpeedVideoFpsRanges.getString(androidx.biometric.R.string.use_fingerprint_or_screen_lock_label);
            }
            if (i2 == 8) {
                return this.getHighSpeedVideoFpsRanges.getString(androidx.biometric.R.string.use_face_or_screen_lock_label);
            }
            return this.getHighSpeedVideoFpsRanges.getString(androidx.biometric.R.string.use_biometric_or_screen_lock_label);
        }
    }

    static class DefaultInjector implements androidx.biometric.BiometricManager.Injector {
        private final android.content.Context getHighSpeedVideoFpsRanges;

        DefaultInjector(android.content.Context context) {
            this.getHighSpeedVideoFpsRanges = context.getApplicationContext();
        }

        @Override // androidx.biometric.BiometricManager.Injector
        public final android.content.res.Resources getHighSpeedVideoFpsRangesFor() {
            return this.getHighSpeedVideoFpsRanges.getResources();
        }

        @Override // androidx.biometric.BiometricManager.Injector
        public final android.hardware.biometrics.BiometricManager C_() {
            return androidx.biometric.BiometricManager.Api29Impl.u_(this.getHighSpeedVideoFpsRanges);
        }

        @Override // androidx.biometric.BiometricManager.Injector
        public final androidx.core.hardware.fingerprint.FingerprintManagerCompat getHighSpeedVideoFpsRanges() {
            return androidx.core.hardware.fingerprint.FingerprintManagerCompat.from(this.getHighSpeedVideoFpsRanges);
        }

        @Override // androidx.biometric.BiometricManager.Injector
        public final boolean getHighResolutionOutputSizeshNQ4ISI() {
            return androidx.biometric.KeyguardUtils.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges) != null;
        }

        @Override // androidx.biometric.BiometricManager.Injector
        public final boolean Camera2StreamConfigurationMap() {
            return androidx.biometric.KeyguardUtils.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges);
        }

        @Override // androidx.biometric.BiometricManager.Injector
        public final boolean getOutputFormats() {
            return androidx.biometric.PackageUtils.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges);
        }

        @Override // androidx.biometric.BiometricManager.Injector
        public final boolean getHighSpeedVideoSizesFor() {
            return androidx.biometric.PackageUtils.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges);
        }

        @Override // androidx.biometric.BiometricManager.Injector
        public final boolean getOutputMinFrameDuration() {
            return androidx.biometric.PackageUtils.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges);
        }

        @Override // androidx.biometric.BiometricManager.Injector
        public final boolean getInputFormats() {
            return androidx.biometric.DeviceUtils.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges, android.os.Build.MODEL);
        }
    }

    public static androidx.biometric.BiometricManager from(android.content.Context context) {
        return new androidx.biometric.BiometricManager(new androidx.biometric.BiometricManager.DefaultInjector(context));
    }

    private BiometricManager(androidx.biometric.BiometricManager.Injector injector) {
        this.Camera2StreamConfigurationMap = injector;
        this.getHighSpeedVideoSizes = android.os.Build.VERSION.SDK_INT >= 29 ? injector.C_() : null;
        this.getHighSpeedVideoFpsRanges = android.os.Build.VERSION.SDK_INT <= 29 ? injector.getHighSpeedVideoFpsRanges() : null;
    }

    @java.lang.Deprecated
    public int canAuthenticate() {
        return canAuthenticate(255);
    }

    public int canAuthenticate(int i) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            android.hardware.biometrics.BiometricManager biometricManager = this.getHighSpeedVideoSizes;
            if (biometricManager == null) {
                return 1;
            }
            return androidx.biometric.BiometricManager.Api30Impl.v_(biometricManager, i);
        }
        if (!androidx.biometric.AuthenticatorUtils.getHighResolutionOutputSizeshNQ4ISI(i)) {
            return -2;
        }
        if (i == 0 || !this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI()) {
            return 12;
        }
        if (androidx.biometric.AuthenticatorUtils.Camera2StreamConfigurationMap(i)) {
            return this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap() ? 0 : 11;
        }
        if (android.os.Build.VERSION.SDK_INT == 29) {
            if (!androidx.biometric.AuthenticatorUtils.getOutputMinFrameDuration(i)) {
                return Camera2StreamConfigurationMap();
            }
            android.hardware.biometrics.BiometricManager biometricManager2 = this.getHighSpeedVideoSizes;
            if (biometricManager2 == null) {
                return 1;
            }
            return androidx.biometric.BiometricManager.Api29Impl.t_(biometricManager2);
        }
        if (android.os.Build.VERSION.SDK_INT == 28) {
            if (!this.Camera2StreamConfigurationMap.getOutputFormats()) {
                return 12;
            }
            if (this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap()) {
                return getHighSpeedVideoSizes() == 0 ? 0 : -1;
            }
            return getHighSpeedVideoSizes();
        }
        return getHighSpeedVideoSizes();
    }

    private int Camera2StreamConfigurationMap() {
        android.hardware.biometrics.BiometricPrompt.CryptoObject E_;
        java.lang.reflect.Method highSpeedVideoSizes = androidx.biometric.BiometricManager.Api29Impl.getHighSpeedVideoSizes();
        if (highSpeedVideoSizes != null && (E_ = androidx.biometric.CryptoObjectUtils.E_(androidx.biometric.CryptoObjectUtils.getHighSpeedVideoFpsRangesFor())) != null) {
            try {
                java.lang.Object invoke = android.os.Build.VERSION.SDK_INT == 29 ? highSpeedVideoSizes.invoke(this.getHighSpeedVideoSizes, E_) : null;
                if (invoke instanceof java.lang.Integer) {
                    return ((java.lang.Integer) invoke).intValue();
                }
            } catch (java.lang.IllegalAccessException | java.lang.IllegalArgumentException | java.lang.reflect.InvocationTargetException unused) {
            }
        }
        android.hardware.biometrics.BiometricManager biometricManager = this.getHighSpeedVideoSizes;
        int t_ = biometricManager == null ? 1 : androidx.biometric.BiometricManager.Api29Impl.t_(biometricManager);
        if (this.Camera2StreamConfigurationMap.getInputFormats() || t_ != 0) {
            return t_;
        }
        if (this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap()) {
            return getHighSpeedVideoSizes() == 0 ? 0 : -1;
        }
        return getHighSpeedVideoSizes();
    }

    private int getHighSpeedVideoSizes() {
        androidx.core.hardware.fingerprint.FingerprintManagerCompat fingerprintManagerCompat = this.getHighSpeedVideoFpsRanges;
        if (fingerprintManagerCompat == null) {
            return 1;
        }
        if (fingerprintManagerCompat.isHardwareDetected()) {
            return !this.getHighSpeedVideoFpsRanges.hasEnrolledFingerprints() ? 11 : 0;
        }
        return 12;
    }

    public androidx.biometric.BiometricManager.Strings getStrings(int i) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            if (this.getHighSpeedVideoSizes == null) {
                return null;
            }
            return new androidx.biometric.BiometricManager.Strings(androidx.biometric.BiometricManager.Api31Impl.z_(this.getHighSpeedVideoSizes, i));
        }
        return new androidx.biometric.BiometricManager.Strings(new androidx.biometric.BiometricManager.StringsCompat(this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(), i, this.Camera2StreamConfigurationMap.getOutputFormats(), this.Camera2StreamConfigurationMap.getHighSpeedVideoSizesFor(), this.Camera2StreamConfigurationMap.getOutputMinFrameDuration(), this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap()));
    }

    /* loaded from: classes5.dex */
    static class Api31Impl {
        private Api31Impl() {
        }

        static android.hardware.biometrics.BiometricManager.Strings z_(android.hardware.biometrics.BiometricManager biometricManager, int i) {
            return biometricManager.getStrings(i);
        }

        static java.lang.CharSequence w_(android.hardware.biometrics.BiometricManager.Strings strings) {
            return strings.getButtonLabel();
        }

        static java.lang.CharSequence x_(android.hardware.biometrics.BiometricManager.Strings strings) {
            return strings.getPromptMessage();
        }

        static java.lang.CharSequence y_(android.hardware.biometrics.BiometricManager.Strings strings) {
            return strings.getSettingName();
        }
    }

    static class Api30Impl {
        private Api30Impl() {
        }

        static int v_(android.hardware.biometrics.BiometricManager biometricManager, int i) {
            return biometricManager.canAuthenticate(i);
        }
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static android.hardware.biometrics.BiometricManager u_(android.content.Context context) {
            return (android.hardware.biometrics.BiometricManager) context.getSystemService(android.hardware.biometrics.BiometricManager.class);
        }

        static int t_(android.hardware.biometrics.BiometricManager biometricManager) {
            return biometricManager.canAuthenticate();
        }

        static java.lang.reflect.Method getHighSpeedVideoSizes() {
            try {
                return android.hardware.biometrics.BiometricManager.class.getMethod("canAuthenticate", android.hardware.biometrics.BiometricPrompt.CryptoObject.class);
            } catch (java.lang.NoSuchMethodException unused) {
                return null;
            }
        }
    }
}
