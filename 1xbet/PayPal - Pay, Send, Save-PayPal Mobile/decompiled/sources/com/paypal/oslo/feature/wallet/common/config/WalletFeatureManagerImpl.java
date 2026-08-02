package com.paypal.oslo.feature.wallet.common.config;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\bJ\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\bJ\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\bJ\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\bJ\u000f\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\bJ\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\bJ\u000f\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\bJ\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\bR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/wallet/common/config/WalletFeatureManagerImpl;", "Lcom/paypal/oslo/feature/wallet/common/config/WalletFeatureManager;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;)V", "", "areRevolvingCreditAlertsEnabled", "()Z", "isAddBankManualEnabled", "isBalanceAddMoneyEnabled", "isInStorePreferencesEnabled", "isLowBalanceReloadEnabled", "isManageBankEnabled", "isMoneyPoolsTileEnabled", "isObReconnectEnabled", "isOnlinePreferencesEnabled", "isSavingsEnabled", "isOneOnboardingForAddFundsEnabled", "isCardDetailEnabled", "isUpdateCardEnabled", "isEditCurrencyEnabled", "isEditNicknameEnabled", "isRemoveCardEnabled", "isExpiredCardEnabled", "isConfirmCardEnabled", "isLinkRewardsEnabled", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WalletFeatureManagerImpl implements com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.FeatureGate getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public WalletFeatureManagerImpl(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        this.getHighSpeedVideoFpsRanges = featureGate;
    }

    @Override // com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager
    public final boolean areRevolvingCreditAlertsEnabled() {
        return this.getHighSpeedVideoFpsRanges.checkGate(com.paypal.oslo.feature.wallet.common.WalletFeatureGates.INSTANCE.getRevolvingCreditAlertsEnabled());
    }

    @Override // com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager
    public final boolean isAddBankManualEnabled() {
        return this.getHighSpeedVideoFpsRanges.checkGate(com.paypal.oslo.feature.wallet.common.WalletFeatureGates.INSTANCE.getAddBankManualEnabled());
    }

    @Override // com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager
    public final boolean isBalanceAddMoneyEnabled() {
        return this.getHighSpeedVideoFpsRanges.checkGate(com.paypal.oslo.feature.wallet.common.BalanceFeatureGates.INSTANCE.getBalanceAddMoneyEnabled());
    }

    @Override // com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager
    public final boolean isInStorePreferencesEnabled() {
        return this.getHighSpeedVideoFpsRanges.checkGate(com.paypal.oslo.feature.wallet.common.WalletFeatureGates.INSTANCE.getInStorePreferencesEnabled());
    }

    @Override // com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager
    public final boolean isLowBalanceReloadEnabled() {
        return this.getHighSpeedVideoFpsRanges.checkGate(com.paypal.oslo.feature.wallet.common.WalletFeatureGates.INSTANCE.getLowBalanceReloadEnabled());
    }

    @Override // com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager
    public final boolean isManageBankEnabled() {
        return this.getHighSpeedVideoFpsRanges.checkGate(com.paypal.oslo.feature.wallet.common.WalletFeatureGates.INSTANCE.getManageBankEnabled());
    }

    @Override // com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager
    public final boolean isMoneyPoolsTileEnabled() {
        return this.getHighSpeedVideoFpsRanges.checkGate(com.paypal.oslo.feature.wallet.common.WalletFeatureGates.INSTANCE.getMoneyPoolsTileEnabled());
    }

    @Override // com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager
    public final boolean isObReconnectEnabled() {
        return this.getHighSpeedVideoFpsRanges.checkGate(com.paypal.oslo.feature.wallet.common.WalletFeatureGates.INSTANCE.getObReconnectEnabled());
    }

    @Override // com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager
    public final boolean isOnlinePreferencesEnabled() {
        return this.getHighSpeedVideoFpsRanges.checkGate(com.paypal.oslo.feature.wallet.common.WalletFeatureGates.INSTANCE.getOnlinePreferencesEnabled());
    }

    @Override // com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager
    public final boolean isSavingsEnabled() {
        return this.getHighSpeedVideoFpsRanges.checkGate(com.paypal.oslo.feature.wallet.common.WalletFeatureGates.INSTANCE.getSavingsEnabled());
    }

    @Override // com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager
    public final boolean isOneOnboardingForAddFundsEnabled() {
        return this.getHighSpeedVideoFpsRanges.checkGate(com.paypal.oslo.feature.wallet.common.WalletFeatureGates.INSTANCE.getOneOnboardingForAddFundsEnabled());
    }

    @Override // com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager
    public final boolean isCardDetailEnabled() {
        return this.getHighSpeedVideoFpsRanges.checkGate(com.paypal.oslo.feature.wallet.common.WalletFeatureGates.INSTANCE.getCardDetailEnabled());
    }

    @Override // com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager
    public final boolean isUpdateCardEnabled() {
        return this.getHighSpeedVideoFpsRanges.checkGate(com.paypal.oslo.feature.wallet.common.WalletFeatureGates.INSTANCE.getUpdateCardEnabled());
    }

    @Override // com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager
    public final boolean isEditCurrencyEnabled() {
        return this.getHighSpeedVideoFpsRanges.checkGate(com.paypal.oslo.feature.wallet.common.WalletFeatureGates.INSTANCE.getEditCurrencyEnabled());
    }

    @Override // com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager
    public final boolean isEditNicknameEnabled() {
        return this.getHighSpeedVideoFpsRanges.checkGate(com.paypal.oslo.feature.wallet.common.WalletFeatureGates.INSTANCE.getEditNicknameEnabled());
    }

    @Override // com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager
    public final boolean isRemoveCardEnabled() {
        return this.getHighSpeedVideoFpsRanges.checkGate(com.paypal.oslo.feature.wallet.common.WalletFeatureGates.INSTANCE.getRemoveCardEnabled());
    }

    @Override // com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager
    public final boolean isExpiredCardEnabled() {
        return this.getHighSpeedVideoFpsRanges.checkGate(com.paypal.oslo.feature.wallet.common.WalletFeatureGates.INSTANCE.getExpiredCardEnabled());
    }

    @Override // com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager
    public final boolean isConfirmCardEnabled() {
        return this.getHighSpeedVideoFpsRanges.checkGate(com.paypal.oslo.feature.wallet.common.WalletFeatureGates.INSTANCE.getConfirmCardEnabled());
    }

    @Override // com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager
    public final boolean isLinkRewardsEnabled() {
        return this.getHighSpeedVideoFpsRanges.checkGate(com.paypal.oslo.feature.wallet.common.WalletFeatureGates.INSTANCE.getLinkRewardsEnabled());
    }
}
