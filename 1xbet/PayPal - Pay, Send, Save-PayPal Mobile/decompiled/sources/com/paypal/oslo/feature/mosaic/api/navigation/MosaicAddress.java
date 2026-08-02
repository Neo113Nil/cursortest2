package com.paypal.oslo.feature.mosaic.api.navigation;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u0003\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/api/navigation/MosaicAddress;", "", "", "isPrimary", "", "onLineLabel", "Lcom/paypal/oslo/feature/mosaic/api/navigation/AddressItem;", "address", "<init>", "(ZLjava/lang/String;Lcom/paypal/oslo/feature/mosaic/api/navigation/AddressItem;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/feature/mosaic/api/navigation/AddressItem;", "copy", "(ZLjava/lang/String;Lcom/paypal/oslo/feature/mosaic/api/navigation/AddressItem;)Lcom/paypal/oslo/feature/mosaic/api/navigation/MosaicAddress;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "Ljava/lang/String;", "getOnLineLabel", "Lcom/paypal/oslo/feature/mosaic/api/navigation/AddressItem;", "getAddress"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class MosaicAddress {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.mosaic.api.navigation.AddressItem address;
    private final boolean isPrimary;
    private final java.lang.String onLineLabel;

    public MosaicAddress(boolean z, java.lang.String str, com.paypal.oslo.feature.mosaic.api.navigation.AddressItem addressItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressItem, "");
        this.isPrimary = z;
        this.onLineLabel = str;
        this.address = addressItem;
    }

    public final boolean isPrimary() {
        return this.isPrimary;
    }

    public final java.lang.String getOnLineLabel() {
        return this.onLineLabel;
    }

    public final com.paypal.oslo.feature.mosaic.api.navigation.AddressItem getAddress() {
        return this.address;
    }

    public final java.lang.String toString() {
        boolean z = this.isPrimary;
        java.lang.String str = this.onLineLabel;
        com.paypal.oslo.feature.mosaic.api.navigation.AddressItem addressItem = this.address;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MosaicAddress(isPrimary=");
        sb.append(z);
        sb.append(", onLineLabel=");
        sb.append(str);
        sb.append(", address=");
        sb.append(addressItem);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((java.lang.Boolean.hashCode(this.isPrimary) * 31) + this.onLineLabel.hashCode()) * 31) + this.address.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.mosaic.api.navigation.MosaicAddress)) {
            return false;
        }
        com.paypal.oslo.feature.mosaic.api.navigation.MosaicAddress mosaicAddress = (com.paypal.oslo.feature.mosaic.api.navigation.MosaicAddress) other;
        return this.isPrimary == mosaicAddress.isPrimary && kotlin.jvm.internal.Intrinsics.areEqual(this.onLineLabel, mosaicAddress.onLineLabel) && kotlin.jvm.internal.Intrinsics.areEqual(this.address, mosaicAddress.address);
    }

    public final com.paypal.oslo.feature.mosaic.api.navigation.MosaicAddress copy(boolean isPrimary, java.lang.String onLineLabel, com.paypal.oslo.feature.mosaic.api.navigation.AddressItem address) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onLineLabel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        return new com.paypal.oslo.feature.mosaic.api.navigation.MosaicAddress(isPrimary, onLineLabel, address);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.mosaic.api.navigation.AddressItem getAddress() {
        return this.address;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getOnLineLabel() {
        return this.onLineLabel;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsPrimary() {
        return this.isPrimary;
    }

    public static /* synthetic */ com.paypal.oslo.feature.mosaic.api.navigation.MosaicAddress copy$default(com.paypal.oslo.feature.mosaic.api.navigation.MosaicAddress mosaicAddress, boolean z, java.lang.String str, com.paypal.oslo.feature.mosaic.api.navigation.AddressItem addressItem, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = mosaicAddress.isPrimary;
        }
        if ((i & 2) != 0) {
            str = mosaicAddress.onLineLabel;
        }
        if ((i & 4) != 0) {
            addressItem = mosaicAddress.address;
        }
        return mosaicAddress.copy(z, str, addressItem);
    }
}
