package com.discover.mpos.sdk.cardreader.kernel.flow.processingrestrictions.flow.auc;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0016\u0010\b\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/processingrestrictions/flow/auc/AucDataProvider;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionDataProvider;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/processingrestrictions/flow/auc/AucData;", "inputData", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/processingrestrictions/model/ProcessingRestrictionsData;", "(Lcom/discover/mpos/sdk/cardreader/kernel/flow/processingrestrictions/model/ProcessingRestrictionsData;)V", "getInputData", "()Lcom/discover/mpos/sdk/cardreader/kernel/flow/processingrestrictions/model/ProcessingRestrictionsData;", "getData", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.j.a.a.d, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class AucDataProvider implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionDataProvider<com.discover.mpos.sdk.cardreader.kernel.flow.processingrestrictions.flow.auc.AucData> {

    /* renamed from: a, reason: collision with root package name */
    private final com.discover.mpos.sdk.cardreader.kernel.flow.processingrestrictions.model.ProcessingRestrictionsData f3162a;

    public AucDataProvider(com.discover.mpos.sdk.cardreader.kernel.flow.processingrestrictions.model.ProcessingRestrictionsData processingRestrictionsData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(processingRestrictionsData, "");
        this.f3162a = processingRestrictionsData;
    }

    @Override // com.discover.mpos.sdk.transaction.execution.TransactionExecutionDataProvider
    public final /* synthetic */ com.discover.mpos.sdk.cardreader.kernel.flow.processingrestrictions.flow.auc.AucData a(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.processingrestrictions.flow.auc.AucData> transactionEx) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.cardreader.kernel.flow.processingrestrictions.model.ProcessingRestrictionsData processingRestrictionsData = this.f3162a;
        byte[] bArr = processingRestrictionsData.b;
        return new com.discover.mpos.sdk.cardreader.kernel.flow.processingrestrictions.flow.auc.AucData(kotlin.text.StringsKt.equals(bArr != null ? com.discover.mpos.sdk.core.extensions.ByteArrayExtensionsKt.toHexString(bArr) : null, processingRestrictionsData.c, true), processingRestrictionsData.f3165a);
    }
}
