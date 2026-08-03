package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzajg extends com.google.android.gms.internal.ads.zzajo implements com.google.android.gms.internal.ads.zzaiv {
    public final java.lang.String zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;
    private final com.google.android.gms.internal.ads.zzajo[] zzg;

    public zzajg(java.lang.String str, int i, int i2, long j, long j2, com.google.android.gms.internal.ads.zzajo[] zzajoVarArr) {
        super("CHAP");
        com.google.android.gms.internal.ads.zzgtj.zza(i <= i2);
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = j;
        this.zze = j2;
        this.zzg = zzajoVarArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzajg zzajgVar = (com.google.android.gms.internal.ads.zzajg) obj;
            if (this.zzb == zzajgVar.zzb && this.zzc == zzajgVar.zzc && this.zzd == zzajgVar.zzd && this.zze == zzajgVar.zze && java.util.Objects.equals(this.zza, zzajgVar.zza) && java.util.Arrays.equals(this.zzg, zzajgVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb + com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        java.lang.String str = this.zza;
        long j = this.zze;
        return (((((((i * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + ((int) j)) * 31) + str.hashCode();
    }
}
