package org.bouncycastle.est.jcajce;

/* loaded from: classes17.dex */
public class JsseESTServiceBuilder extends org.bouncycastle.est.ESTServiceBuilder {
    protected java.lang.Long absoluteLimit;
    protected org.bouncycastle.est.jcajce.ChannelBindingProvider bindingProvider;
    protected boolean filterCipherSuites;
    protected org.bouncycastle.est.jcajce.JsseHostnameAuthorizer hostNameAuthorizer;
    protected org.bouncycastle.est.jcajce.SSLSocketFactoryCreator socketFactoryCreator;
    protected org.bouncycastle.est.jcajce.SSLSocketFactoryCreatorBuilder sslSocketFactoryCreatorBuilder;
    protected java.util.Set<java.lang.String> supportedSuites;
    protected int timeoutMillis;

    @Override // org.bouncycastle.est.ESTServiceBuilder
    public org.bouncycastle.est.ESTService build() {
        if (this.bindingProvider == null) {
            this.bindingProvider = new org.bouncycastle.est.jcajce.ChannelBindingProvider() { // from class: org.bouncycastle.est.jcajce.JsseESTServiceBuilder.1
                @Override // org.bouncycastle.est.jcajce.ChannelBindingProvider
                public boolean canAccessChannelBinding(java.net.Socket socket) {
                    return false;
                }

                @Override // org.bouncycastle.est.jcajce.ChannelBindingProvider
                public byte[] getChannelBinding(java.net.Socket socket, java.lang.String str) {
                    return null;
                }
            };
        }
        if (this.socketFactoryCreator == null) {
            this.socketFactoryCreator = new org.bouncycastle.est.jcajce.SSLSocketFactoryCreator() { // from class: org.bouncycastle.est.jcajce.SSLSocketFactoryCreatorBuilder.1
                @Override // org.bouncycastle.est.jcajce.SSLSocketFactoryCreator
                public boolean isTrusted() {
                    for (int i = 0; i != org.bouncycastle.est.jcajce.SSLSocketFactoryCreatorBuilder.this.getHighSpeedVideoSizes.length; i++) {
                        if (org.bouncycastle.est.jcajce.SSLSocketFactoryCreatorBuilder.this.getHighSpeedVideoSizes[i].getAcceptedIssuers().length > 0) {
                            return true;
                        }
                    }
                    return false;
                }

                @Override // org.bouncycastle.est.jcajce.SSLSocketFactoryCreator
                public javax.net.ssl.SSLSocketFactory createFactory() throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.KeyManagementException {
                    javax.net.ssl.SSLContext sSLContext = org.bouncycastle.est.jcajce.SSLSocketFactoryCreatorBuilder.this.getHighSpeedVideoFpsRanges != null ? javax.net.ssl.SSLContext.getInstance(org.bouncycastle.est.jcajce.SSLSocketFactoryCreatorBuilder.this.getHighResolutionOutputSizeshNQ4ISI, org.bouncycastle.est.jcajce.SSLSocketFactoryCreatorBuilder.this.getHighSpeedVideoFpsRanges) : javax.net.ssl.SSLContext.getInstance(org.bouncycastle.est.jcajce.SSLSocketFactoryCreatorBuilder.this.getHighResolutionOutputSizeshNQ4ISI);
                    sSLContext.init(org.bouncycastle.est.jcajce.SSLSocketFactoryCreatorBuilder.this.Camera2StreamConfigurationMap, org.bouncycastle.est.jcajce.SSLSocketFactoryCreatorBuilder.this.getHighSpeedVideoSizes, org.bouncycastle.est.jcajce.SSLSocketFactoryCreatorBuilder.this.getHighSpeedVideoFpsRangesFor);
                    return sSLContext.getSocketFactory();
                }

                AnonymousClass1() {
                }
            };
        }
        if (this.clientProvider == null) {
            this.clientProvider = new org.bouncycastle.est.jcajce.DefaultESTHttpClientProvider(this.hostNameAuthorizer, this.socketFactoryCreator, this.timeoutMillis, this.bindingProvider, this.supportedSuites, this.absoluteLimit, this.filterCipherSuites);
        }
        return super.build();
    }

    public org.bouncycastle.est.jcajce.JsseESTServiceBuilder withTimeout(int i) {
        this.timeoutMillis = i;
        return this;
    }

    public org.bouncycastle.est.jcajce.JsseESTServiceBuilder withTLSVersion(java.lang.String str) {
        if (this.socketFactoryCreator != null) {
            throw new java.lang.IllegalStateException("Socket Factory Creator was defined in the constructor.");
        }
        this.sslSocketFactoryCreatorBuilder.getHighResolutionOutputSizeshNQ4ISI(str);
        return this;
    }

    public org.bouncycastle.est.jcajce.JsseESTServiceBuilder withSecureRandom(java.security.SecureRandom secureRandom) {
        if (this.socketFactoryCreator != null) {
            throw new java.lang.IllegalStateException("Socket Factory Creator was defined in the constructor.");
        }
        this.sslSocketFactoryCreatorBuilder.getHighResolutionOutputSizeshNQ4ISI(secureRandom);
        return this;
    }

    public org.bouncycastle.est.jcajce.JsseESTServiceBuilder withReadLimit(long j) {
        this.absoluteLimit = java.lang.Long.valueOf(j);
        return this;
    }

    public org.bouncycastle.est.jcajce.JsseESTServiceBuilder withProvider(java.security.Provider provider) {
        if (this.socketFactoryCreator != null) {
            throw new java.lang.IllegalStateException("Socket Factory Creator was defined in the constructor.");
        }
        this.sslSocketFactoryCreatorBuilder.getHighSpeedVideoFpsRanges(provider);
        return this;
    }

    public org.bouncycastle.est.jcajce.JsseESTServiceBuilder withProvider(java.lang.String str) throws java.security.NoSuchProviderException {
        if (this.socketFactoryCreator != null) {
            throw new java.lang.IllegalStateException("Socket Factory Creator was defined in the constructor.");
        }
        this.sslSocketFactoryCreatorBuilder.getHighSpeedVideoFpsRanges(str);
        return this;
    }

    public org.bouncycastle.est.jcajce.JsseESTServiceBuilder withKeyManagers(javax.net.ssl.KeyManager[] keyManagerArr) {
        if (this.socketFactoryCreator != null) {
            throw new java.lang.IllegalStateException("Socket Factory Creator was defined in the constructor.");
        }
        this.sslSocketFactoryCreatorBuilder.Camera2StreamConfigurationMap(keyManagerArr);
        return this;
    }

    public org.bouncycastle.est.jcajce.JsseESTServiceBuilder withKeyManager(javax.net.ssl.KeyManager keyManager) {
        if (this.socketFactoryCreator != null) {
            throw new java.lang.IllegalStateException("Socket Factory Creator was defined in the constructor.");
        }
        this.sslSocketFactoryCreatorBuilder.getHighSpeedVideoFpsRanges(keyManager);
        return this;
    }

    public org.bouncycastle.est.jcajce.JsseESTServiceBuilder withHostNameAuthorizer(org.bouncycastle.est.jcajce.JsseHostnameAuthorizer jsseHostnameAuthorizer) {
        this.hostNameAuthorizer = jsseHostnameAuthorizer;
        return this;
    }

    public org.bouncycastle.est.jcajce.JsseESTServiceBuilder withFilterCipherSuites(boolean z) {
        this.filterCipherSuites = z;
        return this;
    }

    @Override // org.bouncycastle.est.ESTServiceBuilder
    public org.bouncycastle.est.jcajce.JsseESTServiceBuilder withClientProvider(org.bouncycastle.est.ESTClientProvider eSTClientProvider) {
        this.clientProvider = eSTClientProvider;
        return this;
    }

    public org.bouncycastle.est.jcajce.JsseESTServiceBuilder withChannelBindingProvider(org.bouncycastle.est.jcajce.ChannelBindingProvider channelBindingProvider) {
        this.bindingProvider = channelBindingProvider;
        return this;
    }

    public org.bouncycastle.est.jcajce.JsseESTServiceBuilder addCipherSuites(java.lang.String[] strArr) {
        this.supportedSuites.addAll(java.util.Arrays.asList(strArr));
        return this;
    }

    public org.bouncycastle.est.jcajce.JsseESTServiceBuilder addCipherSuites(java.lang.String str) {
        this.supportedSuites.add(str);
        return this;
    }

    public JsseESTServiceBuilder(java.lang.String str, javax.net.ssl.X509TrustManager[] x509TrustManagerArr) {
        super(str);
        this.hostNameAuthorizer = new org.bouncycastle.est.jcajce.JsseDefaultHostnameAuthorizer(null);
        this.timeoutMillis = 0;
        this.supportedSuites = new java.util.HashSet();
        this.filterCipherSuites = true;
        this.sslSocketFactoryCreatorBuilder = new org.bouncycastle.est.jcajce.SSLSocketFactoryCreatorBuilder(x509TrustManagerArr);
    }

    public JsseESTServiceBuilder(java.lang.String str, org.bouncycastle.est.jcajce.SSLSocketFactoryCreator sSLSocketFactoryCreator) {
        super(str);
        this.hostNameAuthorizer = new org.bouncycastle.est.jcajce.JsseDefaultHostnameAuthorizer(null);
        this.timeoutMillis = 0;
        this.supportedSuites = new java.util.HashSet();
        this.filterCipherSuites = true;
        if (sSLSocketFactoryCreator == null) {
            throw new java.lang.NullPointerException("No socket factory creator.");
        }
        this.socketFactoryCreator = sSLSocketFactoryCreator;
    }

    public JsseESTServiceBuilder(java.lang.String str, javax.net.ssl.X509TrustManager x509TrustManager) {
        super(str);
        this.hostNameAuthorizer = new org.bouncycastle.est.jcajce.JsseDefaultHostnameAuthorizer(null);
        this.timeoutMillis = 0;
        this.supportedSuites = new java.util.HashSet();
        this.filterCipherSuites = true;
        this.sslSocketFactoryCreatorBuilder = new org.bouncycastle.est.jcajce.SSLSocketFactoryCreatorBuilder(x509TrustManager);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JsseESTServiceBuilder(java.lang.String str, int i, javax.net.ssl.X509TrustManager[] x509TrustManagerArr) {
        this(r0.toString(), x509TrustManagerArr);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(io.ktor.sse.ServerSentEventKt.COLON);
        sb.append(i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JsseESTServiceBuilder(java.lang.String str, int i, org.bouncycastle.est.jcajce.SSLSocketFactoryCreator sSLSocketFactoryCreator) {
        super(r0.toString());
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(io.ktor.sse.ServerSentEventKt.COLON);
        sb.append(i);
        this.hostNameAuthorizer = new org.bouncycastle.est.jcajce.JsseDefaultHostnameAuthorizer(null);
        this.timeoutMillis = 0;
        this.supportedSuites = new java.util.HashSet();
        this.filterCipherSuites = true;
        if (sSLSocketFactoryCreator == null) {
            throw new java.lang.NullPointerException("No socket factory creator.");
        }
        this.socketFactoryCreator = sSLSocketFactoryCreator;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JsseESTServiceBuilder(java.lang.String str, int i, javax.net.ssl.X509TrustManager x509TrustManager) {
        super(r0.toString());
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(io.ktor.sse.ServerSentEventKt.COLON);
        sb.append(i);
        this.hostNameAuthorizer = new org.bouncycastle.est.jcajce.JsseDefaultHostnameAuthorizer(null);
        this.timeoutMillis = 0;
        this.supportedSuites = new java.util.HashSet();
        this.filterCipherSuites = true;
        this.sslSocketFactoryCreatorBuilder = new org.bouncycastle.est.jcajce.SSLSocketFactoryCreatorBuilder(x509TrustManager);
    }

    public JsseESTServiceBuilder(java.lang.String str) {
        super(str);
        this.hostNameAuthorizer = new org.bouncycastle.est.jcajce.JsseDefaultHostnameAuthorizer(null);
        this.timeoutMillis = 0;
        this.supportedSuites = new java.util.HashSet();
        this.filterCipherSuites = true;
        this.sslSocketFactoryCreatorBuilder = new org.bouncycastle.est.jcajce.SSLSocketFactoryCreatorBuilder(org.bouncycastle.est.jcajce.JcaJceUtils.getTrustAllTrustManager());
    }
}
