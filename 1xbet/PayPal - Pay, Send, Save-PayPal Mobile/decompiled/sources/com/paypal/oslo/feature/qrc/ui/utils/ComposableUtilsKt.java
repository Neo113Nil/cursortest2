package com.paypal.oslo.feature.qrc.ui.utils;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\t\u001a\u0019\u0010\u0002\u001a\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\u0006\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\b\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\b\u0010\u0003\u001a-\u0010\r\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0012\u001a\u00020\u0000*\u00020\u000bH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0014\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0014\u0010\u0003"}, d2 = {"", "fullName", "extractInitials", "(Ljava/lang/String;)Ljava/lang/String;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "currencyCode", "formatMoney", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getCurrencySymbol", "senderCurrencyCode", "receiverCurrencyCode", "", "fxRate", "getFxRateConversionText", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)Ljava/lang/String;", "amount", "formatCurrencyAmount", "(DLjava/lang/String;)Ljava/lang/String;", "format", "(D)Ljava/lang/String;", "toFormattedApiAmount"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ComposableUtilsKt {
    public static final java.lang.String extractInitials(java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3 = str;
        if (str3 == null || kotlin.text.StringsKt.isBlank(str3)) {
            return "";
        }
        java.util.List take = kotlin.collections.CollectionsKt.take(new kotlin.text.Regex("\\s+").split(kotlin.text.StringsKt.trim(str3).toString(), 0), 2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = take.iterator();
        while (it.hasNext()) {
            java.lang.Character firstOrNull = kotlin.text.StringsKt.firstOrNull((java.lang.String) it.next());
            if (firstOrNull != null) {
                java.lang.String valueOf = java.lang.String.valueOf(firstOrNull.charValue());
                kotlin.jvm.internal.Intrinsics.checkNotNull(valueOf, "");
                str2 = valueOf.toUpperCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "");
            } else {
                str2 = null;
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
        }
        return kotlin.collections.CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
    }

    public static final java.lang.String formatMoney(java.lang.String str, java.lang.String str2) {
        if (str == null || str2 == null) {
            return "$0.00";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_USD);
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final java.lang.String getCurrencySymbol(java.lang.String str) {
        java.lang.String str2;
        if (str == null) {
            return "";
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            str2 = kotlin.Result.m23436constructorimpl(java.util.Currency.getInstance(str).getSymbol());
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            str2 = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m23439exceptionOrNullimpl(str2) == null) {
            str = str2;
        }
        return str;
    }

    public static final java.lang.String getFxRateConversionText(java.lang.String str, java.lang.String str2, java.lang.Double d) {
        if (d == null) {
            return "";
        }
        java.lang.String currencySymbol = getCurrencySymbol(str);
        java.lang.String currencySymbol2 = getCurrencySymbol(str2);
        java.lang.String format = format(d.doubleValue());
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(currencySymbol);
        sb.append("1 ");
        sb.append(str);
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.EQUALS_SIGN_WITH_SPACES);
        sb.append(currencySymbol2);
        sb.append(format);
        sb.append(" ");
        sb.append(str2);
        return sb.toString();
    }

    public static final java.lang.String formatCurrencyAmount(double d, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String currencySymbol = getCurrencySymbol(str);
        java.lang.String format = format(d);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(currencySymbol);
        sb.append(format);
        return sb.toString();
    }

    public static final java.lang.String format(double d) {
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String format = java.lang.String.format(java.util.Locale.getDefault(), com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.FORMAT_TWO_DECIMALS, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(d)}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }

    public static final java.lang.String toFormattedApiAmount(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String plainString = new java.math.BigDecimal(str).setScale(2, java.math.RoundingMode.HALF_UP).toPlainString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(plainString, "");
        return plainString;
    }
}
