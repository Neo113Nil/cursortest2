package com.paypal.oslo.feature.settings.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/settings/domain/usecase/RefreshItemUseCase;", "", "Lcom/paypal/oslo/feature/settings/domain/repository/ISettingsRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/settings/domain/repository/ISettingsRepository;)V", "", "itemId", "Lcom/paypal/oslo/feature/settings/domain/usecase/RefreshItemResult;", "invoke", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/settings/domain/usecase/RefreshItemResult;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/settings/domain/repository/ISettingsRepository;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RefreshItemUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public RefreshItemUseCase(com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository iSettingsRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iSettingsRepository, "");
        this.getHighSpeedVideoSizes = iSettingsRepository;
    }

    public final com.paypal.oslo.feature.settings.domain.usecase.RefreshItemResult invoke(java.lang.String itemId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(itemId, "");
        switch (itemId.hashCode()) {
            case -1725745417:
                if (itemId.equals(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.DataAndPrivacy.PASSKEY)) {
                    return new com.paypal.oslo.feature.settings.domain.usecase.RefreshItemResult(com.paypal.oslo.feature.settings.domain.model.SettingSection.DATA_PRIVACY, this.getHighSpeedVideoSizes.getPasskeyStatusFlow());
                }
                return null;
            case -968818588:
                if (itemId.equals(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.Account.ACCOUNT_VISIBILITY)) {
                    return new com.paypal.oslo.feature.settings.domain.usecase.RefreshItemResult(com.paypal.oslo.feature.settings.domain.model.SettingSection.ACCOUNT, this.getHighSpeedVideoSizes.getAccountVisibilityStatusFlow());
                }
                return null;
            case -11599639:
                if (itemId.equals(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.PaymentPreferences.PAYPAL_BALANCE)) {
                    return new com.paypal.oslo.feature.settings.domain.usecase.RefreshItemResult(com.paypal.oslo.feature.settings.domain.model.SettingSection.PAYMENT_PREFERENCES, this.getHighSpeedVideoSizes.getIsAutoReloadEnabledBadge());
                }
                return null;
            case 1290675020:
                if (itemId.equals(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.PaymentPreferences.PAYPAL_CREDIT)) {
                    return new com.paypal.oslo.feature.settings.domain.usecase.RefreshItemResult(com.paypal.oslo.feature.settings.domain.model.SettingSection.PAYMENT_PREFERENCES, this.getHighSpeedVideoSizes.getCreditCardStatusBadge());
                }
                return null;
            case 1353166612:
                if (itemId.equals(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.PaymentPreferences.AUTO_SAVE)) {
                    return new com.paypal.oslo.feature.settings.domain.usecase.RefreshItemResult(com.paypal.oslo.feature.settings.domain.model.SettingSection.PAYMENT_PREFERENCES, this.getHighSpeedVideoSizes.getAutoSaveStatusBadge());
                }
                return null;
            case 1359998484:
                if (itemId.equals(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.PaymentPreferences.SAVINGS_SMART_ROUTE)) {
                    return new com.paypal.oslo.feature.settings.domain.usecase.RefreshItemResult(com.paypal.oslo.feature.settings.domain.model.SettingSection.PAYMENT_PREFERENCES, this.getHighSpeedVideoSizes.getIsSmartRouteEnabledBadge());
                }
                return null;
            case 1805429218:
                if (itemId.equals(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.PaymentPreferences.PAYPAL_CASHBACK_CARD)) {
                    return new com.paypal.oslo.feature.settings.domain.usecase.RefreshItemResult(com.paypal.oslo.feature.settings.domain.model.SettingSection.PAYMENT_PREFERENCES, this.getHighSpeedVideoSizes.getCashBackCardStatusBadge());
                }
                return null;
            default:
                return null;
        }
    }
}
