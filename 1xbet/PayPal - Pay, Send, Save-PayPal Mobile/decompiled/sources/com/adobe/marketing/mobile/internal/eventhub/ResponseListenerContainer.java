package com.adobe.marketing.mobile.internal.eventhub;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0007¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/adobe/marketing/mobile/internal/eventhub/ResponseListenerContainer;", "Lcom/adobe/marketing/mobile/internal/eventhub/EventListenerContainer;", "", "triggerEventId", "Ljava/util/concurrent/ScheduledFuture;", "", "timeoutTask", "Lcom/adobe/marketing/mobile/AdobeCallbackWithError;", "Lcom/adobe/marketing/mobile/Event;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Ljava/lang/String;Ljava/util/concurrent/ScheduledFuture;Lcom/adobe/marketing/mobile/AdobeCallbackWithError;)V", "event", "notify", "(Lcom/adobe/marketing/mobile/Event;)V", "", "shouldNotify", "(Lcom/adobe/marketing/mobile/Event;)Z", "Lcom/adobe/marketing/mobile/AdobeCallbackWithError;", "getListener", "()Lcom/adobe/marketing/mobile/AdobeCallbackWithError;", "Ljava/util/concurrent/ScheduledFuture;", "getTimeoutTask", "()Ljava/util/concurrent/ScheduledFuture;", "Ljava/lang/String;", "getTriggerEventId", "()Ljava/lang/String;"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class ResponseListenerContainer extends com.adobe.marketing.mobile.internal.eventhub.EventListenerContainer {
    private final com.adobe.marketing.mobile.AdobeCallbackWithError<com.adobe.marketing.mobile.Event> listener;
    private final java.util.concurrent.ScheduledFuture<kotlin.Unit> timeoutTask;
    private final java.lang.String triggerEventId;

    public final java.lang.String getTriggerEventId() {
        return this.triggerEventId;
    }

    public final java.util.concurrent.ScheduledFuture<kotlin.Unit> getTimeoutTask() {
        return this.timeoutTask;
    }

    public final com.adobe.marketing.mobile.AdobeCallbackWithError<com.adobe.marketing.mobile.Event> getListener() {
        return this.listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResponseListenerContainer(java.lang.String str, java.util.concurrent.ScheduledFuture<kotlin.Unit> scheduledFuture, com.adobe.marketing.mobile.AdobeCallbackWithError<com.adobe.marketing.mobile.Event> adobeCallbackWithError) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adobeCallbackWithError, "");
        this.triggerEventId = str;
        this.timeoutTask = scheduledFuture;
        this.listener = adobeCallbackWithError;
    }

    @Override // com.adobe.marketing.mobile.internal.eventhub.EventListenerContainer
    public final boolean shouldNotify(com.adobe.marketing.mobile.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(event.getResponseID(), this.triggerEventId);
    }

    @Override // com.adobe.marketing.mobile.internal.eventhub.EventListenerContainer
    public final void notify(com.adobe.marketing.mobile.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        try {
            this.listener.call(event);
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Exception thrown for EventId ");
            sb.append(event.getUniqueIdentifier());
            sb.append(". ");
            sb.append(e);
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "ResponseListenerContainer", sb.toString(), new java.lang.Object[0]);
        }
    }
}
