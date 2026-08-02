package androidx.appcompat.widget;

/* loaded from: classes3.dex */
class AppCompatEmojiEditTextHelper {
    private final androidx.emoji2.viewsintegration.EmojiEditTextHelper getHighSpeedVideoFpsRanges;
    private final android.widget.EditText getHighSpeedVideoFpsRangesFor;

    AppCompatEmojiEditTextHelper(android.widget.EditText editText) {
        this.getHighSpeedVideoFpsRangesFor = editText;
        this.getHighSpeedVideoFpsRanges = new androidx.emoji2.viewsintegration.EmojiEditTextHelper(editText, false);
    }

    void Camera2StreamConfigurationMap(android.util.AttributeSet attributeSet, int i) {
        android.content.res.TypedArray obtainStyledAttributes = this.getHighSpeedVideoFpsRangesFor.getContext().obtainStyledAttributes(attributeSet, androidx.appcompat.R.styleable.AppCompatTextView, i, 0);
        try {
            boolean z = obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.AppCompatTextView_emojiCompatEnabled) ? obtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.AppCompatTextView_emojiCompatEnabled, true) : true;
            obtainStyledAttributes.recycle();
            getHighSpeedVideoFpsRanges(z);
        } catch (java.lang.Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    boolean getHighSpeedVideoFpsRangesFor(android.text.method.KeyListener keyListener) {
        return !(keyListener instanceof android.text.method.NumberKeyListener);
    }

    void getHighSpeedVideoFpsRanges(boolean z) {
        this.getHighSpeedVideoFpsRanges.setEnabled(z);
    }

    boolean getHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRanges.isEnabled();
    }

    android.text.method.KeyListener getHighSpeedVideoSizes(android.text.method.KeyListener keyListener) {
        return getHighSpeedVideoFpsRangesFor(keyListener) ? this.getHighSpeedVideoFpsRanges.getKeyListener(keyListener) : keyListener;
    }

    android.view.inputmethod.InputConnection Camera2StreamConfigurationMap(android.view.inputmethod.InputConnection inputConnection, android.view.inputmethod.EditorInfo editorInfo) {
        return this.getHighSpeedVideoFpsRanges.onCreateInputConnection(inputConnection, editorInfo);
    }
}
