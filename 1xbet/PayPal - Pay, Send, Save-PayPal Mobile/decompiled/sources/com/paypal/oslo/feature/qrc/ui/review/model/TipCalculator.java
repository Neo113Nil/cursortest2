package com.paypal.oslo.feature.qrc.ui.review.model;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/model/TipCalculator;", "", "<init>", "()V", "", "rawValue", "", "subtotal", "currencyCode", "", "isPercentage", "Lkotlin/Pair;", "formatPresetTipDisplay", "(DLjava/lang/String;Ljava/lang/String;Z)Lkotlin/Pair;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "maxLimit", "isWithinLimit", "(Ljava/lang/String;D)Z", "percentageInput", "Lcom/paypal/oslo/feature/qrc/ui/review/model/TipSelection$Custom;", "createCustomPercentageTip", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/qrc/ui/review/model/TipSelection$Custom;", "enteredValue", "calculateApiTipAmount", "(DLjava/lang/String;ZD)Ljava/lang/String;", "amountInput", "createCustomAmountTip", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/qrc/ui/review/model/TipSelection$Custom;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TipCalculator {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.qrc.ui.review.model.TipCalculator INSTANCE = new com.paypal.oslo.feature.qrc.ui.review.model.TipCalculator();

    private TipCalculator() {
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> formatPresetTipDisplay(double rawValue, java.lang.String subtotal, java.lang.String currencyCode, boolean isPercentage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subtotal, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        if (isPercentage) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append((int) rawValue);
            sb.append("%");
            java.lang.String obj = sb.toString();
            java.lang.Double doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull(subtotal);
            return kotlin.TuplesKt.to(obj, com.paypal.oslo.feature.qrc.ui.utils.ComposableUtilsKt.formatCurrencyAmount((rawValue / 100.0d) * (doubleOrNull != null ? doubleOrNull.doubleValue() : 0.0d), currencyCode));
        }
        return kotlin.TuplesKt.to(com.paypal.oslo.feature.qrc.ui.utils.ComposableUtilsKt.formatCurrencyAmount(rawValue, currencyCode), null);
    }

    public final boolean isWithinLimit(java.lang.String value, double maxLimit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        java.lang.Double doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull(value);
        if (doubleOrNull == null) {
            return false;
        }
        double doubleValue = doubleOrNull.doubleValue();
        return doubleValue > 0.0d && doubleValue <= maxLimit;
    }

    public final com.paypal.oslo.feature.qrc.ui.review.model.TipSelection.Custom createCustomPercentageTip(java.lang.String percentageInput, java.lang.String subtotal, java.lang.String currencyCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(percentageInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subtotal, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        java.lang.Double doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull(percentageInput);
        if (doubleOrNull != null) {
            if (doubleOrNull.doubleValue() <= 0.0d) {
                doubleOrNull = null;
            }
            if (doubleOrNull != null) {
                double doubleValue = doubleOrNull.doubleValue();
                java.lang.Double doubleOrNull2 = kotlin.text.StringsKt.toDoubleOrNull(subtotal);
                java.lang.String formatCurrencyAmount = com.paypal.oslo.feature.qrc.ui.utils.ComposableUtilsKt.formatCurrencyAmount((doubleValue / 100.0d) * (doubleOrNull2 != null ? doubleOrNull2.doubleValue() : 0.0d), currencyCode);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(percentageInput);
                sb.append("%");
                return new com.paypal.oslo.feature.qrc.ui.review.model.TipSelection.Custom(percentageInput, formatCurrencyAmount, sb.toString());
            }
        }
        return null;
    }

    public final java.lang.String calculateApiTipAmount(double rawValue, java.lang.String enteredValue, boolean isPercentage, double subtotal) {
        java.lang.Double doubleOrNull;
        if (!isPercentage) {
            if (enteredValue == null) {
                enteredValue = java.lang.String.valueOf(rawValue);
            }
            return com.paypal.oslo.feature.qrc.ui.utils.ComposableUtilsKt.toFormattedApiAmount(enteredValue);
        }
        if (enteredValue != null && (doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull(enteredValue)) != null) {
            rawValue = doubleOrNull.doubleValue();
        }
        java.lang.String plainString = new java.math.BigDecimal(java.lang.String.valueOf((rawValue / 100.0d) * subtotal)).toPlainString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(plainString, "");
        return com.paypal.oslo.feature.qrc.ui.utils.ComposableUtilsKt.toFormattedApiAmount(plainString);
    }

    public final com.paypal.oslo.feature.qrc.ui.review.model.TipSelection.Custom createCustomAmountTip(java.lang.String amountInput, java.lang.String currencyCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        java.lang.Double doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull(amountInput);
        if (doubleOrNull != null) {
            if (doubleOrNull.doubleValue() <= 0.0d) {
                doubleOrNull = null;
            }
            if (doubleOrNull != null) {
                return new com.paypal.oslo.feature.qrc.ui.review.model.TipSelection.Custom(amountInput, com.paypal.oslo.feature.qrc.ui.utils.ComposableUtilsKt.formatCurrencyAmount(doubleOrNull.doubleValue(), currencyCode), null);
            }
        }
        return null;
    }
}
