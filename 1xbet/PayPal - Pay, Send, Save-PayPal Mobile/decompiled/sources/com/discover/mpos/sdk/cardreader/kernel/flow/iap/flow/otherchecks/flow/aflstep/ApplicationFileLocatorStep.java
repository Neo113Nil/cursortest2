package com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.otherchecks.flow.aflstep;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\f\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0014J \u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0014J\u0016\u0010\u0015\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0014J\b\u0010\u0017\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/iap/flow/otherchecks/flow/aflstep/ApplicationFileLocatorStep;", "Lcom/discover/mpos/sdk/cardreader/kernel/DefaultTagValidationStepEx;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/iap/flow/otherchecks/flow/model/OtherChecksData;", "()V", "applicationEffectiveDateTagLengthRange", "Lkotlin/ranges/IntRange;", "applicationPrimaryAccountNumberPanSequenceNumberTagLengthRange", "applicationVersionNumberCardTagLengthRange", "track2EquivalentDataTagLengthRange", "applicationEffectiveDateStep", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/iap/flow/otherchecks/flow/tvrflow/CheckOnlineDeclineDecisionTVRStep;", "applicationPANSequenceStep", "applicationVersionNumberStep", "debugTag", "", "handleValidationFailure", "", "tlv", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "retrieveTag", "input", "track2EquivalentCheckStep", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.c.a.c.a.a.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class ApplicationFileLocatorStep extends com.discover.mpos.sdk.cardreader.kernel.DefaultTagValidationStepEx<com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.otherchecks.flow.model.OtherChecksData> {

    /* renamed from: a, reason: collision with root package name */
    private final kotlin.ranges.IntRange f3036a;
    private final kotlin.ranges.IntRange b;
    private final kotlin.ranges.IntRange c;
    private final kotlin.ranges.IntRange d;

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/iap/flow/otherchecks/flow/model/OtherChecksData;", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.c.a.c.a.a.a$a */
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.otherchecks.flow.model.OtherChecksData>, kotlin.Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.discover.mpos.sdk.transaction.execution.TransactionEx f3037a;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.otherchecks.flow.model.OtherChecksData> transactionEx) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
            this.f3037a.s();
            return kotlin.Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx) {
            super(1);
            this.f3037a = transactionEx;
        }
    }

    public ApplicationFileLocatorStep() {
        super(null, null, 3);
        this.f3036a = new kotlin.ranges.IntRange(0, 19);
        this.b = new kotlin.ranges.IntRange(1, 1);
        this.c = new kotlin.ranges.IntRange(3, 3);
        this.d = new kotlin.ranges.IntRange(2, 2);
    }

    @Override // com.discover.mpos.sdk.cardreader.kernel.BaseTagValidationStep
    public final void a(com.discover.mpos.sdk.core.emv.tlv.Tlv tlv, com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.otherchecks.flow.model.OtherChecksData> transactionEx) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        transactionEx.a(new com.discover.mpos.sdk.transaction.execution.DataContainerProvider(transactionEx.q()), new com.discover.mpos.sdk.transaction.execution.LinearTransactionExecutionFlow().a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.otherchecks.flow.tvrflow.CheckOnlineDeclineDecisionTVRStep(com.discover.mpos.sdk.core.emv.tlv.Tag.TRACK_2_EQUIVALENT_DATA, this.f3036a)).a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.otherchecks.flow.tvrflow.CheckOnlineDeclineDecisionTVRStep(com.discover.mpos.sdk.core.emv.tlv.Tag.APPLICATION_PRIMARY_ACCOUNT_NUMBER_PAN_SEQUENCE_NUMBER, this.b)).a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.otherchecks.flow.tvrflow.CheckOnlineDeclineDecisionTVRStep(com.discover.mpos.sdk.core.emv.tlv.Tag.APPLICATION_EFFECTIVE_DATE, this.c)).a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.otherchecks.flow.tvrflow.CheckOnlineDeclineDecisionTVRStep(com.discover.mpos.sdk.core.emv.tlv.Tag.APPLICATION_VERSION_NUMBER_CARD, this.d)).a((kotlin.jvm.functions.Function1) new com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.otherchecks.flow.aflstep.ApplicationFileLocatorStep.a(transactionEx)).c());
    }

    @Override // com.discover.mpos.sdk.cardreader.kernel.BaseTagValidationStep
    public final com.discover.mpos.sdk.core.emv.tlv.Tlv b(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.otherchecks.flow.model.OtherChecksData> transactionEx) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        return transactionEx.q().a(com.discover.mpos.sdk.core.emv.tlv.Tag.APPLICATION_FILE_LOCATOR_AFL.getTag());
    }

    @Override // com.discover.mpos.sdk.cardreader.kernel.BaseTagValidationStep
    public final java.lang.String b() {
        return "ApplicationFileLocatorStep";
    }
}
