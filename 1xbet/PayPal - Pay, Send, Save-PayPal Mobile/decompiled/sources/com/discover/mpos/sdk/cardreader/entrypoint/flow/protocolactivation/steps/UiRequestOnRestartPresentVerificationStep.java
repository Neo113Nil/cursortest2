package com.discover.mpos.sdk.cardreader.entrypoint.flow.protocolactivation.steps;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\u0016\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/entrypoint/flow/protocolactivation/steps/UiRequestOnRestartPresentVerificationStep;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionStep;", "Lcom/discover/mpos/sdk/cardreader/entrypoint/flow/protocolactivation/ProtocolActivationData;", "()V", "createUiRequest", "Lcom/discover/mpos/sdk/transaction/outcome/UiRequest;", "debugTag", "", "execute", "", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.entrypoint.a.c.a.d, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class UiRequestOnRestartPresentVerificationStep implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep<com.discover.mpos.sdk.cardreader.entrypoint.flow.protocolactivation.ProtocolActivationData> {
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
        com.discover.mpos.sdk.cardreader.entrypoint.flow.protocolactivation.ProtocolActivationData q = transactionEx.q();
        com.discover.mpos.sdk.transaction.outcome.UiRequest uiRequest = q.b;
        boolean z = q.d;
        if (!z || uiRequest == null) {
            uiRequest = new com.discover.mpos.sdk.transaction.outcome.UiRequest(com.discover.mpos.sdk.transaction.outcome.UiRequest.MessageIdentifier.PRESENT_CARD, com.discover.mpos.sdk.transaction.outcome.UiRequest.Status.READY_TO_READ, null, null, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
        }
        new java.lang.Object[]{java.lang.Boolean.valueOf(z)};
        kotlin.jvm.internal.Intrinsics.checkNotNull(uiRequest);
        transactionEx.a(uiRequest);
        transactionEx.t();
    }
}
