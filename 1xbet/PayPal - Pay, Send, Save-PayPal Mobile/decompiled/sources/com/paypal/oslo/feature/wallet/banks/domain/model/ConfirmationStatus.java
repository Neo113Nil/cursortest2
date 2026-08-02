package com.paypal.oslo.feature.wallet.banks.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/ConfirmationStatus;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "BLOCKED", "CONFIRMED", com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED, "NOT_APPLICABLE", "NOT_SUPPORTED", "UNCONFIRMED", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class ConfirmationStatus {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus BLOCKED;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus CONFIRMED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus.Companion INSTANCE;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus FAILED;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus NOT_APPLICABLE;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus NOT_SUPPORTED;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus UNCONFIRMED;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus UNKNOWN;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/ConfirmationStatus$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/ConfirmationStatus;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private ConfirmationStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus confirmationStatus = new com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus("BLOCKED", 0);
        BLOCKED = confirmationStatus;
        com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus confirmationStatus2 = new com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus("CONFIRMED", 1);
        CONFIRMED = confirmationStatus2;
        com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus confirmationStatus3 = new com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus(com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED, 2);
        FAILED = confirmationStatus3;
        com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus confirmationStatus4 = new com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus("NOT_APPLICABLE", 3);
        NOT_APPLICABLE = confirmationStatus4;
        com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus confirmationStatus5 = new com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus("NOT_SUPPORTED", 4);
        NOT_SUPPORTED = confirmationStatus5;
        com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus confirmationStatus6 = new com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus("UNCONFIRMED", 5);
        UNCONFIRMED = confirmationStatus6;
        com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus confirmationStatus7 = new com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus("UNKNOWN", 6);
        UNKNOWN = confirmationStatus7;
        com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus[] confirmationStatusArr = {confirmationStatus, confirmationStatus2, confirmationStatus3, confirmationStatus4, confirmationStatus5, confirmationStatus6, confirmationStatus7};
        $VALUES = confirmationStatusArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(confirmationStatusArr);
        INSTANCE = new com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus", com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus[] values() {
        return (com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus> getEntries() {
        return $ENTRIES;
    }
}
