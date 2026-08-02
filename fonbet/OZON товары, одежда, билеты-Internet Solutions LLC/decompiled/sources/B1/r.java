package B1;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class r implements U {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC2552v f2148a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final EnumC2554x f2149b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final EnumC2555y f2150c;

    public r(@NotNull InterfaceC2552v interfaceC2552v, @NotNull EnumC2554x enumC2554x, @NotNull EnumC2555y enumC2555y) {
        this.f2148a = interfaceC2552v;
        this.f2149b = enumC2554x;
        this.f2150c = enumC2555y;
    }

    @Override // B1.InterfaceC2552v
    public final int D(int i11) {
        return this.f2148a.D(i11);
    }

    @Override // B1.InterfaceC2552v
    public final int O(int i11) {
        return this.f2148a.O(i11);
    }

    @Override // B1.InterfaceC2552v
    public final int T(int i11) {
        return this.f2148a.T(i11);
    }

    @Override // B1.InterfaceC2552v
    public final int Y(int i11) {
        return this.f2148a.Y(i11);
    }

    @Override // B1.U
    @NotNull
    public final m0 a0(long j11) {
        EnumC2555y enumC2555y = EnumC2555y.Width;
        EnumC2555y enumC2555y2 = this.f2150c;
        EnumC2554x enumC2554x = this.f2149b;
        InterfaceC2552v interfaceC2552v = this.f2148a;
        if (enumC2555y2 == enumC2555y) {
            return new C2550t(enumC2554x == EnumC2554x.Max ? interfaceC2552v.Y(Z1.b.j(j11)) : interfaceC2552v.T(Z1.b.j(j11)), Z1.b.f(j11) ? Z1.b.j(j11) : 32767);
        }
        return new C2550t(Z1.b.g(j11) ? Z1.b.k(j11) : 32767, enumC2554x == EnumC2554x.Max ? interfaceC2552v.D(Z1.b.k(j11)) : interfaceC2552v.O(Z1.b.k(j11)));
    }

    @Override // B1.InterfaceC2552v
    public final Object m() {
        return this.f2148a.m();
    }
}
