package sg.bigo.ads.L;

import android.view.View;
import android.view.ViewGroup;
import sg.bigo.ads.ad.splash.AdSplashActivity;
import sg.bigo.ads.h.AbstractC5140Q;

/* loaded from: classes3.dex */
public final class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N f12397a;

    public t(N n) {
        this.f12397a = n;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        ViewGroup viewGroup;
        N n = this.f12397a;
        sg.bigo.ads.T0.q qVar = n.Y;
        if (qVar != null) {
            Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.is_auto_close"));
            z = true;
            if (1 == (a2 != null ? a2.intValue() : 0) && !n.C() && (viewGroup = n.a0) != null && (viewGroup.getContext() instanceof AdSplashActivity)) {
                n.c(9);
                if (!z || this.f12397a.b0.getVisibility() == 0) {
                }
                this.f12397a.b0.setVisibility(0);
                AbstractC5140Q.b((View) this.f12397a.b0);
                return;
            }
        }
        z = false;
        if (z) {
        }
    }
}
