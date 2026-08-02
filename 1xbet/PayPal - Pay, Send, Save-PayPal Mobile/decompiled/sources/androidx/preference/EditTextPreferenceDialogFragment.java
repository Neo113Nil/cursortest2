package androidx.preference;

@java.lang.Deprecated
/* loaded from: classes7.dex */
public class EditTextPreferenceDialogFragment extends androidx.preference.PreferenceDialogFragment {
    private android.widget.EditText getHighSpeedVideoFpsRanges;
    private java.lang.CharSequence getHighSpeedVideoFpsRangesFor;

    @Override // androidx.preference.PreferenceDialogFragment
    protected boolean needInputMethod() {
        return true;
    }

    @java.lang.Deprecated
    public EditTextPreferenceDialogFragment() {
    }

    @java.lang.Deprecated
    public static androidx.preference.EditTextPreferenceDialogFragment newInstance(java.lang.String str) {
        androidx.preference.EditTextPreferenceDialogFragment editTextPreferenceDialogFragment = new androidx.preference.EditTextPreferenceDialogFragment();
        android.os.Bundle bundle = new android.os.Bundle(1);
        bundle.putString("key", str);
        editTextPreferenceDialogFragment.setArguments(bundle);
        return editTextPreferenceDialogFragment;
    }

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.getHighSpeedVideoFpsRangesFor = ((androidx.preference.EditTextPreference) getPreference()).getText();
        } else {
            this.getHighSpeedVideoFpsRangesFor = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // androidx.preference.PreferenceDialogFragment
    protected void onBindDialogView(android.view.View view) {
        super.onBindDialogView(view);
        android.widget.EditText editText = (android.widget.EditText) view.findViewById(android.R.id.edit);
        this.getHighSpeedVideoFpsRanges = editText;
        editText.requestFocus();
        android.widget.EditText editText2 = this.getHighSpeedVideoFpsRanges;
        if (editText2 == null) {
            throw new java.lang.IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText2.setText(this.getHighSpeedVideoFpsRangesFor);
        android.widget.EditText editText3 = this.getHighSpeedVideoFpsRanges;
        editText3.setSelection(editText3.getText().length());
    }

    @Override // androidx.preference.PreferenceDialogFragment
    @java.lang.Deprecated
    public void onDialogClosed(boolean z) {
        if (z) {
            java.lang.String obj = this.getHighSpeedVideoFpsRanges.getText().toString();
            if (((androidx.preference.EditTextPreference) getPreference()).callChangeListener(obj)) {
                ((androidx.preference.EditTextPreference) getPreference()).setText(obj);
            }
        }
    }
}
