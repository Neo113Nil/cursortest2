package androidx.preference;

/* loaded from: classes7.dex */
public class DropDownPreference extends androidx.preference.ListPreference {
    private android.widget.Spinner Camera2StreamConfigurationMap;
    private final android.content.Context getHighSpeedVideoFpsRanges;
    private final android.widget.ArrayAdapter getHighSpeedVideoFpsRangesFor;
    private final android.widget.AdapterView.OnItemSelectedListener getHighSpeedVideoSizes;

    public DropDownPreference(android.content.Context context) {
        this(context, null);
    }

    public DropDownPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, androidx.preference.R.attr.dropdownPreferenceStyle);
    }

    public DropDownPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DropDownPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.getHighSpeedVideoSizes = new android.widget.AdapterView.OnItemSelectedListener() { // from class: androidx.preference.DropDownPreference.1
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(android.widget.AdapterView<?> adapterView) {
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(android.widget.AdapterView<?> adapterView, android.view.View view, int i3, long j) {
                if (i3 >= 0) {
                    java.lang.String obj = androidx.preference.DropDownPreference.this.getEntryValues()[i3].toString();
                    if (obj.equals(androidx.preference.DropDownPreference.this.getValue()) || !androidx.preference.DropDownPreference.this.callChangeListener(obj)) {
                        return;
                    }
                    androidx.preference.DropDownPreference.this.setValue(obj);
                }
            }
        };
        this.getHighSpeedVideoFpsRanges = context;
        this.getHighSpeedVideoFpsRangesFor = createAdapter();
        getOutputFormats();
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    protected void onClick() {
        this.Camera2StreamConfigurationMap.performClick();
    }

    @Override // androidx.preference.ListPreference
    public void setEntries(java.lang.CharSequence[] charSequenceArr) {
        super.setEntries(charSequenceArr);
        getOutputFormats();
    }

    protected android.widget.ArrayAdapter createAdapter() {
        return new android.widget.ArrayAdapter(this.getHighSpeedVideoFpsRanges, android.R.layout.simple_spinner_dropdown_item);
    }

    private void getOutputFormats() {
        this.getHighSpeedVideoFpsRangesFor.clear();
        if (getEntries() != null) {
            for (java.lang.CharSequence charSequence : getEntries()) {
                this.getHighSpeedVideoFpsRangesFor.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.ListPreference
    public void setValueIndex(int i) {
        setValue(getEntryValues()[i].toString());
    }

    @Override // androidx.preference.Preference
    protected void notifyChanged() {
        super.notifyChanged();
        android.widget.ArrayAdapter arrayAdapter = this.getHighSpeedVideoFpsRangesFor;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(androidx.preference.PreferenceViewHolder preferenceViewHolder) {
        int i;
        android.widget.Spinner spinner = (android.widget.Spinner) preferenceViewHolder.itemView.findViewById(androidx.preference.R.id.spinner);
        this.Camera2StreamConfigurationMap = spinner;
        spinner.setAdapter((android.widget.SpinnerAdapter) this.getHighSpeedVideoFpsRangesFor);
        this.Camera2StreamConfigurationMap.setOnItemSelectedListener(this.getHighSpeedVideoSizes);
        android.widget.Spinner spinner2 = this.Camera2StreamConfigurationMap;
        java.lang.String value = getValue();
        java.lang.CharSequence[] entryValues = getEntryValues();
        if (value != null && entryValues != null) {
            i = entryValues.length - 1;
            while (i >= 0) {
                if (entryValues[i].equals(value)) {
                    break;
                } else {
                    i--;
                }
            }
        }
        i = -1;
        spinner2.setSelection(i);
        super.onBindViewHolder(preferenceViewHolder);
    }
}
