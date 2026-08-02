package androidx.compose.foundation.layout;

import B1.InterfaceC2552v;
import org.jetbrains.annotations.NotNull;
import u0.EnumC9909s;

/* loaded from: classes.dex */
final class L extends N {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private EnumC9909s f39357a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f39358b;

    public L(@NotNull EnumC9909s enumC9909s, boolean z11) {
        this.f39357a = enumC9909s;
        this.f39358b = z11;
    }

    @Override // androidx.compose.foundation.layout.N, D1.E
    public final int I(@NotNull D1.V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        return this.f39357a == EnumC9909s.Min ? interfaceC2552v.O(i11) : interfaceC2552v.D(i11);
    }

    @Override // androidx.compose.foundation.layout.N
    public final long I1(@NotNull B1.U u11, long j11) {
        int O11 = this.f39357a == EnumC9909s.Min ? u11.O(Z1.b.k(j11)) : u11.D(Z1.b.k(j11));
        if (O11 < 0) {
            O11 = 0;
        }
        if (O11 >= 0) {
            return Z1.c.i(0, Integer.MAX_VALUE, O11, O11);
        }
        Z1.l.a("height(" + O11 + ") must be >= 0");
        throw null;
    }

    @Override // androidx.compose.foundation.layout.N
    public final boolean J1() {
        return this.f39358b;
    }

    @Override // androidx.compose.foundation.layout.N, D1.E
    public final int K(@NotNull D1.V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        return this.f39357a == EnumC9909s.Min ? interfaceC2552v.O(i11) : interfaceC2552v.D(i11);
    }

    public final void K1(boolean z11) {
        this.f39358b = z11;
    }

    public final void L1(@NotNull EnumC9909s enumC9909s) {
        this.f39357a = enumC9909s;
    }
}
