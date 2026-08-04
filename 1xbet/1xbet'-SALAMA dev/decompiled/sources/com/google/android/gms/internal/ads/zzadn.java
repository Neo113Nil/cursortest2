package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;

/* JADX INFO: loaded from: classes.dex */
public final class zzadn {
    public int zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;

    public zzadn() {
    }

    public final boolean zza(int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        if (!zzado.zzm(i7) || (i8 = (i7 >>> 19) & 3) == 1 || (i9 = (i7 >>> 17) & 3) == 0 || (i10 = (i7 >>> 12) & 15) == 0 || i10 == 15 || (i11 = (i7 >>> 10) & 3) == 3) {
            return false;
        }
        int i12 = i10 - 1;
        this.zza = i8;
        this.zzb = zzado.zza[3 - i9];
        int i13 = zzado.zzb[i11];
        this.zzd = i13;
        if (i8 == 2) {
            i13 /= 2;
            this.zzd = i13;
        } else if (i8 == 0) {
            i13 /= 4;
            this.zzd = i13;
        }
        int i14 = (i7 >>> 9) & 1;
        this.zzg = zzado.zzl(i8, i9);
        if (i9 == 3) {
            int i15 = i8 == 3 ? zzado.zzc[i12] : zzado.zzd[i12];
            this.zzf = i15;
            this.zzc = (((i15 * 12) / i13) + i14) * 4;
        } else {
            if (i8 == 3) {
                int i16 = i9 == 2 ? zzado.zze[i12] : zzado.zzf[i12];
                this.zzf = i16;
                this.zzc = AbstractC0486a1.q(i16, 144, i13, i14);
            } else {
                int i17 = zzado.zzg[i12];
                this.zzf = i17;
                this.zzc = AbstractC0486a1.q(i9 == 1 ? 72 : 144, i17, i13, i14);
            }
        }
        this.zze = ((i7 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }

    public zzadn(zzadn zzadnVar) {
        this.zza = zzadnVar.zza;
        this.zzb = zzadnVar.zzb;
        this.zzc = zzadnVar.zzc;
        this.zzd = zzadnVar.zzd;
        this.zze = zzadnVar.zze;
        this.zzf = zzadnVar.zzf;
        this.zzg = zzadnVar.zzg;
    }
}
