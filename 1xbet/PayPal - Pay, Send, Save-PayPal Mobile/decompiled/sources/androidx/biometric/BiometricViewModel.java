package androidx.biometric;

/* loaded from: classes3.dex */
public class BiometricViewModel extends androidx.view.ViewModel {
    java.lang.CharSequence ArtificialStackFrames;
    androidx.view.MutableLiveData<androidx.biometric.BiometricPrompt.AuthenticationResult> Camera2StreamConfigurationMap;
    boolean CoroutineDebuggingKt;
    androidx.biometric.BiometricPrompt.PromptInfo _CREATION;
    android.content.DialogInterface.OnClickListener accessartificialFrame;
    boolean coroutineBoundary;
    androidx.view.MutableLiveData<java.lang.Boolean> coroutineCreation;
    androidx.view.MutableLiveData<java.lang.CharSequence> getHighResolutionOutputSizeshNQ4ISI;
    androidx.view.MutableLiveData<androidx.biometric.BiometricErrorData> getHighSpeedVideoFpsRanges;
    androidx.biometric.AuthenticationCallbackProvider getHighSpeedVideoFpsRangesFor;
    androidx.biometric.BiometricPrompt.AuthenticationCallback getHighSpeedVideoSizesFor;
    androidx.biometric.BiometricPrompt.CryptoObject getInputFormats;
    androidx.biometric.CancellationSignalProvider getInputSizeshNQ4ISI;
    java.util.concurrent.Executor getOutputFormats;
    java.lang.ref.WeakReference<androidx.fragment.app.FragmentActivity> getOutputMinFrameDuration;
    boolean getOutputSizes;
    androidx.view.MutableLiveData<java.lang.Integer> getOutputSizeshNQ4ISI;
    androidx.view.MutableLiveData<java.lang.CharSequence> getOutputStallDuration;
    androidx.view.MutableLiveData<java.lang.Boolean> getOutputStallDurationlomOqCM;
    androidx.view.MutableLiveData<java.lang.Boolean> getValidOutputFormatsForInputhNQ4ISI;
    boolean isOutputSupportedForhNQ4ISI;
    boolean toString;
    boolean unwrapAs;
    int getHighSpeedVideoSizes = 0;
    boolean isOutputSupportedFor = true;
    int getOutputMinFrameDurationlomOqCM = 0;

    static class DefaultExecutor implements java.util.concurrent.Executor {
        private final android.os.Handler getHighSpeedVideoFpsRanges = new android.os.Handler(android.os.Looper.getMainLooper());

        DefaultExecutor() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable runnable) {
            this.getHighSpeedVideoFpsRanges.post(runnable);
        }
    }

    static final class CallbackListener extends androidx.biometric.AuthenticationCallbackProvider.Listener {
        private final java.lang.ref.WeakReference<androidx.biometric.BiometricViewModel> getHighSpeedVideoFpsRangesFor;

        CallbackListener(androidx.biometric.BiometricViewModel biometricViewModel) {
            this.getHighSpeedVideoFpsRangesFor = new java.lang.ref.WeakReference<>(biometricViewModel);
        }

        @Override // androidx.biometric.AuthenticationCallbackProvider.Listener
        final void getHighSpeedVideoFpsRangesFor(androidx.biometric.BiometricPrompt.AuthenticationResult authenticationResult) {
            if (this.getHighSpeedVideoFpsRangesFor.get() == null || !this.getHighSpeedVideoFpsRangesFor.get().getOutputSizes) {
                return;
            }
            int i = -1;
            if (authenticationResult.getAuthenticationType() == -1) {
                androidx.biometric.BiometricPrompt.CryptoObject cryptoObject = authenticationResult.getCryptoObject();
                androidx.biometric.BiometricViewModel biometricViewModel = this.getHighSpeedVideoFpsRangesFor.get();
                androidx.biometric.BiometricPrompt.PromptInfo promptInfo = biometricViewModel._CREATION;
                int Camera2StreamConfigurationMap = promptInfo != null ? androidx.biometric.AuthenticatorUtils.Camera2StreamConfigurationMap(promptInfo, biometricViewModel.getInputFormats) : 0;
                if (androidx.biometric.AuthenticatorUtils.getHighSpeedVideoSizes(Camera2StreamConfigurationMap) && !androidx.biometric.AuthenticatorUtils.Camera2StreamConfigurationMap(Camera2StreamConfigurationMap)) {
                    i = 2;
                }
                authenticationResult = new androidx.biometric.BiometricPrompt.AuthenticationResult(cryptoObject, i);
            }
            androidx.biometric.BiometricViewModel biometricViewModel2 = this.getHighSpeedVideoFpsRangesFor.get();
            if (biometricViewModel2.Camera2StreamConfigurationMap == null) {
                biometricViewModel2.Camera2StreamConfigurationMap = new androidx.view.MutableLiveData<>();
            }
            androidx.view.MutableLiveData<androidx.biometric.BiometricPrompt.AuthenticationResult> mutableLiveData = biometricViewModel2.Camera2StreamConfigurationMap;
            if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
                mutableLiveData.setValue(authenticationResult);
            } else {
                mutableLiveData.postValue(authenticationResult);
            }
        }

        @Override // androidx.biometric.AuthenticationCallbackProvider.Listener
        final void getHighSpeedVideoFpsRanges(int i, java.lang.CharSequence charSequence) {
            if (this.getHighSpeedVideoFpsRangesFor.get() == null || this.getHighSpeedVideoFpsRangesFor.get().unwrapAs || !this.getHighSpeedVideoFpsRangesFor.get().getOutputSizes) {
                return;
            }
            androidx.biometric.BiometricViewModel biometricViewModel = this.getHighSpeedVideoFpsRangesFor.get();
            androidx.biometric.BiometricErrorData biometricErrorData = new androidx.biometric.BiometricErrorData(i, charSequence);
            if (biometricViewModel.getHighSpeedVideoFpsRanges == null) {
                biometricViewModel.getHighSpeedVideoFpsRanges = new androidx.view.MutableLiveData<>();
            }
            androidx.view.MutableLiveData<androidx.biometric.BiometricErrorData> mutableLiveData = biometricViewModel.getHighSpeedVideoFpsRanges;
            if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
                mutableLiveData.setValue(biometricErrorData);
            } else {
                mutableLiveData.postValue(biometricErrorData);
            }
        }

        @Override // androidx.biometric.AuthenticationCallbackProvider.Listener
        final void getHighSpeedVideoFpsRangesFor(java.lang.CharSequence charSequence) {
            if (this.getHighSpeedVideoFpsRangesFor.get() != null) {
                androidx.biometric.BiometricViewModel biometricViewModel = this.getHighSpeedVideoFpsRangesFor.get();
                if (biometricViewModel.getHighResolutionOutputSizeshNQ4ISI == null) {
                    biometricViewModel.getHighResolutionOutputSizeshNQ4ISI = new androidx.view.MutableLiveData<>();
                }
                androidx.biometric.BiometricViewModel.getHighSpeedVideoSizes(biometricViewModel.getHighResolutionOutputSizeshNQ4ISI, charSequence);
            }
        }

        @Override // androidx.biometric.AuthenticationCallbackProvider.Listener
        final void Camera2StreamConfigurationMap() {
            if (this.getHighSpeedVideoFpsRangesFor.get() == null || !this.getHighSpeedVideoFpsRangesFor.get().getOutputSizes) {
                return;
            }
            androidx.biometric.BiometricViewModel biometricViewModel = this.getHighSpeedVideoFpsRangesFor.get();
            if (biometricViewModel.getOutputStallDurationlomOqCM == null) {
                biometricViewModel.getOutputStallDurationlomOqCM = new androidx.view.MutableLiveData<>();
            }
            androidx.view.MutableLiveData<java.lang.Boolean> mutableLiveData = biometricViewModel.getOutputStallDurationlomOqCM;
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
                mutableLiveData.setValue(bool);
            } else {
                mutableLiveData.postValue(bool);
            }
        }
    }

    static class NegativeButtonListener implements android.content.DialogInterface.OnClickListener {
        private final java.lang.ref.WeakReference<androidx.biometric.BiometricViewModel> getHighSpeedVideoFpsRanges;

        NegativeButtonListener(androidx.biometric.BiometricViewModel biometricViewModel) {
            this.getHighSpeedVideoFpsRanges = new java.lang.ref.WeakReference<>(biometricViewModel);
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            if (this.getHighSpeedVideoFpsRanges.get() != null) {
                this.getHighSpeedVideoFpsRanges.get().getHighSpeedVideoFpsRangesFor(true);
            }
        }
    }

    /* renamed from: androidx.biometric.BiometricViewModel$1, reason: invalid class name */
    class AnonymousClass1 extends androidx.biometric.BiometricPrompt.AuthenticationCallback {
        AnonymousClass1() {
        }
    }

    public androidx.fragment.app.FragmentActivity getClientActivity() {
        java.lang.ref.WeakReference<androidx.fragment.app.FragmentActivity> weakReference = this.getOutputMinFrameDuration;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    final void getHighSpeedVideoFpsRangesFor(boolean z) {
        if (this.coroutineCreation == null) {
            this.coroutineCreation = new androidx.view.MutableLiveData<>();
        }
        androidx.view.MutableLiveData<java.lang.Boolean> mutableLiveData = this.coroutineCreation;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
            mutableLiveData.setValue(bool);
        } else {
            mutableLiveData.postValue(bool);
        }
    }

    final void getHighSpeedVideoSizes(int i) {
        if (this.getOutputSizeshNQ4ISI == null) {
            this.getOutputSizeshNQ4ISI = new androidx.view.MutableLiveData<>();
        }
        androidx.view.MutableLiveData<java.lang.Integer> mutableLiveData = this.getOutputSizeshNQ4ISI;
        if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
            mutableLiveData.setValue(1);
        } else {
            mutableLiveData.postValue(1);
        }
    }

    final void Camera2StreamConfigurationMap(java.lang.CharSequence charSequence) {
        if (this.getOutputStallDuration == null) {
            this.getOutputStallDuration = new androidx.view.MutableLiveData<>();
        }
        androidx.view.MutableLiveData<java.lang.CharSequence> mutableLiveData = this.getOutputStallDuration;
        if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
            mutableLiveData.setValue(charSequence);
        } else {
            mutableLiveData.postValue(charSequence);
        }
    }

    static <T> void getHighSpeedVideoSizes(androidx.view.MutableLiveData<T> mutableLiveData, T t) {
        if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
            mutableLiveData.setValue(t);
        } else {
            mutableLiveData.postValue(t);
        }
    }
}
