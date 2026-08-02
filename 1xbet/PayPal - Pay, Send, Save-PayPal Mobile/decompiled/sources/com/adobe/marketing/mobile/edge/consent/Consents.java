package com.adobe.marketing.mobile.edge.consent;

/* loaded from: classes3.dex */
final class Consents {
    java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoFpsRangesFor;

    private Consents() {
        this.getHighSpeedVideoFpsRangesFor = new java.util.HashMap();
    }

    Consents(com.adobe.marketing.mobile.edge.consent.Consents consents) {
        this.getHighSpeedVideoFpsRangesFor = new java.util.HashMap();
        if (consents == null) {
            return;
        }
        this.getHighSpeedVideoFpsRangesFor = com.adobe.marketing.mobile.edge.consent.Utils.getHighResolutionOutputSizeshNQ4ISI(consents.getHighSpeedVideoFpsRangesFor, new java.util.HashMap());
    }

    Consents(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.getHighSpeedVideoFpsRangesFor = new java.util.HashMap();
        if (map == null || map.isEmpty()) {
            return;
        }
        this.getHighSpeedVideoFpsRangesFor = com.adobe.marketing.mobile.edge.consent.Utils.getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.util.DataReader.optTypedMap(java.lang.Object.class, map, "consents", new java.util.HashMap()), new java.util.HashMap());
    }

    private java.util.Map<java.lang.String, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI(java.util.Map<java.lang.String, java.lang.Object> map, java.util.Map<java.lang.String, java.lang.Object> map2) {
        if (map == null) {
            return map2;
        }
        if (map2 == null) {
            return map;
        }
        java.util.HashMap hashMap = new java.util.HashMap(map);
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : map2.entrySet()) {
            java.lang.String key = entry.getKey();
            java.lang.Object value = entry.getValue();
            java.lang.Object obj = hashMap.get(key);
            if ((obj instanceof java.util.Map) && (value instanceof java.util.Map)) {
                hashMap.put(key, getHighResolutionOutputSizeshNQ4ISI((java.util.Map) obj, (java.util.Map) value));
            } else {
                hashMap.put(key, value);
            }
        }
        return hashMap;
    }

    final java.util.Map<java.lang.String, java.lang.Object> Camera2StreamConfigurationMap() {
        java.util.Map<java.lang.String, java.lang.Object> highResolutionOutputSizeshNQ4ISI = com.adobe.marketing.mobile.edge.consent.Utils.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor, new java.util.HashMap());
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("consents", highResolutionOutputSizeshNQ4ISI);
        return hashMap;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.adobe.marketing.mobile.edge.consent.Consents)) {
            return false;
        }
        com.adobe.marketing.mobile.edge.consent.Consents consents = (com.adobe.marketing.mobile.edge.consent.Consents) obj;
        java.util.Map<java.lang.String, java.lang.Object> map = this.getHighSpeedVideoFpsRangesFor;
        if (map == null) {
            return consents.getHighSpeedVideoFpsRangesFor == null;
        }
        return map.equals(consents.getHighSpeedVideoFpsRangesFor);
    }

    final boolean getHighSpeedVideoSizes(com.adobe.marketing.mobile.edge.consent.Consents consents) {
        if (consents == null) {
            return false;
        }
        if (this == consents) {
            return true;
        }
        com.adobe.marketing.mobile.edge.consent.Consents consents2 = new com.adobe.marketing.mobile.edge.consent.Consents(this);
        com.adobe.marketing.mobile.edge.consent.Consents consents3 = new com.adobe.marketing.mobile.edge.consent.Consents(consents);
        consents2.getHighResolutionOutputSizeshNQ4ISI();
        consents3.getHighResolutionOutputSizeshNQ4ISI();
        return consents2.getHighSpeedVideoFpsRangesFor.equals(consents3.getHighSpeedVideoFpsRangesFor);
    }

    private void getHighResolutionOutputSizeshNQ4ISI() {
        java.util.Map optTypedMap = com.adobe.marketing.mobile.util.DataReader.optTypedMap(java.lang.Object.class, this.getHighSpeedVideoFpsRangesFor, "metadata", null);
        if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(optTypedMap)) {
            return;
        }
        optTypedMap.remove("time");
        if (optTypedMap.isEmpty()) {
            this.getHighSpeedVideoFpsRangesFor.remove("metadata");
        } else {
            this.getHighSpeedVideoFpsRangesFor.put("metadata", optTypedMap);
        }
    }

    final java.lang.String getHighSpeedVideoSizes() {
        if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(this.getHighSpeedVideoFpsRangesFor)) {
            return null;
        }
        java.util.Map optTypedMap = com.adobe.marketing.mobile.util.DataReader.optTypedMap(java.lang.Object.class, this.getHighSpeedVideoFpsRangesFor, "metadata", null);
        if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(optTypedMap)) {
            return null;
        }
        return com.adobe.marketing.mobile.util.DataReader.optString(optTypedMap, "time", null);
    }

    final void Camera2StreamConfigurationMap(com.adobe.marketing.mobile.edge.consent.Consents consents) {
        if (consents == null || com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(consents.getHighSpeedVideoFpsRangesFor)) {
            return;
        }
        java.util.Map<java.lang.String, java.lang.Object> highResolutionOutputSizeshNQ4ISI = com.adobe.marketing.mobile.edge.consent.Utils.getHighResolutionOutputSizeshNQ4ISI(consents.getHighSpeedVideoFpsRangesFor, new java.util.HashMap());
        if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(this.getHighSpeedVideoFpsRangesFor)) {
            this.getHighSpeedVideoFpsRangesFor = highResolutionOutputSizeshNQ4ISI;
        } else {
            this.getHighSpeedVideoFpsRangesFor = getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor, highResolutionOutputSizeshNQ4ISI);
        }
    }

    final void Camera2StreamConfigurationMap(long j) {
        if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(this.getHighSpeedVideoFpsRangesFor)) {
            return;
        }
        java.util.Map optTypedMap = com.adobe.marketing.mobile.util.DataReader.optTypedMap(java.lang.Object.class, this.getHighSpeedVideoFpsRangesFor, "metadata", null);
        if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(optTypedMap)) {
            optTypedMap = new java.util.HashMap();
        }
        optTypedMap.put("time", com.adobe.marketing.mobile.util.TimeUtils.getISO8601UTCDateWithMilliseconds(new java.util.Date(j)));
        this.getHighSpeedVideoFpsRangesFor.put("metadata", optTypedMap);
    }
}
