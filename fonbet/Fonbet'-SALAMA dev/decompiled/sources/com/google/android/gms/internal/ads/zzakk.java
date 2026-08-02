package com.google.android.gms.internal.ads;

import android.graphics.PointF;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
final class zzakk {
    private static final Pattern zzc = Pattern.compile("\\{([^}]*)\\}");
    private static final Pattern zzd;
    private static final Pattern zze;
    private static final Pattern zzf;
    public final int zza;
    public final PointF zzb;

    static {
        int i7 = zzen.zza;
        Locale locale = Locale.US;
        zzd = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        zze = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        zzf = Pattern.compile("\\\\an(\\d+)");
    }

    private zzakk(int i7, PointF pointF) {
        this.zza = i7;
        this.zzb = pointF;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e A[Catch: RuntimeException -> 0x000a, TryCatch #1 {RuntimeException -> 0x000a, blocks: (B:19:0x0082, B:21:0x008e, B:29:0x0094, B:24:0x0099), top: B:18:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x000a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzakk zza(String str) {
        Matcher matcher;
        int i7;
        Matcher matcher2;
        Matcher matcher3;
        boolean find;
        boolean find2;
        PointF pointF;
        String str2;
        String str3;
        Matcher matcher4 = zzc.matcher(str);
        PointF pointF2 = null;
        int i8 = -1;
        while (matcher4.find()) {
            String group = matcher4.group(1);
            group.getClass();
            try {
                matcher2 = zzd.matcher(group);
                matcher3 = zze.matcher(group);
                find = matcher2.find();
                find2 = matcher3.find();
            } catch (RuntimeException unused) {
            }
            if (find) {
                if (find2) {
                    zzdq.zze("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + group + "'");
                }
                str2 = matcher2.group(1);
                str3 = matcher2.group(2);
            } else if (find2) {
                String group2 = matcher3.group(1);
                String group3 = matcher3.group(2);
                str2 = group2;
                str3 = group3;
            } else {
                pointF = null;
                if (pointF != null) {
                    pointF2 = pointF;
                }
                try {
                    matcher = zzf.matcher(group);
                    if (matcher.find()) {
                        i7 = -1;
                    } else {
                        String group4 = matcher.group(1);
                        if (group4 == null) {
                            throw null;
                        }
                        i7 = zzakl.zzd(group4);
                    }
                    if (i7 == -1) {
                        i8 = i7;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            if (str2 == null) {
                throw null;
            }
            float parseFloat = Float.parseFloat(str2.trim());
            if (str3 == null) {
                throw null;
            }
            pointF = new PointF(parseFloat, Float.parseFloat(str3.trim()));
            if (pointF != null) {
            }
            matcher = zzf.matcher(group);
            if (matcher.find()) {
            }
            if (i7 == -1) {
            }
        }
        return new zzakk(i8, pointF2);
    }

    public static String zzb(String str) {
        return zzc.matcher(str).replaceAll("");
    }
}
