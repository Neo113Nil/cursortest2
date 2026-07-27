package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zztr {
    private final zzcp[] zza;
    private final zzue zzb;
    private final zzcv zzc;

    public zztr(zzcp... zzcpVarArr) {
        zzue zzueVar = new zzue();
        zzcv zzcvVar = new zzcv();
        zzcp[] zzcpVarArr2 = {zzueVar, zzcvVar};
        this.zza = zzcpVarArr2;
        System.arraycopy(zzcpVarArr, 0, zzcpVarArr2, 0, 0);
        this.zzb = zzueVar;
        this.zzc = zzcvVar;
    }

    public final zzcp[] zza() {
        return this.zza;
    }

    public final zzav zzb(zzav zzavVar) {
        zzcv zzcvVar = this.zzc;
        zzcvVar.zzk(zzavVar.zzb);
        zzcvVar.zzl(zzavVar.zzc);
        return zzavVar;
    }

    public final boolean zzc(boolean z) {
        this.zzb.zzq(z);
        return z;
    }

    public final long zzd(long j) {
        zzcv zzcvVar = this.zzc;
        return zzcvVar.zzc() ? zzcvVar.zzm(j) : j;
    }

    public final long zze() {
        return this.zzb.zzr();
    }
}
