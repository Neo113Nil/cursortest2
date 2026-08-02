package com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.mandatorychecks.a.mandatorychecktag;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/iap/flow/mandatorychecks/flow/mandatorychecktag/MandatoryCheckTagStep;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionStep;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/iap/flow/mandatorychecks/model/GpoMandatoryCheckData;", "tag", "Lcom/discover/mpos/sdk/core/emv/tlv/Tag;", "validLengthRange", "Lkotlin/ranges/IntRange;", "(Lcom/discover/mpos/sdk/core/emv/tlv/Tag;Lkotlin/ranges/IntRange;)V", "execute", "", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.c.a.b.a.a.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class MandatoryCheckTagStep implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep<com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.mandatorychecks.model.GpoMandatoryCheckData> {

    /* renamed from: a, reason: collision with root package name */
    private final com.discover.mpos.sdk.core.emv.tlv.Tag f3030a;
    private final kotlin.ranges.IntRange b;

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "Lcom/discover/mpos/sdk/card/apdu/gpo/GetProcessingOptionsResponse;", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.c.a.b.a.a.a$a */
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.card.apdu.gpo.GetProcessingOptionsResponse>, kotlin.Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.discover.mpos.sdk.transaction.execution.TransactionEx f3031a;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.card.apdu.gpo.GetProcessingOptionsResponse> transactionEx) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
            this.f3031a.z();
            return kotlin.Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx) {
            super(1);
            this.f3031a = transactionEx;
        }
    }

    public MandatoryCheckTagStep(com.discover.mpos.sdk.core.emv.tlv.Tag tag, kotlin.ranges.IntRange intRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "");
        this.f3030a = tag;
        this.b = intRange;
    }

    @Override // com.discover.mpos.sdk.flow.ExecutionStep
    public final /* synthetic */ void a(com.discover.mpos.sdk.flow.ExecutionFlow executionFlow, java.lang.Object obj) {
        com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx = (com.discover.mpos.sdk.transaction.execution.TransactionEx) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep.a.a(this, executionFlow, transactionEx);
    }

    public /* synthetic */ MandatoryCheckTagStep(com.discover.mpos.sdk.core.emv.tlv.Tag tag) {
        this(tag, null);
    }

    @Override // com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep
    public final void a(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.mandatorychecks.model.GpoMandatoryCheckData> transactionEx) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        transactionEx.a(new com.discover.mpos.sdk.transaction.execution.DataContainerProvider(transactionEx.q().f3033a), new com.discover.mpos.sdk.transaction.execution.LinearTransactionExecutionFlow().a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.mandatorychecks.a.mandatorychecktag.flow.MandatoryCheckTagValidationStep(this.f3030a, this.b)).a((kotlin.jvm.functions.Function1) new com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.mandatorychecks.a.mandatorychecktag.MandatoryCheckTagStep.a(transactionEx)).c());
    }
}
