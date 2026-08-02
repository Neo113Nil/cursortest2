package com.paypal.oslo.feature.wallet.banks.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/StatusValue;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", com.payair.model.TokenStatusKt.TOKEN_ACTIVE, "BLOCKED", "CLOSED", com.payair.model.TokenStatusKt.TOKEN_INACTIVE, "ON_HOLD", "NOT_CREATED", "REMOVED", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class StatusValue {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.StatusValue[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.StatusValue ACTIVE;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.StatusValue BLOCKED;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.StatusValue CLOSED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.StatusValue.Companion INSTANCE;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.StatusValue INACTIVE;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.StatusValue NOT_CREATED;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.StatusValue ON_HOLD;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.StatusValue REMOVED;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.StatusValue UNKNOWN;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/StatusValue$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/StatusValue;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.banks.domain.model.StatusValue> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.wallet.banks.domain.model.StatusValue.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private StatusValue(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.wallet.banks.domain.model.StatusValue statusValue = new com.paypal.oslo.feature.wallet.banks.domain.model.StatusValue(com.payair.model.TokenStatusKt.TOKEN_ACTIVE, 0);
        ACTIVE = statusValue;
        com.paypal.oslo.feature.wallet.banks.domain.model.StatusValue statusValue2 = new com.paypal.oslo.feature.wallet.banks.domain.model.StatusValue("BLOCKED", 1);
        BLOCKED = statusValue2;
        com.paypal.oslo.feature.wallet.banks.domain.model.StatusValue statusValue3 = new com.paypal.oslo.feature.wallet.banks.domain.model.StatusValue("CLOSED", 2);
        CLOSED = statusValue3;
        com.paypal.oslo.feature.wallet.banks.domain.model.StatusValue statusValue4 = new com.paypal.oslo.feature.wallet.banks.domain.model.StatusValue(com.payair.model.TokenStatusKt.TOKEN_INACTIVE, 3);
        INACTIVE = statusValue4;
        com.paypal.oslo.feature.wallet.banks.domain.model.StatusValue statusValue5 = new com.paypal.oslo.feature.wallet.banks.domain.model.StatusValue("ON_HOLD", 4);
        ON_HOLD = statusValue5;
        com.paypal.oslo.feature.wallet.banks.domain.model.StatusValue statusValue6 = new com.paypal.oslo.feature.wallet.banks.domain.model.StatusValue("NOT_CREATED", 5);
        NOT_CREATED = statusValue6;
        com.paypal.oslo.feature.wallet.banks.domain.model.StatusValue statusValue7 = new com.paypal.oslo.feature.wallet.banks.domain.model.StatusValue("REMOVED", 6);
        REMOVED = statusValue7;
        com.paypal.oslo.feature.wallet.banks.domain.model.StatusValue statusValue8 = new com.paypal.oslo.feature.wallet.banks.domain.model.StatusValue("UNKNOWN", 7);
        UNKNOWN = statusValue8;
        com.paypal.oslo.feature.wallet.banks.domain.model.StatusValue[] statusValueArr = {statusValue, statusValue2, statusValue3, statusValue4, statusValue5, statusValue6, statusValue7, statusValue8};
        $VALUES = statusValueArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(statusValueArr);
        INSTANCE = new com.paypal.oslo.feature.wallet.banks.domain.model.StatusValue.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.domain.model.StatusValue$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.wallet.banks.domain.model.StatusValue", com.paypal.oslo.feature.wallet.banks.domain.model.StatusValue.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.model.StatusValue[] values() {
        return (com.paypal.oslo.feature.wallet.banks.domain.model.StatusValue[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.model.StatusValue valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.banks.domain.model.StatusValue) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.banks.domain.model.StatusValue.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.banks.domain.model.StatusValue> getEntries() {
        return $ENTRIES;
    }
}
