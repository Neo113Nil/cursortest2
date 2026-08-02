package com.paypal.oslo.feature.searchandintelligence.ui.component.productcard;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u0005\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0012\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u0005HÆ\u0003J\r\u0010\u0013\u001a\u00060\u0006j\u0002`\u0007HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0012\b\u0002\u0010\u0004\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u00052\f\b\u0002\u0010\b\u001a\u00060\u0006j\u0002`\u0007HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0004\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/component/productcard/ProductAttribute;", "", "key", "", "options", "", "Lcom/paypal/pds/components/MenuItem;", "Lcom/paypal/pds/components/DropdownItem;", "selectedItem", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/paypal/pds/components/MenuItem;)V", "getKey", "()Ljava/lang/String;", "getOptions", "()Ljava/util/List;", "getSelectedItem", "()Lcom/paypal/pds/components/MenuItem;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "search-and-intelligence_prodRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ProductAttribute {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.pds.components.MenuItem> getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final com.paypal.pds.components.MenuItem getHighSpeedVideoSizes;

    public ProductAttribute(java.lang.String str, java.util.List<com.paypal.pds.components.MenuItem> list, com.paypal.pds.components.MenuItem menuItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menuItem, "");
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighResolutionOutputSizeshNQ4ISI = list;
        this.getHighSpeedVideoSizes = menuItem;
    }

    public final java.lang.String getKey() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final java.util.List<com.paypal.pds.components.MenuItem> getOptions() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final com.paypal.pds.components.MenuItem getSelectedItem() {
        return this.getHighSpeedVideoSizes;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.getHighSpeedVideoFpsRanges;
        java.util.List<com.paypal.pds.components.MenuItem> list = this.getHighResolutionOutputSizeshNQ4ISI;
        com.paypal.pds.components.MenuItem menuItem = this.getHighSpeedVideoSizes;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ProductAttribute(key=");
        sb.append(str);
        sb.append(", options=");
        sb.append(list);
        sb.append(", selectedItem=");
        sb.append(menuItem);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.getHighSpeedVideoFpsRanges.hashCode() * 31) + this.getHighResolutionOutputSizeshNQ4ISI.hashCode()) * 31) + this.getHighSpeedVideoSizes.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ProductAttribute)) {
            return false;
        }
        com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ProductAttribute productAttribute = (com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ProductAttribute) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, productAttribute.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, productAttribute.getHighResolutionOutputSizeshNQ4ISI) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, productAttribute.getHighSpeedVideoSizes);
    }

    public final com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ProductAttribute copy(java.lang.String key, java.util.List<com.paypal.pds.components.MenuItem> options, com.paypal.pds.components.MenuItem selectedItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedItem, "");
        return new com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ProductAttribute(key, options, selectedItem);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.pds.components.MenuItem getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    public final java.util.List<com.paypal.pds.components.MenuItem> component2() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ProductAttribute copy$default(com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ProductAttribute productAttribute, java.lang.String str, java.util.List list, com.paypal.pds.components.MenuItem menuItem, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = productAttribute.getHighSpeedVideoFpsRanges;
        }
        if ((i & 2) != 0) {
            list = productAttribute.getHighResolutionOutputSizeshNQ4ISI;
        }
        if ((i & 4) != 0) {
            menuItem = productAttribute.getHighSpeedVideoSizes;
        }
        return productAttribute.copy(str, list, menuItem);
    }
}
