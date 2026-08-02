package com.google.android.libraries.places.api.net;

/* loaded from: classes.dex */
public abstract class SearchByTextResponse implements com.google.android.libraries.places.api.net.SearchResponse {

    /* loaded from: classes8.dex */
    public static abstract class Builder {
        public abstract com.google.android.libraries.places.api.net.SearchByTextResponse autoBuild();

        public com.google.android.libraries.places.api.net.SearchByTextResponse build() {
            setPlaces(com.google.common.collect.ImmutableList.copyOf((java.util.Collection) getPlaces()));
            java.util.List<com.google.android.libraries.places.api.model.RoutingSummary> routingSummaries = getRoutingSummaries();
            if (routingSummaries != null) {
                setRoutingSummaries(com.google.common.collect.ImmutableList.copyOf((java.util.Collection) routingSummaries));
            }
            return autoBuild();
        }

        public abstract com.google.android.libraries.places.api.net.Pagination getPagination();

        public abstract java.util.List<com.google.android.libraries.places.api.model.Place> getPlaces();

        public abstract java.util.List<com.google.android.libraries.places.api.model.RoutingSummary> getRoutingSummaries();

        public abstract android.net.Uri getSearchUri();

        public abstract com.google.android.libraries.places.api.net.SearchByTextResponse.Builder setPagination(com.google.android.libraries.places.api.net.Pagination pagination);

        public abstract com.google.android.libraries.places.api.net.SearchByTextResponse.Builder setPlaces(java.util.List<com.google.android.libraries.places.api.model.Place> list);

        public abstract com.google.android.libraries.places.api.net.SearchByTextResponse.Builder setRoutingSummaries(java.util.List<com.google.android.libraries.places.api.model.RoutingSummary> list);

        public abstract com.google.android.libraries.places.api.net.SearchByTextResponse.Builder setSearchUri(android.net.Uri uri);

        public abstract com.google.android.libraries.places.api.net.SearchByTextResponse.Builder zza(java.lang.String str);

        public abstract com.google.android.libraries.places.api.net.SearchByTextResponse.Builder zzb(int i);
    }

    public static com.google.android.libraries.places.api.net.SearchByTextResponse.Builder builder(java.util.List<com.google.android.libraries.places.api.model.Place> list) {
        com.google.android.libraries.places.api.net.zzu zzuVar = new com.google.android.libraries.places.api.net.zzu();
        zzuVar.setPlaces(list);
        zzuVar.zzb(1);
        return zzuVar;
    }

    public static com.google.android.libraries.places.api.net.SearchByTextResponse newInstance(java.util.List<com.google.android.libraries.places.api.model.Place> list) {
        com.google.android.libraries.places.api.net.zzu zzuVar = new com.google.android.libraries.places.api.net.zzu();
        zzuVar.setPlaces(list);
        zzuVar.zzb(1);
        return zzuVar.build();
    }

    @Override // com.google.android.libraries.places.api.net.SearchResponse
    public abstract com.google.android.libraries.places.api.net.Pagination getPagination();

    @Override // com.google.android.libraries.places.api.net.SearchResponse
    public abstract java.util.List<com.google.android.libraries.places.api.model.Place> getPlaces();

    @Override // com.google.android.libraries.places.api.net.SearchResponse
    public abstract java.util.List<com.google.android.libraries.places.api.model.RoutingSummary> getRoutingSummaries();

    public abstract android.net.Uri getSearchUri();

    public abstract java.lang.String zza();

    public abstract int zzb();
}
