package com.gemalto.mfs.mwsdk.mobilegateway.listener;

/* loaded from: classes8.dex */
public interface ProductListener {
    void onError(com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayError mobileGatewayError);

    void onSuccess(java.util.List<com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardProduct> list);
}
