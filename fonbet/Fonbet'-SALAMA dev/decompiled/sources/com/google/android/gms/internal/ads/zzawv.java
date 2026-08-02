package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzawv extends zzaxe {
    private final boolean zzh;

    public zzawv(zzavr zzavrVar, String str, String str2, zzarr zzarrVar, int i7, int i8) {
        super(zzavrVar, "lX7Ros7P0iIUcvtNHUv4w251LjEysSeKk+GMaeRlDGSoAtFhlMV2cZDKW9all6MA", "Nja0+UFQndq3CGvmIApKkpLrE9ayFb3u5RBufCtuuPA=", zzarrVar, i7, 61);
        this.zzh = zzavrVar.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzaxe
    public final void zza() {
        long longValue = ((Long) this.zze.invoke(null, this.zza.zzb(), Boolean.valueOf(this.zzh))).longValue();
        synchronized (this.zzd) {
            this.zzd.zzC(longValue);
        }
    }
}
