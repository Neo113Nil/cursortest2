package com.google.android.libraries.places.api.net;

/* loaded from: classes8.dex */
final class zze extends com.google.android.libraries.places.api.net.FetchPlaceRequest {
    private final java.lang.String zza;
    private final java.util.List zzb;
    private final com.google.android.libraries.places.api.model.AutocompleteSessionToken zzc;
    private final com.google.android.gms.tasks.CancellationToken zzd;
    private final java.lang.String zze;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.api.net.FetchPlaceRequest)) {
            return false;
        }
        com.google.android.libraries.places.api.net.FetchPlaceRequest fetchPlaceRequest = (com.google.android.libraries.places.api.net.FetchPlaceRequest) obj;
        if (!this.zza.equals(fetchPlaceRequest.getPlaceId()) || !this.zzb.equals(fetchPlaceRequest.getPlaceFields())) {
            return false;
        }
        com.google.android.libraries.places.api.model.AutocompleteSessionToken autocompleteSessionToken = this.zzc;
        if (autocompleteSessionToken == null) {
            if (fetchPlaceRequest.getSessionToken() != null) {
                return false;
            }
        } else if (!autocompleteSessionToken.equals(fetchPlaceRequest.getSessionToken())) {
            return false;
        }
        com.google.android.gms.tasks.CancellationToken cancellationToken = this.zzd;
        if (cancellationToken == null) {
            if (fetchPlaceRequest.getCancellationToken() != null) {
                return false;
            }
        } else if (!cancellationToken.equals(fetchPlaceRequest.getCancellationToken())) {
            return false;
        }
        java.lang.String str = this.zze;
        if (str == null) {
            if (fetchPlaceRequest.getRegionCode() != null) {
                return false;
            }
        } else if (!str.equals(fetchPlaceRequest.getRegionCode())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode();
        int hashCode2 = this.zzb.hashCode();
        com.google.android.libraries.places.api.model.AutocompleteSessionToken autocompleteSessionToken = this.zzc;
        int hashCode3 = autocompleteSessionToken == null ? 0 : autocompleteSessionToken.hashCode();
        com.google.android.gms.tasks.CancellationToken cancellationToken = this.zzd;
        int hashCode4 = cancellationToken == null ? 0 : cancellationToken.hashCode();
        java.lang.String str = this.zze;
        return ((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ (str != null ? str.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.zzb.toString();
        int length = obj.length();
        com.google.android.gms.tasks.CancellationToken cancellationToken = this.zzd;
        java.lang.String valueOf = java.lang.String.valueOf(this.zzc);
        java.lang.String valueOf2 = java.lang.String.valueOf(cancellationToken);
        int length2 = java.lang.String.valueOf(valueOf).length();
        int length3 = java.lang.String.valueOf(valueOf2).length();
        java.lang.String str = this.zze;
        int length4 = java.lang.String.valueOf(str).length();
        java.lang.String str2 = this.zza;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str2.length() + 40 + length + 15 + length2 + 20 + length3 + 13 + length4 + 1);
        sb.append("FetchPlaceRequest{placeId=");
        sb.append(str2);
        sb.append(", placeFields=");
        sb.append(obj);
        sb.append(", sessionToken=");
        sb.append(valueOf);
        sb.append(", cancellationToken=");
        sb.append(valueOf2);
        sb.append(", regionCode=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest
    public final com.google.android.libraries.places.api.model.AutocompleteSessionToken getSessionToken() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest
    public final java.lang.String getRegionCode() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest
    public final java.lang.String getPlaceId() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest
    public final java.util.List<com.google.android.libraries.places.api.model.Place.Field> getPlaceFields() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest, com.google.android.libraries.places.internal.zzmq
    public final com.google.android.gms.tasks.CancellationToken getCancellationToken() {
        return this.zzd;
    }

    /* synthetic */ zze(java.lang.String str, java.util.List list, com.google.android.libraries.places.api.model.AutocompleteSessionToken autocompleteSessionToken, com.google.android.gms.tasks.CancellationToken cancellationToken, java.lang.String str2, byte[] bArr) {
        this.zza = str;
        this.zzb = list;
        this.zzc = autocompleteSessionToken;
        this.zzd = cancellationToken;
        this.zze = str2;
    }
}
