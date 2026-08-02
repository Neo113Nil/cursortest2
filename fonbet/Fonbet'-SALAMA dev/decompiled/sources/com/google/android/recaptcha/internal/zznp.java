package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zznp {
    static {
        zzjz zzi = zzka.zzi();
        zzi.zze(-315576000000L);
        zzi.zzd(-999999999);
        zzjz zzi2 = zzka.zzi();
        zzi2.zze(315576000000L);
        zzi2.zzd(999999999);
        zzjz zzi3 = zzka.zzi();
        zzi3.zze(0L);
        zzi3.zzd(0);
    }

    public static zzka zza(long j) {
        int i7 = (int) (j % 1000000000);
        long j3 = j / 1000000000;
        if (i7 <= -1000000000 || i7 >= 1000000000) {
            j3 = zzic.zza(j3, i7 / 1000000000);
            i7 %= 1000000000;
        }
        if (j3 > 0 && i7 < 0) {
            i7 += 1000000000;
            j3--;
        }
        if (j3 < 0 && i7 > 0) {
            i7 -= 1000000000;
            j3++;
        }
        zzjz zzi = zzka.zzi();
        zzi.zze(j3);
        zzi.zzd(i7);
        zzka zzkaVar = (zzka) zzi.zzj();
        long zzg = zzkaVar.zzg();
        int zzf = zzkaVar.zzf();
        if (zzg >= -315576000000L && zzg <= 315576000000L && zzf >= -999999999 && zzf < 1000000000 && ((zzg >= 0 && zzf >= 0) || (zzg <= 0 && zzf <= 0))) {
            return zzkaVar;
        }
        throw new IllegalArgumentException("Duration is not valid. See proto definition for valid values. Seconds (" + zzg + ") must be in range [-315,576,000,000, +315,576,000,000]. Nanos (" + zzf + ") must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds");
    }
}
