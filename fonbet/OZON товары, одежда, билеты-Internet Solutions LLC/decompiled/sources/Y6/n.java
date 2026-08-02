package Y6;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes9.dex */
public final class n implements U6.b<m> {

    /* renamed from: a, reason: collision with root package name */
    private final U6.c f34687a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<T6.e> f34688b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<Z6.d> f34689c;

    /* renamed from: d, reason: collision with root package name */
    private final X6.g f34690d;

    /* renamed from: e, reason: collision with root package name */
    private final Pc.a<Executor> f34691e;

    /* renamed from: f, reason: collision with root package name */
    private final Pc.a<a7.b> f34692f;

    /* renamed from: g, reason: collision with root package name */
    private final Pc.a<Z6.c> f34693g;

    public n(U6.c cVar, Pc.a aVar, Pc.a aVar2, X6.g gVar, Pc.a aVar3, Pc.a aVar4, b7.b bVar, b7.c cVar2, Pc.a aVar5) {
        this.f34687a = cVar;
        this.f34688b = aVar;
        this.f34689c = aVar2;
        this.f34690d = gVar;
        this.f34691e = aVar3;
        this.f34692f = aVar4;
        this.f34693g = aVar5;
    }

    @Override // Pc.a
    public final Object get() {
        return new m((Context) this.f34687a.get(), this.f34688b.get(), this.f34689c.get(), (q) this.f34690d.get(), this.f34691e.get(), this.f34692f.get(), new a2.d(), new b7.d(), this.f34693g.get());
    }
}
