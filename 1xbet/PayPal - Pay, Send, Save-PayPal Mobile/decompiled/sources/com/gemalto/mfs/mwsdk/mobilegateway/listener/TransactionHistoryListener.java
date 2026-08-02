package com.gemalto.mfs.mwsdk.mobilegateway.listener;

/* loaded from: classes3.dex */
public interface TransactionHistoryListener {
    void onError(java.lang.String str, com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayError mobileGatewayError);

    void onSuccess(java.util.List<com.gemalto.mfs.mwsdk.mobilegateway.MGTransactionRecord> list, java.lang.String str, java.lang.String str2);
}
