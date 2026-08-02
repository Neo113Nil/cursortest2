package com.google.android.gms.internal.ads;

import android.util.Log;
import e1.k;
import java.util.Locale;

/* loaded from: classes.dex */
public final class zzapn {
    public static final String zza = "Volley";
    public static final boolean zzb = Log.isLoggable(zza, 2);
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
        String str2;
        String format = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i7 = 2;
        while (true) {
            if (i7 >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            }
            if (!stackTrace[i7].getClassName().equals(zzc)) {
                String className = stackTrace[i7].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                str2 = k.f(substring.substring(substring.lastIndexOf(36) + 1), ".", stackTrace[i7].getMethodName());
                break;
            }
            i7++;
        }
        Locale locale = Locale.US;
        long id = Thread.currentThread().getId();
        StringBuilder sb = new StringBuilder("[");
        sb.append(id);
        sb.append("] ");
        sb.append(str2);
        return k.i(sb, ": ", format);
    }
}
