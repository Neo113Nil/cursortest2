package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statement/SpecialFinancingStatus;", "", "<init>", "(Ljava/lang/String;I)V", com.payair.model.TokenStatusKt.TOKEN_ACTIVE, "EXPIRING", "PAID_OFF", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SpecialFinancingStatus {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingStatus ACTIVE;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingStatus[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingStatus EXPIRING;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingStatus PAID_OFF;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingStatus UNKNOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private SpecialFinancingStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingStatus specialFinancingStatus = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingStatus(com.payair.model.TokenStatusKt.TOKEN_ACTIVE, 0);
        ACTIVE = specialFinancingStatus;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingStatus specialFinancingStatus2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingStatus("EXPIRING", 1);
        EXPIRING = specialFinancingStatus2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingStatus specialFinancingStatus3 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingStatus("PAID_OFF", 2);
        PAID_OFF = specialFinancingStatus3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingStatus specialFinancingStatus4 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingStatus("UNKNOWN", 3);
        UNKNOWN = specialFinancingStatus4;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingStatus[] specialFinancingStatusArr = {specialFinancingStatus, specialFinancingStatus2, specialFinancingStatus3, specialFinancingStatus4};
        Camera2StreamConfigurationMap = specialFinancingStatusArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(specialFinancingStatusArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingStatus[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingStatus[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingStatus> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
