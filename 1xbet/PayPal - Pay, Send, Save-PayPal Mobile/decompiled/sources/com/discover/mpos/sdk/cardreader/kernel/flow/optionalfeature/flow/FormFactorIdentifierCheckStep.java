package com.discover.mpos.sdk.cardreader.kernel.flow.optionalfeature.flow;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0002J\b\u0010\n\u001a\u00020\u000bH\u0002J\u0016\u0010\f\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016J \u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0002¨\u0006\u000f"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/optionalfeature/flow/FormFactorIdentifierCheckStep;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionStep;", "Lcom/discover/mpos/sdk/transaction/internal/InternalTransaction;", "()V", "createFFIContent", "", "createFFITag", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "debugTag", "", "execute", "updateFFIContent", "updatedFFITag", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.f.b.d, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class FormFactorIdentifierCheckStep implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep<com.discover.mpos.sdk.transaction.internal.InternalTransaction> {
    @Override // com.discover.mpos.sdk.flow.ExecutionStep
    public final /* synthetic */ void a(com.discover.mpos.sdk.flow.ExecutionFlow executionFlow, java.lang.Object obj) {
        com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx = (com.discover.mpos.sdk.transaction.execution.TransactionEx) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep.a.a(this, executionFlow, transactionEx);
    }

    @Override // com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep
    public final void a(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.transaction.internal.InternalTransaction> transactionEx) {
        com.discover.mpos.sdk.card.apdu.emv.FciTemplate<com.discover.mpos.sdk.card.apdu.emv.ProprietaryTemplateDataSelect> fciTemplate;
        com.discover.mpos.sdk.card.apdu.emv.ProprietaryTemplateDataSelect proprietaryTemplateDataSelect;
        com.discover.mpos.sdk.card.apdu.emv.FciIssuerDataSelect fciIssuerDataSelect;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.card.apdu.g.application.SelectApplicationResponseContent selectApplicationResponseContent = transactionEx.j().j;
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv = (selectApplicationResponseContent == null || (fciTemplate = selectApplicationResponseContent.f2967a) == null || (proprietaryTemplateDataSelect = fciTemplate.b) == null || (fciIssuerDataSelect = proprietaryTemplateDataSelect.f) == null) ? null : fciIssuerDataSelect.b;
        java.lang.String tag = com.discover.mpos.sdk.core.emv.tlv.Tag.FORM_FACTOR_IDENTIFIER.getTag();
        if (tlv == null || !kotlin.jvm.internal.Intrinsics.areEqual(tlv.getTag(), tag) || tlv.getContent() == null) {
            if (tlv != null) {
                tlv.setContent(new byte[]{0, 0, 0, 0, 0, 0, 0, 0});
            }
            byte[] content = tlv != null ? tlv.getContent() : null;
            kotlin.jvm.internal.Intrinsics.checkNotNull(content);
            com.discover.mpos.sdk.cardreader.config.FormFactorIdentifier formFactorIdentifier = new com.discover.mpos.sdk.cardreader.config.FormFactorIdentifier(content);
            formFactorIdentifier.setFirstByteBit8(true);
            formFactorIdentifier.setFirstByteBit7(false);
            formFactorIdentifier.setFirstByteBit6(true);
            formFactorIdentifier.setFirstByteBit5(true);
            if (tlv != null) {
                tlv.setContent(formFactorIdentifier.getE());
            }
            new java.lang.Object[]{tag};
            com.discover.mpos.sdk.core.emv.tlv.Tlv a2 = transactionEx.j().a("9F6E");
            if (a2 == null) {
                a2 = new com.discover.mpos.sdk.core.emv.tlv.Tlv("9F6E", null, 0, 0, 14, null);
            }
            new java.lang.Object[]{a2};
        }
        new java.lang.Object[]{tlv != null ? tlv.getContent() : null};
        byte[] content2 = tlv != null ? tlv.getContent() : null;
        kotlin.jvm.internal.Intrinsics.checkNotNull(content2);
        new java.lang.Object[]{content2};
        byte[] content3 = tlv.getContent();
        kotlin.jvm.internal.Intrinsics.checkNotNull(content3);
        com.discover.mpos.sdk.cardreader.config.FormFactorIdentifier formFactorIdentifier2 = new com.discover.mpos.sdk.cardreader.config.FormFactorIdentifier(content3);
        formFactorIdentifier2.setLastByteBit1(false);
        formFactorIdentifier2.setLastByteBit2(false);
        formFactorIdentifier2.setLastByteBit3(false);
        formFactorIdentifier2.setLastByteBit4(true);
        new java.lang.Object[]{formFactorIdentifier2.toString()};
        new java.lang.Object[]{formFactorIdentifier2.toHexString()};
        tlv.setContent(formFactorIdentifier2.getE());
        com.discover.mpos.sdk.core.emv.tlv.Tlv a3 = transactionEx.j().a("9F6E");
        if (a3 == null) {
            a3 = new com.discover.mpos.sdk.core.emv.tlv.Tlv("9F6E", null, 0, 0, 14, null);
        }
        new java.lang.Object[]{a3};
        transactionEx.t();
    }
}
