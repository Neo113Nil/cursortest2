package androidx.preference;

/* loaded from: classes7.dex */
public abstract class PreferenceDialogFragmentCompat extends androidx.fragment.app.DialogFragment implements android.content.DialogInterface.OnClickListener {
    protected static final java.lang.String ARG_KEY = "key";
    private java.lang.CharSequence Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.CharSequence getHighSpeedVideoFpsRanges;
    private java.lang.CharSequence getHighSpeedVideoFpsRangesFor;
    private android.graphics.drawable.BitmapDrawable getHighSpeedVideoSizes;
    private androidx.preference.DialogPreference getInputFormats;
    private java.lang.CharSequence getOutputFormats;
    private int getOutputMinFrameDuration;

    protected boolean needInputMethod() {
        return false;
    }

    public abstract void onDialogClosed(boolean z);

    protected void onPrepareDialogBuilder(androidx.appcompat.app.AlertDialog.Builder builder) {
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        androidx.view.result.ActivityResultCaller targetFragment = getTargetFragment();
        if (!(targetFragment instanceof androidx.preference.DialogPreference.TargetFragment)) {
            throw new java.lang.IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        androidx.preference.DialogPreference.TargetFragment targetFragment2 = (androidx.preference.DialogPreference.TargetFragment) targetFragment;
        java.lang.String string = getArguments().getString(ARG_KEY);
        if (bundle == null) {
            androidx.preference.DialogPreference dialogPreference = (androidx.preference.DialogPreference) targetFragment2.findPreference(string);
            this.getInputFormats = dialogPreference;
            this.getHighSpeedVideoFpsRangesFor = dialogPreference.getDialogTitle();
            this.getOutputFormats = this.getInputFormats.getPositiveButtonText();
            this.Camera2StreamConfigurationMap = this.getInputFormats.getNegativeButtonText();
            this.getHighSpeedVideoFpsRanges = this.getInputFormats.getDialogMessage();
            this.getHighResolutionOutputSizeshNQ4ISI = this.getInputFormats.getDialogLayoutResource();
            android.graphics.drawable.Drawable dialogIcon = this.getInputFormats.getDialogIcon();
            if (dialogIcon == null || (dialogIcon instanceof android.graphics.drawable.BitmapDrawable)) {
                this.getHighSpeedVideoSizes = (android.graphics.drawable.BitmapDrawable) dialogIcon;
                return;
            }
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(dialogIcon.getIntrinsicWidth(), dialogIcon.getIntrinsicHeight(), android.graphics.Bitmap.Config.ARGB_8888);
            android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
            dialogIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            dialogIcon.draw(canvas);
            this.getHighSpeedVideoSizes = new android.graphics.drawable.BitmapDrawable(getResources(), createBitmap);
            return;
        }
        this.getHighSpeedVideoFpsRangesFor = bundle.getCharSequence("PreferenceDialogFragment.title");
        this.getOutputFormats = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
        this.Camera2StreamConfigurationMap = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
        this.getHighSpeedVideoFpsRanges = bundle.getCharSequence("PreferenceDialogFragment.message");
        this.getHighResolutionOutputSizeshNQ4ISI = bundle.getInt("PreferenceDialogFragment.layout", 0);
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
        if (bitmap != null) {
            this.getHighSpeedVideoSizes = new android.graphics.drawable.BitmapDrawable(getResources(), bitmap);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.getHighSpeedVideoFpsRangesFor);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.getOutputFormats);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.Camera2StreamConfigurationMap);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.getHighSpeedVideoFpsRanges);
        bundle.putInt("PreferenceDialogFragment.layout", this.getHighResolutionOutputSizeshNQ4ISI);
        android.graphics.drawable.BitmapDrawable bitmapDrawable = this.getHighSpeedVideoSizes;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        androidx.fragment.app.FragmentActivity activity = getActivity();
        this.getOutputMinFrameDuration = -2;
        androidx.appcompat.app.AlertDialog.Builder negativeButton = new androidx.appcompat.app.AlertDialog.Builder(activity).setTitle(this.getHighSpeedVideoFpsRangesFor).setIcon(this.getHighSpeedVideoSizes).setPositiveButton(this.getOutputFormats, this).setNegativeButton(this.Camera2StreamConfigurationMap, this);
        android.view.View onCreateDialogView = onCreateDialogView(activity);
        if (onCreateDialogView != null) {
            onBindDialogView(onCreateDialogView);
            negativeButton.setView(onCreateDialogView);
        } else {
            negativeButton.setMessage(this.getHighSpeedVideoFpsRanges);
        }
        onPrepareDialogBuilder(negativeButton);
        androidx.appcompat.app.AlertDialog create = negativeButton.create();
        if (needInputMethod()) {
            Camera2StreamConfigurationMap(create);
        }
        return create;
    }

    public androidx.preference.DialogPreference getPreference() {
        if (this.getInputFormats == null) {
            this.getInputFormats = (androidx.preference.DialogPreference) ((androidx.preference.DialogPreference.TargetFragment) getTargetFragment()).findPreference(getArguments().getString(ARG_KEY));
        }
        return this.getInputFormats;
    }

    private void Camera2StreamConfigurationMap(android.app.Dialog dialog) {
        dialog.getWindow().setSoftInputMode(5);
    }

    protected android.view.View onCreateDialogView(android.content.Context context) {
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            return null;
        }
        return getLayoutInflater().inflate(i, (android.view.ViewGroup) null);
    }

    protected void onBindDialogView(android.view.View view) {
        int i;
        android.view.View findViewById = view.findViewById(android.R.id.message);
        if (findViewById != null) {
            java.lang.CharSequence charSequence = this.getHighSpeedVideoFpsRanges;
            if (android.text.TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else {
                if (findViewById instanceof android.widget.TextView) {
                    ((android.widget.TextView) findViewById).setText(charSequence);
                }
                i = 0;
            }
            if (findViewById.getVisibility() != i) {
                findViewById.setVisibility(i);
            }
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i) {
        this.getOutputMinFrameDuration = i;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        onDialogClosed(this.getOutputMinFrameDuration == -1);
    }
}
