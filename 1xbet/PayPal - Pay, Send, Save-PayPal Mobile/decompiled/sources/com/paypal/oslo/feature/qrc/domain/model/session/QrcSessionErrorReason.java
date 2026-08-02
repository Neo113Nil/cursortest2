package com.paypal.oslo.feature.qrc.domain.model.session;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0081\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionErrorReason;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "INVALID_QR_CODE", com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError.CODE_SESSION_EXPIRED, "UNSUPPORTED_QR_TYPE", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes14.dex */
public final class QrcSessionErrorReason {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorReason[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorReason.Companion INSTANCE;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorReason INVALID_QR_CODE;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorReason SESSION_EXPIRED;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorReason UNKNOWN;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorReason UNSUPPORTED_QR_TYPE;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionErrorReason$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionErrorReason;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorReason> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorReason.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private QrcSessionErrorReason(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorReason qrcSessionErrorReason = new com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorReason("INVALID_QR_CODE", 0);
        INVALID_QR_CODE = qrcSessionErrorReason;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorReason qrcSessionErrorReason2 = new com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorReason(com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError.CODE_SESSION_EXPIRED, 1);
        SESSION_EXPIRED = qrcSessionErrorReason2;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorReason qrcSessionErrorReason3 = new com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorReason("UNSUPPORTED_QR_TYPE", 2);
        UNSUPPORTED_QR_TYPE = qrcSessionErrorReason3;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorReason qrcSessionErrorReason4 = new com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorReason("UNKNOWN", 3);
        UNKNOWN = qrcSessionErrorReason4;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorReason[] qrcSessionErrorReasonArr = {qrcSessionErrorReason, qrcSessionErrorReason2, qrcSessionErrorReason3, qrcSessionErrorReason4};
        $VALUES = qrcSessionErrorReasonArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(qrcSessionErrorReasonArr);
        INSTANCE = new com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorReason.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorReason$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorReason", com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorReason.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorReason[] values() {
        return (com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorReason[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorReason valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorReason) java.lang.Enum.valueOf(com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorReason.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorReason> getEntries() {
        return $ENTRIES;
    }
}
