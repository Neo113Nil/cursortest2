package androidx.compose.foundation.layout;

import B1.InterfaceC2552v;
import org.jetbrains.annotations.NotNull;
import u0.EnumC9909s;

/* loaded from: classes8.dex */
final class O extends N {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private EnumC9909s f39362a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f39363b;

    public O(@NotNull EnumC9909s enumC9909s, boolean z11) {
        this.f39362a = enumC9909s;
        this.f39363b = z11;
    }

    @Override // androidx.compose.foundation.layout.N, D1.E
    public final int A(@NotNull D1.V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        return this.f39362a == EnumC9909s.Min ? interfaceC2552v.T(i11) : interfaceC2552v.Y(i11);
    }

    @Override // androidx.compose.foundation.layout.N
    public final long I1(@NotNull B1.U u11, long j11) {
        int T11 = this.f39362a == EnumC9909s.Min ? u11.T(Z1.b.j(j11)) : u11.Y(Z1.b.j(j11));
        if (T11 < 0) {
            T11 = 0;
        }
        if (T11 >= 0) {
            return Z1.c.i(T11, T11, 0, Integer.MAX_VALUE);
        }
        Z1.l.a("width(" + T11 + ") must be >= 0");
        throw null;
    }

    @Override // androidx.compose.foundation.layout.N
    public final boolean J1() {
        return this.f39363b;
    }

    public final void K1(boolean z11) {
        this.f39363b = z11;
    }

    public final void L1(@NotNull EnumC9909s enumC9909s) {
        this.f39362a = enumC9909s;
    }

    @Override // androidx.compose.foundation.layout.N, D1.E
    public final int u(@NotNull D1.V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        return this.f39362a == EnumC9909s.Min ? interfaceC2552v.T(i11) : interfaceC2552v.Y(i11);
    }
}
