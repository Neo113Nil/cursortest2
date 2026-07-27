package sg.bigo.ads.w;

import sg.bigo.ads.K0.E;

/* loaded from: classes3.dex */
public final class n extends E {
    public final /* synthetic */ o i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, long j) {
        super(j, 1000L);
        this.i = oVar;
    }

    @Override // sg.bigo.ads.K0.E
    public final void a(long j) {
    }

    @Override // sg.bigo.ads.K0.E
    public final void c() {
        o oVar = this.i;
        if (oVar.s0 == null || oVar.d0() != 0 || sg.bigo.ads.e.h.a((sg.bigo.ads.e.h) this.i.l)) {
            return;
        }
        this.i.s0.a(0, 2);
    }
}
