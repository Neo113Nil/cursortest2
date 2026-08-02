package com.paypal.oslo.feature.paymentreadylite.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/paymentreadylite/domain/model/PaymentRecommendationApiStatus;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaymentRecommendationApiStatus {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendationApiStatus FAILED;
    public static final com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendationApiStatus SUCCESS;
    private static final /* synthetic */ com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendationApiStatus[] getHighSpeedVideoSizes;

    private PaymentRecommendationApiStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendationApiStatus paymentRecommendationApiStatus = new com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendationApiStatus("SUCCESS", 0);
        SUCCESS = paymentRecommendationApiStatus;
        com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendationApiStatus paymentRecommendationApiStatus2 = new com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendationApiStatus(com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED, 1);
        FAILED = paymentRecommendationApiStatus2;
        com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendationApiStatus[] paymentRecommendationApiStatusArr = {paymentRecommendationApiStatus, paymentRecommendationApiStatus2};
        getHighSpeedVideoSizes = paymentRecommendationApiStatusArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(paymentRecommendationApiStatusArr);
    }

    public static com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendationApiStatus[] values() {
        return (com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendationApiStatus[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendationApiStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendationApiStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendationApiStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendationApiStatus> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
