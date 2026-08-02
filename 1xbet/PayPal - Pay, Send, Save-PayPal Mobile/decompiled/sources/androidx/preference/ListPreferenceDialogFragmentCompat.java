package androidx.preference;

/* loaded from: classes7.dex */
public class ListPreferenceDialogFragmentCompat extends androidx.preference.PreferenceDialogFragmentCompat {
    private java.lang.CharSequence[] getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.CharSequence[] getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    public static androidx.preference.ListPreferenceDialogFragmentCompat newInstance(java.lang.String str) {
        androidx.preference.ListPreferenceDialogFragmentCompat listPreferenceDialogFragmentCompat = new androidx.preference.ListPreferenceDialogFragmentCompat();
        android.os.Bundle bundle = new android.os.Bundle(1);
        bundle.putString("key", str);
        listPreferenceDialogFragmentCompat.setArguments(bundle);
        return listPreferenceDialogFragmentCompat;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            androidx.preference.ListPreference highSpeedVideoSizes = getHighSpeedVideoSizes();
            if (highSpeedVideoSizes.getEntries() == null || highSpeedVideoSizes.getEntryValues() == null) {
                throw new java.lang.IllegalStateException("ListPreference requires an entries array and an entryValues array.");
            }
            this.getHighSpeedVideoSizes = highSpeedVideoSizes.findIndexOfValue(highSpeedVideoSizes.getValue());
            this.getHighSpeedVideoFpsRanges = highSpeedVideoSizes.getEntries();
            this.getHighResolutionOutputSizeshNQ4ISI = highSpeedVideoSizes.getEntryValues();
            return;
        }
        this.getHighSpeedVideoSizes = bundle.getInt("ListPreferenceDialogFragment.index", 0);
        this.getHighSpeedVideoFpsRanges = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
        this.getHighResolutionOutputSizeshNQ4ISI = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.getHighSpeedVideoSizes);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.getHighSpeedVideoFpsRanges);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.getHighResolutionOutputSizeshNQ4ISI);
    }

    private androidx.preference.ListPreference getHighSpeedVideoSizes() {
        return (androidx.preference.ListPreference) getPreference();
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    protected void onPrepareDialogBuilder(androidx.appcompat.app.AlertDialog.Builder builder) {
        super.onPrepareDialogBuilder(builder);
        builder.setSingleChoiceItems(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, new android.content.DialogInterface.OnClickListener() { // from class: androidx.preference.ListPreferenceDialogFragmentCompat.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i) {
                androidx.preference.ListPreferenceDialogFragmentCompat.this.getHighSpeedVideoSizes = i;
                androidx.preference.ListPreferenceDialogFragmentCompat.this.onClick(dialogInterface, -1);
                dialogInterface.dismiss();
            }
        });
        builder.setPositiveButton((java.lang.CharSequence) null, (android.content.DialogInterface.OnClickListener) null);
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public void onDialogClosed(boolean z) {
        int i;
        if (!z || (i = this.getHighSpeedVideoSizes) < 0) {
            return;
        }
        java.lang.String obj = this.getHighResolutionOutputSizeshNQ4ISI[i].toString();
        androidx.preference.ListPreference highSpeedVideoSizes = getHighSpeedVideoSizes();
        if (highSpeedVideoSizes.callChangeListener(obj)) {
            highSpeedVideoSizes.setValue(obj);
        }
    }
}
