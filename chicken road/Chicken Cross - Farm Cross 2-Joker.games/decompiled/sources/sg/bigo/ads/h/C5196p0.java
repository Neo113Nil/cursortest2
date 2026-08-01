package sg.bigo.ads.h;

import android.view.View;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;

/* renamed from: sg.bigo.ads.h.p0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5196p0 extends sg.bigo.ads.K0.E {
    public final /* synthetic */ AdCountDownButton i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5196p0(long j, AdCountDownButton adCountDownButton) {
        super(j, 1000L);
        this.i = adCountDownButton;
    }

    @Override // sg.bigo.ads.K0.E
    public final void a(long j) {
    }

    @Override // sg.bigo.ads.K0.E
    public final void c() {
        this.i.setVisibility(0);
        this.i.c();
        AbstractC5140Q.b((View) this.i);
    }
}
