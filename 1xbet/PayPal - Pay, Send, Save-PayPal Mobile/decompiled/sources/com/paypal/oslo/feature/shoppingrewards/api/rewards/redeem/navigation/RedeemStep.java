package com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemStep;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "CAPTURE", "CHARITY_LIST", "DONATION_SUMMARY", "CONFIRMATION"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class RedeemStep {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemStep[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;
    public static final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemStep CAPTURE;
    public static final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemStep CHARITY_LIST;
    public static final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemStep CONFIRMATION;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemStep.Companion INSTANCE;
    public static final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemStep DONATION_SUMMARY;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemStep$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemStep;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemStep> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemStep.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private RedeemStep(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemStep redeemStep = new com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemStep("CAPTURE", 0);
        CAPTURE = redeemStep;
        com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemStep redeemStep2 = new com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemStep("CHARITY_LIST", 1);
        CHARITY_LIST = redeemStep2;
        com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemStep redeemStep3 = new com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemStep("DONATION_SUMMARY", 2);
        DONATION_SUMMARY = redeemStep3;
        com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemStep redeemStep4 = new com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemStep("CONFIRMATION", 3);
        CONFIRMATION = redeemStep4;
        com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemStep[] redeemStepArr = {redeemStep, redeemStep2, redeemStep3, redeemStep4};
        $VALUES = redeemStepArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(redeemStepArr);
        INSTANCE = new com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemStep.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemStep$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemStep", com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemStep.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemStep[] values() {
        return (com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemStep[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemStep valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemStep) java.lang.Enum.valueOf(com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemStep.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemStep> getEntries() {
        return $ENTRIES;
    }
}
