package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ(\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/promotions/NoInterestDetails;", "", "", "periodicPaymentCount", "term", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/Integer;", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/promotions/NoInterestDetails;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$revolvingcredit_servicing_prodRelease", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/promotions/NoInterestDetails;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/Integer;", "getPeriodicPaymentCount", "getTerm", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class NoInterestDetails {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.NoInterestDetails.Companion INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.NoInterestDetails.Companion(null);
    private final java.lang.Integer periodicPaymentCount;
    private final java.lang.Integer term;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/promotions/NoInterestDetails$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/promotions/NoInterestDetails;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.NoInterestDetails> serializer() {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.NoInterestDetails$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ NoInterestDetails(int i, java.lang.Integer num, java.lang.Integer num2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.NoInterestDetails$$serializer.INSTANCE.getDescriptor());
        }
        this.periodicPaymentCount = num;
        this.term = num2;
    }

    public NoInterestDetails(java.lang.Integer num, java.lang.Integer num2) {
        this.periodicPaymentCount = num;
        this.term = num2;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$revolvingcredit_servicing_prodRelease(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.NoInterestDetails self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.IntSerializer.INSTANCE, self.periodicPaymentCount);
        output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.IntSerializer.INSTANCE, self.term);
    }

    public final java.lang.Integer getPeriodicPaymentCount() {
        return this.periodicPaymentCount;
    }

    public final java.lang.Integer getTerm() {
        return this.term;
    }

    public final java.lang.String toString() {
        java.lang.Integer num = this.periodicPaymentCount;
        java.lang.Integer num2 = this.term;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NoInterestDetails(periodicPaymentCount=");
        sb.append(num);
        sb.append(", term=");
        sb.append(num2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.Integer num = this.periodicPaymentCount;
        int hashCode = num == null ? 0 : num.hashCode();
        java.lang.Integer num2 = this.term;
        return (hashCode * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.NoInterestDetails)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.NoInterestDetails noInterestDetails = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.NoInterestDetails) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.periodicPaymentCount, noInterestDetails.periodicPaymentCount) && kotlin.jvm.internal.Intrinsics.areEqual(this.term, noInterestDetails.term);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.NoInterestDetails copy(java.lang.Integer periodicPaymentCount, java.lang.Integer term) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.NoInterestDetails(periodicPaymentCount, term);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Integer getTerm() {
        return this.term;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Integer getPeriodicPaymentCount() {
        return this.periodicPaymentCount;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.NoInterestDetails copy$default(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.NoInterestDetails noInterestDetails, java.lang.Integer num, java.lang.Integer num2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = noInterestDetails.periodicPaymentCount;
        }
        if ((i & 2) != 0) {
            num2 = noInterestDetails.term;
        }
        return noInterestDetails.copy(num, num2);
    }
}
