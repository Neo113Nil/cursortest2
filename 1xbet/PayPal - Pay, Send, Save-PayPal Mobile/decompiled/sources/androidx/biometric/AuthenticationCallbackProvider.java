package androidx.biometric;

/* loaded from: classes3.dex */
class AuthenticationCallbackProvider {
    final androidx.biometric.AuthenticationCallbackProvider.Listener getHighResolutionOutputSizeshNQ4ISI;
    android.hardware.biometrics.BiometricPrompt.AuthenticationCallback getHighSpeedVideoFpsRangesFor;
    androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback getHighSpeedVideoSizes;

    static class Listener {
        void Camera2StreamConfigurationMap() {
        }

        void getHighSpeedVideoFpsRanges(int i, java.lang.CharSequence charSequence) {
        }

        void getHighSpeedVideoFpsRangesFor(androidx.biometric.BiometricPrompt.AuthenticationResult authenticationResult) {
        }

        void getHighSpeedVideoFpsRangesFor(java.lang.CharSequence charSequence) {
        }

        Listener() {
        }
    }

    AuthenticationCallbackProvider(androidx.biometric.AuthenticationCallbackProvider.Listener listener) {
        this.getHighResolutionOutputSizeshNQ4ISI = listener;
    }

    static class Api30Impl {
        private Api30Impl() {
        }

        static int h_(android.hardware.biometrics.BiometricPrompt.AuthenticationResult authenticationResult) {
            return authenticationResult.getAuthenticationType();
        }
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static android.hardware.biometrics.BiometricPrompt.AuthenticationCallback f_(final androidx.biometric.AuthenticationCallbackProvider.Listener listener) {
            return new android.hardware.biometrics.BiometricPrompt.AuthenticationCallback() { // from class: androidx.biometric.AuthenticationCallbackProvider.Api28Impl.1
                @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
                public void onAuthenticationHelp(int i, java.lang.CharSequence charSequence) {
                }

                @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
                public void onAuthenticationError(int i, java.lang.CharSequence charSequence) {
                    androidx.biometric.AuthenticationCallbackProvider.Listener.this.getHighSpeedVideoFpsRanges(i, charSequence);
                }

                @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
                public void onAuthenticationSucceeded(android.hardware.biometrics.BiometricPrompt.AuthenticationResult authenticationResult) {
                    int i;
                    androidx.biometric.BiometricPrompt.CryptoObject D_ = authenticationResult != null ? androidx.biometric.CryptoObjectUtils.D_(androidx.biometric.AuthenticationCallbackProvider.Api28Impl.g_(authenticationResult)) : null;
                    if (android.os.Build.VERSION.SDK_INT >= 30) {
                        if (authenticationResult != null) {
                            i = androidx.biometric.AuthenticationCallbackProvider.Api30Impl.h_(authenticationResult);
                        }
                        i = -1;
                    } else {
                        if (android.os.Build.VERSION.SDK_INT != 29) {
                            i = 2;
                        }
                        i = -1;
                    }
                    androidx.biometric.AuthenticationCallbackProvider.Listener.this.getHighSpeedVideoFpsRangesFor(new androidx.biometric.BiometricPrompt.AuthenticationResult(D_, i));
                }

                @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
                public void onAuthenticationFailed() {
                    androidx.biometric.AuthenticationCallbackProvider.Listener.this.Camera2StreamConfigurationMap();
                }
            };
        }

        static android.hardware.biometrics.BiometricPrompt.CryptoObject g_(android.hardware.biometrics.BiometricPrompt.AuthenticationResult authenticationResult) {
            return authenticationResult.getCryptoObject();
        }
    }
}
