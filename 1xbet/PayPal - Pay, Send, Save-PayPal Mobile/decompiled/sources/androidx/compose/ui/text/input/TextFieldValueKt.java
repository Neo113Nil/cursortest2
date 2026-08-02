package androidx.compose.ui.text.input;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue;", "", "maxChars", "Landroidx/compose/ui/text/AnnotatedString;", "getTextBeforeSelection", "(Landroidx/compose/ui/text/input/TextFieldValue;I)Landroidx/compose/ui/text/AnnotatedString;", "getTextAfterSelection", "getSelectedText", "(Landroidx/compose/ui/text/input/TextFieldValue;)Landroidx/compose/ui/text/AnnotatedString;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldValueKt {
    public static final androidx.compose.ui.text.AnnotatedString getTextBeforeSelection(androidx.compose.ui.text.input.TextFieldValue textFieldValue, int i) {
        androidx.compose.ui.text.AnnotatedString annotatedString = textFieldValue.getAnnotatedString();
        int m8037getMinimpl = androidx.compose.ui.text.TextRange.m8037getMinimpl(textFieldValue.getSelection());
        int i2 = m8037getMinimpl - i;
        if (((i ^ m8037getMinimpl) & (m8037getMinimpl ^ i2)) < 0) {
            i2 = 0;
        }
        return annotatedString.subSequence(java.lang.Math.max(0, i2), androidx.compose.ui.text.TextRange.m8037getMinimpl(textFieldValue.getSelection()));
    }

    public static final androidx.compose.ui.text.AnnotatedString getTextAfterSelection(androidx.compose.ui.text.input.TextFieldValue textFieldValue, int i) {
        androidx.compose.ui.text.AnnotatedString annotatedString = textFieldValue.getAnnotatedString();
        int m8036getMaximpl = androidx.compose.ui.text.TextRange.m8036getMaximpl(textFieldValue.getSelection());
        int m8036getMaximpl2 = androidx.compose.ui.text.TextRange.m8036getMaximpl(textFieldValue.getSelection());
        int i2 = m8036getMaximpl2 + i;
        if (((i ^ i2) & (m8036getMaximpl2 ^ i2)) < 0) {
            i2 = textFieldValue.getText().length();
        }
        return annotatedString.subSequence(m8036getMaximpl, java.lang.Math.min(i2, textFieldValue.getText().length()));
    }

    public static final androidx.compose.ui.text.AnnotatedString getSelectedText(androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
        return textFieldValue.getAnnotatedString().m7849subSequence5zctL8(textFieldValue.getSelection());
    }
}
