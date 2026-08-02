package com.adobe.marketing.mobile.internal.eventhub;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/adobe/marketing/mobile/internal/eventhub/ExtensionListenerContainer;", "Lcom/adobe/marketing/mobile/internal/eventhub/EventListenerContainer;", "", "eventType", "eventSource", "Lcom/adobe/marketing/mobile/ExtensionEventListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/adobe/marketing/mobile/ExtensionEventListener;)V", "Lcom/adobe/marketing/mobile/Event;", "event", "", "notify", "(Lcom/adobe/marketing/mobile/Event;)V", "", "shouldNotify", "(Lcom/adobe/marketing/mobile/Event;)Z", "Ljava/lang/String;", "getEventSource", "()Ljava/lang/String;", "getEventType", "Lcom/adobe/marketing/mobile/ExtensionEventListener;", "getListener", "()Lcom/adobe/marketing/mobile/ExtensionEventListener;"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ExtensionListenerContainer extends com.adobe.marketing.mobile.internal.eventhub.EventListenerContainer {
    private final java.lang.String eventSource;
    private final java.lang.String eventType;
    private final com.adobe.marketing.mobile.ExtensionEventListener listener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExtensionListenerContainer(java.lang.String str, java.lang.String str2, com.adobe.marketing.mobile.ExtensionEventListener extensionEventListener) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extensionEventListener, "");
        this.eventType = str;
        this.eventSource = str2;
        this.listener = extensionEventListener;
    }

    public final java.lang.String getEventSource() {
        return this.eventSource;
    }

    public final java.lang.String getEventType() {
        return this.eventType;
    }

    public final com.adobe.marketing.mobile.ExtensionEventListener getListener() {
        return this.listener;
    }

    @Override // com.adobe.marketing.mobile.internal.eventhub.EventListenerContainer
    public final boolean shouldNotify(com.adobe.marketing.mobile.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        return event.getResponseID() != null ? kotlin.jvm.internal.Intrinsics.areEqual(this.eventType, com.adobe.marketing.mobile.EventType.WILDCARD) && kotlin.jvm.internal.Intrinsics.areEqual(this.eventSource, com.adobe.marketing.mobile.EventSource.WILDCARD) : (kotlin.text.StringsKt.equals(this.eventType, event.getType(), true) && kotlin.text.StringsKt.equals(this.eventSource, event.getSource(), true)) || (kotlin.jvm.internal.Intrinsics.areEqual(this.eventType, com.adobe.marketing.mobile.EventType.WILDCARD) && kotlin.jvm.internal.Intrinsics.areEqual(this.eventSource, com.adobe.marketing.mobile.EventSource.WILDCARD));
    }

    @Override // com.adobe.marketing.mobile.internal.eventhub.EventListenerContainer
    public final void notify(com.adobe.marketing.mobile.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        try {
            this.listener.hear(event);
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Exception thrown for EventId ");
            sb.append(event.getUniqueIdentifier());
            sb.append(". ");
            sb.append(e);
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "ExtensionListenerContainer", sb.toString(), new java.lang.Object[0]);
        }
    }
}
