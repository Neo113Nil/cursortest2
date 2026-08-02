package X6;

import Y6.q;
import java.util.concurrent.Executor;

/* loaded from: classes9.dex */
public final class d implements U6.b<c> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Executor> f34134a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<T6.e> f34135b;

    /* renamed from: c, reason: collision with root package name */
    private final g f34136c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<Z6.d> f34137d;

    /* renamed from: e, reason: collision with root package name */
    private final Pc.a<a7.b> f34138e;

    public d(Pc.a aVar, Pc.a aVar2, g gVar, Pc.a aVar3, Pc.a aVar4) {
        this.f34134a = aVar;
        this.f34135b = aVar2;
        this.f34136c = gVar;
        this.f34137d = aVar3;
        this.f34138e = aVar4;
    }

    @Override // Pc.a
    public final Object get() {
        return new c(this.f34134a.get(), this.f34135b.get(), (q) this.f34136c.get(), this.f34137d.get(), this.f34138e.get());
    }
}
