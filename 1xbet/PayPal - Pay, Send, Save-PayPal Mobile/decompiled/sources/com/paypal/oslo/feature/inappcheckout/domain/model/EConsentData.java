package com.paypal.oslo.feature.inappcheckout.domain.model;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b1\u0018\u0000 \u00172\u00020\u0001:\u0003\u0018\u0019\u0017B\u0013\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0082\u0001\u0002\u001a\u001b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/model/EConsentData;", "", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;", "p0", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;)V", "", "seen0", "buyerInfoEntity", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/EConsentData;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;", "getBuyerInfoEntity", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;", "Companion", "ContinueToRyp", "ReturnWithResult", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/EConsentData$ContinueToRyp;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/EConsentData$ReturnWithResult;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public abstract class EConsentData {
    private final com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.EConsentData.Companion INSTANCE = new com.paypal.oslo.feature.inappcheckout.domain.model.EConsentData.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.domain.model.EConsentData$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.inappcheckout.domain.model.EConsentData.$r8$lambda$3VpzTnZt5yXnVxgTZoC4FQFR1LU();
        }
    });

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/model/EConsentData$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/EConsentData;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.inappcheckout.domain.model.EConsentData> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.inappcheckout.domain.model.EConsentData.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private EConsentData(com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity) {
        this.buyerInfoEntity = buyerInfoEntity;
    }

    public final com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity getBuyerInfoEntity() {
        return this.buyerInfoEntity;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/model/EConsentData$ContinueToRyp;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/EConsentData;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;", "response", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;)Lcom/paypal/oslo/feature/inappcheckout/domain/model/EConsentData$ContinueToRyp;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;", "getResponse"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class ContinueToRyp extends com.paypal.oslo.feature.inappcheckout.domain.model.EConsentData {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse response;

        public final com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse getResponse() {
            return this.response;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ContinueToRyp(com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse) {
            super(authenticationXOResponse.getBuyerInfoEntity(), null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationXOResponse, "");
            this.response = authenticationXOResponse;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse = this.response;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ContinueToRyp(response=");
            sb.append(authenticationXOResponse);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.response.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.inappcheckout.domain.model.EConsentData.ContinueToRyp) && kotlin.jvm.internal.Intrinsics.areEqual(this.response, ((com.paypal.oslo.feature.inappcheckout.domain.model.EConsentData.ContinueToRyp) other).response);
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.model.EConsentData.ContinueToRyp copy(com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse response) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
            return new com.paypal.oslo.feature.inappcheckout.domain.model.EConsentData.ContinueToRyp(response);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse getResponse() {
            return this.response;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.model.EConsentData.ContinueToRyp copy$default(com.paypal.oslo.feature.inappcheckout.domain.model.EConsentData.ContinueToRyp continueToRyp, com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                authenticationXOResponse = continueToRyp.response;
            }
            return continueToRyp.copy(authenticationXOResponse);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/model/EConsentData$ReturnWithResult;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/EConsentData;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;", "buyerInfoEntity", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class ReturnWithResult extends com.paypal.oslo.feature.inappcheckout.domain.model.EConsentData {
        public static final int $stable = 8;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReturnWithResult(com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity) {
            super(buyerInfoEntity, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buyerInfoEntity, "");
        }
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$3VpzTnZt5yXnVxgTZoC4FQFR1LU() {
        return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.inappcheckout.domain.model.EConsentData", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.inappcheckout.domain.model.EConsentData.class), new kotlin.reflect.KClass[0], new kotlinx.serialization.KSerializer[0], new java.lang.annotation.Annotation[0]);
    }

    public /* synthetic */ EConsentData(com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(buyerInfoEntity);
    }
}
