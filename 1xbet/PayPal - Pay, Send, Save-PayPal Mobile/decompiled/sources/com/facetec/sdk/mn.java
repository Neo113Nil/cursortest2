package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class mn {

    /* renamed from: a, reason: collision with root package name */
    private final com.facetec.sdk.nb f3653a;
    private final java.util.List<java.security.cert.Certificate> b;
    private final java.util.List<java.security.cert.Certificate> c;
    public final com.facetec.sdk.mc e;

    private mn(com.facetec.sdk.nb nbVar, com.facetec.sdk.mc mcVar, java.util.List<java.security.cert.Certificate> list, java.util.List<java.security.cert.Certificate> list2) {
        this.f3653a = nbVar;
        this.e = mcVar;
        this.b = list;
        this.c = list2;
    }

    public static com.facetec.sdk.mn e(javax.net.ssl.SSLSession sSLSession) throws java.io.IOException {
        java.security.cert.Certificate[] certificateArr;
        java.util.List emptyList;
        java.util.List emptyList2;
        java.lang.String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new java.lang.IllegalStateException("cipherSuite == null");
        }
        if ("SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            throw new java.io.IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
        com.facetec.sdk.mc b = com.facetec.sdk.mc.b(cipherSuite);
        java.lang.String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new java.lang.IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new java.io.IOException("tlsVersion == NONE");
        }
        com.facetec.sdk.nb c = com.facetec.sdk.nb.c(protocol);
        try {
            certificateArr = sSLSession.getPeerCertificates();
        } catch (javax.net.ssl.SSLPeerUnverifiedException unused) {
            certificateArr = null;
        }
        if (certificateArr != null) {
            emptyList = com.facetec.sdk.nh.c(certificateArr);
        } else {
            emptyList = java.util.Collections.emptyList();
        }
        java.security.cert.Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            emptyList2 = com.facetec.sdk.nh.c(localCertificates);
        } else {
            emptyList2 = java.util.Collections.emptyList();
        }
        return new com.facetec.sdk.mn(c, b, emptyList, emptyList2);
    }

    public final java.util.List<java.security.cert.Certificate> a() {
        return this.b;
    }

    public final boolean equals(@javax.annotation.Nullable java.lang.Object obj) {
        if (!(obj instanceof com.facetec.sdk.mn)) {
            return false;
        }
        com.facetec.sdk.mn mnVar = (com.facetec.sdk.mn) obj;
        return this.f3653a.equals(mnVar.f3653a) && this.e.equals(mnVar.e) && this.b.equals(mnVar.b) && this.c.equals(mnVar.c);
    }

    public final int hashCode() {
        int hashCode = this.f3653a.hashCode();
        return ((((((hashCode + 527) * 31) + this.e.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }
}
