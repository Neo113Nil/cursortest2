package com.paypal.oslo.feature.qrc.domain.model.session;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0081\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/session/PaymentStatus;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "SUCCESS", "DECLINED", "CONTINGENCY", "PROCESSING", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class PaymentStatus {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.qrc.domain.model.session.PaymentStatus[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.PaymentStatus CONTINGENCY;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.qrc.domain.model.session.PaymentStatus.Companion INSTANCE;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.PaymentStatus DECLINED;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.PaymentStatus PENDING;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.PaymentStatus PROCESSING;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.PaymentStatus SUCCESS;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/session/PaymentStatus$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/PaymentStatus;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.qrc.domain.model.session.PaymentStatus> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.qrc.domain.model.session.PaymentStatus.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private PaymentStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.qrc.domain.model.session.PaymentStatus paymentStatus = new com.paypal.oslo.feature.qrc.domain.model.session.PaymentStatus("SUCCESS", 0);
        SUCCESS = paymentStatus;
        com.paypal.oslo.feature.qrc.domain.model.session.PaymentStatus paymentStatus2 = new com.paypal.oslo.feature.qrc.domain.model.session.PaymentStatus("DECLINED", 1);
        DECLINED = paymentStatus2;
        com.paypal.oslo.feature.qrc.domain.model.session.PaymentStatus paymentStatus3 = new com.paypal.oslo.feature.qrc.domain.model.session.PaymentStatus("CONTINGENCY", 2);
        CONTINGENCY = paymentStatus3;
        com.paypal.oslo.feature.qrc.domain.model.session.PaymentStatus paymentStatus4 = new com.paypal.oslo.feature.qrc.domain.model.session.PaymentStatus("PROCESSING", 3);
        PROCESSING = paymentStatus4;
        com.paypal.oslo.feature.qrc.domain.model.session.PaymentStatus paymentStatus5 = new com.paypal.oslo.feature.qrc.domain.model.session.PaymentStatus(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, 4);
        PENDING = paymentStatus5;
        com.paypal.oslo.feature.qrc.domain.model.session.PaymentStatus[] paymentStatusArr = {paymentStatus, paymentStatus2, paymentStatus3, paymentStatus4, paymentStatus5};
        $VALUES = paymentStatusArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(paymentStatusArr);
        INSTANCE = new com.paypal.oslo.feature.qrc.domain.model.session.PaymentStatus.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.domain.model.session.PaymentStatus$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.qrc.domain.model.session.PaymentStatus", com.paypal.oslo.feature.qrc.domain.model.session.PaymentStatus.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.qrc.domain.model.session.PaymentStatus[] values() {
        return (com.paypal.oslo.feature.qrc.domain.model.session.PaymentStatus[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.qrc.domain.model.session.PaymentStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.qrc.domain.model.session.PaymentStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.qrc.domain.model.session.PaymentStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.qrc.domain.model.session.PaymentStatus> getEntries() {
        return $ENTRIES;
    }
}
