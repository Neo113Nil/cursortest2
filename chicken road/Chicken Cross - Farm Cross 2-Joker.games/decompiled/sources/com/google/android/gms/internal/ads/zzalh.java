package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzalh {
    public final zzahe zza;
    public final long zzb;
    public final long zzc;
    public final zzald zzd;
    public final int zze;
    public final int zzf;
    public final long[] zzg;

    private zzalh(zzahe zzaheVar, long j, long j2, long[] jArr, zzald zzaldVar, int i, int i2) {
        this.zza = new zzahe(zzaheVar);
        this.zzb = j;
        this.zzc = j2;
        this.zzg = jArr;
        this.zzd = zzaldVar;
        this.zze = i;
        this.zzf = i2;
    }

    public static zzalh zza(zzahe zzaheVar, zzeu zzeuVar) {
        long[] jArr;
        int i;
        int i2;
        zzald zzaldVar;
        int zzB = zzeuVar.zzB();
        int zzH = (zzB & 1) != 0 ? zzeuVar.zzH() : -1;
        long zzz = (zzB & 2) != 0 ? zzeuVar.zzz() : -1L;
        if ((zzB & 4) == 4) {
            long[] jArr2 = new long[100];
            for (int i3 = 0; i3 < 100; i3++) {
                jArr2[i3] = zzeuVar.zzs();
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        if ((zzB & 8) != 0) {
            zzeuVar.zzk(4);
        }
        if (zzeuVar.zzd() >= 24) {
            zzeuVar.zzk(11);
            zzald zzb = zzald.zzb(Float.intBitsToFloat(zzeuVar.zzB()), zzeuVar.zzt(), zzeuVar.zzt());
            zzeuVar.zzk(2);
            int zzx = zzeuVar.zzx();
            i2 = zzx & 4095;
            zzaldVar = zzb;
            i = zzx >> 12;
        } else {
            i = -1;
            i2 = -1;
            zzaldVar = null;
        }
        return new zzalh(zzaheVar, zzH, zzz, jArr, zzaldVar, i, i2);
    }

    public final long zzb() {
        long j = this.zzb;
        if (j == -1 || j == 0) {
            return -9223372036854775807L;
        }
        return zzfm.zzu((j * r4.zzg) - 1, this.zza.zzd);
    }
}
