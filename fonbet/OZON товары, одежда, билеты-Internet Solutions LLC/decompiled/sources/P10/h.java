package P10;

import N3.C3660k;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.K;

/* loaded from: classes3.dex */
public final class h {
    public static final RuntimeException a(Exception exc, int i11, int i12, String str, List list) {
        String V11 = C7714v.V(list, null, null, null, new g(new K()), 31);
        StringBuilder c11 = C3660k.c(i11, "\n        message = ", exc.getMessage(), ",\n        stickyPosition = ", ",\n        composerPosition = ");
        Pk0.i.c(i12, ",\n        stickyItem = ", str, ",\n        composerList = ", c11);
        c11.append(V11);
        c11.append("\n    ");
        return new RuntimeException(kotlin.text.h.E0(c11.toString()), exc);
    }
}
