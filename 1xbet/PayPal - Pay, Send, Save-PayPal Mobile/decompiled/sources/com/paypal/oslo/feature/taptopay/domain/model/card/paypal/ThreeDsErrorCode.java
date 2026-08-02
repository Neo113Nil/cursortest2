package com.paypal.oslo.feature.taptopay.domain.model.card.paypal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/ThreeDsErrorCode;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_AUTHENTICATED", "NETWORK_ERROR"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ThreeDsErrorCode {
    private static final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsErrorCode[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsErrorCode NETWORK_ERROR;
    public static final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsErrorCode NOT_AUTHENTICATED;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;

    private ThreeDsErrorCode(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsErrorCode threeDsErrorCode = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsErrorCode("NOT_AUTHENTICATED", 0);
        NOT_AUTHENTICATED = threeDsErrorCode;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsErrorCode threeDsErrorCode2 = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsErrorCode("NETWORK_ERROR", 1);
        NETWORK_ERROR = threeDsErrorCode2;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsErrorCode[] threeDsErrorCodeArr = {threeDsErrorCode, threeDsErrorCode2};
        Camera2StreamConfigurationMap = threeDsErrorCodeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(threeDsErrorCodeArr);
    }

    public static com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsErrorCode[] values() {
        return (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsErrorCode[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsErrorCode valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsErrorCode) java.lang.Enum.valueOf(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsErrorCode.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsErrorCode> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
