package androidx.compose.ui.text.input;

/* compiled from: CursorAnchorInfoBuilder.android.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/input/CursorAnchorInfoApi34Helper;", "", "()V", "addVisibleLineBounds", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "builder", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "innerTextFieldBounds", "Landroidx/compose/ui/geometry/Rect;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class CursorAnchorInfoApi34Helper {
    public static final androidx.compose.ui.text.input.CursorAnchorInfoApi34Helper INSTANCE = new androidx.compose.ui.text.input.CursorAnchorInfoApi34Helper();

    private CursorAnchorInfoApi34Helper() {
    }

    @kotlin.jvm.JvmStatic
    public static final android.view.inputmethod.CursorAnchorInfo.Builder addVisibleLineBounds(android.view.inputmethod.CursorAnchorInfo.Builder builder, androidx.compose.ui.text.TextLayoutResult textLayoutResult, androidx.compose.ui.geometry.Rect innerTextFieldBounds) {
        int lineForVerticalPosition;
        int lineForVerticalPosition2;
        if (!innerTextFieldBounds.isEmpty() && (lineForVerticalPosition = textLayoutResult.getLineForVerticalPosition(innerTextFieldBounds.getTop())) <= (lineForVerticalPosition2 = textLayoutResult.getLineForVerticalPosition(innerTextFieldBounds.getBottom()))) {
            while (true) {
                builder.addVisibleLineBounds(textLayoutResult.getLineLeft(lineForVerticalPosition), textLayoutResult.getLineTop(lineForVerticalPosition), textLayoutResult.getLineRight(lineForVerticalPosition), textLayoutResult.getLineBottom(lineForVerticalPosition));
                if (lineForVerticalPosition == lineForVerticalPosition2) {
                    break;
                }
                lineForVerticalPosition++;
            }
        }
        return builder;
    }
}
