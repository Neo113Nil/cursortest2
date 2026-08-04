package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzaec {
    private final byte[] zza = new byte[10];
    private boolean zzb;
    private int zzc;
    private long zzd;
    private int zze;
    private int zzf;
    private int zzg;

    public final void zza(zzaeb zzaebVar, zzaea zzaeaVar) {
        if (this.zzc > 0) {
            zzaebVar.zzt(this.zzd, this.zze, this.zzf, this.zzg, zzaeaVar);
            this.zzc = 0;
        }
    }

    public final void zzb() {
        this.zzb = false;
        this.zzc = 0;
    }

    public final void zzc(zzaeb zzaebVar, long j, int i7, int i8, int i9, zzaea zzaeaVar) {
        zzcv.zzg(this.zzg <= i8 + i9, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.zzb) {
            int i10 = this.zzc;
            int i11 = i10 + 1;
            this.zzc = i11;
            if (i10 == 0) {
                this.zzd = j;
                this.zze = i7;
                this.zzf = 0;
            }
            this.zzf += i8;
            this.zzg = i9;
            if (i11 >= 16) {
                zza(zzaebVar, zzaeaVar);
            }
        }
    }

    public final void zzd(zzacw zzacwVar) {
        if (this.zzb) {
            return;
        }
        zzacwVar.zzh(this.zza, 0, 10);
        zzacwVar.zzj();
        byte[] bArr = this.zza;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.zzb = true;
        }
    }
}
