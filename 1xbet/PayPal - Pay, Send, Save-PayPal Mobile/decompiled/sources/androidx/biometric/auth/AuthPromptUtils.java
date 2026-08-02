package androidx.biometric.auth;

/* loaded from: classes5.dex */
class AuthPromptUtils {
    private AuthPromptUtils() {
    }

    static class AuthPromptWrapper implements androidx.biometric.auth.AuthPrompt {
        private final java.lang.ref.WeakReference<androidx.biometric.BiometricPrompt> getHighSpeedVideoFpsRanges;

        AuthPromptWrapper(androidx.biometric.BiometricPrompt biometricPrompt) {
            this.getHighSpeedVideoFpsRanges = new java.lang.ref.WeakReference<>(biometricPrompt);
        }

        @Override // androidx.biometric.auth.AuthPrompt
        public void cancelAuthentication() {
            if (this.getHighSpeedVideoFpsRanges.get() != null) {
                this.getHighSpeedVideoFpsRanges.get().cancelAuthentication();
            }
        }
    }

    static class DefaultExecutor implements java.util.concurrent.Executor {
        private final android.os.Handler getHighSpeedVideoFpsRanges = new android.os.Handler(android.os.Looper.getMainLooper());

        DefaultExecutor() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable runnable) {
            this.getHighSpeedVideoFpsRanges.post(runnable);
        }
    }

    static class AuthenticationCallbackWrapper extends androidx.biometric.BiometricPrompt.AuthenticationCallback {
        private final androidx.biometric.auth.AuthPromptCallback Camera2StreamConfigurationMap;
        private final java.lang.ref.WeakReference<androidx.biometric.BiometricViewModel> getHighSpeedVideoSizes;

        AuthenticationCallbackWrapper(androidx.biometric.auth.AuthPromptCallback authPromptCallback, androidx.biometric.BiometricViewModel biometricViewModel) {
            this.Camera2StreamConfigurationMap = authPromptCallback;
            this.getHighSpeedVideoSizes = new java.lang.ref.WeakReference<>(biometricViewModel);
        }

        @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
        public void onAuthenticationError(int i, java.lang.CharSequence charSequence) {
            androidx.biometric.auth.AuthPromptCallback authPromptCallback = this.Camera2StreamConfigurationMap;
            java.lang.ref.WeakReference<androidx.biometric.BiometricViewModel> weakReference = this.getHighSpeedVideoSizes;
            authPromptCallback.onAuthenticationError(weakReference.get() != null ? weakReference.get().getClientActivity() : null, i, charSequence);
        }

        @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
        public void onAuthenticationSucceeded(androidx.biometric.BiometricPrompt.AuthenticationResult authenticationResult) {
            androidx.biometric.auth.AuthPromptCallback authPromptCallback = this.Camera2StreamConfigurationMap;
            java.lang.ref.WeakReference<androidx.biometric.BiometricViewModel> weakReference = this.getHighSpeedVideoSizes;
            authPromptCallback.onAuthenticationSucceeded(weakReference.get() != null ? weakReference.get().getClientActivity() : null, authenticationResult);
        }

        @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
        public void onAuthenticationFailed() {
            androidx.biometric.auth.AuthPromptCallback authPromptCallback = this.Camera2StreamConfigurationMap;
            java.lang.ref.WeakReference<androidx.biometric.BiometricViewModel> weakReference = this.getHighSpeedVideoSizes;
            authPromptCallback.onAuthenticationFailed(weakReference.get() != null ? weakReference.get().getClientActivity() : null);
        }
    }

    static androidx.biometric.auth.AuthPrompt getHighSpeedVideoSizes(androidx.biometric.auth.AuthPromptHost authPromptHost, androidx.biometric.BiometricPrompt.PromptInfo promptInfo, androidx.biometric.BiometricPrompt.CryptoObject cryptoObject, java.util.concurrent.Executor executor, androidx.biometric.auth.AuthPromptCallback authPromptCallback) {
        androidx.biometric.BiometricPrompt biometricPrompt;
        if (executor == null) {
            executor = new androidx.biometric.auth.AuthPromptUtils.DefaultExecutor();
        }
        if (authPromptHost.getActivity() == null) {
            if (authPromptHost.getFragment() == null || authPromptHost.getFragment().getActivity() == null) {
                throw new java.lang.IllegalArgumentException("AuthPromptHost must contain a FragmentActivity or an attached Fragment.");
            }
            biometricPrompt = new androidx.biometric.BiometricPrompt(authPromptHost.getFragment(), executor, new androidx.biometric.auth.AuthPromptUtils.AuthenticationCallbackWrapper(authPromptCallback, (androidx.biometric.BiometricViewModel) new androidx.view.ViewModelProvider(authPromptHost.getFragment().getActivity()).get(androidx.biometric.BiometricViewModel.class)));
        } else {
            biometricPrompt = new androidx.biometric.BiometricPrompt(authPromptHost.getActivity(), executor, new androidx.biometric.auth.AuthPromptUtils.AuthenticationCallbackWrapper(authPromptCallback, (androidx.biometric.BiometricViewModel) new androidx.view.ViewModelProvider(authPromptHost.getActivity()).get(androidx.biometric.BiometricViewModel.class)));
        }
        if (cryptoObject == null) {
            biometricPrompt.authenticate(promptInfo);
        } else {
            biometricPrompt.authenticate(promptInfo, cryptoObject);
        }
        return new androidx.biometric.auth.AuthPromptUtils.AuthPromptWrapper(biometricPrompt);
    }
}
