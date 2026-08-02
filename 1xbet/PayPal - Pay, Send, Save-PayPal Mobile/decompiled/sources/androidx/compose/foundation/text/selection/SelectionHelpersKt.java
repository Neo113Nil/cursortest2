package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/text/TextLayoutResult;", "", "offset", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getTextDirectionForOffset", "(Landroidx/compose/ui/text/TextLayoutResult;I)Landroidx/compose/ui/text/style/ResolvedTextDirection;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SelectionHelpersKt {
    public static final androidx.compose.ui.text.style.ResolvedTextDirection getTextDirectionForOffset(androidx.compose.ui.text.TextLayoutResult textLayoutResult, int i) {
        if (textLayoutResult.getLayoutInput().getText().length() != 0) {
            int lineForOffset = textLayoutResult.getLineForOffset(i);
            if ((i != 0 && lineForOffset == textLayoutResult.getLineForOffset(i - 1)) || (i != textLayoutResult.getLayoutInput().getText().length() && lineForOffset == textLayoutResult.getLineForOffset(i + 1))) {
                return textLayoutResult.getBidiRunDirection(i);
            }
        }
        return textLayoutResult.getParagraphDirection(i);
    }
}
