package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzach {
    public static void zza(long j, zzed zzedVar, zzaeb[] zzaebVarArr) {
        int iZzg;
        while (true) {
            if (zzedVar.zzb() <= 1) {
                return;
            }
            int iZzc = zzc(zzedVar);
            int iZzc2 = zzc(zzedVar);
            int iZzd = zzedVar.zzd() + iZzc2;
            if (iZzc2 == -1 || iZzc2 > zzedVar.zzb()) {
                zzdq.zzf("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iZzd = zzedVar.zze();
            } else if (iZzc == 4 && iZzc2 >= 8) {
                int iZzm = zzedVar.zzm();
                int iZzq = zzedVar.zzq();
                if (iZzq == 49) {
                    iZzg = zzedVar.zzg();
                    iZzq = 49;
                } else {
                    iZzg = 0;
                }
                int iZzm2 = zzedVar.zzm();
                if (iZzq == 47) {
                    zzedVar.zzM(1);
                    iZzq = 47;
                }
                boolean z4 = iZzm == 181 && (iZzq == 49 || iZzq == 47) && iZzm2 == 3;
                if (iZzq == 49) {
                    z4 &= iZzg == 1195456820;
                }
                if (z4) {
                    zzb(j, zzedVar, zzaebVarArr);
                }
            }
            zzedVar.zzL(iZzd);
        }
    }

    public static void zzb(long j, zzed zzedVar, zzaeb[] zzaebVarArr) {
        int iZzm = zzedVar.zzm();
        if ((iZzm & 64) != 0) {
            int i7 = iZzm & 31;
            zzedVar.zzM(1);
            int iZzd = zzedVar.zzd();
            for (zzaeb zzaebVar : zzaebVarArr) {
                int i8 = i7 * 3;
                zzedVar.zzL(iZzd);
                zzaebVar.zzr(zzedVar, i8);
                zzcv.zzf(j != -9223372036854775807L);
                zzaebVar.zzt(j, 1, i8, 0, null);
            }
        }
    }

    private static int zzc(zzed zzedVar) {
        int i7 = 0;
        while (zzedVar.zzb() != 0) {
            int iZzm = zzedVar.zzm();
            i7 += iZzm;
            if (iZzm != 255) {
                return i7;
            }
        }
        return -1;
    }
}
