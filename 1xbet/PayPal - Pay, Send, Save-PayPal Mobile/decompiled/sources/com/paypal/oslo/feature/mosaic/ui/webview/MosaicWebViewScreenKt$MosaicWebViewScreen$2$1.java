package com.paypal.oslo.feature.mosaic.ui.webview;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class MosaicWebViewScreenKt$MosaicWebViewScreen$2$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiEvent, kotlin.Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiEvent complianceWebViewUiEvent) {
        com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiEvent complianceWebViewUiEvent2 = complianceWebViewUiEvent;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(complianceWebViewUiEvent2, "");
        ((com.paypal.oslo.feature.mosaic.ui.webview.ComplianceWebViewViewModel) this.receiver).processEvent$mosaic_prodRelease(complianceWebViewUiEvent2);
        return kotlin.Unit.INSTANCE;
    }

    MosaicWebViewScreenKt$MosaicWebViewScreen$2$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.mosaic.ui.webview.ComplianceWebViewViewModel.class, "processEvent", "processEvent$mosaic_prodRelease(Lcom/paypal/oslo/feature/mosaic/ui/webview/mvi/ComplianceWebViewUiEvent;)V", 0);
    }
}
