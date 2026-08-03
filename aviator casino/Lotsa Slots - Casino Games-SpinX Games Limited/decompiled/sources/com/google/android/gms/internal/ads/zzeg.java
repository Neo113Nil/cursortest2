package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzeg {
    private static final java.lang.Object zza = new java.lang.Object();

    @org.checkerframework.dataflow.qual.Pure
    public static void zza(java.lang.String str, java.lang.String str2) {
        synchronized (zza) {
            android.util.Log.d(str, zzg(str2, null));
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void zzb(java.lang.String str, java.lang.String str2) {
        synchronized (zza) {
            android.util.Log.i(str, zzg(str2, null));
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void zzc(java.lang.String str, java.lang.String str2) {
        synchronized (zza) {
            android.util.Log.w(str, zzg(str2, null));
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void zzd(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        synchronized (zza) {
            android.util.Log.w(str, zzg(str2, th));
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void zze(java.lang.String str, java.lang.String str2) {
        synchronized (zza) {
            android.util.Log.e(str, zzg(str2, null));
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void zzf(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        synchronized (zza) {
            android.util.Log.e(str, zzg(str2, th));
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public static java.lang.String zzg(java.lang.String str, java.lang.Throwable th) {
        java.lang.String replace;
        if (th != null) {
            synchronized (zza) {
                java.lang.Throwable th2 = th;
                while (true) {
                    if (th2 == null) {
                        replace = android.util.Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    if (th2 instanceof java.net.UnknownHostException) {
                        replace = "UnknownHostException (no network)";
                        break;
                    }
                    th2 = th2.getCause();
                }
            }
        } else {
            replace = null;
        }
        if (android.text.TextUtils.isEmpty(replace)) {
            return str;
        }
        java.lang.String replace2 = replace.replace("\n", "\n  ");
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 3 + java.lang.String.valueOf(replace2).length() + 1);
        sb.append(str);
        sb.append("\n  ");
        sb.append(replace2);
        sb.append("\n");
        return sb.toString();
    }
}
