package com.discover.mpos.sdk.cardreader.kernel.flow.validatechoice.flow;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0002J\u0016\u0010\n\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016¨\u0006\f"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/validatechoice/flow/CidValidateChoiceStep;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionStep;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/validatechoice/flow/model/ValidateChoiceData;", "()V", "debugTag", "", "deferredAuthorizationCheck", "", "tx", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "execute", "transaction", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.n.a.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class CidValidateChoiceStep implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep<com.discover.mpos.sdk.cardreader.kernel.flow.validatechoice.flow.model.ValidateChoiceData> {
    @Override // com.discover.mpos.sdk.flow.ExecutionStep
    public final /* synthetic */ void a(com.discover.mpos.sdk.flow.ExecutionFlow executionFlow, java.lang.Object obj) {
        com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx = (com.discover.mpos.sdk.transaction.execution.TransactionEx) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep.a.a(this, executionFlow, transactionEx);
    }

    @Override // com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep
    public final void a(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.validatechoice.flow.model.ValidateChoiceData> transactionEx) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        boolean z = transactionEx.q().f3177a;
        new java.lang.Object[]{java.lang.Boolean.valueOf(z)};
        if (z) {
            boolean z2 = transactionEx.q().b;
            new java.lang.Object[]{java.lang.Boolean.valueOf(z2)};
            if (z2) {
                transactionEx.v();
                return;
            } else {
                b(transactionEx);
                return;
            }
        }
        boolean z3 = transactionEx.q().c;
        new java.lang.Object[]{java.lang.Boolean.valueOf(z3)};
        if (z3) {
            b(transactionEx);
        } else {
            transactionEx.t();
        }
    }

    private static void b(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.validatechoice.flow.model.ValidateChoiceData> transactionEx) {
        boolean z = transactionEx.q().d;
        new java.lang.Object[]{java.lang.Boolean.valueOf(z)};
        if (z) {
            transactionEx.t();
        } else {
            transactionEx.x();
        }
    }
}
