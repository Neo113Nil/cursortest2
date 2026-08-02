package androidx.preference;

/* loaded from: classes7.dex */
public abstract class PreferenceGroup extends androidx.preference.Preference {
    private final java.lang.Runnable Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;
    final androidx.collection.SimpleArrayMap<java.lang.String, java.lang.Long> getHighSpeedVideoFpsRangesFor;
    java.util.List<androidx.preference.Preference> getHighSpeedVideoSizes;
    private boolean getHighSpeedVideoSizesFor;
    private final android.os.Handler getInputSizeshNQ4ISI;
    private int getOutputFormats;
    private androidx.preference.PreferenceGroup.OnExpandButtonClickListener getOutputMinFrameDuration;

    public interface OnExpandButtonClickListener {
        void onExpandButtonClick();
    }

    public interface PreferencePositionCallback {
        int getPreferenceAdapterPosition(androidx.preference.Preference preference);

        int getPreferenceAdapterPosition(java.lang.String str);
    }

    protected boolean isOnSameScreenAsChildren() {
        return true;
    }

    public PreferenceGroup(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.getHighSpeedVideoFpsRangesFor = new androidx.collection.SimpleArrayMap<>();
        this.getInputSizeshNQ4ISI = new android.os.Handler();
        this.getHighSpeedVideoSizesFor = true;
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
        this.getHighSpeedVideoFpsRanges = false;
        this.getOutputFormats = Integer.MAX_VALUE;
        this.getOutputMinFrameDuration = null;
        this.Camera2StreamConfigurationMap = new java.lang.Runnable() { // from class: androidx.preference.PreferenceGroup.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (this) {
                    androidx.preference.PreferenceGroup.this.getHighSpeedVideoFpsRangesFor.clear();
                }
            }
        };
        this.getHighSpeedVideoSizes = new java.util.ArrayList();
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.preference.R.styleable.PreferenceGroup, i, i2);
        this.getHighSpeedVideoSizesFor = androidx.core.content.res.TypedArrayUtils.getBoolean(obtainStyledAttributes, androidx.preference.R.styleable.PreferenceGroup_orderingFromXml, androidx.preference.R.styleable.PreferenceGroup_orderingFromXml, true);
        if (obtainStyledAttributes.hasValue(androidx.preference.R.styleable.PreferenceGroup_initialExpandedChildrenCount)) {
            int i3 = androidx.preference.R.styleable.PreferenceGroup_initialExpandedChildrenCount;
            setInitialExpandedChildrenCount(androidx.core.content.res.TypedArrayUtils.getInt(obtainStyledAttributes, i3, i3, Integer.MAX_VALUE));
        }
        obtainStyledAttributes.recycle();
    }

    public PreferenceGroup(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceGroup(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setOrderingAsAdded(boolean z) {
        this.getHighSpeedVideoSizesFor = z;
    }

    public boolean isOrderingAsAdded() {
        return this.getHighSpeedVideoSizesFor;
    }

    public void setInitialExpandedChildrenCount(int i) {
        if (i != Integer.MAX_VALUE) {
            hasKey();
        }
        this.getOutputFormats = i;
    }

    public int getInitialExpandedChildrenCount() {
        return this.getOutputFormats;
    }

    public void addItemFromInflater(androidx.preference.Preference preference) {
        addPreference(preference);
    }

    public int getPreferenceCount() {
        return this.getHighSpeedVideoSizes.size();
    }

    public androidx.preference.Preference getPreference(int i) {
        return this.getHighSpeedVideoSizes.get(i);
    }

    public boolean addPreference(androidx.preference.Preference preference) {
        long Camera2StreamConfigurationMap;
        if (this.getHighSpeedVideoSizes.contains(preference)) {
            return true;
        }
        if (preference.getKey() != null) {
            androidx.preference.PreferenceGroup preferenceGroup = this;
            while (preferenceGroup.getParent() != null) {
                preferenceGroup = preferenceGroup.getParent();
            }
            preferenceGroup.findPreference(preference.getKey());
        }
        if (preference.getOrder() == Integer.MAX_VALUE) {
            if (this.getHighSpeedVideoSizesFor) {
                int i = this.getHighResolutionOutputSizeshNQ4ISI;
                this.getHighResolutionOutputSizeshNQ4ISI = i + 1;
                preference.setOrder(i);
            }
            if (preference instanceof androidx.preference.PreferenceGroup) {
                ((androidx.preference.PreferenceGroup) preference).setOrderingAsAdded(this.getHighSpeedVideoSizesFor);
            }
        }
        int binarySearch = java.util.Collections.binarySearch(this.getHighSpeedVideoSizes, preference);
        if (binarySearch < 0) {
            binarySearch = (binarySearch * (-1)) - 1;
        }
        if (!onPrepareAddPreference(preference)) {
            return false;
        }
        synchronized (this) {
            this.getHighSpeedVideoSizes.add(binarySearch, preference);
        }
        androidx.preference.PreferenceManager preferenceManager = getPreferenceManager();
        java.lang.String key = preference.getKey();
        if (key != null && this.getHighSpeedVideoFpsRangesFor.containsKey(key)) {
            Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRangesFor.get(key).longValue();
            this.getHighSpeedVideoFpsRangesFor.remove(key);
        } else {
            Camera2StreamConfigurationMap = preferenceManager.Camera2StreamConfigurationMap();
        }
        preference.onAttachedToHierarchy(preferenceManager, Camera2StreamConfigurationMap);
        preference.getHighSpeedVideoFpsRanges(this);
        if (this.getHighSpeedVideoFpsRanges) {
            preference.onAttached();
        }
        notifyHierarchyChanged();
        return true;
    }

    public boolean removePreference(androidx.preference.Preference preference) {
        boolean highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(preference);
        notifyHierarchyChanged();
        return highResolutionOutputSizeshNQ4ISI;
    }

    public boolean removePreferenceRecursively(java.lang.CharSequence charSequence) {
        androidx.preference.Preference findPreference = findPreference(charSequence);
        if (findPreference == null) {
            return false;
        }
        return findPreference.getParent().removePreference(findPreference);
    }

    private boolean getHighResolutionOutputSizeshNQ4ISI(androidx.preference.Preference preference) {
        boolean remove;
        synchronized (this) {
            preference.onPrepareForRemoval();
            if (preference.getParent() == this) {
                preference.getHighSpeedVideoFpsRanges(null);
            }
            remove = this.getHighSpeedVideoSizes.remove(preference);
            if (remove) {
                java.lang.String key = preference.getKey();
                if (key != null) {
                    this.getHighSpeedVideoFpsRangesFor.put(key, java.lang.Long.valueOf(preference.getHighSpeedVideoFpsRanges()));
                    this.getInputSizeshNQ4ISI.removeCallbacks(this.Camera2StreamConfigurationMap);
                    this.getInputSizeshNQ4ISI.post(this.Camera2StreamConfigurationMap);
                }
                if (this.getHighSpeedVideoFpsRanges) {
                    preference.onDetached();
                }
            }
        }
        return remove;
    }

    public void removeAll() {
        synchronized (this) {
            java.util.List<androidx.preference.Preference> list = this.getHighSpeedVideoSizes;
            for (int size = list.size() - 1; size >= 0; size--) {
                getHighResolutionOutputSizeshNQ4ISI(list.get(0));
            }
        }
        notifyHierarchyChanged();
    }

    protected boolean onPrepareAddPreference(androidx.preference.Preference preference) {
        preference.onParentChanged(this, shouldDisableDependents());
        return true;
    }

    public <T extends androidx.preference.Preference> T findPreference(java.lang.CharSequence charSequence) {
        T t;
        if (charSequence == null) {
            throw new java.lang.IllegalArgumentException("Key cannot be null");
        }
        if (android.text.TextUtils.equals(getKey(), charSequence)) {
            return this;
        }
        int preferenceCount = getPreferenceCount();
        for (int i = 0; i < preferenceCount; i++) {
            androidx.preference.PreferenceGroup preferenceGroup = (T) getPreference(i);
            if (android.text.TextUtils.equals(preferenceGroup.getKey(), charSequence)) {
                return preferenceGroup;
            }
            if ((preferenceGroup instanceof androidx.preference.PreferenceGroup) && (t = (T) preferenceGroup.findPreference(charSequence)) != null) {
                return t;
            }
        }
        return null;
    }

    public boolean isAttached() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void setOnExpandButtonClickListener(androidx.preference.PreferenceGroup.OnExpandButtonClickListener onExpandButtonClickListener) {
        this.getOutputMinFrameDuration = onExpandButtonClickListener;
    }

    public androidx.preference.PreferenceGroup.OnExpandButtonClickListener getOnExpandButtonClickListener() {
        return this.getOutputMinFrameDuration;
    }

    @Override // androidx.preference.Preference
    public void onAttached() {
        super.onAttached();
        this.getHighSpeedVideoFpsRanges = true;
        int preferenceCount = getPreferenceCount();
        for (int i = 0; i < preferenceCount; i++) {
            getPreference(i).onAttached();
        }
    }

    @Override // androidx.preference.Preference
    public void onDetached() {
        super.onDetached();
        this.getHighSpeedVideoFpsRanges = false;
        int preferenceCount = getPreferenceCount();
        for (int i = 0; i < preferenceCount; i++) {
            getPreference(i).onDetached();
        }
    }

    @Override // androidx.preference.Preference
    public void notifyDependencyChange(boolean z) {
        super.notifyDependencyChange(z);
        int preferenceCount = getPreferenceCount();
        for (int i = 0; i < preferenceCount; i++) {
            getPreference(i).onParentChanged(this, z);
        }
    }

    @Override // androidx.preference.Preference
    protected void dispatchSaveInstanceState(android.os.Bundle bundle) {
        super.dispatchSaveInstanceState(bundle);
        int preferenceCount = getPreferenceCount();
        for (int i = 0; i < preferenceCount; i++) {
            getPreference(i).dispatchSaveInstanceState(bundle);
        }
    }

    @Override // androidx.preference.Preference
    protected void dispatchRestoreInstanceState(android.os.Bundle bundle) {
        super.dispatchRestoreInstanceState(bundle);
        int preferenceCount = getPreferenceCount();
        for (int i = 0; i < preferenceCount; i++) {
            getPreference(i).dispatchRestoreInstanceState(bundle);
        }
    }

    @Override // androidx.preference.Preference
    protected android.os.Parcelable onSaveInstanceState() {
        return new androidx.preference.PreferenceGroup.SavedState(super.onSaveInstanceState(), this.getOutputFormats);
    }

    @Override // androidx.preference.Preference
    protected void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(androidx.preference.PreferenceGroup.SavedState.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        androidx.preference.PreferenceGroup.SavedState savedState = (androidx.preference.PreferenceGroup.SavedState) parcelable;
        this.getOutputFormats = savedState.getHighSpeedVideoSizes;
        super.onRestoreInstanceState(savedState.getSuperState());
    }

    static class SavedState extends androidx.preference.Preference.BaseSavedState {
        public static final android.os.Parcelable.Creator<androidx.preference.PreferenceGroup.SavedState> CREATOR = new android.os.Parcelable.Creator<androidx.preference.PreferenceGroup.SavedState>() { // from class: androidx.preference.PreferenceGroup.SavedState.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ androidx.preference.PreferenceGroup.SavedState createFromParcel(android.os.Parcel parcel) {
                return new androidx.preference.PreferenceGroup.SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ androidx.preference.PreferenceGroup.SavedState[] newArray(int i) {
                return new androidx.preference.PreferenceGroup.SavedState[i];
            }
        };
        int getHighSpeedVideoSizes;

        SavedState(android.os.Parcel parcel) {
            super(parcel);
            this.getHighSpeedVideoSizes = parcel.readInt();
        }

        SavedState(android.os.Parcelable parcelable, int i) {
            super(parcelable);
            this.getHighSpeedVideoSizes = i;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.getHighSpeedVideoSizes);
        }
    }
}
