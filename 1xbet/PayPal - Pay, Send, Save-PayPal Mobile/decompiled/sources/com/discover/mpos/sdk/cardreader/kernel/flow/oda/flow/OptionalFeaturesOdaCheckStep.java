package com.discover.mpos.sdk.cardreader.kernel.flow.oda.flow;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0002J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016J\u0016\u0010\u000b\u001a\u00020\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0002J\u0016\u0010\r\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0002¨\u0006\u000e"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/oda/flow/OptionalFeaturesOdaCheckStep;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionStep;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/oda/model/OfflineDataAuthenticationData;", "()V", "cdaFailed", "", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "debugTag", "", "execute", "verifyDsdHash", "", "verifyFeatureDescriptor", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.d.b.b, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class OptionalFeaturesOdaCheckStep implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep<com.discover.mpos.sdk.cardreader.kernel.flow.oda.model.OfflineDataAuthenticationData> {
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
        com.discover.mpos.sdk.transaction.processing.ProcessingData j = transactionEx.j();
        if (!j.y) {
            new java.lang.Object[]{java.lang.Boolean.valueOf(j.z)};
            if (j.z) {
                b(transactionEx);
                return;
            } else {
                transactionEx.t();
                return;
            }
        }
        boolean equals = java.util.Arrays.equals(transactionEx.j().c().d, transactionEx.q().c);
        new java.lang.Object[]{transactionEx.q().c};
        new java.lang.Object[]{transactionEx.j().c().d, java.lang.Boolean.valueOf(equals)};
        if (equals) {
            b(transactionEx);
        } else {
            c(transactionEx);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (java.util.Arrays.equals(r2, r1) != true) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.oda.model.OfflineDataAuthenticationData> transactionEx) {
        com.discover.mpos.sdk.transaction.processing.ProcessingData j = transactionEx.j();
        com.discover.mpos.sdk.core.emv.tlv.Tlv d = j.d(com.discover.mpos.sdk.core.emv.tlv.Tag.CARD_ID.getTag());
        byte[] content = d != null ? d.getContent() : null;
        com.discover.mpos.sdk.cardreader.kernel.flow.optionalfeature.data.CardFeatureDescriptor s = j.s();
        byte[] bArr = s != null ? s.c : null;
        boolean z = (content == null || bArr == null) ? false : true;
        new java.lang.Object[]{content};
        new java.lang.Object[]{bArr};
        new java.lang.Object[]{java.lang.Boolean.valueOf(z)};
        if (z) {
            transactionEx.t();
        } else {
            c(transactionEx);
        }
    }

    private static void c(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.oda.model.OfflineDataAuthenticationData> transactionEx) {
        com.discover.mpos.sdk.transaction.processing.terminalverificationresults.TerminalVerificationResults h = transactionEx.j().h();
        h.e();
        new java.lang.Object[]{h};
        transactionEx.s();
    }
}
