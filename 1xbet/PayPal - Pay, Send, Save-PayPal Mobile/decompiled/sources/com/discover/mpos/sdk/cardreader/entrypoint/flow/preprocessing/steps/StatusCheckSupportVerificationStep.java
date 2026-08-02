package com.discover.mpos.sdk.cardreader.entrypoint.flow.preprocessing.steps;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016J\"\u0010\n\u001a\u00020\u00072\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r0\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/entrypoint/flow/preprocessing/steps/StatusCheckSupportVerificationStep;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionStep;", "Lcom/discover/mpos/sdk/transaction/processing/PreProcessingData;", "()V", "singleUnitOfCurrency", "", "execute", "", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "log", "preProcessingIndicators", "", "Lkotlin/Pair;", "Lcom/discover/mpos/sdk/cardreader/config/CombinationConfiguration;", "Lcom/discover/mpos/sdk/transaction/processing/PreProcessingIndicators;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.entrypoint.a.b.a.g, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class StatusCheckSupportVerificationStep implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep<com.discover.mpos.sdk.transaction.processing.PreProcessingData> {

    /* renamed from: a, reason: collision with root package name */
    private final double f2996a = 1.0d;

    @Override // com.discover.mpos.sdk.flow.ExecutionStep
    public final /* synthetic */ void a(com.discover.mpos.sdk.flow.ExecutionFlow executionFlow, java.lang.Object obj) {
        com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx = (com.discover.mpos.sdk.transaction.execution.TransactionEx) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep.a.a(this, executionFlow, transactionEx);
    }

    @Override // com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep
    public final void a(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.transaction.processing.PreProcessingData> transactionEx) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.transaction.processing.PreProcessingData q = transactionEx.q();
        java.util.Iterator<T> it = q.f3271a.iterator();
        while (it.hasNext()) {
            kotlin.Pair pair = (kotlin.Pair) it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.discover.mpos.sdk.cardreader.config.CombinationConfiguration) pair.getFirst()).getStatusCheckSupported(), java.lang.Boolean.TRUE) && q.b.getAmountAuthorized().isEqualTo(this.f2996a)) {
                ((com.discover.mpos.sdk.transaction.processing.PreProcessingIndicators) pair.getSecond()).setStatusCheckRequestedFlag(true);
                ((com.discover.mpos.sdk.transaction.processing.PreProcessingIndicators) pair.getSecond()).getStatusCheckRequestedFlag();
            }
        }
        transactionEx.t();
    }
}
