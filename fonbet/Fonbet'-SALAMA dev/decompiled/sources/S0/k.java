package S0;

import android.webkit.SafeBrowsingResponse;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: classes.dex */
public final class k extends R0.f {

    /* renamed from: a, reason: collision with root package name */
    public SafeBrowsingResponse f6244a;

    /* renamed from: b, reason: collision with root package name */
    public SafeBrowsingResponseBoundaryInterface f6245b;

    @Override // R0.f
    public final void a(boolean z4) {
        C0431b c0431b = w.f6302r;
        if (c0431b.a()) {
            c().showInterstitial(z4);
        } else {
            if (!c0431b.b()) {
                throw w.a();
            }
            b().showInterstitial(z4);
        }
    }

    public final SafeBrowsingResponseBoundaryInterface b() {
        if (this.f6245b == null) {
            B b7 = x.f6311a;
            this.f6245b = (SafeBrowsingResponseBoundaryInterface) P6.b.a(SafeBrowsingResponseBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) b7.f6229b).convertSafeBrowsingResponse(this.f6244a));
        }
        return this.f6245b;
    }

    public final SafeBrowsingResponse c() {
        if (this.f6244a == null) {
            B b7 = x.f6311a;
            this.f6244a = H2.i.b(((WebkitToCompatConverterBoundaryInterface) b7.f6229b).convertSafeBrowsingResponse(Proxy.getInvocationHandler(this.f6245b)));
        }
        return this.f6244a;
    }
}
