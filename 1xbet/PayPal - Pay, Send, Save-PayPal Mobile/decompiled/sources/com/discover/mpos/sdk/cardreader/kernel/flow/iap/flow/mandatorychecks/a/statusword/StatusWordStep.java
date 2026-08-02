package com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.mandatorychecks.a.statusword;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/iap/flow/mandatorychecks/flow/statusword/StatusWordStep;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionStep;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/iap/flow/mandatorychecks/model/GpoMandatoryCheckData;", "()V", "execute", "", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.c.a.b.a.b.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class StatusWordStep implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep<com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.mandatorychecks.model.GpoMandatoryCheckData> {
    @Override // com.discover.mpos.sdk.flow.ExecutionStep
    public final /* synthetic */ void a(com.discover.mpos.sdk.flow.ExecutionFlow executionFlow, java.lang.Object obj) {
        com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx = (com.discover.mpos.sdk.transaction.execution.TransactionEx) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep.a.a(this, executionFlow, transactionEx);
    }

    @Override // com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep
    public final void a(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.mandatorychecks.model.GpoMandatoryCheckData> transactionEx) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        transactionEx.a(new com.discover.mpos.sdk.transaction.execution.DataContainerProvider(transactionEx.q().f3033a), new com.discover.mpos.sdk.transaction.execution.LinearTransactionExecutionFlow().a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.mandatorychecks.a.statusword.flow.SuccessStatusWordCheckStep()).a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.mandatorychecks.a.statusword.flow.RecoverableStatusWordCheckStep()));
    }
}
