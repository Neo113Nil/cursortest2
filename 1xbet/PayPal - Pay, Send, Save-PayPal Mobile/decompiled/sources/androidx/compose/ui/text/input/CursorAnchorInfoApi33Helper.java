package androidx.compose.ui.text.input;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/ui/text/input/CursorAnchorInfoApi33Helper;", "", "<init>", "()V", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "p0", "Landroidx/compose/ui/geometry/Rect;", "p1", "Camera2StreamConfigurationMap", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Landroidx/compose/ui/geometry/Rect;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class CursorAnchorInfoApi33Helper {
    public static final androidx.compose.ui.text.input.CursorAnchorInfoApi33Helper INSTANCE = new androidx.compose.ui.text.input.CursorAnchorInfoApi33Helper();

    private CursorAnchorInfoApi33Helper() {
    }

    @kotlin.jvm.JvmStatic
    public static final android.view.inputmethod.CursorAnchorInfo.Builder Camera2StreamConfigurationMap(android.view.inputmethod.CursorAnchorInfo.Builder p0, androidx.compose.ui.geometry.Rect p1) {
        return p0.setEditorBoundsInfo(new android.view.inputmethod.EditorBoundsInfo.Builder().setEditorBounds(androidx.compose.ui.graphics.RectHelper_androidKt.toAndroidRectF(p1)).setHandwritingBounds(androidx.compose.ui.graphics.RectHelper_androidKt.toAndroidRectF(p1)).build());
    }
}
