package androidx.preference;

/* loaded from: classes7.dex */
public abstract class TwoStatePreference extends androidx.preference.Preference {
    private java.lang.CharSequence Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;
    private java.lang.CharSequence getHighSpeedVideoFpsRangesFor;
    protected boolean mChecked;

    public TwoStatePreference(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public TwoStatePreference(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public TwoStatePreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TwoStatePreference(android.content.Context context) {
        this(context, null);
    }

    @Override // androidx.preference.Preference
    protected void onClick() {
        super.onClick();
        boolean z = !isChecked();
        if (callChangeListener(java.lang.Boolean.valueOf(z))) {
            setChecked(z);
        }
    }

    public boolean isChecked() {
        return this.mChecked;
    }

    public void setChecked(boolean z) {
        boolean z2 = this.mChecked != z;
        if (z2 || !this.getHighResolutionOutputSizeshNQ4ISI) {
            this.mChecked = z;
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            persistBoolean(z);
            if (z2) {
                notifyDependencyChange(shouldDisableDependents());
                notifyChanged();
            }
        }
    }

    @Override // androidx.preference.Preference
    public boolean shouldDisableDependents() {
        if (this.getHighSpeedVideoFpsRanges) {
            if (this.mChecked) {
                return true;
            }
        } else if (!this.mChecked) {
            return true;
        }
        return super.shouldDisableDependents();
    }

    public void setSummaryOn(java.lang.CharSequence charSequence) {
        this.Camera2StreamConfigurationMap = charSequence;
        if (isChecked()) {
            notifyChanged();
        }
    }

    public java.lang.CharSequence getSummaryOn() {
        return this.Camera2StreamConfigurationMap;
    }

    public void setSummaryOn(int i) {
        setSummaryOn(getContext().getString(i));
    }

    public void setSummaryOff(java.lang.CharSequence charSequence) {
        this.getHighSpeedVideoFpsRangesFor = charSequence;
        if (isChecked()) {
            return;
        }
        notifyChanged();
    }

    public java.lang.CharSequence getSummaryOff() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void setSummaryOff(int i) {
        setSummaryOff(getContext().getString(i));
    }

    public boolean getDisableDependentsState() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void setDisableDependentsState(boolean z) {
        this.getHighSpeedVideoFpsRanges = z;
    }

    @Override // androidx.preference.Preference
    protected java.lang.Object onGetDefaultValue(android.content.res.TypedArray typedArray, int i) {
        return java.lang.Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    @Override // androidx.preference.Preference
    protected void onSetInitialValue(java.lang.Object obj) {
        if (obj == null) {
            obj = java.lang.Boolean.FALSE;
        }
        setChecked(getPersistedBoolean(((java.lang.Boolean) obj).booleanValue()));
    }

    protected void syncSummaryView(androidx.preference.PreferenceViewHolder preferenceViewHolder) {
        syncSummaryView(preferenceViewHolder.findViewById(android.R.id.summary));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        if (r0 == false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void syncSummaryView(android.view.View view) {
        boolean z;
        if (!(view instanceof android.widget.TextView)) {
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) view;
        int i = 0;
        if (this.mChecked && !android.text.TextUtils.isEmpty(this.Camera2StreamConfigurationMap)) {
            textView.setText(this.Camera2StreamConfigurationMap);
        } else if (!this.mChecked && !android.text.TextUtils.isEmpty(this.getHighSpeedVideoFpsRangesFor)) {
            textView.setText(this.getHighSpeedVideoFpsRangesFor);
        } else {
            z = true;
            if (!z) {
                java.lang.CharSequence summary = getSummary();
                if (!android.text.TextUtils.isEmpty(summary)) {
                    textView.setText(summary);
                }
                i = 8;
            }
            if (i == textView.getVisibility()) {
                textView.setVisibility(i);
                return;
            }
            return;
        }
        z = false;
        if (!z) {
        }
        if (i == textView.getVisibility()) {
        }
    }

    @Override // androidx.preference.Preference
    protected android.os.Parcelable onSaveInstanceState() {
        android.os.Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (isPersistent()) {
            return onSaveInstanceState;
        }
        androidx.preference.TwoStatePreference.SavedState savedState = new androidx.preference.TwoStatePreference.SavedState(onSaveInstanceState);
        savedState.Camera2StreamConfigurationMap = isChecked();
        return savedState;
    }

    @Override // androidx.preference.Preference
    protected void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(androidx.preference.TwoStatePreference.SavedState.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        androidx.preference.TwoStatePreference.SavedState savedState = (androidx.preference.TwoStatePreference.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setChecked(savedState.Camera2StreamConfigurationMap);
    }

    static class SavedState extends androidx.preference.Preference.BaseSavedState {
        public static final android.os.Parcelable.Creator<androidx.preference.TwoStatePreference.SavedState> CREATOR = new android.os.Parcelable.Creator<androidx.preference.TwoStatePreference.SavedState>() { // from class: androidx.preference.TwoStatePreference.SavedState.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ androidx.preference.TwoStatePreference.SavedState createFromParcel(android.os.Parcel parcel) {
                return new androidx.preference.TwoStatePreference.SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ androidx.preference.TwoStatePreference.SavedState[] newArray(int i) {
                return new androidx.preference.TwoStatePreference.SavedState[i];
            }
        };
        boolean Camera2StreamConfigurationMap;

        SavedState(android.os.Parcel parcel) {
            super(parcel);
            this.Camera2StreamConfigurationMap = parcel.readInt() == 1;
        }

        SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.Camera2StreamConfigurationMap ? 1 : 0);
        }
    }
}
