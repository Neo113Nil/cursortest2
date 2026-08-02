package com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/usecase/ProcessOneShotAuthenticationDataUseCase;", "", "Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;", "session", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;)V", "Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationSuccessData;", "authData", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutPreferences;", "invoke", "(Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationSuccessData;)Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutPreferences;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ProcessOneShotAuthenticationDataUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession getHighSpeedVideoSizes;

    @javax.inject.Inject
    public ProcessOneShotAuthenticationDataUseCase(com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appSwitchSession, "");
        this.getHighSpeedVideoSizes = appSwitchSession;
    }

    public final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutPreferences invoke(com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData authData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authData, "");
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.OneShotAuthenticationData oneShotAuthenticationData = com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.OneShotAuthenticationDataMapperKt.toOneShotAuthenticationData(authData);
        return com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutPreferences.copy$default(oneShotAuthenticationData.getCheckoutPreferences(), oneShotAuthenticationData.getCheckoutPreferences().getCheckoutURLs().withAuthCode(oneShotAuthenticationData.getAuthCode()).withUniversalLinkParams(this.getHighSpeedVideoSizes.getUniversalLinkUri()), null, null, 6, null);
    }
}
