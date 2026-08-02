package com.adobe.marketing.mobile.internal.util;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/adobe/marketing/mobile/Event;", "", "from", androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO, "Lcom/adobe/marketing/mobile/EventHistoryRequest;", "toEventHistoryRequest", "(Lcom/adobe/marketing/mobile/Event;JJ)Lcom/adobe/marketing/mobile/EventHistoryRequest;"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class EventExtensionKt {
    public static /* synthetic */ com.adobe.marketing.mobile.EventHistoryRequest toEventHistoryRequest$default(com.adobe.marketing.mobile.Event event, long j, long j2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        if ((i & 2) != 0) {
            j2 = 0;
        }
        return toEventHistoryRequest(event, j, j2);
    }

    public static final com.adobe.marketing.mobile.EventHistoryRequest toEventHistoryRequest(com.adobe.marketing.mobile.Event event, long j, long j2) {
        java.util.Map emptyMap;
        java.util.Map map;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        java.util.Map<java.lang.String, java.lang.Object> eventData = event.getEventData();
        if (eventData == null || (emptyMap = com.adobe.marketing.mobile.internal.util.MapExtensionsKt.flattening$default(eventData, null, false, 3, null)) == null) {
            emptyMap = kotlin.collections.MapsKt.emptyMap();
        }
        if (event.getMask() != null) {
            java.lang.String[] mask = event.getMask();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mask, "");
            java.util.Set set = kotlin.collections.ArraysKt.toSet(mask);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.util.Map.Entry entry : emptyMap.entrySet()) {
                if (set.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            map = linkedHashMap;
        } else {
            map = emptyMap;
        }
        return new com.adobe.marketing.mobile.EventHistoryRequest(map, j, j2);
    }
}
