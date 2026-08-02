package com.paypal.oslo.feature.bnplservicing.ui.webview;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class BnplServicingWebViewScreenKt$BnplServicingWebViewScreen$2$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewUiEvent, kotlin.Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewUiEvent bnplServicingWebViewUiEvent) {
        com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewUiEvent bnplServicingWebViewUiEvent2 = bnplServicingWebViewUiEvent;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingWebViewUiEvent2, "");
        ((com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewViewModel) this.receiver).processEvent$bnpl_servicing_prodRelease(bnplServicingWebViewUiEvent2);
        return kotlin.Unit.INSTANCE;
    }

    BnplServicingWebViewScreenKt$BnplServicingWebViewScreen$2$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewViewModel.class, "processEvent", "processEvent$bnpl_servicing_prodRelease(Lcom/paypal/oslo/feature/bnplservicing/ui/webview/BnplServicingWebViewUiEvent;)V", 0);
    }
}
