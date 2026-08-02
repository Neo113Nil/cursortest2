package com.google.android.libraries.places.api.net;

/* loaded from: classes8.dex */
final class zza extends com.google.android.libraries.places.api.net.FetchPhotoRequest.Builder {
    private java.lang.Integer zza;
    private java.lang.Integer zzb;
    private com.google.android.libraries.places.api.model.PhotoMetadata zzc;
    private com.google.android.gms.tasks.CancellationToken zzd;

    final com.google.android.libraries.places.api.net.FetchPhotoRequest.Builder zza(com.google.android.libraries.places.api.model.PhotoMetadata photoMetadata) {
        if (photoMetadata == null) {
            throw new java.lang.NullPointerException("Null photoMetadata");
        }
        this.zzc = photoMetadata;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPhotoRequest.Builder
    final com.google.android.libraries.places.api.model.PhotoMetadata zzb() {
        com.google.android.libraries.places.api.model.PhotoMetadata photoMetadata = this.zzc;
        if (photoMetadata != null) {
            return photoMetadata;
        }
        throw new java.lang.IllegalStateException("Property \"photoMetadata\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.net.FetchPhotoRequest.Builder
    final com.google.android.libraries.places.api.net.FetchPhotoRequest zzc() {
        com.google.android.libraries.places.api.model.PhotoMetadata photoMetadata = this.zzc;
        if (photoMetadata != null) {
            return new com.google.android.libraries.places.api.net.zzb(this.zza, this.zzb, photoMetadata, this.zzd, null);
        }
        throw new java.lang.IllegalStateException("Missing required properties: photoMetadata");
    }

    @Override // com.google.android.libraries.places.api.net.FetchPhotoRequest.Builder
    public final com.google.android.libraries.places.api.net.FetchPhotoRequest.Builder setMaxWidth(java.lang.Integer num) {
        this.zza = num;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPhotoRequest.Builder
    public final com.google.android.libraries.places.api.net.FetchPhotoRequest.Builder setMaxHeight(java.lang.Integer num) {
        this.zzb = num;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPhotoRequest.Builder
    public final com.google.android.libraries.places.api.net.FetchPhotoRequest.Builder setCancellationToken(com.google.android.gms.tasks.CancellationToken cancellationToken) {
        this.zzd = cancellationToken;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPhotoRequest.Builder
    public final java.lang.Integer getMaxWidth() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPhotoRequest.Builder
    public final java.lang.Integer getMaxHeight() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPhotoRequest.Builder
    public final com.google.android.gms.tasks.CancellationToken getCancellationToken() {
        return this.zzd;
    }

    zza() {
    }
}
