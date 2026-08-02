package com.gemalto.mfs.mwsdk.mobilegateway.listener;

/* loaded from: classes8.dex */
public interface CardListFetchListener {
    void onError(com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayError mobileGatewayError);

    void onSuccess(java.util.Collection<com.gemalto.mfs.mwsdk.mobilegateway.MGCardLiteEntry> collection);
}
