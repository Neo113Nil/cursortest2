package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
public final class zzer {
    public static void zza(boolean z) {
        if (!z) {
            throw new java.lang.IllegalArgumentException();
        }
    }

    public static void zzb(boolean z, @javax.annotation.CheckForNull java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalArgumentException((java.lang.String) obj);
        }
    }

    public static int zzc(int i, int i2, java.lang.String str) {
        java.lang.String zza;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            zza = com.google.android.gms.internal.identity.zzes.zza("%s (%s) must not be negative", "index", java.lang.Integer.valueOf(i));
        } else {
            if (i2 < 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 15);
                sb.append("negative size: ");
                sb.append(i2);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            zza = com.google.android.gms.internal.identity.zzes.zza("%s (%s) must be less than size (%s)", "index", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        }
        throw new java.lang.IndexOutOfBoundsException(zza);
    }

    public static int zzd(int i, int i2, java.lang.String str) {
        if (i < 0 || i > i2) {
            throw new java.lang.IndexOutOfBoundsException(zzf(i, i2, "index"));
        }
        return i;
    }

    private static java.lang.String zzf(int i, int i2, java.lang.String str) {
        if (i < 0) {
            return com.google.android.gms.internal.identity.zzes.zza("%s (%s) must not be negative", str, java.lang.Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return com.google.android.gms.internal.identity.zzes.zza("%s (%s) must not be greater than size (%s)", str, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 15);
        sb.append("negative size: ");
        sb.append(i2);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public static void zze(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new java.lang.IndexOutOfBoundsException((i < 0 || i > i3) ? zzf(i, i3, "start index") : (i2 < 0 || i2 > i3) ? zzf(i2, i3, "end index") : com.google.android.gms.internal.identity.zzes.zza("end index (%s) must not be less than start index (%s)", java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i)));
        }
    }
}
