package R1;

/* loaded from: classes.dex */
public class f implements R1.n {

    /* renamed from: f, reason: collision with root package name */
    public static final R1.e f1693f = new R1.e();

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Class f1694a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.reflect.Method f1695b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.reflect.Method f1696c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.reflect.Method f1697d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.reflect.Method f1698e;

    public f(java.lang.Class cls) {
        this.f1694a = cls;
        java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", java.lang.Boolean.TYPE);
        kotlin.jvm.internal.i.d(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f1695b = declaredMethod;
        this.f1696c = cls.getMethod("setHostname", java.lang.String.class);
        this.f1697d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f1698e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // R1.n
    public final boolean a(javax.net.ssl.SSLSocket sSLSocket) {
        return this.f1694a.isInstance(sSLSocket);
    }

    @Override // R1.n
    public final java.lang.String b(javax.net.ssl.SSLSocket sSLSocket) {
        if (!this.f1694a.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f1697d.invoke(sSLSocket, null);
            if (bArr == null) {
                return null;
            }
            return new java.lang.String(bArr, y1.a.f8486a);
        } catch (java.lang.IllegalAccessException e2) {
            throw new java.lang.AssertionError(e2);
        } catch (java.lang.reflect.InvocationTargetException e3) {
            java.lang.Throwable cause = e3.getCause();
            if ((cause instanceof java.lang.NullPointerException) && kotlin.jvm.internal.i.a(((java.lang.NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new java.lang.AssertionError(e3);
        }
    }

    @Override // R1.n
    public final boolean c() {
        boolean z2 = Q1.c.f1617e;
        return Q1.c.f1617e;
    }

    @Override // R1.n
    public final void d(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List protocols) {
        kotlin.jvm.internal.i.e(protocols, "protocols");
        if (this.f1694a.isInstance(sSLSocket)) {
            try {
                this.f1695b.invoke(sSLSocket, java.lang.Boolean.TRUE);
                if (str != null) {
                    this.f1696c.invoke(sSLSocket, str);
                }
                java.lang.reflect.Method method = this.f1698e;
                Q1.n nVar = Q1.n.f1644a;
                method.invoke(sSLSocket, m0.j.e(protocols));
            } catch (java.lang.IllegalAccessException e2) {
                throw new java.lang.AssertionError(e2);
            } catch (java.lang.reflect.InvocationTargetException e3) {
                throw new java.lang.AssertionError(e3);
            }
        }
    }
}
