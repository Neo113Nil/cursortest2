package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zznn {
    public final long zza;
    public final com.google.android.gms.internal.ads.zzbf zzb;
    public final int zzc;
    public final com.google.android.gms.internal.ads.zzxk zzd;
    public final long zze;
    public final com.google.android.gms.internal.ads.zzbf zzf;
    public final int zzg;
    public final com.google.android.gms.internal.ads.zzxk zzh;
    public final long zzi;
    public final long zzj;

    public zznn(long j, com.google.android.gms.internal.ads.zzbf zzbfVar, int i, com.google.android.gms.internal.ads.zzxk zzxkVar, long j2, com.google.android.gms.internal.ads.zzbf zzbfVar2, int i2, com.google.android.gms.internal.ads.zzxk zzxkVar2, long j3, long j4) {
        this.zza = j;
        this.zzb = zzbfVar;
        this.zzc = i;
        this.zzd = zzxkVar;
        this.zze = j2;
        this.zzf = zzbfVar2;
        this.zzg = i2;
        this.zzh = zzxkVar2;
        this.zzi = j3;
        this.zzj = j4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zznn zznnVar = (com.google.android.gms.internal.ads.zznn) obj;
            if (this.zza == zznnVar.zza && this.zzc == zznnVar.zzc && this.zze == zznnVar.zze && this.zzg == zznnVar.zzg && this.zzi == zznnVar.zzi && this.zzj == zznnVar.zzj && java.util.Objects.equals(this.zzb, zznnVar.zzb) && java.util.Objects.equals(this.zzd, zznnVar.zzd) && java.util.Objects.equals(this.zzf, zznnVar.zzf) && java.util.Objects.equals(this.zzh, zznnVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Objects.hash(java.lang.Long.valueOf(this.zza), this.zzb, java.lang.Integer.valueOf(this.zzc), this.zzd, java.lang.Long.valueOf(this.zze), this.zzf, java.lang.Integer.valueOf(this.zzg), this.zzh, java.lang.Long.valueOf(this.zzi), java.lang.Long.valueOf(this.zzj));
    }
}
