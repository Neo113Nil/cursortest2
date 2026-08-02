package com.adobe.marketing.mobile;

/* loaded from: classes7.dex */
class KonductorConfig {
    boolean Camera2StreamConfigurationMap = false;
    java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    java.lang.String getHighSpeedVideoFpsRanges;

    KonductorConfig() {
    }

    final void getHighSpeedVideoSizes(java.lang.String str, java.lang.String str2) {
        if (str == null || str2 == null) {
            throw new java.lang.IllegalArgumentException("Streaming record separator and line feed shall not be null.");
        }
        this.Camera2StreamConfigurationMap = true;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRanges = str2;
    }

    final java.util.Map<java.lang.String, java.lang.Object> Camera2StreamConfigurationMap() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("enabled", java.lang.Boolean.valueOf(this.Camera2StreamConfigurationMap));
        if (this.Camera2StreamConfigurationMap) {
            hashMap.put("recordSeparator", this.getHighResolutionOutputSizeshNQ4ISI);
            hashMap.put("lineFeed", this.getHighSpeedVideoFpsRanges);
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("streaming", hashMap);
        return hashMap2;
    }

    static com.adobe.marketing.mobile.KonductorConfig getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        org.json.JSONObject optJSONObject;
        org.json.JSONObject optJSONObject2;
        try {
            org.json.JSONObject optJSONObject3 = new org.json.JSONObject(str).optJSONObject(com.adjust.sdk.Constants.REFERRER_API_META);
            if (optJSONObject3 == null || (optJSONObject = optJSONObject3.optJSONObject("konductorConfig")) == null || (optJSONObject2 = optJSONObject.optJSONObject("streaming")) == null) {
                return null;
            }
            com.adobe.marketing.mobile.KonductorConfig konductorConfig = new com.adobe.marketing.mobile.KonductorConfig();
            konductorConfig.Camera2StreamConfigurationMap = optJSONObject2.optBoolean("enabled");
            konductorConfig.getHighResolutionOutputSizeshNQ4ISI = optJSONObject2.optString("recordSeparator");
            konductorConfig.getHighSpeedVideoFpsRanges = optJSONObject2.optString("lineFeed");
            return konductorConfig;
        } catch (java.lang.Exception unused) {
            com.adobe.marketing.mobile.services.Log.debug("Edge", "KonductorConfig", "Failed to read KonductorConfig from json request.", new java.lang.Object[0]);
            return null;
        }
    }
}
