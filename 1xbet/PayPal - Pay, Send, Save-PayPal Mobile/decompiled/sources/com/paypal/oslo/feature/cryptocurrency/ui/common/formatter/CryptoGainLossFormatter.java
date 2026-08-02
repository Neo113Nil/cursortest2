package com.paypal.oslo.feature.cryptocurrency.ui.common.formatter;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoGainLossFormatter;", "", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoPriceFormatter;", "cryptoPriceFormatter", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoPriceFormatter;)V", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/CryptoHolding;", "holding", "", "format", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/CryptoHolding;)Ljava/lang/String;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/TotalReturn;", "totalReturn", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/TotalReturn;)Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoPriceFormatter;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoGainLossFormatter {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public CryptoGainLossFormatter(com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter cryptoPriceFormatter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoPriceFormatter, "");
        this.Camera2StreamConfigurationMap = cryptoPriceFormatter;
    }

    public final java.lang.String format(com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHolding holding) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holding, "");
        if (holding.getGainOrLossAmount() == null || holding.getGainOrLossPercent() == null) {
            return null;
        }
        java.lang.String formatPrice$default = com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter.formatPrice$default(this.Camera2StreamConfigurationMap, holding.getGainOrLossAmount(), holding.getFiatAmountCurrencyCode(), null, false, false, 28, null);
        java.lang.String gainOrLossPercent = holding.getGainOrLossPercent();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(formatPrice$default);
        sb.append(" (");
        sb.append(gainOrLossPercent);
        sb.append("%)");
        return sb.toString();
    }

    public final java.lang.String format(com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.TotalReturn totalReturn) {
        java.lang.String str = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalReturn, "");
        java.lang.String formatPrice$default = com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter.formatPrice$default(this.Camera2StreamConfigurationMap, totalReturn.getFiatAmountValue(), totalReturn.getFiatAmountCurrencyCode(), null, false, false, 28, null);
        com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoGainOrLossStatus status = totalReturn.getStatus();
        int i = status == null ? -1 : com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoGainLossFormatter.WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i == 1) {
            str = "↑";
        } else if (i == 2) {
            str = "↓";
        }
        java.lang.String amountMovementPercent = totalReturn.getAmountMovementPercent();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(formatPrice$default);
        sb.append(" (");
        sb.append(amountMovementPercent);
        sb.append("%)");
        return sb.toString();
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoGainOrLossStatus.values().length];
            try {
                iArr[com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoGainOrLossStatus.GAIN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoGainOrLossStatus.LOSS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
