package com.adobe.marketing.mobile.internal.eventhub;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\u000b\u0082\u0001\u0002\f\r"}, d2 = {"Lcom/adobe/marketing/mobile/internal/eventhub/EventListenerContainer;", "", "<init>", "()V", "Lcom/adobe/marketing/mobile/Event;", "event", "", "notify", "(Lcom/adobe/marketing/mobile/Event;)V", "", "shouldNotify", "(Lcom/adobe/marketing/mobile/Event;)Z", "Lcom/adobe/marketing/mobile/internal/eventhub/ExtensionListenerContainer;", "Lcom/adobe/marketing/mobile/internal/eventhub/ResponseListenerContainer;"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public abstract class EventListenerContainer {
    public abstract void notify(com.adobe.marketing.mobile.Event event);

    public abstract boolean shouldNotify(com.adobe.marketing.mobile.Event event);

    private EventListenerContainer() {
    }

    public /* synthetic */ EventListenerContainer(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
