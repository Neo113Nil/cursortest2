package Y5;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;

/* loaded from: classes2.dex */
public final class h extends j {

    /* renamed from: e, reason: collision with root package name */
    public final Method f7793e;

    /* renamed from: f, reason: collision with root package name */
    public final Method f7794f;

    /* renamed from: g, reason: collision with root package name */
    public final Method f7795g;

    /* renamed from: h, reason: collision with root package name */
    public final Class f7796h;

    /* renamed from: i, reason: collision with root package name */
    public final Class f7797i;

    public h(Method method, Method method2, Method method3, Class cls, Class cls2, Provider provider) {
        super(provider);
        this.f7793e = method;
        this.f7794f = method2;
        this.f7795g = method3;
        this.f7796h = cls;
        this.f7797i = cls2;
    }

    @Override // Y5.j
    public final void a(SSLSocket sSLSocket) {
        try {
            this.f7795g.invoke(null, sSLSocket);
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (InvocationTargetException e7) {
            j.f7801b.log(Level.FINE, "Failed to remove SSLSocket from Jetty ALPN", (Throwable) e7);
        }
    }

    @Override // Y5.j
    public final void c(SSLSocket sSLSocket, String str, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            k kVar = (k) list.get(i7);
            if (kVar != k.HTTP_1_0) {
                arrayList.add(kVar.f7810a);
            }
        }
        try {
            this.f7793e.invoke(null, sSLSocket, Proxy.newProxyInstance(j.class.getClassLoader(), new Class[]{this.f7796h, this.f7797i}, new i(arrayList)));
        } catch (IllegalAccessException e7) {
            throw new AssertionError(e7);
        } catch (InvocationTargetException e8) {
            throw new AssertionError(e8);
        }
    }

    @Override // Y5.j
    public final String d(SSLSocket sSLSocket) {
        try {
            i iVar = (i) Proxy.getInvocationHandler(this.f7794f.invoke(null, sSLSocket));
            boolean z4 = iVar.f7799b;
            if (!z4 && iVar.f7800c == null) {
                j.f7801b.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                return null;
            }
            if (z4) {
                return null;
            }
            return iVar.f7800c;
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (InvocationTargetException unused2) {
            throw new AssertionError();
        }
    }

    @Override // Y5.j
    public final int e() {
        return 1;
    }
}
