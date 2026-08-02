package com.adobe.marketing.mobile;

/* loaded from: classes7.dex */
class RequestBuilder {
    static final java.util.Map<java.lang.String, java.lang.Object> Camera2StreamConfigurationMap;
    final com.adobe.marketing.mobile.StoreResponsePayloadManager getHighResolutionOutputSizeshNQ4ISI;
    java.lang.String getHighSpeedVideoFpsRanges;
    java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoFpsRangesFor;
    com.adobe.marketing.mobile.edge.SDKConfig getHighSpeedVideoSizes;
    final java.util.Map<java.lang.String, java.lang.Object> getInputSizeshNQ4ISI = new java.util.HashMap();
    java.lang.String getOutputFormats;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        Camera2StreamConfigurationMap = hashMap;
        hashMap.put(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "update");
    }

    RequestBuilder(com.adobe.marketing.mobile.services.NamedCollection namedCollection) {
        this.getHighResolutionOutputSizeshNQ4ISI = new com.adobe.marketing.mobile.StoreResponsePayloadManager(namedCollection);
    }

    final com.adobe.marketing.mobile.KonductorConfig getHighSpeedVideoFpsRangesFor() {
        java.lang.String str;
        com.adobe.marketing.mobile.KonductorConfig konductorConfig = new com.adobe.marketing.mobile.KonductorConfig();
        java.lang.String str2 = this.getOutputFormats;
        if (str2 != null && !str2.isEmpty() && (str = this.getHighSpeedVideoFpsRanges) != null && !str.isEmpty()) {
            konductorConfig.getHighSpeedVideoSizes(this.getOutputFormats, this.getHighSpeedVideoFpsRanges);
        }
        return konductorConfig;
    }

    static java.util.List<java.util.Map<java.lang.String, java.lang.Object>> getHighSpeedVideoFpsRanges(java.util.List<com.adobe.marketing.mobile.Event> list) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.adobe.marketing.mobile.Event event : list) {
            try {
                java.util.Map<java.lang.String, java.lang.Object> clone = com.adobe.marketing.mobile.util.EventDataUtils.clone(event.getEventData());
                if (!com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(clone)) {
                    java.lang.String str2 = (java.lang.String) clone.remove("datasetId");
                    if (str2 != null) {
                        java.lang.String trim = str2.trim();
                        if (!trim.isEmpty()) {
                            java.util.Map map = (java.util.Map) clone.get(com.adjust.sdk.Constants.REFERRER_API_META);
                            if (map == null) {
                                map = new java.util.HashMap();
                                clone.put(com.adjust.sdk.Constants.REFERRER_API_META, map);
                            }
                            java.util.HashMap hashMap = new java.util.HashMap();
                            hashMap.put("datasetId", trim);
                            map.put("collect", hashMap);
                        }
                    }
                    java.util.Map map2 = (java.util.Map) clone.get("xdm");
                    if (map2 == null) {
                        map2 = new java.util.HashMap();
                        clone.put("xdm", map2);
                    }
                    try {
                        str = com.adobe.marketing.mobile.util.DataReader.getString(map2, "timestamp");
                    } catch (com.adobe.marketing.mobile.util.DataReaderException unused) {
                        com.adobe.marketing.mobile.services.Log.debug("Edge", "RequestBuilder", "Unable to read the timestamp from the XDM payload due to unexpected format. Expected String.", new java.lang.Object[0]);
                        str = null;
                    }
                    if (str == null || str.isEmpty()) {
                        map2.put("timestamp", com.adobe.marketing.mobile.util.TimeUtils.getISO8601UTCDateWithMilliseconds(new java.util.Date(event.getTimestamp())));
                    }
                    java.util.Map map3 = (java.util.Map) clone.get("xdm");
                    if (map3 == null) {
                        map3 = new java.util.HashMap();
                        clone.put("xdm", map3);
                    }
                    map3.put("_id", event.getUniqueIdentifier());
                    if (clone.containsKey("request")) {
                        clone.remove("request");
                    }
                    if (clone.containsKey("config")) {
                        clone.remove("config");
                    }
                    arrayList.add(clone);
                }
            } catch (com.adobe.marketing.mobile.util.CloneFailedException e) {
                com.adobe.marketing.mobile.services.Log.warning("Edge", "RequestBuilder", "Failed to extract and clone data for an experience event (id: %s), skipping. Exception details: %s", event.getUniqueIdentifier(), e.getLocalizedMessage());
            }
        }
        return arrayList;
    }
}
