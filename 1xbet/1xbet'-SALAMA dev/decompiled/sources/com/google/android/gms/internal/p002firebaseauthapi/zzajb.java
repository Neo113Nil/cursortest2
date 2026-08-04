package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzajb {
    private static volatile int zze = 100;
    int zza;
    int zzb;
    int zzc;
    zzajf zzd;

    public static long zza(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static int zze(int i7) {
        return (-(i7 & 1)) ^ (i7 >>> 1);
    }

    public abstract double zza();

    public abstract int zza(int i7);

    public abstract float zzb();

    public abstract void zzb(int i7);

    public abstract int zzc();

    public abstract void zzc(int i7);

    public abstract int zzd();

    public abstract boolean zzd(int i7);

    public abstract int zze();

    public abstract int zzf();

    public abstract int zzg();

    public abstract int zzh();

    public abstract int zzi();

    public abstract int zzj();

    public abstract long zzk();

    public abstract long zzl();

    public abstract long zzm();

    public abstract long zzn();

    public abstract long zzo();

    public abstract long zzp();

    public abstract zzaip zzq();

    public abstract String zzr();

    public abstract String zzs();

    public abstract boolean zzt();

    public abstract boolean zzu();

    public final void zzv() throws zzakf {
        boolean zZzd;
        do {
            int iZzi = zzi();
            if (iZzi == 0) {
                return;
            }
            int i7 = this.zza;
            if (i7 >= this.zzb) {
                throw zzakf.zzh();
            }
            this.zza = i7 + 1;
            zZzd = zzd(iZzi);
            this.zza--;
        } while (zZzd);
    }

    private zzajb() {
        this.zzb = zze;
        this.zzc = f.API_PRIORITY_OTHER;
    }

    public static zzajb zza(byte[] bArr, int i7, int i8, boolean z4) {
        zzaja zzajaVar = new zzaja(bArr, i7, i8, z4);
        try {
            zzajaVar.zza(i8);
            return zzajaVar;
        } catch (zzakf e7) {
            throw new IllegalArgumentException(e7);
        }
    }
}
