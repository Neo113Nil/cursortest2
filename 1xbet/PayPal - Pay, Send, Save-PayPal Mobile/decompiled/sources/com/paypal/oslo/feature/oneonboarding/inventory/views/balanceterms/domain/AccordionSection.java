package com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\nJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/balanceterms/domain/AccordionSection;", "", "", "titleResId", "", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/balanceterms/domain/AccordionRow;", "items", "<init>", "(ILjava/util/List;)V", "component1", "()I", "component2", "()Ljava/util/List;", "copy", "(ILjava/util/List;)Lcom/paypal/oslo/feature/oneonboarding/inventory/views/balanceterms/domain/AccordionSection;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getTitleResId", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AccordionSection {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionRow> items;
    private final int titleResId;

    public AccordionSection(int i, java.util.List<com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionRow> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.titleResId = i;
        this.items = list;
    }

    public final int getTitleResId() {
        return this.titleResId;
    }

    public final java.util.List<com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionRow> getItems() {
        return this.items;
    }

    public final java.lang.String toString() {
        int i = this.titleResId;
        java.util.List<com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionRow> list = this.items;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AccordionSection(titleResId=");
        sb.append(i);
        sb.append(", items=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Integer.hashCode(this.titleResId) * 31) + this.items.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionSection)) {
            return false;
        }
        com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionSection accordionSection = (com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionSection) other;
        return this.titleResId == accordionSection.titleResId && kotlin.jvm.internal.Intrinsics.areEqual(this.items, accordionSection.items);
    }

    public final com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionSection copy(int titleResId, java.util.List<com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionRow> items) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionSection(titleResId, items);
    }

    public final java.util.List<com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionRow> component2() {
        return this.items;
    }

    /* renamed from: component1, reason: from getter */
    public final int getTitleResId() {
        return this.titleResId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionSection copy$default(com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.domain.AccordionSection accordionSection, int i, java.util.List list, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = accordionSection.titleResId;
        }
        if ((i2 & 2) != 0) {
            list = accordionSection.items;
        }
        return accordionSection.copy(i, list);
    }
}
