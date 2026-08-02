package G;

import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import h0.C1989c;

/* loaded from: classes.dex */
public abstract class k {
    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, C1989c c1989c) {
        EditorBoundsInfo.Builder editorBounds;
        EditorBoundsInfo.Builder handwritingBounds;
        EditorBoundsInfo build;
        CursorAnchorInfo.Builder editorBoundsInfo;
        editorBounds = i.h().setEditorBounds(i0.F.t(c1989c));
        handwritingBounds = editorBounds.setHandwritingBounds(i0.F.t(c1989c));
        build = handwritingBounds.build();
        editorBoundsInfo = builder.setEditorBoundsInfo(build);
        return editorBoundsInfo;
    }
}
