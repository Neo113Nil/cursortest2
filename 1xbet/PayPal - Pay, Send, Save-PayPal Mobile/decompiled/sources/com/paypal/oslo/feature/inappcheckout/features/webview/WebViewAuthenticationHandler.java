package com.paypal.oslo.feature.inappcheckout.features.webview;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ=\u0010\u0016\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u001e\u0010\u0015\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u0012\u0004\u0012\u00020\u00140\u0010¢\u0006\u0004\b\u0016\u0010\u0017J=\u0010\u001b\u001a\u00020\u00142\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00140\u0010¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010!\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewAuthenticationHandler;", "", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/usecase/ProcessOneShotAuthenticationDataUseCase;", "processOneShotAuthenticationDataUseCase", "Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;", "appSwitchSession", "Lcom/paypal/oslo/core/navigation/result/NavResultManager;", "navResultManager", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;", "logger", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/usecase/ProcessOneShotAuthenticationDataUseCase;Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;Lcom/paypal/oslo/core/navigation/result/NavResultManager;Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;)V", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$Effect$NavigateToCheckoutAuthentication;", "effect", "Lkotlinx/coroutines/CoroutineScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Lkotlin/Function1;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/api/navigation/result/UserCanceled;", "Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationSuccessData;", "", "onAuthResult", "handleAuthenticationEffect", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$Effect$NavigateToCheckoutAuthentication;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;)V", "checkoutAuthenticationResult", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$Event;", "onEvent", "handleCheckoutAuthenticationResult", "(Larrow/core/Either;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;)V", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/usecase/ProcessOneShotAuthenticationDataUseCase;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/navigation/result/NavResultManager;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class WebViewAuthenticationHandler {
    public static final int $stable = com.paypal.oslo.core.navigation.result.NavResultManager.$stable;
    private final com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger getHighSpeedVideoSizes;
    private final com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.ProcessOneShotAuthenticationDataUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.navigation.result.NavResultManager getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public WebViewAuthenticationHandler(com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.ProcessOneShotAuthenticationDataUseCase processOneShotAuthenticationDataUseCase, com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession, com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(processOneShotAuthenticationDataUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appSwitchSession, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutLogger, "");
        this.getHighSpeedVideoFpsRangesFor = processOneShotAuthenticationDataUseCase;
        this.Camera2StreamConfigurationMap = appSwitchSession;
        this.getHighResolutionOutputSizeshNQ4ISI = navResultManager;
        this.getHighSpeedVideoSizes = checkoutLogger;
    }

    public final void handleAuthenticationEffect(com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect.NavigateToCheckoutAuthentication effect, kotlinx.coroutines.CoroutineScope scope, kotlin.jvm.functions.Function1<? super arrow.core.Either<com.paypal.oslo.feature.identity.api.navigation.result.UserCanceled, com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData>, kotlin.Unit> onAuthResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(effect, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onAuthResult, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(scope, null, null, new com.paypal.oslo.feature.inappcheckout.features.webview.WebViewAuthenticationHandler$handleAuthenticationEffect$1(this, effect, onAuthResult, null), 3, null);
    }

    public final void handleCheckoutAuthenticationResult(arrow.core.Either<com.paypal.oslo.feature.identity.api.navigation.result.UserCanceled, com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData> checkoutAuthenticationResult, kotlinx.coroutines.CoroutineScope scope, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Event, kotlin.Unit> onEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutAuthenticationResult, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onEvent, "");
        if (checkoutAuthenticationResult instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData checkoutAuthenticationSuccessData = (com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData) ((arrow.core.Either.Right) checkoutAuthenticationResult).getValue();
            com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(this.getHighSpeedVideoSizes, "Authentication successful, processing checkout data", null, null, 6, null);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(scope, null, null, new com.paypal.oslo.feature.inappcheckout.features.webview.WebViewAuthenticationHandler$handleCheckoutAuthenticationResult$2$1(this, checkoutAuthenticationSuccessData, onEvent, null), 3, null);
        } else {
            if (checkoutAuthenticationResult instanceof arrow.core.Either.Left) {
                com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(this.getHighSpeedVideoSizes, "Authentication cancelled by user", null, null, 6, null);
                onEvent.invoke(new com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Event.ShowError(true, null));
                return;
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
    }
}
