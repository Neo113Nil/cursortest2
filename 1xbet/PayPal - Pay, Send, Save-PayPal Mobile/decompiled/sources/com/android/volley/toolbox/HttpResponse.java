package com.android.volley.toolbox;

/* loaded from: classes3.dex */
public final class HttpResponse {
    private final java.util.List<com.android.volley.Header> Camera2StreamConfigurationMap;
    private final java.io.InputStream getHighResolutionOutputSizeshNQ4ISI;
    private final byte[] getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;

    public HttpResponse(int i, java.util.List<com.android.volley.Header> list) {
        this(i, list, -1, null);
    }

    public HttpResponse(int i, java.util.List<com.android.volley.Header> list, int i2, java.io.InputStream inputStream) {
        this.getHighSpeedVideoSizes = i;
        this.Camera2StreamConfigurationMap = list;
        this.getHighSpeedVideoFpsRangesFor = i2;
        this.getHighResolutionOutputSizeshNQ4ISI = inputStream;
        this.getHighSpeedVideoFpsRanges = null;
    }

    public HttpResponse(int i, java.util.List<com.android.volley.Header> list, byte[] bArr) {
        this.getHighSpeedVideoSizes = i;
        this.Camera2StreamConfigurationMap = list;
        this.getHighSpeedVideoFpsRangesFor = bArr.length;
        this.getHighSpeedVideoFpsRanges = bArr;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
    }

    public final int getStatusCode() {
        return this.getHighSpeedVideoSizes;
    }

    public final java.util.List<com.android.volley.Header> getHeaders() {
        return java.util.Collections.unmodifiableList(this.Camera2StreamConfigurationMap);
    }

    public final int getContentLength() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final byte[] getContentBytes() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final java.io.InputStream getContent() {
        java.io.InputStream inputStream = this.getHighResolutionOutputSizeshNQ4ISI;
        if (inputStream != null) {
            return inputStream;
        }
        if (this.getHighSpeedVideoFpsRanges != null) {
            return new java.io.ByteArrayInputStream(this.getHighSpeedVideoFpsRanges);
        }
        return null;
    }
}
