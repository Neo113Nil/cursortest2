package com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ2\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\tJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/balanceterms/domain/AccordionRow;", "", "", "descriptionResId", "amountResId", "detailsResId", "<init>", "(ILjava/lang/Integer;Ljava/lang/Integer;)V", "component1", "()I", "component2", "()Ljava/lang/Integer;", "component3", "copy", "(ILjava/lang/Integer;Ljava/lang/Integer;)Lcom/paypal/oslo/feature/oneonboarding/inventory/views/balanceterms/domain/AccordionRow;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getDescriptionResId", "Ljava/lang/Integer;", "getAmountResId", "getDetailsResId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AccordionRow {
    public static final int $stable = 0;
    private final java.lang.Integer amountResId;
    private final int descriptionResId;
    private final java.lang.Integer detailsResId;

    public AccordionRow(int i, java.lang.Integer num, java.lang.Integer num2) {
        this.descriptionResId = i;
        this.amountResId = num;
        this.detailsResId = num2;
    }

    public /* synthetic */ AccordionRow(int i, java.lang.Integer num, java.lang.Integer num2, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : num2);
    }

    public final int getDescriptionResId() {
        return this.descriptionResId;
    }

    public final java.lang.Integer getAmountResId() {
        return this.amountResId;
    }

    public final java.lang.Integer getDetailsResId() {
        return this.detailsResId;
    }

    public final java.lang.String toString() {
        int i = this.descriptionResId;
        java.lang.Integer num = this.amountResId;
        java.lang.Integer num2 = this.detailsResId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AccordionRow(descriptionResId=");
        sb.append(i);
        sb.append(", amountResId=");
        sb.append(num);
        sb.append(", detailsResId=");
        sb.append(num2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.descriptionResId);
        java.lang.Integer num = this.amountResId;
        int hashCode2 = num == null ? 0 : num.hashCode();
        java.lang.Integer num2 = this.detailsResId;
        return (((hashCode * 31) + hashCode2) * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionRow)) {
            return false;
        }
        com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionRow accordionRow = (com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionRow) other;
        return this.descriptionResId == accordionRow.descriptionResId && kotlin.jvm.internal.Intrinsics.areEqual(this.amountResId, accordionRow.amountResId) && kotlin.jvm.internal.Intrinsics.areEqual(this.detailsResId, accordionRow.detailsResId);
    }

    public final com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionRow copy(int descriptionResId, java.lang.Integer amountResId, java.lang.Integer detailsResId) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionRow(descriptionResId, amountResId, detailsResId);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Integer getDetailsResId() {
        return this.detailsResId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Integer getAmountResId() {
        return this.amountResId;
    }

    /* renamed from: component1, reason: from getter */
    public final int getDescriptionResId() {
        return this.descriptionResId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionRow copy$default(com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionRow accordionRow, int i, java.lang.Integer num, java.lang.Integer num2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = accordionRow.descriptionResId;
        }
        if ((i2 & 2) != 0) {
            num = accordionRow.amountResId;
        }
        if ((i2 & 4) != 0) {
            num2 = accordionRow.detailsResId;
        }
        return accordionRow.copy(i, num, num2);
    }
}
