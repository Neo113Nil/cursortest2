package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zznn extends com.google.android.libraries.places.internal.zznr {
    private java.lang.String zza;
    private com.google.common.collect.ImmutableList zzb;
    private com.google.android.libraries.places.api.model.Place zzc;
    private com.google.android.libraries.places.api.model.AutocompletePrediction zzd;
    private com.google.android.libraries.places.api.model.AutocompleteSessionToken zze;
    private com.google.android.gms.common.api.Status zzf;
    private int zzg;

    @Override // com.google.android.libraries.places.internal.zznr
    public final com.google.android.libraries.places.internal.zznr zzb(java.util.List list) {
        this.zzb = list == null ? null : com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zznr
    public final com.google.android.libraries.places.internal.zzns zzg() {
        int i = this.zzg;
        if (i != 0) {
            return new com.google.android.libraries.places.internal.zzno(i, this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, null);
        }
        throw new java.lang.IllegalStateException("Missing required properties: type");
    }

    public final com.google.android.libraries.places.internal.zznr zzh(int i) {
        this.zzg = i;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zznr
    public final com.google.android.libraries.places.internal.zznr zzf(com.google.android.gms.common.api.Status status) {
        this.zzf = status;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zznr
    public final com.google.android.libraries.places.internal.zznr zze(com.google.android.libraries.places.api.model.AutocompleteSessionToken autocompleteSessionToken) {
        this.zze = autocompleteSessionToken;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zznr
    public final com.google.android.libraries.places.internal.zznr zzd(com.google.android.libraries.places.api.model.AutocompletePrediction autocompletePrediction) {
        this.zzd = autocompletePrediction;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zznr
    public final com.google.android.libraries.places.internal.zznr zzc(com.google.android.libraries.places.api.model.Place place) {
        this.zzc = place;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zznr
    public final com.google.android.libraries.places.internal.zznr zza(java.lang.String str) {
        this.zza = str;
        return this;
    }

    zznn() {
    }
}
