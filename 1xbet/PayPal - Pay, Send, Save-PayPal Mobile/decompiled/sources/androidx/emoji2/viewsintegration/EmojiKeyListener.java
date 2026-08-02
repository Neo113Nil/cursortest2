package androidx.emoji2.viewsintegration;

/* loaded from: classes3.dex */
final class EmojiKeyListener implements android.text.method.KeyListener {
    private final androidx.emoji2.viewsintegration.EmojiKeyListener.EmojiCompatHandleKeyDownHelper getHighResolutionOutputSizeshNQ4ISI;
    private final android.text.method.KeyListener getHighSpeedVideoFpsRangesFor;

    EmojiKeyListener(android.text.method.KeyListener keyListener) {
        this(keyListener, new androidx.emoji2.viewsintegration.EmojiKeyListener.EmojiCompatHandleKeyDownHelper());
    }

    private EmojiKeyListener(android.text.method.KeyListener keyListener, androidx.emoji2.viewsintegration.EmojiKeyListener.EmojiCompatHandleKeyDownHelper emojiCompatHandleKeyDownHelper) {
        this.getHighSpeedVideoFpsRangesFor = keyListener;
        this.getHighResolutionOutputSizeshNQ4ISI = emojiCompatHandleKeyDownHelper;
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.getHighSpeedVideoFpsRangesFor.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(android.view.View view, android.text.Editable editable, int i, android.view.KeyEvent keyEvent) {
        return this.getHighResolutionOutputSizeshNQ4ISI.handleKeyDown(editable, i, keyEvent) || this.getHighSpeedVideoFpsRangesFor.onKeyDown(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(android.view.View view, android.text.Editable editable, int i, android.view.KeyEvent keyEvent) {
        return this.getHighSpeedVideoFpsRangesFor.onKeyUp(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(android.view.View view, android.text.Editable editable, android.view.KeyEvent keyEvent) {
        return this.getHighSpeedVideoFpsRangesFor.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(android.view.View view, android.text.Editable editable, int i) {
        this.getHighSpeedVideoFpsRangesFor.clearMetaKeyState(view, editable, i);
    }

    public static class EmojiCompatHandleKeyDownHelper {
        public boolean handleKeyDown(android.text.Editable editable, int i, android.view.KeyEvent keyEvent) {
            return androidx.emoji2.text.EmojiCompat.handleOnKeyDown(editable, i, keyEvent);
        }
    }
}
