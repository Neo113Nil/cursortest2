package androidx.appcompat.widget;

/* loaded from: classes3.dex */
public class AppCompatMultiAutoCompleteTextView extends android.widget.MultiAutoCompleteTextView implements androidx.core.view.TintableBackgroundView, androidx.appcompat.widget.EmojiCompatConfigurationView, androidx.core.widget.TintableCompoundDrawablesView {
    private static final int[] getHighResolutionOutputSizeshNQ4ISI = {android.R.attr.popupBackground};
    private final androidx.appcompat.widget.AppCompatTextHelper getHighSpeedVideoFpsRanges;
    private final androidx.appcompat.widget.AppCompatBackgroundHelper getHighSpeedVideoFpsRangesFor;
    private final androidx.appcompat.widget.AppCompatEmojiEditTextHelper getHighSpeedVideoSizes;

    /* loaded from: classes5.dex */
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView> {
        private int Camera2StreamConfigurationMap;
        private int getHighResolutionOutputSizeshNQ4ISI;
        private int getHighSpeedVideoFpsRanges;
        private int getHighSpeedVideoFpsRangesFor;
        private boolean getHighSpeedVideoSizes = false;

        @Override // android.view.inspector.InspectionCompanion
        public final void mapProperties(android.view.inspector.PropertyMapper propertyMapper) {
            this.Camera2StreamConfigurationMap = propertyMapper.mapObject("backgroundTint", androidx.appcompat.R.attr.backgroundTint);
            this.getHighSpeedVideoFpsRanges = propertyMapper.mapObject("backgroundTintMode", androidx.appcompat.R.attr.backgroundTintMode);
            this.getHighResolutionOutputSizeshNQ4ISI = propertyMapper.mapObject("drawableTint", androidx.appcompat.R.attr.drawableTint);
            this.getHighSpeedVideoFpsRangesFor = propertyMapper.mapObject("drawableTintMode", androidx.appcompat.R.attr.drawableTintMode);
            this.getHighSpeedVideoSizes = true;
        }

        @Override // android.view.inspector.InspectionCompanion
        public final void readProperties(androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView appCompatMultiAutoCompleteTextView, android.view.inspector.PropertyReader propertyReader) {
            if (!this.getHighSpeedVideoSizes) {
                throw new android.view.inspector.InspectionCompanion.UninitializedPropertyMapException();
            }
            propertyReader.readObject(this.Camera2StreamConfigurationMap, appCompatMultiAutoCompleteTextView.getBackgroundTintList());
            propertyReader.readObject(this.getHighSpeedVideoFpsRanges, appCompatMultiAutoCompleteTextView.getBackgroundTintMode());
            propertyReader.readObject(this.getHighResolutionOutputSizeshNQ4ISI, appCompatMultiAutoCompleteTextView.getCompoundDrawableTintList());
            propertyReader.readObject(this.getHighSpeedVideoFpsRangesFor, appCompatMultiAutoCompleteTextView.getCompoundDrawableTintMode());
        }
    }

    public AppCompatMultiAutoCompleteTextView(android.content.Context context) {
        this(context, null);
    }

    public AppCompatMultiAutoCompleteTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, androidx.appcompat.R.attr.autoCompleteTextViewStyle);
    }

    public AppCompatMultiAutoCompleteTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(androidx.appcompat.widget.TintContextWrapper.wrap(context), attributeSet, i);
        androidx.appcompat.widget.ThemeUtils.checkAppCompatTheme(this, getContext());
        androidx.appcompat.widget.TintTypedArray obtainStyledAttributes = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(getContext(), attributeSet, getHighResolutionOutputSizeshNQ4ISI, i, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            setDropDownBackgroundDrawable(obtainStyledAttributes.getDrawable(0));
        }
        obtainStyledAttributes.recycle();
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = new androidx.appcompat.widget.AppCompatBackgroundHelper(this);
        this.getHighSpeedVideoFpsRangesFor = appCompatBackgroundHelper;
        appCompatBackgroundHelper.getHighResolutionOutputSizeshNQ4ISI(attributeSet, i);
        androidx.appcompat.widget.AppCompatTextHelper appCompatTextHelper = new androidx.appcompat.widget.AppCompatTextHelper(this);
        this.getHighSpeedVideoFpsRanges = appCompatTextHelper;
        appCompatTextHelper.getHighSpeedVideoFpsRanges(attributeSet, i);
        appCompatTextHelper.getHighSpeedVideoFpsRanges();
        androidx.appcompat.widget.AppCompatEmojiEditTextHelper appCompatEmojiEditTextHelper = new androidx.appcompat.widget.AppCompatEmojiEditTextHelper(this);
        this.getHighSpeedVideoSizes = appCompatEmojiEditTextHelper;
        appCompatEmojiEditTextHelper.Camera2StreamConfigurationMap(attributeSet, i);
        getHighResolutionOutputSizeshNQ4ISI(appCompatEmojiEditTextHelper);
    }

    void getHighResolutionOutputSizeshNQ4ISI(androidx.appcompat.widget.AppCompatEmojiEditTextHelper appCompatEmojiEditTextHelper) {
        android.text.method.KeyListener keyListener = getKeyListener();
        if (appCompatEmojiEditTextHelper.getHighSpeedVideoFpsRangesFor(keyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            android.text.method.KeyListener highSpeedVideoSizes = appCompatEmojiEditTextHelper.getHighSpeedVideoSizes(keyListener);
            if (highSpeedVideoSizes != keyListener) {
                super.setKeyListener(highSpeedVideoSizes);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(androidx.appcompat.content.res.AppCompatResources.getDrawable(getContext(), i));
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = this.getHighSpeedVideoFpsRangesFor;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.Camera2StreamConfigurationMap(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = this.getHighSpeedVideoFpsRangesFor;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.Camera2StreamConfigurationMap(drawable);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = this.getHighSpeedVideoFpsRangesFor;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.getHighSpeedVideoFpsRanges(colorStateList);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    public android.content.res.ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = this.getHighSpeedVideoFpsRangesFor;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.Camera2StreamConfigurationMap();
        }
        return null;
    }

    @Override // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = this.getHighSpeedVideoFpsRangesFor;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.getHighSpeedVideoSizes(mode);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = this.getHighSpeedVideoFpsRangesFor;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.getHighResolutionOutputSizeshNQ4ISI();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = this.getHighSpeedVideoFpsRangesFor;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.getHighSpeedVideoFpsRanges();
        }
        androidx.appcompat.widget.AppCompatTextHelper appCompatTextHelper = this.getHighSpeedVideoFpsRanges;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.getHighSpeedVideoFpsRanges();
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

    @Override // android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        return this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(androidx.appcompat.widget.AppCompatHintHelper.getHighSpeedVideoFpsRangesFor(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    @Override // android.widget.TextView
    public void setKeyListener(android.text.method.KeyListener keyListener) {
        super.setKeyListener(this.getHighSpeedVideoSizes.getHighSpeedVideoSizes(keyListener));
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public void setEmojiCompatEnabled(boolean z) {
        this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges(z);
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public boolean isEmojiCompatEnabled() {
        return this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor();
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
