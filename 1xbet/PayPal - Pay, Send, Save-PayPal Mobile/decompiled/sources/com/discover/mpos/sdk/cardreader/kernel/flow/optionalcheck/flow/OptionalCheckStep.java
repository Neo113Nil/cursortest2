package com.discover.mpos.sdk.cardreader.kernel.flow.optionalcheck.flow;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016J\u001e\u0010\n\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0002¨\u0006\r"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/optionalcheck/flow/OptionalCheckStep;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionStep;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/pdol/PdolCheckData;", "()V", "debugTag", "", "execute", "", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "validateTag", "pdolTag", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/pdol/PdolCheckTag;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.e.a.c, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class OptionalCheckStep implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep<com.discover.mpos.sdk.cardreader.kernel.flow.pdol.PdolCheckData> {
    @Override // com.discover.mpos.sdk.flow.ExecutionStep
    public final /* synthetic */ void a(com.discover.mpos.sdk.flow.ExecutionFlow executionFlow, java.lang.Object obj) {
        com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx = (com.discover.mpos.sdk.transaction.execution.TransactionEx) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep.a.a(this, executionFlow, transactionEx);
    }

    @Override // com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep
    public final void a(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.pdol.PdolCheckData> transactionEx) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        for (com.discover.mpos.sdk.cardreader.kernel.flow.pdol.PdolCheckTag pdolCheckTag : com.discover.mpos.sdk.cardreader.kernel.flow.pdol.PdolTags.b) {
            com.discover.mpos.sdk.core.emv.tlv.Tlv a2 = transactionEx.j().a(pdolCheckTag.c);
            if (a2 == null) {
                a2 = new com.discover.mpos.sdk.core.emv.tlv.Tlv(pdolCheckTag.c, null, 0, 0, 14, null);
            }
            if (new com.discover.mpos.sdk.card.apdu.h.validators.DefaultTlvValidator(new com.discover.mpos.sdk.card.apdu.h.validators.TlvLengthValidator(pdolCheckTag.b), "OptionalCheckStep").isValid(a2)) {
                com.discover.mpos.sdk.transaction.processing.pdol.Pdol a3 = transactionEx.j().e().a(pdolCheckTag.c);
                if (a3 != null) {
                    a3.b = a2.getContent();
                }
                new java.lang.Object[]{a2};
            } else {
                new java.lang.Object[]{a2};
            }
        }
        transactionEx.t();
    }
}
