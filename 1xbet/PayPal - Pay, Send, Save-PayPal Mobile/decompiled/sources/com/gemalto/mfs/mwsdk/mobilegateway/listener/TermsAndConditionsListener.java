package com.gemalto.mfs.mwsdk.mobilegateway.listener;

/* loaded from: classes8.dex */
public interface TermsAndConditionsListener {
    void onError(com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayError mobileGatewayError);

    void onSuccess(java.lang.String str, com.gemalto.mfs.mwsdk.mobilegateway.enrollment.TermsAndConditions termsAndConditions);
}
