package G4;

import X3.o;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import y4.v;

/* loaded from: classes.dex */
public final class j extends n {

    /* renamed from: c, reason: collision with root package name */
    public final Method f2004c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f2005d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f2006e;
    public final Class f;

    /* renamed from: g, reason: collision with root package name */
    public final Class f2007g;

    public j(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f2004c = method;
        this.f2005d = method2;
        this.f2006e = method3;
        this.f = cls;
        this.f2007g = cls2;
    }

    @Override // G4.n
    public final void a(SSLSocket sSLSocket) {
        try {
            this.f2006e.invoke(null, sSLSocket);
        } catch (IllegalAccessException e3) {
            throw new AssertionError("failed to remove ALPN", e3);
        } catch (InvocationTargetException e5) {
            throw new AssertionError("failed to remove ALPN", e5);
        }
    }

    @Override // G4.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        kotlin.jvm.internal.l.f("protocols", list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((v) obj) != v.f21427l) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(o.S(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((v) obj2).f21434k);
        }
        try {
            this.f2004c.invoke(null, sSLSocket, Proxy.newProxyInstance(n.class.getClassLoader(), new Class[]{this.f, this.f2007g}, new i(arrayList2)));
        } catch (IllegalAccessException e3) {
            throw new AssertionError("failed to set ALPN", e3);
        } catch (InvocationTargetException e5) {
            throw new AssertionError("failed to set ALPN", e5);
        }
    }

    @Override // G4.n
    public final String f(SSLSocket sSLSocket) {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f2005d.invoke(null, sSLSocket));
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider", invocationHandler);
            i iVar = (i) invocationHandler;
            boolean z3 = iVar.f2002b;
            if (!z3 && iVar.f2003c == null) {
                n.i(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                return null;
            }
            if (z3) {
                return null;
            }
            return iVar.f2003c;
        } catch (IllegalAccessException e3) {
            throw new AssertionError("failed to get ALPN selected protocol", e3);
        } catch (InvocationTargetException e5) {
            throw new AssertionError("failed to get ALPN selected protocol", e5);
        }
    }
}
