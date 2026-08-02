package com.adobe.marketing.mobile;

/* loaded from: classes7.dex */
final class EventUtils {
    EventUtils() {
    }

    static boolean getHighSpeedVideoSizes(com.adobe.marketing.mobile.Event event) {
        return com.adobe.marketing.mobile.EventType.EDGE.equalsIgnoreCase(event.getType()) && com.adobe.marketing.mobile.EventSource.REQUEST_CONTENT.equalsIgnoreCase(event.getSource());
    }

    static boolean getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.Event event) {
        return com.adobe.marketing.mobile.EventType.EDGE.equalsIgnoreCase(event.getType()) && com.adobe.marketing.mobile.EventSource.UPDATE_CONSENT.equalsIgnoreCase(event.getSource());
    }

    static boolean getHighSpeedVideoFpsRangesFor(com.adobe.marketing.mobile.Event event) {
        return com.adobe.marketing.mobile.EventType.EDGE_IDENTITY.equalsIgnoreCase(event.getType()) && com.adobe.marketing.mobile.EventSource.RESET_COMPLETE.equalsIgnoreCase(event.getSource());
    }

    static java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoFpsRangesFor(java.util.Map<java.lang.String, java.lang.Object> map) {
        java.lang.String[] strArr = {"edge.configId", "edge.environment", "edge.domain"};
        java.util.HashMap hashMap = new java.util.HashMap();
        for (int i = 0; i < 3; i++) {
            java.lang.String str = strArr[i];
            com.adobe.marketing.mobile.util.MapUtils.putIfNotEmpty(hashMap, str, com.adobe.marketing.mobile.util.DataReader.optString(map, str, null));
        }
        return hashMap;
    }

    static java.util.Map<java.lang.String, java.lang.Object> Camera2StreamConfigurationMap(com.adobe.marketing.mobile.Event event) {
        return com.adobe.marketing.mobile.util.DataReader.optTypedMap(java.lang.Object.class, event.getEventData(), "config", null);
    }
}
