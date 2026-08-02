package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/foundation/text/input/internal/CursorAnchorInfoApi34Helper;", "", "<init>", "()V", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "builder", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "Landroidx/compose/ui/geometry/Rect;", "innerTextFieldBounds", "addVisibleLineBounds", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/geometry/Rect;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CursorAnchorInfoApi34Helper {
    public static final int $stable = 0;
    public static final androidx.compose.foundation.text.input.internal.CursorAnchorInfoApi34Helper INSTANCE = new androidx.compose.foundation.text.input.internal.CursorAnchorInfoApi34Helper();

    private CursorAnchorInfoApi34Helper() {
    }

    @kotlin.jvm.JvmStatic
    public static final android.view.inputmethod.CursorAnchorInfo.Builder addVisibleLineBounds(android.view.inputmethod.CursorAnchorInfo.Builder builder, androidx.compose.ui.text.TextLayoutResult textLayoutResult, androidx.compose.ui.geometry.Rect innerTextFieldBounds) {
        int coerceAtLeast;
        int coerceIn;
        int coerceIn2;
        if (!innerTextFieldBounds.isEmpty() && (coerceIn = kotlin.ranges.RangesKt.coerceIn(textLayoutResult.getLineForVerticalPosition(innerTextFieldBounds.getTop()), 0, (coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(textLayoutResult.getLineCount() - 1, 0)))) <= (coerceIn2 = kotlin.ranges.RangesKt.coerceIn(textLayoutResult.getLineForVerticalPosition(innerTextFieldBounds.getBottom()), 0, coerceAtLeast))) {
            while (true) {
                builder.addVisibleLineBounds(textLayoutResult.getLineLeft(coerceIn), textLayoutResult.getLineTop(coerceIn), textLayoutResult.getLineRight(coerceIn), textLayoutResult.getLineBottom(coerceIn));
                if (coerceIn == coerceIn2) {
                    break;
                }
                coerceIn++;
            }
        }
        return builder;
    }
}
