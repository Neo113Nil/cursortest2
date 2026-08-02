package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
abstract class zzg extends com.google.android.libraries.places.api.model.AuthorAttribution {
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;

    zzg(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null name");
        }
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.api.model.AuthorAttribution)) {
            return false;
        }
        com.google.android.libraries.places.api.model.AuthorAttribution authorAttribution = (com.google.android.libraries.places.api.model.AuthorAttribution) obj;
        if (!this.zza.equals(authorAttribution.getName())) {
            return false;
        }
        java.lang.String str = this.zzb;
        if (str == null) {
            if (authorAttribution.getUri() != null) {
                return false;
            }
        } else if (!str.equals(authorAttribution.getUri())) {
            return false;
        }
        java.lang.String str2 = this.zzc;
        if (str2 == null) {
            if (authorAttribution.getPhotoUri() != null) {
                return false;
            }
        } else if (!str2.equals(authorAttribution.getPhotoUri())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode();
        java.lang.String str = this.zzb;
        int hashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.zzc;
        return ((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.zzb;
        int length = java.lang.String.valueOf(str).length();
        java.lang.String str2 = this.zzc;
        int length2 = java.lang.String.valueOf(str2).length();
        java.lang.String str3 = this.zza;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str3.length() + 29 + length + 11 + length2 + 1);
        sb.append("AuthorAttribution{name=");
        sb.append(str3);
        sb.append(", uri=");
        sb.append(str);
        sb.append(", photoUri=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.model.AuthorAttribution
    public final java.lang.String getUri() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.AuthorAttribution
    public final java.lang.String getPhotoUri() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.AuthorAttribution
    public final java.lang.String getName() {
        return this.zza;
    }
}
