package org.bouncycastle.est.jcajce;

/* loaded from: classes17.dex */
class DefaultESTHttpClientProvider implements org.bouncycastle.est.ESTClientProvider {
    private final java.lang.Long Camera2StreamConfigurationMap;
    private final org.bouncycastle.est.jcajce.ChannelBindingProvider getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.Set<java.lang.String> getHighSpeedVideoFpsRanges;
    private final boolean getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.est.jcajce.JsseHostnameAuthorizer getHighSpeedVideoSizes;
    private final int getInputFormats;
    private final org.bouncycastle.est.jcajce.SSLSocketFactoryCreator getOutputFormats;

    @Override // org.bouncycastle.est.ESTClientProvider
    public org.bouncycastle.est.ESTClient makeClient() throws org.bouncycastle.est.ESTException {
        try {
            return new org.bouncycastle.est.jcajce.DefaultESTClient(new org.bouncycastle.est.jcajce.DefaultESTClientSourceProvider(this.getOutputFormats.createFactory(), this.getHighSpeedVideoSizes, this.getInputFormats, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor));
        } catch (java.lang.Exception e) {
            throw new org.bouncycastle.est.ESTException(e.getMessage(), e.getCause());
        }
    }

    @Override // org.bouncycastle.est.ESTClientProvider
    public boolean isTrusted() {
        return this.getOutputFormats.isTrusted();
    }

    public DefaultESTHttpClientProvider(org.bouncycastle.est.jcajce.JsseHostnameAuthorizer jsseHostnameAuthorizer, org.bouncycastle.est.jcajce.SSLSocketFactoryCreator sSLSocketFactoryCreator, int i, org.bouncycastle.est.jcajce.ChannelBindingProvider channelBindingProvider, java.util.Set<java.lang.String> set, java.lang.Long l, boolean z) {
        this.getHighSpeedVideoSizes = jsseHostnameAuthorizer;
        this.getOutputFormats = sSLSocketFactoryCreator;
        this.getInputFormats = i;
        this.getHighResolutionOutputSizeshNQ4ISI = channelBindingProvider;
        this.getHighSpeedVideoFpsRanges = set;
        this.Camera2StreamConfigurationMap = l;
        this.getHighSpeedVideoFpsRangesFor = z;
    }
}
