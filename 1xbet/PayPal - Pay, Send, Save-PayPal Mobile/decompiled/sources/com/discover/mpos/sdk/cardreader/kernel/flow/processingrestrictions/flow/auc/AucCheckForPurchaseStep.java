package com.discover.mpos.sdk.cardreader.kernel.flow.processingrestrictions.flow.auc;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/processingrestrictions/flow/auc/AucCheckForPurchaseStep;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionStep;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/processingrestrictions/flow/auc/AucData;", "()V", "debugTag", "", "execute", "", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.j.a.a.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class AucCheckForPurchaseStep implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep<com.discover.mpos.sdk.cardreader.kernel.flow.processingrestrictions.flow.auc.AucData> {
    @Override // com.discover.mpos.sdk.flow.ExecutionStep
    public final /* synthetic */ void a(com.discover.mpos.sdk.flow.ExecutionFlow executionFlow, java.lang.Object obj) {
        com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx = (com.discover.mpos.sdk.transaction.execution.TransactionEx) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep.a.a(this, executionFlow, transactionEx);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
    
        if (r0.b.d == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003d, code lost:
    
        if (r0.b.c == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0060, code lost:
    
        r0 = true;
     */
    @Override // com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.processingrestrictions.flow.auc.AucData> transactionEx) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.cardreader.kernel.flow.processingrestrictions.flow.auc.AucData q = transactionEx.q();
        com.discover.mpos.sdk.transaction.processing.terminalverificationresults.TerminalVerificationResults h = transactionEx.j().h();
        new java.lang.Object[]{java.lang.Boolean.valueOf(q.f3161a)};
        if (q.f3161a) {
            new java.lang.Object[]{java.lang.Boolean.valueOf(q.b.f3164a), java.lang.Boolean.valueOf(q.b.c)};
            if (!q.b.f3164a) {
            }
            z = false;
        } else {
            new java.lang.Object[]{java.lang.Boolean.valueOf(q.b.b), java.lang.Boolean.valueOf(q.b.d)};
            if (!q.b.b) {
            }
            z = false;
        }
        new java.lang.Object[]{java.lang.Boolean.valueOf(z)};
        h.b(z);
    }
}
