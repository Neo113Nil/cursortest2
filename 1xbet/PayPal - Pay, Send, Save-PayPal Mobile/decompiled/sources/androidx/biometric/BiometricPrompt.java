package androidx.biometric;

/* loaded from: classes3.dex */
public class BiometricPrompt {
    public static final int AUTHENTICATION_RESULT_TYPE_BIOMETRIC = 2;
    public static final int AUTHENTICATION_RESULT_TYPE_DEVICE_CREDENTIAL = 1;
    public static final int AUTHENTICATION_RESULT_TYPE_UNKNOWN = -1;
    public static final int ERROR_CANCELED = 5;
    public static final int ERROR_HW_NOT_PRESENT = 12;
    public static final int ERROR_HW_UNAVAILABLE = 1;
    public static final int ERROR_LOCKOUT = 7;
    public static final int ERROR_LOCKOUT_PERMANENT = 9;
    public static final int ERROR_NEGATIVE_BUTTON = 13;
    public static final int ERROR_NO_BIOMETRICS = 11;
    public static final int ERROR_NO_DEVICE_CREDENTIAL = 14;
    public static final int ERROR_NO_SPACE = 4;
    public static final int ERROR_SECURITY_UPDATE_REQUIRED = 15;
    public static final int ERROR_TIMEOUT = 3;
    public static final int ERROR_UNABLE_TO_PROCESS = 2;
    public static final int ERROR_USER_CANCELED = 10;
    public static final int ERROR_VENDOR = 8;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private androidx.fragment.app.FragmentManager getHighSpeedVideoFpsRangesFor;

    public static abstract class AuthenticationCallback {
        public void onAuthenticationError(int i, java.lang.CharSequence charSequence) {
        }

        public void onAuthenticationFailed() {
        }

        public void onAuthenticationSucceeded(androidx.biometric.BiometricPrompt.AuthenticationResult authenticationResult) {
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface AuthenticationError {
    }

    public static class CryptoObject {
        private final javax.crypto.Mac Camera2StreamConfigurationMap;
        private final java.security.Signature getHighResolutionOutputSizeshNQ4ISI;
        private final android.security.identity.PresentationSession getHighSpeedVideoFpsRanges;
        private final android.security.identity.IdentityCredential getHighSpeedVideoFpsRangesFor;
        private final javax.crypto.Cipher getHighSpeedVideoSizes;

        public CryptoObject(java.security.Signature signature) {
            this.getHighResolutionOutputSizeshNQ4ISI = signature;
            this.getHighSpeedVideoSizes = null;
            this.Camera2StreamConfigurationMap = null;
            this.getHighSpeedVideoFpsRangesFor = null;
            this.getHighSpeedVideoFpsRanges = null;
        }

        public CryptoObject(javax.crypto.Cipher cipher) {
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            this.getHighSpeedVideoSizes = cipher;
            this.Camera2StreamConfigurationMap = null;
            this.getHighSpeedVideoFpsRangesFor = null;
            this.getHighSpeedVideoFpsRanges = null;
        }

        public CryptoObject(javax.crypto.Mac mac) {
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            this.getHighSpeedVideoSizes = null;
            this.Camera2StreamConfigurationMap = mac;
            this.getHighSpeedVideoFpsRangesFor = null;
            this.getHighSpeedVideoFpsRanges = null;
        }

        public CryptoObject(android.security.identity.IdentityCredential identityCredential) {
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            this.getHighSpeedVideoSizes = null;
            this.Camera2StreamConfigurationMap = null;
            this.getHighSpeedVideoFpsRangesFor = identityCredential;
            this.getHighSpeedVideoFpsRanges = null;
        }

        public CryptoObject(android.security.identity.PresentationSession presentationSession) {
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            this.getHighSpeedVideoSizes = null;
            this.Camera2StreamConfigurationMap = null;
            this.getHighSpeedVideoFpsRangesFor = null;
            this.getHighSpeedVideoFpsRanges = presentationSession;
        }

        public java.security.Signature getSignature() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public javax.crypto.Cipher getCipher() {
            return this.getHighSpeedVideoSizes;
        }

        public javax.crypto.Mac getMac() {
            return this.Camera2StreamConfigurationMap;
        }

        public android.security.identity.IdentityCredential getIdentityCredential() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public android.security.identity.PresentationSession getPresentationSession() {
            return this.getHighSpeedVideoFpsRanges;
        }
    }

    public static class AuthenticationResult {
        private final int Camera2StreamConfigurationMap;
        private final androidx.biometric.BiometricPrompt.CryptoObject getHighSpeedVideoFpsRanges;

        AuthenticationResult(androidx.biometric.BiometricPrompt.CryptoObject cryptoObject, int i) {
            this.getHighSpeedVideoFpsRanges = cryptoObject;
            this.Camera2StreamConfigurationMap = i;
        }

        public androidx.biometric.BiometricPrompt.CryptoObject getCryptoObject() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public int getAuthenticationType() {
            return this.Camera2StreamConfigurationMap;
        }
    }

    public static class PromptInfo {
        private final boolean Camera2StreamConfigurationMap;
        private final java.lang.CharSequence getHighResolutionOutputSizeshNQ4ISI;
        private final boolean getHighSpeedVideoFpsRanges;
        private final java.lang.CharSequence getHighSpeedVideoFpsRangesFor;
        private final int getHighSpeedVideoSizes;
        private final java.lang.CharSequence getHighSpeedVideoSizesFor;
        private final java.lang.CharSequence getInputFormats;

        public static class Builder {
            private java.lang.CharSequence getHighSpeedVideoSizesFor = null;
            private java.lang.CharSequence getOutputFormats = null;
            private java.lang.CharSequence getHighSpeedVideoFpsRanges = null;
            private java.lang.CharSequence Camera2StreamConfigurationMap = null;
            private boolean getHighSpeedVideoFpsRangesFor = true;
            private boolean getHighSpeedVideoSizes = false;
            private int getHighResolutionOutputSizeshNQ4ISI = 0;

            public androidx.biometric.BiometricPrompt.PromptInfo.Builder setTitle(java.lang.CharSequence charSequence) {
                this.getHighSpeedVideoSizesFor = charSequence;
                return this;
            }

            public androidx.biometric.BiometricPrompt.PromptInfo.Builder setSubtitle(java.lang.CharSequence charSequence) {
                this.getOutputFormats = charSequence;
                return this;
            }

            public androidx.biometric.BiometricPrompt.PromptInfo.Builder setDescription(java.lang.CharSequence charSequence) {
                this.getHighSpeedVideoFpsRanges = charSequence;
                return this;
            }

            public androidx.biometric.BiometricPrompt.PromptInfo.Builder setNegativeButtonText(java.lang.CharSequence charSequence) {
                this.Camera2StreamConfigurationMap = charSequence;
                return this;
            }

            public androidx.biometric.BiometricPrompt.PromptInfo.Builder setConfirmationRequired(boolean z) {
                this.getHighSpeedVideoFpsRangesFor = z;
                return this;
            }

            @java.lang.Deprecated
            public androidx.biometric.BiometricPrompt.PromptInfo.Builder setDeviceCredentialAllowed(boolean z) {
                this.getHighSpeedVideoSizes = z;
                return this;
            }

            public androidx.biometric.BiometricPrompt.PromptInfo.Builder setAllowedAuthenticators(int i) {
                this.getHighResolutionOutputSizeshNQ4ISI = i;
                return this;
            }

            public androidx.biometric.BiometricPrompt.PromptInfo build() {
                boolean z;
                if (android.text.TextUtils.isEmpty(this.getHighSpeedVideoSizesFor)) {
                    throw new java.lang.IllegalArgumentException("Title must be set and non-empty.");
                }
                if (!androidx.biometric.AuthenticatorUtils.getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI)) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Authenticator combination is unsupported on API ");
                    sb.append(android.os.Build.VERSION.SDK_INT);
                    sb.append(": ");
                    sb.append(androidx.biometric.AuthenticatorUtils.getHighSpeedVideoFpsRanges(this.getHighResolutionOutputSizeshNQ4ISI));
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
                int i = this.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    z = androidx.biometric.AuthenticatorUtils.Camera2StreamConfigurationMap(i);
                } else {
                    z = this.getHighSpeedVideoSizes;
                }
                if (android.text.TextUtils.isEmpty(this.Camera2StreamConfigurationMap) && !z) {
                    throw new java.lang.IllegalArgumentException("Negative text must be set and non-empty.");
                }
                if (!android.text.TextUtils.isEmpty(this.Camera2StreamConfigurationMap) && z) {
                    throw new java.lang.IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
                }
                return new androidx.biometric.BiometricPrompt.PromptInfo(this.getHighSpeedVideoSizesFor, this.getOutputFormats, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
            }
        }

        PromptInfo(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, java.lang.CharSequence charSequence4, boolean z, boolean z2, int i) {
            this.getHighSpeedVideoSizesFor = charSequence;
            this.getInputFormats = charSequence2;
            this.getHighSpeedVideoFpsRangesFor = charSequence3;
            this.getHighResolutionOutputSizeshNQ4ISI = charSequence4;
            this.getHighSpeedVideoFpsRanges = z;
            this.Camera2StreamConfigurationMap = z2;
            this.getHighSpeedVideoSizes = i;
        }

        public java.lang.CharSequence getTitle() {
            return this.getHighSpeedVideoSizesFor;
        }

        public java.lang.CharSequence getSubtitle() {
            return this.getInputFormats;
        }

        public java.lang.CharSequence getDescription() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public java.lang.CharSequence getNegativeButtonText() {
            java.lang.CharSequence charSequence = this.getHighResolutionOutputSizeshNQ4ISI;
            return charSequence != null ? charSequence : "";
        }

        public boolean isConfirmationRequired() {
            return this.getHighSpeedVideoFpsRanges;
        }

        @java.lang.Deprecated
        public boolean isDeviceCredentialAllowed() {
            return this.Camera2StreamConfigurationMap;
        }

        public int getAllowedAuthenticators() {
            return this.getHighSpeedVideoSizes;
        }
    }

    /* loaded from: classes5.dex */
    static class ResetCallbackObserver implements androidx.view.DefaultLifecycleObserver {
        private final java.lang.ref.WeakReference<androidx.biometric.BiometricViewModel> getHighSpeedVideoSizes;

        ResetCallbackObserver(androidx.biometric.BiometricViewModel biometricViewModel) {
            this.getHighSpeedVideoSizes = new java.lang.ref.WeakReference<>(biometricViewModel);
        }

        @Override // androidx.view.DefaultLifecycleObserver
        public void onDestroy(androidx.view.LifecycleOwner lifecycleOwner) {
            if (this.getHighSpeedVideoSizes.get() != null) {
                this.getHighSpeedVideoSizes.get().getHighSpeedVideoSizesFor = null;
            }
        }
    }

    public BiometricPrompt(androidx.fragment.app.FragmentActivity fragmentActivity, androidx.biometric.BiometricPrompt.AuthenticationCallback authenticationCallback) {
        if (fragmentActivity == null) {
            throw new java.lang.IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (authenticationCallback == null) {
            throw new java.lang.IllegalArgumentException("AuthenticationCallback must not be null.");
        }
        androidx.fragment.app.FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        androidx.biometric.BiometricViewModel biometricViewModel = (androidx.biometric.BiometricViewModel) new androidx.view.ViewModelProvider(fragmentActivity).get(androidx.biometric.BiometricViewModel.class);
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        this.getHighSpeedVideoFpsRangesFor = supportFragmentManager;
        biometricViewModel.getHighSpeedVideoSizesFor = authenticationCallback;
    }

    public BiometricPrompt(androidx.fragment.app.Fragment fragment, androidx.biometric.BiometricPrompt.AuthenticationCallback authenticationCallback) {
        if (fragment == null) {
            throw new java.lang.IllegalArgumentException("Fragment must not be null.");
        }
        if (authenticationCallback == null) {
            throw new java.lang.IllegalArgumentException("AuthenticationCallback must not be null.");
        }
        androidx.fragment.app.FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        androidx.biometric.BiometricViewModel biometricViewModel = (androidx.biometric.BiometricViewModel) new androidx.view.ViewModelProvider(fragment).get(androidx.biometric.BiometricViewModel.class);
        fragment.getLifecycle().addObserver(new androidx.biometric.BiometricPrompt.ResetCallbackObserver(biometricViewModel));
        this.getHighResolutionOutputSizeshNQ4ISI = false;
        this.getHighSpeedVideoFpsRangesFor = childFragmentManager;
        biometricViewModel.getHighSpeedVideoSizesFor = authenticationCallback;
    }

    public BiometricPrompt(androidx.fragment.app.FragmentActivity fragmentActivity, java.util.concurrent.Executor executor, androidx.biometric.BiometricPrompt.AuthenticationCallback authenticationCallback) {
        if (fragmentActivity == null) {
            throw new java.lang.IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor == null) {
            throw new java.lang.IllegalArgumentException("Executor must not be null.");
        }
        if (authenticationCallback == null) {
            throw new java.lang.IllegalArgumentException("AuthenticationCallback must not be null.");
        }
        androidx.fragment.app.FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        androidx.biometric.BiometricViewModel biometricViewModel = (androidx.biometric.BiometricViewModel) new androidx.view.ViewModelProvider(fragmentActivity).get(androidx.biometric.BiometricViewModel.class);
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        this.getHighSpeedVideoFpsRangesFor = supportFragmentManager;
        if (executor != null) {
            biometricViewModel.getOutputFormats = executor;
        }
        biometricViewModel.getHighSpeedVideoSizesFor = authenticationCallback;
    }

    public BiometricPrompt(androidx.fragment.app.Fragment fragment, java.util.concurrent.Executor executor, androidx.biometric.BiometricPrompt.AuthenticationCallback authenticationCallback) {
        if (fragment == null) {
            throw new java.lang.IllegalArgumentException("Fragment must not be null.");
        }
        if (executor == null) {
            throw new java.lang.IllegalArgumentException("Executor must not be null.");
        }
        if (authenticationCallback == null) {
            throw new java.lang.IllegalArgumentException("AuthenticationCallback must not be null.");
        }
        androidx.fragment.app.FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        androidx.biometric.BiometricViewModel biometricViewModel = (androidx.biometric.BiometricViewModel) new androidx.view.ViewModelProvider(fragment).get(androidx.biometric.BiometricViewModel.class);
        fragment.getLifecycle().addObserver(new androidx.biometric.BiometricPrompt.ResetCallbackObserver(biometricViewModel));
        this.getHighResolutionOutputSizeshNQ4ISI = false;
        this.getHighSpeedVideoFpsRangesFor = childFragmentManager;
        if (executor != null) {
            biometricViewModel.getOutputFormats = executor;
        }
        biometricViewModel.getHighSpeedVideoSizesFor = authenticationCallback;
    }

    public void authenticate(androidx.biometric.BiometricPrompt.PromptInfo promptInfo, androidx.biometric.BiometricPrompt.CryptoObject cryptoObject) {
        if (promptInfo == null) {
            throw new java.lang.IllegalArgumentException("PromptInfo cannot be null.");
        }
        if (cryptoObject == null) {
            throw new java.lang.IllegalArgumentException("CryptoObject cannot be null.");
        }
        int Camera2StreamConfigurationMap = androidx.biometric.AuthenticatorUtils.Camera2StreamConfigurationMap(promptInfo, cryptoObject);
        if (androidx.biometric.AuthenticatorUtils.getOutputMinFrameDuration(Camera2StreamConfigurationMap)) {
            throw new java.lang.IllegalArgumentException("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
        }
        if (android.os.Build.VERSION.SDK_INT < 30 && androidx.biometric.AuthenticatorUtils.Camera2StreamConfigurationMap(Camera2StreamConfigurationMap)) {
            throw new java.lang.IllegalArgumentException("Crypto-based authentication is not supported for device credential prior to API 30.");
        }
        Camera2StreamConfigurationMap(promptInfo, cryptoObject);
    }

    public void authenticate(androidx.biometric.BiometricPrompt.PromptInfo promptInfo) {
        if (promptInfo == null) {
            throw new java.lang.IllegalArgumentException("PromptInfo cannot be null.");
        }
        Camera2StreamConfigurationMap(promptInfo, null);
    }

    private void Camera2StreamConfigurationMap(androidx.biometric.BiometricPrompt.PromptInfo promptInfo, androidx.biometric.BiometricPrompt.CryptoObject cryptoObject) {
        androidx.fragment.app.FragmentManager fragmentManager = this.getHighSpeedVideoFpsRangesFor;
        if (fragmentManager == null || fragmentManager.isStateSaved()) {
            return;
        }
        androidx.biometric.BiometricFragment biometricFragment = (androidx.biometric.BiometricFragment) this.getHighSpeedVideoFpsRangesFor.findFragmentByTag("androidx.biometric.BiometricFragment");
        if (biometricFragment == null) {
            biometricFragment = androidx.biometric.BiometricFragment.Camera2StreamConfigurationMap(this.getHighResolutionOutputSizeshNQ4ISI);
            this.getHighSpeedVideoFpsRangesFor.beginTransaction().add(biometricFragment, "androidx.biometric.BiometricFragment").commitAllowingStateLoss();
            this.getHighSpeedVideoFpsRangesFor.executePendingTransactions();
        }
        biometricFragment.getHighResolutionOutputSizeshNQ4ISI._CREATION = promptInfo;
        int Camera2StreamConfigurationMap = androidx.biometric.AuthenticatorUtils.Camera2StreamConfigurationMap(promptInfo, cryptoObject);
        if (android.os.Build.VERSION.SDK_INT < 30 && Camera2StreamConfigurationMap == 15 && cryptoObject == null) {
            biometricFragment.getHighResolutionOutputSizeshNQ4ISI.getInputFormats = androidx.biometric.CryptoObjectUtils.getHighSpeedVideoFpsRangesFor();
        } else {
            biometricFragment.getHighResolutionOutputSizeshNQ4ISI.getInputFormats = cryptoObject;
        }
        if (biometricFragment.getHighSpeedVideoFpsRanges()) {
            biometricFragment.getHighResolutionOutputSizeshNQ4ISI.ArtificialStackFrames = biometricFragment.getString(androidx.biometric.R.string.confirm_device_credential_password);
        } else {
            biometricFragment.getHighResolutionOutputSizeshNQ4ISI.ArtificialStackFrames = null;
        }
        android.content.Context context = biometricFragment.getContext();
        if ((android.os.Build.VERSION.SDK_INT == 29 && !biometricFragment.getArguments().getBoolean("has_fingerprint", androidx.biometric.PackageUtils.getHighSpeedVideoFpsRanges(biometricFragment.getContext())) && !biometricFragment.getArguments().getBoolean("has_face", androidx.biometric.PackageUtils.getHighSpeedVideoFpsRangesFor(biometricFragment.getContext())) && !biometricFragment.getArguments().getBoolean("has_iris", androidx.biometric.PackageUtils.getHighResolutionOutputSizeshNQ4ISI(biometricFragment.getContext()))) || (biometricFragment.getHighSpeedVideoFpsRanges() && androidx.biometric.BiometricManager.from(context).canAuthenticate(255) != 0)) {
            biometricFragment.getHighResolutionOutputSizeshNQ4ISI.getOutputSizes = true;
            biometricFragment.getHighResolutionOutputSizeshNQ4ISI();
        } else if (biometricFragment.getHighResolutionOutputSizeshNQ4ISI.isOutputSupportedForhNQ4ISI) {
            biometricFragment.getHighSpeedVideoFpsRanges.postDelayed(new androidx.biometric.BiometricFragment.ShowPromptForAuthenticationRunnable(biometricFragment), 600L);
        } else {
            biometricFragment.getHighSpeedVideoFpsRangesFor();
        }
    }

    public void cancelAuthentication() {
        androidx.biometric.BiometricFragment biometricFragment;
        androidx.fragment.app.FragmentManager fragmentManager = this.getHighSpeedVideoFpsRangesFor;
        if (fragmentManager == null || (biometricFragment = (androidx.biometric.BiometricFragment) fragmentManager.findFragmentByTag("androidx.biometric.BiometricFragment")) == null) {
            return;
        }
        biometricFragment.getHighSpeedVideoFpsRangesFor(3);
    }

    static androidx.biometric.BiometricViewModel getHighSpeedVideoSizes(androidx.fragment.app.Fragment fragment, boolean z) {
        androidx.view.ViewModelStoreOwner activity = z ? fragment.getActivity() : null;
        if (activity == null) {
            activity = fragment.getParentFragment();
        }
        if (activity == null) {
            throw new java.lang.IllegalStateException("view model not found");
        }
        return (androidx.biometric.BiometricViewModel) new androidx.view.ViewModelProvider(activity).get(androidx.biometric.BiometricViewModel.class);
    }
}
