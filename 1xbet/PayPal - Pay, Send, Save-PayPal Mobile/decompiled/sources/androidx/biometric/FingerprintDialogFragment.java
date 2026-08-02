package androidx.biometric;

/* loaded from: classes3.dex */
public class FingerprintDialogFragment extends androidx.fragment.app.DialogFragment {
    android.widget.ImageView getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    android.widget.TextView getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    androidx.biometric.BiometricViewModel getHighSpeedVideoSizesFor;
    final android.os.Handler Camera2StreamConfigurationMap = new android.os.Handler(android.os.Looper.getMainLooper());
    final java.lang.Runnable getOutputFormats = new java.lang.Runnable() { // from class: androidx.biometric.FingerprintDialogFragment.1
        @Override // java.lang.Runnable
        public void run() {
            androidx.biometric.FingerprintDialogFragment fingerprintDialogFragment = androidx.biometric.FingerprintDialogFragment.this;
            android.content.Context context = fingerprintDialogFragment.getContext();
            if (context != null) {
                fingerprintDialogFragment.getHighSpeedVideoSizesFor.getHighSpeedVideoSizes(1);
                fingerprintDialogFragment.getHighSpeedVideoSizesFor.Camera2StreamConfigurationMap(context.getString(androidx.biometric.R.string.fingerprint_dialog_touch_sensor));
            }
        }
    };

    private FingerprintDialogFragment() {
    }

    static androidx.biometric.FingerprintDialogFragment getHighSpeedVideoFpsRangesFor(boolean z) {
        androidx.biometric.FingerprintDialogFragment fingerprintDialogFragment = new androidx.biometric.FingerprintDialogFragment();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("host_activity", z);
        fingerprintDialogFragment.setArguments(bundle);
        return fingerprintDialogFragment;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        androidx.biometric.BiometricViewModel highSpeedVideoSizes = androidx.biometric.BiometricPrompt.getHighSpeedVideoSizes(this, getArguments().getBoolean("host_activity", true));
        this.getHighSpeedVideoSizesFor = highSpeedVideoSizes;
        if (highSpeedVideoSizes.getOutputSizeshNQ4ISI == null) {
            highSpeedVideoSizes.getOutputSizeshNQ4ISI = new androidx.view.MutableLiveData<>();
        }
        highSpeedVideoSizes.getOutputSizeshNQ4ISI.observe(this, new androidx.view.Observer<java.lang.Integer>() { // from class: androidx.biometric.FingerprintDialogFragment.3
            /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
            @Override // androidx.view.Observer
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public /* synthetic */ void onChanged(java.lang.Integer num) {
                android.graphics.drawable.Drawable drawable;
                int i;
                java.lang.Integer num2 = num;
                androidx.biometric.FingerprintDialogFragment.this.Camera2StreamConfigurationMap.removeCallbacks(androidx.biometric.FingerprintDialogFragment.this.getOutputFormats);
                androidx.biometric.FingerprintDialogFragment fingerprintDialogFragment = androidx.biometric.FingerprintDialogFragment.this;
                int intValue = num2.intValue();
                if (fingerprintDialogFragment.getHighResolutionOutputSizeshNQ4ISI != null) {
                    int i2 = fingerprintDialogFragment.getHighSpeedVideoSizesFor.getOutputMinFrameDurationlomOqCM;
                    android.content.Context context = fingerprintDialogFragment.getContext();
                    if (context != null) {
                        if (i2 == 0 && intValue == 1) {
                            i = androidx.biometric.R.drawable.fingerprint_dialog_fp_icon;
                        } else if (i2 == 1 && intValue == 2) {
                            i = androidx.biometric.R.drawable.fingerprint_dialog_error;
                        } else if (i2 == 2 && intValue == 1) {
                            i = androidx.biometric.R.drawable.fingerprint_dialog_fp_icon;
                        } else if (i2 == 1 && intValue == 3) {
                            i = androidx.biometric.R.drawable.fingerprint_dialog_fp_icon;
                        }
                        drawable = androidx.core.content.ContextCompat.getDrawable(context, i);
                        if (drawable != null) {
                            fingerprintDialogFragment.getHighResolutionOutputSizeshNQ4ISI.setImageDrawable(drawable);
                            if ((i2 != 0 || intValue != 1) && ((i2 == 1 && intValue == 2) || (i2 == 2 && intValue == 1))) {
                                androidx.biometric.FingerprintDialogFragment.Api21Impl.getHighSpeedVideoSizes(drawable);
                            }
                            fingerprintDialogFragment.getHighSpeedVideoSizesFor.getOutputMinFrameDurationlomOqCM = intValue;
                        }
                    }
                    drawable = null;
                    if (drawable != null) {
                    }
                }
                androidx.biometric.FingerprintDialogFragment fingerprintDialogFragment2 = androidx.biometric.FingerprintDialogFragment.this;
                int intValue2 = num2.intValue();
                android.widget.TextView textView = fingerprintDialogFragment2.getHighSpeedVideoFpsRangesFor;
                if (textView != null) {
                    textView.setTextColor(intValue2 == 2 ? fingerprintDialogFragment2.getHighSpeedVideoSizes : fingerprintDialogFragment2.getHighSpeedVideoFpsRanges);
                }
                androidx.biometric.FingerprintDialogFragment.this.Camera2StreamConfigurationMap.postDelayed(androidx.biometric.FingerprintDialogFragment.this.getOutputFormats, 2000L);
            }
        });
        androidx.biometric.BiometricViewModel biometricViewModel = this.getHighSpeedVideoSizesFor;
        if (biometricViewModel.getOutputStallDuration == null) {
            biometricViewModel.getOutputStallDuration = new androidx.view.MutableLiveData<>();
        }
        biometricViewModel.getOutputStallDuration.observe(this, new androidx.view.Observer<java.lang.CharSequence>() { // from class: androidx.biometric.FingerprintDialogFragment.4
            @Override // androidx.view.Observer
            public /* synthetic */ void onChanged(java.lang.CharSequence charSequence) {
                java.lang.CharSequence charSequence2 = charSequence;
                androidx.biometric.FingerprintDialogFragment.this.Camera2StreamConfigurationMap.removeCallbacks(androidx.biometric.FingerprintDialogFragment.this.getOutputFormats);
                android.widget.TextView textView = androidx.biometric.FingerprintDialogFragment.this.getHighSpeedVideoFpsRangesFor;
                if (textView != null) {
                    textView.setText(charSequence2);
                }
                androidx.biometric.FingerprintDialogFragment.this.Camera2StreamConfigurationMap.postDelayed(androidx.biometric.FingerprintDialogFragment.this.getOutputFormats, 2000L);
            }
        });
        this.getHighSpeedVideoSizes = getHighSpeedVideoFpsRangesFor(androidx.biometric.FingerprintDialogFragment.Api26Impl.getHighResolutionOutputSizeshNQ4ISI());
        this.getHighSpeedVideoFpsRanges = getHighSpeedVideoFpsRangesFor(android.R.attr.textColorSecondary);
    }

    @Override // androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        androidx.appcompat.app.AlertDialog.Builder builder = new androidx.appcompat.app.AlertDialog.Builder(requireContext());
        androidx.biometric.BiometricPrompt.PromptInfo promptInfo = this.getHighSpeedVideoSizesFor._CREATION;
        java.lang.CharSequence charSequence = null;
        builder.setTitle(promptInfo != null ? promptInfo.getTitle() : null);
        android.view.View inflate = android.view.LayoutInflater.from(builder.getContext()).inflate(androidx.biometric.R.layout.fingerprint_dialog_layout, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(androidx.biometric.R.id.fingerprint_subtitle);
        if (textView != null) {
            androidx.biometric.BiometricPrompt.PromptInfo promptInfo2 = this.getHighSpeedVideoSizesFor._CREATION;
            java.lang.CharSequence subtitle = promptInfo2 != null ? promptInfo2.getSubtitle() : null;
            if (android.text.TextUtils.isEmpty(subtitle)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(subtitle);
            }
        }
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(androidx.biometric.R.id.fingerprint_description);
        if (textView2 != null) {
            androidx.biometric.BiometricPrompt.PromptInfo promptInfo3 = this.getHighSpeedVideoSizesFor._CREATION;
            java.lang.CharSequence description = promptInfo3 != null ? promptInfo3.getDescription() : null;
            if (android.text.TextUtils.isEmpty(description)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(description);
            }
        }
        this.getHighResolutionOutputSizeshNQ4ISI = (android.widget.ImageView) inflate.findViewById(androidx.biometric.R.id.fingerprint_icon);
        this.getHighSpeedVideoFpsRangesFor = (android.widget.TextView) inflate.findViewById(androidx.biometric.R.id.fingerprint_error);
        androidx.biometric.BiometricViewModel biometricViewModel = this.getHighSpeedVideoSizesFor;
        androidx.biometric.BiometricPrompt.PromptInfo promptInfo4 = biometricViewModel._CREATION;
        if (androidx.biometric.AuthenticatorUtils.Camera2StreamConfigurationMap(promptInfo4 != null ? androidx.biometric.AuthenticatorUtils.Camera2StreamConfigurationMap(promptInfo4, biometricViewModel.getInputFormats) : 0)) {
            charSequence = getString(androidx.biometric.R.string.confirm_device_credential_password);
        } else {
            androidx.biometric.BiometricViewModel biometricViewModel2 = this.getHighSpeedVideoSizesFor;
            java.lang.CharSequence charSequence2 = biometricViewModel2.ArtificialStackFrames;
            if (charSequence2 != null) {
                charSequence = charSequence2;
            } else {
                androidx.biometric.BiometricPrompt.PromptInfo promptInfo5 = biometricViewModel2._CREATION;
                if (promptInfo5 != null) {
                    charSequence = promptInfo5.getNegativeButtonText();
                }
            }
        }
        builder.setNegativeButton(charSequence, new android.content.DialogInterface.OnClickListener() { // from class: androidx.biometric.FingerprintDialogFragment.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i) {
                androidx.biometric.FingerprintDialogFragment.this.getHighSpeedVideoSizesFor.getHighSpeedVideoFpsRangesFor(true);
            }
        });
        builder.setView(inflate);
        androidx.appcompat.app.AlertDialog create = builder.create();
        create.setCanceledOnTouchOutside(false);
        return create;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.getHighSpeedVideoSizesFor.getOutputMinFrameDurationlomOqCM = 0;
        this.getHighSpeedVideoSizesFor.getHighSpeedVideoSizes(1);
        this.getHighSpeedVideoSizesFor.Camera2StreamConfigurationMap(getString(androidx.biometric.R.string.fingerprint_dialog_touch_sensor));
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.Camera2StreamConfigurationMap.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        androidx.biometric.BiometricViewModel biometricViewModel = this.getHighSpeedVideoSizesFor;
        if (biometricViewModel.getValidOutputFormatsForInputhNQ4ISI == null) {
            biometricViewModel.getValidOutputFormatsForInputhNQ4ISI = new androidx.view.MutableLiveData<>();
        }
        androidx.view.MutableLiveData<java.lang.Boolean> mutableLiveData = biometricViewModel.getValidOutputFormatsForInputhNQ4ISI;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
            mutableLiveData.setValue(bool);
        } else {
            mutableLiveData.postValue(bool);
        }
    }

    private int getHighSpeedVideoFpsRangesFor(int i) {
        android.content.Context context = getContext();
        if (context == null) {
            return 0;
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(typedValue.data, new int[]{i});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }

    static class Api26Impl {
        private Api26Impl() {
        }

        static int getHighResolutionOutputSizeshNQ4ISI() {
            return androidx.appcompat.R.attr.colorError;
        }
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static void getHighSpeedVideoSizes(android.graphics.drawable.Drawable drawable) {
            if (drawable instanceof android.graphics.drawable.AnimatedVectorDrawable) {
                ((android.graphics.drawable.AnimatedVectorDrawable) drawable).start();
            }
        }
    }
}
