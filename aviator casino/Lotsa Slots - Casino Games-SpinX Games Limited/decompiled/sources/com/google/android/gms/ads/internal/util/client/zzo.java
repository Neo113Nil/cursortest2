package com.google.android.gms.ads.internal.util.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public class zzo {
    protected static final com.google.android.gms.internal.ads.zzgty zzb = com.google.android.gms.internal.ads.zzgty.zzc(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.VUNGLE_OIT_CREATION_ERROR_VALUE);

    public static void zzd(java.lang.String str) {
        if (zzm(3)) {
            if (str.length() <= 4000) {
                android.util.Log.d("Ads", str);
                return;
            }
            boolean z = true;
            for (java.lang.String str2 : zzb.zzd(str)) {
                if (z) {
                    android.util.Log.d("Ads", str2);
                } else {
                    android.util.Log.d("Ads-cont", str2);
                }
                z = false;
            }
        }
    }

    public static void zze(java.lang.String str, java.lang.Throwable th) {
        if (zzm(3)) {
            android.util.Log.d("Ads", str, th);
        }
    }

    public static void zzf(java.lang.String str) {
        if (zzm(6)) {
            if (str == null || str.length() <= 4000) {
                android.util.Log.e("Ads", str);
                return;
            }
            boolean z = true;
            for (java.lang.String str2 : zzb.zzd(str)) {
                if (z) {
                    android.util.Log.e("Ads", str2);
                } else {
                    android.util.Log.e("Ads-cont", str2);
                }
                z = false;
            }
        }
    }

    public static void zzg(java.lang.String str, java.lang.Throwable th) {
        if (zzm(6)) {
            android.util.Log.e("Ads", str, th);
        }
    }

    public static void zzh(java.lang.String str) {
        if (zzm(4)) {
            if (str == null || str.length() <= 4000) {
                android.util.Log.i("Ads", str);
                return;
            }
            boolean z = true;
            for (java.lang.String str2 : zzb.zzd(str)) {
                if (z) {
                    android.util.Log.i("Ads", str2);
                } else {
                    android.util.Log.i("Ads-cont", str2);
                }
                z = false;
            }
        }
    }

    public static void zzi(java.lang.String str) {
        if (zzm(5)) {
            if (str == null || str.length() <= 4000) {
                android.util.Log.w("Ads", str);
                return;
            }
            boolean z = true;
            for (java.lang.String str2 : zzb.zzd(str)) {
                if (z) {
                    android.util.Log.w("Ads", str2);
                } else {
                    android.util.Log.w("Ads-cont", str2);
                }
                z = false;
            }
        }
    }

    public static void zzj(java.lang.String str, java.lang.Throwable th) {
        if (zzm(5)) {
            android.util.Log.w("Ads", str, th);
        }
    }

    static java.lang.String zzk(java.lang.String str) {
        java.lang.StackTraceElement[] stackTrace = java.lang.Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        int lineNumber = stackTrace[3].getLineNumber();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 2 + java.lang.String.valueOf(lineNumber).length());
        sb.append(str);
        sb.append(" @");
        sb.append(lineNumber);
        return sb.toString();
    }

    public static void zzl(java.lang.String str, java.lang.Throwable th) {
        if (zzm(5)) {
            if (th != null) {
                zzj(zzk(str), th);
            } else {
                zzi(zzk(str));
            }
        }
    }

    public static boolean zzm(int i) {
        return i >= 5 || android.util.Log.isLoggable("Ads", i);
    }
}
