package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
public abstract class AccessibilityOptions implements android.os.Parcelable {

    public static abstract class Builder {
        public abstract com.google.android.libraries.places.api.model.AccessibilityOptions build();

        public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getWheelchairAccessibleEntrance();

        public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getWheelchairAccessibleParking();

        public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getWheelchairAccessibleRestroom();

        public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getWheelchairAccessibleSeating();

        public abstract com.google.android.libraries.places.api.model.AccessibilityOptions.Builder setWheelchairAccessibleEntrance(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract com.google.android.libraries.places.api.model.AccessibilityOptions.Builder setWheelchairAccessibleParking(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract com.google.android.libraries.places.api.model.AccessibilityOptions.Builder setWheelchairAccessibleRestroom(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract com.google.android.libraries.places.api.model.AccessibilityOptions.Builder setWheelchairAccessibleSeating(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);
    }

    public static com.google.android.libraries.places.api.model.AccessibilityOptions.Builder builder() {
        com.google.android.libraries.places.api.model.zza zzaVar = new com.google.android.libraries.places.api.model.zza();
        zzaVar.setWheelchairAccessibleEntrance(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue.UNKNOWN);
        zzaVar.setWheelchairAccessibleRestroom(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue.UNKNOWN);
        zzaVar.setWheelchairAccessibleParking(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue.UNKNOWN);
        zzaVar.setWheelchairAccessibleSeating(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue.UNKNOWN);
        return zzaVar;
    }

    public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getWheelchairAccessibleEntrance();

    public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getWheelchairAccessibleParking();

    public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getWheelchairAccessibleRestroom();

    public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getWheelchairAccessibleSeating();
}
