package com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/TempAmount;", "Ljava/util/Locale;", "locale", "", "descriptionForLocale", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/TempAmount;Ljava/util/Locale;)Ljava/lang/String;", "filterNonZero", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/TempAmount;)Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/TempAmount;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TempAmountUiStateKt {
    public static /* synthetic */ java.lang.String descriptionForLocale$default(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount tempAmount, java.util.Locale locale, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            locale = java.util.Locale.getDefault();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        }
        return descriptionForLocale(tempAmount, locale);
    }

    public static final java.lang.String descriptionForLocale(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount tempAmount, java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tempAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
        try {
            java.text.NumberFormat currencyInstance = java.text.NumberFormat.getCurrencyInstance(locale);
            currencyInstance.setCurrency(java.util.Currency.getInstance(tempAmount.getCurrencyCode()));
            java.lang.String format = currencyInstance.format(tempAmount.getValue());
            kotlin.jvm.internal.Intrinsics.checkNotNull(format);
            return format;
        } catch (java.lang.IllegalArgumentException unused) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.businesspayandgetpaid.LoggerKt.log;
            java.lang.String currencyCode = tempAmount.getCurrencyCode();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid currency code: ");
            sb.append(currencyCode);
            sb.append(", using fallback format");
            com.paypal.android.logger.Logger.e$default(logger, sb.toString(), null, null, null, 14, null);
            java.lang.String currencyCode2 = tempAmount.getCurrencyCode();
            java.math.BigDecimal value = tempAmount.getValue();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(currencyCode2);
            sb2.append(" ");
            sb2.append(value);
            return sb2.toString();
        }
    }

    public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount filterNonZero(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount tempAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tempAmount, "");
        if (tempAmount.getValue().compareTo(java.math.BigDecimal.ZERO) != 0) {
            return tempAmount;
        }
        return null;
    }
}
