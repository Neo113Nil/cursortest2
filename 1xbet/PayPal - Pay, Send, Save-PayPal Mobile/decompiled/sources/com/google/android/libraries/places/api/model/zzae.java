package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
abstract class zzae extends com.google.android.libraries.places.api.model.FuelOptions {
    private final java.util.List zza;

    zzae(java.util.List list) {
        if (list == null) {
            throw new java.lang.NullPointerException("Null fuelPrices");
        }
        this.zza = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.libraries.places.api.model.FuelOptions) {
            return this.zza.equals(((com.google.android.libraries.places.api.model.FuelOptions) obj).getFuelPrices());
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.zza.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(obj.length() + 24);
        sb.append("FuelOptions{fuelPrices=");
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.model.FuelOptions
    public final java.util.List<com.google.android.libraries.places.api.model.FuelPrice> getFuelPrices() {
        return this.zza;
    }
}
