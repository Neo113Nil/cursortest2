package sg.bigo.ads.Y0;

import sg.bigo.ads.c0.C5053d;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f12637a;

    public k(l lVar) {
        this.f12637a = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x xVar = this.f12637a.b;
        xVar.W = null;
        xVar.X = null;
        xVar.Y = null;
        xVar.T = xVar.L();
        C5053d c5053d = xVar.T;
        if (c5053d == null) {
            return;
        }
        AbstractC5446j.a(1, null, new t(c5053d), 0L);
    }
}
