package com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.mapper;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/mapper/PYUSDRewardsHoldingsUiMapper;", "", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoPriceFormatter;", "cryptoPriceFormatter", "Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CurrencyProvider;", "currencyProvider", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoPriceFormatter;Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CurrencyProvider;)V", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/PYUSDRewardHoldings;", "input", "Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsHoldingsUi;", "map", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/PYUSDRewardHoldings;)Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsHoldingsUi;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoPriceFormatter;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CurrencyProvider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PYUSDRewardsHoldingsUiMapper {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public PYUSDRewardsHoldingsUiMapper(com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter cryptoPriceFormatter, com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider currencyProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoPriceFormatter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyProvider, "");
        this.getHighSpeedVideoFpsRanges = cryptoPriceFormatter;
        this.Camera2StreamConfigurationMap = currencyProvider;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsHoldingsUi map(com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.PYUSDRewardHoldings input) {
        java.lang.String formatPrice$default;
        java.lang.String formatPrice$default2;
        com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.RewardHolding accrued;
        com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.RewardHolding lifetimePayout;
        if (input == null || (lifetimePayout = input.getLifetimePayout()) == null || (formatPrice$default = lifetimePayout.getAssetQuantity()) == null) {
            formatPrice$default = com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter.formatPrice$default(this.getHighSpeedVideoFpsRanges, "0", this.Camera2StreamConfigurationMap.getCurrencyCode(), null, false, false, 20, null);
        }
        if (input == null || (accrued = input.getAccrued()) == null || (formatPrice$default2 = accrued.getAssetQuantity()) == null) {
            formatPrice$default2 = com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter.formatPrice$default(this.getHighSpeedVideoFpsRanges, "0", this.Camera2StreamConfigurationMap.getCurrencyCode(), null, false, false, 20, null);
        }
        return new com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsHoldingsUi(formatPrice$default, formatPrice$default2, kotlin.jvm.internal.Intrinsics.areEqual(input != null ? input.getLastPayoutStatus() : null, com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED));
    }
}
