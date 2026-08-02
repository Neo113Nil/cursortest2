package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010J'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/navigation/BusinessRequestPaymentDestination;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/api/SendInvoiceFlow;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Invoice;", com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.analytics.TransactionContextValues.TransactionType.Invoice, "", "attemptId", "<init>", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Invoice;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Invoice;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Invoice;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Invoice;Ljava/lang/String;)Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/navigation/BusinessRequestPaymentDestination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$business_pay_and_get_paid_prodRelease", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/navigation/BusinessRequestPaymentDestination;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Invoice;", "getInvoice", "Ljava/lang/String;", "getAttemptId", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class BusinessRequestPaymentDestination implements com.paypal.oslo.feature.businesspayandgetpaid.api.SendInvoiceFlow {
    private final java.lang.String attemptId;
    private final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice invoice;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessRequestPaymentDestination.Companion INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessRequestPaymentDestination.Companion(null);
    public static final int $stable = 8;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/navigation/BusinessRequestPaymentDestination$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/navigation/BusinessRequestPaymentDestination;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessRequestPaymentDestination> serializer() {
            return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessRequestPaymentDestination$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ BusinessRequestPaymentDestination(int i, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice invoice, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessRequestPaymentDestination$$serializer.INSTANCE.getDescriptor());
        }
        this.invoice = invoice;
        this.attemptId = str;
    }

    public BusinessRequestPaymentDestination(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice invoice, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoice, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.invoice = invoice;
        this.attemptId = str;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$business_pay_and_get_paid_prodRelease(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessRequestPaymentDestination self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice$$serializer.INSTANCE, self.invoice);
        output.encodeStringElement(serialDesc, 1, self.attemptId);
    }

    public final java.lang.String getAttemptId() {
        return this.attemptId;
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice getInvoice() {
        return this.invoice;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice invoice = this.invoice;
        java.lang.String str = this.attemptId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BusinessRequestPaymentDestination(invoice=");
        sb.append(invoice);
        sb.append(", attemptId=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.invoice.hashCode() * 31) + this.attemptId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessRequestPaymentDestination)) {
            return false;
        }
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessRequestPaymentDestination businessRequestPaymentDestination = (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessRequestPaymentDestination) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.invoice, businessRequestPaymentDestination.invoice) && kotlin.jvm.internal.Intrinsics.areEqual(this.attemptId, businessRequestPaymentDestination.attemptId);
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessRequestPaymentDestination copy(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice invoice, java.lang.String attemptId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoice, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attemptId, "");
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessRequestPaymentDestination(invoice, attemptId);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAttemptId() {
        return this.attemptId;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice getInvoice() {
        return this.invoice;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessRequestPaymentDestination copy$default(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessRequestPaymentDestination businessRequestPaymentDestination, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice invoice, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            invoice = businessRequestPaymentDestination.invoice;
        }
        if ((i & 2) != 0) {
            str = businessRequestPaymentDestination.attemptId;
        }
        return businessRequestPaymentDestination.copy(invoice, str);
    }
}
