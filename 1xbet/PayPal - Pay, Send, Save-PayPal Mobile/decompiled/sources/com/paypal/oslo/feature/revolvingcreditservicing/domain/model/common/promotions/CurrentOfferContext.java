package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/promotions/CurrentOfferContext;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/promotions/CurrentOfferInstallment;", "installment", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/promotions/CurrentOfferInstallment;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/promotions/CurrentOfferInstallment;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/promotions/CurrentOfferInstallment;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/promotions/CurrentOfferInstallment;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/promotions/CurrentOfferContext;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$revolvingcredit_servicing_prodRelease", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/promotions/CurrentOfferContext;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/promotions/CurrentOfferInstallment;", "getInstallment", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class CurrentOfferContext {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.CurrentOfferContext.Companion INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.CurrentOfferContext.Companion(null);
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.CurrentOfferInstallment installment;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/promotions/CurrentOfferContext$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/promotions/CurrentOfferContext;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.CurrentOfferContext> serializer() {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.CurrentOfferContext$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CurrentOfferContext(int i, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.CurrentOfferInstallment currentOfferInstallment, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.CurrentOfferContext$$serializer.INSTANCE.getDescriptor());
        }
        this.installment = currentOfferInstallment;
    }

    public CurrentOfferContext(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.CurrentOfferInstallment currentOfferInstallment) {
        this.installment = currentOfferInstallment;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.CurrentOfferInstallment getInstallment() {
        return this.installment;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.CurrentOfferInstallment currentOfferInstallment = this.installment;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CurrentOfferContext(installment=");
        sb.append(currentOfferInstallment);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.CurrentOfferInstallment currentOfferInstallment = this.installment;
        if (currentOfferInstallment == null) {
            return 0;
        }
        return currentOfferInstallment.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.CurrentOfferContext) && kotlin.jvm.internal.Intrinsics.areEqual(this.installment, ((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.CurrentOfferContext) other).installment);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.CurrentOfferContext copy(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.CurrentOfferInstallment installment) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.CurrentOfferContext(installment);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.CurrentOfferInstallment getInstallment() {
        return this.installment;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.CurrentOfferContext copy$default(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.CurrentOfferContext currentOfferContext, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.CurrentOfferInstallment currentOfferInstallment, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            currentOfferInstallment = currentOfferContext.installment;
        }
        return currentOfferContext.copy(currentOfferInstallment);
    }
}
