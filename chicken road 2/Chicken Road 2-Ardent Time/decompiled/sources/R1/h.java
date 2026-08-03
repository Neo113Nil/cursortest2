package R1;

/* loaded from: classes.dex */
public final class h implements R1.n {

    /* renamed from: a, reason: collision with root package name */
    public static final R1.g f1699a = new R1.g();

    @Override // R1.n
    public final boolean a(javax.net.ssl.SSLSocket sSLSocket) {
        return false;
    }

    @Override // R1.n
    public final java.lang.String b(javax.net.ssl.SSLSocket sSLSocket) {
        java.lang.String applicationProtocol = ((org.bouncycastle.jsse.BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : kotlin.jvm.internal.i.a(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // R1.n
    public final boolean c() {
        boolean z2 = Q1.e.f1620d;
        return Q1.e.f1620d;
    }

    @Override // R1.n
    public final void d(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List protocols) {
        kotlin.jvm.internal.i.e(protocols, "protocols");
        if (a(sSLSocket)) {
            org.bouncycastle.jsse.BCSSLSocket bCSSLSocket = (org.bouncycastle.jsse.BCSSLSocket) sSLSocket;
            org.bouncycastle.jsse.BCSSLParameters parameters = bCSSLSocket.getParameters();
            Q1.n nVar = Q1.n.f1644a;
            java.lang.Object[] array = m0.j.c(protocols).toArray(new java.lang.String[0]);
            if (array == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            parameters.setApplicationProtocols((java.lang.String[]) array);
            bCSSLSocket.setParameters(parameters);
        }
    }
}
