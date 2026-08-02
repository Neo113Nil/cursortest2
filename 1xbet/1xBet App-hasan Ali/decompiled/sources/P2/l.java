package P2;

import T2.H;
import T2.L;
import a3.C0457a;
import android.net.Uri;
import com.google.android.gms.internal.ads.O4;
import com.google.android.gms.internal.ads.Q4;
import e2.C1928i;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* loaded from: classes.dex */
public final class l implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4755a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4756b;

    public /* synthetic */ l(int i, Object obj) {
        this.f4755a = i;
        this.f4756b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object obj = this.f4756b;
        switch (this.f4755a) {
            case 0:
                n nVar = (n) obj;
                return new Q4(O4.v(nVar.f4761n, new D3.l(nVar.f4758k.f5852k)));
            case 1:
                H h3 = L.f5672l;
                L l5 = o.f4767B.f4771c;
                return L.l((Uri) obj);
            case 2:
                return ((C0457a) obj).getViewSignals();
            default:
                C1928i c1928i = new C1928i();
                c1928i.f16907a = (JsReplyProxyBoundaryInterface) obj;
                return c1928i;
        }
    }
}
