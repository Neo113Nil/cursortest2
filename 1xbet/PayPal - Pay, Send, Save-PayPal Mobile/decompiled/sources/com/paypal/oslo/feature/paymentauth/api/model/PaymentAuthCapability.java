package com.paypal.oslo.feature.paymentauth.api.model;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J,\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0011J'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthCapability;", "", "", "Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthMechanism;", "supportedMechanisms", "", "metadata", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/String;)Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthCapability;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$payment_auth_api_prodRelease", "(Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthCapability;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/util/List;", "getSupportedMechanisms", "Ljava/lang/String;", "getMetadata", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class PaymentAuthCapability {
    private final java.lang.String metadata;
    private final java.util.List<com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthMechanism> supportedMechanisms;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthCapability.Companion INSTANCE = new com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthCapability.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthCapability$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthCapability.$r8$lambda$ZJa5JSqeNBYNGP5BVZrJiaICYK0();
        }
    }), null};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthCapability$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthCapability;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthCapability> serializer() {
            return com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthCapability$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PaymentAuthCapability(int i, java.util.List list, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthCapability$$serializer.INSTANCE.getDescriptor());
        }
        this.supportedMechanisms = list;
        if ((i & 2) == 0) {
            this.metadata = null;
        } else {
            this.metadata = str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentAuthCapability(java.util.List<? extends com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthMechanism> list, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.supportedMechanisms = list;
        this.metadata = str;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$payment_auth_api_prodRelease(com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthCapability self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, $childSerializers[0].getValue(), self.supportedMechanisms);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.metadata != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.metadata);
        }
    }

    public /* synthetic */ PaymentAuthCapability(java.util.List list, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : str);
    }

    public final java.util.List<com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthMechanism> getSupportedMechanisms() {
        return this.supportedMechanisms;
    }

    public final java.lang.String getMetadata() {
        return this.metadata;
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$ZJa5JSqeNBYNGP5BVZrJiaICYK0() {
        return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthMechanism.INSTANCE.serializer());
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthMechanism> list = this.supportedMechanisms;
        java.lang.String str = this.metadata;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentAuthCapability(supportedMechanisms=");
        sb.append(list);
        sb.append(", metadata=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.supportedMechanisms.hashCode();
        java.lang.String str = this.metadata;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthCapability)) {
            return false;
        }
        com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthCapability paymentAuthCapability = (com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthCapability) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.supportedMechanisms, paymentAuthCapability.supportedMechanisms) && kotlin.jvm.internal.Intrinsics.areEqual(this.metadata, paymentAuthCapability.metadata);
    }

    public final com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthCapability copy(java.util.List<? extends com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthMechanism> supportedMechanisms, java.lang.String metadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportedMechanisms, "");
        return new com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthCapability(supportedMechanisms, metadata);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getMetadata() {
        return this.metadata;
    }

    public final java.util.List<com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthMechanism> component1() {
        return this.supportedMechanisms;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthCapability copy$default(com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthCapability paymentAuthCapability, java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = paymentAuthCapability.supportedMechanisms;
        }
        if ((i & 2) != 0) {
            str = paymentAuthCapability.metadata;
        }
        return paymentAuthCapability.copy(list, str);
    }
}
