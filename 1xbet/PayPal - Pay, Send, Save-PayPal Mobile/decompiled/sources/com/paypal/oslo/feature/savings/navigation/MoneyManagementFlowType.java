package com.paypal.oslo.feature.savings.navigation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/feature/savings/navigation/MoneyManagementFlowType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "ADD_MONEY", "TRANSFER_MONEY", "AUTO_SAVE", "DELETE_GOAL", "CREATE_GOAL"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class MoneyManagementFlowType {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;
    public static final com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType ADD_MONEY;
    public static final com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType AUTO_SAVE;
    public static final com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType CREATE_GOAL;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType DELETE_GOAL;
    public static final com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType TRANSFER_MONEY;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/navigation/MoneyManagementFlowType$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/savings/navigation/MoneyManagementFlowType;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private MoneyManagementFlowType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType = new com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType("ADD_MONEY", 0);
        ADD_MONEY = moneyManagementFlowType;
        com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType2 = new com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType("TRANSFER_MONEY", 1);
        TRANSFER_MONEY = moneyManagementFlowType2;
        com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType3 = new com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType("AUTO_SAVE", 2);
        AUTO_SAVE = moneyManagementFlowType3;
        com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType4 = new com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType("DELETE_GOAL", 3);
        DELETE_GOAL = moneyManagementFlowType4;
        com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType5 = new com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType("CREATE_GOAL", 4);
        CREATE_GOAL = moneyManagementFlowType5;
        com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType[] moneyManagementFlowTypeArr = {moneyManagementFlowType, moneyManagementFlowType2, moneyManagementFlowType3, moneyManagementFlowType4, moneyManagementFlowType5};
        $VALUES = moneyManagementFlowTypeArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(moneyManagementFlowTypeArr);
        INSTANCE = new com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType", com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType[] values() {
        return (com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType) java.lang.Enum.valueOf(com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType> getEntries() {
        return $ENTRIES;
    }
}
