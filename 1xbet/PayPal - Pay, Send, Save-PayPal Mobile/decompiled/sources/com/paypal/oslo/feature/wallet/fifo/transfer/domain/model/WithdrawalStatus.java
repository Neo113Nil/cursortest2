package com.paypal.oslo.feature.wallet.fifo.transfer.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawalStatus;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "SUCCESS", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, "PROCESSING", com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED, "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class WithdrawalStatus {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalStatus[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalStatus.Companion INSTANCE;
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalStatus FAILED;
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalStatus PENDING;
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalStatus PROCESSING;
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalStatus SUCCESS;
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalStatus UNKNOWN;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawalStatus$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawalStatus;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalStatus> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalStatus.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private WithdrawalStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalStatus withdrawalStatus = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalStatus("SUCCESS", 0);
        SUCCESS = withdrawalStatus;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalStatus withdrawalStatus2 = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalStatus(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, 1);
        PENDING = withdrawalStatus2;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalStatus withdrawalStatus3 = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalStatus("PROCESSING", 2);
        PROCESSING = withdrawalStatus3;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalStatus withdrawalStatus4 = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalStatus(com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED, 3);
        FAILED = withdrawalStatus4;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalStatus withdrawalStatus5 = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalStatus("UNKNOWN", 4);
        UNKNOWN = withdrawalStatus5;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalStatus[] withdrawalStatusArr = {withdrawalStatus, withdrawalStatus2, withdrawalStatus3, withdrawalStatus4, withdrawalStatus5};
        $VALUES = withdrawalStatusArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(withdrawalStatusArr);
        INSTANCE = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalStatus.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalStatus$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalStatus", com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalStatus.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalStatus[] values() {
        return (com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalStatus[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalStatus> getEntries() {
        return $ENTRIES;
    }
}
