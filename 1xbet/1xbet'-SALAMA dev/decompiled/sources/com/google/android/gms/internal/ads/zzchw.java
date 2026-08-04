package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzchw {
    private zzcge zza;
    private zzciq zzb;
    private zzffi zzc;
    private zzcjd zzd;
    private zzfcc zze;

    private zzchw() {
        throw null;
    }

    public final zzcgb zza() {
        zzheo.zzc(this.zza, zzcge.class);
        zzheo.zzc(this.zzb, zzciq.class);
        if (this.zzc == null) {
            this.zzc = new zzffi();
        }
        if (this.zzd == null) {
            this.zzd = new zzcjd();
        }
        if (this.zze == null) {
            this.zze = new zzfcc();
        }
        return new zzchl(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public final zzchw zzb(zzcge zzcgeVar) {
        this.zza = zzcgeVar;
        return this;
    }

    public final zzchw zzc(zzciq zzciqVar) {
        this.zzb = zzciqVar;
        return this;
    }

    public /* synthetic */ zzchw(zzcip zzcipVar) {
    }
}
