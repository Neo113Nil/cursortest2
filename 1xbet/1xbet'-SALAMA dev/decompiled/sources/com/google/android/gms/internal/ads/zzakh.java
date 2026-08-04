package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
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

    public static zzakh zza(String str) {
        byte b7;
        zzcv.zzd(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i7 = 0;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        int i11 = -1;
        while (true) {
            int length = strArrSplit.length;
            if (i7 >= length) {
                if (i8 == -1 || i9 == -1 || i11 == -1) {
                    return null;
                }
                return new zzakh(i8, i9, i10, i11, length);
            }
            switch (zzfsn.zza(strArrSplit[i7].trim())) {
                case "end":
                    b7 = 1;
                    break;
                case "text":
                    b7 = 3;
                    break;
                case "start":
                    b7 = 0;
                    break;
                case "style":
                    b7 = 2;
                    break;
                default:
                    b7 = -1;
                    break;
            }
            if (b7 == 0) {
                i8 = i7;
            } else if (b7 == 1) {
                i9 = i7;
            } else if (b7 == 2) {
                i10 = i7;
            } else if (b7 == 3) {
                i11 = i7;
            }
            i7++;
        }
    }
}
