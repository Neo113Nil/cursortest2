package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzqn {
    private final zzcg[] zza;
    private final zzrf zzb;
    private final zzcj zzc;

    public zzqn(zzcg... zzcgVarArr) {
        zzrf zzrfVar = new zzrf();
        zzcj zzcjVar = new zzcj();
        zzcg[] zzcgVarArr2 = {zzrfVar, zzcjVar};
        this.zza = zzcgVarArr2;
        System.arraycopy(zzcgVarArr, 0, zzcgVarArr2, 0, 0);
        this.zzb = zzrfVar;
        this.zzc = zzcjVar;
    }

    public final long zza(long j) {
        return this.zzc.zzg() ? this.zzc.zzi(j) : j;
    }

    public final long zzb() {
        return this.zzb.zzo();
    }

    public final zzbb zzc(zzbb zzbbVar) {
        this.zzc.zzk(zzbbVar.zzb);
        this.zzc.zzj(zzbbVar.zzc);
        return zzbbVar;
    }

    public final boolean zzd(boolean z4) {
        this.zzb.zzp(z4);
        return z4;
    }

    public final zzcg[] zze() {
        return this.zza;
    }
}
