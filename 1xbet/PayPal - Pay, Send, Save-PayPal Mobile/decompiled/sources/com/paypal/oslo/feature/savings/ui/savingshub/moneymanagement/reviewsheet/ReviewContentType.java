package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewsheet/ReviewContentType;", "", "<init>", "(Ljava/lang/String;I)V", "REVIEW", "FI_SELECTION", "GOAL_SELECTION", "ADD_CARD", "ADD_BANK", "INSUFFICIENT_FUNDS_ERROR"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ReviewContentType {
    public static final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewContentType ADD_BANK;
    public static final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewContentType ADD_CARD;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewContentType FI_SELECTION;
    public static final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewContentType GOAL_SELECTION;
    public static final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewContentType INSUFFICIENT_FUNDS_ERROR;
    public static final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewContentType REVIEW;
    private static final /* synthetic */ com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewContentType[] getHighSpeedVideoFpsRanges;

    private ReviewContentType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewContentType reviewContentType = new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewContentType("REVIEW", 0);
        REVIEW = reviewContentType;
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewContentType reviewContentType2 = new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewContentType("FI_SELECTION", 1);
        FI_SELECTION = reviewContentType2;
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewContentType reviewContentType3 = new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewContentType("GOAL_SELECTION", 2);
        GOAL_SELECTION = reviewContentType3;
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewContentType reviewContentType4 = new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewContentType("ADD_CARD", 3);
        ADD_CARD = reviewContentType4;
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewContentType reviewContentType5 = new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewContentType("ADD_BANK", 4);
        ADD_BANK = reviewContentType5;
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewContentType reviewContentType6 = new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewContentType("INSUFFICIENT_FUNDS_ERROR", 5);
        INSUFFICIENT_FUNDS_ERROR = reviewContentType6;
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewContentType[] reviewContentTypeArr = {reviewContentType, reviewContentType2, reviewContentType3, reviewContentType4, reviewContentType5, reviewContentType6};
        getHighSpeedVideoFpsRanges = reviewContentTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(reviewContentTypeArr);
    }

    public static com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewContentType[] values() {
        return (com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewContentType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewContentType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewContentType) java.lang.Enum.valueOf(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewContentType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewContentType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
