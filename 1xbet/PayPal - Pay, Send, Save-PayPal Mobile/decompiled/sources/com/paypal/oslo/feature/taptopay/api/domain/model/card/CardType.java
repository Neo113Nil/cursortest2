package com.paypal.oslo.feature.taptopay.api.domain.model.card;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/CardType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "PayPalConsumerDebit", "PayPalBusinessDebit", "ThirdPartyCredit", "ThirdPartyDebit", "PayLaterToGo", "Unknown"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class CardType {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType PayLaterToGo;
    public static final com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType PayPalBusinessDebit;
    public static final com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType PayPalConsumerDebit;
    public static final com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType ThirdPartyCredit;
    public static final com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType ThirdPartyDebit;
    public static final com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType Unknown;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/CardType$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/CardType;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private CardType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType cardType = new com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType("PayPalConsumerDebit", 0);
        PayPalConsumerDebit = cardType;
        com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType cardType2 = new com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType("PayPalBusinessDebit", 1);
        PayPalBusinessDebit = cardType2;
        com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType cardType3 = new com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType("ThirdPartyCredit", 2);
        ThirdPartyCredit = cardType3;
        com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType cardType4 = new com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType("ThirdPartyDebit", 3);
        ThirdPartyDebit = cardType4;
        com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType cardType5 = new com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType("PayLaterToGo", 4);
        PayLaterToGo = cardType5;
        com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType cardType6 = new com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType("Unknown", 5);
        Unknown = cardType6;
        com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType[] cardTypeArr = {cardType, cardType2, cardType3, cardType4, cardType5, cardType6};
        $VALUES = cardTypeArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(cardTypeArr);
        INSTANCE = new com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType", com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType[] values() {
        return (com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType) java.lang.Enum.valueOf(com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType> getEntries() {
        return $ENTRIES;
    }
}
