package F4;

import L4.C0222e;
import java.net.SocketTimeoutException;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class v extends C0222e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w f1662m;

    public v(w wVar) {
        this.f1662m = wVar;
    }

    @Override // L4.C0222e
    public final void j() {
        this.f1662m.e(9);
        o oVar = this.f1662m.f1664b;
        synchronized (oVar) {
            long j5 = oVar.f1632x;
            long j6 = oVar.f1631w;
            if (j5 < j6) {
                return;
            }
            oVar.f1631w = j6 + 1;
            oVar.f1633y = System.nanoTime() + 1000000000;
            oVar.f1626r.c(new B4.b(2, oVar, AbstractC2107A.u(new StringBuilder(), oVar.f1621m, " ping")), 0L);
        }
    }

    public final void k() {
        if (i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
