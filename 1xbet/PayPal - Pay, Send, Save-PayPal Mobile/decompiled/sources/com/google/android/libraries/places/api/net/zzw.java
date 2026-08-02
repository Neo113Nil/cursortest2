package com.google.android.libraries.places.api.net;

/* loaded from: classes8.dex */
final class zzw extends com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder {
    private java.lang.String zza;
    private java.util.List zzb;
    private java.util.List zzc;
    private java.util.List zzd;
    private java.util.List zze;
    private java.lang.Integer zzf;
    private com.google.android.libraries.places.api.model.LocationRestriction zzg;
    private java.util.List zzh;
    private com.google.android.gms.tasks.CancellationToken zzi;
    private com.google.android.libraries.places.api.net.SearchNearbyRequest.RankPreference zzj;
    private com.google.android.libraries.places.api.model.RoutingParameters zzk;
    private boolean zzl;
    private byte zzm;

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final com.google.android.libraries.places.api.model.LocationRestriction getLocationRestriction() {
        com.google.android.libraries.places.api.model.LocationRestriction locationRestriction = this.zzg;
        if (locationRestriction != null) {
            return locationRestriction;
        }
        throw new java.lang.IllegalStateException("Property \"locationRestriction\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final java.util.List<com.google.android.libraries.places.api.model.Place.Field> getPlaceFields() {
        java.util.List<com.google.android.libraries.places.api.model.Place.Field> list = this.zzh;
        if (list != null) {
            return list;
        }
        throw new java.lang.IllegalStateException("Property \"placeFields\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final boolean isRoutingSummariesIncluded() {
        if (this.zzm != 0) {
            return this.zzl;
        }
        throw new java.lang.IllegalStateException("Property \"routingSummariesIncluded\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder setLocationRestriction(com.google.android.libraries.places.api.model.LocationRestriction locationRestriction) {
        if (locationRestriction == null) {
            throw new java.lang.NullPointerException("Null locationRestriction");
        }
        this.zzg = locationRestriction;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder setPlaceFields(java.util.List<com.google.android.libraries.places.api.model.Place.Field> list) {
        if (list == null) {
            throw new java.lang.NullPointerException("Null placeFields");
        }
        this.zzh = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    final com.google.android.libraries.places.api.net.SearchNearbyRequest zza() {
        com.google.android.libraries.places.api.model.LocationRestriction locationRestriction;
        java.util.List list;
        if (this.zzm == 1 && (locationRestriction = this.zzg) != null && (list = this.zzh) != null) {
            return new com.google.android.libraries.places.api.net.zzx(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, locationRestriction, list, this.zzi, this.zzj, this.zzk, this.zzl, null);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.zzg == null) {
            sb.append(" locationRestriction");
        }
        if (this.zzh == null) {
            sb.append(" placeFields");
        }
        if (this.zzm == 0) {
            sb.append(" routingSummariesIncluded");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder setRoutingSummariesIncluded(boolean z) {
        this.zzl = z;
        this.zzm = (byte) 1;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder setRoutingParameters(com.google.android.libraries.places.api.model.RoutingParameters routingParameters) {
        this.zzk = routingParameters;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder setRegionCode(java.lang.String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder setRankPreference(com.google.android.libraries.places.api.net.SearchNearbyRequest.RankPreference rankPreference) {
        this.zzj = rankPreference;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder setMaxResultCount(java.lang.Integer num) {
        this.zzf = num;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder setIncludedTypes(java.util.List<java.lang.String> list) {
        this.zzb = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder setIncludedPrimaryTypes(java.util.List<java.lang.String> list) {
        this.zzd = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder setExcludedTypes(java.util.List<java.lang.String> list) {
        this.zzc = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder setExcludedPrimaryTypes(java.util.List<java.lang.String> list) {
        this.zze = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder setCancellationToken(com.google.android.gms.tasks.CancellationToken cancellationToken) {
        this.zzi = cancellationToken;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final com.google.android.libraries.places.api.model.RoutingParameters getRoutingParameters() {
        return this.zzk;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final java.lang.String getRegionCode() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final com.google.android.libraries.places.api.net.SearchNearbyRequest.RankPreference getRankPreference() {
        return this.zzj;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final java.lang.Integer getMaxResultCount() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final java.util.List<java.lang.String> getIncludedTypes() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final java.util.List<java.lang.String> getIncludedPrimaryTypes() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final java.util.List<java.lang.String> getExcludedTypes() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final java.util.List<java.lang.String> getExcludedPrimaryTypes() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final com.google.android.gms.tasks.CancellationToken getCancellationToken() {
        return this.zzi;
    }

    zzw(com.google.android.libraries.places.api.net.SearchNearbyRequest searchNearbyRequest) {
        this.zza = searchNearbyRequest.getRegionCode();
        this.zzb = searchNearbyRequest.getIncludedTypes();
        this.zzc = searchNearbyRequest.getExcludedTypes();
        this.zzd = searchNearbyRequest.getIncludedPrimaryTypes();
        this.zze = searchNearbyRequest.getExcludedPrimaryTypes();
        this.zzf = searchNearbyRequest.getMaxResultCount();
        this.zzg = searchNearbyRequest.getLocationRestriction();
        this.zzh = searchNearbyRequest.getPlaceFields();
        this.zzi = searchNearbyRequest.getCancellationToken();
        this.zzj = searchNearbyRequest.getRankPreference();
        this.zzk = searchNearbyRequest.getRoutingParameters();
        this.zzl = searchNearbyRequest.isRoutingSummariesIncluded();
        this.zzm = (byte) 1;
    }

    zzw() {
    }
}
