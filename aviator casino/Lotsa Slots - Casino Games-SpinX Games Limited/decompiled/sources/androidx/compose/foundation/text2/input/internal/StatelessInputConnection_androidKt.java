package androidx.compose.foundation.text2.input.internal;

/* compiled from: StatelessInputConnection.android.kt */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\tH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0004\u0010\u0005\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"DEBUG_CLASS", "", "SIC_DEBUG", "", "getSIC_DEBUG$annotations", "()V", "TAG", "toExtractedText", "Landroid/view/inputmethod/ExtractedText;", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StatelessInputConnection_androidKt {
    private static final java.lang.String DEBUG_CLASS = "StatelessInputConnection";
    public static final boolean SIC_DEBUG = false;
    private static final java.lang.String TAG = "StatelessIC";

    public static /* synthetic */ void getSIC_DEBUG$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final android.view.inputmethod.ExtractedText toExtractedText(androidx.compose.foundation.text2.input.TextFieldCharSequence textFieldCharSequence) {
        android.view.inputmethod.ExtractedText extractedText = new android.view.inputmethod.ExtractedText();
        androidx.compose.foundation.text2.input.TextFieldCharSequence textFieldCharSequence2 = textFieldCharSequence;
        extractedText.text = textFieldCharSequence2;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = textFieldCharSequence.length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = androidx.compose.ui.text.TextRange.m3962getMinimpl(textFieldCharSequence.getSelectionInChars());
        extractedText.selectionEnd = androidx.compose.ui.text.TextRange.m3961getMaximpl(textFieldCharSequence.getSelectionInChars());
        extractedText.flags = !kotlin.text.StringsKt.contains$default((java.lang.CharSequence) textFieldCharSequence2, '\n', false, 2, (java.lang.Object) null) ? 1 : 0;
        return extractedText;
    }
}
