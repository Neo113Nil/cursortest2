package com.adobe.marketing.mobile.util;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0007\"(\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0001*\u00020\u00008CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0017\u0010\b\u001a\u0004\u0018\u00010\u0002*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0017\u0010\n\u001a\u0004\u0018\u00010\u0002*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007"}, d2 = {"Lcom/adobe/marketing/mobile/Event;", "", "", "", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/adobe/marketing/mobile/Event;)Ljava/util/Map;", "getDebugEventSource", "(Lcom/adobe/marketing/mobile/Event;)Ljava/lang/String;", "debugEventSource", "getDebugEventType", "debugEventType"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class EventUtils {
    public static final java.lang.String getDebugEventType(com.adobe.marketing.mobile.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        java.util.Map<java.lang.String, java.lang.Object> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(event);
        java.lang.Object obj = highResolutionOutputSizeshNQ4ISI != null ? highResolutionOutputSizeshNQ4ISI.get("eventType") : null;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        return null;
    }

    public static final java.lang.String getDebugEventSource(com.adobe.marketing.mobile.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        java.util.Map<java.lang.String, java.lang.Object> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(event);
        java.lang.Object obj = highResolutionOutputSizeshNQ4ISI != null ? highResolutionOutputSizeshNQ4ISI.get("eventSource") : null;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        return null;
    }

    private static final java.util.Map<java.lang.String, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.Event event) {
        java.util.Map<java.lang.String, java.lang.Object> optTypedMap;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(event.getType(), com.adobe.marketing.mobile.EventType.SYSTEM) || !kotlin.jvm.internal.Intrinsics.areEqual(event.getSource(), com.adobe.marketing.mobile.EventSource.DEBUG) || event.getEventData() == null || (optTypedMap = com.adobe.marketing.mobile.util.DataReader.optTypedMap(java.lang.Object.class, event.getEventData(), com.datadog.android.rum.internal.domain.event.RumEventDeserializer.TELEMETRY_TYPE_DEBUG, null)) == null) {
            return null;
        }
        return optTypedMap;
    }
}
