package androidx.emoji2.viewsintegration;

/* loaded from: classes3.dex */
final class EmojiTextWatcher implements android.text.TextWatcher {
    androidx.emoji2.text.EmojiCompat.InitCallback Camera2StreamConfigurationMap;
    final android.widget.EditText getHighSpeedVideoFpsRangesFor;
    private final boolean getOutputMinFrameDuration;
    int getHighResolutionOutputSizeshNQ4ISI = Integer.MAX_VALUE;
    int getHighSpeedVideoSizes = 0;
    boolean getHighSpeedVideoFpsRanges = true;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
    }

    EmojiTextWatcher(android.widget.EditText editText, boolean z) {
        this.getHighSpeedVideoFpsRangesFor = editText;
        this.getOutputMinFrameDuration = z;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        if (this.getHighSpeedVideoFpsRangesFor.isInEditMode() || !this.getHighSpeedVideoFpsRanges) {
            return;
        }
        if ((this.getOutputMinFrameDuration || androidx.emoji2.text.EmojiCompat.isConfigured()) && i2 <= i3 && (charSequence instanceof android.text.Spannable)) {
            int loadState = androidx.emoji2.text.EmojiCompat.get().getLoadState();
            if (loadState != 0) {
                if (loadState == 1) {
                    androidx.emoji2.text.EmojiCompat.get().process((android.text.Spannable) charSequence, i, i + i3, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
                    return;
                } else if (loadState != 3) {
                    return;
                }
            }
            androidx.emoji2.text.EmojiCompat emojiCompat = androidx.emoji2.text.EmojiCompat.get();
            if (this.Camera2StreamConfigurationMap == null) {
                this.Camera2StreamConfigurationMap = new androidx.emoji2.viewsintegration.EmojiTextWatcher.InitCallbackImpl(this.getHighSpeedVideoFpsRangesFor);
            }
            emojiCompat.registerInitCallback(this.Camera2StreamConfigurationMap);
        }
    }

    static class InitCallbackImpl extends androidx.emoji2.text.EmojiCompat.InitCallback implements java.lang.Runnable {
        private final java.lang.ref.Reference<android.widget.EditText> getHighSpeedVideoFpsRanges;

        InitCallbackImpl(android.widget.EditText editText) {
            this.getHighSpeedVideoFpsRanges = new java.lang.ref.WeakReference(editText);
        }

        @Override // androidx.emoji2.text.EmojiCompat.InitCallback
        public void onInitialized() {
            android.os.Handler handler;
            super.onInitialized();
            android.widget.EditText editText = this.getHighSpeedVideoFpsRanges.get();
            if (editText == null || (handler = editText.getHandler()) == null) {
                return;
            }
            handler.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.emoji2.viewsintegration.EmojiTextWatcher.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges.get(), 1);
        }
    }

    static void getHighResolutionOutputSizeshNQ4ISI(android.widget.EditText editText, int i) {
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            android.text.Editable editableText = editText.getEditableText();
            int selectionStart = android.text.Selection.getSelectionStart(editableText);
            int selectionEnd = android.text.Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.EmojiCompat.get().process(editableText);
            androidx.emoji2.viewsintegration.EmojiInputFilter.getHighResolutionOutputSizeshNQ4ISI(editableText, selectionStart, selectionEnd);
        }
    }
}
