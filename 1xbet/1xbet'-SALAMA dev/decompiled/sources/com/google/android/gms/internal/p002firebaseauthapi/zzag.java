package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.logging.Level;
import java.util.logging.Logger;
import p031e1.k;
import p155w1.L;

/* JADX INFO: loaded from: classes.dex */
public final class zzag {
    public static String zza(String str) {
        return zzt.zzb(str);
    }

    public static String zzb(String str) {
        return zzt.zzc(str);
    }

    public static boolean zzc(String str) {
        return zzt.zzd(str);
    }

    public static String zza(String str, Object... objArr) {
        int iIndexOf;
        String strValueOf = String.valueOf(str);
        int i7 = 0;
        for (int i8 = 0; i8 < objArr.length; i8++) {
            objArr[i8] = zza(objArr[i8]);
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + strValueOf.length());
        int i9 = 0;
        while (i7 < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i9)) != -1) {
            sb.append((CharSequence) strValueOf, i9, iIndexOf);
            sb.append(objArr[i7]);
            i9 = iIndexOf + 2;
            i7++;
        }
        sb.append((CharSequence) strValueOf, i9, strValueOf.length());
        if (i7 < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i7]);
            for (int i10 = i7 + 1; i10 < objArr.length; i10++) {
                sb.append(", ");
                sb.append(objArr[i10]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    private static String zza(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e7) {
            String strF = k.f(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", L.i("Exception during lenientFormat for ", strF), (Throwable) e7);
            return L.j("<", strF, " threw ", e7.getClass().getName(), ">");
        }
    }
}
