package androidx.biometric.auth;

/* loaded from: classes5.dex */
public class Class2BiometricOrCredentialAuthPrompt {
    private final androidx.biometric.BiometricPrompt.PromptInfo getHighResolutionOutputSizeshNQ4ISI;

    Class2BiometricOrCredentialAuthPrompt(androidx.biometric.BiometricPrompt.PromptInfo promptInfo) {
        this.getHighResolutionOutputSizeshNQ4ISI = promptInfo;
    }

    public androidx.biometric.auth.AuthPrompt startAuthentication(androidx.biometric.auth.AuthPromptHost authPromptHost, androidx.biometric.auth.AuthPromptCallback authPromptCallback) {
        return androidx.biometric.auth.AuthPromptUtils.getHighSpeedVideoSizes(authPromptHost, this.getHighResolutionOutputSizeshNQ4ISI, null, null, authPromptCallback);
    }

    public androidx.biometric.auth.AuthPrompt startAuthentication(androidx.biometric.auth.AuthPromptHost authPromptHost, java.util.concurrent.Executor executor, androidx.biometric.auth.AuthPromptCallback authPromptCallback) {
        return androidx.biometric.auth.AuthPromptUtils.getHighSpeedVideoSizes(authPromptHost, this.getHighResolutionOutputSizeshNQ4ISI, null, executor, authPromptCallback);
    }

    public java.lang.CharSequence getTitle() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getTitle();
    }

    public java.lang.CharSequence getSubtitle() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getSubtitle();
    }

    public java.lang.CharSequence getDescription() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getDescription();
    }

    public boolean isConfirmationRequired() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isConfirmationRequired();
    }

    public static final class Builder {
        private final java.lang.CharSequence getHighSpeedVideoFpsRanges;
        private java.lang.CharSequence getHighResolutionOutputSizeshNQ4ISI = null;
        private java.lang.CharSequence getHighSpeedVideoSizes = null;
        private boolean getHighSpeedVideoFpsRangesFor = true;

        public Builder(java.lang.CharSequence charSequence) {
            this.getHighSpeedVideoFpsRanges = charSequence;
        }

        public final androidx.biometric.auth.Class2BiometricOrCredentialAuthPrompt.Builder setSubtitle(java.lang.CharSequence charSequence) {
            this.getHighResolutionOutputSizeshNQ4ISI = charSequence;
            return this;
        }

        public final androidx.biometric.auth.Class2BiometricOrCredentialAuthPrompt.Builder setDescription(java.lang.CharSequence charSequence) {
            this.getHighSpeedVideoSizes = charSequence;
            return this;
        }

        public final androidx.biometric.auth.Class2BiometricOrCredentialAuthPrompt.Builder setConfirmationRequired(boolean z) {
            this.getHighSpeedVideoFpsRangesFor = z;
            return this;
        }

        public final androidx.biometric.auth.Class2BiometricOrCredentialAuthPrompt build() {
            return new androidx.biometric.auth.Class2BiometricOrCredentialAuthPrompt(new androidx.biometric.BiometricPrompt.PromptInfo.Builder().setTitle(this.getHighSpeedVideoFpsRanges).setSubtitle(this.getHighResolutionOutputSizeshNQ4ISI).setDescription(this.getHighSpeedVideoSizes).setConfirmationRequired(this.getHighSpeedVideoFpsRangesFor).setAllowedAuthenticators(33023).build());
        }
    }
}
