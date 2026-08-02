package androidx.compose.foundation.text.input;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0003*\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b*\u0018\b\u0000\u0010\u000b\"\b\u0012\u0004\u0012\u00020\n0\t2\b\u0012\u0004\u0012\u00020\n0\t"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "", "maxChars", "", "getTextBeforeSelection", "(Landroidx/compose/foundation/text/input/TextFieldCharSequence;I)Ljava/lang/CharSequence;", "getTextAfterSelection", "getSelectedText", "(Landroidx/compose/foundation/text/input/TextFieldCharSequence;)Ljava/lang/CharSequence;", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "PlacedAnnotation"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextFieldCharSequenceKt {
    public static final java.lang.CharSequence getTextBeforeSelection(androidx.compose.foundation.text.input.TextFieldCharSequence textFieldCharSequence, int i) {
        int m8037getMinimpl = androidx.compose.ui.text.TextRange.m8037getMinimpl(textFieldCharSequence.getSelection());
        int i2 = m8037getMinimpl - i;
        if (((i ^ m8037getMinimpl) & (m8037getMinimpl ^ i2)) < 0) {
            i2 = 0;
        }
        return textFieldCharSequence.subSequence(java.lang.Math.max(0, i2), androidx.compose.ui.text.TextRange.m8037getMinimpl(textFieldCharSequence.getSelection()));
    }

    public static final java.lang.CharSequence getTextAfterSelection(androidx.compose.foundation.text.input.TextFieldCharSequence textFieldCharSequence, int i) {
        int m8036getMaximpl = androidx.compose.ui.text.TextRange.m8036getMaximpl(textFieldCharSequence.getSelection());
        int m8036getMaximpl2 = androidx.compose.ui.text.TextRange.m8036getMaximpl(textFieldCharSequence.getSelection());
        int i2 = m8036getMaximpl2 + i;
        if (((i ^ i2) & (m8036getMaximpl2 ^ i2)) < 0) {
            i2 = textFieldCharSequence.length();
        }
        return textFieldCharSequence.subSequence(m8036getMaximpl, java.lang.Math.min(i2, textFieldCharSequence.length()));
    }

    public static final java.lang.CharSequence getSelectedText(androidx.compose.foundation.text.input.TextFieldCharSequence textFieldCharSequence) {
        return textFieldCharSequence.subSequence(androidx.compose.ui.text.TextRange.m8037getMinimpl(textFieldCharSequence.getSelection()), androidx.compose.ui.text.TextRange.m8036getMaximpl(textFieldCharSequence.getSelection()));
    }
}
