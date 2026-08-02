package androidx.preference;

/* loaded from: classes7.dex */
public abstract class DialogPreference extends androidx.preference.Preference {
    private java.lang.CharSequence Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.CharSequence getHighSpeedVideoFpsRanges;
    private java.lang.CharSequence getHighSpeedVideoFpsRangesFor;
    private android.graphics.drawable.Drawable getHighSpeedVideoSizes;
    private java.lang.CharSequence getOutputFormats;

    public interface TargetFragment {
        <T extends androidx.preference.Preference> T findPreference(java.lang.CharSequence charSequence);
    }

    public DialogPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.preference.R.styleable.DialogPreference, i, i2);
        java.lang.String string = androidx.core.content.res.TypedArrayUtils.getString(obtainStyledAttributes, androidx.preference.R.styleable.DialogPreference_dialogTitle, androidx.preference.R.styleable.DialogPreference_android_dialogTitle);
        this.getHighSpeedVideoFpsRanges = string;
        if (string == null) {
            this.getHighSpeedVideoFpsRanges = getTitle();
        }
        this.getHighSpeedVideoFpsRangesFor = androidx.core.content.res.TypedArrayUtils.getString(obtainStyledAttributes, androidx.preference.R.styleable.DialogPreference_dialogMessage, androidx.preference.R.styleable.DialogPreference_android_dialogMessage);
        this.getHighSpeedVideoSizes = androidx.core.content.res.TypedArrayUtils.getDrawable(obtainStyledAttributes, androidx.preference.R.styleable.DialogPreference_dialogIcon, androidx.preference.R.styleable.DialogPreference_android_dialogIcon);
        this.getOutputFormats = androidx.core.content.res.TypedArrayUtils.getString(obtainStyledAttributes, androidx.preference.R.styleable.DialogPreference_positiveButtonText, androidx.preference.R.styleable.DialogPreference_android_positiveButtonText);
        this.Camera2StreamConfigurationMap = androidx.core.content.res.TypedArrayUtils.getString(obtainStyledAttributes, androidx.preference.R.styleable.DialogPreference_negativeButtonText, androidx.preference.R.styleable.DialogPreference_android_negativeButtonText);
        this.getHighResolutionOutputSizeshNQ4ISI = androidx.core.content.res.TypedArrayUtils.getResourceId(obtainStyledAttributes, androidx.preference.R.styleable.DialogPreference_dialogLayout, androidx.preference.R.styleable.DialogPreference_android_dialogLayout, 0);
        obtainStyledAttributes.recycle();
    }

    public DialogPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DialogPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.res.TypedArrayUtils.getAttr(context, androidx.preference.R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }

    public DialogPreference(android.content.Context context) {
        this(context, null);
    }

    public void setDialogTitle(java.lang.CharSequence charSequence) {
        this.getHighSpeedVideoFpsRanges = charSequence;
    }

    public void setDialogTitle(int i) {
        setDialogTitle(getContext().getString(i));
    }

    public java.lang.CharSequence getDialogTitle() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void setDialogMessage(java.lang.CharSequence charSequence) {
        this.getHighSpeedVideoFpsRangesFor = charSequence;
    }

    public void setDialogMessage(int i) {
        setDialogMessage(getContext().getString(i));
    }

    public java.lang.CharSequence getDialogMessage() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void setDialogIcon(android.graphics.drawable.Drawable drawable) {
        this.getHighSpeedVideoSizes = drawable;
    }

    public void setDialogIcon(int i) {
        this.getHighSpeedVideoSizes = androidx.appcompat.content.res.AppCompatResources.getDrawable(getContext(), i);
    }

    public android.graphics.drawable.Drawable getDialogIcon() {
        return this.getHighSpeedVideoSizes;
    }

    public void setPositiveButtonText(java.lang.CharSequence charSequence) {
        this.getOutputFormats = charSequence;
    }

    public void setPositiveButtonText(int i) {
        setPositiveButtonText(getContext().getString(i));
    }

    public java.lang.CharSequence getPositiveButtonText() {
        return this.getOutputFormats;
    }

    public void setNegativeButtonText(java.lang.CharSequence charSequence) {
        this.Camera2StreamConfigurationMap = charSequence;
    }

    public void setNegativeButtonText(int i) {
        setNegativeButtonText(getContext().getString(i));
    }

    public java.lang.CharSequence getNegativeButtonText() {
        return this.Camera2StreamConfigurationMap;
    }

    public void setDialogLayoutResource(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    public int getDialogLayoutResource() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.preference.Preference
    protected void onClick() {
        getPreferenceManager().showDialog(this);
    }
}
