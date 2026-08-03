package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzaod {
    private static final java.util.regex.Pattern zzc = java.util.regex.Pattern.compile("\\{([^}]*)\\}");
    private static final java.util.regex.Pattern zzd;
    private static final java.util.regex.Pattern zze;
    private static final java.util.regex.Pattern zzf;
    public final int zza;
    public final android.graphics.PointF zzb;

    static {
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        zzd = java.util.regex.Pattern.compile(java.lang.String.format(java.util.Locale.US, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        zze = java.util.regex.Pattern.compile(java.lang.String.format(java.util.Locale.US, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        zzf = java.util.regex.Pattern.compile("\\\\an(\\d+)");
    }

    private zzaod(int i, android.graphics.PointF pointF) {
        this.zza = i;
        this.zzb = pointF;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:4|5|6|(2:(1:9)|10)(1:(1:36)(8:37|(1:17)|18|19|21|(3:23|24|25)(1:32)|(3:27|28|29)(1:31)|30))|11|12|13|14|15|(0)|18|19|21|(0)(0)|(0)(0)|30|2) */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009a A[Catch: RuntimeException -> 0x00af, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x00af, blocks: (B:19:0x008e, B:23:0x009a, B:25:0x00a1), top: B:18:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x000a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.google.android.gms.internal.ads.zzaod zza(java.lang.String str) {
        java.util.regex.Matcher matcher;
        int i;
        java.util.regex.Matcher matcher2;
        java.util.regex.Matcher matcher3;
        boolean find;
        boolean find2;
        android.graphics.PointF pointF;
        java.lang.String group;
        java.lang.String group2;
        java.util.regex.Matcher matcher4 = zzc.matcher(str);
        android.graphics.PointF pointF2 = null;
        int i2 = -1;
        while (matcher4.find()) {
            java.lang.String group3 = matcher4.group(1);
            group3.getClass();
            try {
                matcher2 = zzd.matcher(group3);
                matcher3 = zze.matcher(group3);
                find = matcher2.find();
                find2 = matcher3.find();
            } catch (java.lang.RuntimeException unused) {
            }
            if (find) {
                if (find2) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(group3.length() + 82);
                    sb.append("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='");
                    sb.append(group3);
                    sb.append("'");
                    com.google.android.gms.internal.ads.zzeg.zzb("SsaStyle.Overrides", sb.toString());
                }
                group = matcher2.group(1);
                group2 = matcher2.group(2);
            } else if (find2) {
                group = matcher3.group(1);
                group2 = matcher3.group(2);
            } else {
                pointF = null;
                if (pointF != null) {
                    pointF2 = pointF;
                }
                matcher = zzf.matcher(group3);
                if (matcher.find()) {
                    i = -1;
                } else {
                    java.lang.String group4 = matcher.group(1);
                    group4.getClass();
                    java.lang.String str2 = group4;
                    i = com.google.android.gms.internal.ads.zzaoe.zzd(group4);
                }
                if (i == -1) {
                    i2 = i;
                }
            }
            group.getClass();
            java.lang.String str3 = group;
            float parseFloat = java.lang.Float.parseFloat(group.trim());
            group2.getClass();
            java.lang.String str4 = group2;
            pointF = new android.graphics.PointF(parseFloat, java.lang.Float.parseFloat(group2.trim()));
            if (pointF != null) {
            }
            matcher = zzf.matcher(group3);
            if (matcher.find()) {
            }
            if (i == -1) {
            }
        }
        return new com.google.android.gms.internal.ads.zzaod(i2, pointF2);
    }

    public static java.lang.String zzb(java.lang.String str) {
        return zzc.matcher(str).replaceAll("");
    }
}
