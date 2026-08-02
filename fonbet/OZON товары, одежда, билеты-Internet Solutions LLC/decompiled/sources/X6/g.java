package X6;

import Y6.q;
import android.content.Context;

/* loaded from: classes9.dex */
public final class g implements U6.b<q> {

    /* renamed from: a, reason: collision with root package name */
    private final U6.c f34139a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<Z6.d> f34140b;

    /* renamed from: c, reason: collision with root package name */
    private final f f34141c;

    public g(U6.c cVar, Pc.a aVar, f fVar, b7.c cVar2) {
        this.f34139a = cVar;
        this.f34140b = aVar;
        this.f34141c = fVar;
    }

    @Override // Pc.a
    public final Object get() {
        return new Y6.d((Context) this.f34139a.get(), this.f34140b.get(), (Y6.e) this.f34141c.get());
    }
}
