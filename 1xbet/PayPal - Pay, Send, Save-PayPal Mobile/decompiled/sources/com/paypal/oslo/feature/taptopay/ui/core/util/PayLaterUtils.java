package com.paypal.oslo.feature.taptopay.ui.core.util;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0016B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/core/util/PayLaterUtils;", "", "<init>", "()V", "", "createTime", "expirationDuration", "", "currentTimeMillis", "Lcom/paypal/oslo/feature/taptopay/ui/core/util/PayLaterUtils$ValidityResult;", "getValidityResult", "(Ljava/lang/String;Ljava/lang/String;J)Lcom/paypal/oslo/feature/taptopay/ui/core/util/PayLaterUtils$ValidityResult;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "currencyCode", "formatLoanAmount", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Ljava/time/Instant;", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;)Ljava/time/Instant;", "Ljava/time/Duration;", "getHighSpeedVideoSizes", "(Ljava/lang/String;)Ljava/time/Duration;", "ValidityResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PayLaterUtils {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterUtils INSTANCE = new com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterUtils();

    private PayLaterUtils() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/core/util/PayLaterUtils$ValidityResult;", "", "Hours", "Minutes", "Lcom/paypal/oslo/feature/taptopay/ui/core/util/PayLaterUtils$ValidityResult$Hours;", "Lcom/paypal/oslo/feature/taptopay/ui/core/util/PayLaterUtils$ValidityResult$Minutes;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface ValidityResult {

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/core/util/PayLaterUtils$ValidityResult$Hours;", "Lcom/paypal/oslo/feature/taptopay/ui/core/util/PayLaterUtils$ValidityResult;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/taptopay/ui/core/util/PayLaterUtils$ValidityResult$Hours;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Hours implements com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterUtils.ValidityResult {
            public static final int $stable = 0;
            private final int value;

            public Hours(int i) {
                this.value = i;
            }

            public final int getValue() {
                return this.value;
            }

            public final java.lang.String toString() {
                int i = this.value;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Hours(value=");
                sb.append(i);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return java.lang.Integer.hashCode(this.value);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterUtils.ValidityResult.Hours) && this.value == ((com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterUtils.ValidityResult.Hours) other).value;
            }

            public final com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterUtils.ValidityResult.Hours copy(int value) {
                return new com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterUtils.ValidityResult.Hours(value);
            }

            /* renamed from: component1, reason: from getter */
            public final int getValue() {
                return this.value;
            }

            public static /* synthetic */ com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterUtils.ValidityResult.Hours copy$default(com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterUtils.ValidityResult.Hours hours, int i, int i2, java.lang.Object obj) {
                if ((i2 & 1) != 0) {
                    i = hours.value;
                }
                return hours.copy(i);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/core/util/PayLaterUtils$ValidityResult$Minutes;", "Lcom/paypal/oslo/feature/taptopay/ui/core/util/PayLaterUtils$ValidityResult;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/taptopay/ui/core/util/PayLaterUtils$ValidityResult$Minutes;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Minutes implements com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterUtils.ValidityResult {
            public static final int $stable = 0;
            private final int value;

            public Minutes(int i) {
                this.value = i;
            }

            public final int getValue() {
                return this.value;
            }

            public final java.lang.String toString() {
                int i = this.value;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Minutes(value=");
                sb.append(i);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return java.lang.Integer.hashCode(this.value);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterUtils.ValidityResult.Minutes) && this.value == ((com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterUtils.ValidityResult.Minutes) other).value;
            }

            public final com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterUtils.ValidityResult.Minutes copy(int value) {
                return new com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterUtils.ValidityResult.Minutes(value);
            }

            /* renamed from: component1, reason: from getter */
            public final int getValue() {
                return this.value;
            }

            public static /* synthetic */ com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterUtils.ValidityResult.Minutes copy$default(com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterUtils.ValidityResult.Minutes minutes, int i, int i2, java.lang.Object obj) {
                if ((i2 & 1) != 0) {
                    i = minutes.value;
                }
                return minutes.copy(i);
            }
        }
    }

    public static /* synthetic */ com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterUtils.ValidityResult getValidityResult$default(com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterUtils payLaterUtils, java.lang.String str, java.lang.String str2, long j, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            j = java.lang.System.currentTimeMillis();
        }
        return payLaterUtils.getValidityResult(str, str2, j);
    }

    public final com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterUtils.ValidityResult getValidityResult(java.lang.String createTime, java.lang.String expirationDuration, long currentTimeMillis) {
        java.time.Instant highSpeedVideoFpsRangesFor;
        java.time.Duration highSpeedVideoSizes;
        if (createTime == null || expirationDuration == null || (highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(createTime)) == null || (highSpeedVideoSizes = getHighSpeedVideoSizes(expirationDuration)) == null) {
            return null;
        }
        long epochMilli = (highSpeedVideoFpsRangesFor.toEpochMilli() + highSpeedVideoSizes.toMillis()) - currentTimeMillis;
        if (epochMilli <= 0) {
            return null;
        }
        int i = (int) (epochMilli / 60000);
        if (i < 60) {
            return new com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterUtils.ValidityResult.Minutes(i);
        }
        return new com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterUtils.ValidityResult.Hours(i / 60);
    }

    public final java.lang.String formatLoanAmount(java.lang.String value, java.lang.String currencyCode) {
        java.util.Currency currency = null;
        if (value != null && currencyCode != null) {
            try {
                java.math.BigDecimal bigDecimal = new java.math.BigDecimal(value);
                try {
                    java.util.Locale locale = java.util.Locale.US;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
                    java.lang.String upperCase = currencyCode.toUpperCase(locale);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
                    currency = java.util.Currency.getInstance(upperCase);
                } catch (java.lang.IllegalArgumentException unused) {
                }
                boolean z = com.paypal.oslo.core.money.Tax$$ExternalSyntheticBackportWithForwarding0.m(bigDecimal).scale() > 0;
                if (currency == null) {
                    java.text.NumberFormat numberInstance = java.text.NumberFormat.getNumberInstance(java.util.Locale.US);
                    numberInstance.setMinimumFractionDigits(z ? 2 : 0);
                    numberInstance.setMaximumFractionDigits(z ? 2 : 0);
                    java.lang.String format = numberInstance.format(bigDecimal);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(currencyCode);
                    sb.append(format);
                    return sb.toString();
                }
                java.text.NumberFormat currencyInstance = java.text.NumberFormat.getCurrencyInstance(java.util.Locale.US);
                currencyInstance.setCurrency(currency);
                currencyInstance.setMinimumFractionDigits(z ? 2 : 0);
                currencyInstance.setMaximumFractionDigits(z ? 2 : 0);
                return currencyInstance.format(bigDecimal);
            } catch (java.lang.NumberFormatException unused2) {
            }
        }
        return null;
    }

    private static java.time.Instant getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        try {
            return java.time.Instant.parse(str);
        } catch (java.time.format.DateTimeParseException unused) {
            return null;
        }
    }

    private static java.time.Duration getHighSpeedVideoSizes(java.lang.String str) {
        try {
            return java.time.Duration.parse(str);
        } catch (java.time.format.DateTimeParseException unused) {
            return null;
        }
    }
}
