package com.discover.mpos.sdk.cardreader.entrypoint.flow.preprocessing;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/entrypoint/flow/preprocessing/PreProcessingTransactionStep;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionStep;", "Lcom/discover/mpos/sdk/transaction/internal/InternalTransaction;", "dataProvider", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionDataProvider;", "Lcom/discover/mpos/sdk/transaction/processing/PreProcessingData;", "(Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionDataProvider;)V", "execute", "", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.entrypoint.a.b.b, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class PreProcessingTransactionStep implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep<com.discover.mpos.sdk.transaction.internal.InternalTransaction> {

    /* renamed from: a, reason: collision with root package name */
    private final com.discover.mpos.sdk.transaction.execution.TransactionExecutionDataProvider<com.discover.mpos.sdk.transaction.processing.PreProcessingData> f2997a;

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "Lcom/discover/mpos/sdk/transaction/processing/PreProcessingData;", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.entrypoint.a.b.b$a */
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.transaction.processing.PreProcessingData>, kotlin.Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.discover.mpos.sdk.transaction.execution.TransactionEx f2998a;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.transaction.processing.PreProcessingData> transactionEx) {
            com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.transaction.processing.PreProcessingData> transactionEx2 = transactionEx;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx2, "");
            this.f2998a.getE().g = transactionEx2.q();
            transactionEx2.t();
            return kotlin.Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx) {
            super(1);
            this.f2998a = transactionEx;
        }
    }

    private PreProcessingTransactionStep(com.discover.mpos.sdk.transaction.execution.TransactionExecutionDataProvider<com.discover.mpos.sdk.transaction.processing.PreProcessingData> transactionExecutionDataProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionExecutionDataProvider, "");
        this.f2997a = transactionExecutionDataProvider;
    }

    @Override // com.discover.mpos.sdk.flow.ExecutionStep
    public final /* synthetic */ void a(com.discover.mpos.sdk.flow.ExecutionFlow executionFlow, java.lang.Object obj) {
        com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx = (com.discover.mpos.sdk.transaction.execution.TransactionEx) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep.a.a(this, executionFlow, transactionEx);
    }

    public /* synthetic */ PreProcessingTransactionStep() {
        this(new com.discover.mpos.sdk.cardreader.entrypoint.flow.preprocessing.PreProcessingDataProvider());
    }

    @Override // com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep
    public final void a(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.transaction.internal.InternalTransaction> transactionEx) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        transactionEx.a(this.f2997a, new com.discover.mpos.sdk.transaction.execution.LinearTransactionExecutionFlow().a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.entrypoint.flow.preprocessing.steps.PreProcessingIndicatorsResetStep()).a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.entrypoint.flow.preprocessing.steps.TerminalTransactionQualifiersCopyStep()).a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.entrypoint.flow.preprocessing.steps.StatusCheckSupportVerificationStep()).a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.entrypoint.flow.preprocessing.steps.ZeroAmountVerificationStep()).a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.entrypoint.flow.preprocessing.steps.ReaderContactlessTransactionLimitVerificationStep()).a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.entrypoint.flow.preprocessing.steps.ReaderContactlessFloorLimitVerificationStep()).a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.entrypoint.flow.preprocessing.steps.ReaderCvmRequiredLimitVerificationStep()).a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.entrypoint.flow.preprocessing.steps.FinalTtqModificationsStep()).a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.entrypoint.flow.preprocessing.steps.FinalPreProcessingIndicatorsAnalysingStep()).a((kotlin.jvm.functions.Function1) new com.discover.mpos.sdk.cardreader.entrypoint.flow.preprocessing.PreProcessingTransactionStep.a(transactionEx)).c());
    }
}
