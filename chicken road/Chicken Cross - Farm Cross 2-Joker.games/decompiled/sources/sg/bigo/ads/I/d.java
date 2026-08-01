package sg.bigo.ads.I;

import sg.bigo.ads.K0.E;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class d extends E {
    public final /* synthetic */ f i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, long j) {
        super(j, 1000L);
        this.i = fVar;
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
        AbstractC5446j.a(2, new c(this));
    }
}
