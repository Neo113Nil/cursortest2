package com.paypal.oslo.feature.wallet.api.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/domain/model/AddFIFlowType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "ADD_FI", "ADD_BANK", "ADD_CARD"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class AddFIFlowType {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;
    public static final com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType ADD_BANK;
    public static final com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType ADD_CARD;
    public static final com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType ADD_FI;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType.Companion INSTANCE;

    private AddFIFlowType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType addFIFlowType = new com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType("ADD_FI", 0);
        ADD_FI = addFIFlowType;
        com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType addFIFlowType2 = new com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType("ADD_BANK", 1);
        ADD_BANK = addFIFlowType2;
        com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType addFIFlowType3 = new com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType("ADD_CARD", 2);
        ADD_CARD = addFIFlowType3;
        com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType[] addFIFlowTypeArr = {addFIFlowType, addFIFlowType2, addFIFlowType3};
        $VALUES = addFIFlowTypeArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(addFIFlowTypeArr);
        INSTANCE = new com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType", com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/domain/model/AddFIFlowType$Companion;", "", "<init>", "()V", "", "canAddBank", "canAddCard", "Lcom/paypal/oslo/feature/wallet/api/domain/model/AddFIFlowType;", "from", "(ZZ)Lcom/paypal/oslo/feature/wallet/api/domain/model/AddFIFlowType;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType from(boolean canAddBank, boolean canAddCard) {
            if (canAddBank && !canAddCard) {
                return com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType.ADD_BANK;
            }
            if (canAddCard && !canAddBank) {
                return com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType.ADD_CARD;
            }
            return com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType.ADD_FI;
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType[] values() {
        return (com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType> getEntries() {
        return $ENTRIES;
    }
}
