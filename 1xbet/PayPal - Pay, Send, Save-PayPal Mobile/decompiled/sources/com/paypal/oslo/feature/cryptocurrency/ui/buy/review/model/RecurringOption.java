package com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/RecurringOption;", "", "<init>", "(Ljava/lang/String;I)V", "ONE_TIME", "EVERY_DAY", "EVERY_WEEK", "EVERY_TWO_WEEKS", "EVERY_MONTH"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RecurringOption {
    public static final com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption EVERY_DAY;
    public static final com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption EVERY_MONTH;
    public static final com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption EVERY_TWO_WEEKS;
    public static final com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption EVERY_WEEK;
    public static final com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption ONE_TIME;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption[] getHighSpeedVideoSizes;

    private RecurringOption(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption recurringOption = new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption("ONE_TIME", 0);
        ONE_TIME = recurringOption;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption recurringOption2 = new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption("EVERY_DAY", 1);
        EVERY_DAY = recurringOption2;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption recurringOption3 = new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption("EVERY_WEEK", 2);
        EVERY_WEEK = recurringOption3;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption recurringOption4 = new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption("EVERY_TWO_WEEKS", 3);
        EVERY_TWO_WEEKS = recurringOption4;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption recurringOption5 = new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption("EVERY_MONTH", 4);
        EVERY_MONTH = recurringOption5;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption[] recurringOptionArr = {recurringOption, recurringOption2, recurringOption3, recurringOption4, recurringOption5};
        getHighSpeedVideoSizes = recurringOptionArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(recurringOptionArr);
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption[] values() {
        return (com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption) java.lang.Enum.valueOf(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
