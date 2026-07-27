package sg.bigo.ads.h;

import sg.bigo.ads.ad.interstitial.AdCountDownButton;

/* loaded from: classes3.dex */
public final class m2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ H2 f12907a;

    public m2(H2 h2) {
        this.f12907a = h2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Integer a2;
        H2 h2 = this.f12907a;
        this.f12907a.a(((!h2.v ? (a2 = sg.bigo.ads.K0.z.a(h2.s.a("interstitial_video_style.endpage.impression_close_seconds"))) != null : (a2 = sg.bigo.ads.K0.z.a(h2.t.a("endpage.close_click_seconds"))) != null) ? 0 : a2.intValue()) * 1000);
        AdCountDownButton adCountDownButton = this.f12907a.g;
        if (adCountDownButton != null) {
            adCountDownButton.c();
        }
    }
}
