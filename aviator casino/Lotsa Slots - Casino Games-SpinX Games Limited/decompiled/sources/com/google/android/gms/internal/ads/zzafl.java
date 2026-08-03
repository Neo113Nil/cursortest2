package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzafl {
    public static void zza(long j, com.google.android.gms.internal.ads.zzet zzetVar, com.google.android.gms.internal.ads.zzahk[] zzahkVarArr) {
        int i;
        while (true) {
            if (zzetVar.zzd() <= 1) {
                return;
            }
            int zzc = zzc(zzetVar);
            int zzc2 = zzc(zzetVar);
            int zzg = zzetVar.zzg() + zzc2;
            if (zzc2 == -1 || zzc2 > zzetVar.zzd()) {
                com.google.android.gms.internal.ads.zzeg.zzc("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                zzg = zzetVar.zze();
            } else if (zzc == 4 && zzc2 >= 8) {
                int zzs = zzetVar.zzs();
                int zzt = zzetVar.zzt();
                if (zzt == 49) {
                    i = zzetVar.zzB();
                    zzt = 49;
                } else {
                    i = 0;
                }
                int zzs2 = zzetVar.zzs();
                if (zzt == 47) {
                    zzetVar.zzk(1);
                    zzt = 47;
                }
                boolean z = zzs == 181 && (zzt == 49 || zzt == 47) && zzs2 == 3;
                if (zzt == 49) {
                    z &= i == 1195456820;
                }
                if (z) {
                    zzb(j, zzetVar, zzahkVarArr);
                }
            }
            zzetVar.zzh(zzg);
        }
    }

    public static void zzb(long j, com.google.android.gms.internal.ads.zzet zzetVar, com.google.android.gms.internal.ads.zzahk[] zzahkVarArr) {
        int zzs = zzetVar.zzs();
        if ((zzs & 64) != 0) {
            int i = zzs & 31;
            zzetVar.zzk(1);
            int zzg = zzetVar.zzg();
            for (com.google.android.gms.internal.ads.zzahk zzahkVar : zzahkVarArr) {
                int i2 = i * 3;
                zzetVar.zzh(zzg);
                zzahkVar.zzc(zzetVar, i2);
                com.google.android.gms.internal.ads.zzgtj.zzi(j != -9223372036854775807L);
                zzahkVar.zze(j, 1, i2, 0, null);
            }
        }
    }

    private static int zzc(com.google.android.gms.internal.ads.zzet zzetVar) {
        int i = 0;
        while (zzetVar.zzd() != 0) {
            int zzs = zzetVar.zzs();
            i += zzs;
            if (zzs != 255) {
                return i;
            }
        }
        return -1;
    }
}
