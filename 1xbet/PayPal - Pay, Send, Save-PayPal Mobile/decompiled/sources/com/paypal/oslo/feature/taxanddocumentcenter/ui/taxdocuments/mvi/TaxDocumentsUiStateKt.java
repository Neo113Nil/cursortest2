package com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiState;", "", "getSelectedYear", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiState;)Ljava/lang/String;", "selectedYear"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TaxDocumentsUiStateKt {
    public static final java.lang.String getSelectedYear(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState taxDocumentsUiState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxDocumentsUiState, "");
        if (taxDocumentsUiState instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Loading) {
            return ((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Loading) taxDocumentsUiState).getSelectedYear();
        }
        if (taxDocumentsUiState instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Error) {
            return ((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Error) taxDocumentsUiState).getSelectedYear();
        }
        if (taxDocumentsUiState instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Content) {
            return ((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Content) taxDocumentsUiState).getSelectedYear();
        }
        if (taxDocumentsUiState instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Downloading) {
            return ((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Downloading) taxDocumentsUiState).getPreviousState().getSelectedYear();
        }
        if (taxDocumentsUiState instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.DownloadError) {
            return ((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.DownloadError) taxDocumentsUiState).getPreviousState().getSelectedYear();
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
