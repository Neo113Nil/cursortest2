package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzejx extends com.google.android.gms.internal.ads.zzekt {
    private final android.app.Activity zza;
    private final com.google.android.gms.ads.internal.overlay.zzm zzb;
    private final java.lang.String zzc;
    private final java.lang.String zzd;

    /* synthetic */ zzejx(android.app.Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, java.lang.String str, java.lang.String str2, byte[] bArr) {
        this.zza = activity;
        this.zzb = zzmVar;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar;
        java.lang.String str;
        java.lang.String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.ads.zzekt) {
            com.google.android.gms.internal.ads.zzekt zzektVar = (com.google.android.gms.internal.ads.zzekt) obj;
            if (this.zza.equals(zzektVar.zza()) && ((zzmVar = this.zzb) != null ? zzmVar.equals(zzektVar.zzb()) : zzektVar.zzb() == null) && ((str = this.zzc) != null ? str.equals(zzektVar.zzc()) : zzektVar.zzc() == null) && ((str2 = this.zzd) != null ? str2.equals(zzektVar.zzd()) : zzektVar.zzd() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() ^ 1000003;
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzb;
        int hashCode2 = ((hashCode * 1000003) ^ (zzmVar == null ? 0 : zzmVar.hashCode())) * 1000003;
        java.lang.String str = this.zzc;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        java.lang.String str2 = this.zzd;
        return hashCode3 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.zza.toString();
        int length = obj.length();
        java.lang.String valueOf = java.lang.String.valueOf(this.zzb);
        int length2 = java.lang.String.valueOf(valueOf).length();
        java.lang.String str = this.zzc;
        int length3 = java.lang.String.valueOf(str).length();
        java.lang.String str2 = this.zzd;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 40 + length2 + 13 + length3 + 6 + java.lang.String.valueOf(str2).length() + 1);
        sb.append("OfflineUtilsParams{activity=");
        sb.append(obj);
        sb.append(", adOverlay=");
        sb.append(valueOf);
        sb.append(", gwsQueryId=");
        sb.append(str);
        sb.append(", uri=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzekt
    public final android.app.Activity zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzekt
    public final com.google.android.gms.ads.internal.overlay.zzm zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzekt
    public final java.lang.String zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzekt
    public final java.lang.String zzd() {
        return this.zzd;
    }
}
