package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
public final class zzbm {
    public static int zza(int i, int i2, java.lang.String str) {
        java.lang.String zza;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            zza = com.google.android.gms.internal.fido.zzbo.zza("%s (%s) must not be negative", "index", java.lang.Integer.valueOf(i));
        } else {
            if (i2 < 0) {
                throw new java.lang.IllegalArgumentException("negative size: " + i2);
            }
            zza = com.google.android.gms.internal.fido.zzbo.zza("%s (%s) must be less than size (%s)", "index", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        }
        throw new java.lang.IndexOutOfBoundsException(zza);
    }

    public static int zzb(int i, int i2, java.lang.String str) {
        if (i < 0 || i > i2) {
            throw new java.lang.IndexOutOfBoundsException(zzg(i, i2, "index"));
        }
        return i;
    }

    public static void zzc(boolean z) {
        if (!z) {
            throw new java.lang.IllegalArgumentException();
        }
    }

    public static void zzd(boolean z, java.lang.String str, char c) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.fido.zzbo.zza(str, java.lang.Character.valueOf(c)));
        }
    }

    public static void zzf(boolean z, @javax.annotation.CheckForNull java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalStateException((java.lang.String) obj);
        }
    }

    private static java.lang.String zzg(int i, int i2, java.lang.String str) {
        if (i < 0) {
            return com.google.android.gms.internal.fido.zzbo.zza("%s (%s) must not be negative", str, java.lang.Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return com.google.android.gms.internal.fido.zzbo.zza("%s (%s) must not be greater than size (%s)", str, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        }
        throw new java.lang.IllegalArgumentException("negative size: " + i2);
    }

    public static void zze(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new java.lang.IndexOutOfBoundsException((i < 0 || i > i3) ? zzg(i, i3, "start index") : (i2 < 0 || i2 > i3) ? zzg(i2, i3, "end index") : com.google.android.gms.internal.fido.zzbo.zza("end index (%s) must not be less than start index (%s)", java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i)));
        }
    }
}
