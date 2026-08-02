package com.adobe.marketing.mobile.messaging;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u0003R0\u0010\u000f\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u000bj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/adobe/marketing/mobile/messaging/IamRefreshHandler;", "", "<init>", "()V", "Lcom/adobe/marketing/mobile/AdobeCallback;", "", com.sun.jna.Callback.METHOD_NAME, "", "refreshInAppMessages", "(Lcom/adobe/marketing/mobile/AdobeCallback;)V", "reset", "Ljava/util/ArrayList;", "Lkotlin/collections/getHighSpeedVideoFpsRanges;", "getHighSpeedVideoSizes", "Ljava/util/ArrayList;", "getHighSpeedVideoFpsRangesFor", "Z", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class IamRefreshHandler {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static boolean getHighResolutionOutputSizeshNQ4ISI;
    public static final com.adobe.marketing.mobile.messaging.IamRefreshHandler INSTANCE = new com.adobe.marketing.mobile.messaging.IamRefreshHandler();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final java.util.ArrayList<com.adobe.marketing.mobile.AdobeCallback<java.lang.Boolean>> getHighSpeedVideoFpsRangesFor = new java.util.ArrayList<>();

    private IamRefreshHandler() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void refreshInAppMessages$default(com.adobe.marketing.mobile.messaging.IamRefreshHandler iamRefreshHandler, com.adobe.marketing.mobile.AdobeCallback adobeCallback, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            adobeCallback = null;
        }
        iamRefreshHandler.refreshInAppMessages(adobeCallback);
    }

    public final void refreshInAppMessages(com.adobe.marketing.mobile.AdobeCallback<java.lang.Boolean> callback) {
        java.util.ArrayList<com.adobe.marketing.mobile.AdobeCallback<java.lang.Boolean>> arrayList = getHighSpeedVideoFpsRangesFor;
        synchronized (arrayList) {
            if (callback != null) {
                arrayList.add(callback);
            }
            if (getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            getHighResolutionOutputSizeshNQ4ISI = true;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("refreshmessages", java.lang.Boolean.TRUE);
            com.adobe.marketing.mobile.Event build = new com.adobe.marketing.mobile.Event.Builder("Refresh in-app messages", com.adobe.marketing.mobile.EventType.MESSAGING, com.adobe.marketing.mobile.EventSource.REQUEST_CONTENT).setEventData(hashMap).build();
            com.adobe.marketing.mobile.messaging.MessagingExtension.addCompletionHandler(new com.adobe.marketing.mobile.messaging.CompletionHandler(build.getUniqueIdentifier(), new com.adobe.marketing.mobile.AdobeCallback() { // from class: com.adobe.marketing.mobile.messaging.IamRefreshHandler$$ExternalSyntheticLambda0
                @Override // com.adobe.marketing.mobile.AdobeCallback
                public final void call(java.lang.Object obj) {
                    com.adobe.marketing.mobile.messaging.IamRefreshHandler.$r8$lambda$mLFYY0vMuW6vsd8xaAsSYokLQx0((java.lang.Boolean) obj);
                }
            }));
            com.adobe.marketing.mobile.MobileCore.dispatchEvent(build);
        }
    }

    public final void reset() {
        java.util.ArrayList<com.adobe.marketing.mobile.AdobeCallback<java.lang.Boolean>> arrayList = getHighSpeedVideoFpsRangesFor;
        synchronized (arrayList) {
            arrayList.clear();
            getHighResolutionOutputSizeshNQ4ISI = false;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void $r8$lambda$mLFYY0vMuW6vsd8xaAsSYokLQx0(java.lang.Boolean bool) {
        java.util.ArrayList arrayList;
        java.util.ArrayList<com.adobe.marketing.mobile.AdobeCallback<java.lang.Boolean>> arrayList2 = getHighSpeedVideoFpsRangesFor;
        synchronized (arrayList2) {
            getHighResolutionOutputSizeshNQ4ISI = false;
            arrayList = new java.util.ArrayList(arrayList2);
            arrayList2.clear();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.adobe.marketing.mobile.AdobeCallback) it.next()).call(bool);
        }
    }
}
