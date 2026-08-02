package com.paypal.oslo.feature.inappcheckout.features.webview;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class AppSwitchWebViewViewModel$handleCheckoutAuthenticationResult$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Event, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        ((com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel) this.receiver).getHighSpeedVideoFpsRangesFor(event);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Event event) {
        getHighSpeedVideoFpsRangesFor(event);
        return kotlin.Unit.INSTANCE;
    }

    AppSwitchWebViewViewModel$handleCheckoutAuthenticationResult$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel.class, "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRangesFor(Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$Event;)V", 0);
    }
}
