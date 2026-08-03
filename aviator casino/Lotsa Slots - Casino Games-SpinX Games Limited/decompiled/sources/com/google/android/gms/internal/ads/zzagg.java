package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzagg {
    public static boolean zza(com.google.android.gms.internal.ads.zzet zzetVar, com.google.android.gms.internal.ads.zzagl zzaglVar, int i, com.google.android.gms.internal.ads.zzagf zzagfVar) {
        int zzg = zzetVar.zzg();
        long zzz = zzetVar.zzz();
        long j = zzz >>> 16;
        if (j != i) {
            return false;
        }
        boolean z = (j & 1) == 1;
        long j2 = zzz >> 12;
        long j3 = zzz >> 8;
        long j4 = zzz >> 4;
        long j5 = zzz >> 1;
        long j6 = zzz & 1;
        int i2 = (int) (j4 & 15);
        if (i2 <= 7) {
            if (i2 != zzaglVar.zzg - 1) {
                return false;
            }
        } else if (i2 > 10 || zzaglVar.zzg != 2) {
            return false;
        }
        int i3 = (int) (j5 & 7);
        if ((i3 != 0 && i3 != zzaglVar.zzi) || j6 == 1 || !zzd(zzetVar, zzaglVar, z, zzagfVar)) {
            return false;
        }
        long j7 = zzagfVar.zza;
        int zzc = zzc(zzetVar, (int) (j2 & 15));
        long j8 = zzaglVar.zzj;
        boolean z2 = j8 == 0 || j7 + ((long) zzc) >= j8;
        if (zzc == -1) {
            return false;
        }
        if ((!z2 && zzc < zzaglVar.zza) || zzc > zzaglVar.zzb) {
            return false;
        }
        int i4 = zzaglVar.zze;
        int i5 = (int) (j3 & 15);
        if (i5 != 0) {
            if (i5 <= 11) {
                if (i5 != zzaglVar.zzf) {
                    return false;
                }
            } else if (i5 == 12) {
                if (zzetVar.zzs() * 1000 != i4) {
                    return false;
                }
            } else {
                if (i5 > 14) {
                    return false;
                }
                int zzt = zzetVar.zzt();
                if (i5 == 14) {
                    zzt *= 10;
                }
                if (zzt != i4) {
                    return false;
                }
            }
        }
        if (zzetVar.zzs() != com.google.android.gms.internal.ads.zzfl.zzL(zzetVar.zzi(), zzg, zzetVar.zzg() - 1, 0)) {
            return false;
        }
        if (zzetVar.zzd() == 0) {
            return true;
        }
        int zzn = zzetVar.zzn();
        if ((zzn & 128) != 0) {
            return false;
        }
        int i6 = (zzn & 126) >> 1;
        if ((i6 < 2 || i6 > 7) && (i6 < 13 || i6 > 31)) {
            return true;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i6).length() + 57);
        sb.append("Ignoring frame where first subframe has a reserved type: ");
        sb.append(i6);
        com.google.android.gms.internal.ads.zzeg.zzb("FlacFrameReader", sb.toString());
        return false;
    }

    public static long zzb(com.google.android.gms.internal.ads.zzafz zzafzVar, com.google.android.gms.internal.ads.zzagl zzaglVar) throws java.io.IOException {
        zzafzVar.zzl();
        zzafzVar.zzk(1);
        byte[] bArr = new byte[1];
        zzafzVar.zzi(bArr, 0, 1);
        int i = bArr[0] & 1;
        boolean z = 1 == i;
        zzafzVar.zzk(2);
        int i2 = 1 != i ? 6 : 7;
        com.google.android.gms.internal.ads.zzet zzetVar = new com.google.android.gms.internal.ads.zzet(i2);
        zzetVar.zzf(com.google.android.gms.internal.ads.zzagc.zzb(zzafzVar, zzetVar.zzi(), 0, i2));
        zzafzVar.zzl();
        com.google.android.gms.internal.ads.zzagf zzagfVar = new com.google.android.gms.internal.ads.zzagf();
        if (zzd(zzetVar, zzaglVar, z, zzagfVar)) {
            return zzagfVar.zza;
        }
        throw com.google.android.gms.internal.ads.zzat.zzb(null, null);
    }

    public static int zzc(com.google.android.gms.internal.ads.zzet zzetVar, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return zzetVar.zzs() + 1;
            case 7:
                return zzetVar.zzt() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    private static boolean zzd(com.google.android.gms.internal.ads.zzet zzetVar, com.google.android.gms.internal.ads.zzagl zzaglVar, boolean z, com.google.android.gms.internal.ads.zzagf zzagfVar) {
        try {
            long zzO = zzetVar.zzO();
            if (!z) {
                zzO *= zzaglVar.zzb;
            }
            long j = zzaglVar.zzj;
            if (j != 0 && zzO > j) {
                return false;
            }
            zzagfVar.zza = zzO;
            return true;
        } catch (java.lang.NumberFormatException unused) {
            return false;
        }
    }
}
