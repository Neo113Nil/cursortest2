package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000  2\u00020\u0001:\u0002! B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\fJ'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/promotions/CurrentInstallmentOfferAmount;", "", "", "nextPaymentAmountDue", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/promotions/CurrentInstallmentOfferAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$revolvingcredit_servicing_prodRelease", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/promotions/CurrentInstallmentOfferAmount;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getNextPaymentAmountDue", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class CurrentInstallmentOfferAmount {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.CurrentInstallmentOfferAmount.Companion INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.CurrentInstallmentOfferAmount.Companion(null);
    private final java.lang.String nextPaymentAmountDue;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/promotions/CurrentInstallmentOfferAmount$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/promotions/CurrentInstallmentOfferAmount;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.CurrentInstallmentOfferAmount> serializer() {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.CurrentInstallmentOfferAmount$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CurrentInstallmentOfferAmount(int i, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.CurrentInstallmentOfferAmount$$serializer.INSTANCE.getDescriptor());
        }
        this.nextPaymentAmountDue = str;
    }

    public CurrentInstallmentOfferAmount(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.nextPaymentAmountDue = str;
    }

    public final java.lang.String getNextPaymentAmountDue() {
        return this.nextPaymentAmountDue;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.nextPaymentAmountDue;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CurrentInstallmentOfferAmount(nextPaymentAmountDue=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.nextPaymentAmountDue.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.CurrentInstallmentOfferAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.nextPaymentAmountDue, ((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.CurrentInstallmentOfferAmount) other).nextPaymentAmountDue);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.CurrentInstallmentOfferAmount copy(java.lang.String nextPaymentAmountDue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nextPaymentAmountDue, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.CurrentInstallmentOfferAmount(nextPaymentAmountDue);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getNextPaymentAmountDue() {
        return this.nextPaymentAmountDue;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.CurrentInstallmentOfferAmount copy$default(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.CurrentInstallmentOfferAmount currentInstallmentOfferAmount, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = currentInstallmentOfferAmount.nextPaymentAmountDue;
        }
        return currentInstallmentOfferAmount.copy(str);
    }
}
