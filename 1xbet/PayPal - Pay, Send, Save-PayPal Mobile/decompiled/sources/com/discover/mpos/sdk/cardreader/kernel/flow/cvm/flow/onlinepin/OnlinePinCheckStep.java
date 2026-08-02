package com.discover.mpos.sdk.cardreader.kernel.flow.cvm.flow.onlinepin;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0016\u0010\r\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/cvm/flow/onlinepin/OnlinePinCheckStep;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionStep;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/cvm/model/CardholderVerificationMethodData;", "childDataProvider", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionDataProvider;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/cvm/flow/onlinepin/model/SignatureAndNoCvmData;", "(Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionDataProvider;)V", "checkOnlinePinSupport", "", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "debugTag", "", "execute", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.a.a.a.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class OnlinePinCheckStep implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep<com.discover.mpos.sdk.cardreader.kernel.flow.cvm.model.CardholderVerificationMethodData> {

    /* renamed from: a, reason: collision with root package name */
    private final com.discover.mpos.sdk.transaction.execution.TransactionExecutionDataProvider<com.discover.mpos.sdk.cardreader.kernel.flow.cvm.flow.onlinepin.model.SignatureAndNoCvmData> f3012a;

    private OnlinePinCheckStep(com.discover.mpos.sdk.transaction.execution.TransactionExecutionDataProvider<com.discover.mpos.sdk.cardreader.kernel.flow.cvm.flow.onlinepin.model.SignatureAndNoCvmData> transactionExecutionDataProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionExecutionDataProvider, "");
        this.f3012a = transactionExecutionDataProvider;
    }

    @Override // com.discover.mpos.sdk.flow.ExecutionStep
    public final /* synthetic */ void a(com.discover.mpos.sdk.flow.ExecutionFlow executionFlow, java.lang.Object obj) {
        com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx = (com.discover.mpos.sdk.transaction.execution.TransactionEx) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep.a.a(this, executionFlow, transactionEx);
    }

    public /* synthetic */ OnlinePinCheckStep() {
        this(new com.discover.mpos.sdk.cardreader.kernel.flow.cvm.flow.onlinepin.model.SignatureAndNoCvmDataProvider());
    }

    @Override // com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep
    public final void a(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.cvm.model.CardholderVerificationMethodData> transactionEx) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        boolean a2 = transactionEx.q().b.a();
        new java.lang.Object[]{java.lang.Boolean.valueOf(a2)};
        if (!a2) {
            transactionEx.a(this.f3012a, new com.discover.mpos.sdk.transaction.execution.LinearTransactionExecutionFlow().a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.kernel.flow.cvm.flow.onlinepin.flow.SignatureCvmCheckStep()).a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.kernel.flow.cvm.flow.onlinepin.flow.cdcvm.CdCvmCheckStep()));
            return;
        }
        boolean isOnlinePinSupported = transactionEx.q().f3017a.getIsOnlinePinSupported();
        new java.lang.Object[]{java.lang.Boolean.valueOf(isOnlinePinSupported)};
        if (!isOnlinePinSupported) {
            transactionEx.a(this.f3012a, new com.discover.mpos.sdk.transaction.execution.LinearTransactionExecutionFlow().a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.kernel.flow.cvm.flow.onlinepin.flow.FallbackToSignatureAllowedCheckStep()).a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.kernel.flow.cvm.flow.onlinepin.flow.cdcvm.CdCvmCheckStep()));
        } else {
            transactionEx.q().d.c.setBitValue(com.discover.mpos.sdk.core.data.ByteInfo.BitIndex.THIRD, true);
            transactionEx.j().f = new com.discover.mpos.sdk.transaction.outcome.OutcomeParameters(null, null, com.discover.mpos.sdk.transaction.outcome.CardholderVerificationMethod.ONLINE_PIN, null, null, null, null, null, null, null, 0L, null, 4091, null);
            transactionEx.t();
        }
    }
}
