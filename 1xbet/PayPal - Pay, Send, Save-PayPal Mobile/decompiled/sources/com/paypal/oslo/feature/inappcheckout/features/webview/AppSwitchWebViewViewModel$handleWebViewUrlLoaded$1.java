package com.paypal.oslo.feature.inappcheckout.features.webview;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class AppSwitchWebViewViewModel$handleWebViewUrlLoaded$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect effect) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(effect, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r0), null, null, new com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel$emitEffect$1((com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel) this.receiver, effect, null), 3, null);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect effect) {
        getHighSpeedVideoFpsRanges(effect);
        return kotlin.Unit.INSTANCE;
    }

    AppSwitchWebViewViewModel$handleWebViewUrlLoaded$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel.class, "emitEffect", "emitEffect(Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$Effect;)V", 0);
    }
}
