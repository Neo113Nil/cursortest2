package androidx.compose.ui.text.input;

/* compiled from: TextFieldValue.kt */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0012\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0007"}, d2 = {"getSelectedText", "Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/input/TextFieldValue;", "getTextAfterSelection", "maxChars", "", "getTextBeforeSelection", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldValueKt {
    public static final androidx.compose.ui.text.AnnotatedString getTextBeforeSelection(androidx.compose.ui.text.input.TextFieldValue textFieldValue, int i) {
        return textFieldValue.getAnnotatedString().subSequence(java.lang.Math.max(0, androidx.compose.ui.text.TextRange.m3962getMinimpl(textFieldValue.getSelection()) - i), androidx.compose.ui.text.TextRange.m3962getMinimpl(textFieldValue.getSelection()));
    }

    public static final androidx.compose.ui.text.AnnotatedString getTextAfterSelection(androidx.compose.ui.text.input.TextFieldValue textFieldValue, int i) {
        return textFieldValue.getAnnotatedString().subSequence(androidx.compose.ui.text.TextRange.m3961getMaximpl(textFieldValue.getSelection()), java.lang.Math.min(androidx.compose.ui.text.TextRange.m3961getMaximpl(textFieldValue.getSelection()) + i, textFieldValue.getText().length()));
    }

    public static final androidx.compose.ui.text.AnnotatedString getSelectedText(androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
        return textFieldValue.getAnnotatedString().m3827subSequence5zctL8(textFieldValue.getSelection());
    }
}
