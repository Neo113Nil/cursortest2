package com.google.android.libraries.places.api.net;

/* loaded from: classes8.dex */
final class zzx extends com.google.android.libraries.places.api.net.SearchNearbyRequest {
    private final java.lang.String zza;
    private final java.util.List zzb;
    private final java.util.List zzc;
    private final java.util.List zzd;
    private final java.util.List zze;
    private final java.lang.Integer zzf;
    private final com.google.android.libraries.places.api.model.LocationRestriction zzg;
    private final java.util.List zzh;
    private final com.google.android.gms.tasks.CancellationToken zzi;
    private final com.google.android.libraries.places.api.net.SearchNearbyRequest.RankPreference zzj;
    private final com.google.android.libraries.places.api.model.RoutingParameters zzk;
    private final boolean zzl;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.api.net.SearchNearbyRequest)) {
            return false;
        }
        com.google.android.libraries.places.api.net.SearchNearbyRequest searchNearbyRequest = (com.google.android.libraries.places.api.net.SearchNearbyRequest) obj;
        java.lang.String str = this.zza;
        if (str == null) {
            if (searchNearbyRequest.getRegionCode() != null) {
                return false;
            }
        } else if (!str.equals(searchNearbyRequest.getRegionCode())) {
            return false;
        }
        java.util.List list = this.zzb;
        if (list == null) {
            if (searchNearbyRequest.getIncludedTypes() != null) {
                return false;
            }
        } else if (!list.equals(searchNearbyRequest.getIncludedTypes())) {
            return false;
        }
        java.util.List list2 = this.zzc;
        if (list2 == null) {
            if (searchNearbyRequest.getExcludedTypes() != null) {
                return false;
            }
        } else if (!list2.equals(searchNearbyRequest.getExcludedTypes())) {
            return false;
        }
        java.util.List list3 = this.zzd;
        if (list3 == null) {
            if (searchNearbyRequest.getIncludedPrimaryTypes() != null) {
                return false;
            }
        } else if (!list3.equals(searchNearbyRequest.getIncludedPrimaryTypes())) {
            return false;
        }
        java.util.List list4 = this.zze;
        if (list4 == null) {
            if (searchNearbyRequest.getExcludedPrimaryTypes() != null) {
                return false;
            }
        } else if (!list4.equals(searchNearbyRequest.getExcludedPrimaryTypes())) {
            return false;
        }
        java.lang.Integer num = this.zzf;
        if (num == null) {
            if (searchNearbyRequest.getMaxResultCount() != null) {
                return false;
            }
        } else if (!num.equals(searchNearbyRequest.getMaxResultCount())) {
            return false;
        }
        if (!this.zzg.equals(searchNearbyRequest.getLocationRestriction()) || !this.zzh.equals(searchNearbyRequest.getPlaceFields())) {
            return false;
        }
        com.google.android.gms.tasks.CancellationToken cancellationToken = this.zzi;
        if (cancellationToken == null) {
            if (searchNearbyRequest.getCancellationToken() != null) {
                return false;
            }
        } else if (!cancellationToken.equals(searchNearbyRequest.getCancellationToken())) {
            return false;
        }
        com.google.android.libraries.places.api.net.SearchNearbyRequest.RankPreference rankPreference = this.zzj;
        if (rankPreference == null) {
            if (searchNearbyRequest.getRankPreference() != null) {
                return false;
            }
        } else if (!rankPreference.equals(searchNearbyRequest.getRankPreference())) {
            return false;
        }
        com.google.android.libraries.places.api.model.RoutingParameters routingParameters = this.zzk;
        if (routingParameters == null) {
            if (searchNearbyRequest.getRoutingParameters() != null) {
                return false;
            }
        } else if (!routingParameters.equals(searchNearbyRequest.getRoutingParameters())) {
            return false;
        }
        return this.zzl == searchNearbyRequest.isRoutingSummariesIncluded();
    }

    public final java.lang.String toString() {
        com.google.android.libraries.places.api.model.RoutingParameters routingParameters = this.zzk;
        com.google.android.libraries.places.api.net.SearchNearbyRequest.RankPreference rankPreference = this.zzj;
        com.google.android.gms.tasks.CancellationToken cancellationToken = this.zzi;
        java.util.List list = this.zzh;
        com.google.android.libraries.places.api.model.LocationRestriction locationRestriction = this.zzg;
        java.util.List list2 = this.zze;
        java.util.List list3 = this.zzd;
        java.util.List list4 = this.zzc;
        java.lang.String valueOf = java.lang.String.valueOf(this.zzb);
        java.lang.String valueOf2 = java.lang.String.valueOf(list4);
        java.lang.String valueOf3 = java.lang.String.valueOf(list3);
        java.lang.String valueOf4 = java.lang.String.valueOf(list2);
        java.lang.String obj = locationRestriction.toString();
        java.lang.String obj2 = list.toString();
        java.lang.String valueOf5 = java.lang.String.valueOf(cancellationToken);
        java.lang.String valueOf6 = java.lang.String.valueOf(rankPreference);
        java.lang.String valueOf7 = java.lang.String.valueOf(routingParameters);
        java.lang.String str = this.zza;
        int length = java.lang.String.valueOf(str).length();
        int length2 = java.lang.String.valueOf(valueOf).length();
        int length3 = java.lang.String.valueOf(valueOf2).length();
        int length4 = java.lang.String.valueOf(valueOf3).length();
        int length5 = java.lang.String.valueOf(valueOf4).length();
        java.lang.Integer num = this.zzf;
        int length6 = java.lang.String.valueOf(num).length();
        int length7 = obj.length();
        int length8 = obj2.length();
        int length9 = java.lang.String.valueOf(valueOf5).length();
        int length10 = java.lang.String.valueOf(valueOf6).length();
        int length11 = java.lang.String.valueOf(valueOf7).length();
        boolean z = this.zzl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 47 + length2 + 16 + length3 + 23 + length4 + 23 + length5 + 17 + length6 + 22 + length7 + 14 + length8 + 20 + length9 + 17 + length10 + 20 + length11 + 27 + java.lang.String.valueOf(z).length() + 1);
        sb.append("SearchNearbyRequest{regionCode=");
        sb.append(str);
        sb.append(", includedTypes=");
        sb.append(valueOf);
        sb.append(", excludedTypes=");
        sb.append(valueOf2);
        sb.append(", includedPrimaryTypes=");
        sb.append(valueOf3);
        sb.append(", excludedPrimaryTypes=");
        sb.append(valueOf4);
        sb.append(", maxResultCount=");
        sb.append(num);
        sb.append(", locationRestriction=");
        sb.append(obj);
        sb.append(", placeFields=");
        sb.append(obj2);
        sb.append(", cancellationToken=");
        sb.append(valueOf5);
        sb.append(", rankPreference=");
        sb.append(valueOf6);
        sb.append(", routingParameters=");
        sb.append(valueOf7);
        sb.append(", routingSummariesIncluded=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.zza;
        int hashCode = str == null ? 0 : str.hashCode();
        java.util.List list = this.zzb;
        int hashCode2 = list == null ? 0 : list.hashCode();
        java.util.List list2 = this.zzc;
        int hashCode3 = list2 == null ? 0 : list2.hashCode();
        java.util.List list3 = this.zzd;
        int hashCode4 = list3 == null ? 0 : list3.hashCode();
        java.util.List list4 = this.zze;
        int hashCode5 = list4 == null ? 0 : list4.hashCode();
        java.lang.Integer num = this.zzf;
        int hashCode6 = num == null ? 0 : num.hashCode();
        int hashCode7 = this.zzg.hashCode();
        int hashCode8 = this.zzh.hashCode();
        com.google.android.gms.tasks.CancellationToken cancellationToken = this.zzi;
        int hashCode9 = cancellationToken == null ? 0 : cancellationToken.hashCode();
        com.google.android.libraries.places.api.net.SearchNearbyRequest.RankPreference rankPreference = this.zzj;
        int hashCode10 = rankPreference == null ? 0 : rankPreference.hashCode();
        com.google.android.libraries.places.api.model.RoutingParameters routingParameters = this.zzk;
        return ((((((((((((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ hashCode7) * 1000003) ^ hashCode8) * 1000003) ^ hashCode9) * 1000003) ^ hashCode10) * 1000003) ^ (routingParameters != null ? routingParameters.hashCode() : 0)) * 1000003) ^ (true != this.zzl ? 1237 : 1231);
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest
    public final com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder zza() {
        return new com.google.android.libraries.places.api.net.zzw(this);
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest
    public final boolean isRoutingSummariesIncluded() {
        return this.zzl;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest
    public final com.google.android.libraries.places.api.model.RoutingParameters getRoutingParameters() {
        return this.zzk;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest
    public final java.lang.String getRegionCode() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest
    public final com.google.android.libraries.places.api.net.SearchNearbyRequest.RankPreference getRankPreference() {
        return this.zzj;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest
    public final java.util.List<com.google.android.libraries.places.api.model.Place.Field> getPlaceFields() {
        return this.zzh;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest
    public final java.lang.Integer getMaxResultCount() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest
    public final com.google.android.libraries.places.api.model.LocationRestriction getLocationRestriction() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest
    public final java.util.List<java.lang.String> getIncludedTypes() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest
    public final java.util.List<java.lang.String> getIncludedPrimaryTypes() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest
    public final java.util.List<java.lang.String> getExcludedTypes() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest
    public final java.util.List<java.lang.String> getExcludedPrimaryTypes() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest, com.google.android.libraries.places.internal.zzmq
    public final com.google.android.gms.tasks.CancellationToken getCancellationToken() {
        return this.zzi;
    }

    /* synthetic */ zzx(java.lang.String str, java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, java.lang.Integer num, com.google.android.libraries.places.api.model.LocationRestriction locationRestriction, java.util.List list5, com.google.android.gms.tasks.CancellationToken cancellationToken, com.google.android.libraries.places.api.net.SearchNearbyRequest.RankPreference rankPreference, com.google.android.libraries.places.api.model.RoutingParameters routingParameters, boolean z, byte[] bArr) {
        this.zza = str;
        this.zzb = list;
        this.zzc = list2;
        this.zzd = list3;
        this.zze = list4;
        this.zzf = num;
        this.zzg = locationRestriction;
        this.zzh = list5;
        this.zzi = cancellationToken;
        this.zzj = rankPreference;
        this.zzk = routingParameters;
        this.zzl = z;
    }
}
