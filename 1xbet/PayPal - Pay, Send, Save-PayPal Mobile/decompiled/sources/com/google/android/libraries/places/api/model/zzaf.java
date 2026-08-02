package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzaf extends com.google.android.libraries.places.api.model.FuelPrice.Builder {
    private com.google.android.libraries.places.api.model.FuelPrice.FuelType zza;
    private com.google.android.libraries.places.api.model.Money zzb;
    private java.time.Instant zzc;

    @Override // com.google.android.libraries.places.api.model.FuelPrice.Builder
    public final com.google.android.libraries.places.api.model.FuelPrice build() {
        com.google.android.libraries.places.api.model.Money money;
        java.time.Instant instant;
        com.google.android.libraries.places.api.model.FuelPrice.FuelType fuelType = this.zza;
        if (fuelType != null && (money = this.zzb) != null && (instant = this.zzc) != null) {
            return new com.google.android.libraries.places.api.model.zzdq(fuelType, money, instant);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.zza == null) {
            sb.append(" type");
        }
        if (this.zzb == null) {
            sb.append(" price");
        }
        if (this.zzc == null) {
            sb.append(" updateTime");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.libraries.places.api.model.FuelPrice.Builder
    public final com.google.android.libraries.places.api.model.FuelPrice.Builder setPrice(com.google.android.libraries.places.api.model.Money money) {
        if (money == null) {
            throw new java.lang.NullPointerException("Null price");
        }
        this.zzb = money;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.FuelPrice.Builder
    public final com.google.android.libraries.places.api.model.FuelPrice.Builder setType(com.google.android.libraries.places.api.model.FuelPrice.FuelType fuelType) {
        if (fuelType == null) {
            throw new java.lang.NullPointerException("Null type");
        }
        this.zza = fuelType;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.FuelPrice.Builder
    public final com.google.android.libraries.places.api.model.FuelPrice.Builder setUpdateTime(java.time.Instant instant) {
        if (instant == null) {
            throw new java.lang.NullPointerException("Null updateTime");
        }
        this.zzc = instant;
        return this;
    }

    zzaf() {
    }
}
