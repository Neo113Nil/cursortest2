package sg.bigo.ads.x1;

import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class k implements sg.bigo.ads.w1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f13395a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ f d;

    public k(String str, f fVar, q qVar, boolean z) {
        this.d = fVar;
        this.f13395a = qVar;
        this.b = str;
        this.c = z;
    }

    @Override // sg.bigo.ads.w1.c
    public final void a() {
        f.a(this.b, this.d, this.f13395a, this.c);
        p pVar = p.h;
        s sVar = this.d.f;
        pVar.getClass();
        AbstractC5446j.a(1, null, new m(sVar), 0L);
    }

    @Override // sg.bigo.ads.w1.c
    public final void b() {
        q qVar = this.f13395a;
        if (qVar.j == 1) {
            f.a(this.b, this.d, qVar, true);
        }
        p pVar = p.h;
        s sVar = this.d.f;
        pVar.getClass();
        AbstractC5446j.a(1, null, new m(sVar), 0L);
    }

    @Override // sg.bigo.ads.w1.c
    public final boolean a(int i) {
        sg.bigo.ads.P.u uVar = this.d.e;
        if (i >= 100) {
            return uVar.b.contains(String.valueOf(i));
        }
        uVar.getClass();
        return false;
    }
}
