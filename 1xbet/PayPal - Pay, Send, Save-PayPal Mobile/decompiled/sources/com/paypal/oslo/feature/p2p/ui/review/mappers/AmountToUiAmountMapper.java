package com.paypal.oslo.feature.p2p.ui.review.mappers;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/mappers/AmountToUiAmountMapper;", "Lcom/paypal/oslo/feature/p2p/domain/common/mapper/Mapper;", "Lcom/paypal/oslo/feature/p2p/domain/model/Amount;", "Lcom/paypal/oslo/feature/p2p/ui/review/state/UiAmount;", "Lcom/paypal/oslo/feature/p2p/ui/common/formatter/AmountFormatter;", "amountFormatter", "Lcom/paypal/oslo/feature/p2p/ui/common/util/CurrencyFlagHelper;", "currencyFlagHelper", "<init>", "(Lcom/paypal/oslo/feature/p2p/ui/common/formatter/AmountFormatter;Lcom/paypal/oslo/feature/p2p/ui/common/util/CurrencyFlagHelper;)V", "input", "map", "(Lcom/paypal/oslo/feature/p2p/domain/model/Amount;)Lcom/paypal/oslo/feature/p2p/ui/review/state/UiAmount;", "", "amount", "Ljava/util/Locale;", "locale", "Ljava/math/BigDecimal;", "parseFormattedAmount", "(Ljava/lang/String;Ljava/util/Locale;)Ljava/math/BigDecimal;", "currencyCode", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/Currency;", "mapCurrency", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/Currency;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/p2p/ui/common/formatter/AmountFormatter;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/p2p/ui/common/util/CurrencyFlagHelper;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AmountToUiAmountMapper implements com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper<com.paypal.oslo.feature.p2p.domain.model.Amount, com.paypal.oslo.feature.p2p.ui.review.state.UiAmount> {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.p2p.ui.common.formatter.AmountFormatter getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.ui.common.util.CurrencyFlagHelper Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public AmountToUiAmountMapper(com.paypal.oslo.feature.p2p.ui.common.formatter.AmountFormatter amountFormatter, com.paypal.oslo.feature.p2p.ui.common.util.CurrencyFlagHelper currencyFlagHelper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountFormatter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyFlagHelper, "");
        this.getHighSpeedVideoFpsRanges = amountFormatter;
        this.Camera2StreamConfigurationMap = currencyFlagHelper;
    }

    @Override // com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper
    public final com.paypal.oslo.feature.p2p.ui.review.state.UiAmount map(com.paypal.oslo.feature.p2p.domain.model.Amount input) {
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount fiat;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        java.math.BigDecimal parseFormattedAmount$default = parseFormattedAmount$default(this, input.getAmount(), null, 2, null);
        java.lang.String amount = input.getAmount();
        java.lang.String currency = input.getCurrency();
        java.lang.String currencyCode = input.getCurrencyCode();
        java.lang.String flagEmoji = this.Camera2StreamConfigurationMap.getFlagEmoji(input.getCurrencyCode());
        java.lang.String formatAmountWithCurrency$default = com.paypal.oslo.feature.p2p.ui.common.formatter.AmountFormatter.formatAmountWithCurrency$default(this.getHighSpeedVideoFpsRanges, input.getAmount(), input.getCurrency(), null, false, 4, null);
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"BTC", "ETH"});
        java.lang.String currency2 = input.getCurrency();
        if (currency2 == null) {
            currency2 = "";
        }
        java.lang.String upperCase = currency2.toUpperCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
        if (listOf.contains(upperCase)) {
            com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.Companion companion = com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE;
            java.lang.String currency3 = input.getCurrency();
            java.lang.String str = currency3 == null ? "BTC" : currency3;
            java.lang.String plainString = parseFormattedAmount$default.toPlainString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(plainString, "");
            fiat = companion.crypto(str, plainString, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
        } else {
            com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.Companion companion2 = com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE;
            java.lang.String currency4 = input.getCurrency();
            if (currency4 == null) {
                currency4 = "USD";
            }
            java.lang.String plainString2 = parseFormattedAmount$default.toPlainString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(plainString2, "");
            fiat = companion2.fiat(currency4, plainString2);
        }
        return new com.paypal.oslo.feature.p2p.ui.review.state.UiAmount(amount, currency, currencyCode, flagEmoji, formatAmountWithCurrency$default, fiat);
    }

    public static /* synthetic */ java.math.BigDecimal parseFormattedAmount$default(com.paypal.oslo.feature.p2p.ui.review.mappers.AmountToUiAmountMapper amountToUiAmountMapper, java.lang.String str, java.util.Locale locale, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            locale = java.util.Locale.getDefault();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        }
        return amountToUiAmountMapper.parseFormattedAmount(str, locale);
    }

    public final java.math.BigDecimal parseFormattedAmount(java.lang.String amount, java.util.Locale locale) {
        java.lang.String replace$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
        if (amount.length() == 0) {
            java.math.BigDecimal bigDecimal = java.math.BigDecimal.ZERO;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigDecimal, "");
            return bigDecimal;
        }
        java.text.NumberFormat currencyInstance = java.text.NumberFormat.getCurrencyInstance(locale);
        java.text.ParsePosition parsePosition = new java.text.ParsePosition(0);
        java.lang.Number parse = currencyInstance.parse(amount, parsePosition);
        if (parsePosition.getIndex() == amount.length() && parse != null) {
            java.math.BigDecimal bigDecimalOrNull = kotlin.text.StringsKt.toBigDecimalOrNull(parse.toString());
            if (bigDecimalOrNull != null) {
                return bigDecimalOrNull;
            }
            java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigDecimal2, "");
            return bigDecimal2;
        }
        if (java.text.DecimalFormatSymbols.getInstance(locale).getDecimalSeparator() == ',') {
            replace$default = kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(amount, ".", "", false, 4, (java.lang.Object) null), ",", ".", false, 4, (java.lang.Object) null);
        } else {
            replace$default = kotlin.text.StringsKt.replace$default(amount, ",", "", false, 4, (java.lang.Object) null);
        }
        java.math.BigDecimal bigDecimalOrNull2 = kotlin.text.StringsKt.toBigDecimalOrNull(replace$default);
        if (bigDecimalOrNull2 != null) {
            return bigDecimalOrNull2;
        }
        java.math.BigDecimal bigDecimal3 = java.math.BigDecimal.ZERO;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigDecimal3, "");
        return bigDecimal3;
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency mapCurrency(java.lang.String currencyCode) {
        java.lang.String str;
        if (currencyCode != null) {
            str = currencyCode.toUpperCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
        } else {
            str = null;
        }
        if (str != null) {
            switch (str.hashCode()) {
                case 66097:
                    if (str.equals("BTC")) {
                        return com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency.INSTANCE.getBTC();
                    }
                    break;
                case 68985:
                    if (str.equals("ETH")) {
                        return com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency.INSTANCE.getETH();
                    }
                    break;
                case 69026:
                    if (str.equals(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.EUR)) {
                        return com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency.INSTANCE.getEUR();
                    }
                    break;
                case 70357:
                    if (str.equals("GBP")) {
                        return com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency.INSTANCE.getGBP();
                    }
                    break;
                case 84326:
                    if (str.equals("USD")) {
                        return com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency.INSTANCE.getUSD();
                    }
                    break;
            }
        }
        return com.paypal.oslo.feature.moneymovement.api.shared.domain.Currency.INSTANCE.getUSD();
    }
}
