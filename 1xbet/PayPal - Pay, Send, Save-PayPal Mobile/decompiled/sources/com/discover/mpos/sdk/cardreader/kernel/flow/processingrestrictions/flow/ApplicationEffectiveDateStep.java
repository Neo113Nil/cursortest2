package com.discover.mpos.sdk.cardreader.kernel.flow.processingrestrictions.flow;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\b\u0010\n\u001a\u00020\u000bH\u0002J\u0016\u0010\f\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016¨\u0006\r"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/processingrestrictions/flow/ApplicationEffectiveDateStep;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionStep;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/processingrestrictions/model/ProcessingRestrictionsData;", "()V", "checkEffectiveDate", "", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "date", "Lcom/discover/mpos/sdk/data/CardDate;", "debugTag", "", "execute", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.j.a.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class ApplicationEffectiveDateStep implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep<com.discover.mpos.sdk.cardreader.kernel.flow.processingrestrictions.model.ProcessingRestrictionsData> {
    @Override // com.discover.mpos.sdk.flow.ExecutionStep
    public final /* synthetic */ void a(com.discover.mpos.sdk.flow.ExecutionFlow executionFlow, java.lang.Object obj) {
        com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx = (com.discover.mpos.sdk.transaction.execution.TransactionEx) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep.a.a(this, executionFlow, transactionEx);
    }

    @Override // com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep
    public final void a(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.processingrestrictions.model.ProcessingRestrictionsData> transactionEx) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.transaction.processing.ProcessingData j = transactionEx.j();
        com.discover.mpos.sdk.data.CardDate cardDate = (com.discover.mpos.sdk.data.CardDate) j.w.a(j, com.discover.mpos.sdk.transaction.processing.ProcessingData.f3244a[17]);
        if (cardDate == null) {
            transactionEx.s();
            return;
        }
        java.util.Date transactionDate = transactionEx.getTransactionData().getTransactionDate();
        new java.lang.Object[]{transactionDate};
        new java.lang.Object[]{cardDate};
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionDate, "");
        java.util.Date a2 = cardDate.a();
        boolean after = a2 != null ? a2.after(transactionDate) : false;
        transactionEx.j().h().b.setBitValue(com.discover.mpos.sdk.core.data.ByteInfo.BitIndex.SIXTH, after);
        new java.lang.Object[]{java.lang.Boolean.valueOf(after)};
        transactionEx.t();
    }
}
