package com.adobe.marketing.mobile;

/* loaded from: classes7.dex */
public class EventCoder {
    private EventCoder() {
    }

    public static com.adobe.marketing.mobile.Event decode(java.lang.String str) {
        if (str == null) {
            return null;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(jSONObject, "name");
            java.lang.String highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(jSONObject, com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Audience.UUID);
            java.lang.String highSpeedVideoFpsRanges3 = getHighSpeedVideoFpsRanges(jSONObject, "source");
            java.lang.String highSpeedVideoFpsRanges4 = getHighSpeedVideoFpsRanges(jSONObject, "type");
            java.util.Map<java.lang.String, java.lang.Object> map = com.adobe.marketing.mobile.util.JSONUtils.toMap(jSONObject.optJSONObject(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE));
            long optLong = jSONObject.optLong("timestamp", 0L);
            java.lang.String highSpeedVideoFpsRanges5 = getHighSpeedVideoFpsRanges(jSONObject, "responseId");
            java.lang.String highSpeedVideoFpsRanges6 = getHighSpeedVideoFpsRanges(jSONObject, "parentId");
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray(com.daon.sdk.face.license.License.FEATURE_MASK);
            com.adobe.marketing.mobile.Event.Builder builder = new com.adobe.marketing.mobile.Event.Builder(highSpeedVideoFpsRanges, highSpeedVideoFpsRanges4, highSpeedVideoFpsRanges3, optJSONArray != null ? (java.lang.String[]) com.adobe.marketing.mobile.util.JSONUtils.toList(optJSONArray).toArray(new java.lang.String[0]) : null);
            if (highSpeedVideoFpsRanges2 != null) {
                if (!builder.Camera2StreamConfigurationMap) {
                    builder.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDuration = highSpeedVideoFpsRanges2;
                } else {
                    throw new java.lang.UnsupportedOperationException("Event - attempted to call methods on Event.Builder after build() was called");
                }
            }
            if (!builder.Camera2StreamConfigurationMap) {
                builder.getHighSpeedVideoFpsRangesFor.getInputFormats = optLong;
                com.adobe.marketing.mobile.Event.Builder eventData = builder.setEventData(map);
                if (!eventData.Camera2StreamConfigurationMap) {
                    eventData.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap = highSpeedVideoFpsRanges5;
                    if (!eventData.Camera2StreamConfigurationMap) {
                        eventData.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI = highSpeedVideoFpsRanges6;
                        return eventData.build();
                    }
                    throw new java.lang.UnsupportedOperationException("Event - attempted to call methods on Event.Builder after build() was called");
                }
                throw new java.lang.UnsupportedOperationException("Event - attempted to call methods on Event.Builder after build() was called");
            }
            throw new java.lang.UnsupportedOperationException("Event - attempted to call methods on Event.Builder after build() was called");
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    public static java.lang.String encode(com.adobe.marketing.mobile.Event event) {
        if (event == null) {
            return null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("name", event.getName());
            jSONObject.put("type", event.getType());
            jSONObject.put("source", event.getSource());
            jSONObject.put(com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Audience.UUID, event.getUniqueIdentifier());
            jSONObject.put("timestamp", event.getTimestamp());
            jSONObject.put(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, org.json.JSONObject.wrap(event.getEventData()));
            jSONObject.put("responseId", event.getResponseID());
            jSONObject.put("parentId", event.getParentID());
            jSONObject.put(com.daon.sdk.face.license.License.FEATURE_MASK, org.json.JSONObject.wrap(event.getMask()));
            return jSONObject.toString();
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    private static java.lang.String getHighSpeedVideoFpsRanges(org.json.JSONObject jSONObject, java.lang.String str) {
        try {
            return jSONObject.getString(str);
        } catch (org.json.JSONException unused) {
            return null;
        }
    }
}
