package P1;

import android.graphics.Typeface;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class P implements M {
    private static Typeface c(String str, F f7, int i11) {
        F f11;
        if (i11 == 0) {
            f11 = F.f21509g;
            if (Intrinsics.d(f7, f11) && (str == null || str.length() == 0)) {
                return Typeface.DEFAULT;
            }
        }
        int c11 = C3799f.c(f7, i11);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(c11) : Typeface.create(str, c11);
    }

    @Override // P1.M
    @NotNull
    public final Typeface a(@NotNull I i11, @NotNull F f7, int i12) {
        String e11 = i11.e();
        int l11 = f7.l() / 100;
        if (l11 >= 0 && l11 < 2) {
            e11 = U7.d.e(e11, "-thin");
        } else if (2 <= l11 && l11 < 4) {
            e11 = U7.d.e(e11, "-light");
        } else if (l11 != 4) {
            if (l11 == 5) {
                e11 = U7.d.e(e11, "-medium");
            } else if ((6 > l11 || l11 >= 8) && 8 <= l11 && l11 < 11) {
                e11 = U7.d.e(e11, "-black");
            }
        }
        Typeface typeface = null;
        if (e11.length() != 0) {
            Typeface c11 = c(e11, f7, i12);
            if (!Intrinsics.d(c11, Typeface.create(Typeface.DEFAULT, C3799f.c(f7, i12))) && !Intrinsics.d(c11, c(null, f7, i12))) {
                typeface = c11;
            }
        }
        return typeface == null ? c(i11.e(), f7, i12) : typeface;
    }

    @Override // P1.M
    @NotNull
    public final Typeface b(@NotNull F f7, int i11) {
        return c(null, f7, i11);
    }
}
