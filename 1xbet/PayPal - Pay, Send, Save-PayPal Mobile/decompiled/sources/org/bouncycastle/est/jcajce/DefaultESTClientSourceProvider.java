package org.bouncycastle.est.jcajce;

/* loaded from: classes17.dex */
class DefaultESTClientSourceProvider implements org.bouncycastle.est.ESTClientSourceProvider {
    private final java.util.Set<java.lang.String> Camera2StreamConfigurationMap;
    private final boolean getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.est.jcajce.JsseHostnameAuthorizer getHighSpeedVideoFpsRanges;
    private final java.lang.Long getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.est.jcajce.ChannelBindingProvider getHighSpeedVideoSizes;
    private final javax.net.ssl.SSLSocketFactory getInputSizeshNQ4ISI;
    private final int getOutputMinFrameDuration;

    @Override // org.bouncycastle.est.ESTClientSourceProvider
    public org.bouncycastle.est.Source makeSource(java.lang.String str, int i) throws java.io.IOException {
        javax.net.ssl.SSLSocket sSLSocket = (javax.net.ssl.SSLSocket) this.getInputSizeshNQ4ISI.createSocket(str, i);
        sSLSocket.setSoTimeout(this.getOutputMinFrameDuration);
        java.util.Set<java.lang.String> set = this.Camera2StreamConfigurationMap;
        if (set != null && !set.isEmpty()) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                java.util.HashSet hashSet = new java.util.HashSet();
                java.lang.String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
                for (int i2 = 0; i2 != supportedCipherSuites.length; i2++) {
                    hashSet.add(supportedCipherSuites[i2]);
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.String str2 : this.Camera2StreamConfigurationMap) {
                    if (hashSet.contains(str2)) {
                        arrayList.add(str2);
                    }
                }
                if (arrayList.isEmpty()) {
                    throw new java.lang.IllegalStateException("No supplied cipher suite is supported by the provider.");
                }
                sSLSocket.setEnabledCipherSuites((java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]));
            } else {
                java.util.Set<java.lang.String> set2 = this.Camera2StreamConfigurationMap;
                sSLSocket.setEnabledCipherSuites((java.lang.String[]) set2.toArray(new java.lang.String[set2.size()]));
            }
        }
        sSLSocket.startHandshake();
        org.bouncycastle.est.jcajce.JsseHostnameAuthorizer jsseHostnameAuthorizer = this.getHighSpeedVideoFpsRanges;
        if (jsseHostnameAuthorizer != null && !jsseHostnameAuthorizer.verified(str, sSLSocket.getSession())) {
            throw new java.io.IOException("Host name could not be verified.");
        }
        java.lang.String lowerCase = org.bouncycastle.util.Strings.toLowerCase(sSLSocket.getSession().getCipherSuite());
        if (lowerCase.contains("_des_") || lowerCase.contains("_des40_") || lowerCase.contains("_3des_")) {
            throw new java.io.IOException("EST clients must not use DES ciphers");
        }
        if (org.bouncycastle.util.Strings.toLowerCase(sSLSocket.getSession().getCipherSuite()).contains("null")) {
            throw new java.io.IOException("EST clients must not use NULL ciphers");
        }
        if (org.bouncycastle.util.Strings.toLowerCase(sSLSocket.getSession().getCipherSuite()).contains("anon")) {
            throw new java.io.IOException("EST clients must not use anon ciphers");
        }
        if (org.bouncycastle.util.Strings.toLowerCase(sSLSocket.getSession().getCipherSuite()).contains("export")) {
            throw new java.io.IOException("EST clients must not use export ciphers");
        }
        if (sSLSocket.getSession().getProtocol().equalsIgnoreCase("tlsv1")) {
            try {
                sSLSocket.close();
            } catch (java.lang.Exception unused) {
            }
            throw new java.io.IOException("EST clients must not use TLSv1");
        }
        org.bouncycastle.est.jcajce.JsseHostnameAuthorizer jsseHostnameAuthorizer2 = this.getHighSpeedVideoFpsRanges;
        if (jsseHostnameAuthorizer2 == null || jsseHostnameAuthorizer2.verified(str, sSLSocket.getSession())) {
            return new org.bouncycastle.est.jcajce.LimitedSSLSocketSource(sSLSocket, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor);
        }
        throw new java.io.IOException("Hostname was not verified: ".concat(java.lang.String.valueOf(str)));
    }

    public DefaultESTClientSourceProvider(javax.net.ssl.SSLSocketFactory sSLSocketFactory, org.bouncycastle.est.jcajce.JsseHostnameAuthorizer jsseHostnameAuthorizer, int i, org.bouncycastle.est.jcajce.ChannelBindingProvider channelBindingProvider, java.util.Set<java.lang.String> set, java.lang.Long l, boolean z) throws java.security.GeneralSecurityException {
        this.getInputSizeshNQ4ISI = sSLSocketFactory;
        this.getHighSpeedVideoFpsRanges = jsseHostnameAuthorizer;
        this.getOutputMinFrameDuration = i;
        this.getHighSpeedVideoSizes = channelBindingProvider;
        this.Camera2StreamConfigurationMap = set;
        this.getHighSpeedVideoFpsRangesFor = l;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }
}
