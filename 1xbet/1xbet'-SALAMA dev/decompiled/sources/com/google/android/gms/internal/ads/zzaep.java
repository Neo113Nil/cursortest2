package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
final class zzaep implements zzaej {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;

    private zzaep(int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        this.zza = i7;
        this.zzb = i9;
        this.zzc = i10;
        this.zzd = i11;
        this.zze = i12;
        this.zzf = i13;
    }

    public static zzaep zzd(zzed zzedVar) {
        int iZzi = zzedVar.zzi();
        zzedVar.zzM(12);
        int iZzi2 = zzedVar.zzi();
        int iZzi3 = zzedVar.zzi();
        int iZzi4 = zzedVar.zzi();
        zzedVar.zzM(4);
        int iZzi5 = zzedVar.zzi();
        int iZzi6 = zzedVar.zzi();
        zzedVar.zzM(4);
        return new zzaep(iZzi, iZzi2, iZzi3, iZzi4, iZzi5, iZzi6, zzedVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzaej
    public final int zza() {
        return 1752331379;
    }

    public final int zzb() {
        int i7 = this.zza;
        if (i7 == 1935960438) {
            return 2;
        }
        if (i7 == 1935963489) {
            return 1;
        }
        if (i7 == 1937012852) {
            return 3;
        }
        zzdq.zzf("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i7))));
        return -1;
    }

    public final long zzc() {
        return zzen.zzu(this.zzd, ((long) this.zzb) * 1000000, this.zzc, RoundingMode.DOWN);
    }
}
