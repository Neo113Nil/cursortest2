package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzij {
    private static final java.util.regex.Pattern zza = java.util.regex.Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
    private static final java.util.regex.Pattern zzb = java.util.regex.Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static long zza(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return -1L;
        }
        java.util.regex.Matcher matcher = zzb.matcher(str);
        if (!matcher.matches()) {
            return -1L;
        }
        java.lang.String group = matcher.group(1);
        group.getClass();
        return java.lang.Long.parseLong(group);
    }

    public static long zzb(java.lang.String str, java.lang.String str2) {
        long j = -1;
        if (!android.text.TextUtils.isEmpty(str)) {
            try {
                j = java.lang.Long.parseLong(str);
            } catch (java.lang.NumberFormatException unused) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 28);
                sb.append("Unexpected Content-Length [");
                sb.append(str);
                sb.append(com.ironsource.X3.j.e);
                com.google.android.gms.internal.ads.zzeg.zze("HttpUtil", sb.toString());
            }
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            return j;
        }
        java.util.regex.Matcher matcher = zza.matcher(str2);
        if (!matcher.matches()) {
            return j;
        }
        try {
            java.lang.String group = matcher.group(2);
            group.getClass();
            java.lang.String str3 = group;
            long parseLong = java.lang.Long.parseLong(group);
            java.lang.String group2 = matcher.group(1);
            group2.getClass();
            java.lang.String str4 = group2;
            long parseLong2 = (parseLong - java.lang.Long.parseLong(group2)) + 1;
            if (j < 0) {
                return parseLong2;
            }
            if (j == parseLong2) {
                return j;
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 25 + java.lang.String.valueOf(str2).length() + 1);
            sb2.append("Inconsistent headers [");
            sb2.append(str);
            sb2.append("] [");
            sb2.append(str2);
            sb2.append(com.ironsource.X3.j.e);
            com.google.android.gms.internal.ads.zzeg.zzc("HttpUtil", sb2.toString());
            return java.lang.Math.max(j, parseLong2);
        } catch (java.lang.NumberFormatException unused2) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 27);
            sb3.append("Unexpected Content-Range [");
            sb3.append(str2);
            sb3.append(com.ironsource.X3.j.e);
            com.google.android.gms.internal.ads.zzeg.zze("HttpUtil", sb3.toString());
            return j;
        }
    }
}
