package com.adobe.marketing.mobile.edge.identity;

/* loaded from: classes3.dex */
class IdentityState {
    com.adobe.marketing.mobile.edge.identity.IdentityProperties getHighResolutionOutputSizeshNQ4ISI;
    final com.adobe.marketing.mobile.edge.identity.IdentityStorageManager getHighSpeedVideoFpsRanges;
    boolean getHighSpeedVideoSizes;

    IdentityState() {
        this(new com.adobe.marketing.mobile.edge.identity.IdentityStorageManager(com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getDataStoreService()));
    }

    private IdentityState(com.adobe.marketing.mobile.edge.identity.IdentityStorageManager identityStorageManager) {
        this.getHighSpeedVideoFpsRanges = identityStorageManager;
        com.adobe.marketing.mobile.edge.identity.IdentityProperties highSpeedVideoFpsRangesFor = identityStorageManager.getHighSpeedVideoFpsRangesFor();
        this.getHighResolutionOutputSizeshNQ4ISI = highSpeedVideoFpsRangesFor == null ? new com.adobe.marketing.mobile.edge.identity.IdentityProperties() : highSpeedVideoFpsRangesFor;
    }

    static boolean getHighSpeedVideoSizes(java.util.Map<java.lang.String, java.lang.Object> map) {
        if (map == null) {
            return false;
        }
        return !com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(com.adobe.marketing.mobile.util.DataReader.optTypedMap(java.lang.Object.class, com.adobe.marketing.mobile.util.DataReader.optTypedMap(java.lang.Object.class, map, com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.EventDataKeys.EXTENSIONS, null), com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Identity.EXTENSION_NAME, null));
    }

    static java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoFpsRanges(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("val", str);
        hashMap.put("idType", "GAID");
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("adID", hashMap);
        java.util.HashMap hashMap3 = new java.util.HashMap();
        hashMap3.put("consents", hashMap2);
        return hashMap3;
    }
}
