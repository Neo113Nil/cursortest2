package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zztm {
    private final com.google.android.gms.internal.ads.zzco[] zza;
    private final com.google.android.gms.internal.ads.zztz zzb;
    private final com.google.android.gms.internal.ads.zzcu zzc;

    public zztm(com.google.android.gms.internal.ads.zzco... zzcoVarArr) {
        com.google.android.gms.internal.ads.zztz zztzVar = new com.google.android.gms.internal.ads.zztz();
        com.google.android.gms.internal.ads.zzcu zzcuVar = new com.google.android.gms.internal.ads.zzcu();
        com.google.android.gms.internal.ads.zzco[] zzcoVarArr2 = {zztzVar, zzcuVar};
        this.zza = zzcoVarArr2;
        java.lang.System.arraycopy(zzcoVarArr, 0, zzcoVarArr2, 0, 0);
        this.zzb = zztzVar;
        this.zzc = zzcuVar;
    }

    public final com.google.android.gms.internal.ads.zzco[] zza() {
        return this.zza;
    }

    public final com.google.android.gms.internal.ads.zzav zzb(com.google.android.gms.internal.ads.zzav zzavVar) {
        com.google.android.gms.internal.ads.zzcu zzcuVar = this.zzc;
        zzcuVar.zzk(zzavVar.zzb);
        zzcuVar.zzl(zzavVar.zzc);
        return zzavVar;
    }

    public final boolean zzc(boolean z) {
        this.zzb.zzq(z);
        return z;
    }

    public final long zzd(long j) {
        com.google.android.gms.internal.ads.zzcu zzcuVar = this.zzc;
        return zzcuVar.zzc() ? zzcuVar.zzm(j) : j;
    }

    public final long zze() {
        return this.zzb.zzr();
    }
}
