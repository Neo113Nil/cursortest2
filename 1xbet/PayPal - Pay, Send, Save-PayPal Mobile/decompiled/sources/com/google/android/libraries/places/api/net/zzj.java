package com.google.android.libraries.places.api.net;

/* loaded from: classes8.dex */
final class zzj extends com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder {
    private java.lang.String zza;
    private com.google.android.libraries.places.api.model.LocationBias zzb;
    private com.google.android.libraries.places.api.model.LocationRestriction zzc;
    private com.google.android.gms.maps.model.LatLng zzd;
    private java.util.List zze;
    private com.google.android.libraries.places.api.model.AutocompleteSessionToken zzf;
    private java.util.List zzg;
    private java.lang.Integer zzh;
    private java.lang.String zzi;
    private boolean zzj;
    private com.google.android.gms.tasks.CancellationToken zzk;
    private byte zzl;

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final java.util.List<java.lang.String> getCountries() {
        java.util.List<java.lang.String> list = this.zze;
        if (list != null) {
            return list;
        }
        throw new java.lang.IllegalStateException("Property \"countries\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final java.util.List<java.lang.String> getTypesFilter() {
        java.util.List<java.lang.String> list = this.zzg;
        if (list != null) {
            return list;
        }
        throw new java.lang.IllegalStateException("Property \"typesFilter\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final boolean isPureServiceAreaBusinessesIncluded() {
        if (this.zzl != 0) {
            return this.zzj;
        }
        throw new java.lang.IllegalStateException("Property \"pureServiceAreaBusinessesIncluded\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder setCountries(java.util.List<java.lang.String> list) {
        if (list == null) {
            throw new java.lang.NullPointerException("Null countries");
        }
        this.zze = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder setTypesFilter(java.util.List<java.lang.String> list) {
        if (list == null) {
            throw new java.lang.NullPointerException("Null typesFilter");
        }
        this.zzg = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    final com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest zza() {
        java.util.List list;
        java.util.List list2;
        if (this.zzl == 1 && (list = this.zze) != null && (list2 = this.zzg) != null) {
            return new com.google.android.libraries.places.api.net.zzk(this.zza, this.zzb, this.zzc, this.zzd, list, this.zzf, list2, this.zzh, this.zzi, this.zzj, this.zzk, null);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.zze == null) {
            sb.append(" countries");
        }
        if (this.zzg == null) {
            sb.append(" typesFilter");
        }
        if (this.zzl == 0) {
            sb.append(" pureServiceAreaBusinessesIncluded");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder setSessionToken(com.google.android.libraries.places.api.model.AutocompleteSessionToken autocompleteSessionToken) {
        this.zzf = autocompleteSessionToken;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder setRegionCode(java.lang.String str) {
        this.zzi = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder setQuery(java.lang.String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder setPureServiceAreaBusinessesIncluded(boolean z) {
        this.zzj = z;
        this.zzl = (byte) 1;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder setOrigin(com.google.android.gms.maps.model.LatLng latLng) {
        this.zzd = latLng;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder setLocationRestriction(com.google.android.libraries.places.api.model.LocationRestriction locationRestriction) {
        this.zzc = locationRestriction;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder setLocationBias(com.google.android.libraries.places.api.model.LocationBias locationBias) {
        this.zzb = locationBias;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder setInputOffset(java.lang.Integer num) {
        this.zzh = num;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder setCancellationToken(com.google.android.gms.tasks.CancellationToken cancellationToken) {
        this.zzk = cancellationToken;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final com.google.android.libraries.places.api.model.AutocompleteSessionToken getSessionToken() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final java.lang.String getRegionCode() {
        return this.zzi;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final java.lang.String getQuery() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final com.google.android.gms.maps.model.LatLng getOrigin() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final com.google.android.libraries.places.api.model.LocationRestriction getLocationRestriction() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final com.google.android.libraries.places.api.model.LocationBias getLocationBias() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final java.lang.Integer getInputOffset() {
        return this.zzh;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final com.google.android.gms.tasks.CancellationToken getCancellationToken() {
        return this.zzk;
    }

    zzj() {
    }
}
