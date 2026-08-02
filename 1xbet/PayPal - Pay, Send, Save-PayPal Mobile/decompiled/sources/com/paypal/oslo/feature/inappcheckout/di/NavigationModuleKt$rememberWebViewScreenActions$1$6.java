package com.paypal.oslo.feature.inappcheckout.di;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class NavigationModuleKt$rememberWebViewScreenActions$1$6 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<kotlin.Unit> {
    public final void Camera2StreamConfigurationMap() {
        ((com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel) this.receiver).onRypPageRendered();
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ kotlin.Unit invoke() {
        Camera2StreamConfigurationMap();
        return kotlin.Unit.INSTANCE;
    }

    NavigationModuleKt$rememberWebViewScreenActions$1$6(java.lang.Object obj) {
        super(0, obj, com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel.class, "onRypPageRendered", "onRypPageRendered()V", 0);
    }
}
