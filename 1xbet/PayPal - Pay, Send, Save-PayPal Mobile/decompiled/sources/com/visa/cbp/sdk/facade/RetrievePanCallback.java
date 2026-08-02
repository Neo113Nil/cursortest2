package com.visa.cbp.sdk.facade;

/* loaded from: classes16.dex */
public interface RetrievePanCallback {
    void onError(int i, com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException visaPaymentSDKException);

    void onResult(java.lang.String str);
}
