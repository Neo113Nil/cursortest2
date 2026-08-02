package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzqz implements zzqj {
    public zzqz(zzqy zzqyVar) {
    }

    public static int zza(int i7, int i8, int i9) {
        return zzfzk.zzb(((i7 * i8) * i9) / 1000000);
    }

    public static int zzb(int i7) {
        if (i7 == 20) {
            return 63750;
        }
        if (i7 == 30) {
            return 2250000;
        }
        switch (i7) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i7) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }
}
