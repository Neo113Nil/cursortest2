package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import android.graphics.Color;
import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
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

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0110, code lost:
    
        if (r4 != 3) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzakl zzb(String str, zzakj zzakjVar) {
        float f7;
        int i7;
        String strTrim;
        zzcv.zzd(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), ",");
        int length = strArrSplit.length;
        int i8 = zzakjVar.zzk;
        if (length != i8) {
            int i9 = zzen.zza;
            Locale locale = Locale.US;
            StringBuilder sbG = p150v0.a.g("Skipping malformed 'Style:' line (expected ", i8, " values, found ", length, "): '");
            sbG.append(str);
            sbG.append("'");
            zzdq.zzf("SsaStyle", sbG.toString());
            return null;
        }
        try {
            String strTrim2 = strArrSplit[zzakjVar.zza].trim();
            int i10 = zzakjVar.zzb;
            int iZzd = i10 != -1 ? zzd(strArrSplit[i10].trim()) : -1;
            int i11 = zzakjVar.zzc;
            Integer numZzc = i11 != -1 ? zzc(strArrSplit[i11].trim()) : null;
            int i12 = zzakjVar.zzd;
            Integer numZzc2 = i12 != -1 ? zzc(strArrSplit[i12].trim()) : null;
            int i13 = zzakjVar.zze;
            if (i13 != -1) {
                String strTrim3 = strArrSplit[i13].trim();
                try {
                    f7 = Float.parseFloat(strTrim3);
                } catch (NumberFormatException e7) {
                    zzdq.zzg("SsaStyle", "Failed to parse font size: '" + strTrim3 + "'", e7);
                    f7 = -3.4028235E38f;
                }
            } else {
                f7 = -3.4028235E38f;
            }
            int i14 = zzakjVar.zzf;
            boolean z4 = i14 != -1 && zze(strArrSplit[i14].trim());
            int i15 = zzakjVar.zzg;
            boolean z7 = i15 != -1 && zze(strArrSplit[i15].trim());
            int i16 = zzakjVar.zzh;
            boolean z8 = i16 != -1 && zze(strArrSplit[i16].trim());
            int i17 = zzakjVar.zzi;
            boolean z9 = i17 != -1 && zze(strArrSplit[i17].trim());
            int i18 = zzakjVar.zzj;
            if (i18 != -1) {
                strTrim = strArrSplit[i18].trim();
                try {
                    i7 = Integer.parseInt(strTrim.trim());
                    if (i7 != 1) {
                    }
                } catch (NumberFormatException unused) {
                }
            } else {
                i7 = -1;
            }
            return new zzakl(strTrim2, iZzd, numZzc, numZzc2, f7, z4, z7, z8, z9, i7);
        } catch (RuntimeException e8) {
            zzdq.zzg("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e8);
            return null;
        }
        zzdq.zzf("SsaStyle", "Ignoring unknown BorderStyle: ".concat(String.valueOf(strTrim)));
        i7 = -1;
        return new zzakl(strTrim2, iZzd, numZzc, numZzc2, f7, z4, z7, z8, z9, i7);
    }

    public static Integer zzc(String str) {
        try {
            long j = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            zzcv.zzd(j <= 4294967295L);
            return Integer.valueOf(Color.argb(zzfzk.zzb(((j >> 24) & 255) ^ 255), zzfzk.zzb(j & 255), zzfzk.zzb((j >> 8) & 255), zzfzk.zzb((j >> 16) & 255)));
        } catch (IllegalArgumentException e7) {
            zzdq.zzg("SsaStyle", "Failed to parse color expression: '" + str + "'", e7);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzd(String str) {
        try {
            int i7 = Integer.parseInt(str.trim());
            switch (i7) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    return i7;
                default:
                    AbstractC0486a1.o(str, "Ignoring unknown alignment: ", "SsaStyle");
                    return -1;
            }
        } catch (NumberFormatException unused) {
        }
    }

    private static boolean zze(String str) {
        try {
            int i7 = Integer.parseInt(str);
            return i7 == 1 || i7 == -1;
        } catch (NumberFormatException e7) {
            zzdq.zzg("SsaStyle", "Failed to parse boolean value: '" + str + "'", e7);
            return false;
        }
    }
}
