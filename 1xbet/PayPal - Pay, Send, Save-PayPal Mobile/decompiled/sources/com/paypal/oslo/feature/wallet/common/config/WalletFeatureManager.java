package com.paypal.oslo.feature.wallet.common.config;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0002H&¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u0002H&¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0002H&¢\u0006\u0004\b\u0015\u0010\u0004J\u000f\u0010\u0016\u001a\u00020\u0002H&¢\u0006\u0004\b\u0016\u0010\u0004À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/common/config/WalletFeatureManager;", "", "", "areRevolvingCreditAlertsEnabled", "()Z", "isAddBankManualEnabled", "isBalanceAddMoneyEnabled", "isInStorePreferencesEnabled", "isLowBalanceReloadEnabled", "isManageBankEnabled", "isMoneyPoolsTileEnabled", "isObReconnectEnabled", "isOneOnboardingForAddFundsEnabled", "isOnlinePreferencesEnabled", "isSavingsEnabled", "isCardDetailEnabled", "isUpdateCardEnabled", "isEditCurrencyEnabled", "isEditNicknameEnabled", "isRemoveCardEnabled", "isExpiredCardEnabled", "isConfirmCardEnabled", "isLinkRewardsEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface WalletFeatureManager {
    boolean areRevolvingCreditAlertsEnabled();

    boolean isAddBankManualEnabled();

    boolean isBalanceAddMoneyEnabled();

    boolean isCardDetailEnabled();

    boolean isConfirmCardEnabled();

    boolean isEditCurrencyEnabled();

    boolean isEditNicknameEnabled();

    boolean isExpiredCardEnabled();

    boolean isInStorePreferencesEnabled();

    boolean isLinkRewardsEnabled();

    boolean isLowBalanceReloadEnabled();

    boolean isManageBankEnabled();

    boolean isMoneyPoolsTileEnabled();

    boolean isObReconnectEnabled();

    boolean isOneOnboardingForAddFundsEnabled();

    boolean isOnlinePreferencesEnabled();

    boolean isRemoveCardEnabled();

    boolean isSavingsEnabled();

    boolean isUpdateCardEnabled();
}
