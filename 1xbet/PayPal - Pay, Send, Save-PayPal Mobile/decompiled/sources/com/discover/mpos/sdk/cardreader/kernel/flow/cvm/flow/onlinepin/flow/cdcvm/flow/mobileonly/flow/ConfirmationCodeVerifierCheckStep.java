package com.discover.mpos.sdk.cardreader.kernel.flow.cvm.flow.onlinepin.flow.cdcvm.flow.mobileonly.flow;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0002J\b\u0010\b\u001a\u00020\tH\u0002J\u0016\u0010\n\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/cvm/flow/onlinepin/flow/cdcvm/flow/mobileonly/flow/ConfirmationCodeVerifierCheckStep;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionStep;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/cvm/flow/onlinepin/flow/cdcvm/flow/mobileonly/model/CdCvmMobileOnlyData;", "()V", "confirmationCvmVerified", "", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "debugTag", "", "execute", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.a.a.a.a.a.a.a.a.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class ConfirmationCodeVerifierCheckStep implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep<com.discover.mpos.sdk.cardreader.kernel.flow.cvm.flow.onlinepin.flow.cdcvm.flow.mobileonly.model.CdCvmMobileOnlyData> {
    @Override // com.discover.mpos.sdk.flow.ExecutionStep
    public final /* synthetic */ void a(com.discover.mpos.sdk.flow.ExecutionFlow executionFlow, java.lang.Object obj) {
        com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx = (com.discover.mpos.sdk.transaction.execution.TransactionEx) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep.a.a(this, executionFlow, transactionEx);
    }

    @Override // com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep
    public final void a(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.cvm.flow.onlinepin.flow.cdcvm.flow.mobileonly.model.CdCvmMobileOnlyData> transactionEx) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.cardreader.kernel.flow.cvm.flow.onlinepin.flow.cdcvm.flow.mobileonly.model.CdCvmMobileOnlyData q = transactionEx.q();
        new java.lang.Object[]{java.lang.Boolean.valueOf(q.b)};
        if (q.b) {
            new java.lang.Object[]{java.lang.Boolean.valueOf(q.f3014a)};
            if (!q.f3014a) {
                transactionEx.j().f = new com.discover.mpos.sdk.transaction.outcome.OutcomeParameters(null, null, com.discover.mpos.sdk.transaction.outcome.CardholderVerificationMethod.CONFIRMATION_CODE_VERIFIED, null, null, null, null, null, null, null, 0L, null, 4091, null);
                transactionEx.s();
                return;
            }
        }
        transactionEx.t();
    }
}
