package com.paypal.oslo.feature.balance.ui.autoReload.review;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewRequestStep;", "", "<init>", "(Ljava/lang/String;I)V", "FUNDING_INSTRUMENTS", "BALANCE_ID", "CREATE_AUTO_RELOAD"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ReviewRequestStep {
    public static final com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewRequestStep BALANCE_ID;
    public static final com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewRequestStep CREATE_AUTO_RELOAD;
    public static final com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewRequestStep FUNDING_INSTRUMENTS;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewRequestStep[] getHighSpeedVideoSizes;

    private ReviewRequestStep(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewRequestStep reviewRequestStep = new com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewRequestStep("FUNDING_INSTRUMENTS", 0);
        FUNDING_INSTRUMENTS = reviewRequestStep;
        com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewRequestStep reviewRequestStep2 = new com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewRequestStep("BALANCE_ID", 1);
        BALANCE_ID = reviewRequestStep2;
        com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewRequestStep reviewRequestStep3 = new com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewRequestStep("CREATE_AUTO_RELOAD", 2);
        CREATE_AUTO_RELOAD = reviewRequestStep3;
        com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewRequestStep[] reviewRequestStepArr = {reviewRequestStep, reviewRequestStep2, reviewRequestStep3};
        getHighSpeedVideoSizes = reviewRequestStepArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(reviewRequestStepArr);
    }

    public static com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewRequestStep[] values() {
        return (com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewRequestStep[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewRequestStep valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewRequestStep) java.lang.Enum.valueOf(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewRequestStep.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewRequestStep> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
