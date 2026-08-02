package org.bouncycastle.est;

/* loaded from: classes17.dex */
public class ESTRequestBuilder {
    private byte[] Camera2StreamConfigurationMap;
    org.bouncycastle.est.ESTHijacker getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.est.HttpUtil.Headers getHighSpeedVideoFpsRanges;
    org.bouncycastle.est.ESTSourceConnectionListener getHighSpeedVideoFpsRangesFor;
    org.bouncycastle.est.ESTClient getHighSpeedVideoSizes;
    private java.net.URL getInputSizeshNQ4ISI;
    private final java.lang.String getOutputFormats;

    public org.bouncycastle.est.ESTRequestBuilder addHeader(java.lang.String str, java.lang.String str2) {
        org.bouncycastle.est.HttpUtil.Headers headers = this.getHighSpeedVideoFpsRanges;
        headers.put(str, org.bouncycastle.est.HttpUtil.Camera2StreamConfigurationMap(headers.get(str), str2));
        return this;
    }

    public org.bouncycastle.est.ESTRequestBuilder setHeader(java.lang.String str, java.lang.String str2) {
        this.getHighSpeedVideoFpsRanges.put(str, new java.lang.String[]{str2});
        return this;
    }

    public org.bouncycastle.est.ESTRequestBuilder withURL(java.net.URL url) {
        this.getInputSizeshNQ4ISI = url;
        return this;
    }

    public org.bouncycastle.est.ESTRequestBuilder withHijacker(org.bouncycastle.est.ESTHijacker eSTHijacker) {
        this.getHighResolutionOutputSizeshNQ4ISI = eSTHijacker;
        return this;
    }

    public org.bouncycastle.est.ESTRequestBuilder withData(byte[] bArr) {
        this.Camera2StreamConfigurationMap = org.bouncycastle.util.Arrays.clone(bArr);
        return this;
    }

    public org.bouncycastle.est.ESTRequestBuilder withConnectionListener(org.bouncycastle.est.ESTSourceConnectionListener eSTSourceConnectionListener) {
        this.getHighSpeedVideoFpsRangesFor = eSTSourceConnectionListener;
        return this;
    }

    public org.bouncycastle.est.ESTRequestBuilder withClient(org.bouncycastle.est.ESTClient eSTClient) {
        this.getHighSpeedVideoSizes = eSTClient;
        return this;
    }

    public org.bouncycastle.est.ESTRequest build() {
        return new org.bouncycastle.est.ESTRequest(this.getOutputFormats, this.getInputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes);
    }

    public ESTRequestBuilder(org.bouncycastle.est.ESTRequest eSTRequest) {
        this.getOutputFormats = eSTRequest.getOutputMinFrameDuration;
        this.getInputSizeshNQ4ISI = eSTRequest.getInputFormats;
        this.getHighSpeedVideoFpsRangesFor = eSTRequest.Camera2StreamConfigurationMap;
        this.Camera2StreamConfigurationMap = eSTRequest.getHighSpeedVideoSizes;
        this.getHighResolutionOutputSizeshNQ4ISI = eSTRequest.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRanges = (org.bouncycastle.est.HttpUtil.Headers) eSTRequest.getHighResolutionOutputSizeshNQ4ISI.clone();
        this.getHighSpeedVideoSizes = eSTRequest.getClient();
    }

    public ESTRequestBuilder(java.lang.String str, java.net.URL url) {
        this.getOutputFormats = str;
        this.getInputSizeshNQ4ISI = url;
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.est.HttpUtil.Headers();
    }
}
