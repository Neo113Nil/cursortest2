package sg.bigo.ads.D;

import android.os.SystemClock;
import android.webkit.URLUtil;
import com.ironsource.mediationsdk.logger.IronSourceError;
import sg.bigo.ads.C.t;

/* loaded from: classes3.dex */
public final class m extends t {
    public m(sg.bigo.ads.P.j jVar) {
        super(jVar);
    }

    @Override // sg.bigo.ads.C.t, sg.bigo.ads.C.l
    public final void a(sg.bigo.ads.Q.c cVar, int i) {
        if (this.n || this.p) {
            return;
        }
        super.a(cVar, i);
    }

    @Override // sg.bigo.ads.C.t, sg.bigo.ads.C.l, sg.bigo.ads.e.h
    public final void destroyInMainThread() {
        super.destroyInMainThread();
        if (this.H) {
            return;
        }
        this.H = true;
        sg.bigo.ads.s1.b.a(this.k.f12482a, SystemClock.elapsedRealtime() - this.w);
    }

    @Override // sg.bigo.ads.C.t
    public final void a(sg.bigo.ads.Q.c cVar, sg.bigo.ads.P.c cVar2, int i, boolean z) {
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
}
