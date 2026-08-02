package androidx.preference;

@java.lang.Deprecated
/* loaded from: classes7.dex */
public class ListPreferenceDialogFragment extends androidx.preference.PreferenceDialogFragment {
    private java.lang.CharSequence[] getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    private java.lang.CharSequence[] getHighSpeedVideoFpsRangesFor;

    @java.lang.Deprecated
    public ListPreferenceDialogFragment() {
    }

    @java.lang.Deprecated
    public static androidx.preference.ListPreferenceDialogFragment newInstance(java.lang.String str) {
        androidx.preference.ListPreferenceDialogFragment listPreferenceDialogFragment = new androidx.preference.ListPreferenceDialogFragment();
        android.os.Bundle bundle = new android.os.Bundle(1);
        bundle.putString("key", str);
        listPreferenceDialogFragment.setArguments(bundle);
        return listPreferenceDialogFragment;
    }

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.getHighSpeedVideoFpsRanges = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.getHighResolutionOutputSizeshNQ4ISI = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.getHighSpeedVideoFpsRangesFor = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        androidx.preference.ListPreference listPreference = (androidx.preference.ListPreference) getPreference();
        if (listPreference.getEntries() == null || listPreference.getEntryValues() == null) {
            throw new java.lang.IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.getHighSpeedVideoFpsRanges = listPreference.findIndexOfValue(listPreference.getValue());
        this.getHighResolutionOutputSizeshNQ4ISI = listPreference.getEntries();
        this.getHighSpeedVideoFpsRangesFor = listPreference.getEntryValues();
    }

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.getHighSpeedVideoFpsRanges);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.getHighResolutionOutputSizeshNQ4ISI);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // androidx.preference.PreferenceDialogFragment
    protected void onPrepareDialogBuilder(android.app.AlertDialog.Builder builder) {
        super.onPrepareDialogBuilder(builder);
        builder.setSingleChoiceItems(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, new android.content.DialogInterface.OnClickListener() { // from class: androidx.preference.ListPreferenceDialogFragment.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i) {
                androidx.preference.ListPreferenceDialogFragment.this.getHighSpeedVideoFpsRanges = i;
                androidx.preference.ListPreferenceDialogFragment.this.onClick(dialogInterface, -1);
                dialogInterface.dismiss();
            }
        });
        builder.setPositiveButton((java.lang.CharSequence) null, (android.content.DialogInterface.OnClickListener) null);
    }

    @Override // androidx.preference.PreferenceDialogFragment
    @java.lang.Deprecated
    public void onDialogClosed(boolean z) {
        int i;
        androidx.preference.ListPreference listPreference = (androidx.preference.ListPreference) getPreference();
        if (!z || (i = this.getHighSpeedVideoFpsRanges) < 0) {
            return;
        }
        java.lang.String obj = this.getHighSpeedVideoFpsRangesFor[i].toString();
        if (listPreference.callChangeListener(obj)) {
            listPreference.setValue(obj);
        }
    }
}
