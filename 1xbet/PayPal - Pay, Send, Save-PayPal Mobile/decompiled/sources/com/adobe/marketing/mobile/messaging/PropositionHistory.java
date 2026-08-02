package com.adobe.marketing.mobile.messaging;

/* loaded from: classes7.dex */
final class PropositionHistory {
    private PropositionHistory() {
    }

    static void getHighSpeedVideoSizes(java.lang.String str, com.adobe.marketing.mobile.MessagingEdgeEventType messagingEdgeEventType, java.lang.String str2) {
        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str)) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "PropositionHistory", "Ignoring request to record PropositionHistory - activityId is empty.", new java.lang.Object[0]);
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("eventType", messagingEdgeEventType.getPropositionEventType());
        hashMap.put("id", str);
        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str2)) {
            str2 = "";
        }
        hashMap.put("action", str2);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("iam", hashMap);
        com.adobe.marketing.mobile.MobileCore.dispatchEvent(new com.adobe.marketing.mobile.Event.Builder("Write IAM event to history", com.adobe.marketing.mobile.EventType.MESSAGING, "com.adobe.eventSource.eventHistoryWrite", new java.lang.String[]{"iam.eventType", "iam.id", "iam.action"}).setEventData(hashMap2).build());
    }
}
