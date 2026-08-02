package com.paypal.oslo.feature.debitcard.shared.domain.model;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentImageUrls;", "", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentImageUrl;", "front", "back", "<init>", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentImageUrl;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentImageUrl;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentImageUrl;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentImageUrl;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentImageUrl;", "component2", "copy", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentImageUrl;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentImageUrl;)Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentImageUrls;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$debit_card_prodRelease", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentImageUrls;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentImageUrl;", "getFront", "getBack", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class DebitInstrumentImageUrls {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrls.Companion INSTANCE = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrls.Companion(null);
    private final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrl back;
    private final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrl front;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentImageUrls$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentImageUrls;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrls> serializer() {
            return com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrls$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DebitInstrumentImageUrls(int i, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrl debitInstrumentImageUrl, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrl debitInstrumentImageUrl2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrls$$serializer.INSTANCE.getDescriptor());
        }
        this.front = debitInstrumentImageUrl;
        this.back = debitInstrumentImageUrl2;
    }

    public DebitInstrumentImageUrls(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrl debitInstrumentImageUrl, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrl debitInstrumentImageUrl2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentImageUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentImageUrl2, "");
        this.front = debitInstrumentImageUrl;
        this.back = debitInstrumentImageUrl2;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$debit_card_prodRelease(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrls self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrl$$serializer.INSTANCE, self.front);
        output.encodeSerializableElement(serialDesc, 1, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrl$$serializer.INSTANCE, self.back);
    }

    public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrl getFront() {
        return this.front;
    }

    public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrl getBack() {
        return this.back;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrl debitInstrumentImageUrl = this.front;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrl debitInstrumentImageUrl2 = this.back;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitInstrumentImageUrls(front=");
        sb.append(debitInstrumentImageUrl);
        sb.append(", back=");
        sb.append(debitInstrumentImageUrl2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.front.hashCode() * 31) + this.back.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrls)) {
            return false;
        }
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrls debitInstrumentImageUrls = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrls) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.front, debitInstrumentImageUrls.front) && kotlin.jvm.internal.Intrinsics.areEqual(this.back, debitInstrumentImageUrls.back);
    }

    public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrls copy(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrl front, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrl back) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(front, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(back, "");
        return new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrls(front, back);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrl getBack() {
        return this.back;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrl getFront() {
        return this.front;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrls copy$default(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrls debitInstrumentImageUrls, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrl debitInstrumentImageUrl, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrl debitInstrumentImageUrl2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            debitInstrumentImageUrl = debitInstrumentImageUrls.front;
        }
        if ((i & 2) != 0) {
            debitInstrumentImageUrl2 = debitInstrumentImageUrls.back;
        }
        return debitInstrumentImageUrls.copy(debitInstrumentImageUrl, debitInstrumentImageUrl2);
    }
}
