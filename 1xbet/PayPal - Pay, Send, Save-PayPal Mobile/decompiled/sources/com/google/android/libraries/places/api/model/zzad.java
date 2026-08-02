package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzad extends com.google.android.libraries.places.api.model.FuelOptions.Builder {
    private java.util.List zza;

    @Override // com.google.android.libraries.places.api.model.FuelOptions.Builder
    public final java.util.List<com.google.android.libraries.places.api.model.FuelPrice> getFuelPrices() {
        java.util.List<com.google.android.libraries.places.api.model.FuelPrice> list = this.zza;
        if (list != null) {
            return list;
        }
        throw new java.lang.IllegalStateException("Property \"fuelPrices\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.FuelOptions.Builder
    public final com.google.android.libraries.places.api.model.FuelOptions.Builder setFuelPrices(java.util.List<com.google.android.libraries.places.api.model.FuelPrice> list) {
        if (list == null) {
            throw new java.lang.NullPointerException("Null fuelPrices");
        }
        this.zza = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.FuelOptions.Builder
    final com.google.android.libraries.places.api.model.FuelOptions zza() {
        java.util.List list = this.zza;
        if (list != null) {
            return new com.google.android.libraries.places.api.model.zzdo(list);
        }
        throw new java.lang.IllegalStateException("Missing required properties: fuelPrices");
    }

    zzad() {
    }
}
