package com.adobe.marketing.mobile.messaging;

/* loaded from: classes7.dex */
class PropositionInteraction {
    private final com.adobe.marketing.mobile.MessagingEdgeEventType Camera2StreamConfigurationMap;
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private final com.adobe.marketing.mobile.messaging.PropositionInfo getHighSpeedVideoFpsRanges;
    private final java.util.List<java.lang.String> getHighSpeedVideoFpsRangesFor;
    private final java.lang.String getHighSpeedVideoSizes;

    PropositionInteraction(com.adobe.marketing.mobile.MessagingEdgeEventType messagingEdgeEventType, java.lang.String str, com.adobe.marketing.mobile.messaging.PropositionInfo propositionInfo, java.lang.String str2, java.util.List<java.lang.String> list) {
        this.Camera2StreamConfigurationMap = messagingEdgeEventType;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRanges = propositionInfo;
        this.getHighSpeedVideoSizes = str2;
        this.getHighSpeedVideoFpsRangesFor = list;
    }

    final java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoSizes() {
        java.util.Map<java.lang.String, java.lang.Object> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
        if (highResolutionOutputSizeshNQ4ISI == null) {
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "PropositionInteraction", "Unable to create proposition interaction data, proposition details were unable to be generated for this message.", new java.lang.Object[0]);
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(this.Camera2StreamConfigurationMap.getPropositionEventType(), 1);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("propositionEventType", hashMap);
        hashMap2.put("propositions", java.util.Collections.singletonList(highResolutionOutputSizeshNQ4ISI));
        return com.adobe.marketing.mobile.messaging.PropositionInteractionXdmUtils.getHighResolutionOutputSizeshNQ4ISI(hashMap2, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap);
    }

    final java.util.Map<java.lang.String, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI() {
        java.lang.Object obj;
        if (this.getHighSpeedVideoFpsRanges == null) {
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "PropositionInteraction", "Unable to create proposition details data, PropositionInfo was not found for this message.", new java.lang.Object[0]);
            return null;
        }
        if (this.Camera2StreamConfigurationMap == null) {
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "PropositionInteraction", "Unable to create proposition details data, MessagingEdgeEventType was not found for this message.", new java.lang.Object[0]);
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("id", this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges);
        hashMap.put(com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes);
        if (this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap == null) {
            obj = new java.util.HashMap();
        } else {
            obj = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap;
        }
        hashMap.put("scopeDetails", obj);
        if (!com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(this.getHighSpeedVideoSizes)) {
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("id", this.getHighSpeedVideoSizes);
            if (!com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor)) {
                java.util.HashMap hashMap3 = new java.util.HashMap();
                hashMap3.put("tokens", java.lang.String.join(",", this.getHighSpeedVideoFpsRangesFor));
                hashMap2.put("characteristics", hashMap3);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(hashMap2);
            hashMap.put("items", arrayList);
        }
        return hashMap;
    }
}
