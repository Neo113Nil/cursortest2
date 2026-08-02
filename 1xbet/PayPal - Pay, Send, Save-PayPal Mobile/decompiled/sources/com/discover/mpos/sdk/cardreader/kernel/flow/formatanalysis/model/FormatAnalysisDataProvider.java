package com.discover.mpos.sdk.cardreader.kernel.flow.formatanalysis.model;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/formatanalysis/model/FormatAnalysisDataProvider;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionDataProvider;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/formatanalysis/model/FormatAnalysisData;", "()V", "getData", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.b.b.b, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class FormatAnalysisDataProvider implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionDataProvider<com.discover.mpos.sdk.cardreader.kernel.flow.formatanalysis.model.FormatAnalysisData> {
    @Override // com.discover.mpos.sdk.transaction.execution.TransactionExecutionDataProvider
    public final /* synthetic */ com.discover.mpos.sdk.cardreader.kernel.flow.formatanalysis.model.FormatAnalysisData a(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.formatanalysis.model.FormatAnalysisData> transactionEx) {
        com.discover.mpos.sdk.card.apdu.emv.FciTemplate<com.discover.mpos.sdk.card.apdu.emv.ProprietaryTemplateDataSelect> fciTemplate;
        com.discover.mpos.sdk.card.apdu.emv.CardApplication cardApplication;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.card.apdu.g.application.SelectApplicationResponseContent selectApplicationResponseContent = transactionEx.j().j;
        if (selectApplicationResponseContent == null || (fciTemplate = selectApplicationResponseContent.f2967a) == null) {
            return new com.discover.mpos.sdk.cardreader.kernel.flow.formatanalysis.model.FormatAnalysisData();
        }
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv = fciTemplate.f2936a;
        com.discover.mpos.sdk.card.apdu.emv.ProprietaryTemplateDataSelect proprietaryTemplateDataSelect = fciTemplate.b;
        com.discover.mpos.sdk.card.apdu.emv.ProprietaryTemplateDataSelect proprietaryTemplateDataSelect2 = fciTemplate.b;
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv2 = (proprietaryTemplateDataSelect2 == null || (cardApplication = proprietaryTemplateDataSelect2.f2938a) == null) ? null : cardApplication.f2932a;
        com.discover.mpos.sdk.card.apdu.emv.ProprietaryTemplateDataSelect proprietaryTemplateDataSelect3 = fciTemplate.b;
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv3 = proprietaryTemplateDataSelect3 != null ? proprietaryTemplateDataSelect3.b : null;
        com.discover.mpos.sdk.cardreader.entrypoint.model.Candidate candidate = transactionEx.j().h.c;
        return new com.discover.mpos.sdk.cardreader.kernel.flow.formatanalysis.model.FormatAnalysisData(tlv, proprietaryTemplateDataSelect, tlv2, tlv3, candidate != null ? candidate.getDeferredAuthorizationSupported() : false);
    }
}
