package androidx.appcompat.widget;

/* loaded from: classes3.dex */
public class AppCompatTextView extends android.widget.TextView implements androidx.core.view.TintableBackgroundView, androidx.core.widget.TintableCompoundDrawablesView, androidx.core.widget.AutoSizeableTextView, androidx.appcompat.widget.EmojiCompatConfigurationView {
    private final androidx.appcompat.widget.AppCompatBackgroundHelper mBackgroundTintHelper;
    private androidx.appcompat.widget.AppCompatEmojiTextHelper mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;
    private java.util.concurrent.Future<androidx.core.text.PrecomputedTextCompat> mPrecomputedTextFuture;
    private androidx.appcompat.widget.AppCompatTextView.SuperCaller mSuperCaller;
    private final androidx.appcompat.widget.AppCompatTextClassifierHelper mTextClassifierHelper;
    private final androidx.appcompat.widget.AppCompatTextHelper mTextHelper;

    interface SuperCaller {
        int Camera2StreamConfigurationMap();

        void Camera2StreamConfigurationMap(int i);

        void Camera2StreamConfigurationMap(int i, int i2, int i3, int i4);

        void getHighResolutionOutputSizeshNQ4ISI(int i);

        int[] getHighResolutionOutputSizeshNQ4ISI();

        int getHighSpeedVideoFpsRanges();

        void getHighSpeedVideoFpsRanges(android.view.textclassifier.TextClassifier textClassifier);

        void getHighSpeedVideoFpsRanges(int[] iArr, int i);

        int getHighSpeedVideoFpsRangesFor();

        void getHighSpeedVideoFpsRangesFor(int i, float f);

        int getHighSpeedVideoSizes();

        void getHighSpeedVideoSizes(int i);

        android.view.textclassifier.TextClassifier getInputFormats();
    }

    /* loaded from: classes5.dex */
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<androidx.appcompat.widget.AppCompatTextView> {
        private int Camera2StreamConfigurationMap;
        private int getHighResolutionOutputSizeshNQ4ISI;
        private int getHighSpeedVideoFpsRanges;
        private int getHighSpeedVideoFpsRangesFor;
        private int getHighSpeedVideoSizes;
        private int getHighSpeedVideoSizesFor;
        private int getInputSizeshNQ4ISI;
        private int getOutputFormats;
        private boolean getOutputMinFrameDuration = false;

        @Override // android.view.inspector.InspectionCompanion
        public final void mapProperties(android.view.inspector.PropertyMapper propertyMapper) {
            this.getHighSpeedVideoFpsRangesFor = propertyMapper.mapInt("autoSizeMaxTextSize", androidx.appcompat.R.attr.autoSizeMaxTextSize);
            this.getHighSpeedVideoFpsRanges = propertyMapper.mapInt("autoSizeMinTextSize", androidx.appcompat.R.attr.autoSizeMinTextSize);
            this.getHighResolutionOutputSizeshNQ4ISI = propertyMapper.mapInt("autoSizeStepGranularity", androidx.appcompat.R.attr.autoSizeStepGranularity);
            this.Camera2StreamConfigurationMap = propertyMapper.mapIntEnum("autoSizeTextType", androidx.appcompat.R.attr.autoSizeTextType, new java.util.function.IntFunction<java.lang.String>() { // from class: androidx.appcompat.widget.AppCompatTextView.InspectionCompanion.1
                @Override // java.util.function.IntFunction
                /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
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
            this.getHighSpeedVideoSizes = propertyMapper.mapObject("backgroundTint", androidx.appcompat.R.attr.backgroundTint);
            this.getOutputFormats = propertyMapper.mapObject("backgroundTintMode", androidx.appcompat.R.attr.backgroundTintMode);
            this.getHighSpeedVideoSizesFor = propertyMapper.mapObject("drawableTint", androidx.appcompat.R.attr.drawableTint);
            this.getInputSizeshNQ4ISI = propertyMapper.mapObject("drawableTintMode", androidx.appcompat.R.attr.drawableTintMode);
            this.getOutputMinFrameDuration = true;
        }

        @Override // android.view.inspector.InspectionCompanion
        public final void readProperties(androidx.appcompat.widget.AppCompatTextView appCompatTextView, android.view.inspector.PropertyReader propertyReader) {
            if (!this.getOutputMinFrameDuration) {
                throw new android.view.inspector.InspectionCompanion.UninitializedPropertyMapException();
            }
            propertyReader.readInt(this.getHighSpeedVideoFpsRangesFor, appCompatTextView.getAutoSizeMaxTextSize());
            propertyReader.readInt(this.getHighSpeedVideoFpsRanges, appCompatTextView.getAutoSizeMinTextSize());
            propertyReader.readInt(this.getHighResolutionOutputSizeshNQ4ISI, appCompatTextView.getAutoSizeStepGranularity());
            propertyReader.readIntEnum(this.Camera2StreamConfigurationMap, appCompatTextView.getAutoSizeTextType());
            propertyReader.readObject(this.getHighSpeedVideoSizes, appCompatTextView.getBackgroundTintList());
            propertyReader.readObject(this.getOutputFormats, appCompatTextView.getBackgroundTintMode());
            propertyReader.readObject(this.getHighSpeedVideoSizesFor, appCompatTextView.getCompoundDrawableTintList());
            propertyReader.readObject(this.getInputSizeshNQ4ISI, appCompatTextView.getCompoundDrawableTintMode());
        }
    }

    public AppCompatTextView(android.content.Context context) {
        this(context, null);
    }

    public AppCompatTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.textViewStyle);
    }

    public AppCompatTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(androidx.appcompat.widget.TintContextWrapper.wrap(context), attributeSet, i);
        this.mIsSetTypefaceProcessing = false;
        this.mSuperCaller = null;
        androidx.appcompat.widget.ThemeUtils.checkAppCompatTheme(this, getContext());
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = new androidx.appcompat.widget.AppCompatBackgroundHelper(this);
        this.mBackgroundTintHelper = appCompatBackgroundHelper;
        appCompatBackgroundHelper.getHighResolutionOutputSizeshNQ4ISI(attributeSet, i);
        androidx.appcompat.widget.AppCompatTextHelper appCompatTextHelper = new androidx.appcompat.widget.AppCompatTextHelper(this);
        this.mTextHelper = appCompatTextHelper;
        appCompatTextHelper.getHighSpeedVideoFpsRanges(attributeSet, i);
        appCompatTextHelper.getHighSpeedVideoFpsRanges();
        this.mTextClassifierHelper = new androidx.appcompat.widget.AppCompatTextClassifierHelper(this);
        getEmojiTextViewHelper().getHighSpeedVideoSizes(attributeSet, i);
    }

    private androidx.appcompat.widget.AppCompatEmojiTextHelper getEmojiTextViewHelper() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new androidx.appcompat.widget.AppCompatEmojiTextHelper(this);
        }
        return this.mEmojiTextViewHelper;
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

    @Override // android.widget.TextView
    public void setTextAppearance(android.content.Context context, int i) {
        super.setTextAppearance(context, i);
        androidx.appcompat.widget.AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.getHighSpeedVideoFpsRangesFor(context, i);
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

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
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
    protected void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.mTextHelper == null || androidx.appcompat.widget.ViewUtils.getHighSpeedVideoFpsRangesFor || !this.mTextHelper.getInputFormats()) {
            return;
        }
        this.mTextHelper.Camera2StreamConfigurationMap();
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (androidx.appcompat.widget.ViewUtils.getHighSpeedVideoFpsRangesFor) {
            getSuperCaller().Camera2StreamConfigurationMap(i);
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
            getSuperCaller().Camera2StreamConfigurationMap(i, i2, i3, i4);
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
            getSuperCaller().getHighSpeedVideoFpsRanges(iArr, i);
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
            return getSuperCaller().Camera2StreamConfigurationMap() == 1 ? 1 : 0;
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
            return getSuperCaller().getHighSpeedVideoFpsRanges();
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
            return getSuperCaller().getHighSpeedVideoSizes();
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
            return getSuperCaller().getHighSpeedVideoFpsRangesFor();
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
            return getSuperCaller().getHighResolutionOutputSizeshNQ4ISI();
        }
        androidx.appcompat.widget.AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            return appCompatTextHelper.getHighSpeedVideoSizesFor();
        }
        return new int[0];
    }

    @Override // android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        android.view.inputmethod.InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.getHighSpeedVideoFpsRangesFor(this, onCreateInputConnection, editorInfo);
        return androidx.appcompat.widget.AppCompatHintHelper.getHighSpeedVideoFpsRangesFor(onCreateInputConnection, editorInfo, this);
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().getHighSpeedVideoSizes(i);
        } else {
            androidx.core.widget.TextViewCompat.setFirstBaselineToTopHeight(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().getHighResolutionOutputSizeshNQ4ISI(i);
        } else {
            androidx.core.widget.TextViewCompat.setLastBaselineToBottomHeight(this, i);
        }
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return androidx.core.widget.TextViewCompat.getFirstBaselineToTopHeight(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return androidx.core.widget.TextViewCompat.getLastBaselineToBottomHeight(this);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        androidx.core.widget.TextViewCompat.setLineHeight(this, i);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i, float f) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            getSuperCaller().getHighSpeedVideoFpsRangesFor(i, f);
        } else {
            androidx.core.widget.TextViewCompat.setLineHeight(this, i, f);
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

    public androidx.core.text.PrecomputedTextCompat.Params getTextMetricsParamsCompat() {
        return androidx.core.widget.TextViewCompat.getTextMetricsParams(this);
    }

    public void setTextMetricsParamsCompat(androidx.core.text.PrecomputedTextCompat.Params params) {
        androidx.core.widget.TextViewCompat.setTextMetricsParams(this, params);
    }

    public void setPrecomputedText(androidx.core.text.PrecomputedTextCompat precomputedTextCompat) {
        androidx.core.widget.TextViewCompat.setPrecomputedText(this, precomputedTextCompat);
    }

    private void consumeTextFutureAndSetBlocking() {
        java.util.concurrent.Future<androidx.core.text.PrecomputedTextCompat> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                androidx.core.widget.TextViewCompat.setPrecomputedText(this, future.get());
            } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView
    public java.lang.CharSequence getText() {
        consumeTextFutureAndSetBlocking();
        return super.getText();
    }

    @Override // android.widget.TextView
    public void setTextClassifier(android.view.textclassifier.TextClassifier textClassifier) {
        androidx.appcompat.widget.AppCompatTextClassifierHelper appCompatTextClassifierHelper;
        if (android.os.Build.VERSION.SDK_INT >= 28 || (appCompatTextClassifierHelper = this.mTextClassifierHelper) == null) {
            getSuperCaller().getHighSpeedVideoFpsRanges(textClassifier);
        } else {
            appCompatTextClassifierHelper.Camera2StreamConfigurationMap(textClassifier);
        }
    }

    @Override // android.widget.TextView
    public android.view.textclassifier.TextClassifier getTextClassifier() {
        androidx.appcompat.widget.AppCompatTextClassifierHelper appCompatTextClassifierHelper;
        if (android.os.Build.VERSION.SDK_INT >= 28 || (appCompatTextClassifierHelper = this.mTextClassifierHelper) == null) {
            return getSuperCaller().getInputFormats();
        }
        return appCompatTextClassifierHelper.getHighSpeedVideoFpsRanges();
    }

    public void setTextFuture(java.util.concurrent.Future<androidx.core.text.PrecomputedTextCompat> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        consumeTextFutureAndSetBlocking();
        super.onMeasure(i, i2);
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

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        androidx.appcompat.widget.AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.getOutputStallDuration();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        android.content.Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? androidx.appcompat.content.res.AppCompatResources.getDrawable(context, i) : null, i2 != 0 ? androidx.appcompat.content.res.AppCompatResources.getDrawable(context, i2) : null, i3 != 0 ? androidx.appcompat.content.res.AppCompatResources.getDrawable(context, i3) : null, i4 != 0 ? androidx.appcompat.content.res.AppCompatResources.getDrawable(context, i4) : null);
        androidx.appcompat.widget.AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.getOutputStallDuration();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        androidx.appcompat.widget.AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.getOutputStallDuration();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        android.content.Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? androidx.appcompat.content.res.AppCompatResources.getDrawable(context, i) : null, i2 != 0 ? androidx.appcompat.content.res.AppCompatResources.getDrawable(context, i2) : null, i3 != 0 ? androidx.appcompat.content.res.AppCompatResources.getDrawable(context, i3) : null, i4 != 0 ? androidx.appcompat.content.res.AppCompatResources.getDrawable(context, i4) : null);
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

    @Override // android.widget.TextView
    public void setTypeface(android.graphics.Typeface typeface, int i) {
        if (this.mIsSetTypefaceProcessing) {
            return;
        }
        android.graphics.Typeface create = (typeface == null || i <= 0) ? null : androidx.core.graphics.TypefaceCompat.create(getContext(), typeface, i);
        this.mIsSetTypefaceProcessing = true;
        if (create != null) {
            typeface = create;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.mIsSetTypefaceProcessing = false;
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (android.os.Build.VERSION.SDK_INT < 30 || android.os.Build.VERSION.SDK_INT >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((android.view.inputmethod.InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    androidx.appcompat.widget.AppCompatTextView.SuperCaller getSuperCaller() {
        if (this.mSuperCaller == null) {
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                this.mSuperCaller = new androidx.appcompat.widget.AppCompatTextView.SuperCallerApi34();
            } else if (android.os.Build.VERSION.SDK_INT >= 28) {
                this.mSuperCaller = new androidx.appcompat.widget.AppCompatTextView.SuperCallerApi28();
            } else {
                this.mSuperCaller = new androidx.appcompat.widget.AppCompatTextView.SuperCallerApi26();
            }
        }
        return this.mSuperCaller;
    }

    class SuperCallerApi26 implements androidx.appcompat.widget.AppCompatTextView.SuperCaller {
        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public void getHighResolutionOutputSizeshNQ4ISI(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public void getHighSpeedVideoFpsRangesFor(int i, float f) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public void getHighSpeedVideoSizes(int i) {
        }

        SuperCallerApi26() {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public int getHighSpeedVideoFpsRangesFor() {
            return androidx.appcompat.widget.AppCompatTextView.super.getAutoSizeMaxTextSize();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public int getHighSpeedVideoSizes() {
            return androidx.appcompat.widget.AppCompatTextView.super.getAutoSizeMinTextSize();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public int getHighSpeedVideoFpsRanges() {
            return androidx.appcompat.widget.AppCompatTextView.super.getAutoSizeStepGranularity();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public int[] getHighResolutionOutputSizeshNQ4ISI() {
            return androidx.appcompat.widget.AppCompatTextView.super.getAutoSizeTextAvailableSizes();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public int Camera2StreamConfigurationMap() {
            return androidx.appcompat.widget.AppCompatTextView.super.getAutoSizeTextType();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public android.view.textclassifier.TextClassifier getInputFormats() {
            return androidx.appcompat.widget.AppCompatTextView.super.getTextClassifier();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public void Camera2StreamConfigurationMap(int i, int i2, int i3, int i4) {
            androidx.appcompat.widget.AppCompatTextView.super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public void getHighSpeedVideoFpsRanges(int[] iArr, int i) {
            androidx.appcompat.widget.AppCompatTextView.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public void Camera2StreamConfigurationMap(int i) {
            androidx.appcompat.widget.AppCompatTextView.super.setAutoSizeTextTypeWithDefaults(i);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public void getHighSpeedVideoFpsRanges(android.view.textclassifier.TextClassifier textClassifier) {
            androidx.appcompat.widget.AppCompatTextView.super.setTextClassifier(textClassifier);
        }
    }

    class SuperCallerApi28 extends androidx.appcompat.widget.AppCompatTextView.SuperCallerApi26 {
        SuperCallerApi28() {
            super();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCallerApi26, androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public void getHighSpeedVideoSizes(int i) {
            androidx.appcompat.widget.AppCompatTextView.super.setFirstBaselineToTopHeight(i);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCallerApi26, androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public void getHighResolutionOutputSizeshNQ4ISI(int i) {
            androidx.appcompat.widget.AppCompatTextView.super.setLastBaselineToBottomHeight(i);
        }
    }

    class SuperCallerApi34 extends androidx.appcompat.widget.AppCompatTextView.SuperCallerApi28 {
        SuperCallerApi34() {
            super();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCallerApi26, androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public void getHighSpeedVideoFpsRangesFor(int i, float f) {
            androidx.appcompat.widget.AppCompatTextView.super.setLineHeight(i, f);
        }
    }
}
