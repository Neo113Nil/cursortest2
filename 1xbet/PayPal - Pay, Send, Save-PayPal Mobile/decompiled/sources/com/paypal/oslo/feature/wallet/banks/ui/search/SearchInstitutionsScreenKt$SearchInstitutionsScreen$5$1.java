package com.paypal.oslo.feature.wallet.banks.ui.search;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class SearchInstitutionsScreenKt$SearchInstitutionsScreen$5$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.banks.domain.model.FinancialInstitution, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.wallet.banks.domain.model.FinancialInstitution financialInstitution) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(financialInstitution, "");
        ((com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsViewModel) this.receiver).onInstitutionClick(financialInstitution);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.wallet.banks.domain.model.FinancialInstitution financialInstitution) {
        getHighSpeedVideoFpsRanges(financialInstitution);
        return kotlin.Unit.INSTANCE;
    }

    SearchInstitutionsScreenKt$SearchInstitutionsScreen$5$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsViewModel.class, "onInstitutionClick", "onInstitutionClick(Lcom/paypal/oslo/feature/wallet/banks/domain/model/FinancialInstitution;)V", 0);
    }
}
