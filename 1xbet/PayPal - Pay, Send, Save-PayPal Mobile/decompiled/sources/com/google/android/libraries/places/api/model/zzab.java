package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzab extends com.google.android.libraries.places.api.model.EvChargeAmenitySummary.Builder {
    private com.google.android.libraries.places.api.model.ContentBlock zza;
    private com.google.android.libraries.places.api.model.ContentBlock zzb;
    private com.google.android.libraries.places.api.model.ContentBlock zzc;
    private com.google.android.libraries.places.api.model.ContentBlock zzd;
    private android.net.Uri zze;
    private java.lang.String zzf;
    private java.lang.String zzg;

    @Override // com.google.android.libraries.places.api.model.EvChargeAmenitySummary.Builder
    public final com.google.android.libraries.places.api.model.EvChargeAmenitySummary build() {
        com.google.android.libraries.places.api.model.ContentBlock contentBlock = this.zza;
        if (contentBlock != null) {
            return new com.google.android.libraries.places.api.model.zzdm(contentBlock, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg);
        }
        throw new java.lang.IllegalStateException("Missing required properties: overview");
    }

    final com.google.android.libraries.places.api.model.EvChargeAmenitySummary.Builder zza(com.google.android.libraries.places.api.model.ContentBlock contentBlock) {
        if (contentBlock == null) {
            throw new java.lang.NullPointerException("Null overview");
        }
        this.zza = contentBlock;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.EvChargeAmenitySummary.Builder
    public final com.google.android.libraries.places.api.model.EvChargeAmenitySummary.Builder setStore(com.google.android.libraries.places.api.model.ContentBlock contentBlock) {
        this.zzd = contentBlock;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.EvChargeAmenitySummary.Builder
    public final com.google.android.libraries.places.api.model.EvChargeAmenitySummary.Builder setRestaurant(com.google.android.libraries.places.api.model.ContentBlock contentBlock) {
        this.zzc = contentBlock;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.EvChargeAmenitySummary.Builder
    public final com.google.android.libraries.places.api.model.EvChargeAmenitySummary.Builder setFlagContentUri(android.net.Uri uri) {
        this.zze = uri;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.EvChargeAmenitySummary.Builder
    public final com.google.android.libraries.places.api.model.EvChargeAmenitySummary.Builder setDisclosureTextLanguageCode(java.lang.String str) {
        this.zzg = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.EvChargeAmenitySummary.Builder
    public final com.google.android.libraries.places.api.model.EvChargeAmenitySummary.Builder setDisclosureText(java.lang.String str) {
        this.zzf = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.EvChargeAmenitySummary.Builder
    public final com.google.android.libraries.places.api.model.EvChargeAmenitySummary.Builder setCoffee(com.google.android.libraries.places.api.model.ContentBlock contentBlock) {
        this.zzb = contentBlock;
        return this;
    }

    zzab() {
    }
}
