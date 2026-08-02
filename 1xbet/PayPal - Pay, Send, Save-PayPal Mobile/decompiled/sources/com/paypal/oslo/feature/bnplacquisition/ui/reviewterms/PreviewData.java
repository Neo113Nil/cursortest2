package com.paypal.oslo.feature.bnplacquisition.ui.reviewterms;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0005\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0017\u0010\t\u001a\u00020\u000f8\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0007\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/PreviewData;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsContentProvider;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsContentProvider;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/ExitConfirmationContentProvider;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/ExitConfirmationContentProvider;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/documents/DocumentsHalfSheetContentProvider;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/documents/DocumentsHalfSheetContentProvider;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiModel;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiModel;", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final class PreviewData {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static final com.paypal.oslo.feature.bnplacquisition.ui.common.components.ExitConfirmationContentProvider getHighSpeedVideoFpsRangesFor;
    public static final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.PreviewData INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.PreviewData();

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetContentProvider getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsContentProvider getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiModel Camera2StreamConfigurationMap;

    private PreviewData() {
    }

    static {
        com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsContentProvider reviewTermsContentProvider = new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsContentProvider();
        getHighSpeedVideoFpsRanges = reviewTermsContentProvider;
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.ExitConfirmationContentProvider exitConfirmationContentProvider = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.ExitConfirmationContentProvider();
        getHighSpeedVideoFpsRangesFor = exitConfirmationContentProvider;
        com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetContentProvider documentsHalfSheetContentProvider = new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetContentProvider();
        getHighSpeedVideoSizes = documentsHalfSheetContentProvider;
        Camera2StreamConfigurationMap = new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiModel(new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsHeader(reviewTermsContentProvider.getTitle()), new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsDocument("https://example.com/document", "https://example.com/loan", "https://example.com/privacy", "https://example.com/credit", "<html>Preview HTML</html>", reviewTermsContentProvider.getDownloadButtonText(), null, 64, null), new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsConsent(reviewTermsContentProvider.getAgreementText(), reviewTermsContentProvider.getAgreeToContinueErrorMessage(), reviewTermsContentProvider.getDisclaimerText(), new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ConsentLink(reviewTermsContentProvider.getLoanAgreementLinkLabel(), "https://example.com/loan", "LOAN_AGREEMENT", null, 8, null), new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ConsentLink(reviewTermsContentProvider.getPrivacyNoticeLinkLabel(), "https://example.com/privacy", "PRIVACY_NOTICE", null, 8, null), new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ConsentLink(reviewTermsContentProvider.getCreditScoreDisclosureLinkLabel(), "https://example.com/credit", "CREDIT_SCORE_DISCLOSURE", null, 8, null)), reviewTermsContentProvider.getAgreeAndContinueButtonText(), null, false, exitConfirmationContentProvider.getExitConfirmationContent(), reviewTermsContentProvider.getToolBarContent(), reviewTermsContentProvider.getNoPdfViewerMessage(), documentsHalfSheetContentProvider.getTitle(), documentsHalfSheetContentProvider.getDownloadErrorMessage(), documentsHalfSheetContentProvider.getEmptyStateMessage(), documentsHalfSheetContentProvider.getCloseButtonText(), 48, null);
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiModel getHighSpeedVideoFpsRanges() {
        return Camera2StreamConfigurationMap;
    }
}
