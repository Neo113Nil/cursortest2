package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzcnw {
    public final int zza;
    public final int zzb;
    private final int zzc;

    private zzcnw(int i, int i2, int i3) {
        this.zzc = i;
        this.zzb = i2;
        this.zza = i3;
    }

    public static zzcnw zza(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        return zzrVar.zzd ? new zzcnw(3, 0, 0) : zzrVar.zzi ? new zzcnw(2, 0, 0) : zzrVar.zzh ? new zzcnw(0, 0, 0) : new zzcnw(1, zzrVar.zzf, zzrVar.zzc);
    }

    public static zzcnw zzb() {
        return new zzcnw(0, 0, 0);
    }

    public static zzcnw zzc(int i, int i2) {
        return new zzcnw(1, i, i2);
    }

    public static zzcnw zzd() {
        return new zzcnw(4, 0, 0);
    }

    public static zzcnw zze() {
        return new zzcnw(5, 0, 0);
    }

    public final boolean zzf() {
        return this.zzc == 2;
    }

    public final boolean zzg() {
        return this.zzc == 3;
    }

    public final boolean zzh() {
        return this.zzc == 0;
    }

    public final boolean zzi() {
        return this.zzc == 4;
    }

    public final boolean zzj() {
        return this.zzc == 5;
    }
}
