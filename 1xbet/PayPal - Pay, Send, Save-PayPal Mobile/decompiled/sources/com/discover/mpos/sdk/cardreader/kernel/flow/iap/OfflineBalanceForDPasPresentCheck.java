package com.discover.mpos.sdk.cardreader.kernel.flow.iap;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\u0016\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/iap/OfflineBalanceForDPasPresentCheck;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionStep;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/iap/flow/otherchecks/flow/model/OtherChecksData;", "()V", "requiredTagContentLength", "", "debugTag", "", "execute", "", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.c.b, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class OfflineBalanceForDPasPresentCheck implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep<com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.otherchecks.flow.model.OtherChecksData> {

    /* renamed from: a, reason: collision with root package name */
    private final int f3043a = 6;

    @Override // com.discover.mpos.sdk.flow.ExecutionStep
    public final /* synthetic */ void a(com.discover.mpos.sdk.flow.ExecutionFlow executionFlow, java.lang.Object obj) {
        com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx = (com.discover.mpos.sdk.transaction.execution.TransactionEx) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep.a.a(this, executionFlow, transactionEx);
    }

    @Override // com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep
    public final void a(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.otherchecks.flow.model.OtherChecksData> transactionEx) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.core.emv.tlv.Tlv a2 = transactionEx.q().a(com.discover.mpos.sdk.core.emv.tlv.Tag.OFFLINE_BALANCE_FOR_D_PAS.getTag());
        boolean z = a2.getContent() == null;
        boolean z2 = a2.getLength() == this.f3043a;
        new java.lang.Object[]{com.discover.mpos.sdk.core.emv.tlv.Tag.OFFLINE_BALANCE_FOR_D_PAS.getTag(), java.lang.Boolean.valueOf(!z), java.lang.Integer.valueOf(a2.getLength()), java.lang.Boolean.valueOf(z2)};
        if (z || z2) {
            transactionEx.t();
        } else {
            com.discover.mpos.sdk.transaction.execution.TransactionFlowHandler.a.a(transactionEx, com.discover.mpos.sdk.transaction.execution.TransactionEndStatus.b, null, false, 6);
        }
    }
}
