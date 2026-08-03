package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzaja implements com.google.android.gms.internal.ads.zzao {
    public final java.lang.String zza;
    public final java.lang.String zzb;
    public final long zzc;
    public final long zzd;
    public final byte[] zze;
    private int zzf;

    static {
        com.google.android.gms.internal.ads.zzt zztVar = new com.google.android.gms.internal.ads.zzt();
        zztVar.zzo("application/id3");
        zztVar.zzO();
        com.google.android.gms.internal.ads.zzt zztVar2 = new com.google.android.gms.internal.ads.zzt();
        zztVar2.zzo("application/x-scte35");
        zztVar2.zzO();
    }

    public zzaja(java.lang.String str, java.lang.String str2, long j, long j2, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
        this.zzd = j2;
        this.zze = bArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzaja zzajaVar = (com.google.android.gms.internal.ads.zzaja) obj;
            if (this.zzc == zzajaVar.zzc && this.zzd == zzajaVar.zzd && java.util.Objects.equals(this.zza, zzajaVar.zza) && java.util.Objects.equals(this.zzb, zzajaVar.zzb) && java.util.Arrays.equals(this.zze, zzajaVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzf;
        if (i != 0) {
            return i;
        }
        int hashCode = ((this.zza.hashCode() + com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb.hashCode();
        long j = this.zzc;
        int hashCode2 = (((((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) this.zzd)) * 31) + java.util.Arrays.hashCode(this.zze);
        this.zzf = hashCode2;
        return hashCode2;
    }

    public final java.lang.String toString() {
        long j = this.zzd;
        int length = java.lang.String.valueOf(j).length();
        long j2 = this.zzc;
        int length2 = java.lang.String.valueOf(j2).length();
        java.lang.String str = this.zza;
        int length3 = str.length() + 18 + length + 13 + length2;
        java.lang.String str2 = this.zzb;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length3 + 8 + str2.length());
        sb.append("EMSG: scheme=");
        sb.append(str);
        sb.append(", id=");
        sb.append(j);
        sb.append(", durationMs=");
        sb.append(j2);
        sb.append(", value=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public /* synthetic */ void zza(com.google.android.gms.internal.ads.zzam zzamVar) {
        com.google.android.gms.internal.ads.zzao.CC.$default$zza(this, zzamVar);
    }
}
