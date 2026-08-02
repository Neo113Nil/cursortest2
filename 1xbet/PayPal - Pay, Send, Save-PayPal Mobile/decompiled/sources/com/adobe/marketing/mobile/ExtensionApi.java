package com.adobe.marketing.mobile;

/* loaded from: classes.dex */
public abstract class ExtensionApi {
    public abstract com.adobe.marketing.mobile.SharedStateResolver createPendingSharedState(com.adobe.marketing.mobile.Event event);

    public abstract com.adobe.marketing.mobile.SharedStateResolver createPendingXDMSharedState(com.adobe.marketing.mobile.Event event);

    public abstract void createSharedState(java.util.Map<java.lang.String, java.lang.Object> map, com.adobe.marketing.mobile.Event event);

    public abstract void createXDMSharedState(java.util.Map<java.lang.String, java.lang.Object> map, com.adobe.marketing.mobile.Event event);

    public abstract void dispatch(com.adobe.marketing.mobile.Event event);

    public abstract void getHistoricalEvents(com.adobe.marketing.mobile.EventHistoryRequest[] eventHistoryRequestArr, boolean z, com.adobe.marketing.mobile.AdobeCallbackWithError<com.adobe.marketing.mobile.EventHistoryResult[]> adobeCallbackWithError);

    @java.lang.Deprecated
    public abstract void getHistoricalEvents(com.adobe.marketing.mobile.EventHistoryRequest[] eventHistoryRequestArr, boolean z, com.adobe.marketing.mobile.EventHistoryResultHandler<java.lang.Integer> eventHistoryResultHandler);

    public abstract com.adobe.marketing.mobile.SharedStateResult getSharedState(java.lang.String str, com.adobe.marketing.mobile.Event event, boolean z, com.adobe.marketing.mobile.SharedStateResolution sharedStateResolution);

    public abstract com.adobe.marketing.mobile.SharedStateResult getXDMSharedState(java.lang.String str, com.adobe.marketing.mobile.Event event, boolean z, com.adobe.marketing.mobile.SharedStateResolution sharedStateResolution);

    public abstract void recordHistoricalEvent(com.adobe.marketing.mobile.Event event, com.adobe.marketing.mobile.AdobeCallbackWithError<java.lang.Boolean> adobeCallbackWithError);

    public abstract void registerEventListener(java.lang.String str, java.lang.String str2, com.adobe.marketing.mobile.ExtensionEventListener extensionEventListener);

    public abstract void startEvents();

    public abstract void stopEvents();

    public abstract void unregisterExtension();
}
