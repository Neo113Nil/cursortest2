package com.gemalto.mfs.mwsdk.mobilegateway.utils;

/* loaded from: classes8.dex */
public interface MGAsyncResult<T> {
    com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayError getErrorCode();

    T getResult();

    boolean isSuccessful();
}
