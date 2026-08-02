package com.adjust.sdk.network;

/* loaded from: classes7.dex */
public interface IActivityPackageSender {

    public interface ResponseDataCallbackSubscriber {
        void onResponseDataCallback(com.adjust.sdk.ResponseData responseData);
    }

    void sendActivityPackage(com.adjust.sdk.ActivityPackage activityPackage, java.util.Map<java.lang.String, java.lang.String> map, com.adjust.sdk.network.IActivityPackageSender.ResponseDataCallbackSubscriber responseDataCallbackSubscriber);

    com.adjust.sdk.ResponseData sendActivityPackageSync(com.adjust.sdk.ActivityPackage activityPackage, java.util.Map<java.lang.String, java.lang.String> map);
}
