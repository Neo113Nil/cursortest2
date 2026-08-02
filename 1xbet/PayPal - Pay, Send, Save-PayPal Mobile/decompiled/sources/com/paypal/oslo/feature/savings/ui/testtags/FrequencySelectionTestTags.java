package com.paypal.oslo.feature.savings.ui.testtags;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0014\u0010\u0012\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u0014\u0010\u0013\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/testtags/FrequencySelectionTestTags;", "", "<init>", "()V", "Ljava/time/DayOfWeek;", "day", "", "weekDayChip", "(Ljava/time/DayOfWeek;)Ljava/lang/String;", "SCREEN", "Ljava/lang/String;", "ONE_TIME_OPTION", "WEEKLY_OPTION", "EVERY_2_WEEKS_OPTION", "EVERY_MONTH_OPTION", "WEEK_DAY_SELECTOR", "DATE_SELECTOR", "DATE_INPUT", "CALENDAR_BUTTON", "CONFIRM_BUTTON"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FrequencySelectionTestTags {
    public static final int $stable = 0;
    public static final java.lang.String CALENDAR_BUTTON = "frequency_calendar_button";
    public static final java.lang.String CONFIRM_BUTTON = "frequency_confirm_button";
    public static final java.lang.String DATE_INPUT = "frequency_date_input";
    public static final java.lang.String DATE_SELECTOR = "frequency_date_selector";
    public static final java.lang.String EVERY_2_WEEKS_OPTION = "frequency_option_every_2_weeks";
    public static final java.lang.String EVERY_MONTH_OPTION = "frequency_option_every_month";
    public static final com.paypal.oslo.feature.savings.ui.testtags.FrequencySelectionTestTags INSTANCE = new com.paypal.oslo.feature.savings.ui.testtags.FrequencySelectionTestTags();
    public static final java.lang.String ONE_TIME_OPTION = "frequency_option_one_time";
    public static final java.lang.String SCREEN = "frequency_selection_screen";
    public static final java.lang.String WEEKLY_OPTION = "frequency_option_weekly";
    public static final java.lang.String WEEK_DAY_SELECTOR = "frequency_week_day_selector";

    private FrequencySelectionTestTags() {
    }

    public final java.lang.String weekDayChip(java.time.DayOfWeek day) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(day, "");
        java.lang.String lowerCase = day.name().toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return "frequency_day_chip_".concat(java.lang.String.valueOf(lowerCase));
    }
}
