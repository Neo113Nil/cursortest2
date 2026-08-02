package com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.otherchecks.flow.cda;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0014J \u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0014J\u001e\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0014J\u0016\u0010\r\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0014¨\u0006\u000f"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/iap/flow/otherchecks/flow/cda/SignedDynamicApplicationDataForNoCdaCheck;", "Lcom/discover/mpos/sdk/cardreader/kernel/DefaultTagValidationStepEx;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/iap/flow/otherchecks/flow/model/OtherChecksData;", "()V", "debugTag", "", "handleValidationFailure", "", "tlv", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "handleValidationSucceed", "retrieveTag", "input", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.c.a.c.a.b.c, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class SignedDynamicApplicationDataForNoCdaCheck extends com.discover.mpos.sdk.cardreader.kernel.DefaultTagValidationStepEx<com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.otherchecks.flow.model.OtherChecksData> {
    public SignedDynamicApplicationDataForNoCdaCheck() {
        super(null, null, 3);
    }

    @Override // com.discover.mpos.sdk.cardreader.kernel.BaseTagValidationStep
    public final com.discover.mpos.sdk.core.emv.tlv.Tlv b(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.otherchecks.flow.model.OtherChecksData> transactionEx) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        return transactionEx.q().a(com.discover.mpos.sdk.core.emv.tlv.Tag.SIGNED_DYNAMIC_APPLICATION_DATA.getTag());
    }

    @Override // com.discover.mpos.sdk.cardreader.kernel.BaseTagValidationStep
    public final void b(com.discover.mpos.sdk.core.emv.tlv.Tlv tlv, com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.otherchecks.flow.model.OtherChecksData> transactionEx) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tlv, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        new java.lang.Object[]{tlv};
        com.discover.mpos.sdk.transaction.execution.TransactionFlowHandler.a.a(transactionEx, com.discover.mpos.sdk.transaction.execution.TransactionEndStatus.b, com.discover.mpos.sdk.transaction.outcome.UiRequest.MessageIdentifier.INSERT_SWIPE_OR_TRY_ANOTHER_CARD, false, 4);
    }

    @Override // com.discover.mpos.sdk.cardreader.kernel.BaseTagValidationStep
    public final void a(com.discover.mpos.sdk.core.emv.tlv.Tlv tlv, com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.otherchecks.flow.model.OtherChecksData> transactionEx) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        java.lang.Object obj = tlv;
        if (tlv == null) {
            obj = "NO Tlv";
        }
        new java.lang.Object[]{obj};
        transactionEx.t();
    }

    @Override // com.discover.mpos.sdk.cardreader.kernel.BaseTagValidationStep
    public final java.lang.String b() {
        return "SignedDynamicApplicationDataCheck";
    }
}
