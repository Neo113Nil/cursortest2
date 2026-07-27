package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzafu {
    public static void zza(long j, zzeu zzeuVar, zzaht[] zzahtVarArr) {
        int i;
        while (true) {
            if (zzeuVar.zzd() <= 1) {
                return;
            }
            int zzc = zzc(zzeuVar);
            int zzc2 = zzc(zzeuVar);
            int zzg = zzeuVar.zzg() + zzc2;
            if (zzc2 == -1 || zzc2 > zzeuVar.zzd()) {
                zzeh.zzc("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                zzg = zzeuVar.zze();
            } else if (zzc == 4 && zzc2 >= 8) {
                int zzs = zzeuVar.zzs();
                int zzt = zzeuVar.zzt();
                if (zzt == 49) {
                    i = zzeuVar.zzB();
                    zzt = 49;
                } else {
                    i = 0;
                }
                int zzs2 = zzeuVar.zzs();
                if (zzt == 47) {
                    zzeuVar.zzk(1);
                    zzt = 47;
                }
                boolean z = zzs == 181 && (zzt == 49 || zzt == 47) && zzs2 == 3;
                if (zzt == 49) {
                    z &= i == 1195456820;
                }
                if (z) {
                    zzb(j, zzeuVar, zzahtVarArr);
                }
            }
            zzeuVar.zzh(zzg);
        }
    }

    public static void zzb(long j, zzeu zzeuVar, zzaht[] zzahtVarArr) {
        int zzs = zzeuVar.zzs();
        if ((zzs & 64) != 0) {
            int i = zzs & 31;
            zzeuVar.zzk(1);
            int zzg = zzeuVar.zzg();
            for (zzaht zzahtVar : zzahtVarArr) {
                int i2 = i * 3;
                zzeuVar.zzh(zzg);
                zzahtVar.zzc(zzeuVar, i2);
                zzguk.zzi(j != -9223372036854775807L);
                zzahtVar.zze(j, 1, i2, 0, null);
            }
        }
    }

    private static int zzc(zzeu zzeuVar) {
        int i = 0;
        while (zzeuVar.zzd() != 0) {
            int zzs = zzeuVar.zzs();
            i += zzs;
            if (zzs != 255) {
                return i;
            }
        }
        return -1;
    }
}
