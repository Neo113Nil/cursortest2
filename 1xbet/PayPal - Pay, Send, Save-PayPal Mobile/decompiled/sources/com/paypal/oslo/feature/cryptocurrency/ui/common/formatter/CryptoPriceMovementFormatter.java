package com.paypal.oslo.feature.cryptocurrency.ui.common.formatter;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoPriceMovementFormatter;", "", "<init>", "()V", "", "priceMovementPercent", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/CryptoPriceMovementIndicator;", "priceMovementIndicator", "shortPriceMovement", "(Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/CryptoPriceMovementIndicator;)Ljava/lang/String;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/model/prices/CryptoPriceMovementIndicatorUi;", "(Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/ui/common/model/prices/CryptoPriceMovementIndicatorUi;)Ljava/lang/String;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoPriceMovementFormatter {
    public static final int $stable = 0;

    @javax.inject.Inject
    public CryptoPriceMovementFormatter() {
    }

    public final java.lang.String shortPriceMovement(java.lang.String priceMovementPercent, com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator priceMovementIndicator) {
        java.lang.String str;
        if (priceMovementPercent == null) {
            return null;
        }
        int i = priceMovementIndicator == null ? -1 : com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceMovementFormatter.WhenMappings.$EnumSwitchMapping$0[priceMovementIndicator.ordinal()];
        if (i == 1) {
            str = "↓";
        } else if (i == 2) {
            str = "";
        } else {
            str = "↑";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(priceMovementPercent);
        sb.append("%");
        return sb.toString();
    }

    public final java.lang.String shortPriceMovement(java.lang.String priceMovementPercent, com.paypal.oslo.feature.cryptocurrency.ui.common.model.prices.CryptoPriceMovementIndicatorUi priceMovementIndicator) {
        java.lang.String str;
        if (priceMovementPercent == null) {
            return null;
        }
        if (priceMovementIndicator != null && com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceMovementFormatter.WhenMappings.$EnumSwitchMapping$1[priceMovementIndicator.ordinal()] == 1) {
            str = "↓";
        } else {
            str = "↑";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(priceMovementPercent);
        sb.append("%");
        return sb.toString();
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator.values().length];
            try {
                iArr[com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator.DOWN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator.CONSTANT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.cryptocurrency.ui.common.model.prices.CryptoPriceMovementIndicatorUi.values().length];
            try {
                iArr2[com.paypal.oslo.feature.cryptocurrency.ui.common.model.prices.CryptoPriceMovementIndicatorUi.DOWN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
