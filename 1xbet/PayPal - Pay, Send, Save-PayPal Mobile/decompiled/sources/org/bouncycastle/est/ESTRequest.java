package org.bouncycastle.est;

/* loaded from: classes17.dex */
public class ESTRequest {
    final org.bouncycastle.est.ESTSourceConnectionListener Camera2StreamConfigurationMap;
    org.bouncycastle.est.HttpUtil.Headers getHighResolutionOutputSizeshNQ4ISI;
    final org.bouncycastle.est.ESTClient getHighSpeedVideoFpsRanges;
    final org.bouncycastle.est.ESTHijacker getHighSpeedVideoFpsRangesFor;
    final byte[] getHighSpeedVideoSizes;
    final java.net.URL getInputFormats;
    final java.lang.String getOutputMinFrameDuration;

    public void writeData(java.io.OutputStream outputStream) throws java.io.IOException {
        byte[] bArr = this.getHighSpeedVideoSizes;
        if (bArr != null) {
            outputStream.write(bArr);
        }
    }

    public java.net.URL getURL() {
        return this.getInputFormats;
    }

    public java.lang.String getMethod() {
        return this.getOutputMinFrameDuration;
    }

    public org.bouncycastle.est.ESTSourceConnectionListener getListener() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.est.ESTHijacker getHijacker() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public java.util.Map<java.lang.String, java.lang.String[]> getHeaders() {
        return (java.util.Map) this.getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public org.bouncycastle.est.ESTClient getClient() {
        return this.getHighSpeedVideoFpsRanges;
    }

    ESTRequest(java.lang.String str, java.net.URL url, byte[] bArr, org.bouncycastle.est.ESTHijacker eSTHijacker, org.bouncycastle.est.ESTSourceConnectionListener eSTSourceConnectionListener, org.bouncycastle.est.HttpUtil.Headers headers, org.bouncycastle.est.ESTClient eSTClient) {
        new org.bouncycastle.est.HttpUtil.Headers();
        this.getOutputMinFrameDuration = str;
        this.getInputFormats = url;
        this.getHighSpeedVideoSizes = bArr;
        this.getHighSpeedVideoFpsRangesFor = eSTHijacker;
        this.Camera2StreamConfigurationMap = eSTSourceConnectionListener;
        this.getHighResolutionOutputSizeshNQ4ISI = headers;
        this.getHighSpeedVideoFpsRanges = eSTClient;
    }
}
