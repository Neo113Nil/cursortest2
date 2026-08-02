package com.adobe.marketing.mobile.messaging;

/* loaded from: classes7.dex */
class PropositionInteractionBatcher {
    final java.lang.String getHighSpeedVideoFpsRanges = null;
    final com.adobe.marketing.mobile.MessagingEdgeEventType getHighSpeedVideoFpsRangesFor;
    final java.util.List<com.adobe.marketing.mobile.messaging.PropositionItem> getHighSpeedVideoSizes;

    PropositionInteractionBatcher(com.adobe.marketing.mobile.MessagingEdgeEventType messagingEdgeEventType, java.lang.String str, java.util.List<com.adobe.marketing.mobile.messaging.PropositionItem> list) {
        this.getHighSpeedVideoFpsRangesFor = messagingEdgeEventType;
        this.getHighSpeedVideoSizes = list;
    }

    static java.util.List<java.util.Map<java.lang.String, java.lang.Object>> getHighSpeedVideoSizes(java.util.List<com.adobe.marketing.mobile.messaging.PropositionInteraction> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<com.adobe.marketing.mobile.messaging.PropositionInteraction> it = list.iterator();
        while (it.hasNext()) {
            java.util.Map<java.lang.String, java.lang.Object> highResolutionOutputSizeshNQ4ISI = it.next().getHighResolutionOutputSizeshNQ4ISI();
            if (highResolutionOutputSizeshNQ4ISI == null) {
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "BatchedPropositionInteraction", "Invalid PropositionInteraction, unable to create proposition details.", new java.lang.Object[0]);
            } else {
                arrayList.add(highResolutionOutputSizeshNQ4ISI);
            }
        }
        return arrayList;
    }
}
