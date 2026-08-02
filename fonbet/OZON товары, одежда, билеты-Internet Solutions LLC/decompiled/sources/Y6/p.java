package Y6;

import java.util.concurrent.Executor;

/* loaded from: classes9.dex */
public final class p implements U6.b<o> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Executor> f34698a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<Z6.d> f34699b;

    /* renamed from: c, reason: collision with root package name */
    private final X6.g f34700c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<a7.b> f34701d;

    public p(Pc.a aVar, Pc.a aVar2, X6.g gVar, Pc.a aVar3) {
        this.f34698a = aVar;
        this.f34699b = aVar2;
        this.f34700c = gVar;
        this.f34701d = aVar3;
    }

    @Override // Pc.a
    public final Object get() {
        return new o(this.f34698a.get(), this.f34699b.get(), (q) this.f34700c.get(), this.f34701d.get());
    }
}
