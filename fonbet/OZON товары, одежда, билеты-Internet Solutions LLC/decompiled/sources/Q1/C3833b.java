package Q1;

import Dc0.C2854c;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import k1.C7460f;
import l1.x0;
import org.jetbrains.annotations.NotNull;

/* renamed from: Q1.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3833b {
    @NotNull
    public static final CursorAnchorInfo.Builder a(@NotNull CursorAnchorInfo.Builder builder, @NotNull C7460f c7460f) {
        EditorBoundsInfo.Builder editorBounds;
        EditorBoundsInfo.Builder handwritingBounds;
        EditorBoundsInfo build;
        CursorAnchorInfo.Builder editorBoundsInfo;
        editorBounds = C2854c.b().setEditorBounds(x0.c(c7460f));
        handwritingBounds = editorBounds.setHandwritingBounds(x0.c(c7460f));
        build = handwritingBounds.build();
        editorBoundsInfo = builder.setEditorBoundsInfo(build);
        return editorBoundsInfo;
    }
}
