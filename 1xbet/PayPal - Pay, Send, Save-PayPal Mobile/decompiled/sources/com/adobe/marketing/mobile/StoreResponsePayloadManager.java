package com.adobe.marketing.mobile;

/* loaded from: classes7.dex */
class StoreResponsePayloadManager {
    final com.adobe.marketing.mobile.services.NamedCollection Camera2StreamConfigurationMap;

    StoreResponsePayloadManager(com.adobe.marketing.mobile.services.NamedCollection namedCollection) {
        this.Camera2StreamConfigurationMap = namedCollection;
    }

    final java.util.Map<java.lang.String, com.adobe.marketing.mobile.StoreResponsePayload> getHighSpeedVideoFpsRanges() {
        com.adobe.marketing.mobile.services.NamedCollection namedCollection = this.Camera2StreamConfigurationMap;
        if (namedCollection == null) {
            com.adobe.marketing.mobile.services.Log.debug("Edge", "StoreResponsePayloadManager", "Cannot get active stores, dataStore is null.", new java.lang.Object[0]);
            return null;
        }
        java.util.Map<java.lang.String, java.lang.String> map = namedCollection.getMap("storePayloads");
        if (map == null) {
            com.adobe.marketing.mobile.services.Log.debug("Edge", "StoreResponsePayloadManager", "Cannot get active stores, serializedPayloads is null.", new java.lang.Object[0]);
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        java.util.Iterator<java.lang.String> it = map.values().iterator();
        while (it.hasNext()) {
            try {
                com.adobe.marketing.mobile.StoreResponsePayload highSpeedVideoFpsRanges = com.adobe.marketing.mobile.StoreResponsePayload.getHighSpeedVideoFpsRanges(new org.json.JSONObject(it.next()));
                if (highSpeedVideoFpsRanges != null) {
                    if (java.util.Calendar.getInstance().getTimeInMillis() >= highSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI) {
                        arrayList.add(highSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges);
                    } else {
                        hashMap.put(highSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges, highSpeedVideoFpsRanges);
                    }
                }
            } catch (org.json.JSONException e) {
                com.adobe.marketing.mobile.services.Log.debug("Edge", "StoreResponsePayloadManager", "Failed to convert JSON object to StoreResponsePayload: %s", e.getLocalizedMessage());
            }
        }
        getHighSpeedVideoFpsRanges(arrayList);
        return hashMap;
    }

    final void getHighSpeedVideoFpsRanges(java.util.ArrayList<java.lang.String> arrayList) {
        com.adobe.marketing.mobile.services.NamedCollection namedCollection = this.Camera2StreamConfigurationMap;
        if (namedCollection == null) {
            com.adobe.marketing.mobile.services.Log.debug("Edge", "StoreResponsePayloadManager", "Cannot delete stores, dataStore is null.", new java.lang.Object[0]);
            return;
        }
        java.util.Map<java.lang.String, java.lang.String> map = namedCollection.getMap("storePayloads");
        if (map == null) {
            com.adobe.marketing.mobile.services.Log.debug("Edge", "StoreResponsePayloadManager", "Cannot delete stores, data store is null.", new java.lang.Object[0]);
            return;
        }
        java.util.Iterator<java.lang.String> it = arrayList.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        this.Camera2StreamConfigurationMap.setMap("storePayloads", map);
    }
}
