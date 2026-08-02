package com.google.android.libraries.places.api.net;

/* loaded from: classes.dex */
public abstract class SearchNearbyRequest implements com.google.android.libraries.places.internal.zzmq {

    public static abstract class Builder {
        public com.google.android.libraries.places.api.net.SearchNearbyRequest build() {
            java.util.List<com.google.android.libraries.places.api.model.Place.Field> placeFields = getPlaceFields();
            boolean z = getLocationRestriction() instanceof com.google.android.libraries.places.api.model.CircularBounds;
            java.util.List<java.lang.String> includedTypes = getIncludedTypes();
            java.util.List<java.lang.String> excludedTypes = getExcludedTypes();
            java.util.List<java.lang.String> includedPrimaryTypes = getIncludedPrimaryTypes();
            java.util.List<java.lang.String> excludedPrimaryTypes = getExcludedPrimaryTypes();
            com.google.common.base.Preconditions.checkArgument(z, "LocationRestriction must be of type CircularBounds.");
            setPlaceFields(com.google.common.collect.ImmutableList.copyOf((java.util.Collection) placeFields));
            if (includedTypes != null) {
                setIncludedTypes(com.google.common.collect.ImmutableList.copyOf((java.util.Collection) includedTypes));
            }
            if (excludedTypes != null) {
                setExcludedTypes(com.google.common.collect.ImmutableList.copyOf((java.util.Collection) excludedTypes));
            }
            if (includedPrimaryTypes != null) {
                setIncludedPrimaryTypes(com.google.common.collect.ImmutableList.copyOf((java.util.Collection) includedPrimaryTypes));
            }
            if (excludedPrimaryTypes != null) {
                setExcludedPrimaryTypes(com.google.common.collect.ImmutableList.copyOf((java.util.Collection) excludedPrimaryTypes));
            }
            return zza();
        }

        public abstract com.google.android.gms.tasks.CancellationToken getCancellationToken();

        public abstract java.util.List<java.lang.String> getExcludedPrimaryTypes();

        public abstract java.util.List<java.lang.String> getExcludedTypes();

        public abstract java.util.List<java.lang.String> getIncludedPrimaryTypes();

        public abstract java.util.List<java.lang.String> getIncludedTypes();

        public abstract com.google.android.libraries.places.api.model.LocationRestriction getLocationRestriction();

        public abstract java.lang.Integer getMaxResultCount();

        public abstract java.util.List<com.google.android.libraries.places.api.model.Place.Field> getPlaceFields();

        public abstract com.google.android.libraries.places.api.net.SearchNearbyRequest.RankPreference getRankPreference();

        public abstract java.lang.String getRegionCode();

        public abstract com.google.android.libraries.places.api.model.RoutingParameters getRoutingParameters();

        public abstract boolean isRoutingSummariesIncluded();

        public abstract com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder setCancellationToken(com.google.android.gms.tasks.CancellationToken cancellationToken);

        public abstract com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder setExcludedPrimaryTypes(java.util.List<java.lang.String> list);

        public abstract com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder setExcludedTypes(java.util.List<java.lang.String> list);

        public abstract com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder setIncludedPrimaryTypes(java.util.List<java.lang.String> list);

        public abstract com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder setIncludedTypes(java.util.List<java.lang.String> list);

        public abstract com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder setLocationRestriction(com.google.android.libraries.places.api.model.LocationRestriction locationRestriction);

        public abstract com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder setMaxResultCount(java.lang.Integer num);

        public abstract com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder setPlaceFields(java.util.List<com.google.android.libraries.places.api.model.Place.Field> list);

        public abstract com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder setRankPreference(com.google.android.libraries.places.api.net.SearchNearbyRequest.RankPreference rankPreference);

        public abstract com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder setRegionCode(java.lang.String str);

        public abstract com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder setRoutingParameters(com.google.android.libraries.places.api.model.RoutingParameters routingParameters);

        public abstract com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder setRoutingSummariesIncluded(boolean z);

        abstract com.google.android.libraries.places.api.net.SearchNearbyRequest zza();
    }

    /* loaded from: classes8.dex */
    public enum RankPreference {
        DISTANCE,
        POPULARITY
    }

    public static com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder builder(com.google.android.libraries.places.api.model.LocationRestriction locationRestriction, java.util.List<com.google.android.libraries.places.api.model.Place.Field> list) {
        com.google.android.libraries.places.api.net.zzw zzwVar = new com.google.android.libraries.places.api.net.zzw();
        zzwVar.setLocationRestriction(locationRestriction);
        zzwVar.setPlaceFields(list);
        zzwVar.setRoutingSummariesIncluded(false);
        return zzwVar;
    }

    public static com.google.android.libraries.places.api.net.SearchNearbyRequest newInstance(com.google.android.libraries.places.api.model.LocationRestriction locationRestriction, java.util.List<com.google.android.libraries.places.api.model.Place.Field> list) {
        return builder(locationRestriction, list).build();
    }

    @Override // com.google.android.libraries.places.internal.zzmq
    public abstract com.google.android.gms.tasks.CancellationToken getCancellationToken();

    public abstract java.util.List<java.lang.String> getExcludedPrimaryTypes();

    public abstract java.util.List<java.lang.String> getExcludedTypes();

    public abstract java.util.List<java.lang.String> getIncludedPrimaryTypes();

    public abstract java.util.List<java.lang.String> getIncludedTypes();

    public abstract com.google.android.libraries.places.api.model.LocationRestriction getLocationRestriction();

    public abstract java.lang.Integer getMaxResultCount();

    public abstract java.util.List<com.google.android.libraries.places.api.model.Place.Field> getPlaceFields();

    public abstract com.google.android.libraries.places.api.net.SearchNearbyRequest.RankPreference getRankPreference();

    public abstract java.lang.String getRegionCode();

    public abstract com.google.android.libraries.places.api.model.RoutingParameters getRoutingParameters();

    public abstract boolean isRoutingSummariesIncluded();

    public abstract com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder zza();
}
