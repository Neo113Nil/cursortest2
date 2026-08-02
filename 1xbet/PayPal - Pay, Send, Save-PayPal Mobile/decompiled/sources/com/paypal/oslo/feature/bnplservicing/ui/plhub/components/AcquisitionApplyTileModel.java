package com.paypal.oslo.feature.bnplservicing.ui.plhub.components;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ:\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plhub/components/AcquisitionApplyTileModel;", "", "Lcom/paypal/oslo/core/commonui/utils/RefText;", com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.HEADER, "subHeader", "badgeText", "applyButtonText", "<init>", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;)V", "component1", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "component2", "component3", "component4", "copy", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;)Lcom/paypal/oslo/feature/bnplservicing/ui/plhub/components/AcquisitionApplyTileModel;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getHeader", "getSubHeader", "getBadgeText", "getApplyButtonText"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AcquisitionApplyTileModel {
    public static final int $stable;
    private final com.paypal.oslo.core.commonui.utils.RefText applyButtonText;
    private final com.paypal.oslo.core.commonui.utils.RefText badgeText;
    private final com.paypal.oslo.core.commonui.utils.RefText header;
    private final com.paypal.oslo.core.commonui.utils.RefText subHeader;

    public AcquisitionApplyTileModel(com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, com.paypal.oslo.core.commonui.utils.RefText refText3, com.paypal.oslo.core.commonui.utils.RefText refText4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText4, "");
        this.header = refText;
        this.subHeader = refText2;
        this.badgeText = refText3;
        this.applyButtonText = refText4;
    }

    public /* synthetic */ AcquisitionApplyTileModel(com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, com.paypal.oslo.core.commonui.utils.RefText refText3, com.paypal.oslo.core.commonui.utils.RefText refText4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(refText, refText2, (i & 4) != 0 ? null : refText3, refText4);
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getHeader() {
        return this.header;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getSubHeader() {
        return this.subHeader;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getBadgeText() {
        return this.badgeText;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getApplyButtonText() {
        return this.applyButtonText;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.commonui.utils.RefText refText = this.header;
        com.paypal.oslo.core.commonui.utils.RefText refText2 = this.subHeader;
        com.paypal.oslo.core.commonui.utils.RefText refText3 = this.badgeText;
        com.paypal.oslo.core.commonui.utils.RefText refText4 = this.applyButtonText;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AcquisitionApplyTileModel(header=");
        sb.append(refText);
        sb.append(", subHeader=");
        sb.append(refText2);
        sb.append(", badgeText=");
        sb.append(refText3);
        sb.append(", applyButtonText=");
        sb.append(refText4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.header.hashCode();
        int hashCode2 = this.subHeader.hashCode();
        com.paypal.oslo.core.commonui.utils.RefText refText = this.badgeText;
        return (((((hashCode * 31) + hashCode2) * 31) + (refText == null ? 0 : refText.hashCode())) * 31) + this.applyButtonText.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileModel)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileModel acquisitionApplyTileModel = (com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.header, acquisitionApplyTileModel.header) && kotlin.jvm.internal.Intrinsics.areEqual(this.subHeader, acquisitionApplyTileModel.subHeader) && kotlin.jvm.internal.Intrinsics.areEqual(this.badgeText, acquisitionApplyTileModel.badgeText) && kotlin.jvm.internal.Intrinsics.areEqual(this.applyButtonText, acquisitionApplyTileModel.applyButtonText);
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileModel copy(com.paypal.oslo.core.commonui.utils.RefText header, com.paypal.oslo.core.commonui.utils.RefText subHeader, com.paypal.oslo.core.commonui.utils.RefText badgeText, com.paypal.oslo.core.commonui.utils.RefText applyButtonText) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(header, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subHeader, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applyButtonText, "");
        return new com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileModel(header, subHeader, badgeText, applyButtonText);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getApplyButtonText() {
        return this.applyButtonText;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getBadgeText() {
        return this.badgeText;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getSubHeader() {
        return this.subHeader;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getHeader() {
        return this.header;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileModel copy$default(com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileModel acquisitionApplyTileModel, com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, com.paypal.oslo.core.commonui.utils.RefText refText3, com.paypal.oslo.core.commonui.utils.RefText refText4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            refText = acquisitionApplyTileModel.header;
        }
        if ((i & 2) != 0) {
            refText2 = acquisitionApplyTileModel.subHeader;
        }
        if ((i & 4) != 0) {
            refText3 = acquisitionApplyTileModel.badgeText;
        }
        if ((i & 8) != 0) {
            refText4 = acquisitionApplyTileModel.applyButtonText;
        }
        return acquisitionApplyTileModel.copy(refText, refText2, refText3, refText4);
    }

    static {
        int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable;
    }
}
