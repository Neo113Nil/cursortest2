package androidx.biometric.auth;

/* loaded from: classes5.dex */
public class Class2BiometricAuthPrompt {
    private final androidx.biometric.BiometricPrompt.PromptInfo getHighSpeedVideoFpsRanges;

    Class2BiometricAuthPrompt(androidx.biometric.BiometricPrompt.PromptInfo promptInfo) {
        this.getHighSpeedVideoFpsRanges = promptInfo;
    }

    public androidx.biometric.auth.AuthPrompt startAuthentication(androidx.biometric.auth.AuthPromptHost authPromptHost, androidx.biometric.auth.AuthPromptCallback authPromptCallback) {
        return androidx.biometric.auth.AuthPromptUtils.getHighSpeedVideoSizes(authPromptHost, this.getHighSpeedVideoFpsRanges, null, null, authPromptCallback);
    }

    public androidx.biometric.auth.AuthPrompt startAuthentication(androidx.biometric.auth.AuthPromptHost authPromptHost, java.util.concurrent.Executor executor, androidx.biometric.auth.AuthPromptCallback authPromptCallback) {
        return androidx.biometric.auth.AuthPromptUtils.getHighSpeedVideoSizes(authPromptHost, this.getHighSpeedVideoFpsRanges, null, executor, authPromptCallback);
    }

    public java.lang.CharSequence getTitle() {
        return this.getHighSpeedVideoFpsRanges.getTitle();
    }

    public java.lang.CharSequence getNegativeButtonText() {
        return this.getHighSpeedVideoFpsRanges.getTitle();
    }

    public java.lang.CharSequence getSubtitle() {
        return this.getHighSpeedVideoFpsRanges.getSubtitle();
    }

    public java.lang.CharSequence getDescription() {
        return this.getHighSpeedVideoFpsRanges.getDescription();
    }

    public boolean isConfirmationRequired() {
        return this.getHighSpeedVideoFpsRanges.isConfirmationRequired();
    }

    public static final class Builder {
        private final java.lang.CharSequence Camera2StreamConfigurationMap;
        private final java.lang.CharSequence getHighSpeedVideoSizes;
        private java.lang.CharSequence getHighSpeedVideoFpsRanges = null;
        private java.lang.CharSequence getHighResolutionOutputSizeshNQ4ISI = null;
        private boolean getHighSpeedVideoFpsRangesFor = true;

        public Builder(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
            this.getHighSpeedVideoSizes = charSequence;
            this.Camera2StreamConfigurationMap = charSequence2;
        }

        public final androidx.biometric.auth.Class2BiometricAuthPrompt.Builder setSubtitle(java.lang.CharSequence charSequence) {
            this.getHighSpeedVideoFpsRanges = charSequence;
            return this;
        }

        public final androidx.biometric.auth.Class2BiometricAuthPrompt.Builder setDescription(java.lang.CharSequence charSequence) {
            this.getHighResolutionOutputSizeshNQ4ISI = charSequence;
            return this;
        }

        public final androidx.biometric.auth.Class2BiometricAuthPrompt.Builder setConfirmationRequired(boolean z) {
            this.getHighSpeedVideoFpsRangesFor = z;
            return this;
        }

        public final androidx.biometric.auth.Class2BiometricAuthPrompt build() {
            return new androidx.biometric.auth.Class2BiometricAuthPrompt(new androidx.biometric.BiometricPrompt.PromptInfo.Builder().setTitle(this.getHighSpeedVideoSizes).setSubtitle(this.getHighSpeedVideoFpsRanges).setDescription(this.getHighResolutionOutputSizeshNQ4ISI).setNegativeButtonText(this.Camera2StreamConfigurationMap).setConfirmationRequired(this.getHighSpeedVideoFpsRangesFor).setAllowedAuthenticators(255).build());
        }
    }
}
