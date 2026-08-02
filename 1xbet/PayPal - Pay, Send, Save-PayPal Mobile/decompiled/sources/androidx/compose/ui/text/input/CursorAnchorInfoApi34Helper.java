package androidx.compose.ui.text.input;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/ui/text/input/CursorAnchorInfoApi34Helper;", "", "<init>", "()V", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "p0", "Landroidx/compose/ui/text/TextLayoutResult;", "p1", "Landroidx/compose/ui/geometry/Rect;", "p2", "getHighResolutionOutputSizeshNQ4ISI", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/geometry/Rect;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class CursorAnchorInfoApi34Helper {
    public static final androidx.compose.ui.text.input.CursorAnchorInfoApi34Helper INSTANCE = new androidx.compose.ui.text.input.CursorAnchorInfoApi34Helper();

    private CursorAnchorInfoApi34Helper() {
    }

    @kotlin.jvm.JvmStatic
    public static final android.view.inputmethod.CursorAnchorInfo.Builder getHighResolutionOutputSizeshNQ4ISI(android.view.inputmethod.CursorAnchorInfo.Builder p0, androidx.compose.ui.text.TextLayoutResult p1, androidx.compose.ui.geometry.Rect p2) {
        int coerceAtLeast;
        int coerceIn;
        int coerceIn2;
        if (!p2.isEmpty() && (coerceIn = kotlin.ranges.RangesKt.coerceIn(p1.getLineForVerticalPosition(p2.getTop()), 0, (coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(p1.getLineCount() - 1, 0)))) <= (coerceIn2 = kotlin.ranges.RangesKt.coerceIn(p1.getLineForVerticalPosition(p2.getBottom()), 0, coerceAtLeast))) {
            while (true) {
                p0.addVisibleLineBounds(p1.getLineLeft(coerceIn), p1.getLineTop(coerceIn), p1.getLineRight(coerceIn), p1.getLineBottom(coerceIn));
                if (coerceIn == coerceIn2) {
                    break;
                }
                coerceIn++;
            }
        }
        return p0;
    }
}
