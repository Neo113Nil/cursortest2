package com.paypal.oslo.feature.bnplacquisition.ui.contentviewer;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/contentviewer/ContentViewerUiMapper;", "", "Lcom/paypal/oslo/feature/bnplacquisition/ui/contentviewer/ContentViewerContentProvider;", "contentProvider", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/contentviewer/ContentViewerContentProvider;)V", "Lcom/paypal/oslo/feature/bnplacquisition/ui/contentviewer/ContentViewerUiModel;", "toUiModel", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/contentviewer/ContentViewerUiModel;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/bnplacquisition/ui/contentviewer/ContentViewerContentProvider;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ContentViewerUiMapper {
    public static final int $stable = com.paypal.oslo.core.commonui.utils.RefText.$stable;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerContentProvider getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public ContentViewerUiMapper(com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerContentProvider contentViewerContentProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentViewerContentProvider, "");
        this.getHighResolutionOutputSizeshNQ4ISI = contentViewerContentProvider;
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerUiModel toUiModel() {
        return new com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerUiModel(this.getHighResolutionOutputSizeshNQ4ISI.getDownloadButtonText());
    }
}
