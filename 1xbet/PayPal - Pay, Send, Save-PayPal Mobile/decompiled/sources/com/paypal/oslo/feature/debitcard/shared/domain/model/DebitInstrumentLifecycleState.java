package com.paypal.oslo.feature.debitcard.shared.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentLifecycleState;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", com.payair.model.TokenStatusKt.TOKEN_ACTIVE, "CLOSED", "PENDING_ACTIVE", com.payair.model.TokenStatusKt.TOKEN_DEACTIVATED, "REISSUED", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class DebitInstrumentLifecycleState {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState ACTIVE;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState CLOSED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState.Companion INSTANCE;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState DEACTIVATED;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState PENDING_ACTIVE;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState REISSUED;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState UNKNOWN;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentLifecycleState$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentLifecycleState;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private DebitInstrumentLifecycleState(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState debitInstrumentLifecycleState = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState(com.payair.model.TokenStatusKt.TOKEN_ACTIVE, 0);
        ACTIVE = debitInstrumentLifecycleState;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState debitInstrumentLifecycleState2 = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState("CLOSED", 1);
        CLOSED = debitInstrumentLifecycleState2;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState debitInstrumentLifecycleState3 = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState("PENDING_ACTIVE", 2);
        PENDING_ACTIVE = debitInstrumentLifecycleState3;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState debitInstrumentLifecycleState4 = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState(com.payair.model.TokenStatusKt.TOKEN_DEACTIVATED, 3);
        DEACTIVATED = debitInstrumentLifecycleState4;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState debitInstrumentLifecycleState5 = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState("REISSUED", 4);
        REISSUED = debitInstrumentLifecycleState5;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState debitInstrumentLifecycleState6 = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState("UNKNOWN", 5);
        UNKNOWN = debitInstrumentLifecycleState6;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState[] debitInstrumentLifecycleStateArr = {debitInstrumentLifecycleState, debitInstrumentLifecycleState2, debitInstrumentLifecycleState3, debitInstrumentLifecycleState4, debitInstrumentLifecycleState5, debitInstrumentLifecycleState6};
        $VALUES = debitInstrumentLifecycleStateArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(debitInstrumentLifecycleStateArr);
        INSTANCE = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState", com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState[] values() {
        return (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState) java.lang.Enum.valueOf(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState> getEntries() {
        return $ENTRIES;
    }
}
