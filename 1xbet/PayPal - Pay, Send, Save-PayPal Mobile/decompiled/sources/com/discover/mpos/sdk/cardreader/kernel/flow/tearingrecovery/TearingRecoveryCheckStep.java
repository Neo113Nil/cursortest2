package com.discover.mpos.sdk.cardreader.kernel.flow.tearingrecovery;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0002J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\u0016\u0010\u000b\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0002¨\u0006\u0013"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/tearingrecovery/TearingRecoveryCheckStep;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionStep;", "Lcom/discover/mpos/sdk/transaction/internal/InternalTransaction;", "()V", "checkTearingLog", "", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "checkTearingRecoveryFlag", "debugTag", "", "execute", "getTearingRecoveryMatchingData", "Lcom/discover/mpos/sdk/data/TearingRecoveryLogMatchingData;", "processingData", "Lcom/discover/mpos/sdk/transaction/processing/ProcessingData;", "matchAidAndCardFeatureDescriptor", "tearingRecoveryStorage", "Lcom/discover/mpos/sdk/data/TearingRecoveryStorage;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.l.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class TearingRecoveryCheckStep implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep<com.discover.mpos.sdk.transaction.internal.InternalTransaction> {
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
        com.discover.mpos.sdk.transaction.processing.ProcessingData j = transactionEx.j();
        j.i = false;
        new java.lang.Object[]{java.lang.Boolean.valueOf(j.i)};
        boolean p = transactionEx.j().p();
        new java.lang.Object[]{java.lang.Boolean.valueOf(p)};
        if (p) {
            boolean z = transactionEx.j().A;
            new java.lang.Object[]{java.lang.Boolean.valueOf(z)};
            if (z) {
                com.discover.mpos.sdk.data.TearingRecoveryStorage n = transactionEx.n();
                new java.lang.Object[]{n};
                if (!n.d()) {
                    com.discover.mpos.sdk.transaction.processing.ProcessingData j2 = transactionEx.j();
                    com.discover.mpos.sdk.cardreader.entrypoint.model.Candidate candidate = j2.h.c;
                    if (n.a(new com.discover.mpos.sdk.data.TearingRecoveryLogMatchingData(candidate != null ? candidate.getAid() : null, j2.s(), j2.t()))) {
                        n.a(j2.e());
                        j2.i = true;
                        new java.lang.Object[]{java.lang.Boolean.valueOf(j2.i)};
                    } else {
                        n.clear();
                    }
                }
            }
        }
        transactionEx.t();
    }
}
