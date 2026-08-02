package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes.dex */
final class zzakh {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    private zzakh(int i7, int i8, int i9, int i10, int i11) {
        this.zza = i7;
        this.zzb = i8;
        this.zzc = i9;
        this.zzd = i10;
        this.zze = i11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzakh zza(String str) {
        char c3;
        zzcv.zzd(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i7 = 0;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        int i11 = -1;
        while (true) {
            int length = split.length;
            if (i7 >= length) {
                if (i8 == -1 || i9 == -1 || i11 == -1) {
                    return null;
                }
                return new zzakh(i8, i9, i10, i11, length);
            }
            String zza = zzfsn.zza(split[i7].trim());
            switch (zza.hashCode()) {
                case 100571:
                    if (zza.equals("end")) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 3556653:
                    if (zza.equals("text")) {
                        c3 = 3;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 109757538:
                    if (zza.equals("start")) {
                        c3 = 0;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 109780401:
                    if (zza.equals("style")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                default:
                    c3 = 65535;
                    break;
            }
            if (c3 == 0) {
                i8 = i7;
            } else if (c3 == 1) {
                i9 = i7;
            } else if (c3 == 2) {
                i10 = i7;
            } else if (c3 == 3) {
                i11 = i7;
            }
            i7++;
        }
    }
}
