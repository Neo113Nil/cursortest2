package com.discover.mpos.sdk.cardreader.entrypoint.flow.preprocessing.steps;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\"\u0010\r\u001a\u00020\u00052\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u00100\u000fH\u0002J\u0018\u0010\u0012\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002¨\u0006\u0013"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/entrypoint/flow/preprocessing/steps/FinalTtqModificationsStep;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionStep;", "Lcom/discover/mpos/sdk/transaction/processing/PreProcessingData;", "()V", "execute", "", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "handleZeroAmountFlagPresence", "ppi", "Lcom/discover/mpos/sdk/transaction/processing/PreProcessingIndicators;", "ttq", "Lcom/discover/mpos/sdk/cardreader/config/TerminalTransactionQualifiers;", "log", "preProcessingIndicators", "", "Lkotlin/Pair;", "Lcom/discover/mpos/sdk/cardreader/config/CombinationConfiguration;", "updateTTQ", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.entrypoint.a.b.a.b, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class FinalTtqModificationsStep implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep<com.discover.mpos.sdk.transaction.processing.PreProcessingData> {
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
            com.discover.mpos.sdk.cardreader.config.TerminalTransactionQualifiers terminalTransactionQualifiers = ((com.discover.mpos.sdk.transaction.processing.PreProcessingIndicators) pair.getSecond()).getTerminalTransactionQualifiers();
            if (terminalTransactionQualifiers != null) {
                com.discover.mpos.sdk.transaction.processing.PreProcessingIndicators preProcessingIndicators = (com.discover.mpos.sdk.transaction.processing.PreProcessingIndicators) pair.getSecond();
                if (preProcessingIndicators.getReaderContactlessFloorLimitExceeded() || preProcessingIndicators.getStatusCheckRequestedFlag()) {
                    if (terminalTransactionQualifiers.getIsReaderOfflineOnly()) {
                        preProcessingIndicators.setContactlessApplicationNotAllowedFlag(true);
                    } else {
                        terminalTransactionQualifiers.setOnlineCryptogramRequired(true);
                    }
                }
                if (preProcessingIndicators.getZeroAmountFlag()) {
                    if (terminalTransactionQualifiers.getIsReaderOfflineOnly()) {
                        preProcessingIndicators.setContactlessApplicationNotAllowedFlag(true);
                    } else {
                        terminalTransactionQualifiers.setOnlineCryptogramRequired(true);
                    }
                }
                if (preProcessingIndicators.getReaderCVMRequiredLimitExceeded()) {
                    terminalTransactionQualifiers.setCvmRequired(true);
                }
            }
        }
        transactionEx.q();
        transactionEx.t();
    }
}
