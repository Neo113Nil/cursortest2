package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class ox extends com.facetec.sdk.pa {
    private ox() {
    }

    private static java.security.Provider e() {
        return org.conscrypt.Conscrypt.newProviderBuilder().provideTrustManager().build();
    }

    @Override // com.facetec.sdk.pa
    public final void b(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List<com.facetec.sdk.na> list) throws java.io.IOException {
        if (org.conscrypt.Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                org.conscrypt.Conscrypt.setUseSessionTickets(sSLSocket, true);
                org.conscrypt.Conscrypt.setHostname(sSLSocket, str);
            }
            org.conscrypt.Conscrypt.setApplicationProtocols(sSLSocket, (java.lang.String[]) com.facetec.sdk.pa.e(list).toArray(new java.lang.String[0]));
            return;
        }
        super.b(sSLSocket, str, list);
    }

    @Override // com.facetec.sdk.pa
    @javax.annotation.Nullable
    public final java.lang.String b(javax.net.ssl.SSLSocket sSLSocket) {
        if (org.conscrypt.Conscrypt.isConscrypt(sSLSocket)) {
            return org.conscrypt.Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return super.b(sSLSocket);
    }

    @Override // com.facetec.sdk.pa
    public final javax.net.ssl.SSLContext b() {
        try {
            return javax.net.ssl.SSLContext.getInstance("TLSv1.3", e());
        } catch (java.security.NoSuchAlgorithmException e) {
            try {
                return javax.net.ssl.SSLContext.getInstance("TLS", e());
            } catch (java.security.NoSuchAlgorithmException unused) {
                throw new java.lang.IllegalStateException("No TLS provider", e);
            }
        }
    }

    public static com.facetec.sdk.ox c() {
        try {
            java.lang.Class.forName("org.conscrypt.Conscrypt");
            if (org.conscrypt.Conscrypt.isAvailable()) {
                return new com.facetec.sdk.ox();
            }
            return null;
        } catch (java.lang.ClassNotFoundException unused) {
            return null;
        }
    }

    @Override // com.facetec.sdk.pa
    public final void e(javax.net.ssl.SSLSocketFactory sSLSocketFactory) {
        if (org.conscrypt.Conscrypt.isConscrypt(sSLSocketFactory)) {
            org.conscrypt.Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }
}
