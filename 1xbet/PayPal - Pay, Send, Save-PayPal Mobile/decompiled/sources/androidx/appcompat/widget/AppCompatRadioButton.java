package androidx.appcompat.widget;

/* loaded from: classes3.dex */
public class AppCompatRadioButton extends android.widget.RadioButton implements androidx.core.widget.TintableCompoundButton, androidx.core.view.TintableBackgroundView, androidx.appcompat.widget.EmojiCompatConfigurationView, androidx.core.widget.TintableCompoundDrawablesView {
    private androidx.appcompat.widget.AppCompatEmojiTextHelper mAppCompatEmojiTextHelper;
    private final androidx.appcompat.widget.AppCompatBackgroundHelper mBackgroundTintHelper;
    private final androidx.appcompat.widget.AppCompatCompoundButtonHelper mCompoundButtonHelper;
    private final androidx.appcompat.widget.AppCompatTextHelper mTextHelper;

    /* loaded from: classes5.dex */
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<androidx.appcompat.widget.AppCompatRadioButton> {
        private int Camera2StreamConfigurationMap;
        private int getHighResolutionOutputSizeshNQ4ISI;
        private int getHighSpeedVideoFpsRanges;
        private int getHighSpeedVideoFpsRangesFor;
        private int getHighSpeedVideoSizes;
        private int getInputSizeshNQ4ISI;
        private boolean getOutputMinFrameDuration = false;

        @Override // android.view.inspector.InspectionCompanion
        public final void mapProperties(android.view.inspector.PropertyMapper propertyMapper) {
            this.getHighResolutionOutputSizeshNQ4ISI = propertyMapper.mapObject("backgroundTint", androidx.appcompat.R.attr.backgroundTint);
            this.getHighSpeedVideoFpsRanges = propertyMapper.mapObject("backgroundTintMode", androidx.appcompat.R.attr.backgroundTintMode);
            this.getHighSpeedVideoSizes = propertyMapper.mapObject("buttonTint", androidx.appcompat.R.attr.buttonTint);
            this.Camera2StreamConfigurationMap = propertyMapper.mapObject("buttonTintMode", androidx.appcompat.R.attr.buttonTintMode);
            this.getHighSpeedVideoFpsRangesFor = propertyMapper.mapObject("drawableTint", androidx.appcompat.R.attr.drawableTint);
            this.getInputSizeshNQ4ISI = propertyMapper.mapObject("drawableTintMode", androidx.appcompat.R.attr.drawableTintMode);
            this.getOutputMinFrameDuration = true;
        }

        @Override // android.view.inspector.InspectionCompanion
        public final void readProperties(androidx.appcompat.widget.AppCompatRadioButton appCompatRadioButton, android.view.inspector.PropertyReader propertyReader) {
            if (!this.getOutputMinFrameDuration) {
                throw new android.view.inspector.InspectionCompanion.UninitializedPropertyMapException();
            }
            propertyReader.readObject(this.getHighResolutionOutputSizeshNQ4ISI, appCompatRadioButton.getBackgroundTintList());
            propertyReader.readObject(this.getHighSpeedVideoFpsRanges, appCompatRadioButton.getBackgroundTintMode());
            propertyReader.readObject(this.getHighSpeedVideoSizes, appCompatRadioButton.getButtonTintList());
            propertyReader.readObject(this.Camera2StreamConfigurationMap, appCompatRadioButton.getButtonTintMode());
            propertyReader.readObject(this.getHighSpeedVideoFpsRangesFor, appCompatRadioButton.getCompoundDrawableTintList());
            propertyReader.readObject(this.getInputSizeshNQ4ISI, appCompatRadioButton.getCompoundDrawableTintMode());
        }
    }

    public AppCompatRadioButton(android.content.Context context) {
        this(context, null);
    }

    public AppCompatRadioButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, androidx.appcompat.R.attr.radioButtonStyle);
    }

    public AppCompatRadioButton(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(androidx.appcompat.widget.TintContextWrapper.wrap(context), attributeSet, i);
        androidx.appcompat.widget.ThemeUtils.checkAppCompatTheme(this, getContext());
        androidx.appcompat.widget.AppCompatCompoundButtonHelper appCompatCompoundButtonHelper = new androidx.appcompat.widget.AppCompatCompoundButtonHelper(this);
        this.mCompoundButtonHelper = appCompatCompoundButtonHelper;
        appCompatCompoundButtonHelper.getHighSpeedVideoFpsRangesFor(attributeSet, i);
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = new androidx.appcompat.widget.AppCompatBackgroundHelper(this);
        this.mBackgroundTintHelper = appCompatBackgroundHelper;
        appCompatBackgroundHelper.getHighResolutionOutputSizeshNQ4ISI(attributeSet, i);
        androidx.appcompat.widget.AppCompatTextHelper appCompatTextHelper = new androidx.appcompat.widget.AppCompatTextHelper(this);
        this.mTextHelper = appCompatTextHelper;
        appCompatTextHelper.getHighSpeedVideoFpsRanges(attributeSet, i);
        getEmojiTextViewHelper().getHighSpeedVideoSizes(attributeSet, i);
    }

    private androidx.appcompat.widget.AppCompatEmojiTextHelper getEmojiTextViewHelper() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new androidx.appcompat.widget.AppCompatEmojiTextHelper(this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(android.graphics.drawable.Drawable drawable) {
        super.setButtonDrawable(drawable);
        androidx.appcompat.widget.AppCompatCompoundButtonHelper appCompatCompoundButtonHelper = this.mCompoundButtonHelper;
        if (appCompatCompoundButtonHelper != null) {
            appCompatCompoundButtonHelper.getHighSpeedVideoFpsRanges();
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(androidx.appcompat.content.res.AppCompatResources.getDrawable(getContext(), i));
    }

    @Override // androidx.core.widget.TintableCompoundButton
    public void setSupportButtonTintList(android.content.res.ColorStateList colorStateList) {
        androidx.appcompat.widget.AppCompatCompoundButtonHelper appCompatCompoundButtonHelper = this.mCompoundButtonHelper;
        if (appCompatCompoundButtonHelper != null) {
            appCompatCompoundButtonHelper.getHighSpeedVideoFpsRangesFor(colorStateList);
        }
    }

    @Override // androidx.core.widget.TintableCompoundButton
    public android.content.res.ColorStateList getSupportButtonTintList() {
        androidx.appcompat.widget.AppCompatCompoundButtonHelper appCompatCompoundButtonHelper = this.mCompoundButtonHelper;
        if (appCompatCompoundButtonHelper != null) {
            return appCompatCompoundButtonHelper.getHighResolutionOutputSizeshNQ4ISI();
        }
        return null;
    }

    @Override // androidx.core.widget.TintableCompoundButton
    public void setSupportButtonTintMode(android.graphics.PorterDuff.Mode mode) {
        androidx.appcompat.widget.AppCompatCompoundButtonHelper appCompatCompoundButtonHelper = this.mCompoundButtonHelper;
        if (appCompatCompoundButtonHelper != null) {
            appCompatCompoundButtonHelper.getHighResolutionOutputSizeshNQ4ISI(mode);
        }
    }

    @Override // androidx.core.widget.TintableCompoundButton
    public android.graphics.PorterDuff.Mode getSupportButtonTintMode() {
        androidx.appcompat.widget.AppCompatCompoundButtonHelper appCompatCompoundButtonHelper = this.mCompoundButtonHelper;
        if (appCompatCompoundButtonHelper != null) {
            return appCompatCompoundButtonHelper.getHighSpeedVideoFpsRangesFor();
        }
        return null;
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

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.Camera2StreamConfigurationMap(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.Camera2StreamConfigurationMap(i);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
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
    public void setFilters(android.text.InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().getHighSpeedVideoFpsRangesFor(inputFilterArr));
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

    @Override // android.widget.TextView
    public void setCompoundDrawables(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        androidx.appcompat.widget.AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.getOutputStallDuration();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        androidx.appcompat.widget.AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.getOutputStallDuration();
        }
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public android.content.res.ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.getInputSizeshNQ4ISI();
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public void setSupportCompoundDrawablesTintList(android.content.res.ColorStateList colorStateList) {
        this.mTextHelper.Camera2StreamConfigurationMap(colorStateList);
        this.mTextHelper.getHighSpeedVideoFpsRanges();
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public android.graphics.PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.getOutputMinFrameDuration();
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public void setSupportCompoundDrawablesTintMode(android.graphics.PorterDuff.Mode mode) {
        this.mTextHelper.getHighSpeedVideoFpsRangesFor(mode);
        this.mTextHelper.getHighSpeedVideoFpsRanges();
    }
}
