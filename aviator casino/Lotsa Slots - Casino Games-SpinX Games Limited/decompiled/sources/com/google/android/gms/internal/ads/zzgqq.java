package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgqq extends com.google.android.gms.internal.ads.zzgqy {
    private final java.lang.String zza;
    private final java.lang.String zzb;

    /* synthetic */ zzgqq(java.lang.String str, java.lang.String str2, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.ads.zzgqy) {
            com.google.android.gms.internal.ads.zzgqy zzgqyVar = (com.google.android.gms.internal.ads.zzgqy) obj;
            java.lang.String str = this.zza;
            if (str != null ? str.equals(zzgqyVar.zza()) : zzgqyVar.zza() == null) {
                java.lang.String str2 = this.zzb;
                if (str2 != null ? str2.equals(zzgqyVar.zzb()) : zzgqyVar.zzb() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.zza;
        int length = java.lang.String.valueOf(str).length();
        java.lang.String str2 = this.zzb;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 50 + java.lang.String.valueOf(str2).length() + 1);
        sb.append("OverlayDisplayDismissRequest{sessionToken=");
        sb.append(str);
        sb.append(", appId=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgqy
    public final java.lang.String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgqy
    public final java.lang.String zzb() {
        return this.zzb;
    }

    public final int hashCode() {
        java.lang.String str = this.zza;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.zzb;
        return ((hashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }
}
