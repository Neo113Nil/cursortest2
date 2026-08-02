package com.discover.mpos.sdk.cardreader.entrypoint.flow.protocolactivation.steps;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/entrypoint/flow/protocolactivation/steps/TransactionRestartCheckStep;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionStep;", "Lcom/discover/mpos/sdk/cardreader/entrypoint/flow/protocolactivation/ProtocolActivationData;", "()V", "msFactor", "", "noDelay", "", "execute", "", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.entrypoint.a.c.a.c, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class TransactionRestartCheckStep implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep<com.discover.mpos.sdk.cardreader.entrypoint.flow.protocolactivation.ProtocolActivationData> {

    /* renamed from: a, reason: collision with root package name */
    private final long f3003a;
    private final int b = 100;

    @Override // com.discover.mpos.sdk.flow.ExecutionStep
    public final /* synthetic */ void a(com.discover.mpos.sdk.flow.ExecutionFlow executionFlow, java.lang.Object obj) {
        com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx = (com.discover.mpos.sdk.transaction.execution.TransactionEx) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep.a.a(this, executionFlow, transactionEx);
    }

    @Override // com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep
    public final void a(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.entrypoint.flow.protocolactivation.ProtocolActivationData> transactionEx) {
        java.lang.Integer holdTime;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.transaction.outcome.UiRequest uiRequest = transactionEx.q().b;
        long intValue = ((uiRequest == null || (holdTime = uiRequest.getHoldTime()) == null) ? this.f3003a : holdTime.intValue()) * this.b;
        java.lang.String str = transactionEx.j().d ? "1" : "0";
        if (transactionEx.j().d && intValue > this.f3003a) {
            new java.lang.Object[]{str, java.lang.Long.valueOf(intValue)};
            transactionEx.a(intValue, new com.discover.mpos.sdk.cardreader.entrypoint.flow.protocolactivation.steps.TransactionRestartCheckStep.a(transactionEx, this, transactionEx));
        } else {
            transactionEx.t();
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/discover/mpos/sdk/cardreader/entrypoint/flow/protocolactivation/steps/TransactionRestartCheckStep$execute$1$1"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.entrypoint.a.c.a.c$a */
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlin.Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.discover.mpos.sdk.transaction.execution.TransactionEx f3004a;
        final /* synthetic */ com.discover.mpos.sdk.cardreader.entrypoint.flow.protocolactivation.steps.TransactionRestartCheckStep b;
        final /* synthetic */ com.discover.mpos.sdk.transaction.execution.TransactionEx c;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ kotlin.Unit invoke() {
            com.discover.mpos.sdk.transaction.outcome.UiRequest uiRequest = ((com.discover.mpos.sdk.cardreader.entrypoint.flow.protocolactivation.ProtocolActivationData) this.f3004a.q()).c;
            if (uiRequest != null) {
                this.c.a(uiRequest);
            }
            this.f3004a.t();
            return kotlin.Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx, com.discover.mpos.sdk.cardreader.entrypoint.flow.protocolactivation.steps.TransactionRestartCheckStep transactionRestartCheckStep, com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx2) {
            super(0);
            this.f3004a = transactionEx;
            this.b = transactionRestartCheckStep;
            this.c = transactionEx2;
        }
    }
}
