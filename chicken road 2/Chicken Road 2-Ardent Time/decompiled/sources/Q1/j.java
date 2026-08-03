package Q1;

/* loaded from: classes.dex */
public final class j extends Q1.n {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.reflect.Method f1628c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.reflect.Method f1629d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.reflect.Method f1630e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Class f1631f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Class f1632g;

    public j(java.lang.reflect.Method method, java.lang.reflect.Method method2, java.lang.reflect.Method method3, java.lang.Class cls, java.lang.Class cls2) {
        this.f1628c = method;
        this.f1629d = method2;
        this.f1630e = method3;
        this.f1631f = cls;
        this.f1632g = cls2;
    }

    @Override // Q1.n
    public final void a(javax.net.ssl.SSLSocket sSLSocket) {
        try {
            this.f1630e.invoke(null, sSLSocket);
        } catch (java.lang.IllegalAccessException e2) {
            throw new java.lang.AssertionError("failed to remove ALPN", e2);
        } catch (java.lang.reflect.InvocationTargetException e3) {
            throw new java.lang.AssertionError("failed to remove ALPN", e3);
        }
    }

    @Override // Q1.n
    public final void d(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List protocols) {
        kotlin.jvm.internal.i.e(protocols, "protocols");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : protocols) {
            if (((I1.t) obj) != I1.t.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(i1.AbstractC0192k.K(arrayList));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((I1.t) it.next()).f827a);
        }
        try {
            this.f1628c.invoke(null, sSLSocket, java.lang.reflect.Proxy.newProxyInstance(Q1.n.class.getClassLoader(), new java.lang.Class[]{this.f1631f, this.f1632g}, new Q1.i(arrayList2)));
        } catch (java.lang.IllegalAccessException e2) {
            throw new java.lang.AssertionError("failed to set ALPN", e2);
        } catch (java.lang.reflect.InvocationTargetException e3) {
            throw new java.lang.AssertionError("failed to set ALPN", e3);
        }
    }

    @Override // Q1.n
    public final java.lang.String f(javax.net.ssl.SSLSocket sSLSocket) {
        try {
            java.lang.reflect.InvocationHandler invocationHandler = java.lang.reflect.Proxy.getInvocationHandler(this.f1629d.invoke(null, sSLSocket));
            if (invocationHandler == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
            Q1.i iVar = (Q1.i) invocationHandler;
            boolean z2 = iVar.f1626b;
            if (!z2 && iVar.f1627c == null) {
                Q1.n.i("ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 4, null);
                return null;
            }
            if (z2) {
                return null;
            }
            return iVar.f1627c;
        } catch (java.lang.IllegalAccessException e2) {
            throw new java.lang.AssertionError("failed to get ALPN selected protocol", e2);
        } catch (java.lang.reflect.InvocationTargetException e3) {
            throw new java.lang.AssertionError("failed to get ALPN selected protocol", e3);
        }
    }
}
