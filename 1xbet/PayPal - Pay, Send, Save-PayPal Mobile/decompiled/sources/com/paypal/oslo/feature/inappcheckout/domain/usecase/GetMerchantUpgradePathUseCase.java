package com.paypal.oslo.feature.inappcheckout.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/GetMerchantUpgradePathUseCase;", "", "Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;", "appSwitchSession", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;)V", "Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/UpgradePath;", "invoke", "()Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/UpgradePath;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GetMerchantUpgradePathUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession getHighSpeedVideoSizes;

    @javax.inject.Inject
    public GetMerchantUpgradePathUseCase(com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appSwitchSession, "");
        this.getHighSpeedVideoSizes = appSwitchSession;
    }

    public final com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.UpgradePath invoke() {
        if (this.getHighSpeedVideoSizes.isNoMerchantUpgradePath()) {
            return com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.UpgradePath.NoMerchantUpgrade.INSTANCE;
        }
        if (this.getHighSpeedVideoSizes.isMerchantUpgradePath()) {
            return com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.UpgradePath.MerchantUpgrade.INSTANCE;
        }
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs getHighSpeedVideoFpsRanges = this.getHighSpeedVideoSizes.getGetHighSpeedVideoFpsRanges();
        java.lang.String bridgeUrl = getHighSpeedVideoFpsRanges != null ? getHighSpeedVideoFpsRanges.getBridgeUrl() : null;
        if (bridgeUrl == null) {
            bridgeUrl = "";
        }
        return !kotlin.text.StringsKt.isBlank(bridgeUrl) ? com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.UpgradePath.NoMerchantUpgrade.INSTANCE : com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.UpgradePath.MerchantUpgrade.INSTANCE;
    }
}
