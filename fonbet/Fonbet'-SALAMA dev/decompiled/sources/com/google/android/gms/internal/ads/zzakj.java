package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes.dex */
final class zzakj {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final int zzk;

    private zzakj(int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.zza = i7;
        this.zzb = i8;
        this.zzc = i9;
        this.zzd = i10;
        this.zze = i11;
        this.zzf = i12;
        this.zzg = i13;
        this.zzh = i14;
        this.zzi = i15;
        this.zzj = i16;
        this.zzk = i17;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzakj zza(String str) {
        char c3;
        String[] split = TextUtils.split(str.substring(7), ",");
        int i7 = 0;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        int i17 = -1;
        while (true) {
            int length = split.length;
            if (i7 >= length) {
                if (i8 != -1) {
                    return new zzakj(i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, length);
                }
                return null;
            }
            String zza = zzfsn.zza(split[i7].trim());
            switch (zza.hashCode()) {
                case -1178781136:
                    if (zza.equals("italic")) {
                        c3 = 6;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1026963764:
                    if (zza.equals("underline")) {
                        c3 = 7;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -192095652:
                    if (zza.equals("strikeout")) {
                        c3 = '\b';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -70925746:
                    if (zza.equals("primarycolour")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 3029637:
                    if (zza.equals("bold")) {
                        c3 = 5;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 3373707:
                    if (zza.equals("name")) {
                        c3 = 0;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 366554320:
                    if (zza.equals("fontsize")) {
                        c3 = 4;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 767321349:
                    if (zza.equals("borderstyle")) {
                        c3 = '\t';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1767875043:
                    if (zza.equals("alignment")) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1988365454:
                    if (zza.equals("outlinecolour")) {
                        c3 = 3;
                        break;
                    }
                    c3 = 65535;
                    break;
                default:
                    c3 = 65535;
                    break;
            }
            switch (c3) {
                case 0:
                    i8 = i7;
                    break;
                case 1:
                    i9 = i7;
                    break;
                case 2:
                    i10 = i7;
                    break;
                case 3:
                    i11 = i7;
                    break;
                case 4:
                    i12 = i7;
                    break;
                case 5:
                    i13 = i7;
                    break;
                case 6:
                    i14 = i7;
                    break;
                case 7:
                    i15 = i7;
                    break;
                case '\b':
                    i16 = i7;
                    break;
                case '\t':
                    i17 = i7;
                    break;
            }
            i7++;
        }
    }
}
