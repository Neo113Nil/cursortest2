package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzah extends com.google.android.libraries.places.api.model.GenerativeSummary.Builder {
    private java.lang.String zza;
    private java.lang.String zzb;
    private android.net.Uri zzc;
    private java.lang.String zzd;
    private java.lang.String zze;

    @Override // com.google.android.libraries.places.api.model.GenerativeSummary.Builder
    public final com.google.android.libraries.places.api.model.GenerativeSummary.Builder setOverviewLanguageCode(java.lang.String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.GenerativeSummary.Builder
    public final com.google.android.libraries.places.api.model.GenerativeSummary.Builder setOverview(java.lang.String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.GenerativeSummary.Builder
    public final com.google.android.libraries.places.api.model.GenerativeSummary.Builder setFlagContentUri(android.net.Uri uri) {
        this.zzc = uri;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.GenerativeSummary.Builder
    public final com.google.android.libraries.places.api.model.GenerativeSummary.Builder setDisclosureTextLanguageCode(java.lang.String str) {
        this.zze = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.GenerativeSummary.Builder
    public final com.google.android.libraries.places.api.model.GenerativeSummary.Builder setDisclosureText(java.lang.String str) {
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.GenerativeSummary.Builder
    public final com.google.android.libraries.places.api.model.GenerativeSummary build() {
        return new com.google.android.libraries.places.api.model.zzds(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
    }

    zzah() {
    }
}
