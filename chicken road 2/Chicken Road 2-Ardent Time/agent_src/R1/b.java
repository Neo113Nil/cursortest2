package R1;

/* loaded from: classes.dex */
public final class b extends Q1.l {

    /* renamed from: i, reason: collision with root package name */
    public final javax.net.ssl.X509TrustManager f1688i;

    /* renamed from: j, reason: collision with root package name */
    public final android.net.http.X509TrustManagerExtensions f1689j;

    public b(javax.net.ssl.X509TrustManager x509TrustManager, android.net.http.X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f1688i = x509TrustManager;
        this.f1689j = x509TrustManagerExtensions;
    }

    @Override // Q1.l
    public final java.util.List e(java.lang.String hostname, java.util.List chain) {
        kotlin.jvm.internal.i.e(chain, "chain");
        kotlin.jvm.internal.i.e(hostname, "hostname");
        java.lang.Object[] array = chain.toArray(new java.security.cert.X509Certificate[0]);
        if (array == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        try {
            java.util.List<java.security.cert.X509Certificate> checkServerTrusted = this.f1689j.checkServerTrusted((java.security.cert.X509Certificate[]) array, "RSA", hostname);
            kotlin.jvm.internal.i.d(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (java.security.cert.CertificateException e2) {
            javax.net.ssl.SSLPeerUnverifiedException sSLPeerUnverifiedException = new javax.net.ssl.SSLPeerUnverifiedException(e2.getMessage());
            sSLPeerUnverifiedException.initCause(e2);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof R1.b) && ((R1.b) obj).f1688i == this.f1688i;
    }

    public final int hashCode() {
        return java.lang.System.identityHashCode(this.f1688i);
    }
}
