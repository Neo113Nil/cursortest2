package K1;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final O1.b<C3426f, K> f14984a;

    public I(int i11) {
        this.f14984a = new O1.b<>(i11);
    }

    public final K a(@NotNull J j11) {
        K a11 = this.f14984a.a(new C3426f(j11));
        if (a11 == null || a11.v().i().a()) {
            return null;
        }
        return a11;
    }

    public final void b(@NotNull J j11, @NotNull K k11) {
        this.f14984a.b(new C3426f(j11), k11);
    }
}
