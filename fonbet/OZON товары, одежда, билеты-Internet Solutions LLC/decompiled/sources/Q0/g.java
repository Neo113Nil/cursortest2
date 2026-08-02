package Q0;

import S0.C3991w0;
import S0.D1;
import S0.n1;
import org.jetbrains.annotations.NotNull;
import u0.J;
import u0.N;

/* loaded from: classes8.dex */
public final class g implements J {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3991w0 f22759b;

    public g() {
        this(N.a());
    }

    @Override // u0.J
    public final int a(@NotNull Z1.d dVar, @NotNull Z1.s sVar) {
        return ((J) this.f22759b.getValue()).a(dVar, sVar);
    }

    @Override // u0.J
    public final int b(@NotNull Z1.d dVar) {
        return ((J) this.f22759b.getValue()).b(dVar);
    }

    @Override // u0.J
    public final int c(@NotNull Z1.d dVar) {
        return ((J) this.f22759b.getValue()).c(dVar);
    }

    @Override // u0.J
    public final int d(@NotNull Z1.d dVar, @NotNull Z1.s sVar) {
        return ((J) this.f22759b.getValue()).d(dVar, sVar);
    }

    public final void e(@NotNull J j11) {
        this.f22759b.setValue(j11);
    }

    public g(@NotNull J j11) {
        C3991w0 f7;
        f7 = n1.f(j11, D1.f25195a);
        this.f22759b = f7;
    }
}
