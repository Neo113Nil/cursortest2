package com.adobe.marketing.mobile;

/* loaded from: classes7.dex */
public class EdgeEventHandle {
    final int getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.List<java.util.Map<java.lang.String, java.lang.Object>> getHighSpeedVideoFpsRangesFor;
    private final java.lang.String getHighSpeedVideoSizes;

    EdgeEventHandle(org.json.JSONObject jSONObject) throws java.lang.IllegalArgumentException {
        if (jSONObject == null) {
            throw new java.lang.IllegalArgumentException("The Event handle cannot be null");
        }
        java.lang.String optString = jSONObject.optString("type");
        this.getHighSpeedVideoSizes = com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(optString) ? null : optString;
        this.getHighResolutionOutputSizeshNQ4ISI = jSONObject.optInt("eventIndex", 0);
        this.getHighSpeedVideoFpsRangesFor = com.adobe.marketing.mobile.Utils.getHighSpeedVideoFpsRanges(jSONObject.optJSONArray("payload"));
    }

    public java.lang.String getType() {
        return this.getHighSpeedVideoSizes;
    }

    public java.util.List<java.util.Map<java.lang.String, java.lang.Object>> getPayload() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    final java.util.Map<java.lang.String, java.lang.Object> Camera2StreamConfigurationMap() {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str = this.getHighSpeedVideoSizes;
        if (str != null) {
            hashMap.put("type", str);
        }
        java.util.List<java.util.Map<java.lang.String, java.lang.Object>> list = this.getHighSpeedVideoFpsRangesFor;
        if (list != null) {
            hashMap.put("payload", com.adobe.marketing.mobile.Utils.getHighSpeedVideoSizes(list));
        }
        return hashMap;
    }

    public java.lang.String toString() {
        return Camera2StreamConfigurationMap().toString();
    }
}
