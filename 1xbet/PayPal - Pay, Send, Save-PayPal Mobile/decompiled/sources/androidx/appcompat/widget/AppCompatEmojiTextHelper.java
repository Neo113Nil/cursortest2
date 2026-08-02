package androidx.appcompat.widget;

/* loaded from: classes3.dex */
class AppCompatEmojiTextHelper {
    private final android.widget.TextView getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.emoji2.viewsintegration.EmojiTextViewHelper getHighSpeedVideoFpsRanges;

    AppCompatEmojiTextHelper(android.widget.TextView textView) {
        this.getHighResolutionOutputSizeshNQ4ISI = textView;
        this.getHighSpeedVideoFpsRanges = new androidx.emoji2.viewsintegration.EmojiTextViewHelper(textView, false);
    }

    void getHighSpeedVideoSizes(android.util.AttributeSet attributeSet, int i) {
        android.content.res.TypedArray obtainStyledAttributes = this.getHighResolutionOutputSizeshNQ4ISI.getContext().obtainStyledAttributes(attributeSet, androidx.appcompat.R.styleable.AppCompatTextView, i, 0);
        try {
            boolean z = obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.AppCompatTextView_emojiCompatEnabled) ? obtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.AppCompatTextView_emojiCompatEnabled, true) : true;
            obtainStyledAttributes.recycle();
            getHighSpeedVideoSizes(z);
        } catch (java.lang.Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    void getHighSpeedVideoSizes(boolean z) {
        this.getHighSpeedVideoFpsRanges.setEnabled(z);
    }

    public boolean getHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighSpeedVideoFpsRanges.isEnabled();
    }

    android.text.InputFilter[] getHighSpeedVideoFpsRangesFor(android.text.InputFilter[] inputFilterArr) {
        return this.getHighSpeedVideoFpsRanges.getFilters(inputFilterArr);
    }

    void Camera2StreamConfigurationMap(boolean z) {
        this.getHighSpeedVideoFpsRanges.setAllCaps(z);
    }

    public android.text.method.TransformationMethod getHighSpeedVideoFpsRangesFor(android.text.method.TransformationMethod transformationMethod) {
        return this.getHighSpeedVideoFpsRanges.wrapTransformationMethod(transformationMethod);
    }
}
