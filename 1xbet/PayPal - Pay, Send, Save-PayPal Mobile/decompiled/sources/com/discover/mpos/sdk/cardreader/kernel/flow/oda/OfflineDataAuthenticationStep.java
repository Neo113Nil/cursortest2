package com.discover.mpos.sdk.cardreader.kernel.flow.oda;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/oda/OfflineDataAuthenticationStep;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionStep;", "Lcom/discover/mpos/sdk/transaction/internal/InternalTransaction;", "()V", "debugTag", "", "execute", "", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.d.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class OfflineDataAuthenticationStep implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep<com.discover.mpos.sdk.transaction.internal.InternalTransaction> {

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/oda/model/OfflineDataAuthenticationData;", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.d.a$a */
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.oda.model.OfflineDataAuthenticationData>, kotlin.Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.oda.model.OfflineDataAuthenticationData> transactionEx) {
            com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.oda.model.OfflineDataAuthenticationData> transactionEx2 = transactionEx;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx2, "");
            transactionEx2.t();
            return kotlin.Unit.INSTANCE;
        }

        a() {
            super(1);
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
    public final void a(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.transaction.internal.InternalTransaction> transactionEx) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.core.emv.tlv.Tlv b = transactionEx.j().b(com.discover.mpos.sdk.core.emv.tlv.Tag.SIGNED_DYNAMIC_APPLICATION_DATA.getTag());
        new java.lang.Object[]{b != null ? b.getContent() : null};
        if (b != null) {
            transactionEx.a(new com.discover.mpos.sdk.cardreader.kernel.flow.oda.model.OfflineDataAuthenticationDataProvider(), new com.discover.mpos.sdk.transaction.execution.LinearTransactionExecutionFlow().a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.kernel.flow.oda.flow.CaPublicKeyIndexRetrieveStep()).a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.kernel.flow.oda.flow.issuer.RetrieveIssuerPublicKeyStep()).a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.kernel.flow.oda.flow.icc.RetrieveIccPublicKeyStep()).a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.kernel.flow.oda.flow.sdad.SignedDynamicApplicationDataVerificationStep()).a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.kernel.flow.oda.flow.OptionalFeaturesOdaCheckStep()).a((kotlin.jvm.functions.Function1) new com.discover.mpos.sdk.cardreader.kernel.flow.oda.OfflineDataAuthenticationStep.a()).c());
        } else {
            transactionEx.t();
        }
    }
}
