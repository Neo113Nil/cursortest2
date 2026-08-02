package com.paypal.oslo.core.money;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\b\u001a\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0006\u001a\u0011\u0010\b\u001a\u00020\u0007*\u00020\u0002¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\u000b\u001a\u00020\n8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0014\u0010\r\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0014\u0010\u000f\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e\"\u0014\u0010\u0010\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000e\"\u0014\u0010\u0012\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000e"}, d2 = {"", "currencyCode", "Lcom/paypal/oslo/core/money/Money;", "parseAsMoneyOrNull", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/core/money/Money;", "", "(JLjava/lang/String;)Lcom/paypal/oslo/core/money/Money;", "Ljava/math/BigDecimal;", "asBigDecimal", "(Lcom/paypal/oslo/core/money/Money;)Ljava/math/BigDecimal;", "", "DECIMALSEPARATOR", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "SCALEZERO", "J", "SCALEONE", "SCALETWO", "SCALETHREE", "SCALEFOUR"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class MoneyKt {
    public static final char DECIMALSEPARATOR = '.';
    public static final long SCALEFOUR = 10000;
    public static final long SCALEONE = 10;
    public static final long SCALETHREE = 1000;
    public static final long SCALETWO = 100;
    public static final long SCALEZERO = 1;

    public static final com.paypal.oslo.core.money.Money parseAsMoneyOrNull(long j, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        try {
            return new com.paypal.oslo.core.money.Money(j, str);
        } catch (java.lang.IllegalArgumentException e) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.money.LoggerKt.log, "Failed to parse Long as Money", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("input", java.lang.Long.valueOf(j)), kotlin.TuplesKt.to("currencyCode", str), kotlin.TuplesKt.to("errorMessage", e.getMessage())), null, 4, null);
            return null;
        }
    }

    public static final java.math.BigDecimal asBigDecimal(com.paypal.oslo.core.money.Money money) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
        int defaultFractionDigits = java.util.Currency.getInstance(money.getCurrencyCode()).getDefaultFractionDigits();
        java.math.BigInteger valueOf = java.math.BigInteger.valueOf(money.getValue());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "");
        return new java.math.BigDecimal(valueOf, defaultFractionDigits);
    }

    public static final com.paypal.oslo.core.money.Money parseAsMoneyOrNull(java.lang.String str, java.lang.String str2) {
        long j;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        try {
            java.math.BigDecimal bigDecimalOrNull = kotlin.text.StringsKt.toBigDecimalOrNull(str);
            if (bigDecimalOrNull == null) {
                throw new java.lang.NumberFormatException("Invalid decimal format for currency: ".concat(java.lang.String.valueOf(str)));
            }
            int defaultFractionDigits = java.util.Currency.getInstance(str2).getDefaultFractionDigits();
            if (defaultFractionDigits == 0) {
                j = 1;
            } else if (defaultFractionDigits == 1) {
                j = 10;
            } else if (defaultFractionDigits == 2) {
                j = 100;
            } else if (defaultFractionDigits == 3) {
                j = 1000;
            } else {
                if (defaultFractionDigits != 4) {
                    throw new java.lang.IllegalArgumentException("Unsupported number of fraction digits for currencyCode ".concat(java.lang.String.valueOf(str2)));
                }
                j = 10000;
            }
            return new com.paypal.oslo.core.money.Money(bigDecimalOrNull.multiply(new java.math.BigDecimal(j)).longValue(), str2);
        } catch (java.lang.IllegalArgumentException e) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.money.LoggerKt.log, "Failed to parse String as Money", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("input", str), kotlin.TuplesKt.to("currencyCode", str2), kotlin.TuplesKt.to("errorMessage", e.getMessage())), null, 4, null);
            return null;
        }
    }
}
