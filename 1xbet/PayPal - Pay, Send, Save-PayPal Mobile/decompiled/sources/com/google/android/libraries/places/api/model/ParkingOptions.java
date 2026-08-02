package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
public abstract class ParkingOptions implements android.os.Parcelable {

    public static abstract class Builder {
        public abstract com.google.android.libraries.places.api.model.ParkingOptions build();

        public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getFreeGarageParking();

        public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getFreeParkingLot();

        public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getFreeStreetParking();

        public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getPaidGarageParking();

        public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getPaidParkingLot();

        public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getPaidStreetParking();

        public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getValetParking();

        public abstract com.google.android.libraries.places.api.model.ParkingOptions.Builder setFreeGarageParking(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract com.google.android.libraries.places.api.model.ParkingOptions.Builder setFreeParkingLot(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract com.google.android.libraries.places.api.model.ParkingOptions.Builder setFreeStreetParking(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract com.google.android.libraries.places.api.model.ParkingOptions.Builder setPaidGarageParking(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract com.google.android.libraries.places.api.model.ParkingOptions.Builder setPaidParkingLot(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract com.google.android.libraries.places.api.model.ParkingOptions.Builder setPaidStreetParking(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract com.google.android.libraries.places.api.model.ParkingOptions.Builder setValetParking(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);
    }

    public static com.google.android.libraries.places.api.model.ParkingOptions.Builder builder() {
        com.google.android.libraries.places.api.model.zzaw zzawVar = new com.google.android.libraries.places.api.model.zzaw();
        zzawVar.setFreeParkingLot(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue.UNKNOWN);
        zzawVar.setPaidParkingLot(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue.UNKNOWN);
        zzawVar.setFreeStreetParking(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue.UNKNOWN);
        zzawVar.setPaidStreetParking(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue.UNKNOWN);
        zzawVar.setValetParking(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue.UNKNOWN);
        zzawVar.setFreeGarageParking(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue.UNKNOWN);
        zzawVar.setPaidGarageParking(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue.UNKNOWN);
        return zzawVar;
    }

    public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getFreeGarageParking();

    public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getFreeParkingLot();

    public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getFreeStreetParking();

    public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getPaidGarageParking();

    public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getPaidParkingLot();

    public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getPaidStreetParking();

    public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getValetParking();
}
