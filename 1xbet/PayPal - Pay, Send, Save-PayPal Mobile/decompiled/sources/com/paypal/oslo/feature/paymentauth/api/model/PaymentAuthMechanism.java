package com.paypal.oslo.feature.paymentauth.api.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\n"}, d2 = {"Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthMechanism;", "", "<init>", "(Ljava/lang/String;I)V", "", "getWireValue", "()Ljava/lang/String;", "wireValue", "Companion", "PAYPAL_3DS", "CARDINAL_3DS"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class PaymentAuthMechanism {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthMechanism[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;

    @kotlinx.serialization.SerialName("CARDINAL_3DS")
    public static final com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthMechanism CARDINAL_3DS;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthMechanism.Companion INSTANCE;

    @kotlinx.serialization.SerialName("PAYPAL_3DS")
    public static final com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthMechanism PAYPAL_3DS;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthMechanism$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthMechanism;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthMechanism> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthMechanism.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private PaymentAuthMechanism(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthMechanism paymentAuthMechanism = new com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthMechanism("PAYPAL_3DS", 0);
        PAYPAL_3DS = paymentAuthMechanism;
        com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthMechanism paymentAuthMechanism2 = new com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthMechanism("CARDINAL_3DS", 1);
        CARDINAL_3DS = paymentAuthMechanism2;
        com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthMechanism[] paymentAuthMechanismArr = {paymentAuthMechanism, paymentAuthMechanism2};
        $VALUES = paymentAuthMechanismArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(paymentAuthMechanismArr);
        INSTANCE = new com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthMechanism.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthMechanism$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createAnnotatedEnumSerializer;
                createAnnotatedEnumSerializer = kotlinx.serialization.internal.EnumsKt.createAnnotatedEnumSerializer("com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthMechanism", com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthMechanism.values(), new java.lang.String[]{"PAYPAL_3DS", "CARDINAL_3DS"}, new java.lang.annotation.Annotation[][]{null, null}, null);
                return createAnnotatedEnumSerializer;
            }
        });
    }

    public final java.lang.String getWireValue() {
        return INSTANCE.serializer().getDescriptor().getElementName(ordinal());
    }

    public static com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthMechanism[] values() {
        return (com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthMechanism[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthMechanism valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthMechanism) java.lang.Enum.valueOf(com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthMechanism.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthMechanism> getEntries() {
        return $ENTRIES;
    }
}
