package androidx.appcompat.widget;

/* loaded from: classes3.dex */
public class AppCompatCheckedTextView extends android.widget.CheckedTextView implements androidx.core.widget.TintableCheckedTextView, androidx.core.view.TintableBackgroundView, androidx.appcompat.widget.EmojiCompatConfigurationView, androidx.core.widget.TintableCompoundDrawablesView {
    private final androidx.appcompat.widget.AppCompatCheckedTextViewHelper Camera2StreamConfigurationMap;
    private final androidx.appcompat.widget.AppCompatTextHelper getHighSpeedVideoFpsRanges;
    private androidx.appcompat.widget.AppCompatEmojiTextHelper getHighSpeedVideoFpsRangesFor;
    private final androidx.appcompat.widget.AppCompatBackgroundHelper getHighSpeedVideoSizes;

    /* loaded from: classes5.dex */
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<androidx.appcompat.widget.AppCompatCheckedTextView> {
        private int Camera2StreamConfigurationMap;
        private int getHighResolutionOutputSizeshNQ4ISI;
        private int getHighSpeedVideoFpsRanges;
        private int getHighSpeedVideoFpsRangesFor;
        private int getHighSpeedVideoSizes;
        private boolean getHighSpeedVideoSizesFor = false;
        private int getInputSizeshNQ4ISI;

        @Override // android.view.inspector.InspectionCompanion
        public final void mapProperties(android.view.inspector.PropertyMapper propertyMapper) {
            this.getHighSpeedVideoFpsRanges = propertyMapper.mapObject("backgroundTint", androidx.appcompat.R.attr.backgroundTint);
            this.getHighSpeedVideoFpsRangesFor = propertyMapper.mapObject("backgroundTintMode", androidx.appcompat.R.attr.backgroundTintMode);
            this.Camera2StreamConfigurationMap = propertyMapper.mapObject("checkMarkTint", androidx.appcompat.R.attr.checkMarkTint);
            this.getHighSpeedVideoSizes = propertyMapper.mapObject("checkMarkTintMode", androidx.appcompat.R.attr.checkMarkTintMode);
            this.getHighResolutionOutputSizeshNQ4ISI = propertyMapper.mapObject("drawableTint", androidx.appcompat.R.attr.drawableTint);
            this.getInputSizeshNQ4ISI = propertyMapper.mapObject("drawableTintMode", androidx.appcompat.R.attr.drawableTintMode);
            this.getHighSpeedVideoSizesFor = true;
        }

        @Override // android.view.inspector.InspectionCompanion
        public final void readProperties(androidx.appcompat.widget.AppCompatCheckedTextView appCompatCheckedTextView, android.view.inspector.PropertyReader propertyReader) {
            if (!this.getHighSpeedVideoSizesFor) {
                throw new android.view.inspector.InspectionCompanion.UninitializedPropertyMapException();
            }
            propertyReader.readObject(this.getHighSpeedVideoFpsRanges, appCompatCheckedTextView.getBackgroundTintList());
            propertyReader.readObject(this.getHighSpeedVideoFpsRangesFor, appCompatCheckedTextView.getBackgroundTintMode());
            propertyReader.readObject(this.Camera2StreamConfigurationMap, appCompatCheckedTextView.getCheckMarkTintList());
            propertyReader.readObject(this.getHighSpeedVideoSizes, appCompatCheckedTextView.getCheckMarkTintMode());
            propertyReader.readObject(this.getHighResolutionOutputSizeshNQ4ISI, appCompatCheckedTextView.getCompoundDrawableTintList());
            propertyReader.readObject(this.getInputSizeshNQ4ISI, appCompatCheckedTextView.getCompoundDrawableTintMode());
        }
    }

    public AppCompatCheckedTextView(android.content.Context context) {
        this(context, null);
    }

    public AppCompatCheckedTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, androidx.appcompat.R.attr.checkedTextViewStyle);
    }

    public AppCompatCheckedTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(androidx.appcompat.widget.TintContextWrapper.wrap(context), attributeSet, i);
        androidx.appcompat.widget.ThemeUtils.checkAppCompatTheme(this, getContext());
        androidx.appcompat.widget.AppCompatTextHelper appCompatTextHelper = new androidx.appcompat.widget.AppCompatTextHelper(this);
        this.getHighSpeedVideoFpsRanges = appCompatTextHelper;
        appCompatTextHelper.getHighSpeedVideoFpsRanges(attributeSet, i);
        appCompatTextHelper.getHighSpeedVideoFpsRanges();
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = new androidx.appcompat.widget.AppCompatBackgroundHelper(this);
        this.getHighSpeedVideoSizes = appCompatBackgroundHelper;
        appCompatBackgroundHelper.getHighResolutionOutputSizeshNQ4ISI(attributeSet, i);
        androidx.appcompat.widget.AppCompatCheckedTextViewHelper appCompatCheckedTextViewHelper = new androidx.appcompat.widget.AppCompatCheckedTextViewHelper(this);
        this.Camera2StreamConfigurationMap = appCompatCheckedTextViewHelper;
        appCompatCheckedTextViewHelper.getHighSpeedVideoFpsRangesFor(attributeSet, i);
        getHighResolutionOutputSizeshNQ4ISI().getHighSpeedVideoSizes(attributeSet, i);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(android.graphics.drawable.Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        androidx.appcompat.widget.AppCompatCheckedTextViewHelper appCompatCheckedTextViewHelper = this.Camera2StreamConfigurationMap;
        if (appCompatCheckedTextViewHelper != null) {
            appCompatCheckedTextViewHelper.getHighResolutionOutputSizeshNQ4ISI();
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(androidx.appcompat.content.res.AppCompatResources.getDrawable(getContext(), i));
    }

    @Override // androidx.core.widget.TintableCheckedTextView
    public void setSupportCheckMarkTintList(android.content.res.ColorStateList colorStateList) {
        androidx.appcompat.widget.AppCompatCheckedTextViewHelper appCompatCheckedTextViewHelper = this.Camera2StreamConfigurationMap;
        if (appCompatCheckedTextViewHelper != null) {
            appCompatCheckedTextViewHelper.getHighSpeedVideoFpsRangesFor(colorStateList);
        }
    }

    @Override // androidx.core.widget.TintableCheckedTextView
    public android.content.res.ColorStateList getSupportCheckMarkTintList() {
        androidx.appcompat.widget.AppCompatCheckedTextViewHelper appCompatCheckedTextViewHelper = this.Camera2StreamConfigurationMap;
        if (appCompatCheckedTextViewHelper != null) {
            return appCompatCheckedTextViewHelper.getHighSpeedVideoSizes();
        }
        return null;
    }

    @Override // androidx.core.widget.TintableCheckedTextView
    public void setSupportCheckMarkTintMode(android.graphics.PorterDuff.Mode mode) {
        androidx.appcompat.widget.AppCompatCheckedTextViewHelper appCompatCheckedTextViewHelper = this.Camera2StreamConfigurationMap;
        if (appCompatCheckedTextViewHelper != null) {
            appCompatCheckedTextViewHelper.getHighSpeedVideoSizes(mode);
        }
    }

    @Override // androidx.core.widget.TintableCheckedTextView
    public android.graphics.PorterDuff.Mode getSupportCheckMarkTintMode() {
        androidx.appcompat.widget.AppCompatCheckedTextViewHelper appCompatCheckedTextViewHelper = this.Camera2StreamConfigurationMap;
        if (appCompatCheckedTextViewHelper != null) {
            return appCompatCheckedTextViewHelper.getHighSpeedVideoFpsRangesFor();
        }
        return null;
    }

    @Override // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = this.getHighSpeedVideoSizes;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.getHighSpeedVideoFpsRanges(colorStateList);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    public android.content.res.ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = this.getHighSpeedVideoSizes;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.Camera2StreamConfigurationMap();
        }
        return null;
    }

    @Override // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = this.getHighSpeedVideoSizes;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.getHighSpeedVideoSizes(mode);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = this.getHighSpeedVideoSizes;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.getHighResolutionOutputSizeshNQ4ISI();
        }
        return null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = this.getHighSpeedVideoSizes;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.Camera2StreamConfigurationMap(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = this.getHighSpeedVideoSizes;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.Camera2StreamConfigurationMap(i);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(android.content.Context context, int i) {
        super.setTextAppearance(context, i);
        androidx.appcompat.widget.AppCompatTextHelper appCompatTextHelper = this.getHighSpeedVideoFpsRanges;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.getHighSpeedVideoFpsRangesFor(context, i);
        }
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.AppCompatTextHelper appCompatTextHelper = this.getHighSpeedVideoFpsRanges;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.getHighSpeedVideoFpsRanges();
        }
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = this.getHighSpeedVideoSizes;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.getHighSpeedVideoFpsRanges();
        }
        androidx.appcompat.widget.AppCompatCheckedTextViewHelper appCompatCheckedTextViewHelper = this.Camera2StreamConfigurationMap;
        if (appCompatCheckedTextViewHelper != null) {
            appCompatCheckedTextViewHelper.Camera2StreamConfigurationMap();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        return androidx.appcompat.widget.AppCompatHintHelper.getHighSpeedVideoFpsRangesFor(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.TextViewCompat.wrapCustomSelectionActionModeCallback(this, callback));
    }

    @Override // android.widget.TextView
    public android.view.ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.TextViewCompat.unwrapCustomSelectionActionModeCallback(super.getCustomSelectionActionModeCallback());
    }

    private androidx.appcompat.widget.AppCompatEmojiTextHelper getHighResolutionOutputSizeshNQ4ISI() {
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            this.getHighSpeedVideoFpsRangesFor = new androidx.appcompat.widget.AppCompatEmojiTextHelper(this);
        }
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getHighResolutionOutputSizeshNQ4ISI().Camera2StreamConfigurationMap(z);
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public void setEmojiCompatEnabled(boolean z) {
        getHighResolutionOutputSizeshNQ4ISI().getHighSpeedVideoSizes(z);
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public boolean isEmojiCompatEnabled() {
        return getHighResolutionOutputSizeshNQ4ISI().getHighResolutionOutputSizeshNQ4ISI();
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
