package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzbn extends com.google.android.libraries.places.api.model.Review.Builder {
    private java.lang.String zza;
    private java.lang.String zzb;
    private java.lang.String zzc;
    private java.lang.String zzd;
    private java.lang.String zze;
    private java.lang.Double zzf;
    private com.google.android.libraries.places.api.model.AuthorAttribution zzg;
    private java.lang.String zzh;
    private java.lang.String zzi;
    private android.net.Uri zzj;
    private com.google.android.libraries.places.api.model.LocalDate zzk;

    final com.google.android.libraries.places.api.model.Review.Builder zza(java.lang.Double d) {
        if (d == null) {
            throw new java.lang.NullPointerException("Null rating");
        }
        this.zzf = d;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Review.Builder
    final com.google.android.libraries.places.api.model.Review.Builder zzb(com.google.android.libraries.places.api.model.AuthorAttribution authorAttribution) {
        if (authorAttribution == null) {
            throw new java.lang.NullPointerException("Null authorAttribution");
        }
        this.zzg = authorAttribution;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Review.Builder
    final com.google.android.libraries.places.api.model.Review zzd() {
        com.google.android.libraries.places.api.model.AuthorAttribution authorAttribution;
        java.lang.String str;
        java.lang.Double d = this.zzf;
        if (d != null && (authorAttribution = this.zzg) != null && (str = this.zzh) != null) {
            return new com.google.android.libraries.places.api.model.zzfa(this.zza, this.zzb, this.zzc, this.zzd, this.zze, d, authorAttribution, str, this.zzi, this.zzj, this.zzk);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.zzf == null) {
            sb.append(" rating");
        }
        if (this.zzg == null) {
            sb.append(" authorAttribution");
        }
        if (this.zzh == null) {
            sb.append(" attribution");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.libraries.places.api.model.Review.Builder
    final com.google.android.libraries.places.api.model.Review.Builder zzc(java.lang.String str) {
        this.zzh = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Review.Builder
    public final com.google.android.libraries.places.api.model.Review.Builder setVisitDate(com.google.android.libraries.places.api.model.LocalDate localDate) {
        this.zzk = localDate;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Review.Builder
    public final com.google.android.libraries.places.api.model.Review.Builder setTextLanguageCode(java.lang.String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Review.Builder
    public final com.google.android.libraries.places.api.model.Review.Builder setText(java.lang.String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Review.Builder
    public final com.google.android.libraries.places.api.model.Review.Builder setRelativePublishTimeDescription(java.lang.String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Review.Builder
    public final com.google.android.libraries.places.api.model.Review.Builder setPublishTime(java.lang.String str) {
        this.zzi = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Review.Builder
    public final com.google.android.libraries.places.api.model.Review.Builder setOriginalTextLanguageCode(java.lang.String str) {
        this.zze = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Review.Builder
    public final com.google.android.libraries.places.api.model.Review.Builder setOriginalText(java.lang.String str) {
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Review.Builder
    public final com.google.android.libraries.places.api.model.Review.Builder setFlagContentUri(android.net.Uri uri) {
        this.zzj = uri;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Review.Builder
    public final java.lang.String getTextLanguageCode() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.Review.Builder
    public final java.lang.String getText() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.Review.Builder
    public final java.lang.String getRelativePublishTimeDescription() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.Review.Builder
    public final java.lang.String getPublishTime() {
        return this.zzi;
    }

    @Override // com.google.android.libraries.places.api.model.Review.Builder
    public final java.lang.String getOriginalTextLanguageCode() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.model.Review.Builder
    public final java.lang.String getOriginalText() {
        return this.zzd;
    }

    zzbn() {
    }
}
