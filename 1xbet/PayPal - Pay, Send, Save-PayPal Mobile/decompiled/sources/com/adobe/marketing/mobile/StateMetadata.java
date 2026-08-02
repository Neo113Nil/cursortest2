package com.adobe.marketing.mobile;

/* loaded from: classes7.dex */
class StateMetadata {
    private final org.json.JSONObject Camera2StreamConfigurationMap = new org.json.JSONObject();

    StateMetadata(java.util.Map<java.lang.String, com.adobe.marketing.mobile.StoreResponsePayload> map) {
        if (map == null) {
            com.adobe.marketing.mobile.services.Log.debug("Edge", "StateMetadata", "Cannot init StateMetadata, payloadMap is null.", new java.lang.Object[0]);
            return;
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator<com.adobe.marketing.mobile.StoreResponsePayload> it = map.values().iterator();
        while (it.hasNext()) {
            org.json.JSONObject highSpeedVideoFpsRanges = it.next().getHighSpeedVideoFpsRanges();
            if (highSpeedVideoFpsRanges != null) {
                highSpeedVideoFpsRanges.remove(com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.ExpiryDate);
                jSONArray.put(highSpeedVideoFpsRanges);
            }
        }
        try {
            if (jSONArray.length() != 0) {
                this.Camera2StreamConfigurationMap.put("entries", jSONArray);
            }
        } catch (org.json.JSONException e) {
            com.adobe.marketing.mobile.services.Log.debug("Edge", "StateMetadata", "Could not add payload array to entries: %s", e.getLocalizedMessage());
        }
    }

    final java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoSizes() {
        try {
            return com.adobe.marketing.mobile.util.JSONUtils.toMap(this.Camera2StreamConfigurationMap);
        } catch (org.json.JSONException e) {
            com.adobe.marketing.mobile.services.Log.debug("Edge", "StateMetadata", "Unable to create Object map for StateMetadata due to JSONException: %s", e.getLocalizedMessage());
            return null;
        }
    }
}
