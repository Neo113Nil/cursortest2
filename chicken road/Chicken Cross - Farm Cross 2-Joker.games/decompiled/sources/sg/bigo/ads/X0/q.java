package sg.bigo.ads.X0;

import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public volatile int f12612a = 0;
    public boolean b = true;
    public final /* synthetic */ r c;

    public q(r rVar) {
        this.c = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (sg.bigo.ads.a0.o.d <= 0) {
            if (this.f12612a == 1 || this.f12612a == 2) {
                if (this.f12612a == 1) {
                    AbstractC5446j.a(this);
                }
                this.f12612a = 3;
                return;
            }
            return;
        }
        if (!this.b || this.c.l) {
            this.f12612a = 4;
            this.c.f.a(new p(this), 0);
        } else {
            this.b = false;
            AbstractC5496a.b("PrefetchConfigTask", "The network is unavailable now. Task paused.");
            this.f12612a = 2;
        }
    }
}
