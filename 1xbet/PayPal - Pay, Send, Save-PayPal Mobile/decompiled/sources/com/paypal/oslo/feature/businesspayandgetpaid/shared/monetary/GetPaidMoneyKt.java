package com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0006\u001a\u001b\u0010\u0007\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u001d\u0010\b\u001a\u0004\u0018\u00010\u0003*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\b\u0010\u0006"}, d2 = {"", "", "currencyCode", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;", "asGetPaidMoney", "(JLjava/lang/String;)Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;", "parseAsGetPaidMoneyOrThrow", "parseAsGetPaidMoneyOrNull"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GetPaidMoneyKt {
    public static final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney asGetPaidMoney(long j, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney(j, str);
    }

    public static final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney asGetPaidMoney(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney(java.lang.Long.parseLong(str), str2);
    }

    public static final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney parseAsGetPaidMoneyOrThrow(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        java.math.BigDecimal bigDecimalOrNull = kotlin.text.StringsKt.toBigDecimalOrNull(str);
        if (bigDecimalOrNull == null) {
            throw new java.lang.NumberFormatException("Invalid decimal format for currency: ".concat(java.lang.String.valueOf(str)));
        }
        long j = 100;
        try {
            int defaultFractionDigits = java.util.Currency.getInstance(str2).getDefaultFractionDigits();
            if (defaultFractionDigits == 0) {
                j = 1;
            } else if (defaultFractionDigits == 1) {
                j = 10;
            } else if (defaultFractionDigits != 2) {
                if (defaultFractionDigits == 3) {
                    j = 1000;
                } else if (defaultFractionDigits == 4) {
                    j = 10000;
                }
            }
        } catch (java.lang.IllegalArgumentException unused) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.businesspayandgetpaid.LoggerKt.log, "Invalid currency code when parsing GetPaidMoney", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("currencyCode", str2)), null, 4, null);
        }
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney(bigDecimalOrNull.multiply(new java.math.BigDecimal(j)).longValue(), str2);
    }

    public static final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney parseAsGetPaidMoneyOrNull(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        try {
            return parseAsGetPaidMoneyOrThrow(str, str2);
        } catch (java.lang.NumberFormatException e) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.businesspayandgetpaid.LoggerKt.log, "Failed to parse string as GetPaidMoney", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("input", str), kotlin.TuplesKt.to("currencyCode", str2), kotlin.TuplesKt.to("errorMessage", e.getMessage())), null, 4, null);
            return null;
        }
    }

    public static final /* synthetic */ java.lang.String access$addCharAtIndex(java.lang.String str, char c, int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
        sb.insert(i, c);
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }
}
