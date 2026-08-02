package com.adobe.marketing.mobile.internal.eventhub;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "event", "Lcom/adobe/marketing/mobile/Event;"}, k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
final class EventHub$dispatchJob$1 implements com.adobe.marketing.mobile.util.SerialWorkDispatcher.WorkHandler<com.adobe.marketing.mobile.Event> {
    final /* synthetic */ com.adobe.marketing.mobile.internal.eventhub.EventHub getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v8, types: [T, com.adobe.marketing.mobile.Event] */
    /* JADX WARN: Type inference failed for: r6v1, types: [T, com.adobe.marketing.mobile.Event, java.lang.Object] */
    @Override // com.adobe.marketing.mobile.util.SerialWorkDispatcher.WorkHandler
    public final /* synthetic */ boolean doWork(com.adobe.marketing.mobile.Event event) {
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        com.adobe.marketing.mobile.internal.eventhub.history.EventHistory eventHistory;
        com.adobe.marketing.mobile.Event event2 = event;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event2, "");
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        objectRef.element = event2;
        concurrentLinkedQueue = this.getHighSpeedVideoFpsRanges.getOutputMinFrameDuration;
        java.util.Iterator it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            objectRef.element = ((com.adobe.marketing.mobile.internal.eventhub.EventPreprocessor) it.next()).process((com.adobe.marketing.mobile.Event) objectRef.element);
        }
        if (((com.adobe.marketing.mobile.Event) objectRef.element).getResponseID() != null) {
            final java.util.Collection access$filterRemove = com.adobe.marketing.mobile.internal.eventhub.EventHubKt.access$filterRemove(this.getHighSpeedVideoFpsRanges.getResponseEventListeners$core_phoneRelease(), new kotlin.jvm.functions.Function1<com.adobe.marketing.mobile.internal.eventhub.ResponseListenerContainer, java.lang.Boolean>() { // from class: com.adobe.marketing.mobile.internal.eventhub.EventHub$dispatchJob$1$doWork$matchingResponseListeners$1
                @Override // kotlin.jvm.functions.Function1
                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                public final java.lang.Boolean invoke(com.adobe.marketing.mobile.internal.eventhub.ResponseListenerContainer responseListenerContainer) {
                    boolean z = false;
                    if (responseListenerContainer.shouldNotify(objectRef.element)) {
                        java.util.concurrent.ScheduledFuture<kotlin.Unit> timeoutTask = responseListenerContainer.getTimeoutTask();
                        if (timeoutTask != null) {
                            timeoutTask.cancel(false);
                        }
                        z = true;
                    }
                    return java.lang.Boolean.valueOf(z);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            });
            com.adobe.marketing.mobile.internal.eventhub.EventHub.access$executeCompletionHandler(this.getHighSpeedVideoFpsRanges, new java.lang.Runnable() { // from class: com.adobe.marketing.mobile.internal.eventhub.EventHub$dispatchJob$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.adobe.marketing.mobile.internal.eventhub.EventHub$dispatchJob$1.getHighSpeedVideoSizes(access$filterRemove, objectRef);
                }
            });
        }
        concurrentHashMap = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizesFor;
        java.util.Collection values = concurrentHashMap.values();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(values, "");
        java.util.Iterator it2 = values.iterator();
        while (it2.hasNext()) {
            ((com.adobe.marketing.mobile.internal.eventhub.ExtensionContainer) it2.next()).getEventProcessor().offer(objectRef.element);
        }
        if (com.adobe.marketing.mobile.services.Log.getLogLevel().compareTo(com.adobe.marketing.mobile.LoggingMode.DEBUG) >= 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Dispatched Event #");
            sb.append(com.adobe.marketing.mobile.internal.eventhub.EventHub.access$getEventNumber(this.getHighSpeedVideoFpsRanges, event2));
            sb.append(" to extensions after processing rules - (");
            sb.append(objectRef.element);
            sb.append(')');
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "EventHub", sb.toString(), new java.lang.Object[0]);
        }
        if (((com.adobe.marketing.mobile.Event) objectRef.element).getMask() == null || (eventHistory = this.getHighSpeedVideoFpsRanges.getEventHistory()) == null) {
            return true;
        }
        eventHistory.recordEvent((com.adobe.marketing.mobile.Event) objectRef.element, new com.adobe.marketing.mobile.AdobeCallbackWithError<java.lang.Boolean>() { // from class: com.adobe.marketing.mobile.internal.eventhub.EventHub$dispatchJob$1$doWork$3$1
            @Override // com.adobe.marketing.mobile.AdobeCallback
            public final /* synthetic */ void call(java.lang.Object obj) {
                call(((java.lang.Boolean) obj).booleanValue());
            }

            public final void call(boolean result) {
                if (result) {
                    return;
                }
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Failed to insert Event(");
                sb2.append(objectRef.element.getUniqueIdentifier());
                sb2.append(") into EventHistory database");
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "EventHub", sb2.toString(), new java.lang.Object[0]);
            }

            @Override // com.adobe.marketing.mobile.AdobeCallbackWithError
            public final void fail(com.adobe.marketing.mobile.AdobeError error) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Failed to insert Event(");
                sb2.append(objectRef.element.getUniqueIdentifier());
                sb2.append(") into EventHistory database with error ");
                sb2.append(error.getErrorName());
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "EventHub", sb2.toString(), new java.lang.Object[0]);
            }
        });
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getHighSpeedVideoSizes(java.util.Collection collection, kotlin.jvm.internal.Ref.ObjectRef objectRef) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objectRef, "");
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            ((com.adobe.marketing.mobile.internal.eventhub.ResponseListenerContainer) it.next()).notify((com.adobe.marketing.mobile.Event) objectRef.element);
        }
    }

    EventHub$dispatchJob$1(com.adobe.marketing.mobile.internal.eventhub.EventHub eventHub) {
        this.getHighSpeedVideoFpsRanges = eventHub;
    }
}
