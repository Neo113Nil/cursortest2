package com.adobe.marketing.mobile.messaging;

/* loaded from: classes7.dex */
class PropositionInfo implements java.io.Serializable {
    final java.util.Map<java.lang.String, java.lang.Object> Camera2StreamConfigurationMap;
    final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final java.lang.String getHighSpeedVideoFpsRanges;
    final java.lang.String getHighSpeedVideoFpsRangesFor;
    final java.lang.String getHighSpeedVideoSizes;

    private PropositionInfo(java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.Object> map) {
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighSpeedVideoSizes = str2;
        this.Camera2StreamConfigurationMap = map;
        this.getHighSpeedVideoFpsRangesFor = com.adobe.marketing.mobile.util.DataReader.optString(map, "correlationID", "");
        java.util.Map optTypedMap = com.adobe.marketing.mobile.util.DataReader.optTypedMap(java.lang.Object.class, map, "activity", null);
        if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(optTypedMap)) {
            this.getHighResolutionOutputSizeshNQ4ISI = "";
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI = com.adobe.marketing.mobile.util.DataReader.optString(optTypedMap, "id", "");
        }
    }

    static com.adobe.marketing.mobile.messaging.PropositionInfo getHighSpeedVideoSizes(com.adobe.marketing.mobile.messaging.Proposition proposition) {
        if (proposition == null) {
            return null;
        }
        try {
            return new com.adobe.marketing.mobile.messaging.PropositionInfo(proposition.getUniqueId(), proposition.getScope(), proposition.getHighSpeedVideoFpsRanges);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
