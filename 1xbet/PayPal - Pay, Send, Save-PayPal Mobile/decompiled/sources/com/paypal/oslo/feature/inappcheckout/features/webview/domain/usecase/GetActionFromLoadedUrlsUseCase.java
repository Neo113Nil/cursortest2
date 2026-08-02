package com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/usecase/GetActionFromLoadedUrlsUseCase;", "", "Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;", "appSwitchSession", "Lcom/paypal/oslo/feature/inappcheckout/features/switchback/SwitchBackUrlMatcher;", "urlMatcher", "Lcom/paypal/oslo/feature/inappcheckout/features/switchback/SwitchBackActionBuilder;", "actionBuilder", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;Lcom/paypal/oslo/feature/inappcheckout/features/switchback/SwitchBackUrlMatcher;Lcom/paypal/oslo/feature/inappcheckout/features/switchback/SwitchBackActionBuilder;)V", "Landroid/net/Uri;", "modXOLoadedUrl", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UrlLoadingInterceptingAction;", "invoke", "(Landroid/net/Uri;)Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UrlLoadingInterceptingAction;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/inappcheckout/features/switchback/SwitchBackUrlMatcher;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/inappcheckout/features/switchback/SwitchBackActionBuilder;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GetActionFromLoadedUrlsUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackActionBuilder Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackUrlMatcher getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession getHighSpeedVideoSizes;

    @javax.inject.Inject
    public GetActionFromLoadedUrlsUseCase(com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession, com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackUrlMatcher switchBackUrlMatcher, com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackActionBuilder switchBackActionBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appSwitchSession, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(switchBackUrlMatcher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(switchBackActionBuilder, "");
        this.getHighSpeedVideoSizes = appSwitchSession;
        this.getHighSpeedVideoFpsRangesFor = switchBackUrlMatcher;
        this.Camera2StreamConfigurationMap = switchBackActionBuilder;
    }

    public final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UrlLoadingInterceptingAction invoke(android.net.Uri modXOLoadedUrl) {
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UrlLoadingInterceptingAction.RunIntent.Cancel cancel;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modXOLoadedUrl, "");
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs getHighSpeedVideoFpsRanges = this.getHighSpeedVideoSizes.getGetHighSpeedVideoFpsRanges();
        if (getHighSpeedVideoFpsRanges != null) {
            com.paypal.oslo.feature.inappcheckout.features.switchback.model.SwitchBackToMerchantType determineSwitchBackType = this.getHighSpeedVideoFpsRangesFor.determineSwitchBackType(modXOLoadedUrl, getHighSpeedVideoFpsRanges);
            if (determineSwitchBackType == null) {
                cancel = null;
            } else if (determineSwitchBackType.isResume()) {
                cancel = this.Camera2StreamConfigurationMap.buildSwitchBackActionForResume(getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes.getMerchantIntegrationChannel(), this.getHighSpeedVideoSizes.getButtonSessionId(), getHighSpeedVideoFpsRanges.getBridgeUrl(), modXOLoadedUrl);
            } else {
                cancel = this.Camera2StreamConfigurationMap.buildSwitchBackActionForCancel(getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes.getMerchantIntegrationChannel(), this.getHighSpeedVideoSizes.getButtonSessionId(), getHighSpeedVideoFpsRanges.getBridgeUrl(), modXOLoadedUrl);
            }
            if (cancel != null) {
                return cancel;
            }
        }
        return com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UrlLoadingInterceptingAction.NoOp.INSTANCE;
    }
}
