package com.paypal.oslo.feature.verificationcapture.api.models;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/api/models/SessionStatus;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", com.payair.model.TokenStatusKt.TOKEN_ACTIVE, "COMPLETED", "EXPIRED", com.paypal.oslo.downloads.impl.DownloadStateValue.CANCELLED, "ERROR"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class SessionStatus {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.verificationcapture.api.models.SessionStatus[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;
    public static final com.paypal.oslo.feature.verificationcapture.api.models.SessionStatus ACTIVE;
    public static final com.paypal.oslo.feature.verificationcapture.api.models.SessionStatus CANCELLED;
    public static final com.paypal.oslo.feature.verificationcapture.api.models.SessionStatus COMPLETED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.verificationcapture.api.models.SessionStatus.Companion INSTANCE;
    public static final com.paypal.oslo.feature.verificationcapture.api.models.SessionStatus ERROR;
    public static final com.paypal.oslo.feature.verificationcapture.api.models.SessionStatus EXPIRED;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/api/models/SessionStatus$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/verificationcapture/api/models/SessionStatus;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.verificationcapture.api.models.SessionStatus> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.verificationcapture.api.models.SessionStatus.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private SessionStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.verificationcapture.api.models.SessionStatus sessionStatus = new com.paypal.oslo.feature.verificationcapture.api.models.SessionStatus(com.payair.model.TokenStatusKt.TOKEN_ACTIVE, 0);
        ACTIVE = sessionStatus;
        com.paypal.oslo.feature.verificationcapture.api.models.SessionStatus sessionStatus2 = new com.paypal.oslo.feature.verificationcapture.api.models.SessionStatus("COMPLETED", 1);
        COMPLETED = sessionStatus2;
        com.paypal.oslo.feature.verificationcapture.api.models.SessionStatus sessionStatus3 = new com.paypal.oslo.feature.verificationcapture.api.models.SessionStatus("EXPIRED", 2);
        EXPIRED = sessionStatus3;
        com.paypal.oslo.feature.verificationcapture.api.models.SessionStatus sessionStatus4 = new com.paypal.oslo.feature.verificationcapture.api.models.SessionStatus(com.paypal.oslo.downloads.impl.DownloadStateValue.CANCELLED, 3);
        CANCELLED = sessionStatus4;
        com.paypal.oslo.feature.verificationcapture.api.models.SessionStatus sessionStatus5 = new com.paypal.oslo.feature.verificationcapture.api.models.SessionStatus("ERROR", 4);
        ERROR = sessionStatus5;
        com.paypal.oslo.feature.verificationcapture.api.models.SessionStatus[] sessionStatusArr = {sessionStatus, sessionStatus2, sessionStatus3, sessionStatus4, sessionStatus5};
        $VALUES = sessionStatusArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(sessionStatusArr);
        INSTANCE = new com.paypal.oslo.feature.verificationcapture.api.models.SessionStatus.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.verificationcapture.api.models.SessionStatus$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.verificationcapture.api.models.SessionStatus", com.paypal.oslo.feature.verificationcapture.api.models.SessionStatus.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.verificationcapture.api.models.SessionStatus[] values() {
        return (com.paypal.oslo.feature.verificationcapture.api.models.SessionStatus[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.verificationcapture.api.models.SessionStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.verificationcapture.api.models.SessionStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.verificationcapture.api.models.SessionStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.verificationcapture.api.models.SessionStatus> getEntries() {
        return $ENTRIES;
    }
}
