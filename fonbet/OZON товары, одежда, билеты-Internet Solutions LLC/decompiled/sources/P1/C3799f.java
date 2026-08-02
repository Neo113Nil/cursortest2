package P1;

import org.jetbrains.annotations.NotNull;

/* renamed from: P1.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3799f {
    @NotNull
    public static final F a() {
        F f7;
        int i11 = F.f21515m;
        f7 = F.f21506d;
        return f7;
    }

    public static final int b(boolean z11, boolean z12) {
        if (z12 && z11) {
            return 3;
        }
        if (z11) {
            return 1;
        }
        return z12 ? 2 : 0;
    }

    public static final int c(@NotNull F f7, int i11) {
        F f11;
        int i12 = F.f21515m;
        f11 = F.f21506d;
        return b(f7.compareTo(f11) >= 0, i11 == 1);
    }
}
