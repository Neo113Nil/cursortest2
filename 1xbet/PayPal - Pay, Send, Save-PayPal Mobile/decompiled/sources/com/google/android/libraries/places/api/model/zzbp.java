package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzbp extends com.google.android.libraries.places.api.model.ReviewSummary.Builder {
    private java.lang.String zza;
    private java.lang.String zzb;
    private android.net.Uri zzc;
    private java.lang.String zzd;
    private java.lang.String zze;
    private android.net.Uri zzf;

    @Override // com.google.android.libraries.places.api.model.ReviewSummary.Builder
    public final com.google.android.libraries.places.api.model.ReviewSummary.Builder setTextLanguageCode(java.lang.String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ReviewSummary.Builder
    public final com.google.android.libraries.places.api.model.ReviewSummary.Builder setText(java.lang.String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ReviewSummary.Builder
    public final com.google.android.libraries.places.api.model.ReviewSummary.Builder setReviewsUri(android.net.Uri uri) {
        this.zzf = uri;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ReviewSummary.Builder
    public final com.google.android.libraries.places.api.model.ReviewSummary.Builder setFlagContentUri(android.net.Uri uri) {
        this.zzc = uri;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ReviewSummary.Builder
    public final com.google.android.libraries.places.api.model.ReviewSummary.Builder setDisclosureTextLanguageCode(java.lang.String str) {
        this.zze = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ReviewSummary.Builder
    public final com.google.android.libraries.places.api.model.ReviewSummary.Builder setDisclosureText(java.lang.String str) {
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ReviewSummary.Builder
    public final com.google.android.libraries.places.api.model.ReviewSummary build() {
        return new com.google.android.libraries.places.api.model.zzfc(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }

    zzbp() {
    }
}
