package com.paypal.oslo.feature.mosaic.widget;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/widget/DocUploadWidgetFactoryProvider;", "", "Lcom/paypal/oslo/feature/verificationcapture/api/widget/IdScanWidgetProvider;", "idScanWidgetProvider", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "<init>", "(Lcom/paypal/oslo/feature/verificationcapture/api/widget/IdScanWidgetProvider;Lcom/paypal/oslo/core/userstore/UserStore;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DocUploadWidgetFactoryProvider {
    public static final int $stable = 0;

    @javax.inject.Inject
    public DocUploadWidgetFactoryProvider(com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetProvider idScanWidgetProvider, com.paypal.oslo.core.userstore.UserStore userStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(idScanWidgetProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetFactory.setProvider(new com.paypal.oslo.feature.mosaic.widget.MosaicDocUploadWidgetProviderImpl(idScanWidgetProvider, userStore));
    }
}
