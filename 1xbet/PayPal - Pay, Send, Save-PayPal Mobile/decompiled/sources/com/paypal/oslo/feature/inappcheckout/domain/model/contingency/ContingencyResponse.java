package com.paypal.oslo.feature.inappcheckout.domain.model.contingency;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyResponse;", "", "<init>", "()V", "RetriedFiResponse", "RetriedBuyerInfoResponse", "ErrorResponse", "NavigateToAddCard", "NavigateToEConsent", "NotHandled", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyResponse$ErrorResponse;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyResponse$NavigateToAddCard;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyResponse$NavigateToEConsent;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyResponse$NotHandled;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyResponse$RetriedBuyerInfoResponse;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyResponse$RetriedFiResponse;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class ContingencyResponse {
    public static final int $stable = 0;

    private ContingencyResponse() {
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyResponse$RetriedFiResponse;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyResponse;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "contingency", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingSelectionEntity;", "entity", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingSelectionEntity;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "component2", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingSelectionEntity;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingSelectionEntity;)Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyResponse$RetriedFiResponse;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "getContingency", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingSelectionEntity;", "getEntity"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RetriedFiResponse extends com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingency;
        private final com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity entity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RetriedFiResponse(com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity fundingSelectionEntity) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contingencyEntity, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingSelectionEntity, "");
            this.contingency = contingencyEntity;
            this.entity = fundingSelectionEntity;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity getContingency() {
            return this.contingency;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity getEntity() {
            return this.entity;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity = this.contingency;
            com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity fundingSelectionEntity = this.entity;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RetriedFiResponse(contingency=");
            sb.append(contingencyEntity);
            sb.append(", entity=");
            sb.append(fundingSelectionEntity);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.contingency.hashCode() * 31) + this.entity.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse.RetriedFiResponse)) {
                return false;
            }
            com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse.RetriedFiResponse retriedFiResponse = (com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse.RetriedFiResponse) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.contingency, retriedFiResponse.contingency) && kotlin.jvm.internal.Intrinsics.areEqual(this.entity, retriedFiResponse.entity);
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse.RetriedFiResponse copy(com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingency, com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity entity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contingency, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "");
            return new com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse.RetriedFiResponse(contingency, entity);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity getEntity() {
            return this.entity;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity getContingency() {
            return this.contingency;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse.RetriedFiResponse copy$default(com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse.RetriedFiResponse retriedFiResponse, com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity fundingSelectionEntity, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                contingencyEntity = retriedFiResponse.contingency;
            }
            if ((i & 2) != 0) {
                fundingSelectionEntity = retriedFiResponse.entity;
            }
            return retriedFiResponse.copy(contingencyEntity, fundingSelectionEntity);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyResponse$RetriedBuyerInfoResponse;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyResponse;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "contingency", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;", "entity", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "component2", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;)Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyResponse$RetriedBuyerInfoResponse;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "getContingency", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;", "getEntity"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RetriedBuyerInfoResponse extends com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingency;
        private final com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity entity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RetriedBuyerInfoResponse(com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contingencyEntity, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buyerInfoEntity, "");
            this.contingency = contingencyEntity;
            this.entity = buyerInfoEntity;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity getContingency() {
            return this.contingency;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity getEntity() {
            return this.entity;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity = this.contingency;
            com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity = this.entity;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RetriedBuyerInfoResponse(contingency=");
            sb.append(contingencyEntity);
            sb.append(", entity=");
            sb.append(buyerInfoEntity);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.contingency.hashCode() * 31) + this.entity.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse.RetriedBuyerInfoResponse)) {
                return false;
            }
            com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse.RetriedBuyerInfoResponse retriedBuyerInfoResponse = (com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse.RetriedBuyerInfoResponse) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.contingency, retriedBuyerInfoResponse.contingency) && kotlin.jvm.internal.Intrinsics.areEqual(this.entity, retriedBuyerInfoResponse.entity);
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse.RetriedBuyerInfoResponse copy(com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingency, com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity entity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contingency, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "");
            return new com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse.RetriedBuyerInfoResponse(contingency, entity);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity getEntity() {
            return this.entity;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity getContingency() {
            return this.contingency;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse.RetriedBuyerInfoResponse copy$default(com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse.RetriedBuyerInfoResponse retriedBuyerInfoResponse, com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                contingencyEntity = retriedBuyerInfoResponse.contingency;
            }
            if ((i & 2) != 0) {
                buyerInfoEntity = retriedBuyerInfoResponse.entity;
            }
            return retriedBuyerInfoResponse.copy(contingencyEntity, buyerInfoEntity);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyResponse$ErrorResponse;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyResponse;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "contingency", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "error", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "component2", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;)Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyResponse$ErrorResponse;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "getContingency", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ErrorResponse extends com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingency;
        private final com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ErrorResponse(com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity nativeXOErrorEntity) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contingencyEntity, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeXOErrorEntity, "");
            this.contingency = contingencyEntity;
            this.error = nativeXOErrorEntity;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity getContingency() {
            return this.contingency;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity = this.contingency;
            com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity nativeXOErrorEntity = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ErrorResponse(contingency=");
            sb.append(contingencyEntity);
            sb.append(", error=");
            sb.append(nativeXOErrorEntity);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.contingency.hashCode() * 31) + this.error.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse.ErrorResponse)) {
                return false;
            }
            com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse.ErrorResponse errorResponse = (com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse.ErrorResponse) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.contingency, errorResponse.contingency) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, errorResponse.error);
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse.ErrorResponse copy(com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingency, com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contingency, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse.ErrorResponse(contingency, error);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity getError() {
            return this.error;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity getContingency() {
            return this.contingency;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse.ErrorResponse copy$default(com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse.ErrorResponse errorResponse, com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity nativeXOErrorEntity, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                contingencyEntity = errorResponse.contingency;
            }
            if ((i & 2) != 0) {
                nativeXOErrorEntity = errorResponse.error;
            }
            return errorResponse.copy(contingencyEntity, nativeXOErrorEntity);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyResponse$NavigateToAddCard;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyResponse;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NavigateToAddCard extends com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse.NavigateToAddCard INSTANCE = new com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse.NavigateToAddCard();

        private NavigateToAddCard() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyResponse$NavigateToEConsent;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyResponse;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NavigateToEConsent extends com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse.NavigateToEConsent INSTANCE = new com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse.NavigateToEConsent();

        private NavigateToEConsent() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyResponse$NotHandled;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyResponse;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NotHandled extends com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse.NotHandled INSTANCE = new com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse.NotHandled();

        private NotHandled() {
            super(null);
        }
    }

    public /* synthetic */ ContingencyResponse(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
