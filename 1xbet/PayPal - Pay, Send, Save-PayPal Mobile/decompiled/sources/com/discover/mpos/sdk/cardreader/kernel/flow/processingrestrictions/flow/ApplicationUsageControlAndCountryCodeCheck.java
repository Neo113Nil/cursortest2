package com.discover.mpos.sdk.cardreader.kernel.flow.processingrestrictions.flow;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0002J\u0016\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016J\u0016\u0010\u000e\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0002J\u0016\u0010\u000f\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0002R \u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/processingrestrictions/flow/ApplicationUsageControlAndCountryCodeCheck;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionStep;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/processingrestrictions/model/ProcessingRestrictionsData;", "()V", "applicationUsageControlChecksByType", "", "Lcom/discover/mpos/sdk/transaction/TransactionType;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/processingrestrictions/flow/auc/AucData;", "debugTag", "", "execute", "", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "setRequestedServiceNotAllowedForCardProduct", "startChildValidationFlow", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.j.a.c, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class ApplicationUsageControlAndCountryCodeCheck implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep<com.discover.mpos.sdk.cardreader.kernel.flow.processingrestrictions.model.ProcessingRestrictionsData> {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.Map<com.discover.mpos.sdk.transaction.TransactionType, com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep<com.discover.mpos.sdk.cardreader.kernel.flow.processingrestrictions.flow.auc.AucData>> f3163a = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.discover.mpos.sdk.transaction.TransactionType.PURCHASE, new com.discover.mpos.sdk.cardreader.kernel.flow.processingrestrictions.flow.auc.AucCheckForPurchaseStep()), kotlin.TuplesKt.to(com.discover.mpos.sdk.transaction.TransactionType.PURCHASE_WITH_CASHBACK, new com.discover.mpos.sdk.cardreader.kernel.flow.processingrestrictions.flow.auc.AucCheckForPurchaseWithCashBack()));

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
        transactionEx.j().i().f3278a.setBitValue(com.discover.mpos.sdk.core.data.ByteInfo.BitIndex.FOURTH, true);
        com.discover.mpos.sdk.cardreader.kernel.flow.processingrestrictions.model.ProcessingRestrictionsData q = transactionEx.q();
        boolean isEmpty = q.f3165a.getIsEmpty();
        boolean z = q.b != null;
        new java.lang.Object[]{java.lang.Boolean.valueOf(!isEmpty)};
        new java.lang.Object[]{java.lang.Boolean.valueOf(z)};
        if (!isEmpty && z) {
            com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep<com.discover.mpos.sdk.cardreader.kernel.flow.processingrestrictions.flow.auc.AucData> transactionExecutionStep = this.f3163a.get(transactionEx.q().d);
            if (!transactionEx.q().f3165a.e) {
                transactionEx.j().h().b(true);
            } else if (transactionExecutionStep == null) {
                transactionEx.t();
            } else {
                transactionEx.a(new com.discover.mpos.sdk.cardreader.kernel.flow.processingrestrictions.flow.auc.AucDataProvider(transactionEx.q()), new com.discover.mpos.sdk.transaction.execution.LinearTransactionExecutionFlow().a((com.discover.mpos.sdk.flow.ExecutionStep) transactionExecutionStep));
            }
        } else {
            transactionEx.j().C = true;
        }
        transactionEx.t();
    }
}
