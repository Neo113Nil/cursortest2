package androidx.biometric.auth;

/* loaded from: classes5.dex */
public class Class3BiometricOrCredentialAuthPrompt {
    private final androidx.biometric.BiometricPrompt.PromptInfo Camera2StreamConfigurationMap;

    Class3BiometricOrCredentialAuthPrompt(androidx.biometric.BiometricPrompt.PromptInfo promptInfo) {
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

    public java.lang.CharSequence getSubtitle() {
        return this.Camera2StreamConfigurationMap.getSubtitle();
    }

    public java.lang.CharSequence getDescription() {
        return this.Camera2StreamConfigurationMap.getDescription();
    }

    public boolean isConfirmationRequired() {
        return this.Camera2StreamConfigurationMap.isConfirmationRequired();
    }

    public static final class Builder {
        private final java.lang.CharSequence getHighSpeedVideoFpsRangesFor;
        private java.lang.CharSequence getHighSpeedVideoFpsRanges = null;
        private java.lang.CharSequence getHighSpeedVideoSizes = null;
        private boolean Camera2StreamConfigurationMap = true;

        public Builder(java.lang.CharSequence charSequence) {
            this.getHighSpeedVideoFpsRangesFor = charSequence;
        }

        public final androidx.biometric.auth.Class3BiometricOrCredentialAuthPrompt.Builder setSubtitle(java.lang.CharSequence charSequence) {
            this.getHighSpeedVideoFpsRanges = charSequence;
            return this;
        }

        public final androidx.biometric.auth.Class3BiometricOrCredentialAuthPrompt.Builder setDescription(java.lang.CharSequence charSequence) {
            this.getHighSpeedVideoSizes = charSequence;
            return this;
        }

        public final androidx.biometric.auth.Class3BiometricOrCredentialAuthPrompt.Builder setConfirmationRequired(boolean z) {
            this.Camera2StreamConfigurationMap = z;
            return this;
        }

        public final androidx.biometric.auth.Class3BiometricOrCredentialAuthPrompt build() {
            return new androidx.biometric.auth.Class3BiometricOrCredentialAuthPrompt(new androidx.biometric.BiometricPrompt.PromptInfo.Builder().setTitle(this.getHighSpeedVideoFpsRangesFor).setSubtitle(this.getHighSpeedVideoFpsRanges).setDescription(this.getHighSpeedVideoSizes).setConfirmationRequired(this.Camera2StreamConfigurationMap).setAllowedAuthenticators(32783).build());
        }
    }
}
