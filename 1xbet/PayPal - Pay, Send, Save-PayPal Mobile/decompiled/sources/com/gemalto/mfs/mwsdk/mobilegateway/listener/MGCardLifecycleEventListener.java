package com.gemalto.mfs.mwsdk.mobilegateway.listener;

/* loaded from: classes8.dex */
public interface MGCardLifecycleEventListener {
    void onError(java.lang.String str, com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayError mobileGatewayError);

    void onSuccess(java.lang.String str);
}
