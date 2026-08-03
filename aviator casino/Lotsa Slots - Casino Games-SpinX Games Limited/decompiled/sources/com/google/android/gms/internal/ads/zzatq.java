package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzatq {
    public static final java.lang.String zza = "Volley";
    public static final boolean zzb = android.util.Log.isLoggable(zza, 2);
    private static final java.lang.String zzc = com.google.android.gms.internal.ads.zzatq.class.getName();

    public static void zza(java.lang.String str, java.lang.Object... objArr) {
        if (zzb) {
            android.util.Log.v(zza, zze(str, objArr));
        }
    }

    public static void zzb(java.lang.String str, java.lang.Object... objArr) {
        android.util.Log.d(zza, zze(str, objArr));
    }

    public static void zzc(java.lang.String str, java.lang.Object... objArr) {
        android.util.Log.e(zza, zze(str, objArr));
    }

    public static void zzd(java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        android.util.Log.e(zza, zze(str, objArr), th);
    }

    private static java.lang.String zze(java.lang.String str, java.lang.Object... objArr) {
        java.lang.String str2;
        java.lang.String format = java.lang.String.format(java.util.Locale.US, str, objArr);
        java.lang.StackTraceElement[] stackTrace = new java.lang.Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            }
            if (!stackTrace[i].getClassName().equals(zzc)) {
                java.lang.String className = stackTrace[i].getClassName();
                java.lang.String substring = className.substring(className.lastIndexOf(46) + 1);
                java.lang.String substring2 = substring.substring(substring.lastIndexOf(36) + 1);
                java.lang.String methodName = stackTrace[i].getMethodName();
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(substring2).length() + 1 + java.lang.String.valueOf(methodName).length());
                sb.append(substring2);
                sb.append(".");
                sb.append(methodName);
                str2 = sb.toString();
                break;
            }
            i++;
        }
        return java.lang.String.format(java.util.Locale.US, "[%d] %s: %s", java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), str2, format);
    }
}
