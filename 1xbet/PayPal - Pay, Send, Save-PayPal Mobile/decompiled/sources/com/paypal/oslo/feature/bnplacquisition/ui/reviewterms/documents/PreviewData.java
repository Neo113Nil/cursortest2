package com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000b\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\fR\u001a\u0010\u000e\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u0007\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/documents/PreviewData;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/documents/DocumentsHalfSheetContentProvider;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/documents/DocumentsHalfSheetContentProvider;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getOutputFormats", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "Camera2StreamConfigurationMap", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final class PreviewData {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static final com.paypal.oslo.core.commonui.utils.RefText getHighSpeedVideoSizes;
    public static final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.PreviewData INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.PreviewData();

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final com.paypal.oslo.core.commonui.utils.RefText getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetContentProvider getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static final com.paypal.oslo.core.commonui.utils.RefText Camera2StreamConfigurationMap;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private static final com.paypal.oslo.core.commonui.utils.RefText getHighResolutionOutputSizeshNQ4ISI;

    private PreviewData() {
    }

    static {
        com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetContentProvider documentsHalfSheetContentProvider = new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetContentProvider();
        getHighSpeedVideoFpsRangesFor = documentsHalfSheetContentProvider;
        getHighResolutionOutputSizeshNQ4ISI = documentsHalfSheetContentProvider.getTitle();
        Camera2StreamConfigurationMap = documentsHalfSheetContentProvider.getDownloadErrorMessage();
        getHighSpeedVideoSizes = documentsHalfSheetContentProvider.getEmptyStateMessage();
        getHighSpeedVideoFpsRanges = documentsHalfSheetContentProvider.getCloseButtonText();
    }

    public static com.paypal.oslo.core.commonui.utils.RefText Camera2StreamConfigurationMap() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.oslo.core.commonui.utils.RefText getHighSpeedVideoFpsRanges() {
        return Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.core.commonui.utils.RefText getHighSpeedVideoSizes() {
        return getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.core.commonui.utils.RefText getHighSpeedVideoFpsRangesFor() {
        return getHighSpeedVideoFpsRanges;
    }
}
