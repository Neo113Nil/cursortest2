package com.paypal.oslo.feature.inappcheckout.features.webview;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class AppSwitchWebViewViewModel$setup$2$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<arrow.core.Either<? extends com.paypal.oslo.feature.identity.api.navigation.result.UserCanceled, ? extends com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData>, kotlin.Unit> {
    public final void Camera2StreamConfigurationMap(arrow.core.Either<com.paypal.oslo.feature.identity.api.navigation.result.UserCanceled, com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData> either) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either, "");
        ((com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel) this.receiver).handleCheckoutAuthenticationResult(either);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(arrow.core.Either<? extends com.paypal.oslo.feature.identity.api.navigation.result.UserCanceled, ? extends com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData> either) {
        Camera2StreamConfigurationMap(either);
        return kotlin.Unit.INSTANCE;
    }

    AppSwitchWebViewViewModel$setup$2$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel.class, "handleCheckoutAuthenticationResult", "handleCheckoutAuthenticationResult(Larrow/core/Either;)V", 0);
    }
}
