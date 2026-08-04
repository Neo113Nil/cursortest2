package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes.dex */
public final class zznp {
    static {
        zzjz zzjzVarZzi = zzka.zzi();
        zzjzVarZzi.zze(-315576000000L);
        zzjzVarZzi.zzd(-999999999);
        zzjz zzjzVarZzi2 = zzka.zzi();
        zzjzVarZzi2.zze(315576000000L);
        zzjzVarZzi2.zzd(999999999);
        zzjz zzjzVarZzi3 = zzka.zzi();
        zzjzVarZzi3.zze(0L);
        zzjzVarZzi3.zzd(0);
    }

    public static zzka zza(long j) {
        int i7 = (int) (j % 1000000000);
        long jZza = j / 1000000000;
        if (i7 <= -1000000000 || i7 >= 1000000000) {
            jZza = zzic.zza(jZza, i7 / 1000000000);
            i7 %= 1000000000;
        }
        if (jZza > 0 && i7 < 0) {
            i7 += 1000000000;
            jZza--;
        }
        if (jZza < 0 && i7 > 0) {
            i7 -= 1000000000;
            jZza++;
        }
        zzjz zzjzVarZzi = zzka.zzi();
        zzjzVarZzi.zze(jZza);
        zzjzVarZzi.zzd(i7);
        zzka zzkaVar = (zzka) zzjzVarZzi.zzj();
        long jZzg = zzkaVar.zzg();
        int iZzf = zzkaVar.zzf();
        if (jZzg >= -315576000000L && jZzg <= 315576000000L && iZzf >= -999999999 && iZzf < 1000000000 && ((jZzg >= 0 && iZzf >= 0) || (jZzg <= 0 && iZzf <= 0))) {
            return zzkaVar;
        }
        throw new IllegalArgumentException("Duration is not valid. See proto definition for valid values. Seconds (" + jZzg + ") must be in range [-315,576,000,000, +315,576,000,000]. Nanos (" + iZzf + ") must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds");
    }
}
