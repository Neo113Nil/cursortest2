package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zztt implements com.google.android.gms.internal.ads.zztj {
    protected zztt(com.google.android.gms.internal.ads.zzts zztsVar) {
    }

    protected static int zza(int i, int i2, int i3) {
        return com.google.android.gms.internal.ads.zzhah.zza(((i * i2) * i3) / 1000000);
    }

    private static int zzc(int i) {
        int zzf = com.google.android.gms.internal.ads.zzagc.zzf(i);
        com.google.android.gms.internal.ads.zzgtj.zzi(zzf != -2147483647);
        return zzf;
    }

    protected static final int zzb(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = 250000;
        if (i3 == 0) {
            int zza = zza(250000, i5, i4);
            int zza2 = zza(750000, i5, i4);
            java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
            return java.lang.Math.max(zza, java.lang.Math.min(i * 4, zza2));
        }
        if (i3 == 1) {
            return com.google.android.gms.internal.ads.zzhah.zza((zzc(i2) * 50000000) / 1000000);
        }
        if (i2 == 5) {
            i7 = 500000;
        } else if (i2 == 8) {
            i7 = 1000000;
            i2 = 8;
        }
        return com.google.android.gms.internal.ads.zzhah.zza((i7 * (i6 != -1 ? com.google.android.gms.internal.ads.zzgzz.zzb(i6, 8, java.math.RoundingMode.CEILING) : zzc(i2))) / 1000000);
    }
}
