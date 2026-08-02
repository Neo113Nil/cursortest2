package androidx.emoji2.viewsintegration;

/* loaded from: classes3.dex */
final class EmojiInputFilter implements android.text.InputFilter {
    private final android.widget.TextView getHighResolutionOutputSizeshNQ4ISI;
    private androidx.emoji2.text.EmojiCompat.InitCallback getHighSpeedVideoFpsRangesFor;

    EmojiInputFilter(android.widget.TextView textView) {
        this.getHighResolutionOutputSizeshNQ4ISI = textView;
    }

    @Override // android.text.InputFilter
    public final java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i, int i2, android.text.Spanned spanned, int i3, int i4) {
        if (this.getHighResolutionOutputSizeshNQ4ISI.isInEditMode()) {
            return charSequence;
        }
        int loadState = androidx.emoji2.text.EmojiCompat.get().getLoadState();
        if (loadState != 0) {
            if (loadState == 1) {
                if ((i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == this.getHighResolutionOutputSizeshNQ4ISI.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return androidx.emoji2.text.EmojiCompat.get().process(charSequence, 0, charSequence.length());
            }
            if (loadState != 3) {
                return charSequence;
            }
        }
        androidx.emoji2.text.EmojiCompat emojiCompat = androidx.emoji2.text.EmojiCompat.get();
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            this.getHighSpeedVideoFpsRangesFor = new androidx.emoji2.viewsintegration.EmojiInputFilter.InitCallbackImpl(this.getHighResolutionOutputSizeshNQ4ISI, this);
        }
        emojiCompat.registerInitCallback(this.getHighSpeedVideoFpsRangesFor);
        return charSequence;
    }

    static class InitCallbackImpl extends androidx.emoji2.text.EmojiCompat.InitCallback implements java.lang.Runnable {
        private final java.lang.ref.Reference<android.widget.TextView> getHighResolutionOutputSizeshNQ4ISI;
        private final java.lang.ref.Reference<androidx.emoji2.viewsintegration.EmojiInputFilter> getHighSpeedVideoFpsRanges;

        InitCallbackImpl(android.widget.TextView textView, androidx.emoji2.viewsintegration.EmojiInputFilter emojiInputFilter) {
            this.getHighResolutionOutputSizeshNQ4ISI = new java.lang.ref.WeakReference(textView);
            this.getHighSpeedVideoFpsRanges = new java.lang.ref.WeakReference(emojiInputFilter);
        }

        @Override // androidx.emoji2.text.EmojiCompat.InitCallback
        public void onInitialized() {
            android.os.Handler handler;
            super.onInitialized();
            android.widget.TextView textView = this.getHighResolutionOutputSizeshNQ4ISI.get();
            if (textView == null || (handler = textView.getHandler()) == null) {
                return;
            }
            handler.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            android.text.InputFilter[] filters;
            java.lang.CharSequence text;
            java.lang.CharSequence process;
            android.widget.TextView textView = this.getHighResolutionOutputSizeshNQ4ISI.get();
            androidx.emoji2.viewsintegration.EmojiInputFilter emojiInputFilter = this.getHighSpeedVideoFpsRanges.get();
            if (emojiInputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return;
            }
            for (android.text.InputFilter inputFilter : filters) {
                if (inputFilter == emojiInputFilter) {
                    if (!textView.isAttachedToWindow() || text == (process = androidx.emoji2.text.EmojiCompat.get().process((text = textView.getText())))) {
                        return;
                    }
                    int selectionStart = android.text.Selection.getSelectionStart(process);
                    int selectionEnd = android.text.Selection.getSelectionEnd(process);
                    textView.setText(process);
                    if (process instanceof android.text.Spannable) {
                        androidx.emoji2.viewsintegration.EmojiInputFilter.getHighResolutionOutputSizeshNQ4ISI((android.text.Spannable) process, selectionStart, selectionEnd);
                        return;
                    }
                    return;
                }
            }
        }
    }

    static void getHighResolutionOutputSizeshNQ4ISI(android.text.Spannable spannable, int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            android.text.Selection.setSelection(spannable, i, i2);
        } else if (i >= 0) {
            android.text.Selection.setSelection(spannable, i);
        } else if (i2 >= 0) {
            android.text.Selection.setSelection(spannable, i2);
        }
    }
}
