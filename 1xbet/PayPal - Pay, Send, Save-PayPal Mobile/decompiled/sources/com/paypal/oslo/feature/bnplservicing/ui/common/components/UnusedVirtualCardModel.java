package com.paypal.oslo.feature.bnplservicing.ui.common.components;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/common/components/UnusedVirtualCardModel;", "", "", "amount", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "expiration", com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_CARD_TYPE, "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "component3", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;)Lcom/paypal/oslo/feature/bnplservicing/ui/common/components/UnusedVirtualCardModel;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAmount", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getExpiration", "getCardType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class UnusedVirtualCardModel {
    public static final int $stable;
    private final java.lang.String amount;
    private final com.paypal.oslo.core.commonui.utils.RefText cardType;
    private final com.paypal.oslo.core.commonui.utils.RefText expiration;

    public UnusedVirtualCardModel(java.lang.String str, com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText2, "");
        this.amount = str;
        this.expiration = refText;
        this.cardType = refText2;
    }

    public final java.lang.String getAmount() {
        return this.amount;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getExpiration() {
        return this.expiration;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getCardType() {
        return this.cardType;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.amount;
        com.paypal.oslo.core.commonui.utils.RefText refText = this.expiration;
        com.paypal.oslo.core.commonui.utils.RefText refText2 = this.cardType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UnusedVirtualCardModel(amount=");
        sb.append(str);
        sb.append(", expiration=");
        sb.append(refText);
        sb.append(", cardType=");
        sb.append(refText2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.amount.hashCode() * 31) + this.expiration.hashCode()) * 31) + this.cardType.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.common.components.UnusedVirtualCardModel)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.ui.common.components.UnusedVirtualCardModel unusedVirtualCardModel = (com.paypal.oslo.feature.bnplservicing.ui.common.components.UnusedVirtualCardModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.amount, unusedVirtualCardModel.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.expiration, unusedVirtualCardModel.expiration) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardType, unusedVirtualCardModel.cardType);
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.common.components.UnusedVirtualCardModel copy(java.lang.String amount, com.paypal.oslo.core.commonui.utils.RefText expiration, com.paypal.oslo.core.commonui.utils.RefText cardType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expiration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardType, "");
        return new com.paypal.oslo.feature.bnplservicing.ui.common.components.UnusedVirtualCardModel(amount, expiration, cardType);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getCardType() {
        return this.cardType;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getExpiration() {
        return this.expiration;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAmount() {
        return this.amount;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.common.components.UnusedVirtualCardModel copy$default(com.paypal.oslo.feature.bnplservicing.ui.common.components.UnusedVirtualCardModel unusedVirtualCardModel, java.lang.String str, com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = unusedVirtualCardModel.amount;
        }
        if ((i & 2) != 0) {
            refText = unusedVirtualCardModel.expiration;
        }
        if ((i & 4) != 0) {
            refText2 = unusedVirtualCardModel.cardType;
        }
        return unusedVirtualCardModel.copy(str, refText, refText2);
    }

    static {
        int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        $stable = i | i;
    }
}
