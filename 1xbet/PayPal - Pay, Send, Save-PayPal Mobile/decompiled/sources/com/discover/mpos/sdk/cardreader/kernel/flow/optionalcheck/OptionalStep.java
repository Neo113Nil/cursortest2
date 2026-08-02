package com.discover.mpos.sdk.cardreader.kernel.flow.optionalcheck;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0016\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/optionalcheck/OptionalStep;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionStep;", "Lcom/discover/mpos/sdk/transaction/internal/InternalTransaction;", "dataProvider", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionDataProvider;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/pdol/PdolCheckData;", "(Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionDataProvider;)V", "debugTag", "", "execute", "", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.e.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class OptionalStep implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep<com.discover.mpos.sdk.transaction.internal.InternalTransaction> {

    /* renamed from: a, reason: collision with root package name */
    private final com.discover.mpos.sdk.transaction.execution.TransactionExecutionDataProvider<com.discover.mpos.sdk.cardreader.kernel.flow.pdol.PdolCheckData> f3138a;

    private OptionalStep(com.discover.mpos.sdk.transaction.execution.TransactionExecutionDataProvider<com.discover.mpos.sdk.cardreader.kernel.flow.pdol.PdolCheckData> transactionExecutionDataProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionExecutionDataProvider, "");
        this.f3138a = transactionExecutionDataProvider;
    }

    @Override // com.discover.mpos.sdk.flow.ExecutionStep
    public final /* synthetic */ void a(com.discover.mpos.sdk.flow.ExecutionFlow executionFlow, java.lang.Object obj) {
        com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx = (com.discover.mpos.sdk.transaction.execution.TransactionEx) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep.a.a(this, executionFlow, transactionEx);
    }

    public /* synthetic */ OptionalStep() {
        this(new com.discover.mpos.sdk.cardreader.kernel.flow.pdol.PdolCheckDataProvider());
    }

    @Override // com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep
    public final void a(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.transaction.internal.InternalTransaction> transactionEx) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.transaction.execution.TransactionExecutionDataProvider transactionExecutionDataProvider = this.f3138a;
        com.discover.mpos.sdk.transaction.execution.LinearTransactionExecutionFlow linearTransactionExecutionFlow = new com.discover.mpos.sdk.transaction.execution.LinearTransactionExecutionFlow();
        linearTransactionExecutionFlow.a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.kernel.flow.optionalcheck.flow.OptionalCheckStep());
        new java.lang.Object[]{java.lang.Boolean.valueOf(transactionEx.j().G)};
        if (transactionEx.j().G) {
            linearTransactionExecutionFlow.a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.kernel.flow.optionalcheck.flow.IssuerScriptCommandsAvailableCheckStep());
            linearTransactionExecutionFlow.a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.kernel.flow.optionalcheck.flow.WriteDataStorageTemplateCheckStep());
        }
        linearTransactionExecutionFlow.a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.kernel.flow.optionalcheck.flow.ResetTsiAndTvrStep());
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        transactionEx.a(transactionExecutionDataProvider, linearTransactionExecutionFlow);
    }
}
