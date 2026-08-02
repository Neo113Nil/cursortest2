package com.paypal.oslo.feature.qrc.domain.model.session;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcTippingStatus;", "", "<init>", "(Ljava/lang/String;I)V", com.payair.model.TokenStatusKt.TOKEN_ACTIVE, com.payair.model.TokenStatusKt.TOKEN_INACTIVE, "TERMINATED", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class QrcTippingStatus {
    public static final com.paypal.oslo.feature.qrc.domain.model.session.QrcTippingStatus ACTIVE;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.QrcTippingStatus INACTIVE;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.QrcTippingStatus TERMINATED;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.QrcTippingStatus UNKNOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.qrc.domain.model.session.QrcTippingStatus[] getHighSpeedVideoSizes;

    private QrcTippingStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.qrc.domain.model.session.QrcTippingStatus qrcTippingStatus = new com.paypal.oslo.feature.qrc.domain.model.session.QrcTippingStatus(com.payair.model.TokenStatusKt.TOKEN_ACTIVE, 0);
        ACTIVE = qrcTippingStatus;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcTippingStatus qrcTippingStatus2 = new com.paypal.oslo.feature.qrc.domain.model.session.QrcTippingStatus(com.payair.model.TokenStatusKt.TOKEN_INACTIVE, 1);
        INACTIVE = qrcTippingStatus2;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcTippingStatus qrcTippingStatus3 = new com.paypal.oslo.feature.qrc.domain.model.session.QrcTippingStatus("TERMINATED", 2);
        TERMINATED = qrcTippingStatus3;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcTippingStatus qrcTippingStatus4 = new com.paypal.oslo.feature.qrc.domain.model.session.QrcTippingStatus("UNKNOWN", 3);
        UNKNOWN = qrcTippingStatus4;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcTippingStatus[] qrcTippingStatusArr = {qrcTippingStatus, qrcTippingStatus2, qrcTippingStatus3, qrcTippingStatus4};
        getHighSpeedVideoSizes = qrcTippingStatusArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(qrcTippingStatusArr);
    }

    public static com.paypal.oslo.feature.qrc.domain.model.session.QrcTippingStatus[] values() {
        return (com.paypal.oslo.feature.qrc.domain.model.session.QrcTippingStatus[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.qrc.domain.model.session.QrcTippingStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.qrc.domain.model.session.QrcTippingStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.qrc.domain.model.session.QrcTippingStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.qrc.domain.model.session.QrcTippingStatus> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
