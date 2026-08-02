package com.paypal.oslo.feature.verificationcapture.api.models;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/api/models/VerificationStatus;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, "VERIFIED", com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED, "MANUAL_REVIEW", "REJECTED"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class VerificationStatus {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.verificationcapture.api.models.VerificationStatus[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.verificationcapture.api.models.VerificationStatus.Companion INSTANCE;
    public static final com.paypal.oslo.feature.verificationcapture.api.models.VerificationStatus FAILED;
    public static final com.paypal.oslo.feature.verificationcapture.api.models.VerificationStatus MANUAL_REVIEW;
    public static final com.paypal.oslo.feature.verificationcapture.api.models.VerificationStatus PENDING;
    public static final com.paypal.oslo.feature.verificationcapture.api.models.VerificationStatus REJECTED;
    public static final com.paypal.oslo.feature.verificationcapture.api.models.VerificationStatus VERIFIED;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/api/models/VerificationStatus$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/verificationcapture/api/models/VerificationStatus;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.verificationcapture.api.models.VerificationStatus> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.verificationcapture.api.models.VerificationStatus.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private VerificationStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.verificationcapture.api.models.VerificationStatus verificationStatus = new com.paypal.oslo.feature.verificationcapture.api.models.VerificationStatus(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, 0);
        PENDING = verificationStatus;
        com.paypal.oslo.feature.verificationcapture.api.models.VerificationStatus verificationStatus2 = new com.paypal.oslo.feature.verificationcapture.api.models.VerificationStatus("VERIFIED", 1);
        VERIFIED = verificationStatus2;
        com.paypal.oslo.feature.verificationcapture.api.models.VerificationStatus verificationStatus3 = new com.paypal.oslo.feature.verificationcapture.api.models.VerificationStatus(com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED, 2);
        FAILED = verificationStatus3;
        com.paypal.oslo.feature.verificationcapture.api.models.VerificationStatus verificationStatus4 = new com.paypal.oslo.feature.verificationcapture.api.models.VerificationStatus("MANUAL_REVIEW", 3);
        MANUAL_REVIEW = verificationStatus4;
        com.paypal.oslo.feature.verificationcapture.api.models.VerificationStatus verificationStatus5 = new com.paypal.oslo.feature.verificationcapture.api.models.VerificationStatus("REJECTED", 4);
        REJECTED = verificationStatus5;
        com.paypal.oslo.feature.verificationcapture.api.models.VerificationStatus[] verificationStatusArr = {verificationStatus, verificationStatus2, verificationStatus3, verificationStatus4, verificationStatus5};
        $VALUES = verificationStatusArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(verificationStatusArr);
        INSTANCE = new com.paypal.oslo.feature.verificationcapture.api.models.VerificationStatus.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.verificationcapture.api.models.VerificationStatus$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.verificationcapture.api.models.VerificationStatus", com.paypal.oslo.feature.verificationcapture.api.models.VerificationStatus.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.verificationcapture.api.models.VerificationStatus[] values() {
        return (com.paypal.oslo.feature.verificationcapture.api.models.VerificationStatus[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.verificationcapture.api.models.VerificationStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.verificationcapture.api.models.VerificationStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.verificationcapture.api.models.VerificationStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.verificationcapture.api.models.VerificationStatus> getEntries() {
        return $ENTRIES;
    }
}
