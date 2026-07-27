package sg.bigo.ads.h;

import sg.bigo.ads.K0.AnimationAnimationListenerC4952i;

/* loaded from: classes3.dex */
public final class O0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ P0 f12845a;

    public O0(P0 p0) {
        this.f12845a = p0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        P0 p0 = this.f12845a;
        int i = p0.d.K.b;
        p0.f12847a.setVisibility(0);
        if (i == 1) {
            AbstractC5140Q.c(this.f12845a.f12847a);
        } else {
            AbstractC5140Q.a(this.f12845a.f12847a, 400L, new AnimationAnimationListenerC4952i());
        }
    }
}
