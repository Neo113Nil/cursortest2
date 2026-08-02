package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
abstract class zzag extends com.google.android.libraries.places.api.model.FuelPrice {
    private final com.google.android.libraries.places.api.model.FuelPrice.FuelType zza;
    private final com.google.android.libraries.places.api.model.Money zzb;
    private final java.time.Instant zzc;

    zzag(com.google.android.libraries.places.api.model.FuelPrice.FuelType fuelType, com.google.android.libraries.places.api.model.Money money, java.time.Instant instant) {
        if (fuelType == null) {
            throw new java.lang.NullPointerException("Null type");
        }
        this.zza = fuelType;
        if (money == null) {
            throw new java.lang.NullPointerException("Null price");
        }
        this.zzb = money;
        if (instant == null) {
            throw new java.lang.NullPointerException("Null updateTime");
        }
        this.zzc = instant;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.api.model.FuelPrice)) {
            return false;
        }
        com.google.android.libraries.places.api.model.FuelPrice fuelPrice = (com.google.android.libraries.places.api.model.FuelPrice) obj;
        return this.zza.equals(fuelPrice.getType()) && this.zzb.equals(fuelPrice.getPrice()) && this.zzc.equals(fuelPrice.getUpdateTime());
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode();
        return ((((hashCode ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.zza.toString();
        int length = obj.length();
        java.lang.String obj2 = this.zzb.toString();
        int length2 = obj2.length();
        java.lang.String obj3 = this.zzc.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 23 + length2 + 13 + obj3.length() + 1);
        sb.append("FuelPrice{type=");
        sb.append(obj);
        sb.append(", price=");
        sb.append(obj2);
        sb.append(", updateTime=");
        sb.append(obj3);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.model.FuelPrice
    public final java.time.Instant getUpdateTime() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.FuelPrice
    public final com.google.android.libraries.places.api.model.FuelPrice.FuelType getType() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.FuelPrice
    public final com.google.android.libraries.places.api.model.Money getPrice() {
        return this.zzb;
    }
}
