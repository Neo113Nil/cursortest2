package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzcfv {
    public final int zza;
    public final int zzb;
    private final int zzc;

    private zzcfv(int i7, int i8, int i9) {
        this.zzc = i7;
        this.zzb = i8;
        this.zza = i9;
    }

    public static zzcfv zza() {
        return new zzcfv(0, 0, 0);
    }

    public static zzcfv zzb(int i7, int i8) {
        return new zzcfv(1, i7, i8);
    }

    public static zzcfv zzc(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        return zzrVar.f10774d ? new zzcfv(3, 0, 0) : zzrVar.f10779z ? new zzcfv(2, 0, 0) : zzrVar.f10778y ? new zzcfv(0, 0, 0) : new zzcfv(1, zzrVar.f10776f, zzrVar.f10773c);
    }

    public static zzcfv zzd() {
        return new zzcfv(5, 0, 0);
    }

    public static zzcfv zze() {
        return new zzcfv(4, 0, 0);
    }

    public final boolean zzf() {
        return this.zzc == 0;
    }

    public final boolean zzg() {
        return this.zzc == 2;
    }

    public final boolean zzh() {
        return this.zzc == 5;
    }

    public final boolean zzi() {
        return this.zzc == 3;
    }

    public final boolean zzj() {
        return this.zzc == 4;
    }
}
