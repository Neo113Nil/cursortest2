package com.paypal.oslo.feature.savings.common;

@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a!\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0002\u0010\r\u001a\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000\u001a\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0001H\u0000\u001a\u0012\u0010\u0015\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0016\u001a\u00020\nH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"TeenRangeStart", "", "TeenRangeEnd", "OrdinalFirst", "OrdinalSecond", "OrdinalThird", "OrdinalDivisor", "getFrequencyDisplayText", "", "frequencyState", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencySelectionState;", "isTextForReview", "", "(Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencySelectionState;ZLandroidx/compose/runtime/Composer;II)Ljava/lang/String;", "getWeekdayDisplayName", "dayOfWeek", "Ljava/time/DayOfWeek;", "formatDayWithOrdinalSuffix", "day", "getOrdinalSuffix", "DaysInWeek", "calculateStartDate", "state", "savings_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FrequencyDisplayUtilsKt {
    public static final java.lang.String getFrequencyDisplayText(com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencySelectionState, boolean z, androidx.compose.runtime.Composer composer, int i, int i2) {
        java.lang.String stringResource;
        composer.startReplaceGroup(-1294835707);
        if ((i2 & 2) != 0) {
            z = true;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1294835707, i, -1, "com.paypal.oslo.feature.savings.common.getFrequencyDisplayText (FrequencyDisplayUtils.kt:49)");
        }
        if (z) {
            composer.startReplaceGroup(-1349094676);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_frequency_one_time_today, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1349008558);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_frequency_one_time, composer, 0);
            composer.endReplaceGroup();
        }
        if (frequencySelectionState == null) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return stringResource;
        }
        int i3 = com.paypal.oslo.feature.savings.common.FrequencyDisplayUtilsKt.WhenMappings.$EnumSwitchMapping$0[frequencySelectionState.getSelectedFrequency().ordinal()];
        if (i3 == 1) {
            composer.startReplaceGroup(1203416944);
            composer.endReplaceGroup();
        } else if (i3 == 2) {
            composer.startReplaceGroup(-1348731263);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_frequency_weekly_display, new java.lang.Object[]{getWeekdayDisplayName(frequencySelectionState.getSelectedDayOfWeek())}, composer, 0);
            composer.endReplaceGroup();
        } else if (i3 == 3) {
            composer.startReplaceGroup(-1348504870);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_frequency_every_2_weeks_display, new java.lang.Object[]{getWeekdayDisplayName(frequencySelectionState.getSelectedDayOfWeek())}, composer, 0);
            composer.endReplaceGroup();
        } else {
            if (i3 != 4) {
                composer.startReplaceGroup(1203415336);
                composer.endReplaceGroup();
                throw new kotlin.NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(-1348272091);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_frequency_every_month_display, new java.lang.Object[]{formatDayWithOrdinalSuffix(frequencySelectionState.getSelectedDate().getDayOfMonth())}, composer, 0);
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return stringResource;
    }

    public static final java.lang.String getWeekdayDisplayName(java.time.DayOfWeek dayOfWeek) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayOfWeek, "");
        return com.paypal.oslo.feature.savings.util.DateTimeHandlerImpl.Companion.getWeekdayName$default(com.paypal.oslo.feature.savings.util.DateTimeHandlerImpl.INSTANCE, dayOfWeek, (java.util.Locale) null, 2, (java.lang.Object) null);
    }

    public static final java.lang.String formatDayWithOrdinalSuffix(int i) {
        java.lang.String ordinalSuffix = getOrdinalSuffix(i);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(i);
        sb.append(ordinalSuffix);
        return sb.toString();
    }

    public static final java.lang.String getOrdinalSuffix(int i) {
        if (11 <= i && i < 14) {
            return "th";
        }
        int i2 = i % 10;
        if (i2 == 1) {
            return "st";
        }
        if (i2 == 2) {
            return "nd";
        }
        if (i2 != 3) {
            return "th";
        }
        return "rd";
    }

    public static final java.lang.String calculateStartDate(com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencySelectionState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frequencySelectionState, "");
        int i = com.paypal.oslo.feature.savings.common.FrequencyDisplayUtilsKt.WhenMappings.$EnumSwitchMapping$0[frequencySelectionState.getSelectedFrequency().ordinal()];
        if (i == 1) {
            return null;
        }
        if (i != 2 && i != 3) {
            if (i != 4) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return com.paypal.oslo.feature.savings.util.DateTimeHandlerImpl.INSTANCE.formatLocalDateToIso(frequencySelectionState.getSelectedDate());
        }
        java.time.LocalDate now = java.time.LocalDate.now();
        java.time.DayOfWeek selectedDayOfWeek = frequencySelectionState.getSelectedDayOfWeek();
        java.time.LocalDate localDate = now;
        while (localDate.getDayOfWeek() != selectedDayOfWeek) {
            localDate = localDate.plusDays(1L);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(localDate, now)) {
            localDate = localDate.plusDays(7L);
        }
        com.paypal.oslo.feature.savings.util.DateTimeHandlerImpl.Companion companion = com.paypal.oslo.feature.savings.util.DateTimeHandlerImpl.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(localDate);
        return companion.formatLocalDateToIso(localDate);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType.values().length];
            try {
                iArr[com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType.ONE_TIME.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType.WEEKLY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType.EVERY_2_WEEKS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType.EVERY_MONTH.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
