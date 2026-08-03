package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbd {
    public java.lang.Object zza;
    public java.lang.Object zzb;
    public int zzc;
    public long zzd;
    public long zze;
    public boolean zzf;
    public com.google.android.gms.internal.ads.zzc zzg = com.google.android.gms.internal.ads.zzc.zza;

    static {
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        java.lang.Integer.toString(0, 36);
        java.lang.Integer.toString(1, 36);
        java.lang.Integer.toString(2, 36);
        java.lang.Integer.toString(3, 36);
        java.lang.Integer.toString(4, 36);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass().equals(obj.getClass())) {
            com.google.android.gms.internal.ads.zzbd zzbdVar = (com.google.android.gms.internal.ads.zzbd) obj;
            if (java.util.Objects.equals(this.zza, zzbdVar.zza) && java.util.Objects.equals(this.zzb, zzbdVar.zzb) && this.zzc == zzbdVar.zzc && this.zzd == zzbdVar.zzd && this.zzf == zzbdVar.zzf && java.util.Objects.equals(this.zzg, zzbdVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final com.google.android.gms.internal.ads.zzbd zza(java.lang.Object obj, java.lang.Object obj2, int i, long j, long j2, com.google.android.gms.internal.ads.zzc zzcVar, boolean z) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = i;
        this.zzd = j;
        this.zze = 0L;
        this.zzg = zzcVar;
        this.zzf = z;
        return this;
    }

    public final int zzb() {
        int i = this.zzg.zzb;
        return 0;
    }

    public final long zzc(int i) {
        long j = this.zzg.zza(i).zza;
        return 0L;
    }

    public final int zzd(int i) {
        return this.zzg.zza(i).zza(-1);
    }

    public final int zze(long j) {
        this.zzg.zzb(-1);
        return -1;
    }

    public final int zzf(long j) {
        return -1;
    }

    public final int zzg(int i) {
        return this.zzg.zza(i).zzb;
    }

    public final long zzh(int i, int i2) {
        com.google.android.gms.internal.ads.zza zza = this.zzg.zza(i);
        if (zza.zzb != -1) {
            return zza.zzf[i2];
        }
        return -9223372036854775807L;
    }

    public final boolean zzi(int i) {
        zzb();
        if (i != -1) {
            return false;
        }
        this.zzg.zzb(-1);
        return false;
    }

    public final long zzj() {
        long j = this.zzg.zzc;
        return 0L;
    }

    public final boolean zzk(int i) {
        boolean z = this.zzg.zza(i).zzj;
        return false;
    }

    public final int hashCode() {
        java.lang.Object obj = this.zza;
        int hashCode = obj == null ? 0 : obj.hashCode();
        java.lang.Object obj2 = this.zzb;
        int hashCode2 = ((((hashCode + com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE) * 31) + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.zzc;
        long j = this.zzd;
        return (((((hashCode2 * 31) + ((int) (j ^ (j >>> 32)))) * 961) + (this.zzf ? 1 : 0)) * 31) + this.zzg.hashCode();
    }
}
