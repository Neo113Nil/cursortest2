package com.google.android.libraries.places.api.model;

/* loaded from: classes4.dex */
public abstract class FuelPrice implements android.os.Parcelable {

    /* loaded from: classes8.dex */
    public static abstract class Builder {
        public abstract com.google.android.libraries.places.api.model.FuelPrice build();

        public abstract com.google.android.libraries.places.api.model.FuelPrice.Builder setPrice(com.google.android.libraries.places.api.model.Money money);

        public abstract com.google.android.libraries.places.api.model.FuelPrice.Builder setType(com.google.android.libraries.places.api.model.FuelPrice.FuelType fuelType);

        public abstract com.google.android.libraries.places.api.model.FuelPrice.Builder setUpdateTime(java.time.Instant instant);
    }

    public enum FuelType implements android.os.Parcelable {
        FUEL_TYPE_UNSPECIFIED,
        DIESEL,
        REGULAR_UNLEADED,
        MIDGRADE,
        PREMIUM,
        SP91,
        SP91_E10,
        SP92,
        SP95,
        SP95_E10,
        SP98,
        SP99,
        SP100,
        LPG,
        E80,
        E85,
        METHANE,
        BIO_DIESEL,
        TRUCK_DIESEL;

        public static final android.os.Parcelable.Creator<com.google.android.libraries.places.api.model.FuelPrice.FuelType> CREATOR = new com.google.android.libraries.places.api.model.zzfv();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    public static com.google.android.libraries.places.api.model.FuelPrice newInstance(com.google.android.libraries.places.api.model.FuelPrice.FuelType fuelType, com.google.android.libraries.places.api.model.Money money, java.time.Instant instant) {
        com.google.android.libraries.places.api.model.zzaf zzafVar = new com.google.android.libraries.places.api.model.zzaf();
        zzafVar.setType(fuelType);
        zzafVar.setPrice(money);
        zzafVar.setUpdateTime(instant);
        return zzafVar.build();
    }

    public abstract com.google.android.libraries.places.api.model.Money getPrice();

    public abstract com.google.android.libraries.places.api.model.FuelPrice.FuelType getType();

    public abstract java.time.Instant getUpdateTime();
}
