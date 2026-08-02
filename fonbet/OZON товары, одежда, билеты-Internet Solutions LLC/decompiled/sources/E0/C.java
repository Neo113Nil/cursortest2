package E0;

import android.view.inputmethod.CursorAnchorInfo;
import k1.C7460f;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class C {
    @NotNull
    public static final CursorAnchorInfo.Builder a(@NotNull CursorAnchorInfo.Builder builder, @NotNull K1.K k11, @NotNull C7460f c7460f) {
        int q11;
        int q12;
        if (!c7460f.x() && (q11 = k11.q(c7460f.q())) <= (q12 = k11.q(c7460f.h()))) {
            while (true) {
                builder.addVisibleLineBounds(k11.r(q11), k11.u(q11), k11.s(q11), k11.l(q11));
                if (q11 == q12) {
                    break;
                }
                q11++;
            }
        }
        return builder;
    }
}
