package com.paypal.oslo.feature.debitcard.shared.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentShipmentStatus;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "NOT_SHIPPED", "ON_THE_WAY", "ARRIVED", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class DebitInstrumentShipmentStatus {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentStatus[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentStatus ARRIVED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentStatus.Companion INSTANCE;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentStatus NOT_SHIPPED;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentStatus ON_THE_WAY;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentStatus UNKNOWN;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentShipmentStatus$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentShipmentStatus;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentStatus> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentStatus.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private DebitInstrumentShipmentStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentStatus debitInstrumentShipmentStatus = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentStatus("NOT_SHIPPED", 0);
        NOT_SHIPPED = debitInstrumentShipmentStatus;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentStatus debitInstrumentShipmentStatus2 = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentStatus("ON_THE_WAY", 1);
        ON_THE_WAY = debitInstrumentShipmentStatus2;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentStatus debitInstrumentShipmentStatus3 = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentStatus("ARRIVED", 2);
        ARRIVED = debitInstrumentShipmentStatus3;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentStatus debitInstrumentShipmentStatus4 = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentStatus("UNKNOWN", 3);
        UNKNOWN = debitInstrumentShipmentStatus4;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentStatus[] debitInstrumentShipmentStatusArr = {debitInstrumentShipmentStatus, debitInstrumentShipmentStatus2, debitInstrumentShipmentStatus3, debitInstrumentShipmentStatus4};
        $VALUES = debitInstrumentShipmentStatusArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(debitInstrumentShipmentStatusArr);
        INSTANCE = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentStatus.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentStatus$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentStatus", com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentStatus.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentStatus[] values() {
        return (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentStatus[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentStatus> getEntries() {
        return $ENTRIES;
    }
}
