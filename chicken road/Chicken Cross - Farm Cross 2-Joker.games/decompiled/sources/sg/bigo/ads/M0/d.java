package sg.bigo.ads.M0;

import android.os.SystemClock;
import android.view.ViewTreeObserver;

/* loaded from: classes3.dex */
public final class d implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f12459a;

    public d(g gVar) {
        this.f12459a = gVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (Math.abs(elapsedRealtime - this.f12459a.j) < g.n) {
            return true;
        }
        g.a(this.f12459a);
        this.f12459a.j = elapsedRealtime;
        return true;
    }
}
