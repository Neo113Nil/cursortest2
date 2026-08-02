package com.discover.mpos.sdk.transaction.execution;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0002\u0010\u0004J\u001b\u0010\u0006\u001a\u00028\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0002\u0010\tR\u0010\u0010\u0003\u001a\u00028\u0000X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/discover/mpos/sdk/transaction/execution/DataContainerProvider;", "Data", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionDataProvider;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "getData", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "(Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;)Ljava/lang/Object;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.transaction.a.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class DataContainerProvider<Data> implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionDataProvider<Data> {

    /* renamed from: a, reason: collision with root package name */
    private final Data f3231a;

    public DataContainerProvider(Data data) {
        this.f3231a = data;
    }

    @Override // com.discover.mpos.sdk.transaction.execution.TransactionExecutionDataProvider
    public final Data a(com.discover.mpos.sdk.transaction.execution.TransactionEx<Data> transactionEx) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        return this.f3231a;
    }
}
