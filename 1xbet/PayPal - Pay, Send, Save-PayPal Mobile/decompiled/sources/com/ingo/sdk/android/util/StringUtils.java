package com.ingo.sdk.android.util;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\b"}, d2 = {"Lcom/ingo/sdk/android/util/StringUtils;", "", "<init>", "()V", "", "string", "", "isStringEmpty", "(Ljava/lang/String;)Z", "Landroid/content/Context;", "context", "", "pennies", "getDollarAmountDisplayStringFromPennyAmount", "(Landroid/content/Context;J)Ljava/lang/String;", "getDollarAmountStringFromPennyAmount", "(J)Ljava/lang/String;", "expiration", "getCardExpirationDisplay", "(Ljava/lang/String;)Ljava/lang/String;", "inputStr", "isNumber"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class StringUtils {
    public static final int $stable = 0;
    public static final com.ingo.sdk.android.util.StringUtils INSTANCE = new com.ingo.sdk.android.util.StringUtils();

    private StringUtils() {
    }

    public final boolean isStringEmpty(java.lang.String string) {
        return string == null || string.length() == 0;
    }

    public final java.lang.String getDollarAmountDisplayStringFromPennyAmount(android.content.Context context, long pennies) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.String dollarAmountStringFromPennyAmount = getDollarAmountStringFromPennyAmount(pennies);
        if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) dollarAmountStringFromPennyAmount, (java.lang.CharSequence) "-", false, 2, (java.lang.Object) null)) {
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String string = context.getString(com.ingo.sdk.android.R.string.dollar_amount_format);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
            java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{dollarAmountStringFromPennyAmount}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
            return format;
        }
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject2 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String string2 = context.getString(com.ingo.sdk.android.R.string.negative_dollar_amount_format);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "");
        java.lang.String format2 = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[]{kotlin.text.StringsKt.replace$default(dollarAmountStringFromPennyAmount, "-", "", false, 4, (java.lang.Object) null)}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format2, "");
        return format2;
    }

    public final java.lang.String getDollarAmountStringFromPennyAmount(long pennies) {
        boolean z;
        if (pennies < 0) {
            pennies *= -1;
            z = true;
        } else {
            z = false;
        }
        if (pennies < 100) {
            if (pennies < 10) {
                java.lang.String concat = androidx.camera.core.processing.util.GLUtils.VERSION_UNKNOWN.concat(java.lang.String.valueOf(pennies));
                return z ? "-".concat(java.lang.String.valueOf(concat)) : concat;
            }
            java.lang.String concat2 = "0.".concat(java.lang.String.valueOf(pennies));
            return z ? "-".concat(java.lang.String.valueOf(concat2)) : concat2;
        }
        java.lang.String valueOf = java.lang.String.valueOf(pennies);
        if (valueOf.length() >= 2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(valueOf);
            sb.insert(valueOf.length() - 2, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
            valueOf = sb.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "");
        }
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String format = java.lang.String.format(java.util.Locale.US, com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.FORMAT_TWO_DECIMALS, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(valueOf)}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        if (format.length() >= 7) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(format);
            for (int length = format.length() - 6; length >= 0; length -= 3) {
                sb2.insert(length, kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
            }
            format = sb2.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        }
        return z ? "-".concat(java.lang.String.valueOf(format)) : format;
    }

    public final java.lang.String getCardExpirationDisplay(java.lang.String expiration) {
        if (expiration == null || expiration.length() < 4) {
            return null;
        }
        java.lang.String substring = expiration.substring(0, 2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        java.lang.String substring2 = expiration.substring(2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(substring);
        sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
        sb.append(substring2);
        return sb.toString();
    }

    public final boolean isNumber(java.lang.String inputStr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputStr, "");
        int length = inputStr.length();
        if (length == 0) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (!java.lang.Character.isDigit(inputStr.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
