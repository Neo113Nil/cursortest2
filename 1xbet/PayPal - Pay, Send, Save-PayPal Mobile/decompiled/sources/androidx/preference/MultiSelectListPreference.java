package androidx.preference;

/* loaded from: classes7.dex */
public class MultiSelectListPreference extends androidx.preference.DialogPreference {
    private java.lang.CharSequence[] Camera2StreamConfigurationMap;
    private java.util.Set<java.lang.String> getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.CharSequence[] getHighSpeedVideoFpsRangesFor;

    public MultiSelectListPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.HashSet();
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.preference.R.styleable.MultiSelectListPreference, i, i2);
        this.getHighSpeedVideoFpsRangesFor = androidx.core.content.res.TypedArrayUtils.getTextArray(obtainStyledAttributes, androidx.preference.R.styleable.MultiSelectListPreference_entries, androidx.preference.R.styleable.MultiSelectListPreference_android_entries);
        this.Camera2StreamConfigurationMap = androidx.core.content.res.TypedArrayUtils.getTextArray(obtainStyledAttributes, androidx.preference.R.styleable.MultiSelectListPreference_entryValues, androidx.preference.R.styleable.MultiSelectListPreference_android_entryValues);
        obtainStyledAttributes.recycle();
    }

    public MultiSelectListPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MultiSelectListPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.res.TypedArrayUtils.getAttr(context, androidx.preference.R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }

    public MultiSelectListPreference(android.content.Context context) {
        this(context, null);
    }

    public void setEntries(java.lang.CharSequence[] charSequenceArr) {
        this.getHighSpeedVideoFpsRangesFor = charSequenceArr;
    }

    public void setEntries(int i) {
        setEntries(getContext().getResources().getTextArray(i));
    }

    public java.lang.CharSequence[] getEntries() {
        return this.getHighSpeedVideoFpsRangesFor;
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

    public void setValues(java.util.Set<java.lang.String> set) {
        this.getHighResolutionOutputSizeshNQ4ISI.clear();
        this.getHighResolutionOutputSizeshNQ4ISI.addAll(set);
        persistStringSet(set);
        notifyChanged();
    }

    public java.util.Set<java.lang.String> getValues() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
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

    protected boolean[] getSelectedItems() {
        java.lang.CharSequence[] charSequenceArr = this.Camera2StreamConfigurationMap;
        int length = charSequenceArr.length;
        java.util.Set<java.lang.String> set = this.getHighResolutionOutputSizeshNQ4ISI;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = set.contains(charSequenceArr[i].toString());
        }
        return zArr;
    }

    @Override // androidx.preference.Preference
    protected java.lang.Object onGetDefaultValue(android.content.res.TypedArray typedArray, int i) {
        java.lang.CharSequence[] textArray = typedArray.getTextArray(i);
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.lang.CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    @Override // androidx.preference.Preference
    protected void onSetInitialValue(java.lang.Object obj) {
        setValues(getPersistedStringSet((java.util.Set) obj));
    }

    @Override // androidx.preference.Preference
    protected android.os.Parcelable onSaveInstanceState() {
        android.os.Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (isPersistent()) {
            return onSaveInstanceState;
        }
        androidx.preference.MultiSelectListPreference.SavedState savedState = new androidx.preference.MultiSelectListPreference.SavedState(onSaveInstanceState);
        savedState.getHighSpeedVideoFpsRanges = getValues();
        return savedState;
    }

    @Override // androidx.preference.Preference
    protected void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(androidx.preference.MultiSelectListPreference.SavedState.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        androidx.preference.MultiSelectListPreference.SavedState savedState = (androidx.preference.MultiSelectListPreference.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setValues(savedState.getHighSpeedVideoFpsRanges);
    }

    static class SavedState extends androidx.preference.Preference.BaseSavedState {
        public static final android.os.Parcelable.Creator<androidx.preference.MultiSelectListPreference.SavedState> CREATOR = new android.os.Parcelable.Creator<androidx.preference.MultiSelectListPreference.SavedState>() { // from class: androidx.preference.MultiSelectListPreference.SavedState.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ androidx.preference.MultiSelectListPreference.SavedState createFromParcel(android.os.Parcel parcel) {
                return new androidx.preference.MultiSelectListPreference.SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ androidx.preference.MultiSelectListPreference.SavedState[] newArray(int i) {
                return new androidx.preference.MultiSelectListPreference.SavedState[i];
            }
        };
        java.util.Set<java.lang.String> getHighSpeedVideoFpsRanges;

        SavedState(android.os.Parcel parcel) {
            super(parcel);
            int readInt = parcel.readInt();
            this.getHighSpeedVideoFpsRanges = new java.util.HashSet();
            java.lang.String[] strArr = new java.lang.String[readInt];
            parcel.readStringArray(strArr);
            java.util.Collections.addAll(this.getHighSpeedVideoFpsRanges, strArr);
        }

        SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.getHighSpeedVideoFpsRanges.size());
            java.util.Set<java.lang.String> set = this.getHighSpeedVideoFpsRanges;
            parcel.writeStringArray((java.lang.String[]) set.toArray(new java.lang.String[set.size()]));
        }
    }
}
