package com.google.android.libraries.places.api.net;

/* loaded from: classes8.dex */
final class zzs extends com.google.android.libraries.places.api.net.SearchByTextRequest.Builder {
    private com.google.android.gms.tasks.CancellationToken zza;
    private java.lang.String zzb;
    private com.google.android.libraries.places.api.model.LocationBias zzc;
    private com.google.android.libraries.places.api.model.LocationRestriction zzd;
    private java.lang.Integer zze;
    private java.lang.Double zzf;
    private boolean zzg;
    private java.util.List zzh;
    private java.util.List zzi;
    private com.google.android.libraries.places.api.net.SearchByTextRequest.RankPreference zzj;
    private java.lang.String zzk;
    private boolean zzl;
    private java.lang.String zzm;
    private com.google.android.libraries.places.api.model.EVSearchOptions zzn;
    private com.google.android.libraries.places.api.model.RoutingParameters zzo;
    private com.google.android.libraries.places.api.model.SearchAlongRouteParameters zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private java.lang.String zzt;
    private int zzu;
    private byte zzv;

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final java.util.List<com.google.android.libraries.places.api.model.Place.Field> getPlaceFields() {
        java.util.List<com.google.android.libraries.places.api.model.Place.Field> list = this.zzh;
        if (list != null) {
            return list;
        }
        throw new java.lang.IllegalStateException("Property \"placeFields\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final java.util.List<java.lang.Integer> getPriceLevels() {
        java.util.List<java.lang.Integer> list = this.zzi;
        if (list != null) {
            return list;
        }
        throw new java.lang.IllegalStateException("Property \"priceLevels\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final java.lang.String getTextQuery() {
        java.lang.String str = this.zzm;
        if (str != null) {
            return str;
        }
        throw new java.lang.IllegalStateException("Property \"textQuery\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final boolean isOpenNow() {
        if ((this.zzv & 1) != 0) {
            return this.zzg;
        }
        throw new java.lang.IllegalStateException("Property \"openNow\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final boolean isPureServiceAreaBusinessesIncluded() {
        if ((this.zzv & 8) != 0) {
            return this.zzr;
        }
        throw new java.lang.IllegalStateException("Property \"pureServiceAreaBusinessesIncluded\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final boolean isRoutingSummariesIncluded() {
        if ((this.zzv & 4) != 0) {
            return this.zzq;
        }
        throw new java.lang.IllegalStateException("Property \"routingSummariesIncluded\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final boolean isSearchUriIncluded() {
        if ((this.zzv & 16) != 0) {
            return this.zzs;
        }
        throw new java.lang.IllegalStateException("Property \"searchUriIncluded\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final boolean isStrictTypeFiltering() {
        if ((this.zzv & 2) != 0) {
            return this.zzl;
        }
        throw new java.lang.IllegalStateException("Property \"strictTypeFiltering\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final com.google.android.libraries.places.api.net.SearchByTextRequest.Builder setPlaceFields(java.util.List<com.google.android.libraries.places.api.model.Place.Field> list) {
        if (list == null) {
            throw new java.lang.NullPointerException("Null placeFields");
        }
        this.zzh = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final com.google.android.libraries.places.api.net.SearchByTextRequest.Builder setPriceLevels(java.util.List<java.lang.Integer> list) {
        if (list == null) {
            throw new java.lang.NullPointerException("Null priceLevels");
        }
        this.zzi = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final com.google.android.libraries.places.api.net.SearchByTextRequest.Builder setTextQuery(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null textQuery");
        }
        this.zzm = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    final com.google.android.libraries.places.api.net.SearchByTextRequest zzc() {
        java.util.List list;
        java.util.List list2;
        java.lang.String str;
        if (this.zzv == 63 && (list = this.zzh) != null && (list2 = this.zzi) != null && (str = this.zzm) != null) {
            return new com.google.android.libraries.places.api.net.zzt(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, list, list2, this.zzj, this.zzk, this.zzl, str, this.zzn, this.zzo, this.zzp, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu, null);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.zzv & 1) == 0) {
            sb.append(" openNow");
        }
        if (this.zzh == null) {
            sb.append(" placeFields");
        }
        if (this.zzi == null) {
            sb.append(" priceLevels");
        }
        if ((this.zzv & 2) == 0) {
            sb.append(" strictTypeFiltering");
        }
        if (this.zzm == null) {
            sb.append(" textQuery");
        }
        if ((this.zzv & 4) == 0) {
            sb.append(" routingSummariesIncluded");
        }
        if ((this.zzv & 8) == 0) {
            sb.append(" pureServiceAreaBusinessesIncluded");
        }
        if ((this.zzv & 16) == 0) {
            sb.append(" searchUriIncluded");
        }
        if ((this.zzv & 32) == 0) {
            sb.append(" requestPageIndex");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final com.google.android.libraries.places.api.net.SearchByTextRequest.Builder zzb(int i) {
        this.zzu = i;
        this.zzv = (byte) (this.zzv | 32);
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final com.google.android.libraries.places.api.net.SearchByTextRequest.Builder zza(java.lang.String str) {
        this.zzt = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final com.google.android.libraries.places.api.net.SearchByTextRequest.Builder setStrictTypeFiltering(boolean z) {
        this.zzl = z;
        this.zzv = (byte) (this.zzv | 2);
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final com.google.android.libraries.places.api.net.SearchByTextRequest.Builder setSearchUriIncluded(boolean z) {
        this.zzs = z;
        this.zzv = (byte) (this.zzv | 16);
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final com.google.android.libraries.places.api.net.SearchByTextRequest.Builder setSearchAlongRouteParameters(com.google.android.libraries.places.api.model.SearchAlongRouteParameters searchAlongRouteParameters) {
        this.zzp = searchAlongRouteParameters;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final com.google.android.libraries.places.api.net.SearchByTextRequest.Builder setRoutingSummariesIncluded(boolean z) {
        this.zzq = z;
        this.zzv = (byte) (this.zzv | 4);
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final com.google.android.libraries.places.api.net.SearchByTextRequest.Builder setRoutingParameters(com.google.android.libraries.places.api.model.RoutingParameters routingParameters) {
        this.zzo = routingParameters;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final com.google.android.libraries.places.api.net.SearchByTextRequest.Builder setRegionCode(java.lang.String str) {
        this.zzk = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final com.google.android.libraries.places.api.net.SearchByTextRequest.Builder setRankPreference(com.google.android.libraries.places.api.net.SearchByTextRequest.RankPreference rankPreference) {
        this.zzj = rankPreference;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final com.google.android.libraries.places.api.net.SearchByTextRequest.Builder setPureServiceAreaBusinessesIncluded(boolean z) {
        this.zzr = z;
        this.zzv = (byte) (this.zzv | 8);
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final com.google.android.libraries.places.api.net.SearchByTextRequest.Builder setOpenNow(boolean z) {
        this.zzg = z;
        this.zzv = (byte) (this.zzv | 1);
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final com.google.android.libraries.places.api.net.SearchByTextRequest.Builder setMinRating(java.lang.Double d) {
        this.zzf = d;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final com.google.android.libraries.places.api.net.SearchByTextRequest.Builder setMaxResultCount(java.lang.Integer num) {
        this.zze = num;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final com.google.android.libraries.places.api.net.SearchByTextRequest.Builder setLocationRestriction(com.google.android.libraries.places.api.model.LocationRestriction locationRestriction) {
        this.zzd = locationRestriction;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final com.google.android.libraries.places.api.net.SearchByTextRequest.Builder setLocationBias(com.google.android.libraries.places.api.model.LocationBias locationBias) {
        this.zzc = locationBias;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final com.google.android.libraries.places.api.net.SearchByTextRequest.Builder setIncludedType(java.lang.String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final com.google.android.libraries.places.api.net.SearchByTextRequest.Builder setEvSearchOptions(com.google.android.libraries.places.api.model.EVSearchOptions eVSearchOptions) {
        this.zzn = eVSearchOptions;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final com.google.android.libraries.places.api.net.SearchByTextRequest.Builder setCancellationToken(com.google.android.gms.tasks.CancellationToken cancellationToken) {
        this.zza = cancellationToken;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final com.google.android.libraries.places.api.model.SearchAlongRouteParameters getSearchAlongRouteParameters() {
        return this.zzp;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final com.google.android.libraries.places.api.model.RoutingParameters getRoutingParameters() {
        return this.zzo;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final java.lang.String getRegionCode() {
        return this.zzk;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final com.google.android.libraries.places.api.net.SearchByTextRequest.RankPreference getRankPreference() {
        return this.zzj;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final java.lang.Double getMinRating() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final java.lang.Integer getMaxResultCount() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final com.google.android.libraries.places.api.model.LocationRestriction getLocationRestriction() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final com.google.android.libraries.places.api.model.LocationBias getLocationBias() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final java.lang.String getIncludedType() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final com.google.android.libraries.places.api.model.EVSearchOptions getEvSearchOptions() {
        return this.zzn;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final com.google.android.gms.tasks.CancellationToken getCancellationToken() {
        return this.zza;
    }

    zzs(com.google.android.libraries.places.api.net.SearchByTextRequest searchByTextRequest) {
        this.zza = searchByTextRequest.getCancellationToken();
        this.zzb = searchByTextRequest.getIncludedType();
        this.zzc = searchByTextRequest.getLocationBias();
        this.zzd = searchByTextRequest.getLocationRestriction();
        this.zze = searchByTextRequest.getMaxResultCount();
        this.zzf = searchByTextRequest.getMinRating();
        this.zzg = searchByTextRequest.isOpenNow();
        this.zzh = searchByTextRequest.getPlaceFields();
        this.zzi = searchByTextRequest.getPriceLevels();
        this.zzj = searchByTextRequest.getRankPreference();
        this.zzk = searchByTextRequest.getRegionCode();
        this.zzl = searchByTextRequest.isStrictTypeFiltering();
        this.zzm = searchByTextRequest.getTextQuery();
        this.zzn = searchByTextRequest.getEvSearchOptions();
        this.zzo = searchByTextRequest.getRoutingParameters();
        this.zzp = searchByTextRequest.getSearchAlongRouteParameters();
        this.zzq = searchByTextRequest.isRoutingSummariesIncluded();
        this.zzr = searchByTextRequest.isPureServiceAreaBusinessesIncluded();
        this.zzs = searchByTextRequest.isSearchUriIncluded();
        this.zzt = searchByTextRequest.zza();
        this.zzu = searchByTextRequest.zzb();
        this.zzv = (byte) 63;
    }

    zzs() {
    }
}
