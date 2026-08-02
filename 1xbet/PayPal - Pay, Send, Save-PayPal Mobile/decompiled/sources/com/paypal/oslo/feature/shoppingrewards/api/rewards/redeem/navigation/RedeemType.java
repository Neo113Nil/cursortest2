package com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, "SAVINGS", "DONATION"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class RedeemType {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;
    public static final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType BALANCE;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType DONATION;
    public static final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType SAVINGS;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private RedeemType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType = new com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, 0);
        BALANCE = redeemType;
        com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType2 = new com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType("SAVINGS", 1);
        SAVINGS = redeemType2;
        com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType3 = new com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType("DONATION", 2);
        DONATION = redeemType3;
        com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType[] redeemTypeArr = {redeemType, redeemType2, redeemType3};
        $VALUES = redeemTypeArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(redeemTypeArr);
        INSTANCE = new com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType", com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType[] values() {
        return (com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType) java.lang.Enum.valueOf(com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType> getEntries() {
        return $ENTRIES;
    }
}
