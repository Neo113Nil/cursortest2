package com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsViewModel;", "viewModel", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/TaxReport;", "", "createReportCardClickHandler", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsViewModel;)Lkotlin/jvm/functions/Function1;", "createReportLinkClickHandler"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TaxDocumentsEventHandlersKt {
    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport, kotlin.Unit> createReportCardClickHandler(final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel taxDocumentsViewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxDocumentsViewModel, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsEventHandlersKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsEventHandlersKt.$r8$lambda$_FLFSdnmWRboOVoP_039BIbxhBI(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel.this, (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport) obj);
            }
        };
    }

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport, kotlin.Unit> createReportLinkClickHandler(final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel taxDocumentsViewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxDocumentsViewModel, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsEventHandlersKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsEventHandlersKt.$r8$lambda$J57WHSbQm_eEQzgyG1mjrDtTemg(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel.this, (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport) obj);
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$J57WHSbQm_eEQzgyG1mjrDtTemg(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel taxDocumentsViewModel, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport taxReport) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReport, "");
        java.lang.String id = taxReport.getId();
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportStatus reportStatus = taxReport.getReportStatus();
        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.ReportLink reportLink = taxReport.getReportLink();
        taxDocumentsViewModel.onEvent(new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReportLinkClicked(id, reportStatus, reportLink != null ? reportLink.getCta() : null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_FLFSdnmWRboOVoP_039BIbxhBI(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel taxDocumentsViewModel, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport taxReport) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReport, "");
        java.lang.String id = taxReport.getId();
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportStatus reportStatus = taxReport.getReportStatus();
        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportCta cta = taxReport.getCta();
        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.ReportNote reportInlineNote = taxReport.getReportInlineNote();
        taxDocumentsViewModel.onEvent(new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReportCardClicked(id, reportStatus, cta, reportInlineNote != null ? reportInlineNote.getToastMessage() : null));
        return kotlin.Unit.INSTANCE;
    }
}
