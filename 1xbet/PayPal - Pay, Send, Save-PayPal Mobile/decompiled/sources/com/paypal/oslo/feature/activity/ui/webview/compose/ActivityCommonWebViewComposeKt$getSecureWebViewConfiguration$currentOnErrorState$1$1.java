package com.paypal.oslo.feature.activity.ui.webview.compose;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* synthetic */ class ActivityCommonWebViewComposeKt$getSecureWebViewConfiguration$currentOnErrorState$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.core.webview.ui.callback.SecureWebViewError, kotlin.Unit> {
    public static final com.paypal.oslo.feature.activity.ui.webview.compose.ActivityCommonWebViewComposeKt$getSecureWebViewConfiguration$currentOnErrorState$1$1 getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.activity.ui.webview.compose.ActivityCommonWebViewComposeKt$getSecureWebViewConfiguration$currentOnErrorState$1$1();

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.core.webview.ui.callback.SecureWebViewError secureWebViewError) {
        com.paypal.oslo.core.webview.ui.callback.SecureWebViewError secureWebViewError2 = secureWebViewError;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secureWebViewError2, "");
        com.paypal.oslo.feature.activity.ui.webview.states.ActivityWebViewOnLoadFailureStateKt.onLoadFailed(secureWebViewError2);
        return kotlin.Unit.INSTANCE;
    }

    ActivityCommonWebViewComposeKt$getSecureWebViewConfiguration$currentOnErrorState$1$1() {
        super(1, com.paypal.oslo.feature.activity.ui.webview.states.ActivityWebViewOnLoadFailureStateKt.class, "onLoadFailed", "onLoadFailed(Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewError;)V", 1);
    }
}
