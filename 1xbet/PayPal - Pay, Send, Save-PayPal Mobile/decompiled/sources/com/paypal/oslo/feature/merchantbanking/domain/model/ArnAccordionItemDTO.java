package com.paypal.oslo.feature.merchantbanking.domain.model;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u0007\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/domain/model/ArnAccordionItemDTO;", "", "", com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.HEADER, "", "bodyList", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.IS_EXPANDED, "<init>", "(Ljava/lang/String;Ljava/util/List;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/util/List;Z)Lcom/paypal/oslo/feature/merchantbanking/domain/model/ArnAccordionItemDTO;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getHeader", "Ljava/util/List;", "getBodyList", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ArnAccordionItemDTO {
    public static final int $stable = 8;
    private final java.util.List<java.lang.String> bodyList;
    private final java.lang.String header;
    private final boolean isExpanded;

    public ArnAccordionItemDTO(java.lang.String str, java.util.List<java.lang.String> list, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.header = str;
        this.bodyList = list;
        this.isExpanded = z;
    }

    public /* synthetic */ ArnAccordionItemDTO(java.lang.String str, java.util.List list, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i & 4) != 0 ? false : z);
    }

    public final java.lang.String getHeader() {
        return this.header;
    }

    public final java.util.List<java.lang.String> getBodyList() {
        return this.bodyList;
    }

    public final boolean isExpanded() {
        return this.isExpanded;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.header;
        java.util.List<java.lang.String> list = this.bodyList;
        boolean z = this.isExpanded;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ArnAccordionItemDTO(header=");
        sb.append(str);
        sb.append(", bodyList=");
        sb.append(list);
        sb.append(", isExpanded=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.header.hashCode() * 31) + this.bodyList.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isExpanded);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.merchantbanking.domain.model.ArnAccordionItemDTO)) {
            return false;
        }
        com.paypal.oslo.feature.merchantbanking.domain.model.ArnAccordionItemDTO arnAccordionItemDTO = (com.paypal.oslo.feature.merchantbanking.domain.model.ArnAccordionItemDTO) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.header, arnAccordionItemDTO.header) && kotlin.jvm.internal.Intrinsics.areEqual(this.bodyList, arnAccordionItemDTO.bodyList) && this.isExpanded == arnAccordionItemDTO.isExpanded;
    }

    public final com.paypal.oslo.feature.merchantbanking.domain.model.ArnAccordionItemDTO copy(java.lang.String header, java.util.List<java.lang.String> bodyList, boolean isExpanded) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(header, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bodyList, "");
        return new com.paypal.oslo.feature.merchantbanking.domain.model.ArnAccordionItemDTO(header, bodyList, isExpanded);
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    public final java.util.List<java.lang.String> component2() {
        return this.bodyList;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getHeader() {
        return this.header;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.merchantbanking.domain.model.ArnAccordionItemDTO copy$default(com.paypal.oslo.feature.merchantbanking.domain.model.ArnAccordionItemDTO arnAccordionItemDTO, java.lang.String str, java.util.List list, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = arnAccordionItemDTO.header;
        }
        if ((i & 2) != 0) {
            list = arnAccordionItemDTO.bodyList;
        }
        if ((i & 4) != 0) {
            z = arnAccordionItemDTO.isExpanded;
        }
        return arnAccordionItemDTO.copy(str, list, z);
    }
}
