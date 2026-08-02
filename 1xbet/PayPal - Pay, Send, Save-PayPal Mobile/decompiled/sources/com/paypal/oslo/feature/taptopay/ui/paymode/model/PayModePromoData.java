package com.paypal.oslo.feature.taptopay.ui.paymode.model;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModePromoData;", "", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PromoCardContent;", "promoCardContent", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/setup/SetupCardInfo;", "setupCardInfo", "<init>", "(Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PromoCardContent;Lcom/paypal/oslo/feature/taptopay/api/domain/model/setup/SetupCardInfo;)V", "component1", "()Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PromoCardContent;", "component2", "()Lcom/paypal/oslo/feature/taptopay/api/domain/model/setup/SetupCardInfo;", "copy", "(Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PromoCardContent;Lcom/paypal/oslo/feature/taptopay/api/domain/model/setup/SetupCardInfo;)Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModePromoData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PromoCardContent;", "getPromoCardContent", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/setup/SetupCardInfo;", "getSetupCardInfo"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PayModePromoData {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.taptopay.ui.paymode.model.PromoCardContent promoCardContent;
    private final com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo setupCardInfo;

    public PayModePromoData(com.paypal.oslo.feature.taptopay.ui.paymode.model.PromoCardContent promoCardContent, com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo setupCardInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(promoCardContent, "");
        this.promoCardContent = promoCardContent;
        this.setupCardInfo = setupCardInfo;
    }

    public final com.paypal.oslo.feature.taptopay.ui.paymode.model.PromoCardContent getPromoCardContent() {
        return this.promoCardContent;
    }

    public final com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo getSetupCardInfo() {
        return this.setupCardInfo;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.taptopay.ui.paymode.model.PromoCardContent promoCardContent = this.promoCardContent;
        com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo setupCardInfo = this.setupCardInfo;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PayModePromoData(promoCardContent=");
        sb.append(promoCardContent);
        sb.append(", setupCardInfo=");
        sb.append(setupCardInfo);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.promoCardContent.hashCode();
        com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo setupCardInfo = this.setupCardInfo;
        return (hashCode * 31) + (setupCardInfo == null ? 0 : setupCardInfo.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModePromoData)) {
            return false;
        }
        com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModePromoData payModePromoData = (com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModePromoData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.promoCardContent, payModePromoData.promoCardContent) && kotlin.jvm.internal.Intrinsics.areEqual(this.setupCardInfo, payModePromoData.setupCardInfo);
    }

    public final com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModePromoData copy(com.paypal.oslo.feature.taptopay.ui.paymode.model.PromoCardContent promoCardContent, com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo setupCardInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(promoCardContent, "");
        return new com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModePromoData(promoCardContent, setupCardInfo);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo getSetupCardInfo() {
        return this.setupCardInfo;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.taptopay.ui.paymode.model.PromoCardContent getPromoCardContent() {
        return this.promoCardContent;
    }

    public static /* synthetic */ com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModePromoData copy$default(com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModePromoData payModePromoData, com.paypal.oslo.feature.taptopay.ui.paymode.model.PromoCardContent promoCardContent, com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo setupCardInfo, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            promoCardContent = payModePromoData.promoCardContent;
        }
        if ((i & 2) != 0) {
            setupCardInfo = payModePromoData.setupCardInfo;
        }
        return payModePromoData.copy(promoCardContent, setupCardInfo);
    }
}
