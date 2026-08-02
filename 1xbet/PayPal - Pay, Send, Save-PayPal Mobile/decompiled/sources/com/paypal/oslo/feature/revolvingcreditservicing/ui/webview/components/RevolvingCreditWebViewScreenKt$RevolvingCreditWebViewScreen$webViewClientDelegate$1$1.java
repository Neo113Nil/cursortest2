package com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.components;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class RevolvingCreditWebViewScreenKt$RevolvingCreditWebViewScreen$webViewClientDelegate$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent, kotlin.Unit> {
    public final void getHighSpeedVideoSizes(com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent revolvingCreditWebViewEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditWebViewEvent, "");
        ((com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewViewModel) this.receiver).processEvent(revolvingCreditWebViewEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent revolvingCreditWebViewEvent) {
        getHighSpeedVideoSizes(revolvingCreditWebViewEvent);
        return kotlin.Unit.INSTANCE;
    }

    RevolvingCreditWebViewScreenKt$RevolvingCreditWebViewScreen$webViewClientDelegate$1$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/RevolvingCreditWebViewEvent;)V", 0);
    }
}
