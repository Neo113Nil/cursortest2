package androidx.biometric;

import androidx.biometric.BiometricViewModel.AnonymousClass1;

/* loaded from: classes3.dex */
public class BiometricFragment extends androidx.fragment.app.Fragment {
    androidx.biometric.BiometricViewModel getHighResolutionOutputSizeshNQ4ISI;
    android.os.Handler getHighSpeedVideoFpsRanges = new android.os.Handler(android.os.Looper.getMainLooper());

    static class PromptExecutor implements java.util.concurrent.Executor {
        private final android.os.Handler getHighSpeedVideoFpsRanges = new android.os.Handler(android.os.Looper.getMainLooper());

        PromptExecutor() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable runnable) {
            this.getHighSpeedVideoFpsRanges.post(runnable);
        }
    }

    static class ShowPromptForAuthenticationRunnable implements java.lang.Runnable {
        private final java.lang.ref.WeakReference<androidx.biometric.BiometricFragment> getHighSpeedVideoFpsRanges;

        ShowPromptForAuthenticationRunnable(androidx.biometric.BiometricFragment biometricFragment) {
            this.getHighSpeedVideoFpsRanges = new java.lang.ref.WeakReference<>(biometricFragment);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.getHighSpeedVideoFpsRanges.get() != null) {
                this.getHighSpeedVideoFpsRanges.get().getHighSpeedVideoFpsRangesFor();
            }
        }
    }

    static class StopDelayingPromptRunnable implements java.lang.Runnable {
        private final java.lang.ref.WeakReference<androidx.biometric.BiometricViewModel> getHighSpeedVideoFpsRangesFor;

        StopDelayingPromptRunnable(androidx.biometric.BiometricViewModel biometricViewModel) {
            this.getHighSpeedVideoFpsRangesFor = new java.lang.ref.WeakReference<>(biometricViewModel);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.getHighSpeedVideoFpsRangesFor.get() != null) {
                this.getHighSpeedVideoFpsRangesFor.get().isOutputSupportedForhNQ4ISI = false;
            }
        }
    }

    static class StopIgnoringCancelRunnable implements java.lang.Runnable {
        private final java.lang.ref.WeakReference<androidx.biometric.BiometricViewModel> getHighResolutionOutputSizeshNQ4ISI;

        StopIgnoringCancelRunnable(androidx.biometric.BiometricViewModel biometricViewModel) {
            this.getHighResolutionOutputSizeshNQ4ISI = new java.lang.ref.WeakReference<>(biometricViewModel);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.getHighResolutionOutputSizeshNQ4ISI.get() != null) {
                this.getHighResolutionOutputSizeshNQ4ISI.get().toString = false;
            }
        }
    }

    static androidx.biometric.BiometricFragment Camera2StreamConfigurationMap(boolean z) {
        androidx.biometric.BiometricFragment biometricFragment = new androidx.biometric.BiometricFragment();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("host_activity", z);
        biometricFragment.setArguments(bundle);
        return biometricFragment;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = androidx.biometric.BiometricPrompt.getHighSpeedVideoSizes(this, getArguments().getBoolean("host_activity", true));
        }
        this.getHighResolutionOutputSizeshNQ4ISI.getOutputMinFrameDuration = new java.lang.ref.WeakReference<>(getActivity());
        androidx.biometric.BiometricViewModel biometricViewModel = this.getHighResolutionOutputSizeshNQ4ISI;
        if (biometricViewModel.Camera2StreamConfigurationMap == null) {
            biometricViewModel.Camera2StreamConfigurationMap = new androidx.view.MutableLiveData<>();
        }
        biometricViewModel.Camera2StreamConfigurationMap.observe(this, new androidx.view.Observer() { // from class: androidx.biometric.BiometricFragment$$ExternalSyntheticLambda5
            @Override // androidx.view.Observer
            public final void onChanged(java.lang.Object obj) {
                androidx.biometric.BiometricFragment biometricFragment = androidx.biometric.BiometricFragment.this;
                androidx.biometric.BiometricPrompt.AuthenticationResult authenticationResult = (androidx.biometric.BiometricPrompt.AuthenticationResult) obj;
                if (authenticationResult != null) {
                    biometricFragment.getHighSpeedVideoFpsRangesFor(authenticationResult);
                    biometricFragment.Camera2StreamConfigurationMap();
                    androidx.biometric.BiometricViewModel biometricViewModel2 = biometricFragment.getHighResolutionOutputSizeshNQ4ISI;
                    if (biometricViewModel2.Camera2StreamConfigurationMap == null) {
                        biometricViewModel2.Camera2StreamConfigurationMap = new androidx.view.MutableLiveData<>();
                    }
                    androidx.biometric.BiometricViewModel.getHighSpeedVideoSizes(biometricViewModel2.Camera2StreamConfigurationMap, null);
                }
            }
        });
        androidx.biometric.BiometricViewModel biometricViewModel2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (biometricViewModel2.getHighSpeedVideoFpsRanges == null) {
            biometricViewModel2.getHighSpeedVideoFpsRanges = new androidx.view.MutableLiveData<>();
        }
        biometricViewModel2.getHighSpeedVideoFpsRanges.observe(this, new androidx.view.Observer() { // from class: androidx.biometric.BiometricFragment$$ExternalSyntheticLambda6
            /* JADX WARN: Removed duplicated region for block: B:21:0x00c1  */
            @Override // androidx.view.Observer
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onChanged(java.lang.Object obj) {
                androidx.biometric.BiometricViewModel biometricViewModel3;
                final androidx.biometric.BiometricFragment biometricFragment = androidx.biometric.BiometricFragment.this;
                androidx.biometric.BiometricErrorData biometricErrorData = (androidx.biometric.BiometricErrorData) obj;
                if (biometricErrorData != null) {
                    final int i = biometricErrorData.Camera2StreamConfigurationMap;
                    final java.lang.CharSequence charSequence = biometricErrorData.getHighResolutionOutputSizeshNQ4ISI;
                    if (!androidx.biometric.ErrorUtils.getHighSpeedVideoSizes(i)) {
                        i = 8;
                    }
                    android.content.Context context = biometricFragment.getContext();
                    if (android.os.Build.VERSION.SDK_INT < 29 && androidx.biometric.ErrorUtils.getHighResolutionOutputSizeshNQ4ISI(i) && context != null && androidx.biometric.KeyguardUtils.getHighSpeedVideoFpsRangesFor(context)) {
                        androidx.biometric.BiometricViewModel biometricViewModel4 = biometricFragment.getHighResolutionOutputSizeshNQ4ISI;
                        androidx.biometric.BiometricPrompt.PromptInfo promptInfo = biometricViewModel4._CREATION;
                        if (androidx.biometric.AuthenticatorUtils.Camera2StreamConfigurationMap(promptInfo != null ? androidx.biometric.AuthenticatorUtils.Camera2StreamConfigurationMap(promptInfo, biometricViewModel4.getInputFormats) : 0)) {
                            biometricFragment.getHighResolutionOutputSizeshNQ4ISI();
                            biometricViewModel3 = biometricFragment.getHighResolutionOutputSizeshNQ4ISI;
                            if (biometricViewModel3.getHighSpeedVideoFpsRanges == null) {
                                biometricViewModel3.getHighSpeedVideoFpsRanges = new androidx.view.MutableLiveData<>();
                            }
                            androidx.biometric.BiometricViewModel.getHighSpeedVideoSizes(biometricViewModel3.getHighSpeedVideoFpsRanges, null);
                        }
                    }
                    if (biometricFragment.getHighSpeedVideoSizes()) {
                        if (charSequence == null) {
                            charSequence = androidx.biometric.ErrorUtils.getHighSpeedVideoFpsRangesFor(biometricFragment.getContext(), i);
                        }
                        if (i == 5) {
                            int i2 = biometricFragment.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
                            if (i2 == 0 || i2 == 3) {
                                biometricFragment.getHighSpeedVideoFpsRanges(i, charSequence);
                            }
                            biometricFragment.Camera2StreamConfigurationMap();
                        } else {
                            if (biometricFragment.getHighResolutionOutputSizeshNQ4ISI.isOutputSupportedFor) {
                                biometricFragment.getHighSpeedVideoFpsRanges(i, charSequence);
                                biometricFragment.Camera2StreamConfigurationMap();
                            } else {
                                biometricFragment.getHighSpeedVideoSizes(charSequence);
                                android.os.Handler handler = biometricFragment.getHighSpeedVideoFpsRanges;
                                java.lang.Runnable runnable = new java.lang.Runnable() { // from class: androidx.biometric.BiometricFragment$$ExternalSyntheticLambda2
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        androidx.biometric.BiometricFragment biometricFragment2 = androidx.biometric.BiometricFragment.this;
                                        biometricFragment2.getHighSpeedVideoFpsRanges(i, charSequence);
                                        biometricFragment2.Camera2StreamConfigurationMap();
                                    }
                                };
                                android.content.Context context2 = biometricFragment.getContext();
                                handler.postDelayed(runnable, (context2 == null || !androidx.biometric.DeviceUtils.getHighResolutionOutputSizeshNQ4ISI(context2, android.os.Build.MODEL)) ? 2000 : 0);
                            }
                            biometricFragment.getHighResolutionOutputSizeshNQ4ISI.isOutputSupportedFor = true;
                        }
                    } else {
                        if (charSequence == null) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            sb.append(biometricFragment.getString(androidx.biometric.R.string.default_error_msg));
                            sb.append(" ");
                            sb.append(i);
                            charSequence = sb.toString();
                        }
                        biometricFragment.getHighSpeedVideoFpsRanges(i, charSequence);
                        biometricFragment.Camera2StreamConfigurationMap();
                    }
                    biometricViewModel3 = biometricFragment.getHighResolutionOutputSizeshNQ4ISI;
                    if (biometricViewModel3.getHighSpeedVideoFpsRanges == null) {
                    }
                    androidx.biometric.BiometricViewModel.getHighSpeedVideoSizes(biometricViewModel3.getHighSpeedVideoFpsRanges, null);
                }
            }
        });
        androidx.biometric.BiometricViewModel biometricViewModel3 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (biometricViewModel3.getHighResolutionOutputSizeshNQ4ISI == null) {
            biometricViewModel3.getHighResolutionOutputSizeshNQ4ISI = new androidx.view.MutableLiveData<>();
        }
        biometricViewModel3.getHighResolutionOutputSizeshNQ4ISI.observe(this, new androidx.view.Observer() { // from class: androidx.biometric.BiometricFragment$$ExternalSyntheticLambda7
            @Override // androidx.view.Observer
            public final void onChanged(java.lang.Object obj) {
                androidx.biometric.BiometricFragment biometricFragment = androidx.biometric.BiometricFragment.this;
                java.lang.CharSequence charSequence = (java.lang.CharSequence) obj;
                if (charSequence != null) {
                    if (biometricFragment.getHighSpeedVideoSizes()) {
                        biometricFragment.getHighSpeedVideoSizes(charSequence);
                    }
                    androidx.biometric.BiometricViewModel biometricViewModel4 = biometricFragment.getHighResolutionOutputSizeshNQ4ISI;
                    if (biometricViewModel4.getHighSpeedVideoFpsRanges == null) {
                        biometricViewModel4.getHighSpeedVideoFpsRanges = new androidx.view.MutableLiveData<>();
                    }
                    androidx.biometric.BiometricViewModel.getHighSpeedVideoSizes(biometricViewModel4.getHighSpeedVideoFpsRanges, null);
                }
            }
        });
        androidx.biometric.BiometricViewModel biometricViewModel4 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (biometricViewModel4.getOutputStallDurationlomOqCM == null) {
            biometricViewModel4.getOutputStallDurationlomOqCM = new androidx.view.MutableLiveData<>();
        }
        biometricViewModel4.getOutputStallDurationlomOqCM.observe(this, new androidx.view.Observer() { // from class: androidx.biometric.BiometricFragment$$ExternalSyntheticLambda8
            @Override // androidx.view.Observer
            public final void onChanged(java.lang.Object obj) {
                final androidx.biometric.BiometricFragment biometricFragment = androidx.biometric.BiometricFragment.this;
                if (((java.lang.Boolean) obj).booleanValue()) {
                    if (biometricFragment.getHighSpeedVideoSizes()) {
                        biometricFragment.getHighSpeedVideoSizes(biometricFragment.getString(androidx.biometric.R.string.fingerprint_not_recognized));
                    }
                    if (biometricFragment.getHighResolutionOutputSizeshNQ4ISI.getOutputSizes) {
                        java.util.concurrent.Executor executor = biometricFragment.getHighResolutionOutputSizeshNQ4ISI.getOutputFormats;
                        if (executor == null) {
                            executor = new androidx.biometric.BiometricViewModel.DefaultExecutor();
                        }
                        executor.execute(new java.lang.Runnable() { // from class: androidx.biometric.BiometricFragment$$ExternalSyntheticLambda0
                            @Override // java.lang.Runnable
                            public final void run() {
                                androidx.biometric.BiometricViewModel biometricViewModel5 = androidx.biometric.BiometricFragment.this.getHighResolutionOutputSizeshNQ4ISI;
                                if (biometricViewModel5.getHighSpeedVideoSizesFor == null) {
                                    biometricViewModel5.getHighSpeedVideoSizesFor = biometricViewModel5.new AnonymousClass1();
                                }
                                biometricViewModel5.getHighSpeedVideoSizesFor.onAuthenticationFailed();
                            }
                        });
                    }
                    androidx.biometric.BiometricViewModel biometricViewModel5 = biometricFragment.getHighResolutionOutputSizeshNQ4ISI;
                    if (biometricViewModel5.getOutputStallDurationlomOqCM == null) {
                        biometricViewModel5.getOutputStallDurationlomOqCM = new androidx.view.MutableLiveData<>();
                    }
                    androidx.biometric.BiometricViewModel.getHighSpeedVideoSizes(biometricViewModel5.getOutputStallDurationlomOqCM, java.lang.Boolean.FALSE);
                }
            }
        });
        androidx.biometric.BiometricViewModel biometricViewModel5 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (biometricViewModel5.coroutineCreation == null) {
            biometricViewModel5.coroutineCreation = new androidx.view.MutableLiveData<>();
        }
        biometricViewModel5.coroutineCreation.observe(this, new androidx.view.Observer() { // from class: androidx.biometric.BiometricFragment$$ExternalSyntheticLambda9
            @Override // androidx.view.Observer
            public final void onChanged(java.lang.Object obj) {
                androidx.biometric.BiometricFragment biometricFragment = androidx.biometric.BiometricFragment.this;
                if (((java.lang.Boolean) obj).booleanValue()) {
                    if (biometricFragment.getHighSpeedVideoFpsRanges()) {
                        biometricFragment.getHighResolutionOutputSizeshNQ4ISI();
                    } else {
                        androidx.biometric.BiometricViewModel biometricViewModel6 = biometricFragment.getHighResolutionOutputSizeshNQ4ISI;
                        java.lang.CharSequence charSequence = biometricViewModel6.ArtificialStackFrames;
                        if (charSequence == null) {
                            androidx.biometric.BiometricPrompt.PromptInfo promptInfo = biometricViewModel6._CREATION;
                            charSequence = promptInfo != null ? promptInfo.getNegativeButtonText() : null;
                        }
                        if (charSequence == null) {
                            charSequence = biometricFragment.getString(androidx.biometric.R.string.default_error_msg);
                        }
                        biometricFragment.getHighSpeedVideoFpsRanges(13, charSequence);
                        biometricFragment.Camera2StreamConfigurationMap();
                        biometricFragment.getHighSpeedVideoFpsRangesFor(2);
                    }
                    androidx.biometric.BiometricViewModel biometricViewModel7 = biometricFragment.getHighResolutionOutputSizeshNQ4ISI;
                    if (biometricViewModel7.coroutineCreation == null) {
                        biometricViewModel7.coroutineCreation = new androidx.view.MutableLiveData<>();
                    }
                    androidx.biometric.BiometricViewModel.getHighSpeedVideoSizes(biometricViewModel7.coroutineCreation, java.lang.Boolean.FALSE);
                }
            }
        });
        androidx.biometric.BiometricViewModel biometricViewModel6 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (biometricViewModel6.getValidOutputFormatsForInputhNQ4ISI == null) {
            biometricViewModel6.getValidOutputFormatsForInputhNQ4ISI = new androidx.view.MutableLiveData<>();
        }
        biometricViewModel6.getValidOutputFormatsForInputhNQ4ISI.observe(this, new androidx.view.Observer() { // from class: androidx.biometric.BiometricFragment$$ExternalSyntheticLambda10
            @Override // androidx.view.Observer
            public final void onChanged(java.lang.Object obj) {
                androidx.biometric.BiometricFragment biometricFragment = androidx.biometric.BiometricFragment.this;
                if (((java.lang.Boolean) obj).booleanValue()) {
                    biometricFragment.getHighSpeedVideoFpsRangesFor(1);
                    biometricFragment.Camera2StreamConfigurationMap();
                    androidx.biometric.BiometricViewModel biometricViewModel7 = biometricFragment.getHighResolutionOutputSizeshNQ4ISI;
                    if (biometricViewModel7.getValidOutputFormatsForInputhNQ4ISI == null) {
                        biometricViewModel7.getValidOutputFormatsForInputhNQ4ISI = new androidx.view.MutableLiveData<>();
                    }
                    androidx.biometric.BiometricViewModel.getHighSpeedVideoSizes(biometricViewModel7.getValidOutputFormatsForInputhNQ4ISI, java.lang.Boolean.FALSE);
                }
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (android.os.Build.VERSION.SDK_INT == 29) {
            androidx.biometric.BiometricViewModel biometricViewModel = this.getHighResolutionOutputSizeshNQ4ISI;
            androidx.biometric.BiometricPrompt.PromptInfo promptInfo = biometricViewModel._CREATION;
            if (androidx.biometric.AuthenticatorUtils.Camera2StreamConfigurationMap(promptInfo != null ? androidx.biometric.AuthenticatorUtils.Camera2StreamConfigurationMap(promptInfo, biometricViewModel.getInputFormats) : 0)) {
                this.getHighResolutionOutputSizeshNQ4ISI.toString = true;
                this.getHighSpeedVideoFpsRanges.postDelayed(new androidx.biometric.BiometricFragment.StopIgnoringCancelRunnable(this.getHighResolutionOutputSizeshNQ4ISI), 250L);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        if (android.os.Build.VERSION.SDK_INT >= 29 || this.getHighResolutionOutputSizeshNQ4ISI.unwrapAs) {
            return;
        }
        androidx.fragment.app.FragmentActivity activity = getActivity();
        if (activity == null || !activity.isChangingConfigurations()) {
            getHighSpeedVideoFpsRangesFor(0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, android.content.Intent intent) {
        super.onActivityResult(i, i2, intent);
        int i3 = 1;
        if (i == 1) {
            this.getHighResolutionOutputSizeshNQ4ISI.unwrapAs = false;
            if (i2 == -1) {
                if (this.getHighResolutionOutputSizeshNQ4ISI.CoroutineDebuggingKt) {
                    this.getHighResolutionOutputSizeshNQ4ISI.CoroutineDebuggingKt = false;
                    i3 = -1;
                }
                getHighSpeedVideoFpsRangesFor(new androidx.biometric.BiometricPrompt.AuthenticationResult(null, i3));
                Camera2StreamConfigurationMap();
                return;
            }
            getHighSpeedVideoFpsRanges(10, getString(androidx.biometric.R.string.generic_error_user_canceled));
            Camera2StreamConfigurationMap();
        }
    }

    final void getHighSpeedVideoFpsRangesFor() {
        java.lang.String str;
        int i;
        if (this.getHighResolutionOutputSizeshNQ4ISI.coroutineBoundary || getContext() == null) {
            return;
        }
        this.getHighResolutionOutputSizeshNQ4ISI.coroutineBoundary = true;
        this.getHighResolutionOutputSizeshNQ4ISI.getOutputSizes = true;
        android.content.Context context = getContext();
        if (context != null && androidx.biometric.DeviceUtils.Camera2StreamConfigurationMap(context, android.os.Build.MANUFACTURER)) {
            androidx.biometric.BiometricViewModel biometricViewModel = this.getHighResolutionOutputSizeshNQ4ISI;
            androidx.biometric.BiometricPrompt.PromptInfo promptInfo = biometricViewModel._CREATION;
            int Camera2StreamConfigurationMap = promptInfo != null ? androidx.biometric.AuthenticatorUtils.Camera2StreamConfigurationMap(promptInfo, biometricViewModel.getInputFormats) : 0;
            if (androidx.biometric.AuthenticatorUtils.getOutputMinFrameDuration(Camera2StreamConfigurationMap) && androidx.biometric.AuthenticatorUtils.Camera2StreamConfigurationMap(Camera2StreamConfigurationMap)) {
                this.getHighResolutionOutputSizeshNQ4ISI.CoroutineDebuggingKt = true;
                getHighResolutionOutputSizeshNQ4ISI();
                return;
            }
        }
        if (getHighSpeedVideoSizes()) {
            android.content.Context applicationContext = requireContext().getApplicationContext();
            androidx.core.hardware.fingerprint.FingerprintManagerCompat from = androidx.core.hardware.fingerprint.FingerprintManagerCompat.from(applicationContext);
            if (from.isHardwareDetected()) {
                i = !from.hasEnrolledFingerprints() ? 11 : 0;
            } else {
                i = 12;
            }
            if (i == 0) {
                if (isAdded()) {
                    this.getHighResolutionOutputSizeshNQ4ISI.isOutputSupportedFor = true;
                    if (!androidx.biometric.DeviceUtils.getHighResolutionOutputSizeshNQ4ISI(applicationContext, android.os.Build.MODEL)) {
                        this.getHighSpeedVideoFpsRanges.postDelayed(new java.lang.Runnable() { // from class: androidx.biometric.BiometricFragment$$ExternalSyntheticLambda3
                            @Override // java.lang.Runnable
                            public final void run() {
                                androidx.biometric.BiometricFragment.this.getHighResolutionOutputSizeshNQ4ISI.isOutputSupportedFor = false;
                            }
                        }, 500L);
                        androidx.biometric.FingerprintDialogFragment.getHighSpeedVideoFpsRangesFor(getArguments().getBoolean("host_activity", true)).show(getParentFragmentManager(), "androidx.biometric.FingerprintDialogFragment");
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes = 0;
                    androidx.core.hardware.fingerprint.FingerprintManagerCompat.CryptoObject highSpeedVideoFpsRangesFor = androidx.biometric.CryptoObjectUtils.getHighSpeedVideoFpsRangesFor(this.getHighResolutionOutputSizeshNQ4ISI.getInputFormats);
                    androidx.biometric.BiometricViewModel biometricViewModel2 = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (biometricViewModel2.getInputSizeshNQ4ISI == null) {
                        biometricViewModel2.getInputSizeshNQ4ISI = new androidx.biometric.CancellationSignalProvider();
                    }
                    androidx.biometric.CancellationSignalProvider cancellationSignalProvider = biometricViewModel2.getInputSizeshNQ4ISI;
                    if (cancellationSignalProvider.getHighSpeedVideoFpsRangesFor == null) {
                        cancellationSignalProvider.getHighSpeedVideoFpsRangesFor = cancellationSignalProvider.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor();
                    }
                    androidx.core.os.CancellationSignal cancellationSignal = cancellationSignalProvider.getHighSpeedVideoFpsRangesFor;
                    androidx.biometric.BiometricViewModel biometricViewModel3 = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (biometricViewModel3.getHighSpeedVideoFpsRangesFor == null) {
                        biometricViewModel3.getHighSpeedVideoFpsRangesFor = new androidx.biometric.AuthenticationCallbackProvider(new androidx.biometric.BiometricViewModel.CallbackListener(biometricViewModel3));
                    }
                    final androidx.biometric.AuthenticationCallbackProvider authenticationCallbackProvider = biometricViewModel3.getHighSpeedVideoFpsRangesFor;
                    if (authenticationCallbackProvider.getHighSpeedVideoSizes == null) {
                        authenticationCallbackProvider.getHighSpeedVideoSizes = new androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback() { // from class: androidx.biometric.AuthenticationCallbackProvider.1
                            AnonymousClass1() {
                            }

                            @Override // androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback
                            public void onAuthenticationError(int i2, java.lang.CharSequence charSequence) {
                                androidx.biometric.AuthenticationCallbackProvider.this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(i2, charSequence);
                            }

                            @Override // androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback
                            public void onAuthenticationHelp(int i2, java.lang.CharSequence charSequence) {
                                androidx.biometric.AuthenticationCallbackProvider.this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(charSequence);
                            }

                            @Override // androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback
                            public void onAuthenticationSucceeded(androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationResult authenticationResult) {
                                androidx.biometric.AuthenticationCallbackProvider.this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(new androidx.biometric.BiometricPrompt.AuthenticationResult(authenticationResult != null ? androidx.biometric.CryptoObjectUtils.getHighSpeedVideoSizes(authenticationResult.getCryptoObject()) : null, 2));
                            }

                            @Override // androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback
                            public void onAuthenticationFailed() {
                                androidx.biometric.AuthenticationCallbackProvider.this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap();
                            }
                        };
                    }
                    try {
                        from.authenticate(highSpeedVideoFpsRangesFor, 0, cancellationSignal, authenticationCallbackProvider.getHighSpeedVideoSizes, (android.os.Handler) null);
                        return;
                    } catch (java.lang.NullPointerException unused) {
                        getHighSpeedVideoFpsRanges(1, androidx.biometric.ErrorUtils.getHighSpeedVideoFpsRangesFor(applicationContext, 1));
                        Camera2StreamConfigurationMap();
                        return;
                    }
                }
                return;
            }
            getHighSpeedVideoFpsRanges(i, androidx.biometric.ErrorUtils.getHighSpeedVideoFpsRangesFor(applicationContext, i));
            Camera2StreamConfigurationMap();
            return;
        }
        android.hardware.biometrics.BiometricPrompt.Builder l_ = androidx.biometric.BiometricFragment.Api28Impl.l_(requireContext().getApplicationContext());
        androidx.biometric.BiometricPrompt.PromptInfo promptInfo2 = this.getHighResolutionOutputSizeshNQ4ISI._CREATION;
        java.lang.CharSequence charSequence = null;
        java.lang.CharSequence title = promptInfo2 != null ? promptInfo2.getTitle() : null;
        androidx.biometric.BiometricPrompt.PromptInfo promptInfo3 = this.getHighResolutionOutputSizeshNQ4ISI._CREATION;
        java.lang.CharSequence subtitle = promptInfo3 != null ? promptInfo3.getSubtitle() : null;
        androidx.biometric.BiometricPrompt.PromptInfo promptInfo4 = this.getHighResolutionOutputSizeshNQ4ISI._CREATION;
        java.lang.CharSequence description = promptInfo4 != null ? promptInfo4.getDescription() : null;
        if (title != null) {
            androidx.biometric.BiometricFragment.Api28Impl.p_(l_, title);
        }
        if (subtitle != null) {
            androidx.biometric.BiometricFragment.Api28Impl.o_(l_, subtitle);
        }
        if (description != null) {
            androidx.biometric.BiometricFragment.Api28Impl.m_(l_, description);
        }
        androidx.biometric.BiometricViewModel biometricViewModel4 = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.CharSequence charSequence2 = biometricViewModel4.ArtificialStackFrames;
        if (charSequence2 != null) {
            charSequence = charSequence2;
        } else {
            androidx.biometric.BiometricPrompt.PromptInfo promptInfo5 = biometricViewModel4._CREATION;
            if (promptInfo5 != null) {
                charSequence = promptInfo5.getNegativeButtonText();
            }
        }
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            java.util.concurrent.Executor executor = this.getHighResolutionOutputSizeshNQ4ISI.getOutputFormats;
            if (executor == null) {
                executor = new androidx.biometric.BiometricViewModel.DefaultExecutor();
            }
            androidx.biometric.BiometricViewModel biometricViewModel5 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (biometricViewModel5.accessartificialFrame == null) {
                biometricViewModel5.accessartificialFrame = new androidx.biometric.BiometricViewModel.NegativeButtonListener(biometricViewModel5);
            }
            androidx.biometric.BiometricFragment.Api28Impl.n_(l_, charSequence, executor, biometricViewModel5.accessartificialFrame);
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.biometric.BiometricPrompt.PromptInfo promptInfo6 = this.getHighResolutionOutputSizeshNQ4ISI._CREATION;
            androidx.biometric.BiometricFragment.Api29Impl.q_(l_, promptInfo6 == null || promptInfo6.isConfirmationRequired());
        }
        androidx.biometric.BiometricViewModel biometricViewModel6 = this.getHighResolutionOutputSizeshNQ4ISI;
        androidx.biometric.BiometricPrompt.PromptInfo promptInfo7 = biometricViewModel6._CREATION;
        int Camera2StreamConfigurationMap2 = promptInfo7 != null ? androidx.biometric.AuthenticatorUtils.Camera2StreamConfigurationMap(promptInfo7, biometricViewModel6.getInputFormats) : 0;
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            androidx.biometric.BiometricFragment.Api30Impl.s_(l_, Camera2StreamConfigurationMap2);
        } else if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.biometric.BiometricFragment.Api29Impl.r_(l_, androidx.biometric.AuthenticatorUtils.Camera2StreamConfigurationMap(Camera2StreamConfigurationMap2));
        }
        android.hardware.biometrics.BiometricPrompt k_ = androidx.biometric.BiometricFragment.Api28Impl.k_(l_);
        android.content.Context context2 = getContext();
        android.hardware.biometrics.BiometricPrompt.CryptoObject E_ = androidx.biometric.CryptoObjectUtils.E_(this.getHighResolutionOutputSizeshNQ4ISI.getInputFormats);
        androidx.biometric.BiometricViewModel biometricViewModel7 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (biometricViewModel7.getInputSizeshNQ4ISI == null) {
            biometricViewModel7.getInputSizeshNQ4ISI = new androidx.biometric.CancellationSignalProvider();
        }
        androidx.biometric.CancellationSignalProvider cancellationSignalProvider2 = biometricViewModel7.getInputSizeshNQ4ISI;
        if (cancellationSignalProvider2.getHighSpeedVideoSizes == null) {
            cancellationSignalProvider2.getHighSpeedVideoSizes = cancellationSignalProvider2.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes();
        }
        android.os.CancellationSignal cancellationSignal2 = cancellationSignalProvider2.getHighSpeedVideoSizes;
        androidx.biometric.BiometricFragment.PromptExecutor promptExecutor = new androidx.biometric.BiometricFragment.PromptExecutor();
        androidx.biometric.BiometricViewModel biometricViewModel8 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (biometricViewModel8.getHighSpeedVideoFpsRangesFor == null) {
            biometricViewModel8.getHighSpeedVideoFpsRangesFor = new androidx.biometric.AuthenticationCallbackProvider(new androidx.biometric.BiometricViewModel.CallbackListener(biometricViewModel8));
        }
        androidx.biometric.AuthenticationCallbackProvider authenticationCallbackProvider2 = biometricViewModel8.getHighSpeedVideoFpsRangesFor;
        if (authenticationCallbackProvider2.getHighSpeedVideoFpsRangesFor == null) {
            authenticationCallbackProvider2.getHighSpeedVideoFpsRangesFor = androidx.biometric.AuthenticationCallbackProvider.Api28Impl.f_(authenticationCallbackProvider2.getHighResolutionOutputSizeshNQ4ISI);
        }
        android.hardware.biometrics.BiometricPrompt.AuthenticationCallback authenticationCallback = authenticationCallbackProvider2.getHighSpeedVideoFpsRangesFor;
        try {
            if (E_ == null) {
                androidx.biometric.BiometricFragment.Api28Impl.j_(k_, cancellationSignal2, promptExecutor, authenticationCallback);
            } else {
                androidx.biometric.BiometricFragment.Api28Impl.i_(k_, E_, cancellationSignal2, promptExecutor, authenticationCallback);
            }
        } catch (java.lang.NullPointerException unused2) {
            if (context2 != null) {
                str = context2.getString(androidx.biometric.R.string.default_error_msg);
            } else {
                str = "";
            }
            getHighSpeedVideoFpsRanges(1, str);
            Camera2StreamConfigurationMap();
        }
    }

    final void getHighSpeedVideoFpsRangesFor(int i) {
        if (i == 3 || !this.getHighResolutionOutputSizeshNQ4ISI.toString) {
            if (getHighSpeedVideoSizes()) {
                this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes = i;
                if (i == 1) {
                    getHighSpeedVideoFpsRanges(10, androidx.biometric.ErrorUtils.getHighSpeedVideoFpsRangesFor(getContext(), 10));
                }
            }
            androidx.biometric.BiometricViewModel biometricViewModel = this.getHighResolutionOutputSizeshNQ4ISI;
            if (biometricViewModel.getInputSizeshNQ4ISI == null) {
                biometricViewModel.getInputSizeshNQ4ISI = new androidx.biometric.CancellationSignalProvider();
            }
            androidx.biometric.CancellationSignalProvider cancellationSignalProvider = biometricViewModel.getInputSizeshNQ4ISI;
            android.os.CancellationSignal cancellationSignal = cancellationSignalProvider.getHighSpeedVideoSizes;
            if (cancellationSignal != null) {
                try {
                    androidx.biometric.CancellationSignalProvider.Api16Impl.getHighSpeedVideoSizes(cancellationSignal);
                } catch (java.lang.NullPointerException unused) {
                }
                cancellationSignalProvider.getHighSpeedVideoSizes = null;
            }
            androidx.core.os.CancellationSignal cancellationSignal2 = cancellationSignalProvider.getHighSpeedVideoFpsRangesFor;
            if (cancellationSignal2 != null) {
                try {
                    cancellationSignal2.cancel();
                } catch (java.lang.NullPointerException unused2) {
                }
                cancellationSignalProvider.getHighSpeedVideoFpsRangesFor = null;
            }
        }
    }

    final void Camera2StreamConfigurationMap() {
        getInputSizeshNQ4ISI();
        this.getHighResolutionOutputSizeshNQ4ISI.coroutineBoundary = false;
        if (!this.getHighResolutionOutputSizeshNQ4ISI.unwrapAs && isAdded()) {
            getParentFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
        }
        android.content.Context context = getContext();
        if (context == null || !androidx.biometric.DeviceUtils.getHighSpeedVideoFpsRanges(context, android.os.Build.MODEL)) {
            return;
        }
        this.getHighResolutionOutputSizeshNQ4ISI.isOutputSupportedForhNQ4ISI = true;
        this.getHighSpeedVideoFpsRanges.postDelayed(new androidx.biometric.BiometricFragment.StopDelayingPromptRunnable(this.getHighResolutionOutputSizeshNQ4ISI), 600L);
    }

    private void getInputSizeshNQ4ISI() {
        this.getHighResolutionOutputSizeshNQ4ISI.coroutineBoundary = false;
        if (isAdded()) {
            androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
            androidx.biometric.FingerprintDialogFragment fingerprintDialogFragment = (androidx.biometric.FingerprintDialogFragment) parentFragmentManager.findFragmentByTag("androidx.biometric.FingerprintDialogFragment");
            if (fingerprintDialogFragment != null) {
                if (fingerprintDialogFragment.isAdded()) {
                    fingerprintDialogFragment.dismissAllowingStateLoss();
                } else {
                    parentFragmentManager.beginTransaction().remove(fingerprintDialogFragment).commitAllowingStateLoss();
                }
            }
        }
    }

    final void getHighResolutionOutputSizeshNQ4ISI() {
        android.content.Context context = getContext();
        android.app.KeyguardManager highSpeedVideoSizes = context != null ? androidx.biometric.KeyguardUtils.getHighSpeedVideoSizes(context) : null;
        if (highSpeedVideoSizes == null) {
            getHighSpeedVideoFpsRanges(12, getString(androidx.biometric.R.string.generic_error_no_keyguard));
            Camera2StreamConfigurationMap();
            return;
        }
        androidx.biometric.BiometricPrompt.PromptInfo promptInfo = this.getHighResolutionOutputSizeshNQ4ISI._CREATION;
        java.lang.CharSequence title = promptInfo != null ? promptInfo.getTitle() : null;
        androidx.biometric.BiometricPrompt.PromptInfo promptInfo2 = this.getHighResolutionOutputSizeshNQ4ISI._CREATION;
        java.lang.CharSequence subtitle = promptInfo2 != null ? promptInfo2.getSubtitle() : null;
        androidx.biometric.BiometricPrompt.PromptInfo promptInfo3 = this.getHighResolutionOutputSizeshNQ4ISI._CREATION;
        java.lang.CharSequence description = promptInfo3 != null ? promptInfo3.getDescription() : null;
        if (subtitle == null) {
            subtitle = description;
        }
        android.content.Intent highSpeedVideoFpsRangesFor = androidx.biometric.BiometricFragment.Api21Impl.getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes, title, subtitle);
        if (highSpeedVideoFpsRangesFor == null) {
            getHighSpeedVideoFpsRanges(14, getString(androidx.biometric.R.string.generic_error_no_device_credential));
            Camera2StreamConfigurationMap();
            return;
        }
        this.getHighResolutionOutputSizeshNQ4ISI.unwrapAs = true;
        if (getHighSpeedVideoSizes()) {
            getInputSizeshNQ4ISI();
        }
        highSpeedVideoFpsRangesFor.setFlags(134742016);
        startActivityForResult(highSpeedVideoFpsRangesFor, 1);
    }

    final void getHighSpeedVideoSizes(java.lang.CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = getString(androidx.biometric.R.string.default_error_msg);
        }
        androidx.biometric.BiometricViewModel biometricViewModel = this.getHighResolutionOutputSizeshNQ4ISI;
        if (biometricViewModel.getOutputSizeshNQ4ISI == null) {
            biometricViewModel.getOutputSizeshNQ4ISI = new androidx.view.MutableLiveData<>();
        }
        androidx.biometric.BiometricViewModel.getHighSpeedVideoSizes(biometricViewModel.getOutputSizeshNQ4ISI, 2);
        androidx.biometric.BiometricViewModel biometricViewModel2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (biometricViewModel2.getOutputStallDuration == null) {
            biometricViewModel2.getOutputStallDuration = new androidx.view.MutableLiveData<>();
        }
        androidx.biometric.BiometricViewModel.getHighSpeedVideoSizes(biometricViewModel2.getOutputStallDuration, charSequence);
    }

    final void getHighSpeedVideoFpsRangesFor(final androidx.biometric.BiometricPrompt.AuthenticationResult authenticationResult) {
        if (this.getHighResolutionOutputSizeshNQ4ISI.getOutputSizes) {
            this.getHighResolutionOutputSizeshNQ4ISI.getOutputSizes = false;
            java.util.concurrent.Executor executor = this.getHighResolutionOutputSizeshNQ4ISI.getOutputFormats;
            if (executor == null) {
                executor = new androidx.biometric.BiometricViewModel.DefaultExecutor();
            }
            executor.execute(new java.lang.Runnable() { // from class: androidx.biometric.BiometricFragment$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.biometric.BiometricFragment biometricFragment = androidx.biometric.BiometricFragment.this;
                    androidx.biometric.BiometricPrompt.AuthenticationResult authenticationResult2 = authenticationResult;
                    androidx.biometric.BiometricViewModel biometricViewModel = biometricFragment.getHighResolutionOutputSizeshNQ4ISI;
                    if (biometricViewModel.getHighSpeedVideoSizesFor == null) {
                        biometricViewModel.getHighSpeedVideoSizesFor = biometricViewModel.new AnonymousClass1();
                    }
                    biometricViewModel.getHighSpeedVideoSizesFor.onAuthenticationSucceeded(authenticationResult2);
                }
            });
        }
    }

    final void getHighSpeedVideoFpsRanges(final int i, final java.lang.CharSequence charSequence) {
        if (!this.getHighResolutionOutputSizeshNQ4ISI.unwrapAs && this.getHighResolutionOutputSizeshNQ4ISI.getOutputSizes) {
            this.getHighResolutionOutputSizeshNQ4ISI.getOutputSizes = false;
            java.util.concurrent.Executor executor = this.getHighResolutionOutputSizeshNQ4ISI.getOutputFormats;
            if (executor == null) {
                executor = new androidx.biometric.BiometricViewModel.DefaultExecutor();
            }
            executor.execute(new java.lang.Runnable() { // from class: androidx.biometric.BiometricFragment$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.biometric.BiometricFragment biometricFragment = androidx.biometric.BiometricFragment.this;
                    int i2 = i;
                    java.lang.CharSequence charSequence2 = charSequence;
                    androidx.biometric.BiometricViewModel biometricViewModel = biometricFragment.getHighResolutionOutputSizeshNQ4ISI;
                    if (biometricViewModel.getHighSpeedVideoSizesFor == null) {
                        biometricViewModel.getHighSpeedVideoSizesFor = biometricViewModel.new AnonymousClass1();
                    }
                    biometricViewModel.getHighSpeedVideoSizesFor.onAuthenticationError(i2, charSequence2);
                }
            });
        }
    }

    final boolean getHighSpeedVideoFpsRanges() {
        if (android.os.Build.VERSION.SDK_INT <= 28) {
            androidx.biometric.BiometricViewModel biometricViewModel = this.getHighResolutionOutputSizeshNQ4ISI;
            androidx.biometric.BiometricPrompt.PromptInfo promptInfo = biometricViewModel._CREATION;
            if (androidx.biometric.AuthenticatorUtils.Camera2StreamConfigurationMap(promptInfo != null ? androidx.biometric.AuthenticatorUtils.Camera2StreamConfigurationMap(promptInfo, biometricViewModel.getInputFormats) : 0)) {
                return true;
            }
        }
        return false;
    }

    final boolean getHighSpeedVideoSizes() {
        if (android.os.Build.VERSION.SDK_INT < 28) {
            return true;
        }
        android.content.Context context = getContext();
        if (context == null || this.getHighResolutionOutputSizeshNQ4ISI.getInputFormats == null || !androidx.biometric.DeviceUtils.getHighSpeedVideoFpsRanges(context, android.os.Build.MANUFACTURER, android.os.Build.MODEL)) {
            return android.os.Build.VERSION.SDK_INT == 28 && !getArguments().getBoolean("has_fingerprint", androidx.biometric.PackageUtils.getHighSpeedVideoFpsRanges(getContext()));
        }
        return true;
    }

    static class Api30Impl {
        private Api30Impl() {
        }

        static void s_(android.hardware.biometrics.BiometricPrompt.Builder builder, int i) {
            builder.setAllowedAuthenticators(i);
        }
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static void q_(android.hardware.biometrics.BiometricPrompt.Builder builder, boolean z) {
            builder.setConfirmationRequired(z);
        }

        static void r_(android.hardware.biometrics.BiometricPrompt.Builder builder, boolean z) {
            builder.setDeviceCredentialAllowed(z);
        }
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static android.hardware.biometrics.BiometricPrompt.Builder l_(android.content.Context context) {
            return new android.hardware.biometrics.BiometricPrompt.Builder(context);
        }

        static void p_(android.hardware.biometrics.BiometricPrompt.Builder builder, java.lang.CharSequence charSequence) {
            builder.setTitle(charSequence);
        }

        static void o_(android.hardware.biometrics.BiometricPrompt.Builder builder, java.lang.CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        static void m_(android.hardware.biometrics.BiometricPrompt.Builder builder, java.lang.CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        static void n_(android.hardware.biometrics.BiometricPrompt.Builder builder, java.lang.CharSequence charSequence, java.util.concurrent.Executor executor, android.content.DialogInterface.OnClickListener onClickListener) {
            builder.setNegativeButton(charSequence, executor, onClickListener);
        }

        static android.hardware.biometrics.BiometricPrompt k_(android.hardware.biometrics.BiometricPrompt.Builder builder) {
            return builder.build();
        }

        static void j_(android.hardware.biometrics.BiometricPrompt biometricPrompt, android.os.CancellationSignal cancellationSignal, java.util.concurrent.Executor executor, android.hardware.biometrics.BiometricPrompt.AuthenticationCallback authenticationCallback) {
            biometricPrompt.authenticate(cancellationSignal, executor, authenticationCallback);
        }

        static void i_(android.hardware.biometrics.BiometricPrompt biometricPrompt, android.hardware.biometrics.BiometricPrompt.CryptoObject cryptoObject, android.os.CancellationSignal cancellationSignal, java.util.concurrent.Executor executor, android.hardware.biometrics.BiometricPrompt.AuthenticationCallback authenticationCallback) {
            biometricPrompt.authenticate(cryptoObject, cancellationSignal, executor, authenticationCallback);
        }
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static android.content.Intent getHighSpeedVideoFpsRangesFor(android.app.KeyguardManager keyguardManager, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
            return keyguardManager.createConfirmDeviceCredentialIntent(charSequence, charSequence2);
        }
    }
}
