package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzkc {
    public zzle zza;
    public int zzb;
    public boolean zzc;
    public int zzd;
    private boolean zze;

    public zzkc(zzle zzleVar) {
        this.zza = zzleVar;
    }

    public final void zza(int i7) {
        this.zze = 1 == ((this.zze ? 1 : 0) | i7);
        this.zzb += i7;
    }

    public final void zzb(zzle zzleVar) {
        this.zze |= this.zza != zzleVar;
        this.zza = zzleVar;
    }

    public final void zzc(int i7) {
        if (this.zzc && this.zzd != 5) {
            zzcv.zzd(i7 == 5);
            return;
        }
        this.zze = true;
        this.zzc = true;
        this.zzd = i7;
    }
}
