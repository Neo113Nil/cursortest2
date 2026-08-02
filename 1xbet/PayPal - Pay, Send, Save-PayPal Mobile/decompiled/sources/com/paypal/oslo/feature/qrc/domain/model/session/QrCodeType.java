package com.paypal.oslo.feature.qrc.domain.model.session;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0081\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/session/QrCodeType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "PAYPAL", "VENMO", "UNION_PAY_INTERNATIONAL", "PAYPAL_WORLD"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class QrCodeType {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType PAYPAL;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType PAYPAL_WORLD;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType UNION_PAY_INTERNATIONAL;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType VENMO;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/session/QrCodeType$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrCodeType;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private QrCodeType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType qrCodeType = new com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType("PAYPAL", 0);
        PAYPAL = qrCodeType;
        com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType qrCodeType2 = new com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType("VENMO", 1);
        VENMO = qrCodeType2;
        com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType qrCodeType3 = new com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType("UNION_PAY_INTERNATIONAL", 2);
        UNION_PAY_INTERNATIONAL = qrCodeType3;
        com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType qrCodeType4 = new com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType("PAYPAL_WORLD", 3);
        PAYPAL_WORLD = qrCodeType4;
        com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType[] qrCodeTypeArr = {qrCodeType, qrCodeType2, qrCodeType3, qrCodeType4};
        $VALUES = qrCodeTypeArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(qrCodeTypeArr);
        INSTANCE = new com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType", com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType[] values() {
        return (com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType) java.lang.Enum.valueOf(com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType> getEntries() {
        return $ENTRIES;
    }
}
