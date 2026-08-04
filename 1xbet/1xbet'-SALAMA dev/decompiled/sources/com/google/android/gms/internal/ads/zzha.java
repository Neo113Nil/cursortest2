package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public class zzha {
    private int zza;

    public final void zza(int i7) {
        this.zza |= 536870912;
    }

    public void zzb() {
        this.zza = 0;
    }

    public final void zzc(int i7) {
        this.zza = i7;
    }

    public final boolean zzd(int i7) {
        return (this.zza & i7) == i7;
    }

    public final boolean zze() {
        return zzd(268435456);
    }

    public final boolean zzf() {
        return zzd(4);
    }

    public final boolean zzg() {
        return zzd(1);
    }

    public final boolean zzh() {
        return zzd(536870912);
    }

    public final boolean zzi() {
        return zzd(67108864);
    }
}
