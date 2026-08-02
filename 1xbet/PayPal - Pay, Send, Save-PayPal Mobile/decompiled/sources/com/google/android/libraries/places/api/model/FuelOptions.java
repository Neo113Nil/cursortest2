package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
public abstract class FuelOptions implements android.os.Parcelable {

    public static abstract class Builder {
        public com.google.android.libraries.places.api.model.FuelOptions build() {
            setFuelPrices(com.google.common.collect.ImmutableList.copyOf((java.util.Collection) getFuelPrices()));
            return zza();
        }

        public abstract java.util.List<com.google.android.libraries.places.api.model.FuelPrice> getFuelPrices();

        public abstract com.google.android.libraries.places.api.model.FuelOptions.Builder setFuelPrices(java.util.List<com.google.android.libraries.places.api.model.FuelPrice> list);

        abstract com.google.android.libraries.places.api.model.FuelOptions zza();
    }

    public static com.google.android.libraries.places.api.model.FuelOptions newInstance(java.util.List<com.google.android.libraries.places.api.model.FuelPrice> list) {
        com.google.android.libraries.places.api.model.zzad zzadVar = new com.google.android.libraries.places.api.model.zzad();
        zzadVar.setFuelPrices(list);
        return zzadVar.build();
    }

    public abstract java.util.List<com.google.android.libraries.places.api.model.FuelPrice> getFuelPrices();
}
