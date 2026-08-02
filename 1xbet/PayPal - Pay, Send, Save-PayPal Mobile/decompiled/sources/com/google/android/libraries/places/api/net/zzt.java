package com.google.android.libraries.places.api.net;

/* loaded from: classes8.dex */
final class zzt extends com.google.android.libraries.places.api.net.SearchByTextRequest {
    private final com.google.android.gms.tasks.CancellationToken zza;
    private final java.lang.String zzb;
    private final com.google.android.libraries.places.api.model.LocationBias zzc;
    private final com.google.android.libraries.places.api.model.LocationRestriction zzd;
    private final java.lang.Integer zze;
    private final java.lang.Double zzf;
    private final boolean zzg;
    private final java.util.List zzh;
    private final java.util.List zzi;
    private final com.google.android.libraries.places.api.net.SearchByTextRequest.RankPreference zzj;
    private final java.lang.String zzk;
    private final boolean zzl;
    private final java.lang.String zzm;
    private final com.google.android.libraries.places.api.model.EVSearchOptions zzn;
    private final com.google.android.libraries.places.api.model.RoutingParameters zzo;
    private final com.google.android.libraries.places.api.model.SearchAlongRouteParameters zzp;
    private final boolean zzq;
    private final boolean zzr;
    private final boolean zzs;
    private final java.lang.String zzt;
    private final int zzu;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.api.net.SearchByTextRequest)) {
            return false;
        }
        com.google.android.libraries.places.api.net.SearchByTextRequest searchByTextRequest = (com.google.android.libraries.places.api.net.SearchByTextRequest) obj;
        com.google.android.gms.tasks.CancellationToken cancellationToken = this.zza;
        if (cancellationToken == null) {
            if (searchByTextRequest.getCancellationToken() != null) {
                return false;
            }
        } else if (!cancellationToken.equals(searchByTextRequest.getCancellationToken())) {
            return false;
        }
        java.lang.String str = this.zzb;
        if (str == null) {
            if (searchByTextRequest.getIncludedType() != null) {
                return false;
            }
        } else if (!str.equals(searchByTextRequest.getIncludedType())) {
            return false;
        }
        com.google.android.libraries.places.api.model.LocationBias locationBias = this.zzc;
        if (locationBias == null) {
            if (searchByTextRequest.getLocationBias() != null) {
                return false;
            }
        } else if (!locationBias.equals(searchByTextRequest.getLocationBias())) {
            return false;
        }
        com.google.android.libraries.places.api.model.LocationRestriction locationRestriction = this.zzd;
        if (locationRestriction == null) {
            if (searchByTextRequest.getLocationRestriction() != null) {
                return false;
            }
        } else if (!locationRestriction.equals(searchByTextRequest.getLocationRestriction())) {
            return false;
        }
        java.lang.Integer num = this.zze;
        if (num == null) {
            if (searchByTextRequest.getMaxResultCount() != null) {
                return false;
            }
        } else if (!num.equals(searchByTextRequest.getMaxResultCount())) {
            return false;
        }
        java.lang.Double d = this.zzf;
        if (d == null) {
            if (searchByTextRequest.getMinRating() != null) {
                return false;
            }
        } else if (!d.equals(searchByTextRequest.getMinRating())) {
            return false;
        }
        if (this.zzg != searchByTextRequest.isOpenNow() || !this.zzh.equals(searchByTextRequest.getPlaceFields()) || !this.zzi.equals(searchByTextRequest.getPriceLevels())) {
            return false;
        }
        com.google.android.libraries.places.api.net.SearchByTextRequest.RankPreference rankPreference = this.zzj;
        if (rankPreference == null) {
            if (searchByTextRequest.getRankPreference() != null) {
                return false;
            }
        } else if (!rankPreference.equals(searchByTextRequest.getRankPreference())) {
            return false;
        }
        java.lang.String str2 = this.zzk;
        if (str2 == null) {
            if (searchByTextRequest.getRegionCode() != null) {
                return false;
            }
        } else if (!str2.equals(searchByTextRequest.getRegionCode())) {
            return false;
        }
        if (this.zzl != searchByTextRequest.isStrictTypeFiltering() || !this.zzm.equals(searchByTextRequest.getTextQuery())) {
            return false;
        }
        com.google.android.libraries.places.api.model.EVSearchOptions eVSearchOptions = this.zzn;
        if (eVSearchOptions == null) {
            if (searchByTextRequest.getEvSearchOptions() != null) {
                return false;
            }
        } else if (!eVSearchOptions.equals(searchByTextRequest.getEvSearchOptions())) {
            return false;
        }
        com.google.android.libraries.places.api.model.RoutingParameters routingParameters = this.zzo;
        if (routingParameters == null) {
            if (searchByTextRequest.getRoutingParameters() != null) {
                return false;
            }
        } else if (!routingParameters.equals(searchByTextRequest.getRoutingParameters())) {
            return false;
        }
        com.google.android.libraries.places.api.model.SearchAlongRouteParameters searchAlongRouteParameters = this.zzp;
        if (searchAlongRouteParameters == null) {
            if (searchByTextRequest.getSearchAlongRouteParameters() != null) {
                return false;
            }
        } else if (!searchAlongRouteParameters.equals(searchByTextRequest.getSearchAlongRouteParameters())) {
            return false;
        }
        if (this.zzq != searchByTextRequest.isRoutingSummariesIncluded() || this.zzr != searchByTextRequest.isPureServiceAreaBusinessesIncluded() || this.zzs != searchByTextRequest.isSearchUriIncluded()) {
            return false;
        }
        java.lang.String str3 = this.zzt;
        if (str3 == null) {
            if (searchByTextRequest.zza() != null) {
                return false;
            }
        } else if (!str3.equals(searchByTextRequest.zza())) {
            return false;
        }
        return this.zzu == searchByTextRequest.zzb();
    }

    public final java.lang.String toString() {
        com.google.android.libraries.places.api.model.SearchAlongRouteParameters searchAlongRouteParameters = this.zzp;
        com.google.android.libraries.places.api.model.RoutingParameters routingParameters = this.zzo;
        com.google.android.libraries.places.api.model.EVSearchOptions eVSearchOptions = this.zzn;
        com.google.android.libraries.places.api.net.SearchByTextRequest.RankPreference rankPreference = this.zzj;
        java.util.List list = this.zzi;
        java.util.List list2 = this.zzh;
        com.google.android.libraries.places.api.model.LocationRestriction locationRestriction = this.zzd;
        com.google.android.libraries.places.api.model.LocationBias locationBias = this.zzc;
        java.lang.String valueOf = java.lang.String.valueOf(this.zza);
        java.lang.String valueOf2 = java.lang.String.valueOf(locationBias);
        java.lang.String valueOf3 = java.lang.String.valueOf(locationRestriction);
        java.lang.String obj = list2.toString();
        java.lang.String obj2 = list.toString();
        java.lang.String valueOf4 = java.lang.String.valueOf(rankPreference);
        java.lang.String valueOf5 = java.lang.String.valueOf(eVSearchOptions);
        java.lang.String valueOf6 = java.lang.String.valueOf(routingParameters);
        java.lang.String valueOf7 = java.lang.String.valueOf(searchAlongRouteParameters);
        int length = java.lang.String.valueOf(valueOf).length();
        java.lang.String str = this.zzb;
        int length2 = java.lang.String.valueOf(str).length();
        int length3 = java.lang.String.valueOf(valueOf2).length();
        int length4 = java.lang.String.valueOf(valueOf3).length();
        java.lang.Integer num = this.zze;
        int length5 = java.lang.String.valueOf(num).length();
        java.lang.Double d = this.zzf;
        int length6 = java.lang.String.valueOf(d).length();
        boolean z = this.zzg;
        int length7 = java.lang.String.valueOf(z).length();
        int length8 = obj.length();
        int length9 = obj2.length();
        int length10 = java.lang.String.valueOf(valueOf4).length();
        java.lang.String str2 = this.zzk;
        int length11 = java.lang.String.valueOf(str2).length();
        boolean z2 = this.zzl;
        int length12 = java.lang.String.valueOf(z2).length();
        int length13 = java.lang.String.valueOf(valueOf5).length();
        int length14 = java.lang.String.valueOf(valueOf6).length();
        java.lang.String valueOf8 = java.lang.String.valueOf(valueOf7);
        java.lang.String str3 = this.zzm;
        int length15 = str3.length();
        boolean z3 = this.zzs;
        boolean z4 = this.zzr;
        boolean z5 = this.zzq;
        int i = this.zzu;
        java.lang.String str4 = this.zzt;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 53 + length2 + 15 + length3 + 22 + length4 + 17 + length5 + 12 + length6 + 10 + length7 + 14 + length8 + 14 + length9 + 17 + length10 + 13 + length11 + 22 + length12 + 12 + length15 + 18 + length13 + 20 + length14 + 29 + valueOf8.length() + 27 + java.lang.String.valueOf(z5).length() + 36 + java.lang.String.valueOf(z4).length() + 20 + java.lang.String.valueOf(z3).length() + 12 + java.lang.String.valueOf(str4).length() + 19 + java.lang.String.valueOf(i).length() + 1);
        sb.append("SearchByTextRequest{cancellationToken=");
        sb.append(valueOf);
        sb.append(", includedType=");
        sb.append(str);
        sb.append(", locationBias=");
        sb.append(valueOf2);
        sb.append(", locationRestriction=");
        sb.append(valueOf3);
        sb.append(", maxResultCount=");
        sb.append(num);
        sb.append(", minRating=");
        sb.append(d);
        sb.append(", openNow=");
        sb.append(z);
        sb.append(", placeFields=");
        sb.append(obj);
        sb.append(", priceLevels=");
        sb.append(obj2);
        sb.append(", rankPreference=");
        sb.append(valueOf4);
        sb.append(", regionCode=");
        sb.append(str2);
        sb.append(", strictTypeFiltering=");
        sb.append(z2);
        sb.append(", textQuery=");
        sb.append(str3);
        sb.append(", evSearchOptions=");
        sb.append(valueOf5);
        sb.append(", routingParameters=");
        sb.append(valueOf6);
        sb.append(", searchAlongRouteParameters=");
        sb.append(valueOf7);
        sb.append(", routingSummariesIncluded=");
        sb.append(z5);
        sb.append(", pureServiceAreaBusinessesIncluded=");
        sb.append(z4);
        sb.append(", searchUriIncluded=");
        sb.append(z3);
        sb.append(", pageToken=");
        sb.append(str4);
        sb.append(", requestPageIndex=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        com.google.android.gms.tasks.CancellationToken cancellationToken = this.zza;
        int hashCode = cancellationToken == null ? 0 : cancellationToken.hashCode();
        java.lang.String str = this.zzb;
        int hashCode2 = str == null ? 0 : str.hashCode();
        com.google.android.libraries.places.api.model.LocationBias locationBias = this.zzc;
        int hashCode3 = locationBias == null ? 0 : locationBias.hashCode();
        com.google.android.libraries.places.api.model.LocationRestriction locationRestriction = this.zzd;
        int hashCode4 = locationRestriction == null ? 0 : locationRestriction.hashCode();
        java.lang.Integer num = this.zze;
        int hashCode5 = num == null ? 0 : num.hashCode();
        java.lang.Double d = this.zzf;
        int hashCode6 = d == null ? 0 : d.hashCode();
        int i = true != this.zzg ? 1237 : 1231;
        int hashCode7 = this.zzh.hashCode();
        int hashCode8 = this.zzi.hashCode();
        com.google.android.libraries.places.api.net.SearchByTextRequest.RankPreference rankPreference = this.zzj;
        int hashCode9 = rankPreference == null ? 0 : rankPreference.hashCode();
        java.lang.String str2 = this.zzk;
        int hashCode10 = str2 == null ? 0 : str2.hashCode();
        int i2 = true != this.zzl ? 1237 : 1231;
        int hashCode11 = this.zzm.hashCode();
        com.google.android.libraries.places.api.model.EVSearchOptions eVSearchOptions = this.zzn;
        int hashCode12 = eVSearchOptions == null ? 0 : eVSearchOptions.hashCode();
        com.google.android.libraries.places.api.model.RoutingParameters routingParameters = this.zzo;
        int hashCode13 = routingParameters == null ? 0 : routingParameters.hashCode();
        com.google.android.libraries.places.api.model.SearchAlongRouteParameters searchAlongRouteParameters = this.zzp;
        int hashCode14 = searchAlongRouteParameters == null ? 0 : searchAlongRouteParameters.hashCode();
        int i3 = hashCode12;
        int i4 = true != this.zzq ? 1237 : 1231;
        int i5 = true != this.zzr ? 1237 : 1231;
        int i6 = true == this.zzs ? 1231 : 1237;
        java.lang.String str3 = this.zzt;
        return ((((((((((((((((((((((((((((((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ i) * 1000003) ^ hashCode7) * 1000003) ^ hashCode8) * 1000003) ^ hashCode9) * 1000003) ^ hashCode10) * 1000003) ^ i2) * 1000003) ^ hashCode11) * 1000003) ^ i3) * 1000003) ^ hashCode13) * 1000003) ^ hashCode14) * 1000003) ^ i4) * 1000003) ^ i5) * 1000003) ^ i6) * 1000003) ^ (str3 != null ? str3.hashCode() : 0)) * 1000003) ^ this.zzu;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public final com.google.android.libraries.places.api.net.SearchByTextRequest.Builder zzc() {
        return new com.google.android.libraries.places.api.net.zzs(this);
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public final int zzb() {
        return this.zzu;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public final java.lang.String zza() {
        return this.zzt;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public final boolean isStrictTypeFiltering() {
        return this.zzl;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public final boolean isSearchUriIncluded() {
        return this.zzs;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public final boolean isRoutingSummariesIncluded() {
        return this.zzq;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public final boolean isPureServiceAreaBusinessesIncluded() {
        return this.zzr;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public final boolean isOpenNow() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public final java.lang.String getTextQuery() {
        return this.zzm;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public final com.google.android.libraries.places.api.model.SearchAlongRouteParameters getSearchAlongRouteParameters() {
        return this.zzp;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public final com.google.android.libraries.places.api.model.RoutingParameters getRoutingParameters() {
        return this.zzo;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public final java.lang.String getRegionCode() {
        return this.zzk;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public final com.google.android.libraries.places.api.net.SearchByTextRequest.RankPreference getRankPreference() {
        return this.zzj;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public final java.util.List<java.lang.Integer> getPriceLevels() {
        return this.zzi;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public final java.util.List<com.google.android.libraries.places.api.model.Place.Field> getPlaceFields() {
        return this.zzh;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public final java.lang.Double getMinRating() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public final java.lang.Integer getMaxResultCount() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public final com.google.android.libraries.places.api.model.LocationRestriction getLocationRestriction() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public final com.google.android.libraries.places.api.model.LocationBias getLocationBias() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public final java.lang.String getIncludedType() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public final com.google.android.libraries.places.api.model.EVSearchOptions getEvSearchOptions() {
        return this.zzn;
    }

    @Override // com.google.android.libraries.places.internal.zzmq
    public final com.google.android.gms.tasks.CancellationToken getCancellationToken() {
        return this.zza;
    }

    /* synthetic */ zzt(com.google.android.gms.tasks.CancellationToken cancellationToken, java.lang.String str, com.google.android.libraries.places.api.model.LocationBias locationBias, com.google.android.libraries.places.api.model.LocationRestriction locationRestriction, java.lang.Integer num, java.lang.Double d, boolean z, java.util.List list, java.util.List list2, com.google.android.libraries.places.api.net.SearchByTextRequest.RankPreference rankPreference, java.lang.String str2, boolean z2, java.lang.String str3, com.google.android.libraries.places.api.model.EVSearchOptions eVSearchOptions, com.google.android.libraries.places.api.model.RoutingParameters routingParameters, com.google.android.libraries.places.api.model.SearchAlongRouteParameters searchAlongRouteParameters, boolean z3, boolean z4, boolean z5, java.lang.String str4, int i, byte[] bArr) {
        this.zza = cancellationToken;
        this.zzb = str;
        this.zzc = locationBias;
        this.zzd = locationRestriction;
        this.zze = num;
        this.zzf = d;
        this.zzg = z;
        this.zzh = list;
        this.zzi = list2;
        this.zzj = rankPreference;
        this.zzk = str2;
        this.zzl = z2;
        this.zzm = str3;
        this.zzn = eVSearchOptions;
        this.zzo = routingParameters;
        this.zzp = searchAlongRouteParameters;
        this.zzq = z3;
        this.zzr = z4;
        this.zzs = z5;
        this.zzt = str4;
        this.zzu = i;
    }
}
