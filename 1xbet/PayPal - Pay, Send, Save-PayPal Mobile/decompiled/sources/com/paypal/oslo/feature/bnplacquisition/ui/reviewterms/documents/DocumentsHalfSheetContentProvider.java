package com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/documents/DocumentsHalfSheetContentProvider;", "", "<init>", "()V", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "title", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getTitle", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "downloadErrorMessage", "getDownloadErrorMessage", "emptyStateMessage", "getEmptyStateMessage", "closeButtonText", "getCloseButtonText"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DocumentsHalfSheetContentProvider {
    public static final int $stable;
    private final com.paypal.oslo.core.commonui.utils.RefText title = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_plan_documents_title, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText downloadErrorMessage = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_document_download_error, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText emptyStateMessage = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_no_documents_available, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText closeButtonText = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_close, new java.lang.Object[0]);

    @javax.inject.Inject
    public DocumentsHalfSheetContentProvider() {
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getTitle() {
        return this.title;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getDownloadErrorMessage() {
        return this.downloadErrorMessage;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getEmptyStateMessage() {
        return this.emptyStateMessage;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getCloseButtonText() {
        return this.closeButtonText;
    }

    static {
        int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable;
    }
}
