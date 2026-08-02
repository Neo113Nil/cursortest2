package com.paypal.oslo.feature.p2p.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/TopUpProviderResponseStatus;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError.CODE_USER_CANCELLED, "INSUFFICIENT_LOAD", "BUSINESS_DECLINE", com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.GENERIC_ERROR, "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TopUpProviderResponseStatus {
    public static final com.paypal.oslo.feature.p2p.domain.model.TopUpProviderResponseStatus BUSINESS_DECLINE;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.p2p.domain.model.TopUpProviderResponseStatus GENERIC_ERROR;
    public static final com.paypal.oslo.feature.p2p.domain.model.TopUpProviderResponseStatus INSUFFICIENT_LOAD;
    public static final com.paypal.oslo.feature.p2p.domain.model.TopUpProviderResponseStatus SUCCESS;
    public static final com.paypal.oslo.feature.p2p.domain.model.TopUpProviderResponseStatus UNKNOWN;
    public static final com.paypal.oslo.feature.p2p.domain.model.TopUpProviderResponseStatus USER_CANCELLED;
    private static final /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.TopUpProviderResponseStatus[] getHighResolutionOutputSizeshNQ4ISI;

    private TopUpProviderResponseStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.p2p.domain.model.TopUpProviderResponseStatus topUpProviderResponseStatus = new com.paypal.oslo.feature.p2p.domain.model.TopUpProviderResponseStatus("SUCCESS", 0);
        SUCCESS = topUpProviderResponseStatus;
        com.paypal.oslo.feature.p2p.domain.model.TopUpProviderResponseStatus topUpProviderResponseStatus2 = new com.paypal.oslo.feature.p2p.domain.model.TopUpProviderResponseStatus(com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError.CODE_USER_CANCELLED, 1);
        USER_CANCELLED = topUpProviderResponseStatus2;
        com.paypal.oslo.feature.p2p.domain.model.TopUpProviderResponseStatus topUpProviderResponseStatus3 = new com.paypal.oslo.feature.p2p.domain.model.TopUpProviderResponseStatus("INSUFFICIENT_LOAD", 2);
        INSUFFICIENT_LOAD = topUpProviderResponseStatus3;
        com.paypal.oslo.feature.p2p.domain.model.TopUpProviderResponseStatus topUpProviderResponseStatus4 = new com.paypal.oslo.feature.p2p.domain.model.TopUpProviderResponseStatus("BUSINESS_DECLINE", 3);
        BUSINESS_DECLINE = topUpProviderResponseStatus4;
        com.paypal.oslo.feature.p2p.domain.model.TopUpProviderResponseStatus topUpProviderResponseStatus5 = new com.paypal.oslo.feature.p2p.domain.model.TopUpProviderResponseStatus(com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.GENERIC_ERROR, 4);
        GENERIC_ERROR = topUpProviderResponseStatus5;
        com.paypal.oslo.feature.p2p.domain.model.TopUpProviderResponseStatus topUpProviderResponseStatus6 = new com.paypal.oslo.feature.p2p.domain.model.TopUpProviderResponseStatus("UNKNOWN", 5);
        UNKNOWN = topUpProviderResponseStatus6;
        com.paypal.oslo.feature.p2p.domain.model.TopUpProviderResponseStatus[] topUpProviderResponseStatusArr = {topUpProviderResponseStatus, topUpProviderResponseStatus2, topUpProviderResponseStatus3, topUpProviderResponseStatus4, topUpProviderResponseStatus5, topUpProviderResponseStatus6};
        getHighResolutionOutputSizeshNQ4ISI = topUpProviderResponseStatusArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(topUpProviderResponseStatusArr);
    }

    public static com.paypal.oslo.feature.p2p.domain.model.TopUpProviderResponseStatus[] values() {
        return (com.paypal.oslo.feature.p2p.domain.model.TopUpProviderResponseStatus[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.p2p.domain.model.TopUpProviderResponseStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.p2p.domain.model.TopUpProviderResponseStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.p2p.domain.model.TopUpProviderResponseStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.p2p.domain.model.TopUpProviderResponseStatus> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
