package com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.flow;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/entrypoint/flow/combinationselection/flow/SelectPpseStep;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionStep;", "Lcom/discover/mpos/sdk/cardreader/entrypoint/flow/combinationselection/data/CombinationSelectionData;", "()V", "ppseDdfName", "", "debugTag", "execute", "", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.entrypoint.a.a.b.b, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class SelectPpseStep implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep<com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.data.CombinationSelectionData> {

    /* renamed from: a, reason: collision with root package name */
    final java.lang.String f2992a = "2PAY.SYS.DDF01";

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "invoke", "(Lkotlin/Unit;)V"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.entrypoint.a.a.b.b$b */
    static final class b extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<kotlin.Unit, kotlin.Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.discover.mpos.sdk.transaction.execution.TransactionEx f2994a;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(kotlin.Unit unit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "");
            this.f2994a.t();
            return kotlin.Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx) {
            super(1);
            this.f2994a = transactionEx;
        }
    }

    @Override // com.discover.mpos.sdk.flow.ExecutionStep
    public final /* synthetic */ void a(com.discover.mpos.sdk.flow.ExecutionFlow executionFlow, java.lang.Object obj) {
        com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx = (com.discover.mpos.sdk.transaction.execution.TransactionEx) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep.a.a(this, executionFlow, transactionEx);
    }

    @Override // com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep
    public final void a(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.data.CombinationSelectionData> transactionEx) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.transaction.execution.TransactionEx.a(transactionEx, new com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.flow.SelectPpseStep.a(transactionEx, transactionEx.q()), new com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.flow.SelectPpseStep.b(transactionEx), 4);
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.entrypoint.a.a.b.b$a */
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlin.Unit> {
        final /* synthetic */ com.discover.mpos.sdk.transaction.execution.TransactionEx b;
        final /* synthetic */ com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.data.CombinationSelectionData c;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ kotlin.Unit invoke() {
            com.discover.mpos.sdk.card.apdu.g.ppse.SelectPPSEResponse b = this.b.i().b(com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.flow.SelectPpseStep.this.f2992a);
            com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.data.CombinationSelectionData combinationSelectionData = this.c;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b, "");
            combinationSelectionData.f2986a = b;
            new java.lang.Object[]{b};
            return kotlin.Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx, com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.data.CombinationSelectionData combinationSelectionData) {
            super(0);
            this.b = transactionEx;
            this.c = combinationSelectionData;
        }
    }
}
