package com.paypal.oslo.feature.debitcard.shared.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentDisplayState;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", com.payair.model.TokenStatusKt.TOKEN_ACTIVE, com.payair.model.TokenStatusKt.TOKEN_DEACTIVATED, "ORDERED", "SHIPPED", "ACTIVATE", "LOCKED", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class DebitInstrumentDisplayState {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState ACTIVATE;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState ACTIVE;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState.Companion INSTANCE;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState DEACTIVATED;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState LOCKED;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState ORDERED;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState SHIPPED;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState UNKNOWN;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentDisplayState$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentDisplayState;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private DebitInstrumentDisplayState(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState debitInstrumentDisplayState = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState(com.payair.model.TokenStatusKt.TOKEN_ACTIVE, 0);
        ACTIVE = debitInstrumentDisplayState;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState debitInstrumentDisplayState2 = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState(com.payair.model.TokenStatusKt.TOKEN_DEACTIVATED, 1);
        DEACTIVATED = debitInstrumentDisplayState2;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState debitInstrumentDisplayState3 = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState("ORDERED", 2);
        ORDERED = debitInstrumentDisplayState3;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState debitInstrumentDisplayState4 = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState("SHIPPED", 3);
        SHIPPED = debitInstrumentDisplayState4;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState debitInstrumentDisplayState5 = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState("ACTIVATE", 4);
        ACTIVATE = debitInstrumentDisplayState5;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState debitInstrumentDisplayState6 = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState("LOCKED", 5);
        LOCKED = debitInstrumentDisplayState6;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState debitInstrumentDisplayState7 = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState("UNKNOWN", 6);
        UNKNOWN = debitInstrumentDisplayState7;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState[] debitInstrumentDisplayStateArr = {debitInstrumentDisplayState, debitInstrumentDisplayState2, debitInstrumentDisplayState3, debitInstrumentDisplayState4, debitInstrumentDisplayState5, debitInstrumentDisplayState6, debitInstrumentDisplayState7};
        $VALUES = debitInstrumentDisplayStateArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(debitInstrumentDisplayStateArr);
        INSTANCE = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState", com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState[] values() {
        return (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState) java.lang.Enum.valueOf(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState> getEntries() {
        return $ENTRIES;
    }
}
