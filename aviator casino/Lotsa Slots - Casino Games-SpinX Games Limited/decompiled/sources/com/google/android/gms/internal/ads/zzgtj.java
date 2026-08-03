package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgtj {
    public static void zza(boolean z) {
        if (!z) {
            throw new java.lang.IllegalArgumentException();
        }
    }

    public static void zzb(boolean z, java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalArgumentException((java.lang.String) obj);
        }
    }

    public static void zzc(boolean z, java.lang.String str, char c) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.ads.zzgua.zzd(str, java.lang.Character.valueOf(c)));
        }
    }

    public static void zzd(boolean z, java.lang.String str, int i) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.ads.zzgua.zzd(str, java.lang.Integer.valueOf(i)));
        }
    }

    public static void zze(boolean z, java.lang.String str, long j) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.ads.zzgua.zzd(str, java.lang.Long.valueOf(j)));
        }
    }

    public static void zzf(boolean z, java.lang.String str, java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.ads.zzgua.zzd(str, obj));
        }
    }

    public static void zzg(boolean z, java.lang.String str, int i, int i2) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.ads.zzgua.zzd(str, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
        }
    }

    public static void zzh(boolean z, java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.ads.zzgua.zzd(str, obj, obj2));
        }
    }

    public static void zzi(boolean z) {
        if (!z) {
            throw new java.lang.IllegalStateException();
        }
    }

    public static void zzj(boolean z, java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalStateException(java.lang.String.valueOf(obj));
        }
    }

    public static java.lang.Object zzk(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException((java.lang.String) obj2);
    }

    public static java.lang.Object zzl(java.lang.Object obj, java.lang.String str, java.lang.Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException(com.google.android.gms.internal.ads.zzgua.zzd(str, obj2));
    }

    public static int zzm(int i, int i2, java.lang.String str) {
        java.lang.String zzd;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            zzd = com.google.android.gms.internal.ads.zzgua.zzd("%s (%s) must not be negative", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, java.lang.Integer.valueOf(i));
        } else {
            if (i2 < 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 15);
                sb.append("negative size: ");
                sb.append(i2);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            zzd = com.google.android.gms.internal.ads.zzgua.zzd("%s (%s) must be less than size (%s)", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        }
        throw new java.lang.IndexOutOfBoundsException(zzd);
    }

    public static int zzn(int i, int i2, java.lang.String str) {
        if (i < 0 || i > i2) {
            throw new java.lang.IndexOutOfBoundsException(zzp(i, i2, com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX));
        }
        return i;
    }

    public static void zzo(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new java.lang.IndexOutOfBoundsException((i < 0 || i > i3) ? zzp(i, i3, "start index") : (i2 < 0 || i2 > i3) ? zzp(i2, i3, "end index") : com.google.android.gms.internal.ads.zzgua.zzd("end index (%s) must not be less than start index (%s)", java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i)));
        }
    }

    private static java.lang.String zzp(int i, int i2, java.lang.String str) {
        if (i < 0) {
            return com.google.android.gms.internal.ads.zzgua.zzd("%s (%s) must not be negative", str, java.lang.Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return com.google.android.gms.internal.ads.zzgua.zzd("%s (%s) must not be greater than size (%s)", str, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 15);
        sb.append("negative size: ");
        sb.append(i2);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }
}
