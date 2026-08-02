package com.paypal.oslo.feature.inappcheckout.domain.entity;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyType;", "", "<init>", "(Ljava/lang/String;I)V", "TRANSACTION_LEVEL_CONTINGENCY", "INSTRUMENT_LEVEL_CONTINGENCY"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ContingencyType {
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyType INSTRUMENT_LEVEL_CONTINGENCY;
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyType TRANSACTION_LEVEL_CONTINGENCY;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyType[] getHighSpeedVideoSizes;

    private ContingencyType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyType contingencyType = new com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyType("TRANSACTION_LEVEL_CONTINGENCY", 0);
        TRANSACTION_LEVEL_CONTINGENCY = contingencyType;
        com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyType contingencyType2 = new com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyType("INSTRUMENT_LEVEL_CONTINGENCY", 1);
        INSTRUMENT_LEVEL_CONTINGENCY = contingencyType2;
        com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyType[] contingencyTypeArr = {contingencyType, contingencyType2};
        getHighSpeedVideoSizes = contingencyTypeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(contingencyTypeArr);
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyType[] values() {
        return (com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyType[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyType) java.lang.Enum.valueOf(com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyType> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
