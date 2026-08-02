package com.adobe.marketing.mobile.services;

/* loaded from: classes7.dex */
public class NetworkRequest {
    private final byte[] Camera2StreamConfigurationMap;
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    private final java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoFpsRangesFor;
    private final com.adobe.marketing.mobile.services.HttpMethod getHighSpeedVideoSizes;
    private final java.lang.String getOutputMinFrameDuration;

    public NetworkRequest(java.lang.String str, com.adobe.marketing.mobile.services.HttpMethod httpMethod, byte[] bArr, java.util.Map<java.lang.String, java.lang.String> map, int i, int i2) {
        this.getHighSpeedVideoSizes = httpMethod;
        this.Camera2StreamConfigurationMap = bArr;
        this.getOutputMinFrameDuration = str;
        this.getHighSpeedVideoFpsRangesFor = map;
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighResolutionOutputSizeshNQ4ISI = i2;
    }

    public java.lang.String getUrl() {
        return this.getOutputMinFrameDuration;
    }

    public com.adobe.marketing.mobile.services.HttpMethod getMethod() {
        return this.getHighSpeedVideoSizes;
    }

    public byte[] getBody() {
        return this.Camera2StreamConfigurationMap;
    }

    public java.util.Map<java.lang.String, java.lang.String> getHeaders() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public int getConnectTimeout() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public int getReadTimeout() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }
}
