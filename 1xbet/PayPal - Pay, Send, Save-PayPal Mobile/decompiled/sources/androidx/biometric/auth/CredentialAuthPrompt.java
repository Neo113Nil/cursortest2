package androidx.biometric.auth;

/* loaded from: classes5.dex */
public class CredentialAuthPrompt {
    private final androidx.biometric.BiometricPrompt.PromptInfo Camera2StreamConfigurationMap;

    CredentialAuthPrompt(androidx.biometric.BiometricPrompt.PromptInfo promptInfo) {
        this.Camera2StreamConfigurationMap = promptInfo;
    }

    public androidx.biometric.auth.AuthPrompt startAuthentication(androidx.biometric.auth.AuthPromptHost authPromptHost, androidx.biometric.BiometricPrompt.CryptoObject cryptoObject, androidx.biometric.auth.AuthPromptCallback authPromptCallback) {
        return androidx.biometric.auth.AuthPromptUtils.getHighSpeedVideoSizes(authPromptHost, this.Camera2StreamConfigurationMap, cryptoObject, null, authPromptCallback);
    }

    public androidx.biometric.auth.AuthPrompt startAuthentication(androidx.biometric.auth.AuthPromptHost authPromptHost, androidx.biometric.BiometricPrompt.CryptoObject cryptoObject, java.util.concurrent.Executor executor, androidx.biometric.auth.AuthPromptCallback authPromptCallback) {
        return androidx.biometric.auth.AuthPromptUtils.getHighSpeedVideoSizes(authPromptHost, this.Camera2StreamConfigurationMap, cryptoObject, executor, authPromptCallback);
    }

    public java.lang.CharSequence getTitle() {
        return this.Camera2StreamConfigurationMap.getTitle();
    }

    public java.lang.CharSequence getDescription() {
        return this.Camera2StreamConfigurationMap.getDescription();
    }

    public static final class Builder {
        private final java.lang.CharSequence Camera2StreamConfigurationMap;
        private java.lang.CharSequence getHighSpeedVideoFpsRanges = null;

        public Builder(java.lang.CharSequence charSequence) {
            this.Camera2StreamConfigurationMap = charSequence;
        }

        public final androidx.biometric.auth.CredentialAuthPrompt.Builder setDescription(java.lang.CharSequence charSequence) {
            this.getHighSpeedVideoFpsRanges = charSequence;
            return this;
        }

        public final androidx.biometric.auth.CredentialAuthPrompt build() {
            return new androidx.biometric.auth.CredentialAuthPrompt(new androidx.biometric.BiometricPrompt.PromptInfo.Builder().setTitle(this.Camera2StreamConfigurationMap).setDescription(this.getHighSpeedVideoFpsRanges).setAllowedAuthenticators(32768).build());
        }
    }
}
