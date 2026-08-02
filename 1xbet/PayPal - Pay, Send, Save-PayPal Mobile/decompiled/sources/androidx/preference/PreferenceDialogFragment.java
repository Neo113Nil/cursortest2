package androidx.preference;

@java.lang.Deprecated
/* loaded from: classes7.dex */
public abstract class PreferenceDialogFragment extends android.app.DialogFragment implements android.content.DialogInterface.OnClickListener {

    @java.lang.Deprecated
    protected static final java.lang.String ARG_KEY = "key";
    private java.lang.CharSequence Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.CharSequence getHighSpeedVideoFpsRanges;
    private java.lang.CharSequence getHighSpeedVideoFpsRangesFor;
    private android.graphics.drawable.BitmapDrawable getHighSpeedVideoSizes;
    private int getHighSpeedVideoSizesFor;
    private java.lang.CharSequence getInputFormats;
    private androidx.preference.DialogPreference getInputSizeshNQ4ISI;

    protected boolean needInputMethod() {
        return false;
    }

    @java.lang.Deprecated
    public abstract void onDialogClosed(boolean z);

    @java.lang.Deprecated
    protected void onPrepareDialogBuilder(android.app.AlertDialog.Builder builder) {
    }

    @java.lang.Deprecated
    public PreferenceDialogFragment() {
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.content.ComponentCallbacks2 targetFragment = getTargetFragment();
        if (!(targetFragment instanceof androidx.preference.DialogPreference.TargetFragment)) {
            throw new java.lang.IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        androidx.preference.DialogPreference.TargetFragment targetFragment2 = (androidx.preference.DialogPreference.TargetFragment) targetFragment;
        java.lang.String string = getArguments().getString(ARG_KEY);
        if (bundle == null) {
            androidx.preference.DialogPreference dialogPreference = (androidx.preference.DialogPreference) targetFragment2.findPreference(string);
            this.getInputSizeshNQ4ISI = dialogPreference;
            this.Camera2StreamConfigurationMap = dialogPreference.getDialogTitle();
            this.getInputFormats = this.getInputSizeshNQ4ISI.getPositiveButtonText();
            this.getHighSpeedVideoFpsRanges = this.getInputSizeshNQ4ISI.getNegativeButtonText();
            this.getHighSpeedVideoFpsRangesFor = this.getInputSizeshNQ4ISI.getDialogMessage();
            this.getHighResolutionOutputSizeshNQ4ISI = this.getInputSizeshNQ4ISI.getDialogLayoutResource();
            android.graphics.drawable.Drawable dialogIcon = this.getInputSizeshNQ4ISI.getDialogIcon();
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
        this.Camera2StreamConfigurationMap = bundle.getCharSequence("PreferenceDialogFragment.title");
        this.getInputFormats = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
        this.getHighSpeedVideoFpsRanges = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
        this.getHighSpeedVideoFpsRangesFor = bundle.getCharSequence("PreferenceDialogFragment.message");
        this.getHighResolutionOutputSizeshNQ4ISI = bundle.getInt("PreferenceDialogFragment.layout", 0);
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
        if (bitmap != null) {
            this.getHighSpeedVideoSizes = new android.graphics.drawable.BitmapDrawable(getResources(), bitmap);
        }
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.Camera2StreamConfigurationMap);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.getInputFormats);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.getHighSpeedVideoFpsRanges);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.getHighSpeedVideoFpsRangesFor);
        bundle.putInt("PreferenceDialogFragment.layout", this.getHighResolutionOutputSizeshNQ4ISI);
        android.graphics.drawable.BitmapDrawable bitmapDrawable = this.getHighSpeedVideoSizes;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    @Override // android.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        android.app.Activity activity = getActivity();
        this.getHighSpeedVideoSizesFor = -2;
        android.app.AlertDialog.Builder negativeButton = new android.app.AlertDialog.Builder(activity).setTitle(this.Camera2StreamConfigurationMap).setIcon(this.getHighSpeedVideoSizes).setPositiveButton(this.getInputFormats, this).setNegativeButton(this.getHighSpeedVideoFpsRanges, this);
        android.view.View onCreateDialogView = onCreateDialogView(activity);
        if (onCreateDialogView != null) {
            onBindDialogView(onCreateDialogView);
            negativeButton.setView(onCreateDialogView);
        } else {
            negativeButton.setMessage(this.getHighSpeedVideoFpsRangesFor);
        }
        onPrepareDialogBuilder(negativeButton);
        android.app.AlertDialog create = negativeButton.create();
        if (needInputMethod()) {
            create.getWindow().setSoftInputMode(5);
        }
        return create;
    }

    @java.lang.Deprecated
    public androidx.preference.DialogPreference getPreference() {
        if (this.getInputSizeshNQ4ISI == null) {
            this.getInputSizeshNQ4ISI = (androidx.preference.DialogPreference) ((androidx.preference.DialogPreference.TargetFragment) getTargetFragment()).findPreference(getArguments().getString(ARG_KEY));
        }
        return this.getInputSizeshNQ4ISI;
    }

    @java.lang.Deprecated
    protected android.view.View onCreateDialogView(android.content.Context context) {
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            return null;
        }
        return android.view.LayoutInflater.from(context).inflate(i, (android.view.ViewGroup) null);
    }

    @java.lang.Deprecated
    protected void onBindDialogView(android.view.View view) {
        int i;
        android.view.View findViewById = view.findViewById(android.R.id.message);
        if (findViewById != null) {
            java.lang.CharSequence charSequence = this.getHighSpeedVideoFpsRangesFor;
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
    @java.lang.Deprecated
    public void onClick(android.content.DialogInterface dialogInterface, int i) {
        this.getHighSpeedVideoSizesFor = i;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        onDialogClosed(this.getHighSpeedVideoSizesFor == -1);
    }
}
