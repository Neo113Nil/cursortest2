package S0;

import org.jetbrains.annotations.NotNull;

/* renamed from: S0.r0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3981r0<N> implements InterfaceC3951e<N> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC3951e<N> f25516a;

    /* renamed from: b, reason: collision with root package name */
    private final int f25517b;

    /* renamed from: c, reason: collision with root package name */
    private int f25518c;

    public C3981r0(@NotNull InterfaceC3951e<N> interfaceC3951e, int i11) {
        this.f25516a = interfaceC3951e;
        this.f25517b = i11;
    }

    @Override // S0.InterfaceC3951e
    public final void a(int i11, int i12) {
        this.f25516a.a(i11 + (this.f25518c == 0 ? this.f25517b : 0), i12);
    }

    @Override // S0.InterfaceC3951e
    public final void b(int i11, int i12, int i13) {
        int i14 = this.f25518c == 0 ? this.f25517b : 0;
        this.f25516a.b(i11 + i14, i12 + i14, i13);
    }

    @Override // S0.InterfaceC3951e
    public final void c(int i11, N n11) {
        this.f25516a.c(i11 + (this.f25518c == 0 ? this.f25517b : 0), n11);
    }

    @Override // S0.InterfaceC3951e
    public final N d() {
        return this.f25516a.d();
    }

    @Override // S0.InterfaceC3951e
    public final void e(int i11, N n11) {
        this.f25516a.e(i11 + (this.f25518c == 0 ? this.f25517b : 0), n11);
    }

    @Override // S0.InterfaceC3951e
    public final void f(N n11) {
        this.f25518c++;
        this.f25516a.f(n11);
    }

    @Override // S0.InterfaceC3951e
    public final void g() {
        int i11 = this.f25518c;
        if (!(i11 > 0)) {
            r.j("OffsetApplier up called with no corresponding down");
            throw null;
        }
        this.f25518c = i11 - 1;
        this.f25516a.g();
    }
}
