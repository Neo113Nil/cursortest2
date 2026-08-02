package N50;

import android.app.Application;

/* loaded from: classes3.dex */
public final class p implements Jb.e<e> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<M50.c> f18740a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<S80.b> f18741b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<Application> f18742c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<K40.a> f18743d;

    public p(Pc.a<M50.c> aVar, Pc.a<S80.b> aVar2, Pc.a<Application> aVar3, Pc.a<K40.a> aVar4) {
        this.f18740a = aVar;
        this.f18741b = aVar2;
        this.f18742c = aVar3;
        this.f18743d = aVar4;
    }

    @Override // Pc.a
    public final Object get() {
        return new e(this.f18740a.get(), this.f18741b.get(), this.f18742c.get(), this.f18743d.get());
    }
}
