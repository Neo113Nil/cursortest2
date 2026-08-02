package com.paypal.oslo.feature.savings.domain.model.savingshub.dto;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0081\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/DestinationTypeEnum;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "GOAL", "PAYPAL_BALANCE", "BANK", "DEBIT_CARD", "CREDIT_CARD"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class DestinationTypeEnum {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DestinationTypeEnum[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;
    public static final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DestinationTypeEnum BANK;
    public static final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DestinationTypeEnum CREDIT_CARD;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DestinationTypeEnum.Companion INSTANCE;
    public static final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DestinationTypeEnum DEBIT_CARD;
    public static final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DestinationTypeEnum GOAL;
    public static final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DestinationTypeEnum PAYPAL_BALANCE;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/DestinationTypeEnum$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/DestinationTypeEnum;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DestinationTypeEnum> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DestinationTypeEnum.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private DestinationTypeEnum(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DestinationTypeEnum destinationTypeEnum = new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DestinationTypeEnum("GOAL", 0);
        GOAL = destinationTypeEnum;
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DestinationTypeEnum destinationTypeEnum2 = new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DestinationTypeEnum("PAYPAL_BALANCE", 1);
        PAYPAL_BALANCE = destinationTypeEnum2;
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DestinationTypeEnum destinationTypeEnum3 = new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DestinationTypeEnum("BANK", 2);
        BANK = destinationTypeEnum3;
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DestinationTypeEnum destinationTypeEnum4 = new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DestinationTypeEnum("DEBIT_CARD", 3);
        DEBIT_CARD = destinationTypeEnum4;
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DestinationTypeEnum destinationTypeEnum5 = new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DestinationTypeEnum("CREDIT_CARD", 4);
        CREDIT_CARD = destinationTypeEnum5;
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DestinationTypeEnum[] destinationTypeEnumArr = {destinationTypeEnum, destinationTypeEnum2, destinationTypeEnum3, destinationTypeEnum4, destinationTypeEnum5};
        $VALUES = destinationTypeEnumArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(destinationTypeEnumArr);
        INSTANCE = new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DestinationTypeEnum.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DestinationTypeEnum$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DestinationTypeEnum", com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DestinationTypeEnum.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DestinationTypeEnum[] values() {
        return (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DestinationTypeEnum[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DestinationTypeEnum valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DestinationTypeEnum) java.lang.Enum.valueOf(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DestinationTypeEnum.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DestinationTypeEnum> getEntries() {
        return $ENTRIES;
    }
}
