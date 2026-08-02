package androidx.appcompat.widget;

/* loaded from: classes3.dex */
public class AppCompatButton extends android.widget.Button implements androidx.core.view.TintableBackgroundView, androidx.core.widget.AutoSizeableTextView, androidx.core.widget.TintableCompoundDrawablesView, androidx.appcompat.widget.EmojiCompatConfigurationView {
    private androidx.appcompat.widget.AppCompatEmojiTextHelper mAppCompatEmojiTextHelper;
    private final androidx.appcompat.widget.AppCompatBackgroundHelper mBackgroundTintHelper;
    private final androidx.appcompat.widget.AppCompatTextHelper mTextHelper;

    /* loaded from: classes5.dex */
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<androidx.appcompat.widget.AppCompatButton> {
        private int Camera2StreamConfigurationMap;
        private int getHighResolutionOutputSizeshNQ4ISI;
        private int getHighSpeedVideoFpsRanges;
        private int getHighSpeedVideoFpsRangesFor;
        private int getHighSpeedVideoSizes;
        private int getHighSpeedVideoSizesFor;
        private int getInputSizeshNQ4ISI;
        private boolean getOutputFormats = false;
        private int getOutputMinFrameDuration;

        @Override // android.view.inspector.InspectionCompanion
        public final void mapProperties(android.view.inspector.PropertyMapper propertyMapper) {
            this.Camera2StreamConfigurationMap = propertyMapper.mapInt("autoSizeMaxTextSize", androidx.appcompat.R.attr.autoSizeMaxTextSize);
            this.getHighSpeedVideoFpsRanges = propertyMapper.mapInt("autoSizeMinTextSize", androidx.appcompat.R.attr.autoSizeMinTextSize);
            this.getHighSpeedVideoSizes = propertyMapper.mapInt("autoSizeStepGranularity", androidx.appcompat.R.attr.autoSizeStepGranularity);
            this.getHighResolutionOutputSizeshNQ4ISI = propertyMapper.mapIntEnum("autoSizeTextType", androidx.appcompat.R.attr.autoSizeTextType, new java.util.function.IntFunction<java.lang.String>() { // from class: androidx.appcompat.widget.AppCompatButton.InspectionCompanion.1
                @Override // java.util.function.IntFunction
                /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                public java.lang.String apply(int i) {
                    if (i == 0) {
                        return "none";
                    }
                    if (i == 1) {
                        return "uniform";
                    }
                    return java.lang.String.valueOf(i);
                }
            });
            this.getHighSpeedVideoFpsRangesFor = propertyMapper.mapObject("backgroundTint", androidx.appcompat.R.attr.backgroundTint);
            this.getOutputMinFrameDuration = propertyMapper.mapObject("backgroundTintMode", androidx.appcompat.R.attr.backgroundTintMode);
            this.getInputSizeshNQ4ISI = propertyMapper.mapObject("drawableTint", androidx.appcompat.R.attr.drawableTint);
            this.getHighSpeedVideoSizesFor = propertyMapper.mapObject("drawableTintMode", androidx.appcompat.R.attr.drawableTintMode);
            this.getOutputFormats = true;
        }

        @Override // android.view.inspector.InspectionCompanion
        public final void readProperties(androidx.appcompat.widget.AppCompatButton appCompatButton, android.view.inspector.PropertyReader propertyReader) {
            if (!this.getOutputFormats) {
                throw new android.view.inspector.InspectionCompanion.UninitializedPropertyMapException();
            }
            propertyReader.readInt(this.Camera2StreamConfigurationMap, appCompatButton.getAutoSizeMaxTextSize());
            propertyReader.readInt(this.getHighSpeedVideoFpsRanges, appCompatButton.getAutoSizeMinTextSize());
            propertyReader.readInt(this.getHighSpeedVideoSizes, appCompatButton.getAutoSizeStepGranularity());
            propertyReader.readIntEnum(this.getHighResolutionOutputSizeshNQ4ISI, appCompatButton.getAutoSizeTextType());
            propertyReader.readObject(this.getHighSpeedVideoFpsRangesFor, appCompatButton.getBackgroundTintList());
            propertyReader.readObject(this.getOutputMinFrameDuration, appCompatButton.getBackgroundTintMode());
            propertyReader.readObject(this.getInputSizeshNQ4ISI, appCompatButton.getCompoundDrawableTintList());
            propertyReader.readObject(this.getHighSpeedVideoSizesFor, appCompatButton.getCompoundDrawableTintMode());
        }
    }

    public AppCompatButton(android.content.Context context) {
        this(context, null);
    }

    public AppCompatButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, androidx.appcompat.R.attr.buttonStyle);
    }

    public AppCompatButton(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(androidx.appcompat.widget.TintContextWrapper.wrap(context), attributeSet, i);
        androidx.appcompat.widget.ThemeUtils.checkAppCompatTheme(this, getContext());
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = new androidx.appcompat.widget.AppCompatBackgroundHelper(this);
        this.mBackgroundTintHelper = appCompatBackgroundHelper;
        appCompatBackgroundHelper.getHighResolutionOutputSizeshNQ4ISI(attributeSet, i);
        androidx.appcompat.widget.AppCompatTextHelper appCompatTextHelper = new androidx.appcompat.widget.AppCompatTextHelper(this);
        this.mTextHelper = appCompatTextHelper;
        appCompatTextHelper.getHighSpeedVideoFpsRanges(attributeSet, i);
        appCompatTextHelper.getHighSpeedVideoFpsRanges();
        getEmojiTextViewHelper().getHighSpeedVideoSizes(attributeSet, i);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.Camera2StreamConfigurationMap(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.Camera2StreamConfigurationMap(drawable);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.getHighSpeedVideoFpsRanges(colorStateList);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    public android.content.res.ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.Camera2StreamConfigurationMap();
        }
        return null;
    }

    @Override // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.getHighSpeedVideoSizes(mode);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.getHighResolutionOutputSizeshNQ4ISI();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.getHighSpeedVideoFpsRanges();
        }
        androidx.appcompat.widget.AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.getHighSpeedVideoFpsRanges();
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(android.content.Context context, int i) {
        super.setTextAppearance(context, i);
        androidx.appcompat.widget.AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.getHighSpeedVideoFpsRangesFor(context, i);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(android.widget.Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(android.widget.Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        androidx.appcompat.widget.AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.getHighSpeedVideoFpsRanges(z, i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (androidx.appcompat.widget.ViewUtils.getHighSpeedVideoFpsRangesFor) {
            super.setTextSize(i, f);
            return;
        }
        androidx.appcompat.widget.AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.getHighSpeedVideoFpsRangesFor(i, f);
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.mTextHelper == null || androidx.appcompat.widget.ViewUtils.getHighSpeedVideoFpsRangesFor || !this.mTextHelper.getInputFormats()) {
            return;
        }
        this.mTextHelper.Camera2StreamConfigurationMap();
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (androidx.appcompat.widget.ViewUtils.getHighSpeedVideoFpsRangesFor) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        androidx.appcompat.widget.AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.getHighSpeedVideoFpsRanges(i);
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws java.lang.IllegalArgumentException {
        if (androidx.appcompat.widget.ViewUtils.getHighSpeedVideoFpsRangesFor) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        androidx.appcompat.widget.AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.getHighSpeedVideoSizes(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws java.lang.IllegalArgumentException {
        if (androidx.appcompat.widget.ViewUtils.getHighSpeedVideoFpsRangesFor) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        androidx.appcompat.widget.AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.getHighResolutionOutputSizeshNQ4ISI(iArr, i);
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public int getAutoSizeTextType() {
        if (androidx.appcompat.widget.ViewUtils.getHighSpeedVideoFpsRangesFor) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        androidx.appcompat.widget.AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            return appCompatTextHelper.getOutputFormats();
        }
        return 0;
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public int getAutoSizeStepGranularity() {
        if (androidx.appcompat.widget.ViewUtils.getHighSpeedVideoFpsRangesFor) {
            return super.getAutoSizeStepGranularity();
        }
        androidx.appcompat.widget.AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            return appCompatTextHelper.getHighResolutionOutputSizeshNQ4ISI();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public int getAutoSizeMinTextSize() {
        if (androidx.appcompat.widget.ViewUtils.getHighSpeedVideoFpsRangesFor) {
            return super.getAutoSizeMinTextSize();
        }
        androidx.appcompat.widget.AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            return appCompatTextHelper.getHighSpeedVideoFpsRangesFor();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public int getAutoSizeMaxTextSize() {
        if (androidx.appcompat.widget.ViewUtils.getHighSpeedVideoFpsRangesFor) {
            return super.getAutoSizeMaxTextSize();
        }
        androidx.appcompat.widget.AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            return appCompatTextHelper.getHighSpeedVideoSizes();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (androidx.appcompat.widget.ViewUtils.getHighSpeedVideoFpsRangesFor) {
            return super.getAutoSizeTextAvailableSizes();
        }
        androidx.appcompat.widget.AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            return appCompatTextHelper.getHighSpeedVideoSizesFor();
        }
        return new int[0];
    }

    public void setSupportAllCaps(boolean z) {
        androidx.appcompat.widget.AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.getHighResolutionOutputSizeshNQ4ISI(z);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.TextViewCompat.wrapCustomSelectionActionModeCallback(this, callback));
    }

    @Override // android.widget.TextView
    public android.view.ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.TextViewCompat.unwrapCustomSelectionActionModeCallback(super.getCustomSelectionActionModeCallback());
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public void setSupportCompoundDrawablesTintList(android.content.res.ColorStateList colorStateList) {
        this.mTextHelper.Camera2StreamConfigurationMap(colorStateList);
        this.mTextHelper.getHighSpeedVideoFpsRanges();
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public android.content.res.ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.getInputSizeshNQ4ISI();
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public void setSupportCompoundDrawablesTintMode(android.graphics.PorterDuff.Mode mode) {
        this.mTextHelper.getHighSpeedVideoFpsRangesFor(mode);
        this.mTextHelper.getHighSpeedVideoFpsRanges();
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public android.graphics.PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.getOutputMinFrameDuration();
    }

    @Override // android.widget.TextView
    public void setFilters(android.text.InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().getHighSpeedVideoFpsRangesFor(inputFilterArr));
    }

    private androidx.appcompat.widget.AppCompatEmojiTextHelper getEmojiTextViewHelper() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new androidx.appcompat.widget.AppCompatEmojiTextHelper(this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().Camera2StreamConfigurationMap(z);
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().getHighSpeedVideoSizes(z);
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().getHighResolutionOutputSizeshNQ4ISI();
    }
}
