package com.gemalto.mfs.mwsdk.mobilegateway;

/* loaded from: classes3.dex */
public interface MobileGatewayError {
    java.lang.Exception getCausingException();

    int getHTTPStatusCode();

    java.lang.String getMessage();

    com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode getSDKErrorCode();

    int getServerErrorCode();
}
