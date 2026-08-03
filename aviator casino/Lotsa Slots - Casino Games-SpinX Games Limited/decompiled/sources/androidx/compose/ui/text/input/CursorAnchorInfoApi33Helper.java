package androidx.compose.ui.text.input;

/* compiled from: CursorAnchorInfoBuilder.android.kt */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/input/CursorAnchorInfoApi33Helper;", "", "()V", "setEditorBoundsInfo", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "builder", "decorationBoxBounds", "Landroidx/compose/ui/geometry/Rect;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class CursorAnchorInfoApi33Helper {
    public static final androidx.compose.ui.text.input.CursorAnchorInfoApi33Helper INSTANCE = new androidx.compose.ui.text.input.CursorAnchorInfoApi33Helper();

    private CursorAnchorInfoApi33Helper() {
    }

    @kotlin.jvm.JvmStatic
    public static final android.view.inputmethod.CursorAnchorInfo.Builder setEditorBoundsInfo(android.view.inputmethod.CursorAnchorInfo.Builder builder, androidx.compose.ui.geometry.Rect decorationBoxBounds) {
        return builder.setEditorBoundsInfo(new android.view.inputmethod.EditorBoundsInfo.Builder().setEditorBounds(androidx.compose.ui.graphics.RectHelper_androidKt.toAndroidRectF(decorationBoxBounds)).setHandwritingBounds(androidx.compose.ui.graphics.RectHelper_androidKt.toAndroidRectF(decorationBoxBounds)).build());
    }
}
