package com.paypal.oslo.feature.bnplacquisition.ui.contentviewer;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/contentviewer/ContentViewerContentProvider;", "", "<init>", "()V", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "downloadButtonText", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getDownloadButtonText", "()Lcom/paypal/oslo/core/commonui/utils/RefText;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ContentViewerContentProvider {
    public static final int $stable = com.paypal.oslo.core.commonui.utils.RefText.$stable;
    private final com.paypal.oslo.core.commonui.utils.RefText downloadButtonText = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_download, new java.lang.Object[0]);

    @javax.inject.Inject
    public ContentViewerContentProvider() {
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getDownloadButtonText() {
        return this.downloadButtonText;
    }
}
