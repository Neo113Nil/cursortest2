package sg.bigo.ads.Z0;

import sg.bigo.ads.T0.p;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class g implements sg.bigo.ads.Q.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f12658a;
    public final /* synthetic */ int b;
    public final /* synthetic */ p c;
    public final /* synthetic */ l d;

    public g(l lVar, k kVar, int i, p pVar) {
        this.d = lVar;
        this.f12658a = kVar;
        this.b = i;
        this.c = pVar;
    }

    @Override // sg.bigo.ads.Q.c
    public final void a(Ad ad, int i, int i2, String str) {
        l lVar = this.d;
        p pVar = this.c;
        lVar.a(pVar == null ? null : pVar.l, this.f12658a, ad, i, i2, str);
    }

    @Override // sg.bigo.ads.Q.c
    public final void a(sg.bigo.ads.Q.b bVar, boolean z) {
        this.d.getClass();
    }

    @Override // sg.bigo.ads.Q.c
    public final void a(Ad ad) {
        l lVar = this.d;
        k kVar = this.f12658a;
        int i = this.b;
        p pVar = this.c;
        lVar.getClass();
        AbstractC5446j.a(3, new h(lVar, pVar, kVar, i, ad));
    }
}
