package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzaub {
    public static com.google.android.gms.internal.ads.zzasn zza(com.google.android.gms.internal.ads.zzata zzataVar) {
        boolean z;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Map map = zzataVar.zzc;
        if (map == null) {
            return null;
        }
        java.lang.String str = (java.lang.String) map.get(com.google.common.net.HttpHeaders.DATE);
        long zzb = str != null ? zzb(str) : 0L;
        java.lang.String str2 = (java.lang.String) map.get(com.google.common.net.HttpHeaders.CACHE_CONTROL);
        int i = 0;
        if (str2 != null) {
            java.lang.String[] split = str2.split(",", 0);
            z = false;
            j = 0;
            j2 = 0;
            while (i < split.length) {
                java.lang.String trim = split[i].trim();
                if (trim.equals(io.ktor.client.utils.CacheControl.NO_CACHE) || trim.equals(io.ktor.client.utils.CacheControl.NO_STORE)) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j2 = java.lang.Long.parseLong(trim.substring(8));
                    } catch (java.lang.Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j = java.lang.Long.parseLong(trim.substring(23));
                } else if (trim.equals(io.ktor.client.utils.CacheControl.MUST_REVALIDATE) || trim.equals(io.ktor.client.utils.CacheControl.PROXY_REVALIDATE)) {
                    z = true;
                }
                i++;
            }
            i = 1;
        } else {
            z = false;
            j = 0;
            j2 = 0;
        }
        java.lang.String str3 = (java.lang.String) map.get(com.google.common.net.HttpHeaders.EXPIRES);
        long zzb2 = str3 != null ? zzb(str3) : 0L;
        java.lang.String str4 = (java.lang.String) map.get(com.google.common.net.HttpHeaders.LAST_MODIFIED);
        long zzb3 = str4 != null ? zzb(str4) : 0L;
        java.lang.String str5 = (java.lang.String) map.get(com.google.common.net.HttpHeaders.ETAG);
        if (i != 0) {
            j4 = currentTimeMillis + (j2 * 1000);
            if (z) {
                j5 = j4;
            } else {
                java.lang.Long.signum(j);
                j5 = (j * 1000) + j4;
            }
            j3 = j5;
        } else {
            j3 = 0;
            if (zzb <= 0 || zzb2 < zzb) {
                j4 = 0;
            } else {
                j4 = currentTimeMillis + (zzb2 - zzb);
                j3 = j4;
            }
        }
        com.google.android.gms.internal.ads.zzasn zzasnVar = new com.google.android.gms.internal.ads.zzasn();
        zzasnVar.zza = zzataVar.zzb;
        zzasnVar.zzb = str5;
        zzasnVar.zzf = j4;
        zzasnVar.zze = j3;
        zzasnVar.zzc = zzb;
        zzasnVar.zzd = zzb3;
        zzasnVar.zzg = map;
        zzasnVar.zzh = zzataVar.zzd;
        return zzasnVar;
    }

    public static long zzb(java.lang.String str) {
        try {
            return zzd("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (java.text.ParseException e) {
            if ("0".equals(str) || com.ironsource.C2945a2.f.equals(str)) {
                com.google.android.gms.internal.ads.zzatq.zza("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            com.google.android.gms.internal.ads.zzatq.zzd(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    static java.lang.String zzc(long j) {
        return zzd("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new java.util.Date(j));
    }

    private static java.text.SimpleDateFormat zzd(java.lang.String str) {
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(str, java.util.Locale.US);
        simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
