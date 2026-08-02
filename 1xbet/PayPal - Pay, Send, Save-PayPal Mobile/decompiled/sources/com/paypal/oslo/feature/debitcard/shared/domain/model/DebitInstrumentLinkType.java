package com.paypal.oslo.feature.debitcard.shared.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentLinkType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "HELP", "LEARN_MORE", "FAQ", "CARD_HOLDER_AGREEMENT", "VIRTUAL_CARD_HOLDER_AGREEMENT", "PRIVACY_POLICY", "FEE"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class DebitInstrumentLinkType {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkType[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkType CARD_HOLDER_AGREEMENT;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkType FAQ;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkType FEE;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkType HELP;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkType LEARN_MORE;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkType PRIVACY_POLICY;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkType VIRTUAL_CARD_HOLDER_AGREEMENT;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentLinkType$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentLinkType;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkType> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkType.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private DebitInstrumentLinkType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkType debitInstrumentLinkType = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkType("HELP", 0);
        HELP = debitInstrumentLinkType;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkType debitInstrumentLinkType2 = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkType("LEARN_MORE", 1);
        LEARN_MORE = debitInstrumentLinkType2;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkType debitInstrumentLinkType3 = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkType("FAQ", 2);
        FAQ = debitInstrumentLinkType3;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkType debitInstrumentLinkType4 = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkType("CARD_HOLDER_AGREEMENT", 3);
        CARD_HOLDER_AGREEMENT = debitInstrumentLinkType4;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkType debitInstrumentLinkType5 = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkType("VIRTUAL_CARD_HOLDER_AGREEMENT", 4);
        VIRTUAL_CARD_HOLDER_AGREEMENT = debitInstrumentLinkType5;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkType debitInstrumentLinkType6 = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkType("PRIVACY_POLICY", 5);
        PRIVACY_POLICY = debitInstrumentLinkType6;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkType debitInstrumentLinkType7 = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkType("FEE", 6);
        FEE = debitInstrumentLinkType7;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkType[] debitInstrumentLinkTypeArr = {debitInstrumentLinkType, debitInstrumentLinkType2, debitInstrumentLinkType3, debitInstrumentLinkType4, debitInstrumentLinkType5, debitInstrumentLinkType6, debitInstrumentLinkType7};
        $VALUES = debitInstrumentLinkTypeArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(debitInstrumentLinkTypeArr);
        INSTANCE = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkType.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkType$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkType", com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkType.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkType[] values() {
        return (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkType[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkType) java.lang.Enum.valueOf(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkType> getEntries() {
        return $ENTRIES;
    }
}
