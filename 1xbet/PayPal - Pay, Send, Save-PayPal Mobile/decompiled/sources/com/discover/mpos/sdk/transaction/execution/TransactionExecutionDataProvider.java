package com.discover.mpos.sdk.transaction.execution;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001b\u0010\u0003\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionDataProvider;", "Data", "", "getData", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "(Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;)Ljava/lang/Object;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.transaction.a.h, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public interface TransactionExecutionDataProvider<Data> {
    Data a(com.discover.mpos.sdk.transaction.execution.TransactionEx<Data> transactionEx);
}
