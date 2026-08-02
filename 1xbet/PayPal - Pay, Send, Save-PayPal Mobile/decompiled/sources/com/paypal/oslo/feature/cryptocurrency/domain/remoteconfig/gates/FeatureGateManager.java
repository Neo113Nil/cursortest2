package com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u0004À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/gates/FeatureGateManager;", "", "", "isPyusdRewardsEnabled", "()Z", "isRecurringBuysEnabled", "isSendFeatureEnabled", "isReceiveFeatureEnabled", "isConvertToPYUSDEnabled", "isMockApiEnabled", "isGainsAndLossesEnabled", "isPriceAlertsEnabled", "isAddressBookEnabled", "isSellToPyusdEnabled", "isCelsiusEnabled", "isPpdDisclaimersEnabled", "isLoyaltyForCryptoEnabled", "isBizAccountEnabled", "isOneOnboardingIntegrationEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface FeatureGateManager {
    boolean isAddressBookEnabled();

    boolean isBizAccountEnabled();

    boolean isCelsiusEnabled();

    boolean isConvertToPYUSDEnabled();

    boolean isGainsAndLossesEnabled();

    boolean isLoyaltyForCryptoEnabled();

    boolean isMockApiEnabled();

    boolean isOneOnboardingIntegrationEnabled();

    boolean isPpdDisclaimersEnabled();

    boolean isPriceAlertsEnabled();

    boolean isPyusdRewardsEnabled();

    boolean isReceiveFeatureEnabled();

    boolean isRecurringBuysEnabled();

    boolean isSellToPyusdEnabled();

    boolean isSendFeatureEnabled();
}
