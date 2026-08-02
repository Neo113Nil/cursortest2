package com.paypal.oslo.feature.moneymovement.api.ui.transferperiod;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/domain/PaymentDelivery;", "Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferSpeed;", "toUiTransferSpeed", "(Lcom/paypal/oslo/feature/moneymovement/api/domain/PaymentDelivery;)Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferSpeed;", "", "iso8601", "", "parseDurationToDays", "(Ljava/lang/String;)Ljava/lang/Integer;", "", "parseDurationToMinutes", "(Ljava/lang/String;)Ljava/lang/Long;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TransferPeriodDataMapperKt {
    public static final com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed toUiTransferSpeed(com.paypal.oslo.feature.moneymovement.api.domain.PaymentDelivery paymentDelivery) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentDelivery, "");
        if (paymentDelivery.getSpeed() == com.paypal.oslo.feature.moneymovement.api.domain.TransferSpeed.INSTANT) {
            return com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed.INSTANT;
        }
        java.lang.String maximumDuration = paymentDelivery.getMaximumDuration();
        java.lang.Long parseDurationToMinutes = maximumDuration != null ? parseDurationToMinutes(maximumDuration) : null;
        java.lang.String minimumDuration = paymentDelivery.getMinimumDuration();
        java.lang.Long parseDurationToMinutes2 = minimumDuration != null ? parseDurationToMinutes(minimumDuration) : null;
        if (parseDurationToMinutes != null) {
            long longValue = parseDurationToMinutes.longValue();
            if (longValue < 60) {
                return com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed.WITHIN_MINUTES;
            }
            if (longValue == 60) {
                return com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed.WITHIN_AN_HOUR;
            }
            if (longValue <= 1440) {
                return com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed.SAME_DAY;
            }
            if (longValue > 4320) {
                if (longValue <= 7200) {
                    return com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed.THREE_TO_FIVE_DAYS;
                }
                return com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed.UNKNOWN;
            }
            if (parseDurationToMinutes2 != null && parseDurationToMinutes2.longValue() > 1440) {
                return com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed.TWO_TO_THREE_DAYS;
            }
            return com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed.ONE_TO_THREE_DAYS;
        }
        int i = com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodDataMapperKt.WhenMappings.$EnumSwitchMapping$0[paymentDelivery.getSpeed().ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed.INSTANT;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed.ONE_TO_THREE_DAYS;
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed.THREE_TO_FIVE_DAYS;
    }

    public static final java.lang.Integer parseDurationToDays(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        try {
            java.time.Period parse = java.time.Period.parse(str);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parse, "");
            int days = parse.getDays() + (parse.getMonths() * 30) + (parse.getYears() * 365);
            if (days > 0) {
                return java.lang.Integer.valueOf(days);
            }
        } catch (java.time.format.DateTimeParseException unused) {
        }
        try {
            int days2 = (int) java.time.Duration.parse(str).toDays();
            if (days2 > 0) {
                return java.lang.Integer.valueOf(days2);
            }
            return null;
        } catch (java.time.format.DateTimeParseException unused2) {
            return null;
        }
    }

    public static final java.lang.Long parseDurationToMinutes(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        try {
            try {
                return java.lang.Long.valueOf(java.time.Duration.parse(str).toMinutes());
            } catch (java.time.format.DateTimeParseException unused) {
                return null;
            }
        } catch (java.time.format.DateTimeParseException unused2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(java.time.Period.parse(str), "");
            return java.lang.Long.valueOf((r4.getDays() + (r4.getMonths() * 30) + (r4.getYears() * 365)) * 1440);
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.moneymovement.api.domain.TransferSpeed.values().length];
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.domain.TransferSpeed.INSTANT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.domain.TransferSpeed.STANDARD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.domain.TransferSpeed.DEFERRED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
