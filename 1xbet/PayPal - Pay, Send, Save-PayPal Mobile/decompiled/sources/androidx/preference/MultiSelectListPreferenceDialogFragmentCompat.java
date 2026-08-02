package androidx.preference;

/* loaded from: classes7.dex */
public class MultiSelectListPreferenceDialogFragmentCompat extends androidx.preference.PreferenceDialogFragmentCompat {
    java.lang.CharSequence[] Camera2StreamConfigurationMap;
    java.lang.CharSequence[] getHighResolutionOutputSizeshNQ4ISI;
    java.util.Set<java.lang.String> getHighSpeedVideoFpsRanges = new java.util.HashSet();
    boolean getHighSpeedVideoSizes;

    public static androidx.preference.MultiSelectListPreferenceDialogFragmentCompat newInstance(java.lang.String str) {
        androidx.preference.MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat = new androidx.preference.MultiSelectListPreferenceDialogFragmentCompat();
        android.os.Bundle bundle = new android.os.Bundle(1);
        bundle.putString("key", str);
        multiSelectListPreferenceDialogFragmentCompat.setArguments(bundle);
        return multiSelectListPreferenceDialogFragmentCompat;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            androidx.preference.MultiSelectListPreference Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
            if (Camera2StreamConfigurationMap.getEntries() == null || Camera2StreamConfigurationMap.getEntryValues() == null) {
                throw new java.lang.IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
            }
            this.getHighSpeedVideoFpsRanges.clear();
            this.getHighSpeedVideoFpsRanges.addAll(Camera2StreamConfigurationMap.getValues());
            this.getHighSpeedVideoSizes = false;
            this.Camera2StreamConfigurationMap = Camera2StreamConfigurationMap.getEntries();
            this.getHighResolutionOutputSizeshNQ4ISI = Camera2StreamConfigurationMap.getEntryValues();
            return;
        }
        this.getHighSpeedVideoFpsRanges.clear();
        this.getHighSpeedVideoFpsRanges.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
        this.getHighSpeedVideoSizes = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
        this.Camera2StreamConfigurationMap = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
        this.getHighResolutionOutputSizeshNQ4ISI = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new java.util.ArrayList<>(this.getHighSpeedVideoFpsRanges));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.getHighSpeedVideoSizes);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.Camera2StreamConfigurationMap);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.getHighResolutionOutputSizeshNQ4ISI);
    }

    private androidx.preference.MultiSelectListPreference Camera2StreamConfigurationMap() {
        return (androidx.preference.MultiSelectListPreference) getPreference();
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    protected void onPrepareDialogBuilder(androidx.appcompat.app.AlertDialog.Builder builder) {
        super.onPrepareDialogBuilder(builder);
        int length = this.getHighResolutionOutputSizeshNQ4ISI.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.getHighSpeedVideoFpsRanges.contains(this.getHighResolutionOutputSizeshNQ4ISI[i].toString());
        }
        builder.setMultiChoiceItems(this.Camera2StreamConfigurationMap, zArr, new android.content.DialogInterface.OnMultiChoiceClickListener() { // from class: androidx.preference.MultiSelectListPreferenceDialogFragmentCompat.1
            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i2, boolean z) {
                if (z) {
                    androidx.preference.MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat = androidx.preference.MultiSelectListPreferenceDialogFragmentCompat.this;
                    multiSelectListPreferenceDialogFragmentCompat.getHighSpeedVideoSizes = androidx.preference.MultiSelectListPreferenceDialogFragmentCompat.this.getHighSpeedVideoFpsRanges.add(androidx.preference.MultiSelectListPreferenceDialogFragmentCompat.this.getHighResolutionOutputSizeshNQ4ISI[i2].toString()) | multiSelectListPreferenceDialogFragmentCompat.getHighSpeedVideoSizes;
                } else {
                    androidx.preference.MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat2 = androidx.preference.MultiSelectListPreferenceDialogFragmentCompat.this;
                    multiSelectListPreferenceDialogFragmentCompat2.getHighSpeedVideoSizes = androidx.preference.MultiSelectListPreferenceDialogFragmentCompat.this.getHighSpeedVideoFpsRanges.remove(androidx.preference.MultiSelectListPreferenceDialogFragmentCompat.this.getHighResolutionOutputSizeshNQ4ISI[i2].toString()) | multiSelectListPreferenceDialogFragmentCompat2.getHighSpeedVideoSizes;
                }
            }
        });
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public void onDialogClosed(boolean z) {
        if (z && this.getHighSpeedVideoSizes) {
            androidx.preference.MultiSelectListPreference Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
            if (Camera2StreamConfigurationMap.callChangeListener(this.getHighSpeedVideoFpsRanges)) {
                Camera2StreamConfigurationMap.setValues(this.getHighSpeedVideoFpsRanges);
            }
        }
        this.getHighSpeedVideoSizes = false;
    }
}
