package com.adobe.marketing.mobile.messaging;

/* loaded from: classes7.dex */
public class Proposition implements java.io.Serializable {
    private final java.lang.String Camera2StreamConfigurationMap;
    final java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoFpsRanges;
    private final java.util.List<com.adobe.marketing.mobile.messaging.PropositionItem> getHighSpeedVideoFpsRangesFor;
    private final java.lang.String getHighSpeedVideoSizes;

    public Proposition(java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.Object> map, java.util.List<com.adobe.marketing.mobile.messaging.PropositionItem> list) throws com.adobe.marketing.mobile.messaging.MessageRequiredFieldMissingException {
        java.util.ArrayList<com.adobe.marketing.mobile.messaging.PropositionItem> arrayList = new java.util.ArrayList();
        this.getHighSpeedVideoFpsRangesFor = arrayList;
        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str) || com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str2) || com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(map) || list == null) {
            throw new com.adobe.marketing.mobile.messaging.MessageRequiredFieldMissingException("Id, scope or scope details is missing");
        }
        this.getHighSpeedVideoSizes = str;
        this.Camera2StreamConfigurationMap = str2;
        this.getHighSpeedVideoFpsRanges = map;
        arrayList.addAll(list);
        for (com.adobe.marketing.mobile.messaging.PropositionItem propositionItem : arrayList) {
            if (propositionItem.getHighResolutionOutputSizeshNQ4ISI == null) {
                propositionItem.getHighResolutionOutputSizeshNQ4ISI = new java.lang.ref.SoftReference<>(this);
            }
        }
    }

    public java.lang.String getUniqueId() {
        return this.getHighSpeedVideoSizes;
    }

    public java.util.List<com.adobe.marketing.mobile.messaging.PropositionItem> getItems() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public java.lang.String getScope() {
        return this.Camera2StreamConfigurationMap;
    }

    public static com.adobe.marketing.mobile.messaging.Proposition fromEventData(java.util.Map<java.lang.String, java.lang.Object> map) {
        try {
            java.lang.String string = com.adobe.marketing.mobile.util.DataReader.getString(map, "id");
            java.lang.String string2 = com.adobe.marketing.mobile.util.DataReader.getString(map, com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY);
            java.util.Map typedMap = com.adobe.marketing.mobile.util.DataReader.getTypedMap(java.lang.Object.class, map, "scopeDetails");
            java.util.List optTypedListOfMap = com.adobe.marketing.mobile.util.DataReader.optTypedListOfMap(java.lang.Object.class, map, "items", new java.util.ArrayList());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = optTypedListOfMap.iterator();
            while (it.hasNext()) {
                com.adobe.marketing.mobile.messaging.PropositionItem Camera2StreamConfigurationMap = com.adobe.marketing.mobile.messaging.PropositionItem.Camera2StreamConfigurationMap((java.util.Map) it.next());
                if (Camera2StreamConfigurationMap != null) {
                    arrayList.add(Camera2StreamConfigurationMap);
                }
            }
            return new com.adobe.marketing.mobile.messaging.Proposition(string, string2, typedMap, arrayList);
        } catch (com.adobe.marketing.mobile.messaging.MessageRequiredFieldMissingException | com.adobe.marketing.mobile.util.DataReaderException e) {
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "Proposition", "Exception occurred creating Proposition from event data map: %s", e.getLocalizedMessage());
            return null;
        }
    }

    public java.util.Map<java.lang.String, java.lang.Object> toEventData() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("id", this.getHighSpeedVideoSizes);
        hashMap.put(com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, this.Camera2StreamConfigurationMap);
        hashMap.put("scopeDetails", this.getHighSpeedVideoFpsRanges);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.adobe.marketing.mobile.messaging.PropositionItem propositionItem : this.getHighSpeedVideoFpsRangesFor) {
            java.util.HashMap hashMap2 = new java.util.HashMap();
            if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(propositionItem.getHighSpeedVideoSizes)) {
                com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "PropositionItem", "PropositionItem content is null or empty, cannot create event data map.", new java.lang.Object[0]);
            } else {
                hashMap2.put("id", propositionItem.getHighSpeedVideoFpsRanges);
                hashMap2.put("schema", propositionItem.Camera2StreamConfigurationMap.toString());
                hashMap2.put(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, propositionItem.getHighSpeedVideoSizes);
            }
            arrayList.add(hashMap2);
        }
        hashMap.put("items", arrayList);
        return hashMap;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.adobe.marketing.mobile.messaging.Proposition)) {
            return false;
        }
        com.adobe.marketing.mobile.messaging.Proposition proposition = (com.adobe.marketing.mobile.messaging.Proposition) obj;
        java.util.Map optTypedMap = com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(proposition.getHighSpeedVideoFpsRanges) ? null : com.adobe.marketing.mobile.util.DataReader.optTypedMap(java.lang.Object.class, proposition.getHighSpeedVideoFpsRanges, "activity", null);
        java.lang.String optString = com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(optTypedMap) ? "" : com.adobe.marketing.mobile.util.DataReader.optString(optTypedMap, "id", "");
        java.util.Map optTypedMap2 = com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(this.getHighSpeedVideoFpsRanges) ? null : com.adobe.marketing.mobile.util.DataReader.optTypedMap(java.lang.Object.class, this.getHighSpeedVideoFpsRanges, "activity", null);
        return optString.equals(com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(optTypedMap2) ? "" : com.adobe.marketing.mobile.util.DataReader.optString(optTypedMap2, "id", ""));
    }

    public int getPriority() {
        java.util.Map optTypedMap = com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(this.getHighSpeedVideoFpsRanges) ? null : com.adobe.marketing.mobile.util.DataReader.optTypedMap(java.lang.Object.class, this.getHighSpeedVideoFpsRanges, "activity", null);
        if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(optTypedMap)) {
            return 0;
        }
        return com.adobe.marketing.mobile.util.DataReader.optInt(optTypedMap, "priority", 0);
    }
}
