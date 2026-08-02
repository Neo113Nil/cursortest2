package Z00;

import L00.g;
import L00.j;
import We.L;
import We.M;
import X00.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a {
    @NotNull
    public static final j a(@NotNull L l11, @NotNull g request) {
        Intrinsics.checkNotNullParameter(l11, "<this>");
        Intrinsics.checkNotNullParameter(request, "request");
        if (l11.v()) {
            int m11 = l11.m();
            String w11 = l11.w();
            M c11 = l11.c();
            return j.b.b(request, m11, w11, c11 != null ? c11.string() : null, new e(l11.r()), l11, l11.j(), l11.x());
        }
        String str = null;
        int m12 = l11.m();
        String w12 = l11.w();
        M c12 = l11.c();
        if (c12 != null) {
            str = c12.string();
        }
        return j.b.a(request, m12, w12, str, new e(l11.r()), l11);
    }
}
