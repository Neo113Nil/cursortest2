package com.paypal.oslo.feature.inappcheckout.di;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class NavigationModuleKt$rememberWebViewScreenActions$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<kotlin.Unit> {
    public final void getHighSpeedVideoFpsRangesFor() {
        ((com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel) this.receiver).setup();
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ kotlin.Unit invoke() {
        getHighSpeedVideoFpsRangesFor();
        return kotlin.Unit.INSTANCE;
    }

    NavigationModuleKt$rememberWebViewScreenActions$1$1(java.lang.Object obj) {
        super(0, obj, com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel.class, "setup", "setup()V", 0);
    }
}
