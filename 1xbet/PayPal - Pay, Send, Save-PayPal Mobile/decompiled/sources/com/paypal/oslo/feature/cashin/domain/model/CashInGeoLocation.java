package com.paypal.oslo.feature.cashin.domain.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/cashin/domain/model/CashInGeoLocation;", "", "", "latitude", "longitude", "<init>", "(DD)V", "component1", "()D", "component2", "copy", "(DD)Lcom/paypal/oslo/feature/cashin/domain/model/CashInGeoLocation;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "D", "getLatitude", "getLongitude"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CashInGeoLocation {
    public static final int $stable = 0;
    private final double latitude;
    private final double longitude;

    public CashInGeoLocation(double d, double d2) {
        this.latitude = d;
        this.longitude = d2;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final java.lang.String toString() {
        double d = this.latitude;
        double d2 = this.longitude;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CashInGeoLocation(latitude=");
        sb.append(d);
        sb.append(", longitude=");
        sb.append(d2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Double.hashCode(this.latitude) * 31) + java.lang.Double.hashCode(this.longitude);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cashin.domain.model.CashInGeoLocation)) {
            return false;
        }
        com.paypal.oslo.feature.cashin.domain.model.CashInGeoLocation cashInGeoLocation = (com.paypal.oslo.feature.cashin.domain.model.CashInGeoLocation) other;
        return java.lang.Double.compare(this.latitude, cashInGeoLocation.latitude) == 0 && java.lang.Double.compare(this.longitude, cashInGeoLocation.longitude) == 0;
    }

    public final com.paypal.oslo.feature.cashin.domain.model.CashInGeoLocation copy(double latitude, double longitude) {
        return new com.paypal.oslo.feature.cashin.domain.model.CashInGeoLocation(latitude, longitude);
    }

    /* renamed from: component2, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    /* renamed from: component1, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cashin.domain.model.CashInGeoLocation copy$default(com.paypal.oslo.feature.cashin.domain.model.CashInGeoLocation cashInGeoLocation, double d, double d2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            d = cashInGeoLocation.latitude;
        }
        if ((i & 2) != 0) {
            d2 = cashInGeoLocation.longitude;
        }
        return cashInGeoLocation.copy(d, d2);
    }
}
