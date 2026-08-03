package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgqw extends com.google.android.gms.internal.ads.zzgry {
    private final java.lang.String zza;
    private final java.lang.String zzb;

    /* synthetic */ zzgqw(java.lang.String str, java.lang.String str2, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.ads.zzgry) {
            com.google.android.gms.internal.ads.zzgry zzgryVar = (com.google.android.gms.internal.ads.zzgry) obj;
            java.lang.String str = this.zza;
            if (str != null ? str.equals(zzgryVar.zza()) : zzgryVar.zza() == null) {
                java.lang.String str2 = this.zzb;
                if (str2 != null ? str2.equals(zzgryVar.zzb()) : zzgryVar.zzb() == null) {
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
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 49 + java.lang.String.valueOf(str2).length() + 1);
        sb.append("OverlayDisplayUpdateRequest{sessionToken=");
        sb.append(str);
        sb.append(", appId=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgry
    public final java.lang.String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgry
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
