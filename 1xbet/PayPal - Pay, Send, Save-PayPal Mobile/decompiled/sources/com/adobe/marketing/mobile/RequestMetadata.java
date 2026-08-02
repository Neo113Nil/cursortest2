package com.adobe.marketing.mobile;

/* loaded from: classes7.dex */
class RequestMetadata {
    private java.util.Map<java.lang.String, java.lang.Object> Camera2StreamConfigurationMap;
    private java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoFpsRanges;
    private java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoFpsRangesFor;
    private java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoSizes;

    /* synthetic */ RequestMetadata(byte b) {
        this();
    }

    private RequestMetadata() {
        this.Camera2StreamConfigurationMap = new java.util.HashMap();
        this.getHighSpeedVideoFpsRanges = new java.util.HashMap();
        this.getHighSpeedVideoFpsRangesFor = new java.util.HashMap();
        this.getHighSpeedVideoSizes = new java.util.HashMap();
    }

    final java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoFpsRangesFor() {
        java.util.HashMap hashMap = new java.util.HashMap();
        com.adobe.marketing.mobile.util.MapUtils.putIfNotEmpty(hashMap, "konductorConfig", this.Camera2StreamConfigurationMap);
        com.adobe.marketing.mobile.util.MapUtils.putIfNotEmpty(hashMap, "state", this.getHighSpeedVideoFpsRanges);
        com.adobe.marketing.mobile.util.MapUtils.putIfNotEmpty(hashMap, "sdkConfig", this.getHighSpeedVideoFpsRangesFor);
        com.adobe.marketing.mobile.util.MapUtils.putIfNotEmpty(hashMap, "configOverrides", this.getHighSpeedVideoSizes);
        return hashMap;
    }

    static class Builder {
        final com.adobe.marketing.mobile.RequestMetadata getHighSpeedVideoFpsRanges = new com.adobe.marketing.mobile.RequestMetadata(0);
        boolean getHighResolutionOutputSizeshNQ4ISI = false;

        Builder() {
        }

        final com.adobe.marketing.mobile.RequestMetadata.Builder getHighSpeedVideoFpsRangesFor(java.util.Map<java.lang.String, java.lang.Object> map) {
            if (!this.getHighResolutionOutputSizeshNQ4ISI) {
                this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap = map != null ? new java.util.HashMap(map) : new java.util.HashMap();
                return this;
            }
            throw new java.lang.UnsupportedOperationException("RequestMetadata.Builder - attempt to call setters after build() was called.");
        }
    }
}
