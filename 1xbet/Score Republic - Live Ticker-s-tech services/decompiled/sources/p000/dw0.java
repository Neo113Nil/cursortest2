package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class dw0 extends fw0 {

    /* JADX INFO: renamed from: e */
    public final Method f1855e;

    /* JADX INFO: renamed from: f */
    public final Method f1856f;

    /* JADX INFO: renamed from: g */
    public final Method f1857g;

    /* JADX INFO: renamed from: h */
    public final Class f1858h;

    /* JADX INFO: renamed from: i */
    public final Class f1859i;

    public dw0(Method method, Method method2, Method method3, Class cls, Class cls2, Provider provider) {
        super(provider);
        this.f1855e = method;
        this.f1856f = method2;
        this.f1857g = method3;
        this.f1858h = cls;
        this.f1859i = cls2;
    }

    @Override // p000.fw0
    /* JADX INFO: renamed from: a */
    public final void mo1321a(SSLSocket sSLSocket) {
        try {
            this.f1857g.invoke(null, sSLSocket);
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (InvocationTargetException e) {
            fw0.f2508b.log(Level.FINE, "Failed to remove SSLSocket from Jetty ALPN", (Throwable) e);
        }
    }

    @Override // p000.fw0
    /* JADX INFO: renamed from: c */
    public final void mo787c(SSLSocket sSLSocket, String str, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ky0 ky0Var = (ky0) list.get(i);
            if (ky0Var != ky0.f4591k) {
                arrayList.add(ky0Var.f4596j);
            }
        }
        try {
            this.f1855e.invoke(null, sSLSocket, Proxy.newProxyInstance(fw0.class.getClassLoader(), new Class[]{this.f1858h, this.f1859i}, new ew0(arrayList)));
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // p000.fw0
    /* JADX INFO: renamed from: d */
    public final String mo788d(SSLSocket sSLSocket) {
        try {
            ew0 ew0Var = (ew0) Proxy.getInvocationHandler(this.f1856f.invoke(null, sSLSocket));
            boolean z = ew0Var.f2189b;
            if (!z && ew0Var.f2190c == null) {
                fw0.f2508b.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                return null;
            }
            if (z) {
                return null;
            }
            return ew0Var.f2190c;
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (InvocationTargetException unused2) {
            throw new AssertionError();
        }
    }

    @Override // p000.fw0
    /* JADX INFO: renamed from: e */
    public final int mo789e() {
        return 1;
    }
}
