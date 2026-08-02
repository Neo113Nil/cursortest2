package androidx.preference;

@java.lang.Deprecated
/* loaded from: classes7.dex */
public class MultiSelectListPreferenceDialogFragment extends androidx.preference.PreferenceDialogFragment {
    java.lang.CharSequence[] getHighResolutionOutputSizeshNQ4ISI;
    boolean getHighSpeedVideoFpsRanges;
    java.lang.CharSequence[] getHighSpeedVideoFpsRangesFor;
    java.util.Set<java.lang.String> getHighSpeedVideoSizes = new java.util.HashSet();

    @java.lang.Deprecated
    public MultiSelectListPreferenceDialogFragment() {
    }

    @java.lang.Deprecated
    public static androidx.preference.MultiSelectListPreferenceDialogFragment newInstance(java.lang.String str) {
        androidx.preference.MultiSelectListPreferenceDialogFragment multiSelectListPreferenceDialogFragment = new androidx.preference.MultiSelectListPreferenceDialogFragment();
        android.os.Bundle bundle = new android.os.Bundle(1);
        bundle.putString("key", str);
        multiSelectListPreferenceDialogFragment.setArguments(bundle);
        return multiSelectListPreferenceDialogFragment;
    }

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.getHighSpeedVideoSizes.clear();
            this.getHighSpeedVideoSizes.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragment.values"));
            this.getHighSpeedVideoFpsRanges = bundle.getBoolean("MultiSelectListPreferenceDialogFragment.changed", false);
            this.getHighSpeedVideoFpsRangesFor = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragment.entries");
            this.getHighResolutionOutputSizeshNQ4ISI = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragment.entryValues");
            return;
        }
        androidx.preference.MultiSelectListPreference multiSelectListPreference = (androidx.preference.MultiSelectListPreference) getPreference();
        if (multiSelectListPreference.getEntries() == null || multiSelectListPreference.getEntryValues() == null) {
            throw new java.lang.IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        this.getHighSpeedVideoSizes.clear();
        this.getHighSpeedVideoSizes.addAll(multiSelectListPreference.getValues());
        this.getHighSpeedVideoFpsRanges = false;
        this.getHighSpeedVideoFpsRangesFor = multiSelectListPreference.getEntries();
        this.getHighResolutionOutputSizeshNQ4ISI = multiSelectListPreference.getEntryValues();
    }

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragment.values", new java.util.ArrayList<>(this.getHighSpeedVideoSizes));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragment.changed", this.getHighSpeedVideoFpsRanges);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragment.entries", this.getHighSpeedVideoFpsRangesFor);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragment.entryValues", this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // androidx.preference.PreferenceDialogFragment
    protected void onPrepareDialogBuilder(android.app.AlertDialog.Builder builder) {
        super.onPrepareDialogBuilder(builder);
        int length = this.getHighResolutionOutputSizeshNQ4ISI.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.getHighSpeedVideoSizes.contains(this.getHighResolutionOutputSizeshNQ4ISI[i].toString());
        }
        builder.setMultiChoiceItems(this.getHighSpeedVideoFpsRangesFor, zArr, new android.content.DialogInterface.OnMultiChoiceClickListener() { // from class: androidx.preference.MultiSelectListPreferenceDialogFragment.1
            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i2, boolean z) {
                if (z) {
                    androidx.preference.MultiSelectListPreferenceDialogFragment multiSelectListPreferenceDialogFragment = androidx.preference.MultiSelectListPreferenceDialogFragment.this;
                    multiSelectListPreferenceDialogFragment.getHighSpeedVideoFpsRanges = androidx.preference.MultiSelectListPreferenceDialogFragment.this.getHighSpeedVideoSizes.add(androidx.preference.MultiSelectListPreferenceDialogFragment.this.getHighResolutionOutputSizeshNQ4ISI[i2].toString()) | multiSelectListPreferenceDialogFragment.getHighSpeedVideoFpsRanges;
                } else {
                    androidx.preference.MultiSelectListPreferenceDialogFragment multiSelectListPreferenceDialogFragment2 = androidx.preference.MultiSelectListPreferenceDialogFragment.this;
                    multiSelectListPreferenceDialogFragment2.getHighSpeedVideoFpsRanges = androidx.preference.MultiSelectListPreferenceDialogFragment.this.getHighSpeedVideoSizes.remove(androidx.preference.MultiSelectListPreferenceDialogFragment.this.getHighResolutionOutputSizeshNQ4ISI[i2].toString()) | multiSelectListPreferenceDialogFragment2.getHighSpeedVideoFpsRanges;
                }
            }
        });
    }

    @Override // androidx.preference.PreferenceDialogFragment
    @java.lang.Deprecated
    public void onDialogClosed(boolean z) {
        androidx.preference.MultiSelectListPreference multiSelectListPreference = (androidx.preference.MultiSelectListPreference) getPreference();
        if (z && this.getHighSpeedVideoFpsRanges) {
            java.util.Set<java.lang.String> set = this.getHighSpeedVideoSizes;
            if (multiSelectListPreference.callChangeListener(set)) {
                multiSelectListPreference.setValues(set);
            }
        }
        this.getHighSpeedVideoFpsRanges = false;
    }
}
