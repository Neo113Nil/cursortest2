package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzahn {
    public final java.util.List zza;
    public final int zzb;
    public final java.lang.String zzc;
    public final int zzd;

    private zzahn(java.util.List list, int i, java.lang.String str, int i2) {
        this.zza = list;
        this.zzb = i;
        this.zzc = str;
        this.zzd = i2;
    }

    public static com.google.android.gms.internal.ads.zzahn zza(com.google.android.gms.internal.ads.zzet zzetVar) throws com.google.android.gms.internal.ads.zzat {
        java.lang.String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        try {
            if (zzetVar.zzB() != 0) {
                throw com.google.android.gms.internal.ads.zzat.zzb("Unsupported VVC version", null);
            }
            int zzs = zzetVar.zzs();
            int i6 = zzs >> 1;
            str = "L";
            if ((zzs & 1) != 0) {
                zzetVar.zzk(1);
                int zzs2 = zzetVar.zzs() >> 4;
                i = zzetVar.zzs() >> 5;
                int zzs3 = zzetVar.zzs() & 63;
                int zzs4 = zzetVar.zzs();
                i3 = zzs4 >> 1;
                str = (zzs4 & 1) != 0 ? "H" : "L";
                i2 = zzetVar.zzs();
                zzetVar.zzk(zzs3);
                int i7 = zzs2 & 7;
                if (i7 > 1) {
                    int zzs5 = zzetVar.zzs();
                    for (int i8 = 0; i8 < i7 - 1; i8++) {
                        if (((zzs5 >> (7 - i8)) & 1) != 0) {
                            zzetVar.zzk(1);
                        }
                    }
                }
                zzetVar.zzk(zzetVar.zzs() * 4);
                zzetVar.zzk(6);
            } else {
                i = 0;
                i2 = 0;
                i3 = 0;
            }
            int zzs6 = zzetVar.zzs();
            int zzg = zzetVar.zzg();
            int i9 = 0;
            int i10 = 0;
            while (true) {
                i4 = 12;
                i5 = 13;
                if (i9 >= zzs6) {
                    break;
                }
                int zzs7 = zzetVar.zzs() & 31;
                int zzt = (zzs7 == 13 || zzs7 == 12) ? 1 : zzetVar.zzt();
                for (int i11 = 0; i11 < zzt; i11++) {
                    int zzt2 = zzetVar.zzt();
                    i10 += zzt2 + 4;
                    zzetVar.zzk(zzt2);
                }
                i9++;
            }
            zzetVar.zzh(zzg);
            byte[] bArr = new byte[i10];
            int i12 = 0;
            int i13 = 0;
            while (i12 < zzs6) {
                int zzs8 = zzetVar.zzs() & 31;
                int zzt3 = (zzs8 == i5 || zzs8 == i4) ? 1 : zzetVar.zzt();
                for (int i14 = 0; i14 < zzt3; i14++) {
                    int zzt4 = zzetVar.zzt();
                    java.lang.System.arraycopy(com.google.android.gms.internal.ads.zzgp.zza, 0, bArr, i13, 4);
                    int i15 = i13 + 4;
                    zzetVar.zzm(bArr, i15, zzt4);
                    i13 = i15 + zzt4;
                }
                i12++;
                i4 = 12;
                i5 = 13;
            }
            return new com.google.android.gms.internal.ads.zzahn(com.google.android.gms.internal.ads.zzgwm.zzj(bArr), (i6 & 3) + 1, java.lang.String.format(java.util.Locale.US, "vvc1.%d.%s%d", java.lang.Integer.valueOf(i3), str, java.lang.Integer.valueOf(i2)), i + 8);
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            throw com.google.android.gms.internal.ads.zzat.zzb("Error parsing VVC configuration", e);
        }
    }
}
