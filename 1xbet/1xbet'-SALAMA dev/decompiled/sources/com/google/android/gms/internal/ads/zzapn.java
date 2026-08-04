package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Locale;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzapn {
    public static final String zza = "Volley";
    public static final boolean zzb = Log.isLoggable("Volley", 2);
    private static final String zzc = zzapn.class.getName();

    public static void zza(String str, Object... objArr) {
        Log.d(zza, zze(str, objArr));
    }

    public static void zzb(String str, Object... objArr) {
        Log.e(zza, zze(str, objArr));
    }

    public static void zzc(Throwable th, String str, Object... objArr) {
        Log.e(zza, zze(str, objArr), th);
    }

    public static void zzd(String str, Object... objArr) {
        if (zzb) {
            Log.v(zza, zze(str, objArr));
        }
    }

    private static String zze(String str, Object... objArr) {
        String strF;
        String str2 = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        for (int i7 = 2; i7 < stackTrace.length; i7++) {
            if (!stackTrace[i7].getClassName().equals(zzc)) {
                String className = stackTrace[i7].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                strF = k.f(strSubstring.substring(strSubstring.lastIndexOf(36) + 1), ".", stackTrace[i7].getMethodName());
                Locale locale = Locale.US;
                long id = Thread.currentThread().getId();
                StringBuilder sb = new StringBuilder("[");
                sb.append(id);
                sb.append("] ");
                sb.append(strF);
                return k.i(sb, ": ", str2);
            }
        }
        strF = "<unknown>";
        Locale locale2 = Locale.US;
        long id2 = Thread.currentThread().getId();
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(id2);
        sb2.append("] ");
        sb2.append(strF);
        return k.i(sb2, ": ", str2);
    }
}
