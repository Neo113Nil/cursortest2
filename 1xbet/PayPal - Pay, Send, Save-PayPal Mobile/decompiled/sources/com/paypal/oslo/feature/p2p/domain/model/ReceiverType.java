package com.paypal.oslo.feature.p2p.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/ReceiverType;", "", "<init>", "(Ljava/lang/String;I)V", "EMAIL_ADDRESS", "PHONE_NUMBER", "USERNAME", "PEER_ID", "UNIQUE_PAYMENT_CODE", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ReceiverType {
    public static final com.paypal.oslo.feature.p2p.domain.model.ReceiverType EMAIL_ADDRESS;
    public static final com.paypal.oslo.feature.p2p.domain.model.ReceiverType PEER_ID;
    public static final com.paypal.oslo.feature.p2p.domain.model.ReceiverType PHONE_NUMBER;
    public static final com.paypal.oslo.feature.p2p.domain.model.ReceiverType UNIQUE_PAYMENT_CODE;
    public static final com.paypal.oslo.feature.p2p.domain.model.ReceiverType UNKNOWN;
    public static final com.paypal.oslo.feature.p2p.domain.model.ReceiverType USERNAME;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.ReceiverType[] getHighSpeedVideoSizes;

    private ReceiverType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.p2p.domain.model.ReceiverType receiverType = new com.paypal.oslo.feature.p2p.domain.model.ReceiverType("EMAIL_ADDRESS", 0);
        EMAIL_ADDRESS = receiverType;
        com.paypal.oslo.feature.p2p.domain.model.ReceiverType receiverType2 = new com.paypal.oslo.feature.p2p.domain.model.ReceiverType("PHONE_NUMBER", 1);
        PHONE_NUMBER = receiverType2;
        com.paypal.oslo.feature.p2p.domain.model.ReceiverType receiverType3 = new com.paypal.oslo.feature.p2p.domain.model.ReceiverType("USERNAME", 2);
        USERNAME = receiverType3;
        com.paypal.oslo.feature.p2p.domain.model.ReceiverType receiverType4 = new com.paypal.oslo.feature.p2p.domain.model.ReceiverType("PEER_ID", 3);
        PEER_ID = receiverType4;
        com.paypal.oslo.feature.p2p.domain.model.ReceiverType receiverType5 = new com.paypal.oslo.feature.p2p.domain.model.ReceiverType("UNIQUE_PAYMENT_CODE", 4);
        UNIQUE_PAYMENT_CODE = receiverType5;
        com.paypal.oslo.feature.p2p.domain.model.ReceiverType receiverType6 = new com.paypal.oslo.feature.p2p.domain.model.ReceiverType("UNKNOWN", 5);
        UNKNOWN = receiverType6;
        com.paypal.oslo.feature.p2p.domain.model.ReceiverType[] receiverTypeArr = {receiverType, receiverType2, receiverType3, receiverType4, receiverType5, receiverType6};
        getHighSpeedVideoSizes = receiverTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(receiverTypeArr);
    }

    public static com.paypal.oslo.feature.p2p.domain.model.ReceiverType[] values() {
        return (com.paypal.oslo.feature.p2p.domain.model.ReceiverType[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.p2p.domain.model.ReceiverType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.p2p.domain.model.ReceiverType) java.lang.Enum.valueOf(com.paypal.oslo.feature.p2p.domain.model.ReceiverType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.p2p.domain.model.ReceiverType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
