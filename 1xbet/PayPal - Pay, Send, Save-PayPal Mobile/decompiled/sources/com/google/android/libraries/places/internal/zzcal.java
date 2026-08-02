package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzcal {
    private static final com.google.android.libraries.places.internal.zzcaj zza = new com.google.android.libraries.places.internal.zzcaj(com.google.android.libraries.places.internal.zzcag.zza);
    private final com.google.android.libraries.places.internal.zzcag zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private long zzf;
    private final com.google.android.libraries.places.internal.zzbug zzg;
    private volatile long zzh;

    public zzcal() {
        this.zzg = com.google.android.libraries.places.internal.zzbuh.zza();
        this.zzb = com.google.android.libraries.places.internal.zzcag.zza;
    }

    public final void zza() {
        this.zzc++;
        this.zzb.zza();
    }

    public final void zzc(int i) {
        if (i == 0) {
            return;
        }
        this.zzf += i;
        this.zzb.zza();
    }

    public final void zzd() {
        this.zzg.zza(1L);
        this.zzh = this.zzb.zza();
    }

    /* synthetic */ zzcal(com.google.android.libraries.places.internal.zzcag zzcagVar, byte[] bArr) {
        this.zzg = com.google.android.libraries.places.internal.zzbuh.zza();
        this.zzb = zzcagVar;
    }

    public final void zzb(boolean z) {
        if (z) {
            this.zzd++;
        } else {
            this.zze++;
        }
    }

    public static com.google.android.libraries.places.internal.zzcaj zze() {
        return zza;
    }
}
