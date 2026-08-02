package com.facetec.sdk;

/* loaded from: classes8.dex */
final class ov extends com.facetec.sdk.oy {
    private ov(java.lang.Class<?> cls) {
        super(cls, null, null, null, null);
    }

    @Override // com.facetec.sdk.oy, com.facetec.sdk.pa
    @javax.annotation.Nullable
    public final java.lang.String b(javax.net.ssl.SSLSocket sSLSocket) {
        java.lang.String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.isEmpty()) {
            return null;
        }
        return applicationProtocol;
    }

    @javax.annotation.Nullable
    public static com.facetec.sdk.pa c() {
        if (!com.facetec.sdk.pa.g()) {
            return null;
        }
        try {
            if (e() >= 29) {
                return new com.facetec.sdk.ov(java.lang.Class.forName("com.android.org.conscrypt.SSLParametersImpl"));
            }
        } catch (java.lang.ClassNotFoundException unused) {
        }
        return null;
    }

    @Override // com.facetec.sdk.oy, com.facetec.sdk.pa
    public final void b(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List<com.facetec.sdk.na> list) throws java.io.IOException {
        try {
            if (android.net.ssl.SSLSockets.isSupportedSocket(sSLSocket)) {
                android.net.ssl.SSLSockets.setUseSessionTickets(sSLSocket, true);
            }
            javax.net.ssl.SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((java.lang.String[]) com.facetec.sdk.pa.e(list).toArray(new java.lang.String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (java.lang.IllegalArgumentException e) {
            throw new java.io.IOException("Android internal error", e);
        }
    }
}
