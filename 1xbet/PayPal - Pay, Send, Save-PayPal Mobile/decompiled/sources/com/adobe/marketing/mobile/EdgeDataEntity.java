package com.adobe.marketing.mobile;

/* loaded from: classes7.dex */
final class EdgeDataEntity {
    final java.util.Map<java.lang.String, java.lang.Object> Camera2StreamConfigurationMap;
    final java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoFpsRangesFor;
    final com.adobe.marketing.mobile.Event getHighSpeedVideoSizes;

    EdgeDataEntity(com.adobe.marketing.mobile.Event event, java.util.Map<java.lang.String, java.lang.Object> map, java.util.Map<java.lang.String, java.lang.Object> map2) {
        if (event == null) {
            throw new java.lang.IllegalArgumentException();
        }
        this.getHighSpeedVideoSizes = event;
        this.getHighSpeedVideoFpsRangesFor = map == null ? java.util.Collections.emptyMap() : com.adobe.marketing.mobile.Utils.getHighSpeedVideoFpsRanges(map);
        this.Camera2StreamConfigurationMap = map2 == null ? java.util.Collections.emptyMap() : com.adobe.marketing.mobile.Utils.getHighSpeedVideoFpsRanges(map2);
    }

    EdgeDataEntity(com.adobe.marketing.mobile.Event event) {
        this(event, null, null);
    }

    final com.adobe.marketing.mobile.services.DataEntity getHighResolutionOutputSizeshNQ4ISI() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("event", new org.json.JSONObject(com.adobe.marketing.mobile.EventCoder.encode(this.getHighSpeedVideoSizes)));
            jSONObject.put(com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, new org.json.JSONObject(this.getHighSpeedVideoFpsRangesFor));
            jSONObject.put("identityMap", new org.json.JSONObject(this.Camera2StreamConfigurationMap));
            return new com.adobe.marketing.mobile.services.DataEntity(this.getHighSpeedVideoSizes.getUniqueIdentifier(), new java.util.Date(this.getHighSpeedVideoSizes.getTimestamp()), jSONObject.toString());
        } catch (org.json.JSONException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to serialize EdgeDataEntity to DataEntity: ");
            sb.append(e.getLocalizedMessage());
            com.adobe.marketing.mobile.services.Log.debug("Edge", "EdgeDataEntity", sb.toString(), new java.lang.Object[0]);
            return null;
        }
    }

    static com.adobe.marketing.mobile.EdgeDataEntity Camera2StreamConfigurationMap(com.adobe.marketing.mobile.services.DataEntity dataEntity) {
        java.lang.String data = dataEntity.getData();
        if (data != null && !data.isEmpty()) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(data);
                return new com.adobe.marketing.mobile.EdgeDataEntity(com.adobe.marketing.mobile.EventCoder.decode(jSONObject.getJSONObject("event").toString()), jSONObject.has(com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY) ? com.adobe.marketing.mobile.util.JSONUtils.toMap(jSONObject.getJSONObject(com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY)) : null, jSONObject.has("identityMap") ? com.adobe.marketing.mobile.util.JSONUtils.toMap(jSONObject.getJSONObject("identityMap")) : null);
            } catch (java.lang.IllegalArgumentException | org.json.JSONException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to deserialize DataEntity to EdgeDataEntity: ");
                sb.append(e.getLocalizedMessage());
                com.adobe.marketing.mobile.services.Log.debug("Edge", "EdgeDataEntity", sb.toString(), new java.lang.Object[0]);
            }
        }
        return null;
    }
}
