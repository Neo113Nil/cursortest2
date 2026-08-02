package com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0081\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/PushToWalletErrorType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "GENERIC", "CARD"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class PushToWalletErrorType {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PushToWalletErrorType[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PushToWalletErrorType CARD;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PushToWalletErrorType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PushToWalletErrorType GENERIC;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/PushToWalletErrorType$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/PushToWalletErrorType;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PushToWalletErrorType> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PushToWalletErrorType.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private PushToWalletErrorType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PushToWalletErrorType pushToWalletErrorType = new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PushToWalletErrorType("GENERIC", 0);
        GENERIC = pushToWalletErrorType;
        com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PushToWalletErrorType pushToWalletErrorType2 = new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PushToWalletErrorType("CARD", 1);
        CARD = pushToWalletErrorType2;
        com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PushToWalletErrorType[] pushToWalletErrorTypeArr = {pushToWalletErrorType, pushToWalletErrorType2};
        $VALUES = pushToWalletErrorTypeArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(pushToWalletErrorTypeArr);
        INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PushToWalletErrorType.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PushToWalletErrorType$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PushToWalletErrorType", com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PushToWalletErrorType.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PushToWalletErrorType[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PushToWalletErrorType[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PushToWalletErrorType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PushToWalletErrorType) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PushToWalletErrorType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PushToWalletErrorType> getEntries() {
        return $ENTRIES;
    }
}
