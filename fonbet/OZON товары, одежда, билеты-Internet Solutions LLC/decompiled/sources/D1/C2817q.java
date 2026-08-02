package D1;

import org.jetbrains.annotations.NotNull;

/* renamed from: D1.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2817q {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2816p f5547a = new C2816p();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2816p f5548b = new C2816p();

    public final void c(@NotNull H h11, boolean z11) {
        C2816p c2816p = this.f5548b;
        C2816p c2816p2 = this.f5547a;
        if (z11) {
            c2816p2.a(h11);
            c2816p.a(h11);
        } else {
            if (c2816p2.b(h11)) {
                return;
            }
            c2816p.a(h11);
        }
    }

    public final boolean d(@NotNull H h11, boolean z11) {
        boolean b11 = this.f5547a.b(h11);
        return z11 ? b11 : b11 || this.f5548b.b(h11);
    }

    public final boolean e(boolean z11) {
        return (z11 ? this.f5547a : this.f5548b).c();
    }

    public final boolean f() {
        return !(this.f5548b.c() && this.f5547a.c());
    }

    public final void g(@NotNull H h11) {
        this.f5547a.e(h11);
        this.f5548b.e(h11);
    }
}
