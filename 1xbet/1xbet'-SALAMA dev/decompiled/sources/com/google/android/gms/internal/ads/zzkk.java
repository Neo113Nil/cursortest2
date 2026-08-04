package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzkk {
    private long zza;
    private float zzb;
    private long zzc;

    public zzkk() {
        this.zza = -9223372036854775807L;
        this.zzb = -3.4028235E38f;
        this.zzc = -9223372036854775807L;
    }

    public final zzkk zzd(long j) {
        boolean z4 = true;
        if (j < 0) {
            if (j == -9223372036854775807L) {
                j = -9223372036854775807L;
            } else {
                z4 = false;
            }
        }
        zzcv.zzd(z4);
        this.zzc = j;
        return this;
    }

    public final zzkk zze(long j) {
        this.zza = j;
        return this;
    }

    public final zzkk zzf(float f7) {
        boolean z4 = true;
        if (f7 <= 0.0f && f7 != -3.4028235E38f) {
            z4 = false;
        }
        zzcv.zzd(z4);
        this.zzb = f7;
        return this;
    }

    public final zzkm zzg() {
        return new zzkm(this, null);
    }

    public /* synthetic */ zzkk(zzkm zzkmVar, zzkl zzklVar) {
        this.zza = zzkmVar.zza;
        this.zzb = zzkmVar.zzb;
        this.zzc = zzkmVar.zzc;
    }
}
