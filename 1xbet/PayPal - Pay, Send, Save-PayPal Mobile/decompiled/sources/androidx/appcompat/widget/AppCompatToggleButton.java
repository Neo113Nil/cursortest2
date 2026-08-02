package androidx.appcompat.widget;

/* loaded from: classes3.dex */
public class AppCompatToggleButton extends android.widget.ToggleButton implements androidx.core.view.TintableBackgroundView, androidx.appcompat.widget.EmojiCompatConfigurationView, androidx.core.widget.TintableCompoundDrawablesView {
    private final androidx.appcompat.widget.AppCompatBackgroundHelper Camera2StreamConfigurationMap;
    private androidx.appcompat.widget.AppCompatEmojiTextHelper getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.appcompat.widget.AppCompatTextHelper getHighSpeedVideoFpsRanges;

    /* loaded from: classes5.dex */
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<androidx.appcompat.widget.AppCompatToggleButton> {
        private int Camera2StreamConfigurationMap;
        private int getHighResolutionOutputSizeshNQ4ISI;
        private int getHighSpeedVideoFpsRanges;
        private boolean getHighSpeedVideoFpsRangesFor = false;
        private int getHighSpeedVideoSizes;

        @Override // android.view.inspector.InspectionCompanion
        public final void mapProperties(android.view.inspector.PropertyMapper propertyMapper) {
            this.Camera2StreamConfigurationMap = propertyMapper.mapObject("backgroundTint", androidx.appcompat.R.attr.backgroundTint);
            this.getHighResolutionOutputSizeshNQ4ISI = propertyMapper.mapObject("backgroundTintMode", androidx.appcompat.R.attr.backgroundTintMode);
            this.getHighSpeedVideoFpsRanges = propertyMapper.mapObject("drawableTint", androidx.appcompat.R.attr.drawableTint);
            this.getHighSpeedVideoSizes = propertyMapper.mapObject("drawableTintMode", androidx.appcompat.R.attr.drawableTintMode);
            this.getHighSpeedVideoFpsRangesFor = true;
        }

        @Override // android.view.inspector.InspectionCompanion
        public final void readProperties(androidx.appcompat.widget.AppCompatToggleButton appCompatToggleButton, android.view.inspector.PropertyReader propertyReader) {
            if (!this.getHighSpeedVideoFpsRangesFor) {
                throw new android.view.inspector.InspectionCompanion.UninitializedPropertyMapException();
            }
            propertyReader.readObject(this.Camera2StreamConfigurationMap, appCompatToggleButton.getBackgroundTintList());
            propertyReader.readObject(this.getHighResolutionOutputSizeshNQ4ISI, appCompatToggleButton.getBackgroundTintMode());
            propertyReader.readObject(this.getHighSpeedVideoFpsRanges, appCompatToggleButton.getCompoundDrawableTintList());
            propertyReader.readObject(this.getHighSpeedVideoSizes, appCompatToggleButton.getCompoundDrawableTintMode());
        }
    }

    public AppCompatToggleButton(android.content.Context context) {
        this(context, null);
    }

    public AppCompatToggleButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.buttonStyleToggle);
    }

    public AppCompatToggleButton(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        androidx.appcompat.widget.ThemeUtils.checkAppCompatTheme(this, getContext());
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = new androidx.appcompat.widget.AppCompatBackgroundHelper(this);
        this.Camera2StreamConfigurationMap = appCompatBackgroundHelper;
        appCompatBackgroundHelper.getHighResolutionOutputSizeshNQ4ISI(attributeSet, i);
        androidx.appcompat.widget.AppCompatTextHelper appCompatTextHelper = new androidx.appcompat.widget.AppCompatTextHelper(this);
        this.getHighSpeedVideoFpsRanges = appCompatTextHelper;
        appCompatTextHelper.getHighSpeedVideoFpsRanges(attributeSet, i);
        getHighSpeedVideoFpsRanges().getHighSpeedVideoSizes(attributeSet, i);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = this.Camera2StreamConfigurationMap;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.Camera2StreamConfigurationMap(i);
        }
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = this.Camera2StreamConfigurationMap;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.Camera2StreamConfigurationMap(drawable);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = this.Camera2StreamConfigurationMap;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.getHighSpeedVideoFpsRanges(colorStateList);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    public android.content.res.ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = this.Camera2StreamConfigurationMap;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.Camera2StreamConfigurationMap();
        }
        return null;
    }

    @Override // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = this.Camera2StreamConfigurationMap;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.getHighSpeedVideoSizes(mode);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = this.Camera2StreamConfigurationMap;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.getHighResolutionOutputSizeshNQ4ISI();
        }
        return null;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = this.Camera2StreamConfigurationMap;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.getHighSpeedVideoFpsRanges();
        }
        androidx.appcompat.widget.AppCompatTextHelper appCompatTextHelper = this.getHighSpeedVideoFpsRanges;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.getHighSpeedVideoFpsRanges();
        }
    }

    @Override // android.widget.TextView
    public void setFilters(android.text.InputFilter[] inputFilterArr) {
        super.setFilters(getHighSpeedVideoFpsRanges().getHighSpeedVideoFpsRangesFor(inputFilterArr));
    }

    private androidx.appcompat.widget.AppCompatEmojiTextHelper getHighSpeedVideoFpsRanges() {
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = new androidx.appcompat.widget.AppCompatEmojiTextHelper(this);
        }
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getHighSpeedVideoFpsRanges().Camera2StreamConfigurationMap(z);
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public void setEmojiCompatEnabled(boolean z) {
        getHighSpeedVideoFpsRanges().getHighSpeedVideoSizes(z);
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public boolean isEmojiCompatEnabled() {
        return getHighSpeedVideoFpsRanges().getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        androidx.appcompat.widget.AppCompatTextHelper appCompatTextHelper = this.getHighSpeedVideoFpsRanges;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.getOutputStallDuration();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        androidx.appcompat.widget.AppCompatTextHelper appCompatTextHelper = this.getHighSpeedVideoFpsRanges;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.getOutputStallDuration();
        }
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public android.content.res.ColorStateList getSupportCompoundDrawablesTintList() {
        return this.getHighSpeedVideoFpsRanges.getInputSizeshNQ4ISI();
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public void setSupportCompoundDrawablesTintList(android.content.res.ColorStateList colorStateList) {
        this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(colorStateList);
        this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges();
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public android.graphics.PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.getHighSpeedVideoFpsRanges.getOutputMinFrameDuration();
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public void setSupportCompoundDrawablesTintMode(android.graphics.PorterDuff.Mode mode) {
        this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(mode);
        this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges();
    }
}
