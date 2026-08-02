package com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VirtualCardCardContent;", "", "Lcom/paypal/oslo/core/commonui/utils/RefText;", com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_CARD_TYPE, "expiresIn", "cardImageContentDescription", "<init>", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;)V", "component1", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "component2", "component3", "copy", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;)Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VirtualCardCardContent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getCardType", "getExpiresIn", "getCardImageContentDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class VirtualCardCardContent {
    public static final int $stable;
    private final com.paypal.oslo.core.commonui.utils.RefText cardImageContentDescription;
    private final com.paypal.oslo.core.commonui.utils.RefText cardType;
    private final com.paypal.oslo.core.commonui.utils.RefText expiresIn;

    public VirtualCardCardContent(com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, com.paypal.oslo.core.commonui.utils.RefText refText3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText3, "");
        this.cardType = refText;
        this.expiresIn = refText2;
        this.cardImageContentDescription = refText3;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getCardType() {
        return this.cardType;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getExpiresIn() {
        return this.expiresIn;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getCardImageContentDescription() {
        return this.cardImageContentDescription;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.commonui.utils.RefText refText = this.cardType;
        com.paypal.oslo.core.commonui.utils.RefText refText2 = this.expiresIn;
        com.paypal.oslo.core.commonui.utils.RefText refText3 = this.cardImageContentDescription;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("VirtualCardCardContent(cardType=");
        sb.append(refText);
        sb.append(", expiresIn=");
        sb.append(refText2);
        sb.append(", cardImageContentDescription=");
        sb.append(refText3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.cardType.hashCode() * 31) + this.expiresIn.hashCode()) * 31) + this.cardImageContentDescription.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardCardContent)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardCardContent virtualCardCardContent = (com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardCardContent) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.cardType, virtualCardCardContent.cardType) && kotlin.jvm.internal.Intrinsics.areEqual(this.expiresIn, virtualCardCardContent.expiresIn) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardImageContentDescription, virtualCardCardContent.cardImageContentDescription);
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardCardContent copy(com.paypal.oslo.core.commonui.utils.RefText cardType, com.paypal.oslo.core.commonui.utils.RefText expiresIn, com.paypal.oslo.core.commonui.utils.RefText cardImageContentDescription) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expiresIn, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardImageContentDescription, "");
        return new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardCardContent(cardType, expiresIn, cardImageContentDescription);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getCardImageContentDescription() {
        return this.cardImageContentDescription;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getExpiresIn() {
        return this.expiresIn;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getCardType() {
        return this.cardType;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardCardContent copy$default(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardCardContent virtualCardCardContent, com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, com.paypal.oslo.core.commonui.utils.RefText refText3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            refText = virtualCardCardContent.cardType;
        }
        if ((i & 2) != 0) {
            refText2 = virtualCardCardContent.expiresIn;
        }
        if ((i & 4) != 0) {
            refText3 = virtualCardCardContent.cardImageContentDescription;
        }
        return virtualCardCardContent.copy(refText, refText2, refText3);
    }

    static {
        int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable;
    }
}
