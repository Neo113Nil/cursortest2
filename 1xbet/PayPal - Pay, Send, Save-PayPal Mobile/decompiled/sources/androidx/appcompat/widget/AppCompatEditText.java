package androidx.appcompat.widget;

/* loaded from: classes3.dex */
public class AppCompatEditText extends android.widget.EditText implements androidx.core.view.TintableBackgroundView, androidx.core.view.OnReceiveContentViewBehavior, androidx.appcompat.widget.EmojiCompatConfigurationView, androidx.core.widget.TintableCompoundDrawablesView {
    private final androidx.appcompat.widget.AppCompatEmojiEditTextHelper mAppCompatEmojiEditTextHelper;
    private final androidx.appcompat.widget.AppCompatBackgroundHelper mBackgroundTintHelper;
    private final androidx.core.widget.TextViewOnReceiveContentListener mDefaultOnReceiveContentListener;
    private androidx.appcompat.widget.AppCompatEditText.SuperCaller mSuperCaller;
    private final androidx.appcompat.widget.AppCompatTextClassifierHelper mTextClassifierHelper;
    private final androidx.appcompat.widget.AppCompatTextHelper mTextHelper;

    /* loaded from: classes5.dex */
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<androidx.appcompat.widget.AppCompatEditText> {
        private boolean Camera2StreamConfigurationMap = false;
        private int getHighResolutionOutputSizeshNQ4ISI;
        private int getHighSpeedVideoFpsRanges;
        private int getHighSpeedVideoFpsRangesFor;
        private int getHighSpeedVideoSizes;

        @Override // android.view.inspector.InspectionCompanion
        public final void mapProperties(android.view.inspector.PropertyMapper propertyMapper) {
            this.getHighSpeedVideoSizes = propertyMapper.mapObject("backgroundTint", androidx.appcompat.R.attr.backgroundTint);
            this.getHighSpeedVideoFpsRanges = propertyMapper.mapObject("backgroundTintMode", androidx.appcompat.R.attr.backgroundTintMode);
            this.getHighSpeedVideoFpsRangesFor = propertyMapper.mapObject("drawableTint", androidx.appcompat.R.attr.drawableTint);
            this.getHighResolutionOutputSizeshNQ4ISI = propertyMapper.mapObject("drawableTintMode", androidx.appcompat.R.attr.drawableTintMode);
            this.Camera2StreamConfigurationMap = true;
        }

        @Override // android.view.inspector.InspectionCompanion
        public final void readProperties(androidx.appcompat.widget.AppCompatEditText appCompatEditText, android.view.inspector.PropertyReader propertyReader) {
            if (!this.Camera2StreamConfigurationMap) {
                throw new android.view.inspector.InspectionCompanion.UninitializedPropertyMapException();
            }
            propertyReader.readObject(this.getHighSpeedVideoSizes, appCompatEditText.getBackgroundTintList());
            propertyReader.readObject(this.getHighSpeedVideoFpsRanges, appCompatEditText.getBackgroundTintMode());
            propertyReader.readObject(this.getHighSpeedVideoFpsRangesFor, appCompatEditText.getCompoundDrawableTintList());
            propertyReader.readObject(this.getHighResolutionOutputSizeshNQ4ISI, appCompatEditText.getCompoundDrawableTintMode());
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public /* bridge */ /* synthetic */ java.lang.CharSequence getText() {
        return getText();
    }

    public AppCompatEditText(android.content.Context context) {
        this(context, null);
    }

    public AppCompatEditText(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, androidx.appcompat.R.attr.editTextStyle);
    }

    public AppCompatEditText(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(androidx.appcompat.widget.TintContextWrapper.wrap(context), attributeSet, i);
        androidx.appcompat.widget.ThemeUtils.checkAppCompatTheme(this, getContext());
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = new androidx.appcompat.widget.AppCompatBackgroundHelper(this);
        this.mBackgroundTintHelper = appCompatBackgroundHelper;
        appCompatBackgroundHelper.getHighResolutionOutputSizeshNQ4ISI(attributeSet, i);
        androidx.appcompat.widget.AppCompatTextHelper appCompatTextHelper = new androidx.appcompat.widget.AppCompatTextHelper(this);
        this.mTextHelper = appCompatTextHelper;
        appCompatTextHelper.getHighSpeedVideoFpsRanges(attributeSet, i);
        appCompatTextHelper.getHighSpeedVideoFpsRanges();
        this.mTextClassifierHelper = new androidx.appcompat.widget.AppCompatTextClassifierHelper(this);
        this.mDefaultOnReceiveContentListener = new androidx.core.widget.TextViewOnReceiveContentListener();
        androidx.appcompat.widget.AppCompatEmojiEditTextHelper appCompatEmojiEditTextHelper = new androidx.appcompat.widget.AppCompatEmojiEditTextHelper(this);
        this.mAppCompatEmojiEditTextHelper = appCompatEmojiEditTextHelper;
        appCompatEmojiEditTextHelper.Camera2StreamConfigurationMap(attributeSet, i);
        initEmojiKeyListener(appCompatEmojiEditTextHelper);
    }

    void initEmojiKeyListener(androidx.appcompat.widget.AppCompatEmojiEditTextHelper appCompatEmojiEditTextHelper) {
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

    @Override // android.widget.EditText, android.widget.TextView
    public android.text.Editable getText() {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
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

    @Override // android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        java.lang.String[] onReceiveContentMimeTypes;
        android.view.inputmethod.InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.getHighSpeedVideoFpsRangesFor(this, onCreateInputConnection, editorInfo);
        android.view.inputmethod.InputConnection highSpeedVideoFpsRangesFor = androidx.appcompat.widget.AppCompatHintHelper.getHighSpeedVideoFpsRangesFor(onCreateInputConnection, editorInfo, this);
        if (highSpeedVideoFpsRangesFor != null && android.os.Build.VERSION.SDK_INT <= 30 && (onReceiveContentMimeTypes = androidx.core.view.ViewCompat.getOnReceiveContentMimeTypes(this)) != null) {
            androidx.core.view.inputmethod.EditorInfoCompat.setContentMimeTypes(editorInfo, onReceiveContentMimeTypes);
            highSpeedVideoFpsRangesFor = androidx.core.view.inputmethod.InputConnectionCompat.createWrapper(this, highSpeedVideoFpsRangesFor, editorInfo);
        }
        return this.mAppCompatEmojiEditTextHelper.Camera2StreamConfigurationMap(highSpeedVideoFpsRangesFor, editorInfo);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.TextViewCompat.wrapCustomSelectionActionModeCallback(this, callback));
    }

    @Override // android.widget.TextView
    public android.view.ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.TextViewCompat.unwrapCustomSelectionActionModeCallback(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (android.os.Build.VERSION.SDK_INT < 30 || android.os.Build.VERSION.SDK_INT >= 33) {
            return;
        }
        ((android.view.inputmethod.InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    private androidx.appcompat.widget.AppCompatEditText.SuperCaller getSuperCaller() {
        if (this.mSuperCaller == null) {
            this.mSuperCaller = new androidx.appcompat.widget.AppCompatEditText.SuperCaller();
        }
        return this.mSuperCaller;
    }

    @Override // android.widget.TextView
    public void setTextClassifier(android.view.textclassifier.TextClassifier textClassifier) {
        androidx.appcompat.widget.AppCompatTextClassifierHelper appCompatTextClassifierHelper;
        if (android.os.Build.VERSION.SDK_INT >= 28 || (appCompatTextClassifierHelper = this.mTextClassifierHelper) == null) {
            getSuperCaller().getHighSpeedVideoSizes(textClassifier);
        } else {
            appCompatTextClassifierHelper.Camera2StreamConfigurationMap(textClassifier);
        }
    }

    @Override // android.widget.TextView
    public android.view.textclassifier.TextClassifier getTextClassifier() {
        androidx.appcompat.widget.AppCompatTextClassifierHelper appCompatTextClassifierHelper;
        if (android.os.Build.VERSION.SDK_INT >= 28 || (appCompatTextClassifierHelper = this.mTextClassifierHelper) == null) {
            return getSuperCaller().Camera2StreamConfigurationMap();
        }
        return appCompatTextClassifierHelper.getHighSpeedVideoFpsRanges();
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(android.view.DragEvent dragEvent) {
        if (androidx.appcompat.widget.AppCompatReceiveContentHelper.getHighSpeedVideoSizes(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        if (androidx.appcompat.widget.AppCompatReceiveContentHelper.Camera2StreamConfigurationMap(this, i)) {
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // androidx.core.view.OnReceiveContentViewBehavior
    public androidx.core.view.ContentInfoCompat onReceiveContent(androidx.core.view.ContentInfoCompat contentInfoCompat) {
        return this.mDefaultOnReceiveContentListener.onReceiveContent(this, contentInfoCompat);
    }

    @Override // android.widget.TextView
    public void setKeyListener(android.text.method.KeyListener keyListener) {
        super.setKeyListener(this.mAppCompatEmojiEditTextHelper.getHighSpeedVideoSizes(keyListener));
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public void setEmojiCompatEnabled(boolean z) {
        this.mAppCompatEmojiEditTextHelper.getHighSpeedVideoFpsRanges(z);
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public boolean isEmojiCompatEnabled() {
        return this.mAppCompatEmojiEditTextHelper.getHighSpeedVideoFpsRangesFor();
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

    class SuperCaller {
        SuperCaller() {
        }

        public android.view.textclassifier.TextClassifier Camera2StreamConfigurationMap() {
            return androidx.appcompat.widget.AppCompatEditText.super.getTextClassifier();
        }

        public void getHighSpeedVideoSizes(android.view.textclassifier.TextClassifier textClassifier) {
            androidx.appcompat.widget.AppCompatEditText.super.setTextClassifier(textClassifier);
        }
    }
}
