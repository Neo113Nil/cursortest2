package org.bouncycastle.est.jcajce;

/* loaded from: classes17.dex */
class SSLSocketFactoryCreatorBuilder {
    protected javax.net.ssl.KeyManager[] Camera2StreamConfigurationMap;
    protected java.lang.String getHighResolutionOutputSizeshNQ4ISI = "TLS";
    protected java.security.Provider getHighSpeedVideoFpsRanges;
    protected java.security.SecureRandom getHighSpeedVideoFpsRangesFor;
    protected javax.net.ssl.X509TrustManager[] getHighSpeedVideoSizes;

    public final org.bouncycastle.est.jcajce.SSLSocketFactoryCreatorBuilder getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        return this;
    }

    public final org.bouncycastle.est.jcajce.SSLSocketFactoryCreatorBuilder getHighResolutionOutputSizeshNQ4ISI(java.security.SecureRandom secureRandom) {
        this.getHighSpeedVideoFpsRangesFor = secureRandom;
        return this;
    }

    public final org.bouncycastle.est.jcajce.SSLSocketFactoryCreatorBuilder getHighSpeedVideoFpsRanges(java.security.Provider provider) {
        this.getHighSpeedVideoFpsRanges = provider;
        return this;
    }

    public final org.bouncycastle.est.jcajce.SSLSocketFactoryCreatorBuilder getHighSpeedVideoFpsRanges(java.lang.String str) throws java.security.NoSuchProviderException {
        java.security.Provider provider = java.security.Security.getProvider(str);
        this.getHighSpeedVideoFpsRanges = provider;
        if (provider != null) {
            return this;
        }
        throw new java.security.NoSuchProviderException("JSSE provider not found: ".concat(java.lang.String.valueOf(str)));
    }

    public final org.bouncycastle.est.jcajce.SSLSocketFactoryCreatorBuilder Camera2StreamConfigurationMap(javax.net.ssl.KeyManager[] keyManagerArr) {
        this.Camera2StreamConfigurationMap = keyManagerArr;
        return this;
    }

    public final org.bouncycastle.est.jcajce.SSLSocketFactoryCreatorBuilder getHighSpeedVideoFpsRanges(javax.net.ssl.KeyManager keyManager) {
        this.Camera2StreamConfigurationMap = keyManager == null ? null : new javax.net.ssl.KeyManager[]{keyManager};
        return this;
    }

    public SSLSocketFactoryCreatorBuilder(javax.net.ssl.X509TrustManager[] x509TrustManagerArr) {
        if (x509TrustManagerArr == null) {
            throw new java.lang.NullPointerException("Trust managers can not be null");
        }
        this.getHighSpeedVideoSizes = x509TrustManagerArr;
    }

    public SSLSocketFactoryCreatorBuilder(javax.net.ssl.X509TrustManager x509TrustManager) {
        if (x509TrustManager == null) {
            throw new java.lang.NullPointerException("Trust managers can not be null");
        }
        this.getHighSpeedVideoSizes = new javax.net.ssl.X509TrustManager[]{x509TrustManager};
    }
}
