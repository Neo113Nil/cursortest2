package com.paypal.oslo.feature.cryptocurrency.ui.assetselection.mapper;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/mapper/PricesToAssetSelectionUiItemMapper;", "", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoPriceMovementFormatter;", "cryptoPriceMovementFormatter", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoPriceFormatter;", "cryptoPriceFormatter", "Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/formatter/PYUSDRateFormatter;", "pyusdRateFormatter", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoPriceMovementFormatter;Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoPriceFormatter;Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/formatter/PYUSDRateFormatter;)V", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/CryptoMarketPrice;", "input", "", "pyusdRewardsRate", "Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/model/CryptoAssetSelectionUiItem;", "map", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/CryptoMarketPrice;Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/model/CryptoAssetSelectionUiItem;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoPriceMovementFormatter;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoPriceFormatter;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/formatter/PYUSDRateFormatter;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PricesToAssetSelectionUiItemMapper {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceMovementFormatter Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.formatter.PYUSDRateFormatter getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public PricesToAssetSelectionUiItemMapper(com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceMovementFormatter cryptoPriceMovementFormatter, com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter cryptoPriceFormatter, com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.formatter.PYUSDRateFormatter pYUSDRateFormatter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoPriceMovementFormatter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoPriceFormatter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pYUSDRateFormatter, "");
        this.Camera2StreamConfigurationMap = cryptoPriceMovementFormatter;
        this.getHighResolutionOutputSizeshNQ4ISI = cryptoPriceFormatter;
        this.getHighSpeedVideoFpsRanges = pYUSDRateFormatter;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionUiItem map$default(com.paypal.oslo.feature.cryptocurrency.ui.assetselection.mapper.PricesToAssetSelectionUiItemMapper pricesToAssetSelectionUiItemMapper, com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoMarketPrice cryptoMarketPrice, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return pricesToAssetSelectionUiItemMapper.map(cryptoMarketPrice, str);
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionUiItem map(com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoMarketPrice input, java.lang.String pyusdRewardsRate) {
        com.paypal.oslo.feature.cryptocurrency.ui.common.model.prices.CryptoPriceMovementIndicatorUi cryptoPriceMovementIndicatorUi;
        com.paypal.oslo.feature.cryptocurrency.ui.hub.model.BadgeInfoUi badgeInfoUi;
        java.lang.String str;
        com.paypal.oslo.feature.cryptocurrency.ui.common.model.prices.CryptoPriceMovementIndicatorUi cryptoPriceMovementIndicatorUi2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        java.lang.String assetSymbol = input.getAssetSymbol();
        java.lang.String assetName = input.getAssetName();
        java.lang.String assetSymbol2 = input.getAssetSymbol();
        java.lang.String logoUrl = input.getLogoUrl();
        java.lang.String formatPrice$default = com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter.formatPrice$default(this.getHighResolutionOutputSizeshNQ4ISI, input.getPriceValue(), input.getPriceCurrencyCode(), null, false, false, 28, null);
        java.lang.String shortPriceMovement = this.Camera2StreamConfigurationMap.shortPriceMovement(input.getPriceMovementPercent(), input.getPriceMovementIndicator());
        com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator priceMovementIndicator = input.getPriceMovementIndicator();
        int i = priceMovementIndicator == null ? -1 : com.paypal.oslo.feature.cryptocurrency.ui.assetselection.mapper.PricesToAssetSelectionUiItemMapper.WhenMappings.$EnumSwitchMapping$0[priceMovementIndicator.ordinal()];
        if (i != -1) {
            if (i == 1) {
                cryptoPriceMovementIndicatorUi2 = com.paypal.oslo.feature.cryptocurrency.ui.common.model.prices.CryptoPriceMovementIndicatorUi.UP;
            } else if (i == 2) {
                cryptoPriceMovementIndicatorUi2 = com.paypal.oslo.feature.cryptocurrency.ui.common.model.prices.CryptoPriceMovementIndicatorUi.DOWN;
            } else {
                if (i != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                cryptoPriceMovementIndicatorUi2 = com.paypal.oslo.feature.cryptocurrency.ui.common.model.prices.CryptoPriceMovementIndicatorUi.CONSTANT;
            }
            cryptoPriceMovementIndicatorUi = cryptoPriceMovementIndicatorUi2;
        } else {
            cryptoPriceMovementIndicatorUi = null;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(input.getAssetSymbol(), "PYUSD") && (str = pyusdRewardsRate) != null && str.length() != 0) {
            java.lang.String format$default = com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.formatter.PYUSDRateFormatter.format$default(this.getHighSpeedVideoFpsRanges, pyusdRewardsRate, null, 2, null);
            if (format$default.length() <= 0) {
                format$default = null;
            }
            if (format$default != null) {
                com.paypal.pds.components.BadgeStyle.Positive positive = com.paypal.pds.components.BadgeStyle.Positive.INSTANCE;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(format$default);
                sb.append("% rewards");
                badgeInfoUi = new com.paypal.oslo.feature.cryptocurrency.ui.hub.model.BadgeInfoUi(positive, sb.toString());
                return new com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionUiItem(assetSymbol, logoUrl, assetName, assetSymbol2, formatPrice$default, shortPriceMovement, cryptoPriceMovementIndicatorUi, badgeInfoUi);
            }
        }
        badgeInfoUi = null;
        return new com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionUiItem(assetSymbol, logoUrl, assetName, assetSymbol2, formatPrice$default, shortPriceMovement, cryptoPriceMovementIndicatorUi, badgeInfoUi);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator.values().length];
            try {
                iArr[com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator.UP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator.DOWN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator.CONSTANT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
