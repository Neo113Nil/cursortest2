package org.bouncycastle.est.jcajce;

/* loaded from: classes17.dex */
class LimitedSSLSocketSource implements org.bouncycastle.est.Source<javax.net.ssl.SSLSession>, org.bouncycastle.est.TLSUniqueProvider, org.bouncycastle.est.LimitedSource {
    protected final javax.net.ssl.SSLSocket Camera2StreamConfigurationMap;
    private final org.bouncycastle.est.jcajce.ChannelBindingProvider getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.Long getHighSpeedVideoSizes;

    @Override // org.bouncycastle.est.Source
    public /* bridge */ /* synthetic */ javax.net.ssl.SSLSession getSession() {
        return this.Camera2StreamConfigurationMap.getSession();
    }

    @Override // org.bouncycastle.est.TLSUniqueProvider
    public boolean isTLSUniqueAvailable() {
        return this.getHighResolutionOutputSizeshNQ4ISI.canAccessChannelBinding(this.Camera2StreamConfigurationMap);
    }

    @Override // org.bouncycastle.est.TLSUniqueProvider
    public byte[] getTLSUnique() {
        if (isTLSUniqueAvailable()) {
            return this.getHighResolutionOutputSizeshNQ4ISI.getChannelBinding(this.Camera2StreamConfigurationMap, "tls-unique");
        }
        throw new java.lang.IllegalStateException("No binding provider.");
    }

    @Override // org.bouncycastle.est.Source
    public java.io.OutputStream getOutputStream() throws java.io.IOException {
        return this.Camera2StreamConfigurationMap.getOutputStream();
    }

    @Override // org.bouncycastle.est.Source
    public java.io.InputStream getInputStream() throws java.io.IOException {
        return this.Camera2StreamConfigurationMap.getInputStream();
    }

    @Override // org.bouncycastle.est.LimitedSource
    public java.lang.Long getAbsoluteReadLimit() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // org.bouncycastle.est.Source
    public void close() throws java.io.IOException {
        this.Camera2StreamConfigurationMap.close();
    }

    public LimitedSSLSocketSource(javax.net.ssl.SSLSocket sSLSocket, org.bouncycastle.est.jcajce.ChannelBindingProvider channelBindingProvider, java.lang.Long l) {
        this.Camera2StreamConfigurationMap = sSLSocket;
        this.getHighResolutionOutputSizeshNQ4ISI = channelBindingProvider;
        this.getHighSpeedVideoSizes = l;
    }
}
