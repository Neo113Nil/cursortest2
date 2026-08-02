package com.google.android.libraries.places.api.net;

/* loaded from: classes.dex */
public abstract class SearchNearbyResponse {

    /* loaded from: classes8.dex */
    public static abstract class Builder {
        public abstract com.google.android.libraries.places.api.net.SearchNearbyResponse autoBuild();

        public com.google.android.libraries.places.api.net.SearchNearbyResponse build() {
            setPlaces(com.google.common.collect.ImmutableList.copyOf((java.util.Collection) getPlaces()));
            java.util.List<com.google.android.libraries.places.api.model.RoutingSummary> routingSummaries = getRoutingSummaries();
            if (routingSummaries != null) {
                setRoutingSummaries(com.google.common.collect.ImmutableList.copyOf((java.util.Collection) routingSummaries));
            }
            return autoBuild();
        }

        public abstract java.util.List<com.google.android.libraries.places.api.model.Place> getPlaces();

        public abstract java.util.List<com.google.android.libraries.places.api.model.RoutingSummary> getRoutingSummaries();

        public abstract com.google.android.libraries.places.api.net.SearchNearbyResponse.Builder setPlaces(java.util.List<com.google.android.libraries.places.api.model.Place> list);

        public abstract com.google.android.libraries.places.api.net.SearchNearbyResponse.Builder setRoutingSummaries(java.util.List<com.google.android.libraries.places.api.model.RoutingSummary> list);
    }

    public static com.google.android.libraries.places.api.net.SearchNearbyResponse.Builder builder(java.util.List<com.google.android.libraries.places.api.model.Place> list) {
        com.google.android.libraries.places.api.net.zzy zzyVar = new com.google.android.libraries.places.api.net.zzy();
        zzyVar.setPlaces(list);
        return zzyVar;
    }

    public static com.google.android.libraries.places.api.net.SearchNearbyResponse newInstance(java.util.List<com.google.android.libraries.places.api.model.Place> list) {
        com.google.android.libraries.places.api.net.zzy zzyVar = new com.google.android.libraries.places.api.net.zzy();
        zzyVar.setPlaces(list);
        return zzyVar.build();
    }

    public abstract java.util.List<com.google.android.libraries.places.api.model.Place> getPlaces();

    public abstract java.util.List<com.google.android.libraries.places.api.model.RoutingSummary> getRoutingSummaries();
}
