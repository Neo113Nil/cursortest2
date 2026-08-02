package com.adobe.marketing.mobile.launch.rulesengine;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a%\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\u000f\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0011\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0013\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0015\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014"}, d2 = {"", "enforceOrder", "", "Lcom/adobe/marketing/mobile/EventHistoryResult;", "eventHistoryResult", "", "convertEventHistoryResultToInt", "(Z[Lcom/adobe/marketing/mobile/EventHistoryResult;)I", "", "Lcom/adobe/marketing/mobile/EventHistoryRequest;", "requests", "", com.paypal.oslo.feature.contacts.domain.constants.ContactsConstants.Log.Attributes.SEARCH_TYPE, "Lcom/adobe/marketing/mobile/ExtensionApi;", "extensionApi", "getHistoricalEventCount", "(Ljava/util/List;Ljava/lang/String;Lcom/adobe/marketing/mobile/ExtensionApi;)I", "getMostRecentHistoricalEvent", "(Ljava/util/List;Lcom/adobe/marketing/mobile/ExtensionApi;)I", "SEARCH_TYPE_MOST_RECENT", "Ljava/lang/String;", "SEARCH_TYPE_ORDERED"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class HistoricalEventsQueryingKt {
    public static final java.lang.String SEARCH_TYPE_MOST_RECENT = "mostRecent";
    public static final java.lang.String SEARCH_TYPE_ORDERED = "ordered";

    public static final /* synthetic */ int getHistoricalEventCount(java.util.List list, final java.lang.String str, com.adobe.marketing.mobile.ExtensionApi extensionApi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extensionApi, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, SEARCH_TYPE_MOST_RECENT)) {
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngineConstants.LOG_TAG, "historicalEventsQuerying", "Unable to retrieve historical events, unsupported EventHistorySearchType 'mostRecent'", new java.lang.Object[0]);
            return -1;
        }
        try {
            final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
            final kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
            extensionApi.getHistoricalEvents((com.adobe.marketing.mobile.EventHistoryRequest[]) list.toArray(new com.adobe.marketing.mobile.EventHistoryRequest[0]), kotlin.jvm.internal.Intrinsics.areEqual(str, SEARCH_TYPE_ORDERED), new com.adobe.marketing.mobile.AdobeCallbackWithError<com.adobe.marketing.mobile.EventHistoryResult[]>() { // from class: com.adobe.marketing.mobile.launch.rulesengine.HistoricalEventsQueryingKt$getHistoricalEventCount$1
                @Override // com.adobe.marketing.mobile.AdobeCallback
                public final void call(com.adobe.marketing.mobile.EventHistoryResult[] results) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(results, "");
                    kotlin.jvm.internal.Ref.IntRef.this.element = com.adobe.marketing.mobile.launch.rulesengine.HistoricalEventsQueryingKt.convertEventHistoryResultToInt(kotlin.jvm.internal.Intrinsics.areEqual(str, com.adobe.marketing.mobile.launch.rulesengine.HistoricalEventsQueryingKt.SEARCH_TYPE_ORDERED), results);
                    countDownLatch.countDown();
                }

                @Override // com.adobe.marketing.mobile.AdobeCallbackWithError
                public final void fail(com.adobe.marketing.mobile.AdobeError error) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to retrieve historical events, caused by the error: ");
                    sb.append(error.getErrorName());
                    com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngineConstants.LOG_TAG, "historicalEventsQuerying", sb.toString(), new java.lang.Object[0]);
                    kotlin.jvm.internal.Ref.IntRef.this.element = -1;
                    countDownLatch.countDown();
                }
            });
            countDownLatch.await(1000L, java.util.concurrent.TimeUnit.MILLISECONDS);
            return intRef.element;
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to retrieve historical events, caused by the exception: ");
            sb.append(e.getLocalizedMessage());
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngineConstants.LOG_TAG, "historicalEventsQuerying", sb.toString(), new java.lang.Object[0]);
            return -1;
        }
    }

    public static final /* synthetic */ int convertEventHistoryResultToInt(boolean z, com.adobe.marketing.mobile.EventHistoryResult[] eventHistoryResultArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventHistoryResultArr, "");
        if (z) {
            for (com.adobe.marketing.mobile.EventHistoryResult eventHistoryResult : eventHistoryResultArr) {
                if (eventHistoryResult.count == -1) {
                    return -1;
                }
                if (eventHistoryResult.count == 0) {
                    return 0;
                }
            }
            return 1;
        }
        int i = 0;
        for (com.adobe.marketing.mobile.EventHistoryResult eventHistoryResult2 : eventHistoryResultArr) {
            if (eventHistoryResult2.count == -1) {
                return -1;
            }
            i += eventHistoryResult2.count;
        }
        return i;
    }

    public static final /* synthetic */ int getMostRecentHistoricalEvent(java.util.List list, com.adobe.marketing.mobile.ExtensionApi extensionApi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extensionApi, "");
        try {
            final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
            final kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
            intRef.element = -1;
            final kotlin.jvm.internal.Ref.LongRef longRef = new kotlin.jvm.internal.Ref.LongRef();
            longRef.element = Long.MIN_VALUE;
            extensionApi.getHistoricalEvents((com.adobe.marketing.mobile.EventHistoryRequest[]) list.toArray(new com.adobe.marketing.mobile.EventHistoryRequest[0]), false, new com.adobe.marketing.mobile.AdobeCallbackWithError<com.adobe.marketing.mobile.EventHistoryResult[]>() { // from class: com.adobe.marketing.mobile.launch.rulesengine.HistoricalEventsQueryingKt$getMostRecentHistoricalEvent$1
                @Override // com.adobe.marketing.mobile.AdobeCallback
                public final void call(com.adobe.marketing.mobile.EventHistoryResult[] results) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(results, "");
                    int length = results.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        com.adobe.marketing.mobile.EventHistoryResult eventHistoryResult = results[i];
                        if (eventHistoryResult.count == -1) {
                            kotlin.jvm.internal.Ref.IntRef.this.element = -1;
                            break;
                        }
                        if (eventHistoryResult.newestOccurrence != null && eventHistoryResult.newestOccurrence.longValue() > longRef.element) {
                            longRef.element = eventHistoryResult.newestOccurrence.longValue();
                            kotlin.jvm.internal.Ref.IntRef.this.element = i;
                        }
                        i++;
                    }
                    countDownLatch.countDown();
                }

                @Override // com.adobe.marketing.mobile.AdobeCallbackWithError
                public final void fail(com.adobe.marketing.mobile.AdobeError error) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to retrieve most recent historical event, caused by the error: ");
                    sb.append(error.getErrorName());
                    com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngineConstants.LOG_TAG, "historicalEventsQuerying", sb.toString(), new java.lang.Object[0]);
                    countDownLatch.countDown();
                }
            });
            countDownLatch.await(1000L, java.util.concurrent.TimeUnit.MILLISECONDS);
            return intRef.element;
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to retrieve most recent historical event, caused by the exception: ");
            sb.append(e.getLocalizedMessage());
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngineConstants.LOG_TAG, "historicalEventsQuerying", sb.toString(), new java.lang.Object[0]);
            return -1;
        }
    }
}
