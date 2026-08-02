package com.discover.mpos.sdk.cardreader.entrypoint.flow.preprocessing.steps;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016J\"\u0010\u000b\u001a\u00020\b2\u0018\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e0\rH\u0002¨\u0006\u0011"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/entrypoint/flow/preprocessing/steps/TerminalTransactionQualifiersCopyStep;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionStep;", "Lcom/discover/mpos/sdk/transaction/processing/PreProcessingData;", "()V", "createTtqForIndicators", "Lcom/discover/mpos/sdk/cardreader/config/TerminalTransactionQualifiers;", "source", "execute", "", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "log", "preProcessingIndicators", "", "Lkotlin/Pair;", "Lcom/discover/mpos/sdk/cardreader/config/CombinationConfiguration;", "Lcom/discover/mpos/sdk/transaction/processing/PreProcessingIndicators;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.entrypoint.a.b.a.h, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class TerminalTransactionQualifiersCopyStep implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep<com.discover.mpos.sdk.transaction.processing.PreProcessingData> {
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
        java.util.Iterator<T> it = transactionEx.q().f3271a.iterator();
        while (it.hasNext()) {
            kotlin.Pair pair = (kotlin.Pair) it.next();
            com.discover.mpos.sdk.cardreader.config.CombinationConfiguration combinationConfiguration = (com.discover.mpos.sdk.cardreader.config.CombinationConfiguration) pair.getFirst();
            com.discover.mpos.sdk.transaction.processing.PreProcessingIndicators preProcessingIndicators = (com.discover.mpos.sdk.transaction.processing.PreProcessingIndicators) pair.getSecond();
            com.discover.mpos.sdk.cardreader.config.TerminalTransactionQualifiers terminalTransactionQualifiers = combinationConfiguration.getTerminalTransactionQualifiers();
            if (terminalTransactionQualifiers != null) {
                com.discover.mpos.sdk.cardreader.config.TerminalTransactionQualifiers copy = terminalTransactionQualifiers.copy();
                copy.setCvmRequired(false);
                copy.setOnlineCryptogramRequired(false);
                preProcessingIndicators.setTerminalTransactionQualifiers(copy);
            }
        }
        transactionEx.q();
        transactionEx.t();
    }
}
