package androidx.preference;

/* loaded from: classes7.dex */
public class SeekBarPreference extends androidx.preference.Preference {
    int Camera2StreamConfigurationMap;
    android.widget.TextView getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    boolean getHighSpeedVideoFpsRangesFor;
    android.widget.SeekBar getHighSpeedVideoSizes;
    private android.widget.SeekBar.OnSeekBarChangeListener getHighSpeedVideoSizesFor;
    boolean getInputFormats;
    private int getInputSizeshNQ4ISI;
    private int getOutputFormats;
    boolean getOutputMinFrameDuration;
    private boolean getOutputSizes;
    private android.view.View.OnKeyListener getOutputSizeshNQ4ISI;

    public SeekBarPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.getHighSpeedVideoSizesFor = new android.widget.SeekBar.OnSeekBarChangeListener() { // from class: androidx.preference.SeekBarPreference.1
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(android.widget.SeekBar seekBar, int i3, boolean z) {
                if (z && (androidx.preference.SeekBarPreference.this.getInputFormats || !androidx.preference.SeekBarPreference.this.getOutputMinFrameDuration)) {
                    androidx.preference.SeekBarPreference.this.Camera2StreamConfigurationMap(seekBar);
                    return;
                }
                androidx.preference.SeekBarPreference seekBarPreference = androidx.preference.SeekBarPreference.this;
                int i4 = i3 + seekBarPreference.getHighSpeedVideoFpsRanges;
                android.widget.TextView textView = seekBarPreference.getHighResolutionOutputSizeshNQ4ISI;
                if (textView != null) {
                    textView.setText(java.lang.String.valueOf(i4));
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
                androidx.preference.SeekBarPreference.this.getOutputMinFrameDuration = true;
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
                androidx.preference.SeekBarPreference.this.getOutputMinFrameDuration = false;
                if (seekBar.getProgress() + androidx.preference.SeekBarPreference.this.getHighSpeedVideoFpsRanges != androidx.preference.SeekBarPreference.this.Camera2StreamConfigurationMap) {
                    androidx.preference.SeekBarPreference.this.Camera2StreamConfigurationMap(seekBar);
                }
            }
        };
        this.getOutputSizeshNQ4ISI = new android.view.View.OnKeyListener() { // from class: androidx.preference.SeekBarPreference.2
            @Override // android.view.View.OnKeyListener
            public boolean onKey(android.view.View view, int i3, android.view.KeyEvent keyEvent) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                if ((!androidx.preference.SeekBarPreference.this.getHighSpeedVideoFpsRangesFor && (i3 == 21 || i3 == 22)) || i3 == 23 || i3 == 66 || androidx.preference.SeekBarPreference.this.getHighSpeedVideoSizes == null) {
                    return false;
                }
                return androidx.preference.SeekBarPreference.this.getHighSpeedVideoSizes.onKeyDown(i3, keyEvent);
            }
        };
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.preference.R.styleable.SeekBarPreference, i, i2);
        this.getHighSpeedVideoFpsRanges = obtainStyledAttributes.getInt(androidx.preference.R.styleable.SeekBarPreference_min, 0);
        setMax(obtainStyledAttributes.getInt(androidx.preference.R.styleable.SeekBarPreference_android_max, 100));
        setSeekBarIncrement(obtainStyledAttributes.getInt(androidx.preference.R.styleable.SeekBarPreference_seekBarIncrement, 0));
        this.getHighSpeedVideoFpsRangesFor = obtainStyledAttributes.getBoolean(androidx.preference.R.styleable.SeekBarPreference_adjustable, true);
        this.getOutputSizes = obtainStyledAttributes.getBoolean(androidx.preference.R.styleable.SeekBarPreference_showSeekBarValue, false);
        this.getInputFormats = obtainStyledAttributes.getBoolean(androidx.preference.R.styleable.SeekBarPreference_updatesContinuously, false);
        obtainStyledAttributes.recycle();
    }

    public SeekBarPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SeekBarPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, androidx.preference.R.attr.seekBarPreferenceStyle);
    }

    public SeekBarPreference(android.content.Context context) {
        this(context, null);
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(androidx.preference.PreferenceViewHolder preferenceViewHolder) {
        super.onBindViewHolder(preferenceViewHolder);
        preferenceViewHolder.itemView.setOnKeyListener(this.getOutputSizeshNQ4ISI);
        this.getHighSpeedVideoSizes = (android.widget.SeekBar) preferenceViewHolder.findViewById(androidx.preference.R.id.seekbar);
        android.widget.TextView textView = (android.widget.TextView) preferenceViewHolder.findViewById(androidx.preference.R.id.seekbar_value);
        this.getHighResolutionOutputSizeshNQ4ISI = textView;
        if (this.getOutputSizes) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.getHighResolutionOutputSizeshNQ4ISI = null;
        }
        android.widget.SeekBar seekBar = this.getHighSpeedVideoSizes;
        if (seekBar == null) {
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.getHighSpeedVideoSizesFor);
        this.getHighSpeedVideoSizes.setMax(this.getInputSizeshNQ4ISI - this.getHighSpeedVideoFpsRanges);
        int i = this.getOutputFormats;
        if (i != 0) {
            this.getHighSpeedVideoSizes.setKeyProgressIncrement(i);
        } else {
            this.getOutputFormats = this.getHighSpeedVideoSizes.getKeyProgressIncrement();
        }
        this.getHighSpeedVideoSizes.setProgress(this.Camera2StreamConfigurationMap - this.getHighSpeedVideoFpsRanges);
        int i2 = this.Camera2StreamConfigurationMap;
        android.widget.TextView textView2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (textView2 != null) {
            textView2.setText(java.lang.String.valueOf(i2));
        }
        this.getHighSpeedVideoSizes.setEnabled(isEnabled());
    }

    @Override // androidx.preference.Preference
    protected void onSetInitialValue(java.lang.Object obj) {
        if (obj == null) {
            obj = 0;
        }
        setValue(getPersistedInt(((java.lang.Integer) obj).intValue()));
    }

    @Override // androidx.preference.Preference
    protected java.lang.Object onGetDefaultValue(android.content.res.TypedArray typedArray, int i) {
        return java.lang.Integer.valueOf(typedArray.getInt(i, 0));
    }

    public int getMin() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void setMin(int i) {
        int i2 = this.getInputSizeshNQ4ISI;
        if (i > i2) {
            i = i2;
        }
        if (i != this.getHighSpeedVideoFpsRanges) {
            this.getHighSpeedVideoFpsRanges = i;
            notifyChanged();
        }
    }

    public final int getSeekBarIncrement() {
        return this.getOutputFormats;
    }

    public final void setSeekBarIncrement(int i) {
        if (i != this.getOutputFormats) {
            this.getOutputFormats = java.lang.Math.min(this.getInputSizeshNQ4ISI - this.getHighSpeedVideoFpsRanges, java.lang.Math.abs(i));
            notifyChanged();
        }
    }

    public int getMax() {
        return this.getInputSizeshNQ4ISI;
    }

    public final void setMax(int i) {
        int i2 = this.getHighSpeedVideoFpsRanges;
        if (i < i2) {
            i = i2;
        }
        if (i != this.getInputSizeshNQ4ISI) {
            this.getInputSizeshNQ4ISI = i;
            notifyChanged();
        }
    }

    public boolean isAdjustable() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void setAdjustable(boolean z) {
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    public boolean getUpdatesContinuously() {
        return this.getInputFormats;
    }

    public void setUpdatesContinuously(boolean z) {
        this.getInputFormats = z;
    }

    public boolean getShowSeekBarValue() {
        return this.getOutputSizes;
    }

    public void setShowSeekBarValue(boolean z) {
        this.getOutputSizes = z;
        notifyChanged();
    }

    private void getHighSpeedVideoFpsRangesFor(int i, boolean z) {
        int i2 = this.getHighSpeedVideoFpsRanges;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.getInputSizeshNQ4ISI;
        if (i > i3) {
            i = i3;
        }
        if (i != this.Camera2StreamConfigurationMap) {
            this.Camera2StreamConfigurationMap = i;
            android.widget.TextView textView = this.getHighResolutionOutputSizeshNQ4ISI;
            if (textView != null) {
                textView.setText(java.lang.String.valueOf(i));
            }
            persistInt(i);
            if (z) {
                notifyChanged();
            }
        }
    }

    public int getValue() {
        return this.Camera2StreamConfigurationMap;
    }

    public void setValue(int i) {
        getHighSpeedVideoFpsRangesFor(i, true);
    }

    final void Camera2StreamConfigurationMap(android.widget.SeekBar seekBar) {
        int progress = this.getHighSpeedVideoFpsRanges + seekBar.getProgress();
        if (progress != this.Camera2StreamConfigurationMap) {
            if (callChangeListener(java.lang.Integer.valueOf(progress))) {
                getHighSpeedVideoFpsRangesFor(progress, false);
                return;
            }
            seekBar.setProgress(this.Camera2StreamConfigurationMap - this.getHighSpeedVideoFpsRanges);
            int i = this.Camera2StreamConfigurationMap;
            android.widget.TextView textView = this.getHighResolutionOutputSizeshNQ4ISI;
            if (textView != null) {
                textView.setText(java.lang.String.valueOf(i));
            }
        }
    }

    @Override // androidx.preference.Preference
    protected android.os.Parcelable onSaveInstanceState() {
        android.os.Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (isPersistent()) {
            return onSaveInstanceState;
        }
        androidx.preference.SeekBarPreference.SavedState savedState = new androidx.preference.SeekBarPreference.SavedState(onSaveInstanceState);
        savedState.getHighResolutionOutputSizeshNQ4ISI = this.Camera2StreamConfigurationMap;
        savedState.Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRanges;
        savedState.getHighSpeedVideoFpsRangesFor = this.getInputSizeshNQ4ISI;
        return savedState;
    }

    @Override // androidx.preference.Preference
    protected void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!parcelable.getClass().equals(androidx.preference.SeekBarPreference.SavedState.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        androidx.preference.SeekBarPreference.SavedState savedState = (androidx.preference.SeekBarPreference.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.Camera2StreamConfigurationMap = savedState.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRanges = savedState.Camera2StreamConfigurationMap;
        this.getInputSizeshNQ4ISI = savedState.getHighSpeedVideoFpsRangesFor;
        notifyChanged();
    }

    static class SavedState extends androidx.preference.Preference.BaseSavedState {
        public static final android.os.Parcelable.Creator<androidx.preference.SeekBarPreference.SavedState> CREATOR = new android.os.Parcelable.Creator<androidx.preference.SeekBarPreference.SavedState>() { // from class: androidx.preference.SeekBarPreference.SavedState.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ androidx.preference.SeekBarPreference.SavedState createFromParcel(android.os.Parcel parcel) {
                return new androidx.preference.SeekBarPreference.SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ androidx.preference.SeekBarPreference.SavedState[] newArray(int i) {
                return new androidx.preference.SeekBarPreference.SavedState[i];
            }
        };
        int Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRangesFor;

        SavedState(android.os.Parcel parcel) {
            super(parcel);
            this.getHighResolutionOutputSizeshNQ4ISI = parcel.readInt();
            this.Camera2StreamConfigurationMap = parcel.readInt();
            this.getHighSpeedVideoFpsRangesFor = parcel.readInt();
        }

        SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.getHighResolutionOutputSizeshNQ4ISI);
            parcel.writeInt(this.Camera2StreamConfigurationMap);
            parcel.writeInt(this.getHighSpeedVideoFpsRangesFor);
        }
    }
}
