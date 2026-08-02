package com.google.android.gms.internal.p002firebaseauthapi;

import e1.k;
import java.util.logging.Level;
import java.util.logging.Logger;
import w1.L;

/* loaded from: classes.dex */
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
        int indexOf;
        String valueOf = String.valueOf(str);
        int i7 = 0;
        for (int i8 = 0; i8 < objArr.length; i8++) {
            objArr[i8] = zza(objArr[i8]);
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + valueOf.length());
        int i9 = 0;
        while (i7 < objArr.length && (indexOf = valueOf.indexOf("%s", i9)) != -1) {
            sb.append((CharSequence) valueOf, i9, indexOf);
            sb.append(objArr[i7]);
            i9 = indexOf + 2;
            i7++;
        }
        sb.append((CharSequence) valueOf, i9, valueOf.length());
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
            String f7 = k.f(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", L.i("Exception during lenientFormat for ", f7), (Throwable) e7);
            return L.j("<", f7, " threw ", e7.getClass().getName(), ">");
        }
    }
}
