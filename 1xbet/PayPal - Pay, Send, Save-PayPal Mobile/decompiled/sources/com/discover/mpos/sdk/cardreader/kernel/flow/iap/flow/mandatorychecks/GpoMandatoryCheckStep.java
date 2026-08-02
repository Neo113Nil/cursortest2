package com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.mandatorychecks;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\f\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0016\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/iap/flow/mandatorychecks/GpoMandatoryCheckStep;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionStep;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/iap/model/ApplicationProcessingData;", "()V", "cprPermanentDataIndex", "", "tagAtcSupportedLength", "tagCidSupportedLength", "tagCprSupportedLength", "applicationInterchangeProfileStep", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/iap/flow/mandatorychecks/flow/mandatorychecktag/MandatoryCheckTagStep;", "applicationTransactionCounterStep", "cardProcessingRequirementsStep", "cryptogramInformationStep", "debugTag", "", "execute", "", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "issuerApplicationDataStep", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.c.a.b.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class GpoMandatoryCheckStep implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep<com.discover.mpos.sdk.cardreader.kernel.flow.iap.model.ApplicationProcessingData> {

    /* renamed from: a, reason: collision with root package name */
    private final int f3029a = 2;
    private final int b = 2;
    private final int c = 1;
    private final int d = 2;

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
        com.discover.mpos.sdk.card.apdu.gpo.GetProcessingOptionsResponse getProcessingOptionsResponse = transactionEx.j().k;
        if (getProcessingOptionsResponse == null) {
            transactionEx.y();
            return;
        }
        com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.mandatorychecks.model.GpoMandatoryCheckDataProvider gpoMandatoryCheckDataProvider = new com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.mandatorychecks.model.GpoMandatoryCheckDataProvider(getProcessingOptionsResponse);
        com.discover.mpos.sdk.transaction.execution.LinearTransactionExecutionFlow a2 = new com.discover.mpos.sdk.transaction.execution.LinearTransactionExecutionFlow().a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.mandatorychecks.a.statusword.StatusWordStep());
        com.discover.mpos.sdk.core.emv.tlv.Tag tag = com.discover.mpos.sdk.core.emv.tlv.Tag.APPLICATION_INTERCHANGE_PROFILE;
        int i = this.f3029a;
        com.discover.mpos.sdk.transaction.execution.LinearTransactionExecutionFlow a3 = a2.a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.mandatorychecks.a.mandatorychecktag.MandatoryCheckTagStep(tag, new kotlin.ranges.IntRange(i, i)));
        com.discover.mpos.sdk.core.emv.tlv.Tag tag2 = com.discover.mpos.sdk.core.emv.tlv.Tag.APPLICATION_TRANSACTION_COUNTER_ATC;
        int i2 = this.b;
        com.discover.mpos.sdk.transaction.execution.LinearTransactionExecutionFlow a4 = a3.a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.mandatorychecks.a.mandatorychecktag.MandatoryCheckTagStep(tag2, new kotlin.ranges.IntRange(i2, i2))).a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.mandatorychecks.a.mandatorychecktag.MandatoryCheckTagStep(com.discover.mpos.sdk.core.emv.tlv.Tag.ISSUER_APPLICATION_DATA));
        com.discover.mpos.sdk.core.emv.tlv.Tag tag3 = com.discover.mpos.sdk.core.emv.tlv.Tag.CRYPTOGRAM_INFORMATION_DATA;
        int i3 = this.c;
        com.discover.mpos.sdk.transaction.execution.LinearTransactionExecutionFlow a5 = a4.a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.mandatorychecks.a.mandatorychecktag.MandatoryCheckTagStep(tag3, new kotlin.ranges.IntRange(i3, i3)));
        com.discover.mpos.sdk.core.emv.tlv.Tag tag4 = com.discover.mpos.sdk.core.emv.tlv.Tag.CARD_PROCESSING_REQUIREMENTS_CPR;
        int i4 = this.d;
        transactionEx.a(gpoMandatoryCheckDataProvider, a5.a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.mandatorychecks.a.mandatorychecktag.MandatoryCheckTagStep(tag4, new kotlin.ranges.IntRange(i4, i4))).a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.mandatorychecks.a.tvrupdate.TvrFlagUpdater()));
    }
}
