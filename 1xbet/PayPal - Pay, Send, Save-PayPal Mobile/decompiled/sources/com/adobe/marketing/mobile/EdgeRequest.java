package com.adobe.marketing.mobile;

/* loaded from: classes7.dex */
class EdgeRequest {
    java.util.Map<java.lang.String, java.lang.Object> Camera2StreamConfigurationMap;
    com.adobe.marketing.mobile.RequestMetadata getHighSpeedVideoFpsRangesFor;

    EdgeRequest() {
    }

    final org.json.JSONObject Camera2StreamConfigurationMap(java.util.List<java.util.Map<java.lang.String, java.lang.Object>> list) {
        if (list == null || list.isEmpty()) {
            com.adobe.marketing.mobile.services.Log.warning("Edge", "EdgeRequest", "Unable to create Edge Request with no Events.", new java.lang.Object[0]);
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        com.adobe.marketing.mobile.util.MapUtils.putIfNotEmpty(hashMap, "xdm", this.Camera2StreamConfigurationMap);
        hashMap.put("events", list);
        com.adobe.marketing.mobile.RequestMetadata requestMetadata = this.getHighSpeedVideoFpsRangesFor;
        if (requestMetadata != null) {
            com.adobe.marketing.mobile.util.MapUtils.putIfNotEmpty(hashMap, com.adjust.sdk.Constants.REFERRER_API_META, requestMetadata.getHighSpeedVideoFpsRangesFor());
        }
        try {
            return new org.json.JSONObject(hashMap);
        } catch (java.lang.NullPointerException e) {
            com.adobe.marketing.mobile.services.Log.warning("Edge", "EdgeRequest", "Unable to create Edge Request with null keys: %s", e.getLocalizedMessage());
            return null;
        }
    }
}
