package D1;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Z1.d f5281a = Z1.f.b();

    @NotNull
    public static final x0 b(@NotNull H h11) {
        x0 f02 = h11.f0();
        if (f02 != null) {
            return f02;
        }
        A1.a.c("LayoutNode should be attached to an owner");
        throw null;
    }
}
