package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzbc extends com.google.android.libraries.places.api.model.PhotoMetadata.Builder {
    private java.lang.String zza;
    private int zzb;
    private int zzc;
    private java.lang.String zzd;
    private java.lang.String zze;
    private com.google.android.libraries.places.api.model.AuthorAttributions zzf;
    private android.net.Uri zzg;
    private byte zzh;

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final java.lang.String getAttributions() {
        java.lang.String str = this.zza;
        if (str != null) {
            return str;
        }
        throw new java.lang.IllegalStateException("Property \"attributions\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final int getHeight() {
        if ((this.zzh & 1) != 0) {
            return this.zzb;
        }
        throw new java.lang.IllegalStateException("Property \"height\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final int getWidth() {
        if ((this.zzh & 2) != 0) {
            return this.zzc;
        }
        throw new java.lang.IllegalStateException("Property \"width\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final com.google.android.libraries.places.api.model.PhotoMetadata.Builder setAttributions(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null attributions");
        }
        this.zza = str;
        return this;
    }

    final com.google.android.libraries.places.api.model.PhotoMetadata.Builder zza(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null photoReference");
        }
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    final com.google.android.libraries.places.api.model.PhotoMetadata zzd() {
        java.lang.String str;
        java.lang.String str2;
        if (this.zzh == 3 && (str = this.zza) != null && (str2 = this.zzd) != null) {
            return new com.google.android.libraries.places.api.model.zzeo(str, this.zzb, this.zzc, str2, this.zze, this.zzf, this.zzg);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.zza == null) {
            sb.append(" attributions");
        }
        if ((this.zzh & 1) == 0) {
            sb.append(" height");
        }
        if ((this.zzh & 2) == 0) {
            sb.append(" width");
        }
        if (this.zzd == null) {
            sb.append(" photoReference");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final com.google.android.libraries.places.api.model.PhotoMetadata.Builder zzc(android.net.Uri uri) {
        this.zzg = uri;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final com.google.android.libraries.places.api.model.PhotoMetadata.Builder zzb(java.lang.String str) {
        this.zze = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final com.google.android.libraries.places.api.model.PhotoMetadata.Builder setWidth(int i) {
        this.zzc = i;
        this.zzh = (byte) (this.zzh | 2);
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final com.google.android.libraries.places.api.model.PhotoMetadata.Builder setHeight(int i) {
        this.zzb = i;
        this.zzh = (byte) (this.zzh | 1);
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final com.google.android.libraries.places.api.model.PhotoMetadata.Builder setAuthorAttributions(com.google.android.libraries.places.api.model.AuthorAttributions authorAttributions) {
        this.zzf = authorAttributions;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final com.google.android.libraries.places.api.model.AuthorAttributions getAuthorAttributions() {
        return this.zzf;
    }

    zzbc() {
    }
}
