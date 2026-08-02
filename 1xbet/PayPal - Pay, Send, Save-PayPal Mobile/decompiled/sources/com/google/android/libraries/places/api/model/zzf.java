package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzf extends com.google.android.libraries.places.api.model.AuthorAttribution.Builder {
    private java.lang.String zza;
    private java.lang.String zzb;
    private java.lang.String zzc;

    final com.google.android.libraries.places.api.model.AuthorAttribution.Builder zza(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null name");
        }
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AuthorAttribution.Builder
    final com.google.android.libraries.places.api.model.AuthorAttribution zzb() {
        java.lang.String str = this.zza;
        if (str != null) {
            return new com.google.android.libraries.places.api.model.zzcm(str, this.zzb, this.zzc);
        }
        throw new java.lang.IllegalStateException("Missing required properties: name");
    }

    @Override // com.google.android.libraries.places.api.model.AuthorAttribution.Builder
    public final com.google.android.libraries.places.api.model.AuthorAttribution.Builder setUri(java.lang.String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AuthorAttribution.Builder
    public final com.google.android.libraries.places.api.model.AuthorAttribution.Builder setPhotoUri(java.lang.String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AuthorAttribution.Builder
    public final java.lang.String getUri() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.AuthorAttribution.Builder
    public final java.lang.String getPhotoUri() {
        return this.zzc;
    }

    zzf() {
    }
}
