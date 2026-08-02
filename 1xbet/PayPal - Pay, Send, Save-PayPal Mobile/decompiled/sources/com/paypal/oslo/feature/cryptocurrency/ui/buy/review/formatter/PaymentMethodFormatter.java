package com.paypal.oslo.feature.cryptocurrency.ui.buy.review.formatter;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/formatter/PaymentMethodFormatter;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/common/Money;", "amount", "", "formatBalanceDetails", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/model/common/Money;)Ljava/lang/String;", "formatAvailableBalance", "displayType", "lastDigits", "formatBankDetails", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "type", "lastNChars", "formatCardDetails", "getHighSpeedVideoFpsRanges", "Landroid/content/Context;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PaymentMethodFormatter {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public PaymentMethodFormatter(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighSpeedVideoFpsRangesFor = context;
    }

    public final java.lang.String formatBalanceDetails(com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money amount) {
        java.lang.String string = amount != null ? this.getHighSpeedVideoFpsRangesFor.getString(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_payment_balance_available, amount.getValue(), amount.getCurrencyCode()) : null;
        return string == null ? "" : string;
    }

    public final java.lang.String formatAvailableBalance(com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money amount) {
        java.lang.String str;
        if (amount != null) {
            java.lang.String value = amount.getValue();
            java.lang.String currencyCode = amount.getCurrencyCode();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(value);
            sb.append(" ");
            sb.append(currencyCode);
            str = sb.toString();
        } else {
            str = null;
        }
        return str == null ? "" : str;
    }

    public final java.lang.String formatBankDetails(java.lang.String displayType, java.lang.String lastDigits) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastDigits, "");
        if (displayType == null) {
            displayType = this.getHighSpeedVideoFpsRangesFor.getString(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_payment_bank_account);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(displayType, "");
        }
        java.lang.String string = this.getHighSpeedVideoFpsRangesFor.getString(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_payment_bank_details, displayType, lastDigits);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final java.lang.String formatCardDetails(java.lang.String type, java.lang.String lastNChars) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastNChars, "");
        android.content.Context context = this.getHighSpeedVideoFpsRangesFor;
        int i = com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_payment_card_details;
        if (type.length() > 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String valueOf = java.lang.String.valueOf(type.charAt(0));
            kotlin.jvm.internal.Intrinsics.checkNotNull(valueOf, "");
            java.lang.String upperCase = valueOf.toUpperCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
            sb.append((java.lang.Object) upperCase);
            java.lang.String substring = type.substring(1);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
            sb.append(substring);
            type = sb.toString();
        }
        java.lang.String string = context.getString(i, type, lastNChars);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }
}
