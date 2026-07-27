package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzagp {
    public static boolean zza(zzeu zzeuVar, zzagu zzaguVar, int i, zzago zzagoVar) {
        int zzg = zzeuVar.zzg();
        long zzz = zzeuVar.zzz();
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
            if (i2 != zzaguVar.zzg - 1) {
                return false;
            }
        } else if (i2 > 10 || zzaguVar.zzg != 2) {
            return false;
        }
        int i3 = (int) (j5 & 7);
        if ((i3 != 0 && i3 != zzaguVar.zzi) || j6 == 1 || !zzd(zzeuVar, zzaguVar, z, zzagoVar)) {
            return false;
        }
        long j7 = zzagoVar.zza;
        int zzc = zzc(zzeuVar, (int) (j2 & 15));
        long j8 = zzaguVar.zzj;
        boolean z2 = j8 == 0 || j7 + ((long) zzc) >= j8;
        if (zzc == -1) {
            return false;
        }
        if ((!z2 && zzc < zzaguVar.zza) || zzc > zzaguVar.zzb) {
            return false;
        }
        int i4 = zzaguVar.zze;
        int i5 = (int) (j3 & 15);
        if (i5 != 0) {
            if (i5 <= 11) {
                if (i5 != zzaguVar.zzf) {
                    return false;
                }
            } else if (i5 == 12) {
                if (zzeuVar.zzs() * 1000 != i4) {
                    return false;
                }
            } else {
                if (i5 > 14) {
                    return false;
                }
                int zzt = zzeuVar.zzt();
                if (i5 == 14) {
                    zzt *= 10;
                }
                if (zzt != i4) {
                    return false;
                }
            }
        }
        if (zzeuVar.zzs() != zzfm.zzN(zzeuVar.zzi(), zzg, zzeuVar.zzg() - 1, 0)) {
            return false;
        }
        if (zzeuVar.zzd() == 0) {
            return true;
        }
        int zzn = zzeuVar.zzn();
        if ((zzn & 128) != 0) {
            return false;
        }
        int i6 = (zzn & 126) >> 1;
        if ((i6 < 2 || i6 > 7) && (i6 < 13 || i6 > 31)) {
            return true;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i6).length() + 57);
        sb.append("Ignoring frame where first subframe has a reserved type: ");
        sb.append(i6);
        zzeh.zzb("FlacFrameReader", sb.toString());
        return false;
    }

    public static long zzb(zzagi zzagiVar, zzagu zzaguVar) throws IOException {
        zzagiVar.zzl();
        zzagiVar.zzk(1);
        byte[] bArr = new byte[1];
        zzagiVar.zzi(bArr, 0, 1);
        int i = bArr[0] & 1;
        boolean z = 1 == i;
        zzagiVar.zzk(2);
        int i2 = 1 != i ? 6 : 7;
        zzeu zzeuVar = new zzeu(i2);
        zzeuVar.zzf(zzagl.zzb(zzagiVar, zzeuVar.zzi(), 0, i2));
        zzagiVar.zzl();
        zzago zzagoVar = new zzago();
        if (zzd(zzeuVar, zzaguVar, z, zzagoVar)) {
            return zzagoVar.zza;
        }
        throw zzat.zzb(null, null);
    }

    public static int zzc(zzeu zzeuVar, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return zzeuVar.zzs() + 1;
            case 7:
                return zzeuVar.zzt() + 1;
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

    private static boolean zzd(zzeu zzeuVar, zzagu zzaguVar, boolean z, zzago zzagoVar) {
        try {
            long zzO = zzeuVar.zzO();
            if (!z) {
                zzO *= zzaguVar.zzb;
            }
            long j = zzaguVar.zzj;
            if (j != 0 && zzO > j) {
                return false;
            }
            zzagoVar.zza = zzO;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
