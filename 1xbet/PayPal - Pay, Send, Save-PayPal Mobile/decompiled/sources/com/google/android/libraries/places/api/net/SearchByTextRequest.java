package com.google.android.libraries.places.api.net;

/* loaded from: classes.dex */
public abstract class SearchByTextRequest implements com.google.android.libraries.places.internal.zzmq {

    public static abstract class Builder {
        public com.google.android.libraries.places.api.net.SearchByTextRequest build() {
            setPlaceFields(com.google.common.collect.ImmutableList.copyOf((java.util.Collection) getPlaceFields()));
            setPriceLevels(com.google.common.collect.ImmutableList.copyOf((java.util.Collection) getPriceLevels()));
            java.lang.Double minRating = getMinRating();
            java.lang.Double valueOf = java.lang.Double.valueOf(5.0d);
            java.lang.Double valueOf2 = java.lang.Double.valueOf(1.0d);
            if (minRating != null) {
                com.google.common.base.Preconditions.checkArgument(minRating.doubleValue() >= 1.0d && minRating.doubleValue() <= 5.0d, "Min rating must not be out of range of %s to %s, but was: %s.", valueOf2, valueOf, minRating);
            }
            java.util.List<java.lang.Integer> priceLevels = getPriceLevels();
            if (!priceLevels.isEmpty()) {
                for (java.lang.Integer num : priceLevels) {
                    com.google.common.base.Preconditions.checkArgument(com.google.common.collect.Range.closed(0, 4).contains(num), "Price level must not be out of range of %s to %s, but was: %s.", valueOf2, valueOf, num);
                }
            }
            return zzc();
        }

        public abstract com.google.android.gms.tasks.CancellationToken getCancellationToken();

        public abstract com.google.android.libraries.places.api.model.EVSearchOptions getEvSearchOptions();

        public abstract java.lang.String getIncludedType();

        public abstract com.google.android.libraries.places.api.model.LocationBias getLocationBias();

        public abstract com.google.android.libraries.places.api.model.LocationRestriction getLocationRestriction();

        public abstract java.lang.Integer getMaxResultCount();

        public abstract java.lang.Double getMinRating();

        public abstract java.util.List<com.google.android.libraries.places.api.model.Place.Field> getPlaceFields();

        public abstract java.util.List<java.lang.Integer> getPriceLevels();

        public abstract com.google.android.libraries.places.api.net.SearchByTextRequest.RankPreference getRankPreference();

        public abstract java.lang.String getRegionCode();

        public abstract com.google.android.libraries.places.api.model.RoutingParameters getRoutingParameters();

        public abstract com.google.android.libraries.places.api.model.SearchAlongRouteParameters getSearchAlongRouteParameters();

        public abstract java.lang.String getTextQuery();

        public abstract boolean isOpenNow();

        public abstract boolean isPureServiceAreaBusinessesIncluded();

        public abstract boolean isRoutingSummariesIncluded();

        public abstract boolean isSearchUriIncluded();

        public abstract boolean isStrictTypeFiltering();

        public abstract com.google.android.libraries.places.api.net.SearchByTextRequest.Builder setCancellationToken(com.google.android.gms.tasks.CancellationToken cancellationToken);

        public abstract com.google.android.libraries.places.api.net.SearchByTextRequest.Builder setEvSearchOptions(com.google.android.libraries.places.api.model.EVSearchOptions eVSearchOptions);

        public abstract com.google.android.libraries.places.api.net.SearchByTextRequest.Builder setIncludedType(java.lang.String str);

        public abstract com.google.android.libraries.places.api.net.SearchByTextRequest.Builder setLocationBias(com.google.android.libraries.places.api.model.LocationBias locationBias);

        public abstract com.google.android.libraries.places.api.net.SearchByTextRequest.Builder setLocationRestriction(com.google.android.libraries.places.api.model.LocationRestriction locationRestriction);

        public abstract com.google.android.libraries.places.api.net.SearchByTextRequest.Builder setMaxResultCount(java.lang.Integer num);

        public abstract com.google.android.libraries.places.api.net.SearchByTextRequest.Builder setMinRating(java.lang.Double d);

        public abstract com.google.android.libraries.places.api.net.SearchByTextRequest.Builder setOpenNow(boolean z);

        public abstract com.google.android.libraries.places.api.net.SearchByTextRequest.Builder setPlaceFields(java.util.List<com.google.android.libraries.places.api.model.Place.Field> list);

        public abstract com.google.android.libraries.places.api.net.SearchByTextRequest.Builder setPriceLevels(java.util.List<java.lang.Integer> list);

        public abstract com.google.android.libraries.places.api.net.SearchByTextRequest.Builder setPureServiceAreaBusinessesIncluded(boolean z);

        public abstract com.google.android.libraries.places.api.net.SearchByTextRequest.Builder setRankPreference(com.google.android.libraries.places.api.net.SearchByTextRequest.RankPreference rankPreference);

        public abstract com.google.android.libraries.places.api.net.SearchByTextRequest.Builder setRegionCode(java.lang.String str);

        public abstract com.google.android.libraries.places.api.net.SearchByTextRequest.Builder setRoutingParameters(com.google.android.libraries.places.api.model.RoutingParameters routingParameters);

        public abstract com.google.android.libraries.places.api.net.SearchByTextRequest.Builder setRoutingSummariesIncluded(boolean z);

        public abstract com.google.android.libraries.places.api.net.SearchByTextRequest.Builder setSearchAlongRouteParameters(com.google.android.libraries.places.api.model.SearchAlongRouteParameters searchAlongRouteParameters);

        public abstract com.google.android.libraries.places.api.net.SearchByTextRequest.Builder setSearchUriIncluded(boolean z);

        public abstract com.google.android.libraries.places.api.net.SearchByTextRequest.Builder setStrictTypeFiltering(boolean z);

        public abstract com.google.android.libraries.places.api.net.SearchByTextRequest.Builder setTextQuery(java.lang.String str);

        public abstract com.google.android.libraries.places.api.net.SearchByTextRequest.Builder zza(java.lang.String str);

        public abstract com.google.android.libraries.places.api.net.SearchByTextRequest.Builder zzb(int i);

        abstract com.google.android.libraries.places.api.net.SearchByTextRequest zzc();
    }

    /* loaded from: classes8.dex */
    public enum RankPreference {
        DISTANCE,
        RELEVANCE
    }

    public static com.google.android.libraries.places.api.net.SearchByTextRequest.Builder builder(java.lang.String str, java.util.List<com.google.android.libraries.places.api.model.Place.Field> list) {
        com.google.android.libraries.places.api.net.zzs zzsVar = new com.google.android.libraries.places.api.net.zzs();
        zzsVar.setOpenNow(false);
        zzsVar.setPlaceFields(list);
        zzsVar.setPriceLevels(new java.util.ArrayList());
        zzsVar.setTextQuery(str);
        zzsVar.setStrictTypeFiltering(false);
        zzsVar.setRoutingSummariesIncluded(false);
        zzsVar.setPureServiceAreaBusinessesIncluded(false);
        zzsVar.zzb(1);
        zzsVar.setSearchUriIncluded(false);
        return zzsVar;
    }

    public static com.google.android.libraries.places.api.net.SearchByTextRequest newInstance(java.lang.String str, java.util.List<com.google.android.libraries.places.api.model.Place.Field> list) {
        return builder(str, list).build();
    }

    public abstract com.google.android.libraries.places.api.model.EVSearchOptions getEvSearchOptions();

    public abstract java.lang.String getIncludedType();

    public abstract com.google.android.libraries.places.api.model.LocationBias getLocationBias();

    public abstract com.google.android.libraries.places.api.model.LocationRestriction getLocationRestriction();

    public abstract java.lang.Integer getMaxResultCount();

    public abstract java.lang.Double getMinRating();

    public abstract java.util.List<com.google.android.libraries.places.api.model.Place.Field> getPlaceFields();

    public abstract java.util.List<java.lang.Integer> getPriceLevels();

    public abstract com.google.android.libraries.places.api.net.SearchByTextRequest.RankPreference getRankPreference();

    public abstract java.lang.String getRegionCode();

    public abstract com.google.android.libraries.places.api.model.RoutingParameters getRoutingParameters();

    public abstract com.google.android.libraries.places.api.model.SearchAlongRouteParameters getSearchAlongRouteParameters();

    public abstract java.lang.String getTextQuery();

    public abstract boolean isOpenNow();

    public abstract boolean isPureServiceAreaBusinessesIncluded();

    public abstract boolean isRoutingSummariesIncluded();

    public abstract boolean isSearchUriIncluded();

    public abstract boolean isStrictTypeFiltering();

    public abstract java.lang.String zza();

    public abstract int zzb();

    public abstract com.google.android.libraries.places.api.net.SearchByTextRequest.Builder zzc();
}
