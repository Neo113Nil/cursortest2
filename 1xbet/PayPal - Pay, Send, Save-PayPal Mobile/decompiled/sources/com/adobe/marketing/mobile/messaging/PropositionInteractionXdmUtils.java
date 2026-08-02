package com.adobe.marketing.mobile.messaging;

/* loaded from: classes7.dex */
class PropositionInteractionXdmUtils {
    PropositionInteractionXdmUtils() {
    }

    static java.util.Map<java.lang.String, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI(java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String str, com.adobe.marketing.mobile.MessagingEdgeEventType messagingEdgeEventType) {
        if (!com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str)) {
            java.util.HashMap hashMap = new java.util.HashMap();
            if (messagingEdgeEventType == com.adobe.marketing.mobile.MessagingEdgeEventType.INTERACT) {
                hashMap.put("id", str);
                hashMap.put("label", str);
            } else if (messagingEdgeEventType == com.adobe.marketing.mobile.MessagingEdgeEventType.SUPPRESS_DISPLAY) {
                hashMap.put("reason", str);
            }
            if (!hashMap.isEmpty()) {
                map.put("propositionAction", hashMap);
            }
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("decisioning", map);
        java.util.HashMap hashMap3 = new java.util.HashMap();
        hashMap3.put("eventType", messagingEdgeEventType.toString());
        hashMap3.put("_experience", hashMap2);
        return hashMap3;
    }
}
