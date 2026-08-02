package androidx.preference;

/* loaded from: classes7.dex */
public class EditTextPreference extends androidx.preference.DialogPreference {
    androidx.preference.EditTextPreference.OnBindEditTextListener getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.String getHighSpeedVideoFpsRanges;

    public interface OnBindEditTextListener {
        void onBindEditText(android.widget.EditText editText);
    }

    public EditTextPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.preference.R.styleable.EditTextPreference, i, i2);
        int i3 = androidx.preference.R.styleable.EditTextPreference_useSimpleSummaryProvider;
        if (androidx.core.content.res.TypedArrayUtils.getBoolean(obtainStyledAttributes, i3, i3, false)) {
            setSummaryProvider(androidx.preference.EditTextPreference.SimpleSummaryProvider.getInstance());
        }
        obtainStyledAttributes.recycle();
    }

    public EditTextPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public EditTextPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.res.TypedArrayUtils.getAttr(context, androidx.preference.R.attr.editTextPreferenceStyle, android.R.attr.editTextPreferenceStyle));
    }

    public EditTextPreference(android.content.Context context) {
        this(context, null);
    }

    public void setText(java.lang.String str) {
        boolean shouldDisableDependents = shouldDisableDependents();
        this.getHighSpeedVideoFpsRanges = str;
        persistString(str);
        boolean shouldDisableDependents2 = shouldDisableDependents();
        if (shouldDisableDependents2 != shouldDisableDependents) {
            notifyDependencyChange(shouldDisableDependents2);
        }
        notifyChanged();
    }

    public java.lang.String getText() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.preference.Preference
    protected java.lang.Object onGetDefaultValue(android.content.res.TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    protected void onSetInitialValue(java.lang.Object obj) {
        setText(getPersistedString((java.lang.String) obj));
    }

    @Override // androidx.preference.Preference
    public boolean shouldDisableDependents() {
        return android.text.TextUtils.isEmpty(this.getHighSpeedVideoFpsRanges) || super.shouldDisableDependents();
    }

    @Override // androidx.preference.Preference
    protected android.os.Parcelable onSaveInstanceState() {
        android.os.Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (isPersistent()) {
            return onSaveInstanceState;
        }
        androidx.preference.EditTextPreference.SavedState savedState = new androidx.preference.EditTextPreference.SavedState(onSaveInstanceState);
        savedState.getHighSpeedVideoFpsRangesFor = getText();
        return savedState;
    }

    @Override // androidx.preference.Preference
    protected void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(androidx.preference.EditTextPreference.SavedState.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        androidx.preference.EditTextPreference.SavedState savedState = (androidx.preference.EditTextPreference.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setText(savedState.getHighSpeedVideoFpsRangesFor);
    }

    public void setOnBindEditTextListener(androidx.preference.EditTextPreference.OnBindEditTextListener onBindEditTextListener) {
        this.getHighResolutionOutputSizeshNQ4ISI = onBindEditTextListener;
    }

    static class SavedState extends androidx.preference.Preference.BaseSavedState {
        public static final android.os.Parcelable.Creator<androidx.preference.EditTextPreference.SavedState> CREATOR = new android.os.Parcelable.Creator<androidx.preference.EditTextPreference.SavedState>() { // from class: androidx.preference.EditTextPreference.SavedState.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ androidx.preference.EditTextPreference.SavedState createFromParcel(android.os.Parcel parcel) {
                return new androidx.preference.EditTextPreference.SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ androidx.preference.EditTextPreference.SavedState[] newArray(int i) {
                return new androidx.preference.EditTextPreference.SavedState[i];
            }
        };
        java.lang.String getHighSpeedVideoFpsRangesFor;

        SavedState(android.os.Parcel parcel) {
            super(parcel);
            this.getHighSpeedVideoFpsRangesFor = parcel.readString();
        }

        SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.getHighSpeedVideoFpsRangesFor);
        }
    }

    public static final class SimpleSummaryProvider implements androidx.preference.Preference.SummaryProvider<androidx.preference.EditTextPreference> {
        private static androidx.preference.EditTextPreference.SimpleSummaryProvider getHighResolutionOutputSizeshNQ4ISI;

        private SimpleSummaryProvider() {
        }

        public static androidx.preference.EditTextPreference.SimpleSummaryProvider getInstance() {
            if (getHighResolutionOutputSizeshNQ4ISI == null) {
                getHighResolutionOutputSizeshNQ4ISI = new androidx.preference.EditTextPreference.SimpleSummaryProvider();
            }
            return getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // androidx.preference.Preference.SummaryProvider
        public final java.lang.CharSequence provideSummary(androidx.preference.EditTextPreference editTextPreference) {
            if (android.text.TextUtils.isEmpty(editTextPreference.getText())) {
                return editTextPreference.getContext().getString(androidx.preference.R.string.not_set);
            }
            return editTextPreference.getText();
        }
    }
}
