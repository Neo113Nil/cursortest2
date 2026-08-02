package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
public abstract class RoutingParameters implements android.os.Parcelable {

    public static abstract class Builder {
        public abstract com.google.android.libraries.places.api.model.RoutingParameters build();

        public abstract com.google.android.gms.maps.model.LatLng getOrigin();

        public abstract com.google.android.libraries.places.api.model.RouteModifiers getRouteModifiers();

        public abstract com.google.android.libraries.places.api.model.RoutingParameters.RoutingPreference getRoutingPreference();

        public abstract com.google.android.libraries.places.api.model.RoutingParameters.TravelMode getTravelMode();

        public abstract com.google.android.libraries.places.api.model.RoutingParameters.Builder setOrigin(com.google.android.gms.maps.model.LatLng latLng);

        public abstract com.google.android.libraries.places.api.model.RoutingParameters.Builder setRouteModifiers(com.google.android.libraries.places.api.model.RouteModifiers routeModifiers);

        public abstract com.google.android.libraries.places.api.model.RoutingParameters.Builder setRoutingPreference(com.google.android.libraries.places.api.model.RoutingParameters.RoutingPreference routingPreference);

        public abstract com.google.android.libraries.places.api.model.RoutingParameters.Builder setTravelMode(com.google.android.libraries.places.api.model.RoutingParameters.TravelMode travelMode);
    }

    public enum RoutingPreference implements android.os.Parcelable {
        ROUTING_PREFERENCE_UNSPECIFIED,
        TRAFFIC_UNAWARE,
        TRAFFIC_AWARE,
        TRAFFIC_AWARE_OPTIMAL;

        public static final android.os.Parcelable.Creator<com.google.android.libraries.places.api.model.RoutingParameters.RoutingPreference> CREATOR = new com.google.android.libraries.places.api.model.zzgh();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    public enum TravelMode implements android.os.Parcelable {
        TRAVEL_MODE_UNSPECIFIED,
        DRIVE,
        BICYCLE,
        WALK,
        TWO_WHEELER;

        public static final android.os.Parcelable.Creator<com.google.android.libraries.places.api.model.RoutingParameters.TravelMode> CREATOR = new com.google.android.libraries.places.api.model.zzgi();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    public abstract com.google.android.gms.maps.model.LatLng getOrigin();

    public abstract com.google.android.libraries.places.api.model.RouteModifiers getRouteModifiers();

    public abstract com.google.android.libraries.places.api.model.RoutingParameters.RoutingPreference getRoutingPreference();

    public abstract com.google.android.libraries.places.api.model.RoutingParameters.TravelMode getTravelMode();

    public static com.google.android.libraries.places.api.model.RoutingParameters.Builder builder() {
        return new com.google.android.libraries.places.api.model.zzbt();
    }
}
