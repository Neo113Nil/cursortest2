package com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0081\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001f\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/PaymentTerm;", "", "Ljava/util/Date;", "dueDate", "<init>", "(Ljava/util/Date;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/Date;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/util/Date;", "copy", "(Ljava/util/Date;)Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/PaymentTerm;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$business_pay_and_get_paid_prodRelease", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/PaymentTerm;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/util/Date;", "getDueDate", "getDueDate$annotations", "()V", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class PaymentTerm {
    private final java.util.Date dueDate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.PaymentTerm.Companion INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.PaymentTerm.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.PaymentTerm$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.PaymentTerm.$r8$lambda$JYx9E7xcU6PQgQ78SFJHkLO5W1Y();
        }
    })};

    public static /* synthetic */ void getDueDate$annotations() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/PaymentTerm$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/PaymentTerm;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.PaymentTerm> serializer() {
            return com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.PaymentTerm$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PaymentTerm(int i, java.util.Date date, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.PaymentTerm$$serializer.INSTANCE.getDescriptor());
        }
        this.dueDate = date;
    }

    public PaymentTerm(java.util.Date date) {
        this.dueDate = date;
    }

    public final java.util.Date getDueDate() {
        return this.dueDate;
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$JYx9E7xcU6PQgQ78SFJHkLO5W1Y() {
        return new kotlinx.serialization.ContextualSerializer(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.util.Date.class), null, new kotlinx.serialization.KSerializer[0]);
    }

    public final java.lang.String toString() {
        java.util.Date date = this.dueDate;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentTerm(dueDate=");
        sb.append(date);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.util.Date date = this.dueDate;
        if (date == null) {
            return 0;
        }
        return date.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.PaymentTerm) && kotlin.jvm.internal.Intrinsics.areEqual(this.dueDate, ((com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.PaymentTerm) other).dueDate);
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.PaymentTerm copy(java.util.Date dueDate) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.PaymentTerm(dueDate);
    }

    /* renamed from: component1, reason: from getter */
    public final java.util.Date getDueDate() {
        return this.dueDate;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.PaymentTerm copy$default(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.PaymentTerm paymentTerm, java.util.Date date, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            date = paymentTerm.dueDate;
        }
        return paymentTerm.copy(date);
    }
}
