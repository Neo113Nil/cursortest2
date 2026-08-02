package com.paypal.oslo.feature.inappcheckout.domain.entity;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InitializeNativeRypCheckoutResponseEntity;", "", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;", "buyerInfo", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingSelectionEntity;", "fundingSelection", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InitializeCheckoutEntity;", "initializeCheckout", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingSelectionEntity;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InitializeCheckoutEntity;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;", "component2", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingSelectionEntity;", "component3", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InitializeCheckoutEntity;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingSelectionEntity;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InitializeCheckoutEntity;)Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InitializeNativeRypCheckoutResponseEntity;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;", "getBuyerInfo", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingSelectionEntity;", "getFundingSelection", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InitializeCheckoutEntity;", "getInitializeCheckout"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class InitializeNativeRypCheckoutResponseEntity {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfo;
    private final com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity fundingSelection;
    private final com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutEntity initializeCheckout;

    public InitializeNativeRypCheckoutResponseEntity(com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity fundingSelectionEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutEntity initializeCheckoutEntity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buyerInfoEntity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingSelectionEntity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializeCheckoutEntity, "");
        this.buyerInfo = buyerInfoEntity;
        this.fundingSelection = fundingSelectionEntity;
        this.initializeCheckout = initializeCheckoutEntity;
    }

    public final com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity getBuyerInfo() {
        return this.buyerInfo;
    }

    public final com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity getFundingSelection() {
        return this.fundingSelection;
    }

    public final com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutEntity getInitializeCheckout() {
        return this.initializeCheckout;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity = this.buyerInfo;
        com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity fundingSelectionEntity = this.fundingSelection;
        com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutEntity initializeCheckoutEntity = this.initializeCheckout;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InitializeNativeRypCheckoutResponseEntity(buyerInfo=");
        sb.append(buyerInfoEntity);
        sb.append(", fundingSelection=");
        sb.append(fundingSelectionEntity);
        sb.append(", initializeCheckout=");
        sb.append(initializeCheckoutEntity);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.buyerInfo.hashCode() * 31) + this.fundingSelection.hashCode()) * 31) + this.initializeCheckout.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeNativeRypCheckoutResponseEntity)) {
            return false;
        }
        com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeNativeRypCheckoutResponseEntity initializeNativeRypCheckoutResponseEntity = (com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeNativeRypCheckoutResponseEntity) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.buyerInfo, initializeNativeRypCheckoutResponseEntity.buyerInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingSelection, initializeNativeRypCheckoutResponseEntity.fundingSelection) && kotlin.jvm.internal.Intrinsics.areEqual(this.initializeCheckout, initializeNativeRypCheckoutResponseEntity.initializeCheckout);
    }

    public final com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeNativeRypCheckoutResponseEntity copy(com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfo, com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity fundingSelection, com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutEntity initializeCheckout) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buyerInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingSelection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializeCheckout, "");
        return new com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeNativeRypCheckoutResponseEntity(buyerInfo, fundingSelection, initializeCheckout);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutEntity getInitializeCheckout() {
        return this.initializeCheckout;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity getFundingSelection() {
        return this.fundingSelection;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity getBuyerInfo() {
        return this.buyerInfo;
    }

    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeNativeRypCheckoutResponseEntity copy$default(com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeNativeRypCheckoutResponseEntity initializeNativeRypCheckoutResponseEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity fundingSelectionEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutEntity initializeCheckoutEntity, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            buyerInfoEntity = initializeNativeRypCheckoutResponseEntity.buyerInfo;
        }
        if ((i & 2) != 0) {
            fundingSelectionEntity = initializeNativeRypCheckoutResponseEntity.fundingSelection;
        }
        if ((i & 4) != 0) {
            initializeCheckoutEntity = initializeNativeRypCheckoutResponseEntity.initializeCheckout;
        }
        return initializeNativeRypCheckoutResponseEntity.copy(buyerInfoEntity, fundingSelectionEntity, initializeCheckoutEntity);
    }
}
