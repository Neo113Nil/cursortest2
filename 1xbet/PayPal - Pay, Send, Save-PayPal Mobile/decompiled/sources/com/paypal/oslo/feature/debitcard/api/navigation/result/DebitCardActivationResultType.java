package com.paypal.oslo.feature.debitcard.api.navigation.result;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/api/navigation/result/DebitCardActivationResultType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "SUCCESS", "RELOAD_NEEDED", "DISMISSED"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class DebitCardActivationResultType {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType DISMISSED;
    public static final com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType RELOAD_NEEDED;
    public static final com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType SUCCESS;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/api/navigation/result/DebitCardActivationResultType$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/debitcard/api/navigation/result/DebitCardActivationResultType;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private DebitCardActivationResultType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType debitCardActivationResultType = new com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType("SUCCESS", 0);
        SUCCESS = debitCardActivationResultType;
        com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType debitCardActivationResultType2 = new com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType("RELOAD_NEEDED", 1);
        RELOAD_NEEDED = debitCardActivationResultType2;
        com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType debitCardActivationResultType3 = new com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType("DISMISSED", 2);
        DISMISSED = debitCardActivationResultType3;
        com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType[] debitCardActivationResultTypeArr = {debitCardActivationResultType, debitCardActivationResultType2, debitCardActivationResultType3};
        $VALUES = debitCardActivationResultTypeArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(debitCardActivationResultTypeArr);
        INSTANCE = new com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType", com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType[] values() {
        return (com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType) java.lang.Enum.valueOf(com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType> getEntries() {
        return $ENTRIES;
    }
}
