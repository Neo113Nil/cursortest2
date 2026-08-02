package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import android.graphics.Color;
import android.text.TextUtils;
import java.util.Locale;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
final class zzakl {
    public final String zza;
    public final int zzb;
    public final Integer zzc;
    public final Integer zzd;
    public final float zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final int zzj;

    private zzakl(String str, int i7, Integer num, Integer num2, float f7, boolean z4, boolean z7, boolean z8, boolean z9, int i8) {
        this.zza = str;
        this.zzb = i7;
        this.zzc = num;
        this.zzd = num2;
        this.zze = f7;
        this.zzf = z4;
        this.zzg = z7;
        this.zzh = z8;
        this.zzi = z9;
        this.zzj = i8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0110, code lost:
    
        if (r4 != 3) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ff A[Catch: RuntimeException -> 0x005b, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x005b, blocks: (B:7:0x0040, B:9:0x004f, B:10:0x005f, B:12:0x0063, B:13:0x0070, B:15:0x0074, B:16:0x0081, B:18:0x0085, B:20:0x008b, B:22:0x00a8, B:24:0x00ad, B:27:0x00bc, B:29:0x00c0, B:32:0x00d1, B:34:0x00d5, B:37:0x00e6, B:39:0x00ea, B:42:0x00fb, B:44:0x00ff, B:46:0x0105, B:51:0x0120, B:50:0x0112, B:64:0x0093), top: B:6:0x0040, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzakl zzb(String str, zzakj zzakjVar) {
        float f7;
        int i7;
        int i8;
        String trim;
        zzcv.zzd(str.startsWith("Style:"));
        String[] split = TextUtils.split(str.substring(6), ",");
        int length = split.length;
        int i9 = zzakjVar.zzk;
        if (length != i9) {
            int i10 = zzen.zza;
            Locale locale = Locale.US;
            StringBuilder g3 = AbstractC1663a.g("Skipping malformed 'Style:' line (expected ", i9, " values, found ", length, "): '");
            g3.append(str);
            g3.append("'");
            zzdq.zzf("SsaStyle", g3.toString());
            return null;
        }
        try {
            String trim2 = split[zzakjVar.zza].trim();
            int i11 = zzakjVar.zzb;
            int zzd = i11 != -1 ? zzd(split[i11].trim()) : -1;
            int i12 = zzakjVar.zzc;
            Integer zzc = i12 != -1 ? zzc(split[i12].trim()) : null;
            int i13 = zzakjVar.zzd;
            Integer zzc2 = i13 != -1 ? zzc(split[i13].trim()) : null;
            int i14 = zzakjVar.zze;
            if (i14 != -1) {
                String trim3 = split[i14].trim();
                try {
                    f7 = Float.parseFloat(trim3);
                } catch (NumberFormatException e7) {
                    zzdq.zzg("SsaStyle", "Failed to parse font size: '" + trim3 + "'", e7);
                }
                int i15 = zzakjVar.zzf;
                boolean z4 = i15 == -1 && zze(split[i15].trim());
                int i16 = zzakjVar.zzg;
                boolean z7 = i16 == -1 && zze(split[i16].trim());
                int i17 = zzakjVar.zzh;
                boolean z8 = i17 == -1 && zze(split[i17].trim());
                int i18 = zzakjVar.zzi;
                boolean z9 = i18 == -1 && zze(split[i18].trim());
                i7 = zzakjVar.zzj;
                if (i7 != -1) {
                    trim = split[i7].trim();
                    try {
                        i8 = Integer.parseInt(trim.trim());
                        if (i8 != 1) {
                        }
                    } catch (NumberFormatException unused) {
                    }
                    return new zzakl(trim2, zzd, zzc, zzc2, f7, z4, z7, z8, z9, i8);
                }
                i8 = -1;
                return new zzakl(trim2, zzd, zzc, zzc2, f7, z4, z7, z8, z9, i8);
            }
            f7 = -3.4028235E38f;
            int i152 = zzakjVar.zzf;
            if (i152 == -1) {
            }
            int i162 = zzakjVar.zzg;
            if (i162 == -1) {
            }
            int i172 = zzakjVar.zzh;
            if (i172 == -1) {
            }
            int i182 = zzakjVar.zzi;
            if (i182 == -1) {
            }
            i7 = zzakjVar.zzj;
            if (i7 != -1) {
            }
            i8 = -1;
            return new zzakl(trim2, zzd, zzc, zzc2, f7, z4, z7, z8, z9, i8);
        } catch (RuntimeException e8) {
            zzdq.zzg("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e8);
            return null;
        }
        zzdq.zzf("SsaStyle", "Ignoring unknown BorderStyle: ".concat(String.valueOf(trim)));
        i8 = -1;
        return new zzakl(trim2, zzd, zzc, zzc2, f7, z4, z7, z8, z9, i8);
    }

    public static Integer zzc(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            zzcv.zzd(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(zzfzk.zzb(((parseLong >> 24) & 255) ^ 255), zzfzk.zzb(parseLong & 255), zzfzk.zzb((parseLong >> 8) & 255), zzfzk.zzb((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e7) {
            zzdq.zzg("SsaStyle", "Failed to parse color expression: '" + str + "'", e7);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzd(String str) {
        int parseInt;
        try {
            parseInt = Integer.parseInt(str.trim());
        } catch (NumberFormatException unused) {
        }
        switch (parseInt) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return parseInt;
            default:
                AbstractC0486a1.o(str, "Ignoring unknown alignment: ", "SsaStyle");
                return -1;
        }
    }

    private static boolean zze(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e7) {
            zzdq.zzg("SsaStyle", "Failed to parse boolean value: '" + str + "'", e7);
            return false;
        }
    }
}
