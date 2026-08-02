package com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000eJ'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/PurchaseCreated;", "", "", "purchaseUuid", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/Price;", "totalAmount", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/Price;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/Price;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/Price;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/Price;)Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/PurchaseCreated;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$business_pay_and_get_paid_prodRelease", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/PurchaseCreated;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getPurchaseUuid", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/Price;", "getTotalAmount", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class PurchaseCreated {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.PurchaseCreated.Companion INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.PurchaseCreated.Companion(null);
    private final java.lang.String purchaseUuid;
    private final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Price totalAmount;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/PurchaseCreated$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/PurchaseCreated;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.PurchaseCreated> serializer() {
            return com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.PurchaseCreated$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PurchaseCreated(int i, java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Price price, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.PurchaseCreated$$serializer.INSTANCE.getDescriptor());
        }
        this.purchaseUuid = str;
        this.totalAmount = price;
    }

    public PurchaseCreated(java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Price price) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(price, "");
        this.purchaseUuid = str;
        this.totalAmount = price;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$business_pay_and_get_paid_prodRelease(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.PurchaseCreated self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.purchaseUuid);
        output.encodeSerializableElement(serialDesc, 1, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Price$$serializer.INSTANCE, self.totalAmount);
    }

    public final java.lang.String getPurchaseUuid() {
        return this.purchaseUuid;
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Price getTotalAmount() {
        return this.totalAmount;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.purchaseUuid;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Price price = this.totalAmount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PurchaseCreated(purchaseUuid=");
        sb.append(str);
        sb.append(", totalAmount=");
        sb.append(price);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.purchaseUuid.hashCode() * 31) + this.totalAmount.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.PurchaseCreated)) {
            return false;
        }
        com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.PurchaseCreated purchaseCreated = (com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.PurchaseCreated) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.purchaseUuid, purchaseCreated.purchaseUuid) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalAmount, purchaseCreated.totalAmount);
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.PurchaseCreated copy(java.lang.String purchaseUuid, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Price totalAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(purchaseUuid, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalAmount, "");
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.PurchaseCreated(purchaseUuid, totalAmount);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Price getTotalAmount() {
        return this.totalAmount;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPurchaseUuid() {
        return this.purchaseUuid;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.PurchaseCreated copy$default(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.PurchaseCreated purchaseCreated, java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Price price, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = purchaseCreated.purchaseUuid;
        }
        if ((i & 2) != 0) {
            price = purchaseCreated.totalAmount;
        }
        return purchaseCreated.copy(str, price);
    }
}
