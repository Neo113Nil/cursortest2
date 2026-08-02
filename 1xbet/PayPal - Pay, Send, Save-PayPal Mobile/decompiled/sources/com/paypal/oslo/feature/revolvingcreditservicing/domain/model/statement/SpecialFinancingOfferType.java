package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statement/SpecialFinancingOfferType;", "", "<init>", "(Ljava/lang/String;I)V", "NO_INTEREST", "REDUCED_APR", "DEFERRED_INTEREST", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SpecialFinancingOfferType {
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingOfferType[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingOfferType DEFERRED_INTEREST;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingOfferType NO_INTEREST;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingOfferType REDUCED_APR;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingOfferType UNKNOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private SpecialFinancingOfferType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingOfferType specialFinancingOfferType = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingOfferType("NO_INTEREST", 0);
        NO_INTEREST = specialFinancingOfferType;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingOfferType specialFinancingOfferType2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingOfferType("REDUCED_APR", 1);
        REDUCED_APR = specialFinancingOfferType2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingOfferType specialFinancingOfferType3 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingOfferType("DEFERRED_INTEREST", 2);
        DEFERRED_INTEREST = specialFinancingOfferType3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingOfferType specialFinancingOfferType4 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingOfferType("UNKNOWN", 3);
        UNKNOWN = specialFinancingOfferType4;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingOfferType[] specialFinancingOfferTypeArr = {specialFinancingOfferType, specialFinancingOfferType2, specialFinancingOfferType3, specialFinancingOfferType4};
        Camera2StreamConfigurationMap = specialFinancingOfferTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(specialFinancingOfferTypeArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingOfferType[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingOfferType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingOfferType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingOfferType) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingOfferType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingOfferType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
