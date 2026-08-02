package com.google.android.libraries.places.api.net;

/* loaded from: classes8.dex */
final class zzd extends com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder {
    private java.lang.String zza;
    private java.util.List zzb;
    private com.google.android.libraries.places.api.model.AutocompleteSessionToken zzc;
    private com.google.android.gms.tasks.CancellationToken zzd;
    private java.lang.String zze;

    final com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder zza(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null placeId");
        }
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder
    final com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder zzb(java.util.List list) {
        if (list == null) {
            throw new java.lang.NullPointerException("Null placeFields");
        }
        this.zzb = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder
    final com.google.android.libraries.places.api.net.FetchPlaceRequest zzc() {
        java.util.List list;
        java.lang.String str = this.zza;
        if (str != null && (list = this.zzb) != null) {
            return new com.google.android.libraries.places.api.net.zze(str, list, this.zzc, this.zzd, this.zze, null);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.zza == null) {
            sb.append(" placeId");
        }
        if (this.zzb == null) {
            sb.append(" placeFields");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder
    public final com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder setSessionToken(com.google.android.libraries.places.api.model.AutocompleteSessionToken autocompleteSessionToken) {
        this.zzc = autocompleteSessionToken;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder
    public final com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder setRegionCode(java.lang.String str) {
        this.zze = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder
    public final com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder setCancellationToken(com.google.android.gms.tasks.CancellationToken cancellationToken) {
        this.zzd = cancellationToken;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder
    public final com.google.android.libraries.places.api.model.AutocompleteSessionToken getSessionToken() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder
    public final java.lang.String getRegionCode() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder
    public final com.google.android.gms.tasks.CancellationToken getCancellationToken() {
        return this.zzd;
    }

    zzd() {
    }
}
