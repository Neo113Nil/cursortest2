package sg.bigo.ads.D;

import android.os.SystemClock;
import android.webkit.URLUtil;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes3.dex */
public final class l extends sg.bigo.ads.C.l {
    public l(sg.bigo.ads.P.j jVar) {
        super(jVar);
    }

    @Override // sg.bigo.ads.C.l
    public final void a(sg.bigo.ads.Q.c cVar, int i) {
        if (this.n || this.p) {
            return;
        }
        String str = ((sg.bigo.ads.U0.b) this.k.f12482a).z.f12574a;
        if (!URLUtil.isNetworkUrl(str)) {
            str = null;
        }
        if (str != null) {
            cVar.a(this);
        } else {
            cVar.a(this, 1005, IronSourceError.ERROR_IS_LOAD_FAILED_NO_CANDIDATES, "Illegal Land Url");
        }
    }

    @Override // sg.bigo.ads.C.l, sg.bigo.ads.e.h
    public final void destroyInMainThread() {
        super.destroyInMainThread();
        if (this.H) {
            return;
        }
        this.H = true;
        sg.bigo.ads.s1.b.a(this.k.f12482a, SystemClock.elapsedRealtime() - this.w);
    }
}
