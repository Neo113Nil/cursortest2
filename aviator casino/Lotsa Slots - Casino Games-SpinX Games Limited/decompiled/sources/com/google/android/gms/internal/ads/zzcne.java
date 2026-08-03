package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcne {
    public final int zza;
    public final int zzb;
    private final int zzc;

    private zzcne(int i, int i2, int i3) {
        this.zzc = i;
        this.zzb = i2;
        this.zza = i3;
    }

    public static com.google.android.gms.internal.ads.zzcne zza(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        return zzrVar.zzd ? new com.google.android.gms.internal.ads.zzcne(3, 0, 0) : zzrVar.zzi ? new com.google.android.gms.internal.ads.zzcne(2, 0, 0) : zzrVar.zzh ? new com.google.android.gms.internal.ads.zzcne(0, 0, 0) : new com.google.android.gms.internal.ads.zzcne(1, zzrVar.zzf, zzrVar.zzc);
    }

    public static com.google.android.gms.internal.ads.zzcne zzb() {
        return new com.google.android.gms.internal.ads.zzcne(0, 0, 0);
    }

    public static com.google.android.gms.internal.ads.zzcne zzc(int i, int i2) {
        return new com.google.android.gms.internal.ads.zzcne(1, i, i2);
    }

    public static com.google.android.gms.internal.ads.zzcne zzd() {
        return new com.google.android.gms.internal.ads.zzcne(4, 0, 0);
    }

    public static com.google.android.gms.internal.ads.zzcne zze() {
        return new com.google.android.gms.internal.ads.zzcne(5, 0, 0);
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
