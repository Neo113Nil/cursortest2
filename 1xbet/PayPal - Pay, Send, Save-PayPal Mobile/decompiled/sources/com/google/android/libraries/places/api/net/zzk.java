package com.google.android.libraries.places.api.net;

/* loaded from: classes8.dex */
final class zzk extends com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest {
    private final java.lang.String zza;
    private final com.google.android.libraries.places.api.model.LocationBias zzb;
    private final com.google.android.libraries.places.api.model.LocationRestriction zzc;
    private final com.google.android.gms.maps.model.LatLng zzd;
    private final java.util.List zze;
    private final com.google.android.libraries.places.api.model.AutocompleteSessionToken zzf;
    private final java.util.List zzg;
    private final java.lang.Integer zzh;
    private final java.lang.String zzi;
    private final boolean zzj;
    private final com.google.android.gms.tasks.CancellationToken zzk;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest)) {
            return false;
        }
        com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest findAutocompletePredictionsRequest = (com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest) obj;
        java.lang.String str = this.zza;
        if (str == null) {
            if (findAutocompletePredictionsRequest.getQuery() != null) {
                return false;
            }
        } else if (!str.equals(findAutocompletePredictionsRequest.getQuery())) {
            return false;
        }
        com.google.android.libraries.places.api.model.LocationBias locationBias = this.zzb;
        if (locationBias == null) {
            if (findAutocompletePredictionsRequest.getLocationBias() != null) {
                return false;
            }
        } else if (!locationBias.equals(findAutocompletePredictionsRequest.getLocationBias())) {
            return false;
        }
        com.google.android.libraries.places.api.model.LocationRestriction locationRestriction = this.zzc;
        if (locationRestriction == null) {
            if (findAutocompletePredictionsRequest.getLocationRestriction() != null) {
                return false;
            }
        } else if (!locationRestriction.equals(findAutocompletePredictionsRequest.getLocationRestriction())) {
            return false;
        }
        com.google.android.gms.maps.model.LatLng latLng = this.zzd;
        if (latLng == null) {
            if (findAutocompletePredictionsRequest.getOrigin() != null) {
                return false;
            }
        } else if (!latLng.equals(findAutocompletePredictionsRequest.getOrigin())) {
            return false;
        }
        if (!this.zze.equals(findAutocompletePredictionsRequest.getCountries())) {
            return false;
        }
        com.google.android.libraries.places.api.model.AutocompleteSessionToken autocompleteSessionToken = this.zzf;
        if (autocompleteSessionToken == null) {
            if (findAutocompletePredictionsRequest.getSessionToken() != null) {
                return false;
            }
        } else if (!autocompleteSessionToken.equals(findAutocompletePredictionsRequest.getSessionToken())) {
            return false;
        }
        if (!this.zzg.equals(findAutocompletePredictionsRequest.getTypesFilter())) {
            return false;
        }
        java.lang.Integer num = this.zzh;
        if (num == null) {
            if (findAutocompletePredictionsRequest.getInputOffset() != null) {
                return false;
            }
        } else if (!num.equals(findAutocompletePredictionsRequest.getInputOffset())) {
            return false;
        }
        java.lang.String str2 = this.zzi;
        if (str2 == null) {
            if (findAutocompletePredictionsRequest.getRegionCode() != null) {
                return false;
            }
        } else if (!str2.equals(findAutocompletePredictionsRequest.getRegionCode())) {
            return false;
        }
        if (this.zzj != findAutocompletePredictionsRequest.isPureServiceAreaBusinessesIncluded()) {
            return false;
        }
        com.google.android.gms.tasks.CancellationToken cancellationToken = this.zzk;
        if (cancellationToken == null) {
            if (findAutocompletePredictionsRequest.getCancellationToken() != null) {
                return false;
            }
        } else if (!cancellationToken.equals(findAutocompletePredictionsRequest.getCancellationToken())) {
            return false;
        }
        return true;
    }

    public final java.lang.String toString() {
        com.google.android.gms.tasks.CancellationToken cancellationToken = this.zzk;
        java.util.List list = this.zzg;
        com.google.android.libraries.places.api.model.AutocompleteSessionToken autocompleteSessionToken = this.zzf;
        java.util.List list2 = this.zze;
        com.google.android.gms.maps.model.LatLng latLng = this.zzd;
        com.google.android.libraries.places.api.model.LocationRestriction locationRestriction = this.zzc;
        java.lang.String valueOf = java.lang.String.valueOf(this.zzb);
        java.lang.String valueOf2 = java.lang.String.valueOf(locationRestriction);
        java.lang.String valueOf3 = java.lang.String.valueOf(latLng);
        java.lang.String obj = list2.toString();
        java.lang.String valueOf4 = java.lang.String.valueOf(autocompleteSessionToken);
        java.lang.String obj2 = list.toString();
        java.lang.String valueOf5 = java.lang.String.valueOf(cancellationToken);
        java.lang.String str = this.zza;
        int length = java.lang.String.valueOf(str).length();
        int length2 = java.lang.String.valueOf(valueOf).length();
        int length3 = java.lang.String.valueOf(valueOf2).length();
        int length4 = java.lang.String.valueOf(valueOf3).length();
        int length5 = obj.length();
        int length6 = java.lang.String.valueOf(valueOf4).length();
        int length7 = obj2.length();
        java.lang.Integer num = this.zzh;
        int length8 = java.lang.String.valueOf(num).length();
        java.lang.String str2 = this.zzi;
        int length9 = java.lang.String.valueOf(str2).length();
        boolean z = this.zzj;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 56 + length2 + 22 + length3 + 9 + length4 + 12 + length5 + 15 + length6 + 14 + length7 + 14 + length8 + 13 + length9 + 36 + java.lang.String.valueOf(z).length() + 20 + java.lang.String.valueOf(valueOf5).length() + 1);
        sb.append("FindAutocompletePredictionsRequest{query=");
        sb.append(str);
        sb.append(", locationBias=");
        sb.append(valueOf);
        sb.append(", locationRestriction=");
        sb.append(valueOf2);
        sb.append(", origin=");
        sb.append(valueOf3);
        sb.append(", countries=");
        sb.append(obj);
        sb.append(", sessionToken=");
        sb.append(valueOf4);
        sb.append(", typesFilter=");
        sb.append(obj2);
        sb.append(", inputOffset=");
        sb.append(num);
        sb.append(", regionCode=");
        sb.append(str2);
        sb.append(", pureServiceAreaBusinessesIncluded=");
        sb.append(z);
        sb.append(", cancellationToken=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.zza;
        int hashCode = str == null ? 0 : str.hashCode();
        com.google.android.libraries.places.api.model.LocationBias locationBias = this.zzb;
        int hashCode2 = locationBias == null ? 0 : locationBias.hashCode();
        com.google.android.libraries.places.api.model.LocationRestriction locationRestriction = this.zzc;
        int hashCode3 = locationRestriction == null ? 0 : locationRestriction.hashCode();
        com.google.android.gms.maps.model.LatLng latLng = this.zzd;
        int hashCode4 = latLng == null ? 0 : latLng.hashCode();
        int hashCode5 = this.zze.hashCode();
        com.google.android.libraries.places.api.model.AutocompleteSessionToken autocompleteSessionToken = this.zzf;
        int hashCode6 = autocompleteSessionToken == null ? 0 : autocompleteSessionToken.hashCode();
        int hashCode7 = this.zzg.hashCode();
        java.lang.Integer num = this.zzh;
        int hashCode8 = num == null ? 0 : num.hashCode();
        java.lang.String str2 = this.zzi;
        int hashCode9 = str2 == null ? 0 : str2.hashCode();
        int i = true != this.zzj ? 1237 : 1231;
        com.google.android.gms.tasks.CancellationToken cancellationToken = this.zzk;
        return ((((((((((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ hashCode7) * 1000003) ^ hashCode8) * 1000003) ^ hashCode9) * 1000003) ^ i) * 1000003) ^ (cancellationToken != null ? cancellationToken.hashCode() : 0);
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    public final boolean isPureServiceAreaBusinessesIncluded() {
        return this.zzj;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    public final java.util.List<java.lang.String> getTypesFilter() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    public final com.google.android.libraries.places.api.model.AutocompleteSessionToken getSessionToken() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    public final java.lang.String getRegionCode() {
        return this.zzi;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    public final java.lang.String getQuery() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    public final com.google.android.gms.maps.model.LatLng getOrigin() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    public final com.google.android.libraries.places.api.model.LocationRestriction getLocationRestriction() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    public final com.google.android.libraries.places.api.model.LocationBias getLocationBias() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    public final java.lang.Integer getInputOffset() {
        return this.zzh;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    public final java.util.List<java.lang.String> getCountries() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest, com.google.android.libraries.places.internal.zzmq
    public final com.google.android.gms.tasks.CancellationToken getCancellationToken() {
        return this.zzk;
    }

    /* synthetic */ zzk(java.lang.String str, com.google.android.libraries.places.api.model.LocationBias locationBias, com.google.android.libraries.places.api.model.LocationRestriction locationRestriction, com.google.android.gms.maps.model.LatLng latLng, java.util.List list, com.google.android.libraries.places.api.model.AutocompleteSessionToken autocompleteSessionToken, java.util.List list2, java.lang.Integer num, java.lang.String str2, boolean z, com.google.android.gms.tasks.CancellationToken cancellationToken, byte[] bArr) {
        this.zza = str;
        this.zzb = locationBias;
        this.zzc = locationRestriction;
        this.zzd = latLng;
        this.zze = list;
        this.zzf = autocompleteSessionToken;
        this.zzg = list2;
        this.zzh = num;
        this.zzi = str2;
        this.zzj = z;
        this.zzk = cancellationToken;
    }
}
