package com.paypal.oslo.feature.wallet.banks.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/RealTimePaymentsDepositStatus;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "SUCCESS", "ACCEPTED", "REQUESTED", "ERROR", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.DECLINE, "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class RealTimePaymentsDepositStatus {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.RealTimePaymentsDepositStatus[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.RealTimePaymentsDepositStatus ACCEPTED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.RealTimePaymentsDepositStatus.Companion INSTANCE;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.RealTimePaymentsDepositStatus DECLINE;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.RealTimePaymentsDepositStatus ERROR;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.RealTimePaymentsDepositStatus REQUESTED;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.RealTimePaymentsDepositStatus SUCCESS;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.RealTimePaymentsDepositStatus UNKNOWN;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/RealTimePaymentsDepositStatus$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/RealTimePaymentsDepositStatus;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.banks.domain.model.RealTimePaymentsDepositStatus> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.wallet.banks.domain.model.RealTimePaymentsDepositStatus.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private RealTimePaymentsDepositStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.wallet.banks.domain.model.RealTimePaymentsDepositStatus realTimePaymentsDepositStatus = new com.paypal.oslo.feature.wallet.banks.domain.model.RealTimePaymentsDepositStatus("SUCCESS", 0);
        SUCCESS = realTimePaymentsDepositStatus;
        com.paypal.oslo.feature.wallet.banks.domain.model.RealTimePaymentsDepositStatus realTimePaymentsDepositStatus2 = new com.paypal.oslo.feature.wallet.banks.domain.model.RealTimePaymentsDepositStatus("ACCEPTED", 1);
        ACCEPTED = realTimePaymentsDepositStatus2;
        com.paypal.oslo.feature.wallet.banks.domain.model.RealTimePaymentsDepositStatus realTimePaymentsDepositStatus3 = new com.paypal.oslo.feature.wallet.banks.domain.model.RealTimePaymentsDepositStatus("REQUESTED", 2);
        REQUESTED = realTimePaymentsDepositStatus3;
        com.paypal.oslo.feature.wallet.banks.domain.model.RealTimePaymentsDepositStatus realTimePaymentsDepositStatus4 = new com.paypal.oslo.feature.wallet.banks.domain.model.RealTimePaymentsDepositStatus("ERROR", 3);
        ERROR = realTimePaymentsDepositStatus4;
        com.paypal.oslo.feature.wallet.banks.domain.model.RealTimePaymentsDepositStatus realTimePaymentsDepositStatus5 = new com.paypal.oslo.feature.wallet.banks.domain.model.RealTimePaymentsDepositStatus(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.DECLINE, 4);
        DECLINE = realTimePaymentsDepositStatus5;
        com.paypal.oslo.feature.wallet.banks.domain.model.RealTimePaymentsDepositStatus realTimePaymentsDepositStatus6 = new com.paypal.oslo.feature.wallet.banks.domain.model.RealTimePaymentsDepositStatus("UNKNOWN", 5);
        UNKNOWN = realTimePaymentsDepositStatus6;
        com.paypal.oslo.feature.wallet.banks.domain.model.RealTimePaymentsDepositStatus[] realTimePaymentsDepositStatusArr = {realTimePaymentsDepositStatus, realTimePaymentsDepositStatus2, realTimePaymentsDepositStatus3, realTimePaymentsDepositStatus4, realTimePaymentsDepositStatus5, realTimePaymentsDepositStatus6};
        $VALUES = realTimePaymentsDepositStatusArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(realTimePaymentsDepositStatusArr);
        INSTANCE = new com.paypal.oslo.feature.wallet.banks.domain.model.RealTimePaymentsDepositStatus.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.domain.model.RealTimePaymentsDepositStatus$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.wallet.banks.domain.model.RealTimePaymentsDepositStatus", com.paypal.oslo.feature.wallet.banks.domain.model.RealTimePaymentsDepositStatus.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.model.RealTimePaymentsDepositStatus[] values() {
        return (com.paypal.oslo.feature.wallet.banks.domain.model.RealTimePaymentsDepositStatus[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.model.RealTimePaymentsDepositStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.banks.domain.model.RealTimePaymentsDepositStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.banks.domain.model.RealTimePaymentsDepositStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.banks.domain.model.RealTimePaymentsDepositStatus> getEntries() {
        return $ENTRIES;
    }
}
