package sg.bigo.ads.I;

import sg.bigo.ads.K0.E;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class n extends E {
    public final /* synthetic */ p i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, long j) {
        super(15000L, j);
        this.i = pVar;
    }

    @Override // sg.bigo.ads.K0.E
    public final void a(long j) {
        AdCountDownButton adCountDownButton = this.i.g;
        if (adCountDownButton != null) {
            adCountDownButton.a(j);
        }
    }

    @Override // sg.bigo.ads.K0.E
    public final void c() {
        AbstractC5446j.a(2, new m(this));
    }
}
