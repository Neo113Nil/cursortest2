package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: classes.dex */
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
        int zzi = zzedVar.zzi();
        zzedVar.zzM(12);
        int zzi2 = zzedVar.zzi();
        int zzi3 = zzedVar.zzi();
        int zzi4 = zzedVar.zzi();
        zzedVar.zzM(4);
        int zzi5 = zzedVar.zzi();
        int zzi6 = zzedVar.zzi();
        zzedVar.zzM(4);
        return new zzaep(zzi, zzi2, zzi3, zzi4, zzi5, zzi6, zzedVar.zzi());
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
        return zzen.zzu(this.zzd, this.zzb * 1000000, this.zzc, RoundingMode.DOWN);
    }
}
