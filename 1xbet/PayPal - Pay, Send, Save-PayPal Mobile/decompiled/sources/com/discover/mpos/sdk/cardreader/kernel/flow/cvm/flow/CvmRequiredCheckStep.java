package com.discover.mpos.sdk.cardreader.kernel.flow.cvm.flow;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016J\u0016\u0010\n\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0002¨\u0006\u000b"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/cvm/flow/CvmRequiredCheckStep;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionStep;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/cvm/model/CardholderVerificationMethodData;", "()V", "debugTag", "", "execute", "", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "setCvmWasPerformed", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.a.a.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class CvmRequiredCheckStep implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep<com.discover.mpos.sdk.cardreader.kernel.flow.cvm.model.CardholderVerificationMethodData> {
    @Override // com.discover.mpos.sdk.flow.ExecutionStep
    public final /* synthetic */ void a(com.discover.mpos.sdk.flow.ExecutionFlow executionFlow, java.lang.Object obj) {
        com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx = (com.discover.mpos.sdk.transaction.execution.TransactionEx) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep.a.a(this, executionFlow, transactionEx);
    }

    @Override // com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep
    public final void a(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.cvm.model.CardholderVerificationMethodData> transactionEx) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        boolean isCvmRequired = transactionEx.q().f3017a.isCvmRequired();
        new java.lang.Object[]{java.lang.Boolean.valueOf(isCvmRequired)};
        if (isCvmRequired) {
            b(transactionEx);
            return;
        }
        com.discover.mpos.sdk.cardreader.kernel.flow.cvm.model.CardProcessingRequirements cardProcessingRequirements = transactionEx.q().b;
        new java.lang.Object[]{java.lang.Boolean.valueOf(cardProcessingRequirements.a()), java.lang.Boolean.valueOf(cardProcessingRequirements.b())};
        if (cardProcessingRequirements.a() || cardProcessingRequirements.b()) {
            b(transactionEx);
        } else {
            transactionEx.s();
        }
    }

    private static void b(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.cvm.model.CardholderVerificationMethodData> transactionEx) {
        transactionEx.q().c.a();
        transactionEx.t();
    }
}
