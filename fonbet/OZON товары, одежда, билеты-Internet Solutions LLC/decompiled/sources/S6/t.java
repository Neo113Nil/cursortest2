package S6;

import B4.V;
import S6.i;

/* loaded from: classes9.dex */
final class t<T> implements Q6.h<T> {

    /* renamed from: a, reason: collision with root package name */
    private final r f25942a;

    /* renamed from: b, reason: collision with root package name */
    private final String f25943b;

    /* renamed from: c, reason: collision with root package name */
    private final Q6.c f25944c;

    /* renamed from: d, reason: collision with root package name */
    private final Q6.g<T, byte[]> f25945d;

    /* renamed from: e, reason: collision with root package name */
    private final u f25946e;

    t(r rVar, String str, Q6.c cVar, Q6.g gVar, u uVar) {
        this.f25942a = rVar;
        this.f25943b = str;
        this.f25944c = cVar;
        this.f25945d = gVar;
        this.f25946e = uVar;
    }

    @Override // Q6.h
    public final void a(Q6.d<T> dVar) {
        V v11 = new V();
        i.a aVar = new i.a();
        aVar.e(this.f25942a);
        aVar.c(dVar);
        aVar.f(this.f25943b);
        aVar.d(this.f25945d);
        aVar.b(this.f25944c);
        this.f25946e.e(aVar.a(), v11);
    }
}
