package com.paypal.oslo.feature.balance.ui.autoReload.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReviewDisclaimerType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "NONE", "SCHEDULED_BANK", "SCHEDULED_CARD", "LOW_BALANCE_BANK_INSTANT", "LOW_BALANCE_BANK_STANDARD", "LOW_BALANCE_CARD", "LOW_BALANCE_SAVINGS"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes11.dex */
public final class ReviewDisclaimerType {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType LOW_BALANCE_BANK_INSTANT;
    public static final com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType LOW_BALANCE_BANK_STANDARD;
    public static final com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType LOW_BALANCE_CARD;
    public static final com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType LOW_BALANCE_SAVINGS;
    public static final com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType NONE;
    public static final com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType SCHEDULED_BANK;
    public static final com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType SCHEDULED_CARD;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReviewDisclaimerType$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReviewDisclaimerType;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private ReviewDisclaimerType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType reviewDisclaimerType = new com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType("NONE", 0);
        NONE = reviewDisclaimerType;
        com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType reviewDisclaimerType2 = new com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType("SCHEDULED_BANK", 1);
        SCHEDULED_BANK = reviewDisclaimerType2;
        com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType reviewDisclaimerType3 = new com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType("SCHEDULED_CARD", 2);
        SCHEDULED_CARD = reviewDisclaimerType3;
        com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType reviewDisclaimerType4 = new com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType("LOW_BALANCE_BANK_INSTANT", 3);
        LOW_BALANCE_BANK_INSTANT = reviewDisclaimerType4;
        com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType reviewDisclaimerType5 = new com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType("LOW_BALANCE_BANK_STANDARD", 4);
        LOW_BALANCE_BANK_STANDARD = reviewDisclaimerType5;
        com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType reviewDisclaimerType6 = new com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType("LOW_BALANCE_CARD", 5);
        LOW_BALANCE_CARD = reviewDisclaimerType6;
        com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType reviewDisclaimerType7 = new com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType("LOW_BALANCE_SAVINGS", 6);
        LOW_BALANCE_SAVINGS = reviewDisclaimerType7;
        com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType[] reviewDisclaimerTypeArr = {reviewDisclaimerType, reviewDisclaimerType2, reviewDisclaimerType3, reviewDisclaimerType4, reviewDisclaimerType5, reviewDisclaimerType6, reviewDisclaimerType7};
        $VALUES = reviewDisclaimerTypeArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(reviewDisclaimerTypeArr);
        INSTANCE = new com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType", com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType[] values() {
        return (com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType) java.lang.Enum.valueOf(com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType> getEntries() {
        return $ENTRIES;
    }
}
