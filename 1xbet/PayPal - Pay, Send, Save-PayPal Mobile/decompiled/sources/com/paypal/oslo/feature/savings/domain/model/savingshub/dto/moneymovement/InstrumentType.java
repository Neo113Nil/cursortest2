package com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0081\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/InstrumentType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "CARD", "BANK", "PAYPAL_BALANCE"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class InstrumentType {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;

    @kotlinx.serialization.SerialName("BANK")
    public static final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType BANK;

    @kotlinx.serialization.SerialName("CARD")
    public static final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType CARD;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType.Companion INSTANCE;

    @kotlinx.serialization.SerialName("PAYPAL_BALANCE")
    public static final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType PAYPAL_BALANCE;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/InstrumentType$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/InstrumentType;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private InstrumentType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType instrumentType = new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType("CARD", 0);
        CARD = instrumentType;
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType instrumentType2 = new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType("BANK", 1);
        BANK = instrumentType2;
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType instrumentType3 = new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType("PAYPAL_BALANCE", 2);
        PAYPAL_BALANCE = instrumentType3;
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType[] instrumentTypeArr = {instrumentType, instrumentType2, instrumentType3};
        $VALUES = instrumentTypeArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(instrumentTypeArr);
        INSTANCE = new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createAnnotatedEnumSerializer;
                createAnnotatedEnumSerializer = kotlinx.serialization.internal.EnumsKt.createAnnotatedEnumSerializer("com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType", com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType.values(), new java.lang.String[]{"CARD", "BANK", "PAYPAL_BALANCE"}, new java.lang.annotation.Annotation[][]{null, null, null}, null);
                return createAnnotatedEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType[] values() {
        return (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType) java.lang.Enum.valueOf(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType> getEntries() {
        return $ENTRIES;
    }
}
