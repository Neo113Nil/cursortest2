package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class zzcv {
    public static int zza(int i7, int i8, int i9) {
        if (i7 < 0 || i7 >= i9) {
            throw new IndexOutOfBoundsException();
        }
        return i7;
    }

    public static Object zzb(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException();
    }

    public static String zzc(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        return str;
    }

    public static void zzd(boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException();
        }
    }

    public static void zze(boolean z4, Object obj) {
        if (!z4) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zzf(boolean z4) {
        if (!z4) {
            throw new IllegalStateException();
        }
    }

    public static void zzg(boolean z4, Object obj) {
        if (!z4) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
