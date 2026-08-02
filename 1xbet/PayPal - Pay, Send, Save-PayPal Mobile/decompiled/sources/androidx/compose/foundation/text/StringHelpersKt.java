package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "", "startIndex", "findParagraphStart", "(Ljava/lang/CharSequence;I)I", "findParagraphEnd", "index", "Landroidx/compose/ui/text/TextRange;", "getParagraphBoundary", "(Ljava/lang/CharSequence;I)J"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StringHelpersKt {
    public static final int findParagraphStart(java.lang.CharSequence charSequence, int i) {
        while (i > 0) {
            if (charSequence.charAt(i - 1) == '\n') {
                return i;
            }
            i--;
        }
        return 0;
    }

    public static final int findParagraphEnd(java.lang.CharSequence charSequence, int i) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == '\n') {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    public static final long getParagraphBoundary(java.lang.CharSequence charSequence, int i) {
        return androidx.compose.ui.text.TextRangeKt.TextRange(findParagraphStart(charSequence, i), findParagraphEnd(charSequence, i));
    }
}
