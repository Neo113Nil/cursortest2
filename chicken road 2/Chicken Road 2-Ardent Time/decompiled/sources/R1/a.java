package R1;

/* loaded from: classes.dex */
public final class a implements R1.n {
    @Override // R1.n
    public final boolean a(javax.net.ssl.SSLSocket sSLSocket) {
        boolean isSupportedSocket;
        isSupportedSocket = android.net.ssl.SSLSockets.isSupportedSocket(sSLSocket);
        return isSupportedSocket;
    }

    @Override // R1.n
    public final java.lang.String b(javax.net.ssl.SSLSocket sSLSocket) {
        java.lang.String applicationProtocol;
        applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // R1.n
    public final boolean c() {
        Q1.n nVar = Q1.n.f1644a;
        return m0.j.k() && android.os.Build.VERSION.SDK_INT >= 29;
    }

    @Override // R1.n
    public final void d(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List protocols) {
        kotlin.jvm.internal.i.e(protocols, "protocols");
        try {
            android.net.ssl.SSLSockets.setUseSessionTickets(sSLSocket, true);
            javax.net.ssl.SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            Q1.n nVar = Q1.n.f1644a;
            java.lang.Object[] array = m0.j.c(protocols).toArray(new java.lang.String[0]);
            if (array == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            sSLParameters.setApplicationProtocols((java.lang.String[]) array);
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (java.lang.IllegalArgumentException e2) {
            throw new java.io.IOException("Android internal error", e2);
        }
    }
}
