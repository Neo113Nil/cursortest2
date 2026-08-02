package androidx.compose.ui.text.input;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue;", "Landroid/view/inputmethod/ExtractedText;", "toExtractedText", "(Landroidx/compose/ui/text/input/TextFieldValue;)Landroid/view/inputmethod/ExtractedText;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InputState_androidKt {
    public static final android.view.inputmethod.ExtractedText toExtractedText(androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
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
