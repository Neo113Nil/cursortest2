package com.paypal.oslo.feature.qrc.ui.review;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ6\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b\u0007\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/FiAccordionUiData;", "", "Lcom/paypal/oslo/feature/qrc/ui/review/FiUiItem;", "selectedFi", "", "fiList", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.IS_EXPANDED, "<init>", "(Lcom/paypal/oslo/feature/qrc/ui/review/FiUiItem;Ljava/util/List;Z)V", "component1", "()Lcom/paypal/oslo/feature/qrc/ui/review/FiUiItem;", "component2", "()Ljava/util/List;", "component3", "()Z", "copy", "(Lcom/paypal/oslo/feature/qrc/ui/review/FiUiItem;Ljava/util/List;Z)Lcom/paypal/oslo/feature/qrc/ui/review/FiAccordionUiData;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/qrc/ui/review/FiUiItem;", "getSelectedFi", "Ljava/util/List;", "getFiList", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class FiAccordionUiData {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.qrc.ui.review.FiUiItem> fiList;
    private final boolean isExpanded;
    private final com.paypal.oslo.feature.qrc.ui.review.FiUiItem selectedFi;

    public FiAccordionUiData(com.paypal.oslo.feature.qrc.ui.review.FiUiItem fiUiItem, java.util.List<com.paypal.oslo.feature.qrc.ui.review.FiUiItem> list, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.selectedFi = fiUiItem;
        this.fiList = list;
        this.isExpanded = z;
    }

    public /* synthetic */ FiAccordionUiData(com.paypal.oslo.feature.qrc.ui.review.FiUiItem fiUiItem, java.util.List list, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(fiUiItem, list, (i & 4) != 0 ? false : z);
    }

    public final com.paypal.oslo.feature.qrc.ui.review.FiUiItem getSelectedFi() {
        return this.selectedFi;
    }

    public final java.util.List<com.paypal.oslo.feature.qrc.ui.review.FiUiItem> getFiList() {
        return this.fiList;
    }

    public final boolean isExpanded() {
        return this.isExpanded;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.qrc.ui.review.FiUiItem fiUiItem = this.selectedFi;
        java.util.List<com.paypal.oslo.feature.qrc.ui.review.FiUiItem> list = this.fiList;
        boolean z = this.isExpanded;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FiAccordionUiData(selectedFi=");
        sb.append(fiUiItem);
        sb.append(", fiList=");
        sb.append(list);
        sb.append(", isExpanded=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.qrc.ui.review.FiUiItem fiUiItem = this.selectedFi;
        return ((((fiUiItem == null ? 0 : fiUiItem.hashCode()) * 31) + this.fiList.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isExpanded);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.qrc.ui.review.FiAccordionUiData)) {
            return false;
        }
        com.paypal.oslo.feature.qrc.ui.review.FiAccordionUiData fiAccordionUiData = (com.paypal.oslo.feature.qrc.ui.review.FiAccordionUiData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.selectedFi, fiAccordionUiData.selectedFi) && kotlin.jvm.internal.Intrinsics.areEqual(this.fiList, fiAccordionUiData.fiList) && this.isExpanded == fiAccordionUiData.isExpanded;
    }

    public final com.paypal.oslo.feature.qrc.ui.review.FiAccordionUiData copy(com.paypal.oslo.feature.qrc.ui.review.FiUiItem selectedFi, java.util.List<com.paypal.oslo.feature.qrc.ui.review.FiUiItem> fiList, boolean isExpanded) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiList, "");
        return new com.paypal.oslo.feature.qrc.ui.review.FiAccordionUiData(selectedFi, fiList, isExpanded);
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    public final java.util.List<com.paypal.oslo.feature.qrc.ui.review.FiUiItem> component2() {
        return this.fiList;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.qrc.ui.review.FiUiItem getSelectedFi() {
        return this.selectedFi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.review.FiAccordionUiData copy$default(com.paypal.oslo.feature.qrc.ui.review.FiAccordionUiData fiAccordionUiData, com.paypal.oslo.feature.qrc.ui.review.FiUiItem fiUiItem, java.util.List list, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            fiUiItem = fiAccordionUiData.selectedFi;
        }
        if ((i & 2) != 0) {
            list = fiAccordionUiData.fiList;
        }
        if ((i & 4) != 0) {
            z = fiAccordionUiData.isExpanded;
        }
        return fiAccordionUiData.copy(fiUiItem, list, z);
    }
}
