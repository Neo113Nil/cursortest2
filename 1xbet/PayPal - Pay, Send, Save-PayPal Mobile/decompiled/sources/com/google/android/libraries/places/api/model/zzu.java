package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzu extends com.google.android.libraries.places.api.model.ContentBlock.Builder {
    private java.lang.String zza;
    private java.lang.String zzb;
    private java.util.List zzc;
    private java.util.List zzd;

    @Override // com.google.android.libraries.places.api.model.ContentBlock.Builder
    final com.google.android.libraries.places.api.model.ContentBlock zzc() {
        return new com.google.android.libraries.places.api.model.zzde(this.zza, this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.libraries.places.api.model.ContentBlock.Builder
    final java.util.List zzb() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.ContentBlock.Builder
    final java.util.List zza() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.ContentBlock.Builder
    public final com.google.android.libraries.places.api.model.ContentBlock.Builder setReferencedPlaceResourceNames(java.util.List<java.lang.String> list) {
        this.zzc = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ContentBlock.Builder
    public final com.google.android.libraries.places.api.model.ContentBlock.Builder setReferencedPlaceIds(java.util.List<java.lang.String> list) {
        this.zzd = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ContentBlock.Builder
    public final com.google.android.libraries.places.api.model.ContentBlock.Builder setContentLanguageCode(java.lang.String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ContentBlock.Builder
    public final com.google.android.libraries.places.api.model.ContentBlock.Builder setContent(java.lang.String str) {
        this.zza = str;
        return this;
    }

    zzu() {
    }
}
