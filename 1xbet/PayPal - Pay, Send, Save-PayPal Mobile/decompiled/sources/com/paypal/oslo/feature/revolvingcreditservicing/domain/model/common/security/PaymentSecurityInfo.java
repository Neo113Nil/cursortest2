package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/security/PaymentSecurityInfo;", "", "", "enrollmentEligible", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/security/PaymentSecurityEnrollmentStatus;", "enrollmentStatus", "<init>", "(ZLcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/security/PaymentSecurityEnrollmentStatus;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/security/PaymentSecurityEnrollmentStatus;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Z", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/security/PaymentSecurityEnrollmentStatus;", "copy", "(ZLcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/security/PaymentSecurityEnrollmentStatus;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/security/PaymentSecurityInfo;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$revolvingcredit_servicing_prodRelease", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/security/PaymentSecurityInfo;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Z", "getEnrollmentEligible", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/security/PaymentSecurityEnrollmentStatus;", "getEnrollmentStatus", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class PaymentSecurityInfo {
    public static final int $stable = 0;
    private final boolean enrollmentEligible;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityEnrollmentStatus enrollmentStatus;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityInfo.Companion INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityInfo.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityInfo$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer createSimpleEnumSerializer;
            createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityEnrollmentStatus", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityEnrollmentStatus.values());
            return createSimpleEnumSerializer;
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/security/PaymentSecurityInfo$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/security/PaymentSecurityInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityInfo> serializer() {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityInfo$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PaymentSecurityInfo(int i, boolean z, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityEnrollmentStatus paymentSecurityEnrollmentStatus, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.enrollmentEligible = z;
        this.enrollmentStatus = paymentSecurityEnrollmentStatus;
    }

    public PaymentSecurityInfo(boolean z, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityEnrollmentStatus paymentSecurityEnrollmentStatus) {
        this.enrollmentEligible = z;
        this.enrollmentStatus = paymentSecurityEnrollmentStatus;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$revolvingcredit_servicing_prodRelease(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityInfo self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeBooleanElement(serialDesc, 0, self.enrollmentEligible);
        output.encodeNullableSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.enrollmentStatus);
    }

    public final boolean getEnrollmentEligible() {
        return this.enrollmentEligible;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityEnrollmentStatus getEnrollmentStatus() {
        return this.enrollmentStatus;
    }

    public final java.lang.String toString() {
        boolean z = this.enrollmentEligible;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityEnrollmentStatus paymentSecurityEnrollmentStatus = this.enrollmentStatus;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentSecurityInfo(enrollmentEligible=");
        sb.append(z);
        sb.append(", enrollmentStatus=");
        sb.append(paymentSecurityEnrollmentStatus);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.enrollmentEligible);
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityEnrollmentStatus paymentSecurityEnrollmentStatus = this.enrollmentStatus;
        return (hashCode * 31) + (paymentSecurityEnrollmentStatus == null ? 0 : paymentSecurityEnrollmentStatus.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityInfo)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityInfo paymentSecurityInfo = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityInfo) other;
        return this.enrollmentEligible == paymentSecurityInfo.enrollmentEligible && this.enrollmentStatus == paymentSecurityInfo.enrollmentStatus;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityInfo copy(boolean enrollmentEligible, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityEnrollmentStatus enrollmentStatus) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityInfo(enrollmentEligible, enrollmentStatus);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityEnrollmentStatus getEnrollmentStatus() {
        return this.enrollmentStatus;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnrollmentEligible() {
        return this.enrollmentEligible;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityInfo copy$default(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityInfo paymentSecurityInfo, boolean z, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityEnrollmentStatus paymentSecurityEnrollmentStatus, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = paymentSecurityInfo.enrollmentEligible;
        }
        if ((i & 2) != 0) {
            paymentSecurityEnrollmentStatus = paymentSecurityInfo.enrollmentStatus;
        }
        return paymentSecurityInfo.copy(z, paymentSecurityEnrollmentStatus);
    }
}
