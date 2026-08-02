package com.discover.mpos.sdk.cardreader.kernel.flow.pdolmandatorychecks.flow;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0016\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/pdolmandatorychecks/flow/PdolMandatoryCheckStep;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionStep;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/pdol/PdolCheckData;", "mandatoryTags", "", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/pdol/PdolCheckTag;", "(Ljava/util/List;)V", "debugTag", "", "execute", "", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.h.a.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class PdolMandatoryCheckStep implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep<com.discover.mpos.sdk.cardreader.kernel.flow.pdol.PdolCheckData> {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.List<com.discover.mpos.sdk.cardreader.kernel.flow.pdol.PdolCheckTag> f3154a;

    private PdolMandatoryCheckStep(java.util.List<com.discover.mpos.sdk.cardreader.kernel.flow.pdol.PdolCheckTag> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.f3154a = list;
    }

    @Override // com.discover.mpos.sdk.flow.ExecutionStep
    public final /* synthetic */ void a(com.discover.mpos.sdk.flow.ExecutionFlow executionFlow, java.lang.Object obj) {
        com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx = (com.discover.mpos.sdk.transaction.execution.TransactionEx) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep.a.a(this, executionFlow, transactionEx);
    }

    @Override // com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep
    public final void a(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.pdol.PdolCheckData> transactionEx) {
        com.discover.mpos.sdk.transaction.processing.pdol.PdolTag pdolTag;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.cardreader.kernel.flow.pdol.PdolCheckData q = transactionEx.q();
        for (com.discover.mpos.sdk.cardreader.kernel.flow.pdol.PdolCheckTag pdolCheckTag : this.f3154a) {
            com.discover.mpos.sdk.transaction.processing.pdol.Pdol a2 = q.f3148a.a(pdolCheckTag.c);
            com.discover.mpos.sdk.core.emv.tlv.Tlv a3 = transactionEx.j().a(pdolCheckTag.c);
            byte[] content = a3 != null ? a3.getContent() : null;
            if (a2 != null && pdolCheckTag.a(a2.f3272a.c) && content != null) {
                new java.lang.Object[]{pdolCheckTag.f3149a, pdolCheckTag.c};
                a2.b = content;
            } else {
                java.lang.String str = pdolCheckTag.f3149a;
                java.lang.String str2 = pdolCheckTag.c;
                int i = 0;
                boolean z = a2 != null;
                if (a2 != null && (pdolTag = a2.f3272a) != null) {
                    i = pdolTag.c;
                }
                new java.lang.Object[]{str, str2, java.lang.Boolean.valueOf(z), java.lang.Boolean.valueOf(pdolCheckTag.a(i))};
                transactionEx.z();
                return;
            }
        }
        transactionEx.t();
    }

    public /* synthetic */ PdolMandatoryCheckStep() {
        this(com.discover.mpos.sdk.cardreader.kernel.flow.pdol.PdolTags.f3151a);
    }
}
