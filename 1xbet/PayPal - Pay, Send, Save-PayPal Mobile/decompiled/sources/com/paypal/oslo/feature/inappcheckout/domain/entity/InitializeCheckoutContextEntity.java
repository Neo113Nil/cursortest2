package com.paypal.oslo.feature.inappcheckout.domain.entity;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0081\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InitializeCheckoutContextEntity;", "", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/MerchantEntity;", "merchant", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/IntegrationDetailsEntity;", "integrationDetails", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/MerchantEntity;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/IntegrationDetailsEntity;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/inappcheckout/domain/entity/MerchantEntity;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/IntegrationDetailsEntity;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/MerchantEntity;", "component2", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/IntegrationDetailsEntity;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/MerchantEntity;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/IntegrationDetailsEntity;)Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InitializeCheckoutContextEntity;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$inappcheckout_prodRelease", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InitializeCheckoutContextEntity;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/MerchantEntity;", "getMerchant", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/IntegrationDetailsEntity;", "getIntegrationDetails", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class InitializeCheckoutContextEntity {
    private final com.paypal.oslo.feature.inappcheckout.domain.entity.IntegrationDetailsEntity integrationDetails;
    private final com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantEntity merchant;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutContextEntity.Companion INSTANCE = new com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutContextEntity.Companion(null);
    public static final int $stable = 8;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InitializeCheckoutContextEntity$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InitializeCheckoutContextEntity;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutContextEntity> serializer() {
            return com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutContextEntity$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ InitializeCheckoutContextEntity(int i, com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantEntity merchantEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.IntegrationDetailsEntity integrationDetailsEntity, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutContextEntity$$serializer.INSTANCE.getDescriptor());
        }
        this.merchant = merchantEntity;
        this.integrationDetails = integrationDetailsEntity;
    }

    public InitializeCheckoutContextEntity(com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantEntity merchantEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.IntegrationDetailsEntity integrationDetailsEntity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantEntity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(integrationDetailsEntity, "");
        this.merchant = merchantEntity;
        this.integrationDetails = integrationDetailsEntity;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$inappcheckout_prodRelease(com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutContextEntity self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantEntity$$serializer.INSTANCE, self.merchant);
        output.encodeSerializableElement(serialDesc, 1, com.paypal.oslo.feature.inappcheckout.domain.entity.IntegrationDetailsEntity$$serializer.INSTANCE, self.integrationDetails);
    }

    public final com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantEntity getMerchant() {
        return this.merchant;
    }

    public final com.paypal.oslo.feature.inappcheckout.domain.entity.IntegrationDetailsEntity getIntegrationDetails() {
        return this.integrationDetails;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantEntity merchantEntity = this.merchant;
        com.paypal.oslo.feature.inappcheckout.domain.entity.IntegrationDetailsEntity integrationDetailsEntity = this.integrationDetails;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InitializeCheckoutContextEntity(merchant=");
        sb.append(merchantEntity);
        sb.append(", integrationDetails=");
        sb.append(integrationDetailsEntity);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.merchant.hashCode() * 31) + this.integrationDetails.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutContextEntity)) {
            return false;
        }
        com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutContextEntity initializeCheckoutContextEntity = (com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutContextEntity) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.merchant, initializeCheckoutContextEntity.merchant) && kotlin.jvm.internal.Intrinsics.areEqual(this.integrationDetails, initializeCheckoutContextEntity.integrationDetails);
    }

    public final com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutContextEntity copy(com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantEntity merchant, com.paypal.oslo.feature.inappcheckout.domain.entity.IntegrationDetailsEntity integrationDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(integrationDetails, "");
        return new com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutContextEntity(merchant, integrationDetails);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.inappcheckout.domain.entity.IntegrationDetailsEntity getIntegrationDetails() {
        return this.integrationDetails;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantEntity getMerchant() {
        return this.merchant;
    }

    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutContextEntity copy$default(com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutContextEntity initializeCheckoutContextEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantEntity merchantEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.IntegrationDetailsEntity integrationDetailsEntity, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            merchantEntity = initializeCheckoutContextEntity.merchant;
        }
        if ((i & 2) != 0) {
            integrationDetailsEntity = initializeCheckoutContextEntity.integrationDetails;
        }
        return initializeCheckoutContextEntity.copy(merchantEntity, integrationDetailsEntity);
    }
}
