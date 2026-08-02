package com.paypal.oslo.feature.savings.domain.model.transfers;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0081\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencyType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "ONE_TIME", "WEEKLY", "EVERY_2_WEEKS", "EVERY_MONTH"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class FrequencyType {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType EVERY_2_WEEKS;
    public static final com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType EVERY_MONTH;
    public static final com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType ONE_TIME;
    public static final com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType WEEKLY;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencyType$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencyType;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private FrequencyType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType = new com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType("ONE_TIME", 0);
        ONE_TIME = frequencyType;
        com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType2 = new com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType("WEEKLY", 1);
        WEEKLY = frequencyType2;
        com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType3 = new com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType("EVERY_2_WEEKS", 2);
        EVERY_2_WEEKS = frequencyType3;
        com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType4 = new com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType("EVERY_MONTH", 3);
        EVERY_MONTH = frequencyType4;
        com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType[] frequencyTypeArr = {frequencyType, frequencyType2, frequencyType3, frequencyType4};
        $VALUES = frequencyTypeArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(frequencyTypeArr);
        INSTANCE = new com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType", com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType[] values() {
        return (com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType) java.lang.Enum.valueOf(com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType> getEntries() {
        return $ENTRIES;
    }
}
