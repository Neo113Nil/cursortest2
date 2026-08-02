package com.discover.mpos.sdk.cardreader.kernel.flow.oda.flow;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0016\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016J\u0016\u0010\r\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0002¨\u0006\u000f"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/oda/flow/CaPublicKeyIndexRetrieveStep;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionStep;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/oda/model/OfflineDataAuthenticationData;", "()V", "areMandatoryFieldsPresent", "", "inputData", "debugTag", "", "execute", "", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "onCdaFailed", "tx", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.d.b.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class CaPublicKeyIndexRetrieveStep implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep<com.discover.mpos.sdk.cardreader.kernel.flow.oda.model.OfflineDataAuthenticationData> {
    @Override // com.discover.mpos.sdk.flow.ExecutionStep
    public final /* synthetic */ void a(com.discover.mpos.sdk.flow.ExecutionFlow executionFlow, java.lang.Object obj) {
        com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx = (com.discover.mpos.sdk.transaction.execution.TransactionEx) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep.a.a(this, executionFlow, transactionEx);
    }

    @Override // com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep
    public final void a(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.oda.model.OfflineDataAuthenticationData> transactionEx) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.transaction.processing.terminalverificationresults.TerminalVerificationResults h = transactionEx.j().h();
        com.discover.mpos.sdk.transaction.processing.transactionstatusinformation.TransactionStatusInformation i = transactionEx.j().i();
        boolean z = false;
        h.a(false);
        i.f3278a.setBitValue(com.discover.mpos.sdk.core.data.ByteInfo.BitIndex.EIGHTH, true);
        new java.lang.Object[]{h, i};
        com.discover.mpos.sdk.cardreader.kernel.flow.oda.model.OfflineDataAuthenticationData q = transactionEx.q();
        if (q.m.getContent() != null && q.h.getContent() != null && q.i.getContent() != null && q.k.getContent() != null && q.l.getContent() != null) {
            z = true;
        }
        new java.lang.Object[]{q.m.getContent()};
        new java.lang.Object[]{q.h.getContent()};
        new java.lang.Object[]{q.i.getContent()};
        new java.lang.Object[]{q.k.getContent()};
        new java.lang.Object[]{q.l.getContent()};
        if (z) {
            com.discover.mpos.sdk.data.external.TerminalCAPublicKey terminalCAPublicKey = transactionEx.q().f3129o;
            if (terminalCAPublicKey != null) {
                new java.lang.Object[]{transactionEx.q().n};
                new java.lang.Object[]{transactionEx.q().m.getContent()};
                new java.lang.Object[]{terminalCAPublicKey.getPublicKeyModulus()};
                new java.lang.Object[]{terminalCAPublicKey.getExponent()};
                transactionEx.t();
                return;
            }
            new java.lang.Object[]{transactionEx.q().n, transactionEx.q().m.getContent()};
        }
        com.discover.mpos.sdk.transaction.processing.terminalverificationresults.TerminalVerificationResults h2 = transactionEx.j().h();
        h2.e();
        h2.b();
        new java.lang.Object[]{h2};
        transactionEx.s();
    }
}
