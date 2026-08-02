package androidx.biometric.auth;

/* loaded from: classes5.dex */
public class Class3BiometricAuthPrompt {
    private final androidx.biometric.BiometricPrompt.PromptInfo getHighSpeedVideoSizes;

    Class3BiometricAuthPrompt(androidx.biometric.BiometricPrompt.PromptInfo promptInfo) {
        this.getHighSpeedVideoSizes = promptInfo;
    }

    public androidx.biometric.auth.AuthPrompt startAuthentication(androidx.biometric.auth.AuthPromptHost authPromptHost, androidx.biometric.BiometricPrompt.CryptoObject cryptoObject, androidx.biometric.auth.AuthPromptCallback authPromptCallback) {
        return androidx.biometric.auth.AuthPromptUtils.getHighSpeedVideoSizes(authPromptHost, this.getHighSpeedVideoSizes, cryptoObject, null, authPromptCallback);
    }

    public androidx.biometric.auth.AuthPrompt startAuthentication(androidx.biometric.auth.AuthPromptHost authPromptHost, androidx.biometric.BiometricPrompt.CryptoObject cryptoObject, java.util.concurrent.Executor executor, androidx.biometric.auth.AuthPromptCallback authPromptCallback) {
        return androidx.biometric.auth.AuthPromptUtils.getHighSpeedVideoSizes(authPromptHost, this.getHighSpeedVideoSizes, cryptoObject, executor, authPromptCallback);
    }

    public java.lang.CharSequence getTitle() {
        return this.getHighSpeedVideoSizes.getTitle();
    }

    public java.lang.CharSequence getNegativeButtonText() {
        return this.getHighSpeedVideoSizes.getTitle();
    }

    public java.lang.CharSequence getSubtitle() {
        return this.getHighSpeedVideoSizes.getSubtitle();
    }

    public java.lang.CharSequence getDescription() {
        return this.getHighSpeedVideoSizes.getDescription();
    }

    public boolean isConfirmationRequired() {
        return this.getHighSpeedVideoSizes.isConfirmationRequired();
    }

    public static final class Builder {
        private final java.lang.CharSequence getHighSpeedVideoFpsRanges;
        private final java.lang.CharSequence getHighSpeedVideoFpsRangesFor;
        private java.lang.CharSequence getHighSpeedVideoSizes = null;
        private java.lang.CharSequence Camera2StreamConfigurationMap = null;
        private boolean getHighResolutionOutputSizeshNQ4ISI = true;

        public Builder(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
            this.getHighSpeedVideoFpsRangesFor = charSequence;
            this.getHighSpeedVideoFpsRanges = charSequence2;
        }

        public final androidx.biometric.auth.Class3BiometricAuthPrompt.Builder setSubtitle(java.lang.CharSequence charSequence) {
            this.getHighSpeedVideoSizes = charSequence;
            return this;
        }

        public final androidx.biometric.auth.Class3BiometricAuthPrompt.Builder setDescription(java.lang.CharSequence charSequence) {
            this.Camera2StreamConfigurationMap = charSequence;
            return this;
        }

        public final androidx.biometric.auth.Class3BiometricAuthPrompt.Builder setConfirmationRequired(boolean z) {
            this.getHighResolutionOutputSizeshNQ4ISI = z;
            return this;
        }

        public final androidx.biometric.auth.Class3BiometricAuthPrompt build() {
            return new androidx.biometric.auth.Class3BiometricAuthPrompt(new androidx.biometric.BiometricPrompt.PromptInfo.Builder().setTitle(this.getHighSpeedVideoFpsRangesFor).setSubtitle(this.getHighSpeedVideoSizes).setDescription(this.Camera2StreamConfigurationMap).setNegativeButtonText(this.getHighSpeedVideoFpsRanges).setConfirmationRequired(this.getHighResolutionOutputSizeshNQ4ISI).setAllowedAuthenticators(15).build());
        }
    }
}
