package com.adobe.marketing.mobile;

/* loaded from: classes7.dex */
class NetworkResponseHandler {
    final com.adobe.marketing.mobile.services.NamedCollection Camera2StreamConfigurationMap;
    long getHighSpeedVideoFpsRangesFor;
    final com.adobe.marketing.mobile.EdgeStateCallback getHighSpeedVideoSizes;
    final java.lang.Object getHighSpeedVideoFpsRanges = new java.lang.Object();
    private final java.util.concurrent.ConcurrentMap<java.lang.String, java.util.List<com.adobe.marketing.mobile.Event>> getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.ConcurrentHashMap();

    NetworkResponseHandler(com.adobe.marketing.mobile.services.NamedCollection namedCollection, com.adobe.marketing.mobile.EdgeStateCallback edgeStateCallback) {
        this.getHighSpeedVideoSizes = edgeStateCallback;
        this.Camera2StreamConfigurationMap = namedCollection;
        this.getHighSpeedVideoFpsRangesFor = namedCollection != null ? namedCollection.getLong("resetIdentitiesDate", 0L) : 0L;
    }

    final void getHighSpeedVideoFpsRanges(java.lang.String str, java.util.List<com.adobe.marketing.mobile.Event> list) {
        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str) || list.isEmpty() || this.getHighResolutionOutputSizeshNQ4ISI.put(str, list) == null) {
            return;
        }
        com.adobe.marketing.mobile.services.Log.warning("Edge", "NetworkResponseHandler", "Name collision for requestId (%s), events list is overwritten.", str);
    }

    final java.util.List<com.adobe.marketing.mobile.Event> Camera2StreamConfigurationMap(java.lang.String str) {
        java.util.List<com.adobe.marketing.mobile.Event> remove;
        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str)) {
            return null;
        }
        synchronized (this.getHighSpeedVideoFpsRanges) {
            remove = this.getHighResolutionOutputSizeshNQ4ISI.remove(str);
        }
        return remove;
    }

    private java.util.List<java.lang.String> getHighSpeedVideoSizes(java.lang.String str) {
        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str)) {
            return java.util.Collections.emptyList();
        }
        synchronized (this.getHighSpeedVideoFpsRanges) {
            java.util.List<com.adobe.marketing.mobile.Event> list = this.getHighResolutionOutputSizeshNQ4ISI.get(str);
            if (list == null) {
                return java.util.Collections.emptyList();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<com.adobe.marketing.mobile.Event> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getUniqueIdentifier());
            }
            if (!list.isEmpty()) {
                return new java.util.ArrayList(arrayList);
            }
            return java.util.Collections.emptyList();
        }
    }

    static boolean getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.Event event) {
        return com.adobe.marketing.mobile.util.DataReader.optBoolean(com.adobe.marketing.mobile.util.DataReader.optTypedMap(java.lang.Object.class, event.getEventData(), "request", null), "sendCompletion", false);
    }

    static void getHighSpeedVideoFpsRangesFor(java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String str, boolean z, java.lang.String str2) {
        if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(map)) {
            return;
        }
        java.lang.String str3 = z ? com.adobe.marketing.mobile.EventSource.ERROR_RESPONSE_CONTENT : com.adobe.marketing.mobile.EventSource.RESPONSE_CONTENT;
        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str2)) {
            str2 = str3;
        }
        com.adobe.marketing.mobile.Event.Builder eventData = new com.adobe.marketing.mobile.Event.Builder(z ? "AEP Error Response" : "AEP Response Event Handle", com.adobe.marketing.mobile.EventType.EDGE, str2).setEventData(map);
        if (!eventData.Camera2StreamConfigurationMap) {
            eventData.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI = str;
            com.adobe.marketing.mobile.Event build = eventData.build();
            if (build.getParentID() == null) {
                com.adobe.marketing.mobile.services.Log.debug("Edge", "NetworkResponseHandler", "dispatchResponse - Parent Event is null, dispatching response event without chained parent.", new java.lang.Object[0]);
            }
            com.adobe.marketing.mobile.MobileCore.dispatchEvent(build);
            return;
        }
        throw new java.lang.UnsupportedOperationException("Event - attempted to call methods on Event.Builder after build() was called");
    }

    java.lang.String Camera2StreamConfigurationMap(int i, java.lang.String str) {
        java.util.List<java.lang.String> highSpeedVideoSizes = getHighSpeedVideoSizes(str);
        if (i < 0 || i >= highSpeedVideoSizes.size()) {
            return null;
        }
        return highSpeedVideoSizes.get(i);
    }

    static void getHighResolutionOutputSizeshNQ4ISI(java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String str, java.lang.String str2) {
        map.put("requestId", str);
        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(null)) {
            return;
        }
        map.put("requestEventId", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void getHighSpeedVideoFpsRangesFor(org.json.JSONArray jSONArray, boolean z, java.lang.String str) {
        org.json.JSONObject jSONObject;
        java.util.Map<java.lang.String, java.lang.Object> map;
        java.lang.String jSONObject2;
        java.util.Map map2;
        if (com.adobe.marketing.mobile.util.JSONUtils.isNullOrEmpty(jSONArray)) {
            com.adobe.marketing.mobile.services.Log.trace("Edge", "NetworkResponseHandler", "Received null/empty errors array, nothing to handle", new java.lang.Object[0]);
            return;
        }
        int length = jSONArray.length();
        com.adobe.marketing.mobile.services.Log.trace("Edge", "NetworkResponseHandler", "Processing %d error(s) for request id: %s", java.lang.Integer.valueOf(length), str);
        for (int i = 0; i < length; i++) {
            try {
                jSONObject = jSONArray.getJSONObject(i);
                try {
                    map = com.adobe.marketing.mobile.util.JSONUtils.toMap(jSONObject);
                } catch (org.json.JSONException e) {
                    e = e;
                    com.adobe.marketing.mobile.services.Log.trace("Edge", "NetworkResponseHandler", "Event error with index %d was not processed due to JSONException: %s", java.lang.Integer.valueOf(i), e.getLocalizedMessage());
                    map = null;
                    if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(map)) {
                    }
                }
            } catch (org.json.JSONException e2) {
                e = e2;
                jSONObject = null;
            }
            if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(map)) {
                java.lang.String Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(com.adobe.marketing.mobile.util.DataReader.optInt(com.adobe.marketing.mobile.util.DataReader.optTypedMap(java.lang.Object.class, map, "report", null), "eventIndex", 0), str);
                try {
                    jSONObject2 = jSONObject.toString(2);
                } catch (org.json.JSONException unused) {
                    jSONObject2 = jSONObject.toString();
                }
                if (z) {
                    com.adobe.marketing.mobile.services.Log.error("Edge", "NetworkResponseHandler", java.lang.String.format("Received event error for request id (%s), error details:\n %s", str, jSONObject2), new java.lang.Object[0]);
                } else {
                    com.adobe.marketing.mobile.services.Log.warning("Edge", "NetworkResponseHandler", java.lang.String.format("Received event error for request id (%s), error details:\n %s", str, jSONObject2), new java.lang.Object[0]);
                }
                try {
                    map2 = (java.util.Map) map.get("report");
                } catch (java.lang.ClassCastException unused2) {
                    com.adobe.marketing.mobile.services.Log.debug("Edge", "NetworkResponseHandler", "Failed to cast 'report' to Map<String, Object>", new java.lang.Object[0]);
                    map2 = null;
                }
                if (map2 != null) {
                    map2.remove("eventIndex");
                    if (map2.isEmpty()) {
                        map.remove("report");
                    }
                }
                map.put("requestId", str);
                if (!com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(Camera2StreamConfigurationMap)) {
                    map.put("requestEventId", Camera2StreamConfigurationMap);
                }
                getHighSpeedVideoFpsRangesFor(map, Camera2StreamConfigurationMap, true, null);
            }
        }
    }

    final boolean getHighSpeedVideoFpsRanges(java.lang.String str) {
        if (str == null) {
            return false;
        }
        synchronized (this.getHighSpeedVideoFpsRanges) {
            java.util.List<com.adobe.marketing.mobile.Event> list = this.getHighResolutionOutputSizeshNQ4ISI.get(str);
            if (list != null && !list.isEmpty()) {
                return list.get(0).getTimestamp() < this.getHighSpeedVideoFpsRangesFor;
            }
            return false;
        }
    }
}
