package androidx.preference;

/* loaded from: classes7.dex */
public class ListPreference extends androidx.preference.DialogPreference {
    private java.lang.CharSequence[] Camera2StreamConfigurationMap;
    private java.lang.CharSequence[] getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.String getHighSpeedVideoFpsRanges;
    private java.lang.String getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes;

    public ListPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.preference.R.styleable.ListPreference, i, i2);
        this.getHighResolutionOutputSizeshNQ4ISI = androidx.core.content.res.TypedArrayUtils.getTextArray(obtainStyledAttributes, androidx.preference.R.styleable.ListPreference_entries, androidx.preference.R.styleable.ListPreference_android_entries);
        this.Camera2StreamConfigurationMap = androidx.core.content.res.TypedArrayUtils.getTextArray(obtainStyledAttributes, androidx.preference.R.styleable.ListPreference_entryValues, androidx.preference.R.styleable.ListPreference_android_entryValues);
        int i3 = androidx.preference.R.styleable.ListPreference_useSimpleSummaryProvider;
        if (androidx.core.content.res.TypedArrayUtils.getBoolean(obtainStyledAttributes, i3, i3, false)) {
            setSummaryProvider(androidx.preference.ListPreference.SimpleSummaryProvider.getInstance());
        }
        obtainStyledAttributes.recycle();
        android.content.res.TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, androidx.preference.R.styleable.Preference, i, i2);
        this.getHighSpeedVideoFpsRangesFor = androidx.core.content.res.TypedArrayUtils.getString(obtainStyledAttributes2, androidx.preference.R.styleable.Preference_summary, androidx.preference.R.styleable.Preference_android_summary);
        obtainStyledAttributes2.recycle();
    }

    public ListPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.res.TypedArrayUtils.getAttr(context, androidx.preference.R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }

    public ListPreference(android.content.Context context) {
        this(context, null);
    }

    public void setEntries(java.lang.CharSequence[] charSequenceArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = charSequenceArr;
    }

    public void setEntries(int i) {
        setEntries(getContext().getResources().getTextArray(i));
    }

    public java.lang.CharSequence[] getEntries() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void setEntryValues(java.lang.CharSequence[] charSequenceArr) {
        this.Camera2StreamConfigurationMap = charSequenceArr;
    }

    public void setEntryValues(int i) {
        setEntryValues(getContext().getResources().getTextArray(i));
    }

    public java.lang.CharSequence[] getEntryValues() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.preference.Preference
    public void setSummary(java.lang.CharSequence charSequence) {
        super.setSummary(charSequence);
        if (charSequence == null && this.getHighSpeedVideoFpsRangesFor != null) {
            this.getHighSpeedVideoFpsRangesFor = null;
        } else {
            if (charSequence == null || charSequence.equals(this.getHighSpeedVideoFpsRangesFor)) {
                return;
            }
            this.getHighSpeedVideoFpsRangesFor = charSequence.toString();
        }
    }

    @Override // androidx.preference.Preference
    public java.lang.CharSequence getSummary() {
        if (getSummaryProvider() != null) {
            return getSummaryProvider().provideSummary(this);
        }
        java.lang.CharSequence entry = getEntry();
        java.lang.CharSequence summary = super.getSummary();
        java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
        if (str != null) {
            if (entry == null) {
                entry = "";
            }
            java.lang.String format = java.lang.String.format(str, entry);
            if (!android.text.TextUtils.equals(format, summary)) {
                return format;
            }
        }
        return summary;
    }

    public void setValue(java.lang.String str) {
        boolean equals = android.text.TextUtils.equals(this.getHighSpeedVideoFpsRanges, str);
        if (equals && this.getHighSpeedVideoSizes) {
            return;
        }
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighSpeedVideoSizes = true;
        persistString(str);
        if (equals) {
            return;
        }
        notifyChanged();
    }

    public java.lang.String getValue() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public int findIndexOfValue(java.lang.String str) {
        java.lang.CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.Camera2StreamConfigurationMap) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (this.Camera2StreamConfigurationMap[length].equals(str)) {
                return length;
            }
        }
        return -1;
    }

    public void setValueIndex(int i) {
        java.lang.CharSequence[] charSequenceArr = this.Camera2StreamConfigurationMap;
        if (charSequenceArr != null) {
            setValue(charSequenceArr[i].toString());
        }
    }

    @Override // androidx.preference.Preference
    protected java.lang.Object onGetDefaultValue(android.content.res.TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    protected void onSetInitialValue(java.lang.Object obj) {
        setValue(getPersistedString((java.lang.String) obj));
    }

    @Override // androidx.preference.Preference
    protected android.os.Parcelable onSaveInstanceState() {
        android.os.Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (isPersistent()) {
            return onSaveInstanceState;
        }
        androidx.preference.ListPreference.SavedState savedState = new androidx.preference.ListPreference.SavedState(onSaveInstanceState);
        savedState.getHighResolutionOutputSizeshNQ4ISI = getValue();
        return savedState;
    }

    @Override // androidx.preference.Preference
    protected void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(androidx.preference.ListPreference.SavedState.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        androidx.preference.ListPreference.SavedState savedState = (androidx.preference.ListPreference.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setValue(savedState.getHighResolutionOutputSizeshNQ4ISI);
    }

    static class SavedState extends androidx.preference.Preference.BaseSavedState {
        public static final android.os.Parcelable.Creator<androidx.preference.ListPreference.SavedState> CREATOR = new android.os.Parcelable.Creator<androidx.preference.ListPreference.SavedState>() { // from class: androidx.preference.ListPreference.SavedState.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ androidx.preference.ListPreference.SavedState createFromParcel(android.os.Parcel parcel) {
                return new androidx.preference.ListPreference.SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ androidx.preference.ListPreference.SavedState[] newArray(int i) {
                return new androidx.preference.ListPreference.SavedState[i];
            }
        };
        java.lang.String getHighResolutionOutputSizeshNQ4ISI;

        SavedState(android.os.Parcel parcel) {
            super(parcel);
            this.getHighResolutionOutputSizeshNQ4ISI = parcel.readString();
        }

        SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.getHighResolutionOutputSizeshNQ4ISI);
        }
    }

    public static final class SimpleSummaryProvider implements androidx.preference.Preference.SummaryProvider<androidx.preference.ListPreference> {
        private static androidx.preference.ListPreference.SimpleSummaryProvider Camera2StreamConfigurationMap;

        private SimpleSummaryProvider() {
        }

        public static androidx.preference.ListPreference.SimpleSummaryProvider getInstance() {
            if (Camera2StreamConfigurationMap == null) {
                Camera2StreamConfigurationMap = new androidx.preference.ListPreference.SimpleSummaryProvider();
            }
            return Camera2StreamConfigurationMap;
        }

        @Override // androidx.preference.Preference.SummaryProvider
        public final java.lang.CharSequence provideSummary(androidx.preference.ListPreference listPreference) {
            if (android.text.TextUtils.isEmpty(listPreference.getEntry())) {
                return listPreference.getContext().getString(androidx.preference.R.string.not_set);
            }
            return listPreference.getEntry();
        }
    }

    public java.lang.CharSequence getEntry() {
        java.lang.CharSequence[] charSequenceArr;
        int findIndexOfValue = findIndexOfValue(this.getHighSpeedVideoFpsRanges);
        if (findIndexOfValue < 0 || (charSequenceArr = this.getHighResolutionOutputSizeshNQ4ISI) == null) {
            return null;
        }
        return charSequenceArr[findIndexOfValue];
    }
}
