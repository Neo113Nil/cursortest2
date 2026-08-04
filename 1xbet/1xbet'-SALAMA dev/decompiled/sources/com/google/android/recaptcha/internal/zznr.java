package com.google.android.recaptcha.internal;

import com.google.android.gms.internal.ads.zzbbd;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class zznr {
    private static final ThreadLocal zza;

    static {
        zzmy zzmyVarZzi = zzmz.zzi();
        zzmyVarZzi.zze(-62135596800L);
        zzmyVarZzi.zzd(0);
        zzmy zzmyVarZzi2 = zzmz.zzi();
        zzmyVarZzi2.zze(253402300799L);
        zzmyVarZzi2.zzd(999999999);
        zzmy zzmyVarZzi3 = zzmz.zzi();
        zzmyVarZzi3.zze(0L);
        zzmyVarZzi3.zzd(0);
        zza = new zznq();
        zzd("now");
        zzd("getEpochSecond");
        zzd("getNano");
    }

    public static zzmz zza(zzmz zzmzVar) {
        long jZzg = zzmzVar.zzg();
        boolean zZze = zze(jZzg);
        int iZzf = zzmzVar.zzf();
        if (zZze && iZzf >= 0 && iZzf < 1000000000) {
            return zzmzVar;
        }
        throw new IllegalArgumentException("Timestamp is not valid. See proto definition for valid values. Seconds (" + jZzg + ") must be in range [-62,135,596,800, +253,402,300,799]. Nanos (" + iZzf + ") must be in range [0, +999,999,999].");
    }

    public static zzmz zzb(long j) {
        long jZza = j / 1000;
        if (!zze(jZza)) {
            throw new IllegalArgumentException("Timestamp is not valid. Input seconds is too large. Seconds (" + jZza + ") must be in range [-62,135,596,800, +253,402,300,799]. ");
        }
        int i7 = (int) ((j % 1000) * 1000000);
        if (i7 <= -1000000000 || i7 >= 1000000000) {
            jZza = zzic.zza(jZza, i7 / 1000000000);
            i7 %= 1000000000;
        }
        if (i7 < 0) {
            i7 += 1000000000;
            jZza = zzic.zzb(jZza, 1L);
        }
        zzmy zzmyVarZzi = zzmz.zzi();
        zzmyVarZzi.zze(jZza);
        zzmyVarZzi.zzd(i7);
        zzmz zzmzVar = (zzmz) zzmyVarZzi.zzj();
        zza(zzmzVar);
        return zzmzVar;
    }

    public static String zzc(zzmz zzmzVar) {
        String str;
        zza(zzmzVar);
        long jZzg = zzmzVar.zzg();
        int iZzf = zzmzVar.zzf();
        StringBuilder sb = new StringBuilder();
        sb.append(((SimpleDateFormat) zza.get()).format(new Date(jZzg * 1000)));
        if (iZzf != 0) {
            sb.append(".");
            if (iZzf % 1000000 == 0) {
                str = String.format(Locale.ENGLISH, "%1$03d", Integer.valueOf(iZzf / 1000000));
            } else {
                str = iZzf % zzbbd.zzq.zzf == 0 ? String.format(Locale.ENGLISH, "%1$06d", Integer.valueOf(iZzf / zzbbd.zzq.zzf)) : String.format(Locale.ENGLISH, "%1$09d", Integer.valueOf(iZzf));
            }
            sb.append(str);
        }
        sb.append("Z");
        return sb.toString();
    }

    private static Method zzd(String str) {
        try {
            return Class.forName("java.time.Instant").getMethod(str, null);
        } catch (Exception unused) {
            return null;
        }
    }

    private static boolean zze(long j) {
        return j >= -62135596800L && j <= 253402300799L;
    }
}
