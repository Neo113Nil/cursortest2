package p1;

import android.view.inputmethod.EditorInfo;
import androidx.core.widget.NestedScrollView;

/* renamed from: p1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2242a {
    public static void a(NestedScrollView nestedScrollView, float f) {
        try {
            nestedScrollView.setFrameContentVelocity(f);
        } catch (LinkageError unused) {
        }
    }

    public static void b(EditorInfo editorInfo, boolean z3) {
        editorInfo.setStylusHandwritingEnabled(z3);
    }
}
