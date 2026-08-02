package com.gemalto.mfs.mwsdk.mobilegateway.listener;

/* loaded from: classes8.dex */
public interface CardMetaDataFetchListener {
    void onError(com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayError mobileGatewayError);

    void onSuccess(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardMetaData cardMetaData);
}
