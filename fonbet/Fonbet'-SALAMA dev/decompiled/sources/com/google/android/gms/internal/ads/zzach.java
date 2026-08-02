package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzach {
    public static void zza(long j, zzed zzedVar, zzaeb[] zzaebVarArr) {
        int i7;
        while (true) {
            if (zzedVar.zzb() <= 1) {
                return;
            }
            int zzc = zzc(zzedVar);
            int zzc2 = zzc(zzedVar);
            int zzd = zzedVar.zzd() + zzc2;
            if (zzc2 == -1 || zzc2 > zzedVar.zzb()) {
                zzdq.zzf("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                zzd = zzedVar.zze();
            } else if (zzc == 4 && zzc2 >= 8) {
                int zzm = zzedVar.zzm();
                int zzq = zzedVar.zzq();
                if (zzq == 49) {
                    i7 = zzedVar.zzg();
                    zzq = 49;
                } else {
                    i7 = 0;
                }
                int zzm2 = zzedVar.zzm();
                if (zzq == 47) {
                    zzedVar.zzM(1);
                    zzq = 47;
                }
                boolean z4 = zzm == 181 && (zzq == 49 || zzq == 47) && zzm2 == 3;
                if (zzq == 49) {
                    z4 &= i7 == 1195456820;
                }
                if (z4) {
                    zzb(j, zzedVar, zzaebVarArr);
                }
            }
            zzedVar.zzL(zzd);
        }
    }

    public static void zzb(long j, zzed zzedVar, zzaeb[] zzaebVarArr) {
        int zzm = zzedVar.zzm();
        if ((zzm & 64) != 0) {
            int i7 = zzm & 31;
            zzedVar.zzM(1);
            int zzd = zzedVar.zzd();
            for (zzaeb zzaebVar : zzaebVarArr) {
                int i8 = i7 * 3;
                zzedVar.zzL(zzd);
                zzaebVar.zzr(zzedVar, i8);
                zzcv.zzf(j != -9223372036854775807L);
                zzaebVar.zzt(j, 1, i8, 0, null);
            }
        }
    }

    private static int zzc(zzed zzedVar) {
        int i7 = 0;
        while (zzedVar.zzb() != 0) {
            int zzm = zzedVar.zzm();
            i7 += zzm;
            if (zzm != 255) {
                return i7;
            }
        }
        return -1;
    }
}
