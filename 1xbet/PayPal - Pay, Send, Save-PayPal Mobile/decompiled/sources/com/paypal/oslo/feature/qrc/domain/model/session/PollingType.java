package com.paypal.oslo.feature.qrc.domain.model.session;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/session/PollingType;", "", "<init>", "(Ljava/lang/String;I)V", "PAYMENT_POLL", "GET_SESSIONS"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PollingType {
    public static final com.paypal.oslo.feature.qrc.domain.model.session.PollingType GET_SESSIONS;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.PollingType PAYMENT_POLL;
    private static final /* synthetic */ com.paypal.oslo.feature.qrc.domain.model.session.PollingType[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private PollingType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.qrc.domain.model.session.PollingType pollingType = new com.paypal.oslo.feature.qrc.domain.model.session.PollingType("PAYMENT_POLL", 0);
        PAYMENT_POLL = pollingType;
        com.paypal.oslo.feature.qrc.domain.model.session.PollingType pollingType2 = new com.paypal.oslo.feature.qrc.domain.model.session.PollingType("GET_SESSIONS", 1);
        GET_SESSIONS = pollingType2;
        com.paypal.oslo.feature.qrc.domain.model.session.PollingType[] pollingTypeArr = {pollingType, pollingType2};
        getHighSpeedVideoFpsRanges = pollingTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(pollingTypeArr);
    }

    public static com.paypal.oslo.feature.qrc.domain.model.session.PollingType[] values() {
        return (com.paypal.oslo.feature.qrc.domain.model.session.PollingType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.qrc.domain.model.session.PollingType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.qrc.domain.model.session.PollingType) java.lang.Enum.valueOf(com.paypal.oslo.feature.qrc.domain.model.session.PollingType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.qrc.domain.model.session.PollingType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
