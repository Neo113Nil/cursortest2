package com.adobe.marketing.mobile;

/* loaded from: classes7.dex */
class EdgeHit {
    final org.json.JSONObject Camera2StreamConfigurationMap;
    final java.lang.String getHighResolutionOutputSizeshNQ4ISI = java.util.UUID.randomUUID().toString();
    final java.lang.String getHighSpeedVideoFpsRanges;
    final com.adobe.marketing.mobile.EdgeEndpoint getHighSpeedVideoSizes;

    EdgeHit(java.lang.String str, org.json.JSONObject jSONObject, com.adobe.marketing.mobile.EdgeEndpoint edgeEndpoint) {
        this.getHighSpeedVideoFpsRanges = str;
        this.Camera2StreamConfigurationMap = jSONObject;
        this.getHighSpeedVideoSizes = edgeEndpoint;
    }
}
