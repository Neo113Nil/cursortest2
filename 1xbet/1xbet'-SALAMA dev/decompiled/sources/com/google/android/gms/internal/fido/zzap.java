package com.google.android.gms.internal.fido;

import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzap {
    public static int zza(int i7, int i8, String str) {
        String strZza;
        if (i7 >= 0 && i7 < i8) {
            return i7;
        }
        if (i7 < 0) {
            strZza = zzaq.zza("%s (%s) must not be negative", "index", Integer.valueOf(i7));
        } else {
            if (i8 < 0) {
                throw new IllegalArgumentException(k.d(i8, "negative size: "));
            }
            strZza = zzaq.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i7), Integer.valueOf(i8));
        }
        throw new IndexOutOfBoundsException(strZza);
    }

    public static int zzb(int i7, int i8, String str) {
        if (i7 < 0 || i7 > i8) {
            throw new IndexOutOfBoundsException(zzf(i7, i8, "index"));
        }
        return i7;
    }

    public static void zzc(boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzd(boolean z4, String str, char c3) {
        if (!z4) {
            throw new IllegalArgumentException(zzaq.zza(str, Character.valueOf(c3)));
        }
    }

    public static void zze(int i7, int i8, int i9) {
        String strZzf;
        if (i7 < 0 || i8 < i7 || i8 > i9) {
            if (i7 < 0 || i7 > i9) {
                strZzf = zzf(i7, i9, "start index");
            } else {
                strZzf = (i8 < 0 || i8 > i9) ? zzf(i8, i9, "end index") : zzaq.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i8), Integer.valueOf(i7));
            }
            throw new IndexOutOfBoundsException(strZzf);
        }
    }

    private static String zzf(int i7, int i8, String str) {
        if (i7 < 0) {
            return zzaq.zza("%s (%s) must not be negative", str, Integer.valueOf(i7));
        }
        if (i8 >= 0) {
            return zzaq.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i8));
        }
        throw new IllegalArgumentException(k.d(i8, "negative size: "));
    }
}
