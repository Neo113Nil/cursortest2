package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\"\u0014\u0010\u0001\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0004\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005"}, d2 = {"", "DEBUG", "Z", "", "TAG", "Ljava/lang/String;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RecordingInputConnection_androidKt {
    public static final boolean DEBUG = false;
    public static final java.lang.String TAG = "RecordingIC";

    public static final /* synthetic */ android.view.inputmethod.ExtractedText access$toExtractedText(androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
        android.view.inputmethod.ExtractedText extractedText = new android.view.inputmethod.ExtractedText();
        extractedText.text = textFieldValue.getText();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = textFieldValue.getText().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = androidx.compose.ui.text.TextRange.m8037getMinimpl(textFieldValue.getSelection());
        extractedText.selectionEnd = androidx.compose.ui.text.TextRange.m8036getMaximpl(textFieldValue.getSelection());
        extractedText.flags = !kotlin.text.StringsKt.contains$default((java.lang.CharSequence) textFieldValue.getText(), '\n', false, 2, (java.lang.Object) null) ? 1 : 0;
        return extractedText;
    }
}
