package com.gemalto.mfs.mwsdk.mobilegateway;

/* loaded from: classes3.dex */
public interface MGTransactionHistoryService {
    void refreshHistory(java.lang.String str, java.lang.String str2, java.lang.String str3, com.gemalto.mfs.mwsdk.mobilegateway.listener.TransactionHistoryListener transactionHistoryListener);

    void refreshHistory(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.gemalto.mfs.mwsdk.mobilegateway.listener.TransactionHistoryListener transactionHistoryListener);
}
