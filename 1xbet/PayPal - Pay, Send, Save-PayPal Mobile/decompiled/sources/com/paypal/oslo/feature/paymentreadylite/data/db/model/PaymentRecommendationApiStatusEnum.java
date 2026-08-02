package com.paypal.oslo.feature.paymentreadylite.data.db.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/paymentreadylite/data/db/model/PaymentRecommendationApiStatusEnum;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaymentRecommendationApiStatusEnum {
    public static final com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentRecommendationApiStatusEnum FAILED;
    public static final com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentRecommendationApiStatusEnum SUCCESS;
    private static final /* synthetic */ com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentRecommendationApiStatusEnum[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private PaymentRecommendationApiStatusEnum(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentRecommendationApiStatusEnum paymentRecommendationApiStatusEnum = new com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentRecommendationApiStatusEnum("SUCCESS", 0);
        SUCCESS = paymentRecommendationApiStatusEnum;
        com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentRecommendationApiStatusEnum paymentRecommendationApiStatusEnum2 = new com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentRecommendationApiStatusEnum(com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED, 1);
        FAILED = paymentRecommendationApiStatusEnum2;
        com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentRecommendationApiStatusEnum[] paymentRecommendationApiStatusEnumArr = {paymentRecommendationApiStatusEnum, paymentRecommendationApiStatusEnum2};
        getHighResolutionOutputSizeshNQ4ISI = paymentRecommendationApiStatusEnumArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(paymentRecommendationApiStatusEnumArr);
    }

    public static com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentRecommendationApiStatusEnum[] values() {
        return (com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentRecommendationApiStatusEnum[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentRecommendationApiStatusEnum valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentRecommendationApiStatusEnum) java.lang.Enum.valueOf(com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentRecommendationApiStatusEnum.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentRecommendationApiStatusEnum> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
