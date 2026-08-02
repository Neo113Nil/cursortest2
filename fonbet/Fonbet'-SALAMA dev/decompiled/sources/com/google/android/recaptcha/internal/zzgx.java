package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzgx {
    public static void zza(boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzb(boolean z4, Object obj) {
        if (!z4) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zzc(boolean z4, String str, char c3) {
        if (!z4) {
            throw new IllegalArgumentException(zzha.zza(str, Character.valueOf(c3)));
        }
    }

    public static void zzd(int i7, int i8, int i9) {
        if (i7 < 0 || i8 < i7 || i8 > i9) {
            throw new IndexOutOfBoundsException((i7 < 0 || i7 > i9) ? zzf(i7, i9, "start index") : (i8 < 0 || i8 > i9) ? zzf(i8, i9, "end index") : zzha.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i8), Integer.valueOf(i7)));
        }
    }

    public static void zze(boolean z4, Object obj) {
        if (!z4) {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String zzf(int i7, int i8, String str) {
        return i7 < 0 ? zzha.zza("%s (%s) must not be negative", str, Integer.valueOf(i7)) : zzha.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i8));
    }
}
