package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzas extends com.google.android.libraries.places.api.model.NeighborhoodSummary.Builder {
    private com.google.android.libraries.places.api.model.ContentBlock zza;
    private com.google.android.libraries.places.api.model.ContentBlock zzb;
    private android.net.Uri zzc;
    private java.lang.String zzd;
    private java.lang.String zze;

    @Override // com.google.android.libraries.places.api.model.NeighborhoodSummary.Builder
    public final com.google.android.libraries.places.api.model.NeighborhoodSummary.Builder setOverview(com.google.android.libraries.places.api.model.ContentBlock contentBlock) {
        this.zza = contentBlock;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.NeighborhoodSummary.Builder
    public final com.google.android.libraries.places.api.model.NeighborhoodSummary.Builder setFlagContentUri(android.net.Uri uri) {
        this.zzc = uri;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.NeighborhoodSummary.Builder
    public final com.google.android.libraries.places.api.model.NeighborhoodSummary.Builder setDisclosureTextLanguageCode(java.lang.String str) {
        this.zze = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.NeighborhoodSummary.Builder
    public final com.google.android.libraries.places.api.model.NeighborhoodSummary.Builder setDisclosureText(java.lang.String str) {
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.NeighborhoodSummary.Builder
    public final com.google.android.libraries.places.api.model.NeighborhoodSummary.Builder setDescription(com.google.android.libraries.places.api.model.ContentBlock contentBlock) {
        this.zzb = contentBlock;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.NeighborhoodSummary.Builder
    public final com.google.android.libraries.places.api.model.NeighborhoodSummary build() {
        return new com.google.android.libraries.places.api.model.zzee(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
    }

    zzas() {
    }
}
