package I;

/* renamed from: I.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0158k implements a1.z {

    /* renamed from: a, reason: collision with root package name */
    public final b0.d f2494a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0159l f2495b;

    /* renamed from: c, reason: collision with root package name */
    public long f2496c = 0;

    public C0158k(b0.d dVar, InterfaceC0159l interfaceC0159l) {
        this.f2494a = dVar;
        this.f2495b = interfaceC0159l;
    }

    @Override // a1.z
    public final long a(W0.k kVar, long j5, W0.m mVar, long j6) {
        long a5 = this.f2495b.a();
        if (!G4.d.C(a5)) {
            a5 = this.f2496c;
        }
        this.f2496c = a5;
        return W0.j.c(W0.j.c((kVar.f6011a << 32) | (kVar.f6012b & 4294967295L), G4.l.K(a5)), this.f2494a.a(j6, 0L, mVar));
    }
}
