package com.google.android.gms.internal.ads;

import e1.k;

/* loaded from: classes.dex */
public final class zzfth {
    public static int zza(int i7, int i8, String str) {
        String zzb;
        if (i7 >= 0 && i7 < i8) {
            return i7;
        }
        if (i7 < 0) {
            zzb = zzfty.zzb("%s (%s) must not be negative", "index", Integer.valueOf(i7));
        } else {
            if (i8 < 0) {
                throw new IllegalArgumentException(k.d(i8, "negative size: "));
            }
            zzb = zzfty.zzb("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i7), Integer.valueOf(i8));
        }
        throw new IndexOutOfBoundsException(zzb);
    }

    public static int zzb(int i7, int i8, String str) {
        if (i7 < 0 || i7 > i8) {
            throw new IndexOutOfBoundsException(zzn(i7, i8, "index"));
        }
        return i7;
    }

    public static Object zzc(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static Object zzd(Object obj, String str, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(zzfty.zzb(str, obj2));
    }

    public static void zze(boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzf(boolean z4, Object obj) {
        if (!z4) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zzg(boolean z4, String str, char c3) {
        if (!z4) {
            throw new IllegalArgumentException(zzfty.zzb(str, Character.valueOf(c3)));
        }
    }

    public static void zzh(boolean z4, String str, long j) {
        if (!z4) {
            throw new IllegalArgumentException(zzfty.zzb(str, Long.valueOf(j)));
        }
    }

    public static void zzi(boolean z4, String str, Object obj) {
        if (!z4) {
            throw new IllegalArgumentException(zzfty.zzb(str, obj));
        }
    }

    public static void zzj(boolean z4, String str, int i7, int i8) {
        if (!z4) {
            throw new IllegalArgumentException(zzfty.zzb(str, Integer.valueOf(i7), Integer.valueOf(i8)));
        }
    }

    public static void zzk(int i7, int i8, int i9) {
        if (i7 < 0 || i8 < i7 || i8 > i9) {
            throw new IndexOutOfBoundsException((i7 < 0 || i7 > i9) ? zzn(i7, i9, "start index") : (i8 < 0 || i8 > i9) ? zzn(i8, i9, "end index") : zzfty.zzb("end index (%s) must not be less than start index (%s)", Integer.valueOf(i8), Integer.valueOf(i7)));
        }
    }

    public static void zzl(boolean z4) {
        if (!z4) {
            throw new IllegalStateException();
        }
    }

    public static void zzm(boolean z4, Object obj) {
        if (!z4) {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String zzn(int i7, int i8, String str) {
        if (i7 < 0) {
            return zzfty.zzb("%s (%s) must not be negative", str, Integer.valueOf(i7));
        }
        if (i8 >= 0) {
            return zzfty.zzb("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i8));
        }
        throw new IllegalArgumentException(k.d(i8, "negative size: "));
    }
}
