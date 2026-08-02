package com.google.android.libraries.places.api.auth;

/* loaded from: classes8.dex */
final class zzd extends com.google.android.libraries.places.api.auth.zzb {
    private final boolean zzb;
    private final java.lang.String zzc;
    private final java.lang.String zzd;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.api.auth.zzb)) {
            return false;
        }
        com.google.android.libraries.places.api.auth.zzb zzbVar = (com.google.android.libraries.places.api.auth.zzb) obj;
        if (this.zzb != zzbVar.zza()) {
            return false;
        }
        java.lang.String str = this.zzc;
        if (str == null) {
            if (zzbVar.zzb() != null) {
                return false;
            }
        } else if (!str.equals(zzbVar.zzb())) {
            return false;
        }
        java.lang.String str2 = this.zzd;
        if (str2 == null) {
            if (zzbVar.zzc() != null) {
                return false;
            }
        } else if (!str2.equals(zzbVar.zzc())) {
            return false;
        }
        return true;
    }

    public final java.lang.String toString() {
        boolean z = this.zzb;
        int length = java.lang.String.valueOf(z).length();
        java.lang.String str = this.zzc;
        int length2 = java.lang.String.valueOf(str).length();
        java.lang.String str2 = this.zzd;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 47 + length2 + 26 + java.lang.String.valueOf(str2).length() + 1);
        sb.append("AppCheckResult{appCheckEnabled=");
        sb.append(z);
        sb.append(", appCheckToken=");
        sb.append(str);
        sb.append(", appCheckTokenFetchError=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.zzc;
        int hashCode = str == null ? 0 : str.hashCode();
        int i = true != this.zzb ? 1237 : 1231;
        java.lang.String str2 = this.zzd;
        return ((hashCode ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.libraries.places.api.auth.zzb
    public final java.lang.String zzc() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.auth.zzb
    public final java.lang.String zzb() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.auth.zzb
    public final boolean zza() {
        return this.zzb;
    }

    /* synthetic */ zzd(boolean z, java.lang.String str, java.lang.String str2, byte[] bArr) {
        this.zzb = z;
        this.zzc = str;
        this.zzd = str2;
    }
}
