package com.google.android.gms.internal.ads;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public final class zzapy {
    public static long zza(String str) {
        try {
            return zzd("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e7) {
            if ("0".equals(str) || "-1".equals(str)) {
                zzapn.zzd("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            zzapn.zzc(e7, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    public static zzaok zzb(zzaox zzaoxVar) {
        boolean z4;
        long j;
        long j3;
        long j7;
        long j8;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map map = zzaoxVar.zzc;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long jZza = str != null ? zza(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i7 = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            z4 = false;
            j = 0;
            j3 = 0;
            while (i7 < strArrSplit.length) {
                String strTrim = strArrSplit[i7].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j3 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z4 = true;
                }
                i7++;
            }
            i7 = 1;
        } else {
            z4 = false;
            j = 0;
            j3 = 0;
        }
        String str3 = (String) map.get("Expires");
        long jZza2 = str3 != null ? zza(str3) : 0L;
        String str4 = (String) map.get("Last-Modified");
        long jZza3 = str4 != null ? zza(str4) : 0L;
        String str5 = (String) map.get("ETag");
        if (i7 != 0) {
            j8 = jCurrentTimeMillis + (j3 * 1000);
            j7 = z4 ? j8 : (j * 1000) + j8;
        } else {
            j7 = 0;
            if (jZza <= 0 || jZza2 < jZza) {
                j8 = 0;
            } else {
                j8 = jCurrentTimeMillis + (jZza2 - jZza);
                j7 = j8;
            }
        }
        zzaok zzaokVar = new zzaok();
        zzaokVar.zza = zzaoxVar.zzb;
        zzaokVar.zzb = str5;
        zzaokVar.zzf = j8;
        zzaokVar.zze = j7;
        zzaokVar.zzc = jZza;
        zzaokVar.zzd = jZza3;
        zzaokVar.zzg = map;
        zzaokVar.zzh = zzaoxVar.zzd;
        return zzaokVar;
    }

    public static String zzc(long j) {
        return zzd("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j));
    }

    private static SimpleDateFormat zzd(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
