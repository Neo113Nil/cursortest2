package com.paypal.oslo.feature.cashin.domain.model;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0012J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0012J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0012J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0012Jt\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b,\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u0017R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b1\u0010\u0012R\u001a\u0010\f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b2\u0010\u0012R\u001a\u0010\r\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b3\u0010\u0012R\u001a\u0010\u000e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b4\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/cashin/domain/model/CashInStore;", "", "", "id", "name", "logoUrl", "markerUrl", "Lcom/paypal/oslo/feature/cashin/domain/model/CashInStoreAddress;", "address", "Lcom/paypal/oslo/feature/cashin/domain/model/CashInGeoLocation;", "geoLocation", "fee", "distance", "retailerId", "partnerId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/cashin/domain/model/CashInStoreAddress;Lcom/paypal/oslo/feature/cashin/domain/model/CashInGeoLocation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/paypal/oslo/feature/cashin/domain/model/CashInStoreAddress;", "component6", "()Lcom/paypal/oslo/feature/cashin/domain/model/CashInGeoLocation;", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/cashin/domain/model/CashInStoreAddress;Lcom/paypal/oslo/feature/cashin/domain/model/CashInGeoLocation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/cashin/domain/model/CashInStore;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getName", "getLogoUrl", "getMarkerUrl", "Lcom/paypal/oslo/feature/cashin/domain/model/CashInStoreAddress;", "getAddress", "Lcom/paypal/oslo/feature/cashin/domain/model/CashInGeoLocation;", "getGeoLocation", "getFee", "getDistance", "getRetailerId", "getPartnerId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CashInStore {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.cashin.domain.model.CashInStoreAddress address;
    private final java.lang.String distance;
    private final java.lang.String fee;
    private final com.paypal.oslo.feature.cashin.domain.model.CashInGeoLocation geoLocation;
    private final java.lang.String id;
    private final java.lang.String logoUrl;
    private final java.lang.String markerUrl;
    private final java.lang.String name;
    private final java.lang.String partnerId;
    private final java.lang.String retailerId;

    public CashInStore(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.cashin.domain.model.CashInStoreAddress cashInStoreAddress, com.paypal.oslo.feature.cashin.domain.model.CashInGeoLocation cashInGeoLocation, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cashInStoreAddress, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cashInGeoLocation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str8, "");
        this.id = str;
        this.name = str2;
        this.logoUrl = str3;
        this.markerUrl = str4;
        this.address = cashInStoreAddress;
        this.geoLocation = cashInGeoLocation;
        this.fee = str5;
        this.distance = str6;
        this.retailerId = str7;
        this.partnerId = str8;
    }

    public /* synthetic */ CashInStore(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.cashin.domain.model.CashInStoreAddress cashInStoreAddress, com.paypal.oslo.feature.cashin.domain.model.CashInGeoLocation cashInGeoLocation, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, cashInStoreAddress, cashInGeoLocation, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? "" : str6, (i & 256) != 0 ? "" : str7, (i & 512) != 0 ? "" : str8);
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getLogoUrl() {
        return this.logoUrl;
    }

    public final java.lang.String getMarkerUrl() {
        return this.markerUrl;
    }

    public final com.paypal.oslo.feature.cashin.domain.model.CashInStoreAddress getAddress() {
        return this.address;
    }

    public final com.paypal.oslo.feature.cashin.domain.model.CashInGeoLocation getGeoLocation() {
        return this.geoLocation;
    }

    public final java.lang.String getFee() {
        return this.fee;
    }

    public final java.lang.String getDistance() {
        return this.distance;
    }

    public final java.lang.String getRetailerId() {
        return this.retailerId;
    }

    public final java.lang.String getPartnerId() {
        return this.partnerId;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.name;
        java.lang.String str3 = this.logoUrl;
        java.lang.String str4 = this.markerUrl;
        com.paypal.oslo.feature.cashin.domain.model.CashInStoreAddress cashInStoreAddress = this.address;
        com.paypal.oslo.feature.cashin.domain.model.CashInGeoLocation cashInGeoLocation = this.geoLocation;
        java.lang.String str5 = this.fee;
        java.lang.String str6 = this.distance;
        java.lang.String str7 = this.retailerId;
        java.lang.String str8 = this.partnerId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CashInStore(id=");
        sb.append(str);
        sb.append(", name=");
        sb.append(str2);
        sb.append(", logoUrl=");
        sb.append(str3);
        sb.append(", markerUrl=");
        sb.append(str4);
        sb.append(", address=");
        sb.append(cashInStoreAddress);
        sb.append(", geoLocation=");
        sb.append(cashInGeoLocation);
        sb.append(", fee=");
        sb.append(str5);
        sb.append(", distance=");
        sb.append(str6);
        sb.append(", retailerId=");
        sb.append(str7);
        sb.append(", partnerId=");
        sb.append(str8);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((((((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.logoUrl.hashCode()) * 31) + this.markerUrl.hashCode()) * 31) + this.address.hashCode()) * 31) + this.geoLocation.hashCode()) * 31) + this.fee.hashCode()) * 31) + this.distance.hashCode()) * 31) + this.retailerId.hashCode()) * 31) + this.partnerId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cashin.domain.model.CashInStore)) {
            return false;
        }
        com.paypal.oslo.feature.cashin.domain.model.CashInStore cashInStore = (com.paypal.oslo.feature.cashin.domain.model.CashInStore) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, cashInStore.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, cashInStore.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.logoUrl, cashInStore.logoUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.markerUrl, cashInStore.markerUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.address, cashInStore.address) && kotlin.jvm.internal.Intrinsics.areEqual(this.geoLocation, cashInStore.geoLocation) && kotlin.jvm.internal.Intrinsics.areEqual(this.fee, cashInStore.fee) && kotlin.jvm.internal.Intrinsics.areEqual(this.distance, cashInStore.distance) && kotlin.jvm.internal.Intrinsics.areEqual(this.retailerId, cashInStore.retailerId) && kotlin.jvm.internal.Intrinsics.areEqual(this.partnerId, cashInStore.partnerId);
    }

    public final com.paypal.oslo.feature.cashin.domain.model.CashInStore copy(java.lang.String id, java.lang.String name2, java.lang.String logoUrl, java.lang.String markerUrl, com.paypal.oslo.feature.cashin.domain.model.CashInStoreAddress address, com.paypal.oslo.feature.cashin.domain.model.CashInGeoLocation geoLocation, java.lang.String fee, java.lang.String distance, java.lang.String retailerId, java.lang.String partnerId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logoUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markerUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(geoLocation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fee, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(distance, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(retailerId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partnerId, "");
        return new com.paypal.oslo.feature.cashin.domain.model.CashInStore(id, name2, logoUrl, markerUrl, address, geoLocation, fee, distance, retailerId, partnerId);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getRetailerId() {
        return this.retailerId;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getDistance() {
        return this.distance;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getFee() {
        return this.fee;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.cashin.domain.model.CashInGeoLocation getGeoLocation() {
        return this.geoLocation;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.cashin.domain.model.CashInStoreAddress getAddress() {
        return this.address;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getMarkerUrl() {
        return this.markerUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getLogoUrl() {
        return this.logoUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.String getPartnerId() {
        return this.partnerId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }
}
