package R1;

/* loaded from: classes.dex */
public final class k implements R1.n {

    /* renamed from: a, reason: collision with root package name */
    public static final R1.j f1703a = new R1.j();

    @Override // R1.n
    public final boolean a(javax.net.ssl.SSLSocket sSLSocket) {
        return org.conscrypt.Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // R1.n
    public final java.lang.String b(javax.net.ssl.SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return org.conscrypt.Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // R1.n
    public final boolean c() {
        boolean z2 = Q1.h.f1623d;
        return Q1.h.f1623d;
    }

    @Override // R1.n
    public final void d(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List protocols) {
        kotlin.jvm.internal.i.e(protocols, "protocols");
        if (a(sSLSocket)) {
            org.conscrypt.Conscrypt.setUseSessionTickets(sSLSocket, true);
            Q1.n nVar = Q1.n.f1644a;
            java.lang.Object[] array = m0.j.c(protocols).toArray(new java.lang.String[0]);
            if (array == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            org.conscrypt.Conscrypt.setApplicationProtocols(sSLSocket, (java.lang.String[]) array);
        }
    }
}
