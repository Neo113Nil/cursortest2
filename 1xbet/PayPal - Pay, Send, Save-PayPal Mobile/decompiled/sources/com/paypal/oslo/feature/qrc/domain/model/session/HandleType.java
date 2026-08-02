package com.paypal.oslo.feature.qrc.domain.model.session;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/session/HandleType;", "", "<init>", "(Ljava/lang/String;I)V", "REDIRECT", "DATA_COLLECTION", "POLL"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class HandleType {
    public static final com.paypal.oslo.feature.qrc.domain.model.session.HandleType DATA_COLLECTION;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.HandleType POLL;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.HandleType REDIRECT;
    private static final /* synthetic */ com.paypal.oslo.feature.qrc.domain.model.session.HandleType[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private HandleType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.qrc.domain.model.session.HandleType handleType = new com.paypal.oslo.feature.qrc.domain.model.session.HandleType("REDIRECT", 0);
        REDIRECT = handleType;
        com.paypal.oslo.feature.qrc.domain.model.session.HandleType handleType2 = new com.paypal.oslo.feature.qrc.domain.model.session.HandleType("DATA_COLLECTION", 1);
        DATA_COLLECTION = handleType2;
        com.paypal.oslo.feature.qrc.domain.model.session.HandleType handleType3 = new com.paypal.oslo.feature.qrc.domain.model.session.HandleType("POLL", 2);
        POLL = handleType3;
        com.paypal.oslo.feature.qrc.domain.model.session.HandleType[] handleTypeArr = {handleType, handleType2, handleType3};
        getHighSpeedVideoFpsRanges = handleTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(handleTypeArr);
    }

    public static com.paypal.oslo.feature.qrc.domain.model.session.HandleType[] values() {
        return (com.paypal.oslo.feature.qrc.domain.model.session.HandleType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.qrc.domain.model.session.HandleType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.qrc.domain.model.session.HandleType) java.lang.Enum.valueOf(com.paypal.oslo.feature.qrc.domain.model.session.HandleType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.qrc.domain.model.session.HandleType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
