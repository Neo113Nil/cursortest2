package com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.otherchecks;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\b\u0010\b\u001a\u00020\tH\u0002J\u0016\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016J\u0016\u0010\u000e\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0002J\u0016\u0010\u000f\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0002J\u0016\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/iap/flow/otherchecks/GpoOtherChecksStep;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionStep;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/iap/model/ApplicationProcessingData;", "()V", "applicationCryptogramTagLengthRange", "Lkotlin/ranges/IntRange;", "applicationCryptogramStep", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/iap/flow/otherchecks/flow/tvrflow/CheckOnlineDeclineDecisionTVRStep;", "debugTag", "", "execute", "", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "startCdaChecks", "startRegularChecks", "supportOfflineDataAuthenticationForOnlineAuthorizations", "", "tx", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.c.a.c.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class GpoOtherChecksStep implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep<com.discover.mpos.sdk.cardreader.kernel.flow.iap.model.ApplicationProcessingData> {

    /* renamed from: a, reason: collision with root package name */
    private final kotlin.ranges.IntRange f3035a = new kotlin.ranges.IntRange(8, 8);

    @Override // com.discover.mpos.sdk.flow.ExecutionStep
    public final /* synthetic */ void a(com.discover.mpos.sdk.flow.ExecutionFlow executionFlow, java.lang.Object obj) {
        com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx = (com.discover.mpos.sdk.transaction.execution.TransactionEx) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep.a.a(this, executionFlow, transactionEx);
    }

    @Override // com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep
    public final void a(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.iap.model.ApplicationProcessingData> transactionEx) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        boolean z = transactionEx.j().l().b;
        boolean z2 = transactionEx.q().b;
        new java.lang.Object[]{java.lang.Boolean.valueOf(z)};
        new java.lang.Object[]{java.lang.Boolean.valueOf(z2)};
        if (!z && !z2) {
            boolean isOdaForOnlineAuthorisationSupported = transactionEx.q().f3044a.getIsOdaForOnlineAuthorisationSupported();
            new java.lang.Object[]{java.lang.Boolean.valueOf(isOdaForOnlineAuthorisationSupported)};
            boolean z3 = transactionEx.j().l().f3041a;
            new java.lang.Object[]{java.lang.Boolean.valueOf(z3)};
            byte[] k = transactionEx.j().k();
            new java.lang.Object[]{java.lang.Boolean.valueOf(k != null)};
            if (!isOdaForOnlineAuthorisationSupported || !z3 || k != null) {
                transactionEx.a(new com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.otherchecks.model.OtherChecksDataProvider(), new com.discover.mpos.sdk.transaction.execution.LinearTransactionExecutionFlow().a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.otherchecks.flow.tvrflow.CheckOnlineDeclineDecisionTVRStep(com.discover.mpos.sdk.core.emv.tlv.Tag.APPLICATION_CRYPTOGRAM, this.f3035a)).a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.otherchecks.flow.cda.SignedDynamicApplicationDataForNoCdaCheck()).a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.kernel.flow.iap.OfflineBalanceForDPasPresentCheck()).a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.kernel.flow.iap.PaymentAccountReferenceCheck()).a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.otherchecks.flow.aflstep.ApplicationFileLocatorStep()).a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.otherchecks.flow.ApplicationFileLocatorLengthCheck()));
                return;
            }
        }
        if (transactionEx.j().k == null) {
            com.discover.mpos.sdk.transaction.execution.TransactionFlowHandler.a.a(transactionEx, 0, null, false, 7);
        } else {
            transactionEx.a(new com.discover.mpos.sdk.transaction.execution.DataContainerProvider(transactionEx.j()), new com.discover.mpos.sdk.transaction.execution.LinearTransactionExecutionFlow().a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.otherchecks.flow.cda.CDACheckStep()));
        }
    }
}
