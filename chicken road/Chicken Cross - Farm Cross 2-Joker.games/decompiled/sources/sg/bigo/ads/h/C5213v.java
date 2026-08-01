package sg.bigo.ads.h;

import sg.bigo.ads.ad.interstitial.AdCountDownButton;

/* renamed from: sg.bigo.ads.h.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5213v extends sg.bigo.ads.K0.E {
    public final /* synthetic */ InterfaceC5219x i;
    public final /* synthetic */ AdCountDownButton j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5213v(AdCountDownButton adCountDownButton, long j, InterfaceC5219x interfaceC5219x) {
        super(j, 1000L);
        this.j = adCountDownButton;
        this.i = interfaceC5219x;
    }

    @Override // sg.bigo.ads.K0.E
    public final void a(long j) {
        AdCountDownButton adCountDownButton = this.j;
        adCountDownButton.i = j;
        if (adCountDownButton.e) {
            return;
        }
        adCountDownButton.b(j);
    }

    @Override // sg.bigo.ads.K0.E
    public final void c() {
        AdCountDownButton adCountDownButton = this.j;
        adCountDownButton.b(adCountDownButton.e);
        InterfaceC5219x interfaceC5219x = this.i;
        if (interfaceC5219x != null) {
            interfaceC5219x.a();
        }
        this.j.c = true;
    }
}
