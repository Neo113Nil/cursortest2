package sg.bigo.ads.h1;

import android.content.Context;

/* loaded from: classes3.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final sg.bigo.ads.g1.a f12975a;
    public final t b;
    public final k c;
    public final s d;
    public final j e;
    public final sg.bigo.ads.U.h f;
    public i g;
    public long h = 0;

    public x(Context context, sg.bigo.ads.g1.a aVar, sg.bigo.ads.V0.a aVar2, sg.bigo.ads.V0.a aVar3, sg.bigo.ads.U.h hVar) {
        u uVar = new u(this);
        t tVar = new t(aVar);
        this.b = tVar;
        k kVar = new k(aVar);
        this.c = kVar;
        this.f12975a = aVar;
        this.f = hVar;
        long j = aVar.b;
        this.d = new s(tVar, aVar3, uVar, context, j);
        this.e = new j(kVar, aVar2, context, j);
        sg.bigo.ads.i1.c.a(new v(this));
    }

    public final void a() {
        k kVar = this.c;
        synchronized (kVar) {
            kVar.c.clear();
            kVar.b.clear();
        }
        this.b.b();
    }
}
