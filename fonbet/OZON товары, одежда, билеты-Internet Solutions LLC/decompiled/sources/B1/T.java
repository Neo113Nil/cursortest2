package B1;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class T {
    @NotNull
    public static final D1.Y a(@NotNull D1.Y y11) {
        D1.H B02 = y11.B0();
        while (true) {
            D1.H g02 = B02.g0();
            D1.H h11 = null;
            if ((g02 != null ? g02.U() : null) == null) {
                D1.Y c22 = B02.e0().c2();
                Intrinsics.f(c22);
                return c22;
            }
            D1.H g03 = B02.g0();
            if (g03 != null) {
                h11 = g03.U();
            }
            Intrinsics.f(h11);
            D1.H g04 = B02.g0();
            Intrinsics.f(g04);
            B02 = g04.U();
            Intrinsics.f(B02);
        }
    }
}
