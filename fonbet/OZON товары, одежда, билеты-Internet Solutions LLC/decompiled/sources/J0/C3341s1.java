package J0;

import S0.C3991w0;
import org.jetbrains.annotations.NotNull;

/* renamed from: J0.s1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3341s1 implements u0.J {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3991w0 f13392b;

    public C3341s1(@NotNull u0.J j11) {
        C3991w0 f7;
        f7 = S0.n1.f(j11, S0.D1.f25195a);
        this.f13392b = f7;
    }

    @Override // u0.J
    public final int a(@NotNull Z1.d dVar, @NotNull Z1.s sVar) {
        return ((u0.J) this.f13392b.getValue()).a(dVar, sVar);
    }

    @Override // u0.J
    public final int b(@NotNull Z1.d dVar) {
        return ((u0.J) this.f13392b.getValue()).b(dVar);
    }

    @Override // u0.J
    public final int c(@NotNull Z1.d dVar) {
        return ((u0.J) this.f13392b.getValue()).c(dVar);
    }

    @Override // u0.J
    public final int d(@NotNull Z1.d dVar, @NotNull Z1.s sVar) {
        return ((u0.J) this.f13392b.getValue()).d(dVar, sVar);
    }

    public final void e(@NotNull u0.J j11) {
        this.f13392b.setValue(j11);
    }

    public C3341s1() {
        this(u0.N.a());
    }
}
