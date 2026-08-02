package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzamc {
    private final zzaeb zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private int zze;
    private int zzf;
    private long zzg;
    private long zzh;

    public zzamc(zzaeb zzaebVar) {
        this.zza = zzaebVar;
    }

    public final void zza(byte[] bArr, int i7, int i8) {
        if (this.zzc) {
            int i9 = this.zzf;
            int i10 = (i7 + 1) - i9;
            if (i10 >= i8) {
                this.zzf = (i8 - i7) + i9;
            } else {
                this.zzd = ((bArr[i10] & 192) >> 6) == 0;
                this.zzc = false;
            }
        }
    }

    public final void zzb(long j, int i7, boolean z4) {
        zzcv.zzf(this.zzh != -9223372036854775807L);
        if (this.zze == 182 && z4 && this.zzb) {
            this.zza.zzt(this.zzh, this.zzd ? 1 : 0, (int) (j - this.zzg), i7, null);
        }
        if (this.zze != 179) {
            this.zzg = j;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzc(int i7, long j) {
        boolean z4;
        this.zze = i7;
        this.zzd = false;
        if (i7 != 182) {
            if (i7 != 179) {
                z4 = false;
                this.zzb = z4;
                this.zzc = i7 == 182;
                this.zzf = 0;
                this.zzh = j;
            }
            i7 = 179;
        }
        z4 = true;
        this.zzb = z4;
        this.zzc = i7 == 182;
        this.zzf = 0;
        this.zzh = j;
    }

    public final void zzd() {
        this.zzb = false;
        this.zzc = false;
        this.zzd = false;
        this.zze = -1;
    }
}
