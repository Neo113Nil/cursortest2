package com.discover.mpos.sdk.cardreader.kernel.flow.optionalfeature;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0003\u0005\b\u000b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0016\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0016R\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/optionalfeature/OptionalFeatureStep;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionStep;", "Lcom/discover/mpos/sdk/transaction/internal/InternalTransaction;", "()V", "executionStep", "com/discover/mpos/sdk/cardreader/kernel/flow/optionalfeature/OptionalFeatureStep$executionStep$1", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/optionalfeature/OptionalFeatureStep$executionStep$1;", "formFactorIdentifierStep", "com/discover/mpos/sdk/cardreader/kernel/flow/optionalfeature/OptionalFeatureStep$formFactorIdentifierStep$1", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/optionalfeature/OptionalFeatureStep$formFactorIdentifierStep$1;", "loggingStep", "com/discover/mpos/sdk/cardreader/kernel/flow/optionalfeature/OptionalFeatureStep$loggingStep$1", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/optionalfeature/OptionalFeatureStep$loggingStep$1;", "debugTag", "", "execute", "", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.f.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class OptionalFeatureStep implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep<com.discover.mpos.sdk.transaction.internal.InternalTransaction> {

    /* renamed from: a, reason: collision with root package name */
    private final com.discover.mpos.sdk.cardreader.kernel.flow.optionalfeature.OptionalFeatureStep.a f3143a = new com.discover.mpos.sdk.cardreader.kernel.flow.optionalfeature.OptionalFeatureStep.a();
    private final com.discover.mpos.sdk.cardreader.kernel.flow.optionalfeature.OptionalFeatureStep.c b = new com.discover.mpos.sdk.cardreader.kernel.flow.optionalfeature.OptionalFeatureStep.c();
    private final com.discover.mpos.sdk.cardreader.kernel.flow.optionalfeature.OptionalFeatureStep.b c = new com.discover.mpos.sdk.cardreader.kernel.flow.optionalfeature.OptionalFeatureStep.b();

    @Override // com.discover.mpos.sdk.flow.ExecutionStep
    public final /* synthetic */ void a(com.discover.mpos.sdk.flow.ExecutionFlow executionFlow, java.lang.Object obj) {
        com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx = (com.discover.mpos.sdk.transaction.execution.TransactionEx) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep.a.a(this, executionFlow, transactionEx);
    }

    @Override // com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep
    public final void a(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.transaction.internal.InternalTransaction> transactionEx) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        transactionEx.a(new com.discover.mpos.sdk.transaction.execution.LinearTransactionExecutionFlow().a((com.discover.mpos.sdk.flow.ExecutionStep) this.f3143a).a((com.discover.mpos.sdk.flow.ExecutionStep) this.b));
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/discover/mpos/sdk/cardreader/kernel/flow/optionalfeature/OptionalFeatureStep$executionStep$1", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionStep;", "Lcom/discover/mpos/sdk/transaction/internal/InternalTransaction;", "execute", "", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.f.a$a */
    public static final class a implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep<com.discover.mpos.sdk.transaction.internal.InternalTransaction> {
        a() {
        }

        @Override // com.discover.mpos.sdk.flow.ExecutionStep
        public final /* synthetic */ void a(com.discover.mpos.sdk.flow.ExecutionFlow executionFlow, java.lang.Object obj) {
            com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx = (com.discover.mpos.sdk.transaction.execution.TransactionEx) obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionFlow, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
            com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep.a.a(this, executionFlow, transactionEx);
        }

        @Override // com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep
        public final void a(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.transaction.internal.InternalTransaction> transactionEx) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
            transactionEx.a(new com.discover.mpos.sdk.cardreader.kernel.flow.optionalfeature.data.OptionalFeatureDataProvider(), new com.discover.mpos.sdk.transaction.execution.LinearTransactionExecutionFlow().a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.kernel.flow.optionalfeature.flow.OptionalFeatureCheckStep()).a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.kernel.flow.optionalfeature.flow.CardFeatureCheckStep()).a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.kernel.flow.optionalfeature.flow.DataStorageCheckStep()).a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.kernel.flow.optionalfeature.flow.ExtendedLoggingSupportedCheckStep()).a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.kernel.flow.optionalfeature.flow.TearingRecoverySupportedCheckStep()));
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/discover/mpos/sdk/cardreader/kernel/flow/optionalfeature/OptionalFeatureStep$loggingStep$1", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionStep;", "Lcom/discover/mpos/sdk/transaction/internal/InternalTransaction;", "execute", "", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.f.a$c */
    public static final class c implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep<com.discover.mpos.sdk.transaction.internal.InternalTransaction> {
        c() {
        }

        @Override // com.discover.mpos.sdk.flow.ExecutionStep
        public final /* synthetic */ void a(com.discover.mpos.sdk.flow.ExecutionFlow executionFlow, java.lang.Object obj) {
            com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx = (com.discover.mpos.sdk.transaction.execution.TransactionEx) obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionFlow, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
            com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep.a.a(this, executionFlow, transactionEx);
        }

        @Override // com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep
        public final void a(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.transaction.internal.InternalTransaction> transactionEx) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
            new java.lang.Object[]{java.lang.Boolean.valueOf(transactionEx.j().y), java.lang.Boolean.valueOf(transactionEx.j().z), java.lang.Boolean.valueOf(transactionEx.j().A)};
            transactionEx.t();
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/discover/mpos/sdk/cardreader/kernel/flow/optionalfeature/OptionalFeatureStep$formFactorIdentifierStep$1", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionStep;", "Lcom/discover/mpos/sdk/transaction/internal/InternalTransaction;", "execute", "", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.f.a$b */
    public static final class b implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep<com.discover.mpos.sdk.transaction.internal.InternalTransaction> {
        b() {
        }

        @Override // com.discover.mpos.sdk.flow.ExecutionStep
        public final /* synthetic */ void a(com.discover.mpos.sdk.flow.ExecutionFlow executionFlow, java.lang.Object obj) {
            com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx = (com.discover.mpos.sdk.transaction.execution.TransactionEx) obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionFlow, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
            com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep.a.a(this, executionFlow, transactionEx);
        }

        @Override // com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep
        public final void a(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.transaction.internal.InternalTransaction> transactionEx) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
            transactionEx.a(new com.discover.mpos.sdk.transaction.execution.LinearTransactionExecutionFlow().a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.kernel.flow.optionalfeature.flow.FormFactorIdentifierCheckStep()));
        }
    }
}
