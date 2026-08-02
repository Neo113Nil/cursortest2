package com.paypal.oslo.feature.activity.ui.webview.compose;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* synthetic */ class ActivityCommonWebViewComposeKt$getSecureWebViewConfiguration$currentOnSuccessState$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> {
    public static final com.paypal.oslo.feature.activity.ui.webview.compose.ActivityCommonWebViewComposeKt$getSecureWebViewConfiguration$currentOnSuccessState$1$1 getHighSpeedVideoSizes = new com.paypal.oslo.feature.activity.ui.webview.compose.ActivityCommonWebViewComposeKt$getSecureWebViewConfiguration$currentOnSuccessState$1$1();

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(java.lang.String str) {
        java.lang.String str2 = str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        com.paypal.oslo.feature.activity.ui.webview.states.ActivityWebViewOnLoadSuccessStateKt.onLoadSuccess(str2);
        return kotlin.Unit.INSTANCE;
    }

    ActivityCommonWebViewComposeKt$getSecureWebViewConfiguration$currentOnSuccessState$1$1() {
        super(1, com.paypal.oslo.feature.activity.ui.webview.states.ActivityWebViewOnLoadSuccessStateKt.class, "onLoadSuccess", "onLoadSuccess(Ljava/lang/String;)V", 1);
    }
}
