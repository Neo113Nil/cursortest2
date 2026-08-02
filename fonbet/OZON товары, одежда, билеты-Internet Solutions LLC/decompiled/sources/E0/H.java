package E0;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class H {
    public static final void a(@NotNull I i11, @NotNull String str, int i12) {
        if (i11.p()) {
            i11.q(i11.i(), i11.h(), str);
        } else {
            i11.q(i11.o(), i11.n(), str);
        }
        int e11 = kotlin.ranges.h.e(i12 > 0 ? (r0 + i12) - 1 : (i11.j() + i12) - str.length(), 0, i11.l());
        i11.t(e11, e11);
    }
}
