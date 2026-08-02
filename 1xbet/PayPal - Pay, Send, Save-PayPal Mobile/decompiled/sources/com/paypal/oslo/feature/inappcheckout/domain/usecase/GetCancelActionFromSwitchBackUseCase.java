package com.paypal.oslo.feature.inappcheckout.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/GetCancelActionFromSwitchBackUseCase;", "", "Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;", "appSwitchSession", "Lcom/paypal/oslo/feature/inappcheckout/features/switchback/SwitchBackActionBuilder;", "actionBuilder", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;Lcom/paypal/oslo/feature/inappcheckout/features/switchback/SwitchBackActionBuilder;)V", "Landroid/net/Uri;", "webViewUri", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLs;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.CHECKOUT_URLS_KEY, "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UrlLoadingInterceptingAction$RunIntent$Cancel;", "invoke", "(Landroid/net/Uri;Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLs;)Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UrlLoadingInterceptingAction$RunIntent$Cancel;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/inappcheckout/features/switchback/SwitchBackActionBuilder;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GetCancelActionFromSwitchBackUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackActionBuilder getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession getHighSpeedVideoSizes;

    @javax.inject.Inject
    public GetCancelActionFromSwitchBackUseCase(com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession, com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackActionBuilder switchBackActionBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appSwitchSession, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(switchBackActionBuilder, "");
        this.getHighSpeedVideoSizes = appSwitchSession;
        this.getHighSpeedVideoFpsRangesFor = switchBackActionBuilder;
    }

    public final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UrlLoadingInterceptingAction.RunIntent.Cancel invoke(android.net.Uri webViewUri, com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs checkoutURLs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutURLs, "");
        return this.getHighSpeedVideoFpsRangesFor.buildSwitchBackActionForCancel(checkoutURLs, this.getHighSpeedVideoSizes.getMerchantIntegrationChannel(), this.getHighSpeedVideoSizes.getButtonSessionId(), checkoutURLs.getBridgeUrl(), webViewUri);
    }
}
