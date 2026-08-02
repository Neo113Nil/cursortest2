package com.google.android.libraries.places.api.net;

/* loaded from: classes8.dex */
final class zzy extends com.google.android.libraries.places.api.net.SearchNearbyResponse.Builder {
    private java.util.List zza;
    private java.util.List zzb;

    @Override // com.google.android.libraries.places.api.net.SearchNearbyResponse.Builder
    public final com.google.android.libraries.places.api.net.SearchNearbyResponse autoBuild() {
        java.util.List list = this.zza;
        if (list != null) {
            return new com.google.android.libraries.places.api.net.zzz(list, this.zzb, null);
        }
        throw new java.lang.IllegalStateException("Missing required properties: places");
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyResponse.Builder
    public final java.util.List<com.google.android.libraries.places.api.model.Place> getPlaces() {
        java.util.List<com.google.android.libraries.places.api.model.Place> list = this.zza;
        if (list != null) {
            return list;
        }
        throw new java.lang.IllegalStateException("Property \"places\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyResponse.Builder
    public final com.google.android.libraries.places.api.net.SearchNearbyResponse.Builder setPlaces(java.util.List<com.google.android.libraries.places.api.model.Place> list) {
        if (list == null) {
            throw new java.lang.NullPointerException("Null places");
        }
        this.zza = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyResponse.Builder
    public final com.google.android.libraries.places.api.net.SearchNearbyResponse.Builder setRoutingSummaries(java.util.List<com.google.android.libraries.places.api.model.RoutingSummary> list) {
        this.zzb = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyResponse.Builder
    public final java.util.List<com.google.android.libraries.places.api.model.RoutingSummary> getRoutingSummaries() {
        return this.zzb;
    }

    zzy() {
    }
}
