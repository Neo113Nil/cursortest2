package com.discover.mpos.sdk.cardreader.kernel.flow.terminalactionanalysis.flow;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\u0016\u0010\u000b\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0016¨\u0006\f"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/terminalactionanalysis/flow/OdaStatusVerificationStep;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionStep;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/terminalactionanalysis/model/TerminalActionAnalysisData;", "()V", "checkIfCdaIsFailing", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "debugTag", "", "execute", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.m.a.e, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class OdaStatusVerificationStep implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep<com.discover.mpos.sdk.cardreader.kernel.flow.terminalactionanalysis.model.TerminalActionAnalysisData> {
    @Override // com.discover.mpos.sdk.flow.ExecutionStep
    public final /* synthetic */ void a(com.discover.mpos.sdk.flow.ExecutionFlow executionFlow, java.lang.Object obj) {
        com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx = (com.discover.mpos.sdk.transaction.execution.TransactionEx) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep.a.a(this, executionFlow, transactionEx);
    }

    @Override // com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep
    public final void a(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.terminalactionanalysis.model.TerminalActionAnalysisData> transactionEx) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.cardreader.kernel.flow.terminalactionanalysis.model.TerminalActionAnalysisData q = transactionEx.q();
        new java.lang.Object[]{java.lang.Boolean.valueOf(q.e)};
        if (!q.e) {
            transactionEx.t();
            return;
        }
        new java.lang.Object[]{java.lang.Boolean.valueOf(q.c), java.lang.Boolean.valueOf(q.d)};
        if (!q.c && !q.d) {
            transactionEx.t();
            return;
        }
        new java.lang.Object[]{java.lang.Boolean.valueOf(q.f)};
        if (q.f) {
            transactionEx.A();
            return;
        }
        new java.lang.Object[]{java.lang.Boolean.valueOf(q.g)};
        if (q.g) {
            transactionEx.w();
        } else {
            transactionEx.t();
        }
    }
}
