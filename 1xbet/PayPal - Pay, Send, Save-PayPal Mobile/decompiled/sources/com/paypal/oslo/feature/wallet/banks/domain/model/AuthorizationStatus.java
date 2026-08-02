package com.paypal.oslo.feature.wallet.banks.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/AuthorizationStatus;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "AUTHORIZED", "BLOCKED", com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED, "NOT_APPLICABLE", "NOT_SUPPORTED", com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.UNAUTHORIZED, "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class AuthorizationStatus {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationStatus[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationStatus AUTHORIZED;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationStatus BLOCKED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationStatus.Companion INSTANCE;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationStatus FAILED;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationStatus NOT_APPLICABLE;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationStatus NOT_SUPPORTED;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationStatus UNAUTHORIZED;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationStatus UNKNOWN;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/AuthorizationStatus$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/AuthorizationStatus;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationStatus> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationStatus.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private AuthorizationStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationStatus authorizationStatus = new com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationStatus("AUTHORIZED", 0);
        AUTHORIZED = authorizationStatus;
        com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationStatus authorizationStatus2 = new com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationStatus("BLOCKED", 1);
        BLOCKED = authorizationStatus2;
        com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationStatus authorizationStatus3 = new com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationStatus(com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED, 2);
        FAILED = authorizationStatus3;
        com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationStatus authorizationStatus4 = new com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationStatus("NOT_APPLICABLE", 3);
        NOT_APPLICABLE = authorizationStatus4;
        com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationStatus authorizationStatus5 = new com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationStatus("NOT_SUPPORTED", 4);
        NOT_SUPPORTED = authorizationStatus5;
        com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationStatus authorizationStatus6 = new com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationStatus(com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.UNAUTHORIZED, 5);
        UNAUTHORIZED = authorizationStatus6;
        com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationStatus authorizationStatus7 = new com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationStatus("UNKNOWN", 6);
        UNKNOWN = authorizationStatus7;
        com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationStatus[] authorizationStatusArr = {authorizationStatus, authorizationStatus2, authorizationStatus3, authorizationStatus4, authorizationStatus5, authorizationStatus6, authorizationStatus7};
        $VALUES = authorizationStatusArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(authorizationStatusArr);
        INSTANCE = new com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationStatus.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationStatus$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationStatus", com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationStatus.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationStatus[] values() {
        return (com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationStatus[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationStatus> getEntries() {
        return $ENTRIES;
    }
}
