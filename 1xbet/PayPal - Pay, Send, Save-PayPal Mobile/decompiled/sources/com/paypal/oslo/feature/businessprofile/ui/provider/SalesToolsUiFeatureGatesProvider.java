package com.paypal.oslo.feature.businessprofile.ui.provider;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0003\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0004\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0005\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/businessprofile/ui/provider/SalesToolsUiFeatureGatesProvider;", "", "", "isBusinessProfileAvailable", "isInquiriesAvailable", "isInventoryFeaturesAvailable", "<init>", "(ZZZ)V", "component1", "()Z", "component2", "component3", "copy", "(ZZZ)Lcom/paypal/oslo/feature/businessprofile/ui/provider/SalesToolsUiFeatureGatesProvider;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SalesToolsUiFeatureGatesProvider {
    public static final int $stable = 0;
    private final boolean isBusinessProfileAvailable;
    private final boolean isInquiriesAvailable;
    private final boolean isInventoryFeaturesAvailable;

    public SalesToolsUiFeatureGatesProvider(boolean z, boolean z2, boolean z3) {
        this.isBusinessProfileAvailable = z;
        this.isInquiriesAvailable = z2;
        this.isInventoryFeaturesAvailable = z3;
    }

    public final boolean isBusinessProfileAvailable() {
        return this.isBusinessProfileAvailable;
    }

    public final boolean isInquiriesAvailable() {
        return this.isInquiriesAvailable;
    }

    public final boolean isInventoryFeaturesAvailable() {
        return this.isInventoryFeaturesAvailable;
    }

    public final java.lang.String toString() {
        boolean z = this.isBusinessProfileAvailable;
        boolean z2 = this.isInquiriesAvailable;
        boolean z3 = this.isInventoryFeaturesAvailable;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SalesToolsUiFeatureGatesProvider(isBusinessProfileAvailable=");
        sb.append(z);
        sb.append(", isInquiriesAvailable=");
        sb.append(z2);
        sb.append(", isInventoryFeaturesAvailable=");
        sb.append(z3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((java.lang.Boolean.hashCode(this.isBusinessProfileAvailable) * 31) + java.lang.Boolean.hashCode(this.isInquiriesAvailable)) * 31) + java.lang.Boolean.hashCode(this.isInventoryFeaturesAvailable);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.businessprofile.ui.provider.SalesToolsUiFeatureGatesProvider)) {
            return false;
        }
        com.paypal.oslo.feature.businessprofile.ui.provider.SalesToolsUiFeatureGatesProvider salesToolsUiFeatureGatesProvider = (com.paypal.oslo.feature.businessprofile.ui.provider.SalesToolsUiFeatureGatesProvider) other;
        return this.isBusinessProfileAvailable == salesToolsUiFeatureGatesProvider.isBusinessProfileAvailable && this.isInquiriesAvailable == salesToolsUiFeatureGatesProvider.isInquiriesAvailable && this.isInventoryFeaturesAvailable == salesToolsUiFeatureGatesProvider.isInventoryFeaturesAvailable;
    }

    public final com.paypal.oslo.feature.businessprofile.ui.provider.SalesToolsUiFeatureGatesProvider copy(boolean isBusinessProfileAvailable, boolean isInquiriesAvailable, boolean isInventoryFeaturesAvailable) {
        return new com.paypal.oslo.feature.businessprofile.ui.provider.SalesToolsUiFeatureGatesProvider(isBusinessProfileAvailable, isInquiriesAvailable, isInventoryFeaturesAvailable);
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsInventoryFeaturesAvailable() {
        return this.isInventoryFeaturesAvailable;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsInquiriesAvailable() {
        return this.isInquiriesAvailable;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsBusinessProfileAvailable() {
        return this.isBusinessProfileAvailable;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businessprofile.ui.provider.SalesToolsUiFeatureGatesProvider copy$default(com.paypal.oslo.feature.businessprofile.ui.provider.SalesToolsUiFeatureGatesProvider salesToolsUiFeatureGatesProvider, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = salesToolsUiFeatureGatesProvider.isBusinessProfileAvailable;
        }
        if ((i & 2) != 0) {
            z2 = salesToolsUiFeatureGatesProvider.isInquiriesAvailable;
        }
        if ((i & 4) != 0) {
            z3 = salesToolsUiFeatureGatesProvider.isInventoryFeaturesAvailable;
        }
        return salesToolsUiFeatureGatesProvider.copy(z, z2, z3);
    }
}
