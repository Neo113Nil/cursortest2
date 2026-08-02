package com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellReviewStep;", "", "<init>", "(Ljava/lang/String;I)V", "LOADING", "PAYMENT_SELECTION", "FINAL_REVIEW", "COMPLETED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoSellReviewStep {
    public static final com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewStep COMPLETED;
    public static final com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewStep FINAL_REVIEW;
    public static final com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewStep LOADING;
    public static final com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewStep PAYMENT_SELECTION;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewStep[] getHighSpeedVideoFpsRangesFor;

    private CryptoSellReviewStep(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewStep cryptoSellReviewStep = new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewStep("LOADING", 0);
        LOADING = cryptoSellReviewStep;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewStep cryptoSellReviewStep2 = new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewStep("PAYMENT_SELECTION", 1);
        PAYMENT_SELECTION = cryptoSellReviewStep2;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewStep cryptoSellReviewStep3 = new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewStep("FINAL_REVIEW", 2);
        FINAL_REVIEW = cryptoSellReviewStep3;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewStep cryptoSellReviewStep4 = new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewStep("COMPLETED", 3);
        COMPLETED = cryptoSellReviewStep4;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewStep[] cryptoSellReviewStepArr = {cryptoSellReviewStep, cryptoSellReviewStep2, cryptoSellReviewStep3, cryptoSellReviewStep4};
        getHighSpeedVideoFpsRangesFor = cryptoSellReviewStepArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(cryptoSellReviewStepArr);
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewStep[] values() {
        return (com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewStep[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewStep valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewStep) java.lang.Enum.valueOf(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewStep.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewStep> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
