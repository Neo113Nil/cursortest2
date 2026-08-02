package S0;

import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: classes.dex */
public final class r extends R0.o {

    /* renamed from: a, reason: collision with root package name */
    public WebMessagePort f6261a;

    /* renamed from: b, reason: collision with root package name */
    public WebMessagePortBoundaryInterface f6262b;

    public r(WebMessagePort webMessagePort) {
        this.f6261a = webMessagePort;
    }

    public static WebMessage b(R0.n nVar) {
        WebMessagePort[] webMessagePortArr;
        nVar.a(0);
        R0.o[] oVarArr = nVar.f5862a;
        if (oVarArr == null) {
            webMessagePortArr = null;
        } else {
            int length = oVarArr.length;
            WebMessagePort[] webMessagePortArr2 = new WebMessagePort[length];
            for (int i7 = 0; i7 < length; i7++) {
                webMessagePortArr2[i7] = ((r) oVarArr[i7]).d();
            }
            webMessagePortArr = webMessagePortArr2;
        }
        return new WebMessage(nVar.f5863b, webMessagePortArr);
    }

    @Override // R0.o
    public final void a(R0.n nVar) {
        C0431b c0431b = w.f6303s;
        c0431b.getClass();
        int i7 = nVar.f5865d;
        if (i7 == 0) {
            d().postMessage(b(nVar));
        } else {
            if (!c0431b.b() || (i7 != 0 && (i7 != 1 || !w.f6305u.b()))) {
                throw w.a();
            }
            c().postMessage(new P6.a(new p(nVar)));
        }
    }

    public final WebMessagePortBoundaryInterface c() {
        if (this.f6262b == null) {
            B b7 = x.f6311a;
            this.f6262b = (WebMessagePortBoundaryInterface) P6.b.a(WebMessagePortBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) b7.f6229b).convertWebMessagePort(this.f6261a));
        }
        return this.f6262b;
    }

    public final WebMessagePort d() {
        if (this.f6261a == null) {
            B b7 = x.f6311a;
            this.f6261a = (WebMessagePort) ((WebkitToCompatConverterBoundaryInterface) b7.f6229b).convertWebMessagePort(Proxy.getInvocationHandler(this.f6262b));
        }
        return this.f6261a;
    }

    public r(InvocationHandler invocationHandler) {
        this.f6262b = (WebMessagePortBoundaryInterface) P6.b.a(WebMessagePortBoundaryInterface.class, invocationHandler);
    }
}
