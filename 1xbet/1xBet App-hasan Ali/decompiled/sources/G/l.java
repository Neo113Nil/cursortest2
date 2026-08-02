package G;

import K0.L;
import android.view.inputmethod.CursorAnchorInfo;
import h0.C1989c;

/* loaded from: classes.dex */
public abstract class l {
    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, L l5, C1989c c1989c) {
        int c5;
        K0.r rVar;
        int c6;
        if (!c1989c.d() && (c5 = l5.f2793b.c(c1989c.f17194b)) <= (c6 = (rVar = l5.f2793b).c(c1989c.f17196d))) {
            while (true) {
                builder.addVisibleLineBounds(l5.f(c5), rVar.d(c5), l5.g(c5), rVar.b(c5));
                if (c5 == c6) {
                    break;
                }
                c5++;
            }
        }
        return builder;
    }
}
