package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzahw {
    public final List zza;
    public final int zzb;
    public final String zzc;
    public final int zzd;

    private zzahw(List list, int i, String str, int i2) {
        this.zza = list;
        this.zzb = i;
        this.zzc = str;
        this.zzd = i2;
    }

    public static zzahw zza(zzeu zzeuVar) throws zzat {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        try {
            if (zzeuVar.zzB() != 0) {
                throw zzat.zzb("Unsupported VVC version", null);
            }
            int zzs = zzeuVar.zzs();
            int i6 = zzs >> 1;
            int i7 = 1;
            str = "L";
            if ((zzs & 1) != 0) {
                zzeuVar.zzk(1);
                int zzs2 = zzeuVar.zzs() >> 4;
                i = zzeuVar.zzs() >> 5;
                int zzs3 = zzeuVar.zzs() & 63;
                int zzs4 = zzeuVar.zzs();
                i3 = zzs4 >> 1;
                str = (zzs4 & 1) != 0 ? "H" : "L";
                i2 = zzeuVar.zzs();
                zzeuVar.zzk(zzs3);
                int i8 = zzs2 & 7;
                if (i8 > 1) {
                    int zzs5 = zzeuVar.zzs();
                    for (int i9 = 0; i9 < i8 - 1; i9++) {
                        if (((zzs5 >> (7 - i9)) & 1) != 0) {
                            zzeuVar.zzk(1);
                        }
                    }
                }
                zzeuVar.zzk(zzeuVar.zzs() * 4);
                zzeuVar.zzk(6);
            } else {
                i = 0;
                i2 = 0;
                i3 = 0;
            }
            int zzs6 = zzeuVar.zzs();
            int zzg = zzeuVar.zzg();
            int i10 = 0;
            int i11 = 0;
            while (true) {
                i4 = 12;
                i5 = 13;
                if (i10 >= zzs6) {
                    break;
                }
                int zzs7 = zzeuVar.zzs() & 31;
                int zzt = (zzs7 == 13 || zzs7 == 12) ? 1 : zzeuVar.zzt();
                for (int i12 = 0; i12 < zzt; i12++) {
                    int zzt2 = zzeuVar.zzt();
                    i11 += zzt2 + 4;
                    zzeuVar.zzk(zzt2);
                }
                i10++;
            }
            zzeuVar.zzh(zzg);
            byte[] bArr = new byte[i11];
            int i13 = 0;
            int i14 = 0;
            while (i13 < zzs6) {
                int zzs8 = zzeuVar.zzs() & 31;
                int zzt3 = (zzs8 == i5 || zzs8 == i4) ? i7 : zzeuVar.zzt();
                for (int i15 = 0; i15 < zzt3; i15++) {
                    int zzt4 = zzeuVar.zzt();
                    System.arraycopy(zzgr.zza, 0, bArr, i14, 4);
                    int i16 = i14 + 4;
                    zzeuVar.zzm(bArr, i16, zzt4);
                    i14 = i16 + zzt4;
                }
                i13++;
                i7 = 1;
                i4 = 12;
                i5 = 13;
            }
            return new zzahw(zzgxm.zzj(bArr), (i6 & 3) + 1, String.format(Locale.US, "vvc1.%d.%s%d", Integer.valueOf(i3), str, Integer.valueOf(i2)), i + 8);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzat.zzb("Error parsing VVC configuration", e);
        }
    }
}
