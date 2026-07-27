package sg.bigo.ads.J;

import sg.bigo.ads.K0.E;

/* loaded from: classes3.dex */
public final class g extends E {
    public final /* synthetic */ h i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, long j) {
        super(j, 1000L);
        this.i = hVar;
    }

    @Override // sg.bigo.ads.K0.E
    public final void a(long j) {
    }

    @Override // sg.bigo.ads.K0.E
    public final void c() {
        h hVar = this.i;
        if (hVar.x0 == null || hVar.d0() != 0 || sg.bigo.ads.e.h.a((sg.bigo.ads.e.h) this.i.l)) {
            return;
        }
        this.i.x0.a(0, 2);
    }
}
