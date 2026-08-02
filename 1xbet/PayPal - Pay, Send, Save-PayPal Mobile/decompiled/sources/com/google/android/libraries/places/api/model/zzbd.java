package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
abstract class zzbd extends com.google.android.libraries.places.api.model.PhotoMetadata {
    private final java.lang.String zza;
    private final int zzb;
    private final int zzc;
    private final java.lang.String zzd;
    private final java.lang.String zze;
    private final com.google.android.libraries.places.api.model.AuthorAttributions zzf;
    private final android.net.Uri zzg;

    zzbd(java.lang.String str, int i, int i2, java.lang.String str2, java.lang.String str3, com.google.android.libraries.places.api.model.AuthorAttributions authorAttributions, android.net.Uri uri) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null attributions");
        }
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        if (str2 == null) {
            throw new java.lang.NullPointerException("Null photoReference");
        }
        this.zzd = str2;
        this.zze = str3;
        this.zzf = authorAttributions;
        this.zzg = uri;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.api.model.PhotoMetadata)) {
            return false;
        }
        com.google.android.libraries.places.api.model.PhotoMetadata photoMetadata = (com.google.android.libraries.places.api.model.PhotoMetadata) obj;
        if (!this.zza.equals(photoMetadata.getAttributions()) || this.zzb != photoMetadata.getHeight() || this.zzc != photoMetadata.getWidth() || !this.zzd.equals(photoMetadata.zza())) {
            return false;
        }
        java.lang.String str = this.zze;
        if (str == null) {
            if (photoMetadata.zzb() != null) {
                return false;
            }
        } else if (!str.equals(photoMetadata.zzb())) {
            return false;
        }
        com.google.android.libraries.places.api.model.AuthorAttributions authorAttributions = this.zzf;
        if (authorAttributions == null) {
            if (photoMetadata.getAuthorAttributions() != null) {
                return false;
            }
        } else if (!authorAttributions.equals(photoMetadata.getAuthorAttributions())) {
            return false;
        }
        android.net.Uri uri = this.zzg;
        if (uri == null) {
            if (photoMetadata.zzc() != null) {
                return false;
            }
        } else if (!uri.equals(photoMetadata.zzc())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode();
        java.lang.String str = this.zzd;
        int i = this.zzb;
        int i2 = this.zzc;
        int hashCode2 = str.hashCode();
        java.lang.String str2 = this.zze;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        com.google.android.libraries.places.api.model.AuthorAttributions authorAttributions = this.zzf;
        int hashCode4 = authorAttributions == null ? 0 : authorAttributions.hashCode();
        android.net.Uri uri = this.zzg;
        return ((((((((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ (uri != null ? uri.hashCode() : 0);
    }

    public final java.lang.String toString() {
        android.net.Uri uri = this.zzg;
        java.lang.String valueOf = java.lang.String.valueOf(this.zzf);
        java.lang.String valueOf2 = java.lang.String.valueOf(uri);
        int i = this.zzb;
        int length = java.lang.String.valueOf(i).length();
        int i2 = this.zzc;
        int length2 = java.lang.String.valueOf(i2).length();
        java.lang.String str = this.zze;
        int length3 = java.lang.String.valueOf(str).length();
        int length4 = java.lang.String.valueOf(valueOf).length();
        int length5 = java.lang.String.valueOf(valueOf2).length();
        java.lang.String str2 = this.zza;
        int length6 = str2.length();
        java.lang.String str3 = this.zzd;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length6 + 36 + length + 8 + length2 + 17 + str3.length() + 7 + length3 + 21 + length4 + 17 + length5 + 1);
        sb.append("PhotoMetadata{attributions=");
        sb.append(str2);
        sb.append(", height=");
        sb.append(i);
        sb.append(", width=");
        sb.append(i2);
        sb.append(", photoReference=");
        sb.append(str3);
        sb.append(", name=");
        sb.append(str);
        sb.append(", authorAttributions=");
        sb.append(valueOf);
        sb.append(", flagContentUri=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata
    public final android.net.Uri zzc() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata
    public final java.lang.String zzb() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata
    public final java.lang.String zza() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata
    public int getWidth() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata
    public int getHeight() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata
    public com.google.android.libraries.places.api.model.AuthorAttributions getAuthorAttributions() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata
    public java.lang.String getAttributions() {
        return this.zza;
    }
}
