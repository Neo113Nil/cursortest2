package com.paypal.oslo.feature.qrc.domain.model.session;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0081\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcMode;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "CONSUMER_PRESENTED", "MERCHANT_PRESENTED", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class QrcMode {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.qrc.domain.model.session.QrcMode[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.QrcMode CONSUMER_PRESENTED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.qrc.domain.model.session.QrcMode.Companion INSTANCE;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.QrcMode MERCHANT_PRESENTED;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.QrcMode UNKNOWN;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcMode$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcMode;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.qrc.domain.model.session.QrcMode> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.qrc.domain.model.session.QrcMode.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private QrcMode(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMode qrcMode = new com.paypal.oslo.feature.qrc.domain.model.session.QrcMode("CONSUMER_PRESENTED", 0);
        CONSUMER_PRESENTED = qrcMode;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMode qrcMode2 = new com.paypal.oslo.feature.qrc.domain.model.session.QrcMode("MERCHANT_PRESENTED", 1);
        MERCHANT_PRESENTED = qrcMode2;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMode qrcMode3 = new com.paypal.oslo.feature.qrc.domain.model.session.QrcMode("UNKNOWN", 2);
        UNKNOWN = qrcMode3;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMode[] qrcModeArr = {qrcMode, qrcMode2, qrcMode3};
        $VALUES = qrcModeArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(qrcModeArr);
        INSTANCE = new com.paypal.oslo.feature.qrc.domain.model.session.QrcMode.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.domain.model.session.QrcMode$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.qrc.domain.model.session.QrcMode", com.paypal.oslo.feature.qrc.domain.model.session.QrcMode.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.qrc.domain.model.session.QrcMode[] values() {
        return (com.paypal.oslo.feature.qrc.domain.model.session.QrcMode[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.qrc.domain.model.session.QrcMode valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.qrc.domain.model.session.QrcMode) java.lang.Enum.valueOf(com.paypal.oslo.feature.qrc.domain.model.session.QrcMode.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.qrc.domain.model.session.QrcMode> getEntries() {
        return $ENTRIES;
    }
}
