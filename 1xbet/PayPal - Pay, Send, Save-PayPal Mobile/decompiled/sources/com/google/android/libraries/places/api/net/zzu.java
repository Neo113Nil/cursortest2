package com.google.android.libraries.places.api.net;

/* loaded from: classes8.dex */
final class zzu extends com.google.android.libraries.places.api.net.SearchByTextResponse.Builder {
    private java.util.List zza;
    private java.util.List zzb;
    private com.google.android.libraries.places.api.net.Pagination zzc;
    private java.lang.String zzd;
    private int zze;
    private android.net.Uri zzf;
    private byte zzg;

    @Override // com.google.android.libraries.places.api.net.SearchByTextResponse.Builder
    public final com.google.android.libraries.places.api.net.SearchByTextResponse autoBuild() {
        java.util.List list;
        if (this.zzg == 1 && (list = this.zza) != null) {
            return new com.google.android.libraries.places.api.net.zzv(list, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, null);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.zza == null) {
            sb.append(" places");
        }
        if (this.zzg == 0) {
            sb.append(" responsePageIndex");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextResponse.Builder
    public final java.util.List<com.google.android.libraries.places.api.model.Place> getPlaces() {
        java.util.List<com.google.android.libraries.places.api.model.Place> list = this.zza;
        if (list != null) {
            return list;
        }
        throw new java.lang.IllegalStateException("Property \"places\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextResponse.Builder
    public final com.google.android.libraries.places.api.net.SearchByTextResponse.Builder setPlaces(java.util.List<com.google.android.libraries.places.api.model.Place> list) {
        if (list == null) {
            throw new java.lang.NullPointerException("Null places");
        }
        this.zza = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextResponse.Builder
    public final com.google.android.libraries.places.api.net.SearchByTextResponse.Builder zzb(int i) {
        this.zze = i;
        this.zzg = (byte) 1;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextResponse.Builder
    public final com.google.android.libraries.places.api.net.SearchByTextResponse.Builder zza(java.lang.String str) {
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextResponse.Builder
    public final com.google.android.libraries.places.api.net.SearchByTextResponse.Builder setSearchUri(android.net.Uri uri) {
        this.zzf = uri;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextResponse.Builder
    public final com.google.android.libraries.places.api.net.SearchByTextResponse.Builder setRoutingSummaries(java.util.List<com.google.android.libraries.places.api.model.RoutingSummary> list) {
        this.zzb = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextResponse.Builder
    public final com.google.android.libraries.places.api.net.SearchByTextResponse.Builder setPagination(com.google.android.libraries.places.api.net.Pagination pagination) {
        this.zzc = pagination;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextResponse.Builder
    public final android.net.Uri getSearchUri() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextResponse.Builder
    public final java.util.List<com.google.android.libraries.places.api.model.RoutingSummary> getRoutingSummaries() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextResponse.Builder
    public final com.google.android.libraries.places.api.net.Pagination getPagination() {
        return this.zzc;
    }

    zzu() {
    }
}
