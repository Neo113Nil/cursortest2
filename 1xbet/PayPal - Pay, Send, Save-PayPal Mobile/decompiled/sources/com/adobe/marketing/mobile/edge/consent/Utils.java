package com.adobe.marketing.mobile.edge.consent;

/* loaded from: classes3.dex */
final class Utils {
    private Utils() {
    }

    private static java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoFpsRangesFor(java.util.Map<java.lang.String, java.lang.Object> map) {
        try {
            return com.adobe.marketing.mobile.util.EventDataUtils.clone(map);
        } catch (com.adobe.marketing.mobile.util.CloneFailedException e) {
            com.adobe.marketing.mobile.services.Log.debug("Consent", "Utils", "Unable to deep copy map. CloneFailedException: %s", e.getLocalizedMessage());
            return null;
        }
    }

    static java.util.Map<java.lang.String, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI(java.util.Map<java.lang.String, java.lang.Object> map, java.util.Map<java.lang.String, java.lang.Object> map2) {
        java.util.Map<java.lang.String, java.lang.Object> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(map);
        return highSpeedVideoFpsRangesFor != null ? highSpeedVideoFpsRangesFor : map2;
    }
}
