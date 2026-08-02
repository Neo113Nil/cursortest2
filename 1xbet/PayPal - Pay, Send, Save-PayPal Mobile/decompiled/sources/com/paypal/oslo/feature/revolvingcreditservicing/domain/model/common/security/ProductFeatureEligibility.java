package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/security/ProductFeatureEligibility;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/security/ProductFeatureEligibilityStatus;", "virtualCardStatus", "physicalCardStatus", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/security/ProductFeatureEligibilityStatus;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/security/ProductFeatureEligibilityStatus;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/security/ProductFeatureEligibilityStatus;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/security/ProductFeatureEligibilityStatus;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/security/ProductFeatureEligibilityStatus;", "component2", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/security/ProductFeatureEligibilityStatus;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/security/ProductFeatureEligibilityStatus;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/security/ProductFeatureEligibility;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$revolvingcredit_servicing_prodRelease", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/security/ProductFeatureEligibility;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/security/ProductFeatureEligibilityStatus;", "getVirtualCardStatus", "getPhysicalCardStatus", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class ProductFeatureEligibility {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibilityStatus physicalCardStatus;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibilityStatus virtualCardStatus;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibility.Companion INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibility.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibility$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer createSimpleEnumSerializer;
            createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibilityStatus", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibilityStatus.values());
            return createSimpleEnumSerializer;
        }
    }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibility$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer createSimpleEnumSerializer;
            createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibilityStatus", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibilityStatus.values());
            return createSimpleEnumSerializer;
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/security/ProductFeatureEligibility$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/security/ProductFeatureEligibility;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibility> serializer() {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibility$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ProductFeatureEligibility(int i, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibilityStatus productFeatureEligibilityStatus, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibilityStatus productFeatureEligibilityStatus2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibility$$serializer.INSTANCE.getDescriptor());
        }
        this.virtualCardStatus = productFeatureEligibilityStatus;
        this.physicalCardStatus = productFeatureEligibilityStatus2;
    }

    public ProductFeatureEligibility(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibilityStatus productFeatureEligibilityStatus, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibilityStatus productFeatureEligibilityStatus2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productFeatureEligibilityStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productFeatureEligibilityStatus2, "");
        this.virtualCardStatus = productFeatureEligibilityStatus;
        this.physicalCardStatus = productFeatureEligibilityStatus2;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$revolvingcredit_servicing_prodRelease(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibility self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.virtualCardStatus);
        output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.physicalCardStatus);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibilityStatus getVirtualCardStatus() {
        return this.virtualCardStatus;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibilityStatus getPhysicalCardStatus() {
        return this.physicalCardStatus;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibilityStatus productFeatureEligibilityStatus = this.virtualCardStatus;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibilityStatus productFeatureEligibilityStatus2 = this.physicalCardStatus;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ProductFeatureEligibility(virtualCardStatus=");
        sb.append(productFeatureEligibilityStatus);
        sb.append(", physicalCardStatus=");
        sb.append(productFeatureEligibilityStatus2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.virtualCardStatus.hashCode() * 31) + this.physicalCardStatus.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibility)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibility productFeatureEligibility = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibility) other;
        return this.virtualCardStatus == productFeatureEligibility.virtualCardStatus && this.physicalCardStatus == productFeatureEligibility.physicalCardStatus;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibility copy(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibilityStatus virtualCardStatus, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibilityStatus physicalCardStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(virtualCardStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(physicalCardStatus, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibility(virtualCardStatus, physicalCardStatus);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibilityStatus getPhysicalCardStatus() {
        return this.physicalCardStatus;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibilityStatus getVirtualCardStatus() {
        return this.virtualCardStatus;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibility copy$default(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibility productFeatureEligibility, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibilityStatus productFeatureEligibilityStatus, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibilityStatus productFeatureEligibilityStatus2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            productFeatureEligibilityStatus = productFeatureEligibility.virtualCardStatus;
        }
        if ((i & 2) != 0) {
            productFeatureEligibilityStatus2 = productFeatureEligibility.physicalCardStatus;
        }
        return productFeatureEligibility.copy(productFeatureEligibilityStatus, productFeatureEligibilityStatus2);
    }
}
