package com.google.android.recaptcha.internal;

import com.google.android.gms.internal.ads.zzbbd;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes.dex */
public final class zznr {
    private static final ThreadLocal zza;

    static {
        zzmy zzi = zzmz.zzi();
        zzi.zze(-62135596800L);
        zzi.zzd(0);
        zzmy zzi2 = zzmz.zzi();
        zzi2.zze(253402300799L);
        zzi2.zzd(999999999);
        zzmy zzi3 = zzmz.zzi();
        zzi3.zze(0L);
        zzi3.zzd(0);
        zza = new zznq();
        zzd("now");
        zzd("getEpochSecond");
        zzd("getNano");
    }

    public static zzmz zza(zzmz zzmzVar) {
        long zzg = zzmzVar.zzg();
        boolean zze = zze(zzg);
        int zzf = zzmzVar.zzf();
        if (zze && zzf >= 0 && zzf < 1000000000) {
            return zzmzVar;
        }
        throw new IllegalArgumentException("Timestamp is not valid. See proto definition for valid values. Seconds (" + zzg + ") must be in range [-62,135,596,800, +253,402,300,799]. Nanos (" + zzf + ") must be in range [0, +999,999,999].");
    }

    public static zzmz zzb(long j) {
        long j3 = j / 1000;
        if (!zze(j3)) {
            throw new IllegalArgumentException("Timestamp is not valid. Input seconds is too large. Seconds (" + j3 + ") must be in range [-62,135,596,800, +253,402,300,799]. ");
        }
        int i7 = (int) ((j % 1000) * 1000000);
        if (i7 <= -1000000000 || i7 >= 1000000000) {
            j3 = zzic.zza(j3, i7 / 1000000000);
            i7 %= 1000000000;
        }
        if (i7 < 0) {
            i7 += 1000000000;
            j3 = zzic.zzb(j3, 1L);
        }
        zzmy zzi = zzmz.zzi();
        zzi.zze(j3);
        zzi.zzd(i7);
        zzmz zzmzVar = (zzmz) zzi.zzj();
        zza(zzmzVar);
        return zzmzVar;
    }

    public static String zzc(zzmz zzmzVar) {
        zza(zzmzVar);
        long zzg = zzmzVar.zzg();
        int zzf = zzmzVar.zzf();
        StringBuilder sb = new StringBuilder();
        sb.append(((SimpleDateFormat) zza.get()).format(new Date(zzg * 1000)));
        if (zzf != 0) {
            sb.append(".");
            sb.append(zzf % 1000000 == 0 ? String.format(Locale.ENGLISH, "%1$03d", Integer.valueOf(zzf / 1000000)) : zzf % zzbbd.zzq.zzf == 0 ? String.format(Locale.ENGLISH, "%1$06d", Integer.valueOf(zzf / zzbbd.zzq.zzf)) : String.format(Locale.ENGLISH, "%1$09d", Integer.valueOf(zzf)));
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
