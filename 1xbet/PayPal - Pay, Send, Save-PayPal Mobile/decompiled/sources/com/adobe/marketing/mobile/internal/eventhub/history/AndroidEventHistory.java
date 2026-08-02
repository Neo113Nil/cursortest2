package com.adobe.marketing.mobile.internal.eventhub.history;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\n2\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00042\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ;\u0010\u0010\u001a\u00020\n2\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J5\u0010\u0016\u001a\u00020\n\"\u0004\b\u0000\u0010\u00122\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00072\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0019\u0010\"\u001a\u0006*\u00020 0 8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u0016\u0010!"}, d2 = {"Lcom/adobe/marketing/mobile/internal/eventhub/history/AndroidEventHistory;", "Lcom/adobe/marketing/mobile/internal/eventhub/history/EventHistory;", "<init>", "()V", "", "Lcom/adobe/marketing/mobile/EventHistoryRequest;", "eventHistoryRequests", "Lcom/adobe/marketing/mobile/AdobeCallbackWithError;", "", com.sun.jna.Callback.METHOD_NAME, "", "deleteEvents", "([Lcom/adobe/marketing/mobile/EventHistoryRequest;Lcom/adobe/marketing/mobile/AdobeCallbackWithError;)V", "", "enforceOrder", "Lcom/adobe/marketing/mobile/EventHistoryResult;", "getEvents", "([Lcom/adobe/marketing/mobile/EventHistoryRequest;ZLcom/adobe/marketing/mobile/AdobeCallbackWithError;)V", "T", "p0", "p1", "p2", "getHighSpeedVideoFpsRanges", "(Lcom/adobe/marketing/mobile/AdobeCallbackWithError;Ljava/lang/Object;Z)V", "Lcom/adobe/marketing/mobile/Event;", "event", "recordEvent", "(Lcom/adobe/marketing/mobile/Event;Lcom/adobe/marketing/mobile/AdobeCallbackWithError;)V", "Lcom/adobe/marketing/mobile/internal/eventhub/history/AndroidEventHistoryDatabase;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/adobe/marketing/mobile/internal/eventhub/history/AndroidEventHistoryDatabase;", "Camera2StreamConfigurationMap", "Ljava/util/concurrent/ExecutorService;", "Lkotlin/Lazy;", "getHighSpeedVideoSizes", "Companion"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class AndroidEventHistory implements com.adobe.marketing.mobile.internal.eventhub.history.EventHistory {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.adobe.marketing.mobile.internal.eventhub.history.AndroidEventHistoryDatabase Camera2StreamConfigurationMap = new com.adobe.marketing.mobile.internal.eventhub.history.AndroidEventHistoryDatabase();

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoSizes = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<java.util.concurrent.ExecutorService>() { // from class: com.adobe.marketing.mobile.internal.eventhub.history.AndroidEventHistory$executor$2
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
        public final java.util.concurrent.ExecutorService invoke() {
            return java.util.concurrent.Executors.newSingleThreadExecutor();
        }
    });

    @Override // com.adobe.marketing.mobile.internal.eventhub.history.EventHistory
    public final void deleteEvents(final com.adobe.marketing.mobile.EventHistoryRequest[] eventHistoryRequests, final com.adobe.marketing.mobile.AdobeCallbackWithError<java.lang.Integer> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventHistoryRequests, "");
        final kotlin.jvm.internal.Ref.BooleanRef booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
        ((java.util.concurrent.ExecutorService) this.getHighSpeedVideoSizes.getValue()).submit(new java.lang.Runnable() { // from class: com.adobe.marketing.mobile.internal.eventhub.history.AndroidEventHistory$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.adobe.marketing.mobile.internal.eventhub.history.AndroidEventHistory.m9877$r8$lambda$LiBnakDDVxK27uwaoKbtpkiKg(eventHistoryRequests, this, callback, booleanRef);
            }
        });
    }

    private static <T> void getHighSpeedVideoFpsRanges(com.adobe.marketing.mobile.AdobeCallbackWithError<T> p0, T p1, boolean p2) {
        try {
            if (p2) {
                if (p0 != null) {
                    p0.fail(com.adobe.marketing.mobile.AdobeError.DATABASE_ERROR);
                }
            } else if (p0 != null) {
                p0.call(p1);
            }
        } catch (java.lang.Exception e) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "AndroidEventHistory", "Exception executing event history AdobeCallbackWithError ".concat(java.lang.String.valueOf(e)), new java.lang.Object[0]);
        }
    }

    /* renamed from: $r8$lambda$L-iBnakDDVxK27uw-aoKbtpkiKg, reason: not valid java name */
    public static /* synthetic */ void m9877$r8$lambda$LiBnakDDVxK27uwaoKbtpkiKg(com.adobe.marketing.mobile.EventHistoryRequest[] eventHistoryRequestArr, com.adobe.marketing.mobile.internal.eventhub.history.AndroidEventHistory androidEventHistory, com.adobe.marketing.mobile.AdobeCallbackWithError adobeCallbackWithError, kotlin.jvm.internal.Ref.BooleanRef booleanRef) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventHistoryRequestArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(androidEventHistory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(booleanRef, "");
        int i = 0;
        for (com.adobe.marketing.mobile.EventHistoryRequest eventHistoryRequest : eventHistoryRequestArr) {
            int delete = androidEventHistory.Camera2StreamConfigurationMap.delete(eventHistoryRequest.getMaskAsDecimalHash(), eventHistoryRequest.getFromDate(), com.adobe.marketing.mobile.internal.eventhub.history.AndroidEventHistoryKt.access$getAdjustedToDate(eventHistoryRequest));
            if (delete == -1) {
                booleanRef.element = true;
            } else {
                i += delete;
            }
        }
        getHighSpeedVideoFpsRanges(adobeCallbackWithError, java.lang.Integer.valueOf(i), booleanRef.element);
    }

    public static /* synthetic */ void $r8$lambda$i27n65QzJhC4K3MMXcRhwxPpsVs(com.adobe.marketing.mobile.EventHistoryRequest[] eventHistoryRequestArr, com.adobe.marketing.mobile.internal.eventhub.history.AndroidEventHistory androidEventHistory, com.adobe.marketing.mobile.AdobeCallbackWithError adobeCallbackWithError, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventHistoryRequestArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(androidEventHistory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adobeCallbackWithError, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.Long l = null;
        boolean z2 = false;
        int i = 0;
        for (com.adobe.marketing.mobile.EventHistoryRequest eventHistoryRequest : eventHistoryRequestArr) {
            i++;
            long maskAsDecimalHash = eventHistoryRequest.getMaskAsDecimalHash();
            long access$adjustedFromDate = z ? com.adobe.marketing.mobile.internal.eventhub.history.AndroidEventHistoryKt.access$adjustedFromDate(eventHistoryRequest, l) : eventHistoryRequest.getFromDate();
            com.adobe.marketing.mobile.EventHistoryResult query = androidEventHistory.Camera2StreamConfigurationMap.query(maskAsDecimalHash, access$adjustedFromDate, com.adobe.marketing.mobile.internal.eventhub.history.AndroidEventHistoryKt.access$getAdjustedToDate(eventHistoryRequest));
            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "AndroidEventHistory", "EventHistoryRequest[%d] - (%d of %d) for hash(%d) from %d to %d with enforceOrder (%s) returned %d events", java.lang.Integer.valueOf(eventHistoryRequestArr.hashCode()), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(eventHistoryRequestArr.length), java.lang.Long.valueOf(maskAsDecimalHash), java.lang.Long.valueOf(access$adjustedFromDate), java.lang.Long.valueOf(com.adobe.marketing.mobile.internal.eventhub.history.AndroidEventHistoryKt.access$getAdjustedToDate(eventHistoryRequest)), z ? "true" : "false", java.lang.Integer.valueOf(query.count));
            if (z) {
                if (query.count == -1) {
                    z2 = true;
                }
                l = query.oldestOccurrence;
            }
            arrayList.add(query);
        }
        getHighSpeedVideoFpsRanges(adobeCallbackWithError, arrayList.toArray(new com.adobe.marketing.mobile.EventHistoryResult[0]), z2);
    }

    public static /* synthetic */ void $r8$lambda$sdXvedsrk1452m5lGtJ7qBVZtPM(com.adobe.marketing.mobile.Event event, com.adobe.marketing.mobile.internal.eventhub.history.AndroidEventHistory androidEventHistory, com.adobe.marketing.mobile.AdobeCallbackWithError adobeCallbackWithError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(androidEventHistory, "");
        long convertMapToFnv1aHash = com.adobe.marketing.mobile.internal.util.MapUtilsKt.convertMapToFnv1aHash(event.getEventData(), event.getMask());
        java.lang.StringBuilder sb = new java.lang.StringBuilder("%s hash(");
        sb.append(convertMapToFnv1aHash);
        sb.append(") for Event(");
        sb.append(event.getUniqueIdentifier());
        sb.append(')');
        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "AndroidEventHistory", sb.toString(), convertMapToFnv1aHash == 0 ? "Not Recording" : "Recording");
        boolean insert = convertMapToFnv1aHash != 0 ? androidEventHistory.Camera2StreamConfigurationMap.insert(convertMapToFnv1aHash, event.getTimestamp()) : false;
        getHighSpeedVideoFpsRanges(adobeCallbackWithError, java.lang.Boolean.valueOf(insert), !insert);
    }

    @Override // com.adobe.marketing.mobile.internal.eventhub.history.EventHistory
    public final void getEvents(final com.adobe.marketing.mobile.EventHistoryRequest[] eventHistoryRequests, final boolean enforceOrder, final com.adobe.marketing.mobile.AdobeCallbackWithError<com.adobe.marketing.mobile.EventHistoryResult[]> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventHistoryRequests, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        ((java.util.concurrent.ExecutorService) this.getHighSpeedVideoSizes.getValue()).submit(new java.lang.Runnable() { // from class: com.adobe.marketing.mobile.internal.eventhub.history.AndroidEventHistory$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.adobe.marketing.mobile.internal.eventhub.history.AndroidEventHistory.$r8$lambda$i27n65QzJhC4K3MMXcRhwxPpsVs(eventHistoryRequests, this, callback, enforceOrder);
            }
        });
    }

    @Override // com.adobe.marketing.mobile.internal.eventhub.history.EventHistory
    public final void recordEvent(final com.adobe.marketing.mobile.Event event, final com.adobe.marketing.mobile.AdobeCallbackWithError<java.lang.Boolean> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        ((java.util.concurrent.ExecutorService) this.getHighSpeedVideoSizes.getValue()).submit(new java.lang.Runnable() { // from class: com.adobe.marketing.mobile.internal.eventhub.history.AndroidEventHistory$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.adobe.marketing.mobile.internal.eventhub.history.AndroidEventHistory.$r8$lambda$sdXvedsrk1452m5lGtJ7qBVZtPM(com.adobe.marketing.mobile.Event.this, this, callback);
            }
        });
    }
}
