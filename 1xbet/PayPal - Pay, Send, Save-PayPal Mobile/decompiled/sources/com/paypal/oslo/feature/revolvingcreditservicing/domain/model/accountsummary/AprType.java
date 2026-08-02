package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AprType;", "", "<init>", "(Ljava/lang/String;I)V", "FIXED", "VARIABLE", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AprType {
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AprType[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AprType FIXED;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AprType UNKNOWN;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AprType VARIABLE;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private AprType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AprType aprType = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AprType("FIXED", 0);
        FIXED = aprType;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AprType aprType2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AprType("VARIABLE", 1);
        VARIABLE = aprType2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AprType aprType3 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AprType("UNKNOWN", 2);
        UNKNOWN = aprType3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AprType[] aprTypeArr = {aprType, aprType2, aprType3};
        Camera2StreamConfigurationMap = aprTypeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(aprTypeArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AprType[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AprType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AprType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AprType) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AprType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AprType> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
