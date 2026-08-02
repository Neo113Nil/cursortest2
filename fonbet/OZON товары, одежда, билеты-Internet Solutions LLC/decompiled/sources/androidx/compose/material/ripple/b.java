package androidx.compose.material.ripple;

import O0.n;
import S0.InterfaceC3978p0;
import Sc.InterfaceC3999a;
import n0.InterfaceC8368I;
import n1.InterfaceC8410c;
import org.jetbrains.annotations.NotNull;
import t0.s;
import xe.M;

@InterfaceC3999a
/* loaded from: classes8.dex */
public abstract class b implements InterfaceC8368I {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f40108a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final c f40109b;

    public b(@NotNull InterfaceC3978p0 interfaceC3978p0, boolean z11) {
        this.f40108a = z11;
        this.f40109b = new c(z11, new a(interfaceC3978p0));
    }

    public abstract void c(@NotNull s.b bVar);

    public final void f(@NotNull InterfaceC8410c interfaceC8410c, float f7, long j11) {
        this.f40109b.b(interfaceC8410c, Float.isNaN(f7) ? n.a(interfaceC8410c, this.f40108a, interfaceC8410c.i()) : interfaceC8410c.v1(f7), j11);
    }

    public abstract void g(@NotNull s.b bVar);

    public final void h(@NotNull t0.n nVar, @NotNull M m11) {
        this.f40109b.c(nVar, m11);
    }
}
