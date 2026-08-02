package com.paypal.oslo.feature.taptopay.ui.core.util;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\t\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/payment/Transaction;", "", "formatDisplayAmount", "(Lcom/paypal/oslo/feature/taptopay/domain/model/payment/Transaction;)Ljava/lang/String;", "", "amount", "", "decimals", "currencyCode", "amountToCurrency", "(DILjava/lang/String;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CurrencyUtilsKt {
    public static final java.lang.String formatDisplayAmount(com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction transaction) {
        java.lang.String substringAfter;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transaction, "");
        java.lang.String displayAmount = transaction.getDisplayAmount();
        return amountToCurrency(transaction.getAmount(), (displayAmount == null || (substringAfter = kotlin.text.StringsKt.substringAfter(displayAmount, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, "")) == null) ? 0 : substringAfter.length(), transaction.getCurrencyCode());
    }

    public static final java.lang.String amountToCurrency(double d, int i, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.text.NumberFormat currencyInstance = java.text.NumberFormat.getCurrencyInstance(java.util.Locale.getDefault());
        currencyInstance.setMaximumFractionDigits(i);
        currencyInstance.setCurrency(java.util.Currency.getInstance(str));
        java.lang.String format = currencyInstance.format(d);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }
}
