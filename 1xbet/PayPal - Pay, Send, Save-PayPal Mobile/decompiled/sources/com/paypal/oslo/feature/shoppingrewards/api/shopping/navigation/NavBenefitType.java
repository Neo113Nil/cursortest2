package com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/api/shopping/navigation/NavBenefitType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "ZERO_APR", "PAY_IN_4", "PAY_MONTHLY", "PAY_LATER_GENERIC", "ACCEPTS_PAYPAL", "MERCHANT_OFFER_PERCENT", "SPONSORED"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes14.dex */
public final class NavBenefitType {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;
    public static final com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType ACCEPTS_PAYPAL;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType MERCHANT_OFFER_PERCENT;
    public static final com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType PAY_IN_4;
    public static final com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType PAY_LATER_GENERIC;
    public static final com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType PAY_MONTHLY;
    public static final com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType SPONSORED;
    public static final com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType ZERO_APR;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/api/shopping/navigation/NavBenefitType$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/shoppingrewards/api/shopping/navigation/NavBenefitType;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private NavBenefitType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType navBenefitType = new com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType("ZERO_APR", 0);
        ZERO_APR = navBenefitType;
        com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType navBenefitType2 = new com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType("PAY_IN_4", 1);
        PAY_IN_4 = navBenefitType2;
        com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType navBenefitType3 = new com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType("PAY_MONTHLY", 2);
        PAY_MONTHLY = navBenefitType3;
        com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType navBenefitType4 = new com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType("PAY_LATER_GENERIC", 3);
        PAY_LATER_GENERIC = navBenefitType4;
        com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType navBenefitType5 = new com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType("ACCEPTS_PAYPAL", 4);
        ACCEPTS_PAYPAL = navBenefitType5;
        com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType navBenefitType6 = new com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType("MERCHANT_OFFER_PERCENT", 5);
        MERCHANT_OFFER_PERCENT = navBenefitType6;
        com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType navBenefitType7 = new com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType("SPONSORED", 6);
        SPONSORED = navBenefitType7;
        com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType[] navBenefitTypeArr = {navBenefitType, navBenefitType2, navBenefitType3, navBenefitType4, navBenefitType5, navBenefitType6, navBenefitType7};
        $VALUES = navBenefitTypeArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(navBenefitTypeArr);
        INSTANCE = new com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType", com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType[] values() {
        return (com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType) java.lang.Enum.valueOf(com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType> getEntries() {
        return $ENTRIES;
    }
}
