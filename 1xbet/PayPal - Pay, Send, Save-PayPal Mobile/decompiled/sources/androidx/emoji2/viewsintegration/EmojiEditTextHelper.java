package androidx.emoji2.viewsintegration;

/* loaded from: classes3.dex */
public final class EmojiEditTextHelper {
    private int Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.emoji2.viewsintegration.EmojiEditTextHelper.HelperInternal getHighSpeedVideoSizes;

    public EmojiEditTextHelper(android.widget.EditText editText) {
        this(editText, true);
    }

    public EmojiEditTextHelper(android.widget.EditText editText, boolean z) {
        this.Camera2StreamConfigurationMap = Integer.MAX_VALUE;
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
        androidx.core.util.Preconditions.checkNotNull(editText, "editText cannot be null");
        this.getHighSpeedVideoSizes = new androidx.emoji2.viewsintegration.EmojiEditTextHelper.HelperInternal19(editText, z);
    }

    public final void setMaxEmojiCount(int i) {
        androidx.core.util.Preconditions.checkArgumentNonnegative(i, "maxEmojiCount should be greater than 0");
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor(i);
    }

    public final int getMaxEmojiCount() {
        return this.Camera2StreamConfigurationMap;
    }

    public final android.text.method.KeyListener getKeyListener(android.text.method.KeyListener keyListener) {
        return this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor(keyListener);
    }

    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.InputConnection inputConnection, android.view.inputmethod.EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.getHighSpeedVideoSizes.getHighSpeedVideoSizes(inputConnection, editorInfo);
    }

    public final void setEmojiReplaceStrategy(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoSizes.getHighSpeedVideoSizes(i);
    }

    public final int getEmojiReplaceStrategy() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final boolean isEnabled() {
        return this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor();
    }

    public final void setEnabled(boolean z) {
        this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges(z);
    }

    static class HelperInternal {
        void getHighSpeedVideoFpsRanges(boolean z) {
        }

        android.text.method.KeyListener getHighSpeedVideoFpsRangesFor(android.text.method.KeyListener keyListener) {
            return keyListener;
        }

        void getHighSpeedVideoFpsRangesFor(int i) {
        }

        boolean getHighSpeedVideoFpsRangesFor() {
            return false;
        }

        android.view.inputmethod.InputConnection getHighSpeedVideoSizes(android.view.inputmethod.InputConnection inputConnection, android.view.inputmethod.EditorInfo editorInfo) {
            return inputConnection;
        }

        void getHighSpeedVideoSizes(int i) {
        }

        HelperInternal() {
        }
    }

    static class HelperInternal19 extends androidx.emoji2.viewsintegration.EmojiEditTextHelper.HelperInternal {
        private final androidx.emoji2.viewsintegration.EmojiTextWatcher getHighResolutionOutputSizeshNQ4ISI;
        private final android.widget.EditText getHighSpeedVideoFpsRanges;

        HelperInternal19(android.widget.EditText editText, boolean z) {
            this.getHighSpeedVideoFpsRanges = editText;
            androidx.emoji2.viewsintegration.EmojiTextWatcher emojiTextWatcher = new androidx.emoji2.viewsintegration.EmojiTextWatcher(editText, z);
            this.getHighResolutionOutputSizeshNQ4ISI = emojiTextWatcher;
            editText.addTextChangedListener(emojiTextWatcher);
            editText.setEditableFactory(androidx.emoji2.viewsintegration.EmojiEditableFactory.getHighSpeedVideoFpsRangesFor());
        }

        @Override // androidx.emoji2.viewsintegration.EmojiEditTextHelper.HelperInternal
        void getHighSpeedVideoFpsRangesFor(int i) {
            this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI = i;
        }

        @Override // androidx.emoji2.viewsintegration.EmojiEditTextHelper.HelperInternal
        void getHighSpeedVideoSizes(int i) {
            this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes = i;
        }

        @Override // androidx.emoji2.viewsintegration.EmojiEditTextHelper.HelperInternal
        android.text.method.KeyListener getHighSpeedVideoFpsRangesFor(android.text.method.KeyListener keyListener) {
            if (!(keyListener instanceof androidx.emoji2.viewsintegration.EmojiKeyListener)) {
                if (keyListener == null) {
                    return null;
                }
                if (!(keyListener instanceof android.text.method.NumberKeyListener)) {
                    return new androidx.emoji2.viewsintegration.EmojiKeyListener(keyListener);
                }
            }
            return keyListener;
        }

        @Override // androidx.emoji2.viewsintegration.EmojiEditTextHelper.HelperInternal
        android.view.inputmethod.InputConnection getHighSpeedVideoSizes(android.view.inputmethod.InputConnection inputConnection, android.view.inputmethod.EditorInfo editorInfo) {
            return inputConnection instanceof androidx.emoji2.viewsintegration.EmojiInputConnection ? inputConnection : new androidx.emoji2.viewsintegration.EmojiInputConnection(this.getHighSpeedVideoFpsRanges, inputConnection, editorInfo);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiEditTextHelper.HelperInternal
        void getHighSpeedVideoFpsRanges(boolean z) {
            androidx.emoji2.viewsintegration.EmojiTextWatcher emojiTextWatcher = this.getHighResolutionOutputSizeshNQ4ISI;
            if (emojiTextWatcher.getHighSpeedVideoFpsRanges != z) {
                if (emojiTextWatcher.Camera2StreamConfigurationMap != null) {
                    androidx.emoji2.text.EmojiCompat.get().unregisterInitCallback(emojiTextWatcher.Camera2StreamConfigurationMap);
                }
                emojiTextWatcher.getHighSpeedVideoFpsRanges = z;
                if (z) {
                    androidx.emoji2.viewsintegration.EmojiTextWatcher.getHighResolutionOutputSizeshNQ4ISI(emojiTextWatcher.getHighSpeedVideoFpsRangesFor, androidx.emoji2.text.EmojiCompat.get().getLoadState());
                }
            }
        }

        @Override // androidx.emoji2.viewsintegration.EmojiEditTextHelper.HelperInternal
        boolean getHighSpeedVideoFpsRangesFor() {
            return this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
        }
    }
}
