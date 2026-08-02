package com.paypal.oslo.feature.inappcheckout.domain.entity;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/entity/EConsentXOResponse;", "", "", "status", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "contingency", "<init>", "(ZLcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Z", "component2", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "copy", "(ZLcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;)Lcom/paypal/oslo/feature/inappcheckout/domain/entity/EConsentXOResponse;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$inappcheckout_prodRelease", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/EConsentXOResponse;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Z", "getStatus", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "getContingency", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class EConsentXOResponse {
    private final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingency;
    private final boolean status;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.EConsentXOResponse.Companion INSTANCE = new com.paypal.oslo.feature.inappcheckout.domain.entity.EConsentXOResponse.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.domain.entity.EConsentXOResponse$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.inappcheckout.domain.entity.EConsentXOResponse.m15428$r8$lambda$yu4CVFvLgzfccxA0r5xWZUdOqo();
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/entity/EConsentXOResponse$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/EConsentXOResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.inappcheckout.domain.entity.EConsentXOResponse> serializer() {
            return com.paypal.oslo.feature.inappcheckout.domain.entity.EConsentXOResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ EConsentXOResponse(int i, boolean z, com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.inappcheckout.domain.entity.EConsentXOResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.status = z;
        if ((i & 2) == 0) {
            this.contingency = null;
        } else {
            this.contingency = contingencyEntity;
        }
    }

    public EConsentXOResponse(boolean z, com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity) {
        this.status = z;
        this.contingency = contingencyEntity;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$inappcheckout_prodRelease(com.paypal.oslo.feature.inappcheckout.domain.entity.EConsentXOResponse self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeBooleanElement(serialDesc, 0, self.status);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.contingency != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.contingency);
        }
    }

    public /* synthetic */ EConsentXOResponse(boolean z, com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : contingencyEntity);
    }

    public final boolean getStatus() {
        return this.status;
    }

    public final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity getContingency() {
        return this.contingency;
    }

    /* renamed from: $r8$lambda$yu4CVFvLgzfccxA0r5xW-ZUdOqo, reason: not valid java name */
    public static /* synthetic */ kotlinx.serialization.KSerializer m15428$r8$lambda$yu4CVFvLgzfccxA0r5xWZUdOqo() {
        return new kotlinx.serialization.PolymorphicSerializer(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity.class), new java.lang.annotation.Annotation[0]);
    }

    public final java.lang.String toString() {
        boolean z = this.status;
        com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity = this.contingency;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EConsentXOResponse(status=");
        sb.append(z);
        sb.append(", contingency=");
        sb.append(contingencyEntity);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.status);
        com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity = this.contingency;
        return (hashCode * 31) + (contingencyEntity == null ? 0 : contingencyEntity.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.inappcheckout.domain.entity.EConsentXOResponse)) {
            return false;
        }
        com.paypal.oslo.feature.inappcheckout.domain.entity.EConsentXOResponse eConsentXOResponse = (com.paypal.oslo.feature.inappcheckout.domain.entity.EConsentXOResponse) other;
        return this.status == eConsentXOResponse.status && kotlin.jvm.internal.Intrinsics.areEqual(this.contingency, eConsentXOResponse.contingency);
    }

    public final com.paypal.oslo.feature.inappcheckout.domain.entity.EConsentXOResponse copy(boolean status, com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingency) {
        return new com.paypal.oslo.feature.inappcheckout.domain.entity.EConsentXOResponse(status, contingency);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity getContingency() {
        return this.contingency;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getStatus() {
        return this.status;
    }

    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.entity.EConsentXOResponse copy$default(com.paypal.oslo.feature.inappcheckout.domain.entity.EConsentXOResponse eConsentXOResponse, boolean z, com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = eConsentXOResponse.status;
        }
        if ((i & 2) != 0) {
            contingencyEntity = eConsentXOResponse.contingency;
        }
        return eConsentXOResponse.copy(z, contingencyEntity);
    }
}
