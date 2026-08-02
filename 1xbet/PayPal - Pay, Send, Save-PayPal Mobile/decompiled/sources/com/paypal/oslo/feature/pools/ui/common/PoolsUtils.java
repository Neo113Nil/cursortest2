package com.paypal.oslo.feature.pools.ui.common;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u0007J\u0011\u0010\f\u001a\u00020\u0004*\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u00020\u0004*\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ)\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/pools/ui/common/PoolsUtils;", "", "<init>", "()V", "", "currencyCode", "getCurrencySymbol", "(Ljava/lang/String;)Ljava/lang/String;", "dateString", "formatShortMonthDay", "formatMonthDay", "", "toCurrencyFormat", "(F)Ljava/lang/String;", "toCurrencyFormatOptionalDecimals", "Landroid/content/Context;", "context", "shareableData", "chooserTitle", "", "shareWithIntent", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PoolsUtils {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.pools.ui.common.PoolsUtils INSTANCE = new com.paypal.oslo.feature.pools.ui.common.PoolsUtils();

    private PoolsUtils() {
    }

    public final java.lang.String getCurrencySymbol(java.lang.String currencyCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        try {
            java.lang.String symbol = java.util.Currency.getInstance(currencyCode).getSymbol(java.util.Locale.getDefault());
            kotlin.jvm.internal.Intrinsics.checkNotNull(symbol);
            return symbol;
        } catch (java.lang.IllegalArgumentException | java.lang.NullPointerException unused) {
            return currencyCode;
        }
    }

    public final java.lang.String formatShortMonthDay(java.lang.String dateString) {
        java.lang.String str = dateString;
        if (str == null || str.length() == 0) {
            return "";
        }
        try {
            java.lang.String format = java.time.LocalDate.parse(kotlin.text.StringsKt.take(dateString, 10), java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd")).format(java.time.format.DateTimeFormatter.ofPattern("MMM dd", java.util.Locale.ENGLISH));
            kotlin.jvm.internal.Intrinsics.checkNotNull(format);
            return format;
        } catch (java.time.format.DateTimeParseException unused) {
            return "";
        }
    }

    public final java.lang.String formatMonthDay(java.lang.String dateString) {
        java.lang.String str = dateString;
        if (str == null || str.length() == 0) {
            return "";
        }
        try {
            java.lang.String format = java.time.LocalDate.parse(kotlin.text.StringsKt.take(dateString, 10), java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd")).format(java.time.format.DateTimeFormatter.ofPattern("M/d", java.util.Locale.ENGLISH));
            kotlin.jvm.internal.Intrinsics.checkNotNull(format);
            return format;
        } catch (java.time.format.DateTimeParseException unused) {
            return "";
        }
    }

    public final java.lang.String toCurrencyFormat(float f) {
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String format = java.lang.String.format(java.util.Locale.getDefault(), com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.FORMAT_TWO_DECIMALS, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(f)}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }

    public final java.lang.String toCurrencyFormatOptionalDecimals(float f) {
        float rint = (float) java.lang.Math.rint(f);
        if (java.lang.Math.abs(f - rint) < 0.01f) {
            return java.lang.String.valueOf((int) rint);
        }
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String format = java.lang.String.format(java.util.Locale.getDefault(), com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.FORMAT_TWO_DECIMALS, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(f)}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }

    public static /* synthetic */ void shareWithIntent$default(com.paypal.oslo.feature.pools.ui.common.PoolsUtils poolsUtils, android.content.Context context, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        poolsUtils.shareWithIntent(context, str, str2);
    }

    public final void shareWithIntent(android.content.Context context, java.lang.String shareableData, java.lang.String chooserTitle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shareableData, "");
        try {
            android.content.Intent intent = new android.content.Intent();
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.TEXT", shareableData);
            intent.setType("text/plain");
            android.content.Intent createChooser = android.content.Intent.createChooser(intent, chooserTitle);
            createChooser.addFlags(268435456);
            context.startActivity(createChooser);
        } catch (android.content.ActivityNotFoundException unused) {
        }
    }
}
