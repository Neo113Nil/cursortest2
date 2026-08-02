package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0081\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\rJ'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/promotions/InstallmentDetails;", "", "", "apr", "", "periodicPaymentCount", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/promotions/InstallmentDetails;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$revolvingcredit_servicing_prodRelease", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/promotions/InstallmentDetails;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getApr", "Ljava/lang/Integer;", "getPeriodicPaymentCount", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class InstallmentDetails {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.InstallmentDetails.Companion INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.InstallmentDetails.Companion(null);
    private final java.lang.String apr;
    private final java.lang.Integer periodicPaymentCount;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/promotions/InstallmentDetails$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/promotions/InstallmentDetails;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.InstallmentDetails> serializer() {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.InstallmentDetails$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ InstallmentDetails(int i, java.lang.String str, java.lang.Integer num, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.InstallmentDetails$$serializer.INSTANCE.getDescriptor());
        }
        this.apr = str;
        this.periodicPaymentCount = num;
    }

    public InstallmentDetails(java.lang.String str, java.lang.Integer num) {
        this.apr = str;
        this.periodicPaymentCount = num;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$revolvingcredit_servicing_prodRelease(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.InstallmentDetails self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.apr);
        output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.IntSerializer.INSTANCE, self.periodicPaymentCount);
    }

    public final java.lang.String getApr() {
        return this.apr;
    }

    public final java.lang.Integer getPeriodicPaymentCount() {
        return this.periodicPaymentCount;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.apr;
        java.lang.Integer num = this.periodicPaymentCount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InstallmentDetails(apr=");
        sb.append(str);
        sb.append(", periodicPaymentCount=");
        sb.append(num);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.apr;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.Integer num = this.periodicPaymentCount;
        return (hashCode * 31) + (num != null ? num.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.InstallmentDetails)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.InstallmentDetails installmentDetails = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.InstallmentDetails) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.apr, installmentDetails.apr) && kotlin.jvm.internal.Intrinsics.areEqual(this.periodicPaymentCount, installmentDetails.periodicPaymentCount);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.InstallmentDetails copy(java.lang.String apr, java.lang.Integer periodicPaymentCount) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.InstallmentDetails(apr, periodicPaymentCount);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Integer getPeriodicPaymentCount() {
        return this.periodicPaymentCount;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getApr() {
        return this.apr;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.InstallmentDetails copy$default(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.InstallmentDetails installmentDetails, java.lang.String str, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = installmentDetails.apr;
        }
        if ((i & 2) != 0) {
            num = installmentDetails.periodicPaymentCount;
        }
        return installmentDetails.copy(str, num);
    }
}
