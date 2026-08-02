package com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.otherchecks.flow.tvrflow;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/iap/flow/otherchecks/flow/tvrflow/CheckOnlineDeclineDecisionTVRStep;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionStep;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/iap/flow/otherchecks/flow/model/OtherChecksData;", "tlvTag", "Lcom/discover/mpos/sdk/core/emv/tlv/Tag;", "validLengthRange", "Lkotlin/ranges/IntRange;", "(Lcom/discover/mpos/sdk/core/emv/tlv/Tag;Lkotlin/ranges/IntRange;)V", "execute", "", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.c.a.c.a.d.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class CheckOnlineDeclineDecisionTVRStep implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep<com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.otherchecks.flow.model.OtherChecksData> {

    /* renamed from: a, reason: collision with root package name */
    private final com.discover.mpos.sdk.core.emv.tlv.Tag f3039a;
    private final kotlin.ranges.IntRange b;

    public CheckOnlineDeclineDecisionTVRStep(com.discover.mpos.sdk.core.emv.tlv.Tag tag, kotlin.ranges.IntRange intRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "");
        this.f3039a = tag;
        this.b = intRange;
    }

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
        transactionEx.a(new com.discover.mpos.sdk.transaction.execution.DataContainerProvider(transactionEx.q()), new com.discover.mpos.sdk.transaction.execution.LinearTransactionExecutionFlow().a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.otherchecks.flow.tvrflow.TVRFlowValidationTagStep(this.f3039a, this.b)).a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.otherchecks.flow.tvrflow.UpdateICCdataMissingStep()));
    }
}
