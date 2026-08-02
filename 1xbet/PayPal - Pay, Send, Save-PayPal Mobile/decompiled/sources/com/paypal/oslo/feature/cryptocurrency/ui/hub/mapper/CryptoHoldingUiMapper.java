package com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/mapper/CryptoHoldingUiMapper;", "", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoPriceFormatter;", "cryptoPriceFormatter", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoPriceMovementFormatter;", "cryptoPriceMovementFormatter", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoPriceFormatter;Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoPriceMovementFormatter;)V", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/CryptoHolding;", "input", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHoldingUi;", "map", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/CryptoHolding;)Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHoldingUi;", "p0", "", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/CryptoHolding;)Z", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoPriceFormatter;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoPriceMovementFormatter;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoHoldingUiMapper {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceMovementFormatter getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public CryptoHoldingUiMapper(com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter cryptoPriceFormatter, com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceMovementFormatter cryptoPriceMovementFormatter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoPriceFormatter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoPriceMovementFormatter, "");
        this.getHighSpeedVideoFpsRanges = cryptoPriceFormatter;
        this.getHighResolutionOutputSizeshNQ4ISI = cryptoPriceMovementFormatter;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHoldingUi map(com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHolding input) {
        com.paypal.oslo.feature.cryptocurrency.ui.common.model.prices.CryptoPriceMovementIndicatorUi cryptoPriceMovementIndicatorUi;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        java.lang.String assetName = input.getAssetName();
        java.lang.String assetSymbol = input.getAssetSymbol();
        java.lang.String assetQuantity = input.getAssetQuantity();
        java.lang.String formatPrice$default = com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter.formatPrice$default(this.getHighSpeedVideoFpsRanges, input.getFiatPriceValue(), input.getFiatAmountCurrencyCode(), null, false, false, 28, null);
        java.lang.String formatPrice$default2 = com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter.formatPrice$default(this.getHighSpeedVideoFpsRanges, input.getFiatAmountValue(), input.getFiatAmountCurrencyCode(), null, false, false, 28, null);
        java.lang.String logoUrl = input.getLogoUrl();
        java.lang.String shortPriceMovement = this.getHighResolutionOutputSizeshNQ4ISI.shortPriceMovement(input.getPriceMovementPercent(), input.getPriceMovementIndicator());
        com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator priceMovementIndicator = input.getPriceMovementIndicator();
        int i = priceMovementIndicator == null ? -1 : com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.CryptoHoldingUiMapper.WhenMappings.$EnumSwitchMapping$0[priceMovementIndicator.ordinal()];
        if (i == -1) {
            cryptoPriceMovementIndicatorUi = null;
        } else if (i == 1) {
            cryptoPriceMovementIndicatorUi = com.paypal.oslo.feature.cryptocurrency.ui.common.model.prices.CryptoPriceMovementIndicatorUi.UP;
        } else if (i == 2) {
            cryptoPriceMovementIndicatorUi = com.paypal.oslo.feature.cryptocurrency.ui.common.model.prices.CryptoPriceMovementIndicatorUi.DOWN;
        } else {
            if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            cryptoPriceMovementIndicatorUi = com.paypal.oslo.feature.cryptocurrency.ui.common.model.prices.CryptoPriceMovementIndicatorUi.CONSTANT;
        }
        return new com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHoldingUi(assetName, assetSymbol, assetQuantity, formatPrice$default, formatPrice$default2, logoUrl, shortPriceMovement, cryptoPriceMovementIndicatorUi, getHighSpeedVideoSizes(input), null, 512, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
    
        r9 = r9.getPriceMovementPercent();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean getHighSpeedVideoSizes(com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHolding p0) {
        java.lang.String priceMovementPercent;
        if (kotlin.jvm.internal.Intrinsics.areEqual(p0.getAssetSymbol(), "PYUSD") || priceMovementPercent == null) {
            return false;
        }
        try {
            return !kotlin.jvm.internal.Intrinsics.areEqual(new java.math.BigDecimal(priceMovementPercent), java.math.BigDecimal.ZERO);
        } catch (java.lang.NumberFormatException e) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.cryptocurrency.LoggerKt.log, "Failed to parse crypto price movement percent", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("percent", priceMovementPercent)), null, e, 4, null);
            return false;
        }
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
