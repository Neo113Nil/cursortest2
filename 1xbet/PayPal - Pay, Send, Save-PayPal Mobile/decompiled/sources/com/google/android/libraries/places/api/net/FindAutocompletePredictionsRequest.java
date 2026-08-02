package com.google.android.libraries.places.api.net;

/* loaded from: classes.dex */
public abstract class FindAutocompletePredictionsRequest implements com.google.android.libraries.places.internal.zzmq {

    public static abstract class Builder {
        public com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest build() {
            setCountries(com.google.common.collect.ImmutableList.copyOf((java.util.Collection) getCountries()));
            setTypesFilter(com.google.common.collect.ImmutableList.copyOf((java.util.Collection) getTypesFilter()));
            return zza();
        }

        public abstract com.google.android.gms.tasks.CancellationToken getCancellationToken();

        public abstract java.util.List<java.lang.String> getCountries();

        public abstract java.lang.Integer getInputOffset();

        public abstract com.google.android.libraries.places.api.model.LocationBias getLocationBias();

        public abstract com.google.android.libraries.places.api.model.LocationRestriction getLocationRestriction();

        public abstract com.google.android.gms.maps.model.LatLng getOrigin();

        public abstract java.lang.String getQuery();

        public abstract java.lang.String getRegionCode();

        public abstract com.google.android.libraries.places.api.model.AutocompleteSessionToken getSessionToken();

        public abstract java.util.List<java.lang.String> getTypesFilter();

        public abstract boolean isPureServiceAreaBusinessesIncluded();

        public abstract com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder setCancellationToken(com.google.android.gms.tasks.CancellationToken cancellationToken);

        public abstract com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder setCountries(java.util.List<java.lang.String> list);

        public com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder setCountries(java.lang.String... strArr) {
            return setCountries(com.google.common.collect.ImmutableList.copyOf(strArr));
        }

        public abstract com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder setInputOffset(java.lang.Integer num);

        public abstract com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder setLocationBias(com.google.android.libraries.places.api.model.LocationBias locationBias);

        public abstract com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder setLocationRestriction(com.google.android.libraries.places.api.model.LocationRestriction locationRestriction);

        public abstract com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder setOrigin(com.google.android.gms.maps.model.LatLng latLng);

        public abstract com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder setPureServiceAreaBusinessesIncluded(boolean z);

        public abstract com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder setQuery(java.lang.String str);

        public abstract com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder setRegionCode(java.lang.String str);

        public abstract com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder setSessionToken(com.google.android.libraries.places.api.model.AutocompleteSessionToken autocompleteSessionToken);

        public abstract com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder setTypesFilter(java.util.List<java.lang.String> list);

        abstract com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest zza();
    }

    public static com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder builder() {
        com.google.android.libraries.places.api.net.zzj zzjVar = new com.google.android.libraries.places.api.net.zzj();
        zzjVar.setCountries(new java.util.ArrayList());
        zzjVar.setTypesFilter(new java.util.ArrayList());
        zzjVar.setPureServiceAreaBusinessesIncluded(false);
        return zzjVar;
    }

    public static com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest newInstance(java.lang.String str) {
        com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder builder = builder();
        builder.setQuery(str);
        return builder.build();
    }

    @Override // com.google.android.libraries.places.internal.zzmq
    public abstract com.google.android.gms.tasks.CancellationToken getCancellationToken();

    public abstract java.util.List<java.lang.String> getCountries();

    public abstract java.lang.Integer getInputOffset();

    public abstract com.google.android.libraries.places.api.model.LocationBias getLocationBias();

    public abstract com.google.android.libraries.places.api.model.LocationRestriction getLocationRestriction();

    public abstract com.google.android.gms.maps.model.LatLng getOrigin();

    public abstract java.lang.String getQuery();

    public abstract java.lang.String getRegionCode();

    public abstract com.google.android.libraries.places.api.model.AutocompleteSessionToken getSessionToken();

    public abstract java.util.List<java.lang.String> getTypesFilter();

    public abstract boolean isPureServiceAreaBusinessesIncluded();
}
