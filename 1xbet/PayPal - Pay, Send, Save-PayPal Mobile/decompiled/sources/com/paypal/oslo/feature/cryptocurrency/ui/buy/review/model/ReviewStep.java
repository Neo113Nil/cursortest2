package com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/ReviewStep;", "", "<init>", "(Ljava/lang/String;I)V", "RECURRING_OPTIONS", "PAYMENT_METHOD", "FINAL_REVIEW", "COMPLETED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ReviewStep {
    public static final com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep COMPLETED;
    public static final com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep FINAL_REVIEW;
    public static final com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep PAYMENT_METHOD;
    public static final com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep RECURRING_OPTIONS;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep[] getHighSpeedVideoFpsRanges;

    private ReviewStep(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep reviewStep = new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep("RECURRING_OPTIONS", 0);
        RECURRING_OPTIONS = reviewStep;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep reviewStep2 = new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep("PAYMENT_METHOD", 1);
        PAYMENT_METHOD = reviewStep2;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep reviewStep3 = new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep("FINAL_REVIEW", 2);
        FINAL_REVIEW = reviewStep3;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep reviewStep4 = new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep("COMPLETED", 3);
        COMPLETED = reviewStep4;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep[] reviewStepArr = {reviewStep, reviewStep2, reviewStep3, reviewStep4};
        getHighSpeedVideoFpsRanges = reviewStepArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(reviewStepArr);
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep[] values() {
        return (com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep) java.lang.Enum.valueOf(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewStep> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
