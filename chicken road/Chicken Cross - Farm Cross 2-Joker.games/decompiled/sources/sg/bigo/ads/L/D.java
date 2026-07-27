package sg.bigo.ads.L;

import android.view.ViewGroup;
import sg.bigo.ads.ad.splash.AdSplashActivity;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class D extends sg.bigo.ads.K0.E {
    public final /* synthetic */ N i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(N n, long j) {
        super(j, 1000L);
        this.i = n;
    }

    @Override // sg.bigo.ads.K0.E
    public final void a(long j) {
        this.i.b0.a(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        if (r3 != false) goto L23;
     */
    @Override // sg.bigo.ads.K0.E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        ViewGroup viewGroup;
        N n = this.i;
        if (n.b0.c) {
            if (!n.y()) {
                N n2 = this.i;
                sg.bigo.ads.T0.q qVar = n2.Y;
                boolean z = false;
                if (qVar != null) {
                    Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.is_auto_close"));
                    if (1 == (a2 != null ? a2.intValue() : 0) && !n2.C() && (viewGroup = n2.a0) != null && (viewGroup.getContext() instanceof AdSplashActivity)) {
                        n2.c(9);
                        z = true;
                    }
                }
            }
            AbstractC5446j.b(new C(this));
            this.i.b0.c();
        }
        N n3 = this.i;
        n3.V = true;
        n3.W.onAdFinished();
    }
}
