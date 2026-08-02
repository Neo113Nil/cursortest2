package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
public final class zzaz {
    public static int zza(int i, int i2, java.lang.String str) {
        java.lang.String zzb;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            zzb = com.google.android.gms.internal.mlkit_vision_barcode.zzba.zzb("%s (%s) must not be negative", "index", java.lang.Integer.valueOf(i));
        } else {
            if (i2 < 0) {
                throw new java.lang.IllegalArgumentException("negative size: " + i2);
            }
            zzb = com.google.android.gms.internal.mlkit_vision_barcode.zzba.zzb("%s (%s) must be less than size (%s)", "index", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        }
        throw new java.lang.IndexOutOfBoundsException(zzb);
    }

    public static int zzb(int i, int i2, java.lang.String str) {
        if (i < 0 || i > i2) {
            throw new java.lang.IndexOutOfBoundsException(zzg(i, i2, "index"));
        }
        return i;
    }

    public static java.lang.Object zzc(@javax.annotation.CheckForNull java.lang.Object obj, @javax.annotation.CheckForNull java.lang.Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException("Executor was null.");
    }

    public static void zzd(boolean z) {
        if (!z) {
            throw new java.lang.IllegalArgumentException();
        }
    }

    public static void zzf(boolean z, @javax.annotation.CheckForNull java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalStateException((java.lang.String) obj);
        }
    }

    private static java.lang.String zzg(int i, int i2, java.lang.String str) {
        if (i < 0) {
            return com.google.android.gms.internal.mlkit_vision_barcode.zzba.zzb("%s (%s) must not be negative", str, java.lang.Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return com.google.android.gms.internal.mlkit_vision_barcode.zzba.zzb("%s (%s) must not be greater than size (%s)", str, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        }
        throw new java.lang.IllegalArgumentException("negative size: " + i2);
    }

    public static void zze(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new java.lang.IndexOutOfBoundsException((i < 0 || i > i3) ? zzg(i, i3, "start index") : (i2 < 0 || i2 > i3) ? zzg(i2, i3, "end index") : com.google.android.gms.internal.mlkit_vision_barcode.zzba.zzb("end index (%s) must not be less than start index (%s)", java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i)));
        }
    }
}
