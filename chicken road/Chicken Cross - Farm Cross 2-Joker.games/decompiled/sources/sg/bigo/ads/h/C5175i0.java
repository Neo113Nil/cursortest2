package sg.bigo.ads.h;

import sg.bigo.ads.ad.interstitial.AdCountDownButton;

/* renamed from: sg.bigo.ads.h.i0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5175i0 extends sg.bigo.ads.K0.E {
    public final /* synthetic */ C5178j0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5175i0(C5178j0 c5178j0, long j) {
        super(j, 1000L);
        this.i = c5178j0;
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
        AdCountDownButton adCountDownButton = this.i.g;
        if (adCountDownButton != null) {
            adCountDownButton.c();
            this.i.g.setTakeoverTickEvent(false);
        }
    }
}
