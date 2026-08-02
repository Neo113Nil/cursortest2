package com.adobe.marketing.mobile.edge.identity;

/* loaded from: classes3.dex */
final class EventUtils {
    EventUtils() {
    }

    static boolean getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.Event event) {
        return event.getEventData().containsKey("advertisingidentifier");
    }

    static boolean getHighSpeedVideoFpsRanges(com.adobe.marketing.mobile.Event event) {
        return event != null && com.adobe.marketing.mobile.util.DataReader.optBoolean(event.getEventData(), "urlvariables", false);
    }

    static boolean getHighSpeedVideoFpsRangesFor(java.lang.String str, com.adobe.marketing.mobile.Event event) {
        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str) || event == null) {
            return false;
        }
        return str.equals(com.adobe.marketing.mobile.util.DataReader.optString(event.getEventData(), "stateowner", ""));
    }

    static java.lang.String getHighSpeedVideoSizes(com.adobe.marketing.mobile.Event event) {
        java.lang.String optString = com.adobe.marketing.mobile.util.DataReader.optString(event.getEventData(), "advertisingidentifier", null);
        return (optString == null || "00000000-0000-0000-0000-000000000000".equals(optString)) ? "" : optString;
    }

    static com.adobe.marketing.mobile.edge.identity.ECID Camera2StreamConfigurationMap(java.util.Map<java.lang.String, java.lang.Object> map) {
        java.lang.String optString = com.adobe.marketing.mobile.util.DataReader.optString(map, com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Identity.MID, null);
        if (optString == null) {
            return null;
        }
        return new com.adobe.marketing.mobile.edge.identity.ECID(optString);
    }

    static java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.util.Map<java.lang.String, java.lang.Object> map) {
        return com.adobe.marketing.mobile.util.DataReader.optString(map, com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Configuration.CONFIG_EXPERIENCE_CLOUD_ORG_ID, null);
    }
}
