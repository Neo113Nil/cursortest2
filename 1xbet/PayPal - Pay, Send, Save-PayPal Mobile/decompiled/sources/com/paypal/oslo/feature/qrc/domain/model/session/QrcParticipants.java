package com.paypal.oslo.feature.qrc.domain.model.session;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0081\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcParticipants;", "", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcConsumer;", "consumer", "Lcom/paypal/oslo/feature/qrc/domain/model/session/Merchant;", "merchant", "<init>", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcConsumer;Lcom/paypal/oslo/feature/qrc/domain/model/session/Merchant;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/qrc/domain/model/session/QrcConsumer;Lcom/paypal/oslo/feature/qrc/domain/model/session/Merchant;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcConsumer;", "component2", "()Lcom/paypal/oslo/feature/qrc/domain/model/session/Merchant;", "copy", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcConsumer;Lcom/paypal/oslo/feature/qrc/domain/model/session/Merchant;)Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcParticipants;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$qrc_prodRelease", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcParticipants;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcConsumer;", "getConsumer", "Lcom/paypal/oslo/feature/qrc/domain/model/session/Merchant;", "getMerchant", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class QrcParticipants {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.qrc.domain.model.session.QrcParticipants.Companion INSTANCE = new com.paypal.oslo.feature.qrc.domain.model.session.QrcParticipants.Companion(null);
    private final com.paypal.oslo.feature.qrc.domain.model.session.QrcConsumer consumer;
    private final com.paypal.oslo.feature.qrc.domain.model.session.Merchant merchant;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcParticipants$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcParticipants;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.qrc.domain.model.session.QrcParticipants> serializer() {
            return com.paypal.oslo.feature.qrc.domain.model.session.QrcParticipants$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ QrcParticipants(int i, com.paypal.oslo.feature.qrc.domain.model.session.QrcConsumer qrcConsumer, com.paypal.oslo.feature.qrc.domain.model.session.Merchant merchant, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.qrc.domain.model.session.QrcParticipants$$serializer.INSTANCE.getDescriptor());
        }
        this.consumer = qrcConsumer;
        this.merchant = merchant;
    }

    public QrcParticipants(com.paypal.oslo.feature.qrc.domain.model.session.QrcConsumer qrcConsumer, com.paypal.oslo.feature.qrc.domain.model.session.Merchant merchant) {
        this.consumer = qrcConsumer;
        this.merchant = merchant;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$qrc_prodRelease(com.paypal.oslo.feature.qrc.domain.model.session.QrcParticipants self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeNullableSerializableElement(serialDesc, 0, com.paypal.oslo.feature.qrc.domain.model.session.QrcConsumer$$serializer.INSTANCE, self.consumer);
        output.encodeNullableSerializableElement(serialDesc, 1, com.paypal.oslo.feature.qrc.domain.model.session.Merchant$$serializer.INSTANCE, self.merchant);
    }

    public final com.paypal.oslo.feature.qrc.domain.model.session.QrcConsumer getConsumer() {
        return this.consumer;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.session.Merchant getMerchant() {
        return this.merchant;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.qrc.domain.model.session.QrcConsumer qrcConsumer = this.consumer;
        com.paypal.oslo.feature.qrc.domain.model.session.Merchant merchant = this.merchant;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("QrcParticipants(consumer=");
        sb.append(qrcConsumer);
        sb.append(", merchant=");
        sb.append(merchant);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.qrc.domain.model.session.QrcConsumer qrcConsumer = this.consumer;
        int hashCode = qrcConsumer == null ? 0 : qrcConsumer.hashCode();
        com.paypal.oslo.feature.qrc.domain.model.session.Merchant merchant = this.merchant;
        return (hashCode * 31) + (merchant != null ? merchant.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.qrc.domain.model.session.QrcParticipants)) {
            return false;
        }
        com.paypal.oslo.feature.qrc.domain.model.session.QrcParticipants qrcParticipants = (com.paypal.oslo.feature.qrc.domain.model.session.QrcParticipants) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.consumer, qrcParticipants.consumer) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchant, qrcParticipants.merchant);
    }

    public final com.paypal.oslo.feature.qrc.domain.model.session.QrcParticipants copy(com.paypal.oslo.feature.qrc.domain.model.session.QrcConsumer consumer, com.paypal.oslo.feature.qrc.domain.model.session.Merchant merchant) {
        return new com.paypal.oslo.feature.qrc.domain.model.session.QrcParticipants(consumer, merchant);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.qrc.domain.model.session.Merchant getMerchant() {
        return this.merchant;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.qrc.domain.model.session.QrcConsumer getConsumer() {
        return this.consumer;
    }

    public static /* synthetic */ com.paypal.oslo.feature.qrc.domain.model.session.QrcParticipants copy$default(com.paypal.oslo.feature.qrc.domain.model.session.QrcParticipants qrcParticipants, com.paypal.oslo.feature.qrc.domain.model.session.QrcConsumer qrcConsumer, com.paypal.oslo.feature.qrc.domain.model.session.Merchant merchant, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            qrcConsumer = qrcParticipants.consumer;
        }
        if ((i & 2) != 0) {
            merchant = qrcParticipants.merchant;
        }
        return qrcParticipants.copy(qrcConsumer, merchant);
    }
}
