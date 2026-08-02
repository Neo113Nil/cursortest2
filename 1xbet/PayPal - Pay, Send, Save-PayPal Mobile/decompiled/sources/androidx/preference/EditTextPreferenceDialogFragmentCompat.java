package androidx.preference;

/* loaded from: classes7.dex */
public class EditTextPreferenceDialogFragmentCompat extends androidx.preference.PreferenceDialogFragmentCompat {
    private java.lang.CharSequence Camera2StreamConfigurationMap;
    private android.widget.EditText getHighSpeedVideoFpsRangesFor;

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    protected boolean needInputMethod() {
        return true;
    }

    public static androidx.preference.EditTextPreferenceDialogFragmentCompat newInstance(java.lang.String str) {
        androidx.preference.EditTextPreferenceDialogFragmentCompat editTextPreferenceDialogFragmentCompat = new androidx.preference.EditTextPreferenceDialogFragmentCompat();
        android.os.Bundle bundle = new android.os.Bundle(1);
        bundle.putString("key", str);
        editTextPreferenceDialogFragmentCompat.setArguments(bundle);
        return editTextPreferenceDialogFragmentCompat;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.Camera2StreamConfigurationMap = getHighSpeedVideoFpsRangesFor().getText();
        } else {
            this.Camera2StreamConfigurationMap = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.Camera2StreamConfigurationMap);
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    protected void onBindDialogView(android.view.View view) {
        super.onBindDialogView(view);
        android.widget.EditText editText = (android.widget.EditText) view.findViewById(android.R.id.edit);
        this.getHighSpeedVideoFpsRangesFor = editText;
        if (editText == null) {
            throw new java.lang.IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.getHighSpeedVideoFpsRangesFor.setText(this.Camera2StreamConfigurationMap);
        android.widget.EditText editText2 = this.getHighSpeedVideoFpsRangesFor;
        editText2.setSelection(editText2.getText().length());
        if (getHighSpeedVideoFpsRangesFor().getHighResolutionOutputSizeshNQ4ISI != null) {
            getHighSpeedVideoFpsRangesFor().getHighResolutionOutputSizeshNQ4ISI.onBindEditText(this.getHighSpeedVideoFpsRangesFor);
        }
    }

    private androidx.preference.EditTextPreference getHighSpeedVideoFpsRangesFor() {
        return (androidx.preference.EditTextPreference) getPreference();
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public void onDialogClosed(boolean z) {
        if (z) {
            java.lang.String obj = this.getHighSpeedVideoFpsRangesFor.getText().toString();
            androidx.preference.EditTextPreference highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
            if (highSpeedVideoFpsRangesFor.callChangeListener(obj)) {
                highSpeedVideoFpsRangesFor.setText(obj);
            }
        }
    }
}
