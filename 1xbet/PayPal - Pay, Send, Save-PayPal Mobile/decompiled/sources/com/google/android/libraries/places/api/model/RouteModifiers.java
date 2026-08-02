package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
public abstract class RouteModifiers implements android.os.Parcelable {

    public static abstract class Builder {
        public abstract com.google.android.libraries.places.api.model.RouteModifiers build();

        public abstract boolean isFerryAvoided();

        public abstract boolean isHighwayAvoided();

        public abstract boolean isIndoorAvoided();

        public abstract boolean isTollAvoided();

        public abstract com.google.android.libraries.places.api.model.RouteModifiers.Builder setFerryAvoided(boolean z);

        public abstract com.google.android.libraries.places.api.model.RouteModifiers.Builder setHighwayAvoided(boolean z);

        public abstract com.google.android.libraries.places.api.model.RouteModifiers.Builder setIndoorAvoided(boolean z);

        public abstract com.google.android.libraries.places.api.model.RouteModifiers.Builder setTollAvoided(boolean z);
    }

    public static com.google.android.libraries.places.api.model.RouteModifiers.Builder builder() {
        com.google.android.libraries.places.api.model.zzbr zzbrVar = new com.google.android.libraries.places.api.model.zzbr();
        zzbrVar.setTollAvoided(false);
        zzbrVar.setHighwayAvoided(false);
        zzbrVar.setFerryAvoided(false);
        zzbrVar.setIndoorAvoided(false);
        return zzbrVar;
    }

    public abstract boolean isFerryAvoided();

    public abstract boolean isHighwayAvoided();

    public abstract boolean isIndoorAvoided();

    public abstract boolean isTollAvoided();
}
