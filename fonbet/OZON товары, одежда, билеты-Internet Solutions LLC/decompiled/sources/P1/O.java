package P1;

import android.graphics.Typeface;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class O implements M {
    private static Typeface c(String str, F f7, int i11) {
        Typeface create;
        F f11;
        if (i11 == 0) {
            f11 = F.f21509g;
            if (Intrinsics.d(f7, f11) && (str == null || str.length() == 0)) {
                return Typeface.DEFAULT;
            }
        }
        create = Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), f7.l(), i11 == 1);
        return create;
    }

    @Override // P1.M
    @NotNull
    public final Typeface a(@NotNull I i11, @NotNull F f7, int i12) {
        return c(i11.e(), f7, i12);
    }

    @Override // P1.M
    @NotNull
    public final Typeface b(@NotNull F f7, int i11) {
        return c(null, f7, i11);
    }
}
