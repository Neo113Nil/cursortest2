package com.paypal.oslo.feature.savings.domain.model.savingshub.registry;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/savingshub/registry/SavingsHubComponentType;", "", "<init>", "(Ljava/lang/String;I)V", "BalanceCard", "PromoZone", "GoalsZone", "EducationalZone", "DocumentZone", "InterestZone", "Unknown"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SavingsHubComponentType {
    public static final com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentType BalanceCard;
    private static final /* synthetic */ com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentType[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentType DocumentZone;
    public static final com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentType EducationalZone;
    public static final com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentType GoalsZone;
    public static final com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentType InterestZone;
    public static final com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentType PromoZone;
    public static final com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentType Unknown;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private SavingsHubComponentType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentType savingsHubComponentType = new com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentType("BalanceCard", 0);
        BalanceCard = savingsHubComponentType;
        com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentType savingsHubComponentType2 = new com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentType("PromoZone", 1);
        PromoZone = savingsHubComponentType2;
        com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentType savingsHubComponentType3 = new com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentType("GoalsZone", 2);
        GoalsZone = savingsHubComponentType3;
        com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentType savingsHubComponentType4 = new com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentType("EducationalZone", 3);
        EducationalZone = savingsHubComponentType4;
        com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentType savingsHubComponentType5 = new com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentType("DocumentZone", 4);
        DocumentZone = savingsHubComponentType5;
        com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentType savingsHubComponentType6 = new com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentType("InterestZone", 5);
        InterestZone = savingsHubComponentType6;
        com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentType savingsHubComponentType7 = new com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentType("Unknown", 6);
        Unknown = savingsHubComponentType7;
        com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentType[] savingsHubComponentTypeArr = {savingsHubComponentType, savingsHubComponentType2, savingsHubComponentType3, savingsHubComponentType4, savingsHubComponentType5, savingsHubComponentType6, savingsHubComponentType7};
        Camera2StreamConfigurationMap = savingsHubComponentTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(savingsHubComponentTypeArr);
    }

    public static com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentType[] values() {
        return (com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentType) java.lang.Enum.valueOf(com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
