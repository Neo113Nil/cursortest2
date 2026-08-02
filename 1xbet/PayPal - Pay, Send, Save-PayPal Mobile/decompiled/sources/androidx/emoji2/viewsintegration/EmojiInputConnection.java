package androidx.emoji2.viewsintegration;

/* loaded from: classes3.dex */
final class EmojiInputConnection extends android.view.inputmethod.InputConnectionWrapper {
    private final androidx.emoji2.viewsintegration.EmojiInputConnection.EmojiCompatDeleteHelper Camera2StreamConfigurationMap;
    private final android.widget.TextView getHighSpeedVideoFpsRangesFor;

    EmojiInputConnection(android.widget.TextView textView, android.view.inputmethod.InputConnection inputConnection, android.view.inputmethod.EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new androidx.emoji2.viewsintegration.EmojiInputConnection.EmojiCompatDeleteHelper());
    }

    private EmojiInputConnection(android.widget.TextView textView, android.view.inputmethod.InputConnection inputConnection, android.view.inputmethod.EditorInfo editorInfo, androidx.emoji2.viewsintegration.EmojiInputConnection.EmojiCompatDeleteHelper emojiCompatDeleteHelper) {
        super(inputConnection, false);
        this.getHighSpeedVideoFpsRangesFor = textView;
        this.Camera2StreamConfigurationMap = emojiCompatDeleteHelper;
        emojiCompatDeleteHelper.updateEditorInfoAttrs(editorInfo);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        return this.Camera2StreamConfigurationMap.handleDeleteSurroundingText(this, this.getHighSpeedVideoFpsRangesFor.getEditableText(), i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return this.Camera2StreamConfigurationMap.handleDeleteSurroundingText(this, this.getHighSpeedVideoFpsRangesFor.getEditableText(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }

    public static class EmojiCompatDeleteHelper {
        public boolean handleDeleteSurroundingText(android.view.inputmethod.InputConnection inputConnection, android.text.Editable editable, int i, int i2, boolean z) {
            return androidx.emoji2.text.EmojiCompat.handleDeleteSurroundingText(inputConnection, editable, i, i2, z);
        }

        public void updateEditorInfoAttrs(android.view.inputmethod.EditorInfo editorInfo) {
            if (androidx.emoji2.text.EmojiCompat.isConfigured()) {
                androidx.emoji2.text.EmojiCompat.get().updateEditorInfo(editorInfo);
            }
        }
    }
}
