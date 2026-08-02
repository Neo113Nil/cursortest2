package com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.mandatorychecks.a.tvrupdate;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/iap/flow/mandatorychecks/flow/tvrupdate/TvrFlagUpdater;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionStep;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/iap/flow/mandatorychecks/model/GpoMandatoryCheckData;", "()V", "debugTag", "", "execute", "", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.c.a.b.a.c.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class TvrFlagUpdater implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep<com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.mandatorychecks.model.GpoMandatoryCheckData> {
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
        com.discover.mpos.sdk.transaction.processing.terminalverificationresults.TerminalVerificationResults h = transactionEx.j().h();
        new java.lang.Object[]{h};
        h.a(true);
        h.d.setBitValue(com.discover.mpos.sdk.core.data.ByteInfo.BitIndex.EIGHTH, transactionEx.q().b.getReaderContactlessFloorLimitExceeded());
        new java.lang.Object[]{h};
        transactionEx.t();
    }
}
