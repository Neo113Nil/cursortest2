package com.paypal.oslo.feature.bnplservicing.ui.paylaterhub;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/ShopNowPayLaterUiModel;", "", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "shopNow", "payLater", "<init>", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;)V", "component1", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "component2", "copy", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;)Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/ShopNowPayLaterUiModel;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getShopNow", "getPayLater"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ShopNowPayLaterUiModel {
    public static final int $stable;
    private final com.paypal.oslo.core.commonui.utils.RefText payLater;
    private final com.paypal.oslo.core.commonui.utils.RefText shopNow;

    public ShopNowPayLaterUiModel(com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText2, "");
        this.shopNow = refText;
        this.payLater = refText2;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getShopNow() {
        return this.shopNow;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getPayLater() {
        return this.payLater;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.commonui.utils.RefText refText = this.shopNow;
        com.paypal.oslo.core.commonui.utils.RefText refText2 = this.payLater;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ShopNowPayLaterUiModel(shopNow=");
        sb.append(refText);
        sb.append(", payLater=");
        sb.append(refText2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.shopNow.hashCode() * 31) + this.payLater.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.ShopNowPayLaterUiModel)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.ShopNowPayLaterUiModel shopNowPayLaterUiModel = (com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.ShopNowPayLaterUiModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.shopNow, shopNowPayLaterUiModel.shopNow) && kotlin.jvm.internal.Intrinsics.areEqual(this.payLater, shopNowPayLaterUiModel.payLater);
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.ShopNowPayLaterUiModel copy(com.paypal.oslo.core.commonui.utils.RefText shopNow, com.paypal.oslo.core.commonui.utils.RefText payLater) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shopNow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payLater, "");
        return new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.ShopNowPayLaterUiModel(shopNow, payLater);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getPayLater() {
        return this.payLater;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getShopNow() {
        return this.shopNow;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.ShopNowPayLaterUiModel copy$default(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.ShopNowPayLaterUiModel shopNowPayLaterUiModel, com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            refText = shopNowPayLaterUiModel.shopNow;
        }
        if ((i & 2) != 0) {
            refText2 = shopNowPayLaterUiModel.payLater;
        }
        return shopNowPayLaterUiModel.copy(refText, refText2);
    }

    static {
        int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        $stable = i | i;
    }
}
