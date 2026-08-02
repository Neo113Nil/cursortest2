package com.discover.mpos.sdk.cardreader.entrypoint.flow.protocolactivation.steps;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/entrypoint/flow/protocolactivation/steps/ConnectionAvailabilityStep;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionStep;", "Lcom/discover/mpos/sdk/cardreader/entrypoint/flow/protocolactivation/ProtocolActivationData;", "()V", "debugTag", "", "execute", "", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.entrypoint.a.c.a.b, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class ConnectionAvailabilityStep implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep<com.discover.mpos.sdk.cardreader.entrypoint.flow.protocolactivation.ProtocolActivationData> {
    @Override // com.discover.mpos.sdk.flow.ExecutionStep
    public final /* synthetic */ void a(com.discover.mpos.sdk.flow.ExecutionFlow executionFlow, java.lang.Object obj) {
        com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx = (com.discover.mpos.sdk.transaction.execution.TransactionEx) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep.a.a(this, executionFlow, transactionEx);
    }

    @Override // com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep
    public final void a(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.entrypoint.flow.protocolactivation.ProtocolActivationData> transactionEx) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        transactionEx.i().a(new com.discover.mpos.sdk.cardreader.entrypoint.flow.protocolactivation.steps.ConnectionAvailabilityStep.a(transactionEx.a(transactionEx.q().e, new com.discover.mpos.sdk.cardreader.entrypoint.flow.protocolactivation.steps.ConnectionAvailabilityStep.b(transactionEx)), transactionEx));
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/discover/mpos/sdk/cardreader/entrypoint/flow/protocolactivation/steps/ConnectionAvailabilityStep$execute$1", "Lcom/discover/mpos/sdk/card/OnCardPresentedCallback;", "onCardPresented", "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.entrypoint.a.c.a.b$a */
    public static final class a implements com.discover.mpos.sdk.card.OnCardPresentedCallback {
        final /* synthetic */ com.discover.mpos.sdk.core.concurent.DiscoverJob b;
        final /* synthetic */ com.discover.mpos.sdk.transaction.execution.TransactionEx c;

        a(com.discover.mpos.sdk.core.concurent.DiscoverJob discoverJob, com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx) {
            this.b = discoverJob;
            this.c = transactionEx;
        }

        @Override // com.discover.mpos.sdk.card.OnCardPresentedCallback
        public final void a() {
            this.b.cancel();
            this.c.g();
            this.c.t();
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.entrypoint.a.c.a.b$b */
    static final class b extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlin.Unit> {
        final /* synthetic */ com.discover.mpos.sdk.transaction.execution.TransactionEx b;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ kotlin.Unit invoke() {
            new java.lang.Object[]{com.discover.mpos.sdk.cardreader.entrypoint.flow.protocolactivation.steps.ConnectionAvailabilityStep.this};
            com.discover.mpos.sdk.transaction.execution.TransactionFlowHandler.a.a(this.b, com.discover.mpos.sdk.transaction.execution.TransactionEndStatus.b, null, false, 6);
            return kotlin.Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx) {
            super(0);
            this.b = transactionEx;
        }
    }
}
