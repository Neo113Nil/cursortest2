package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public final class zzdp {
    public static java.lang.String zza(java.lang.String str, java.lang.Object... objArr) {
        int length;
        int indexOf;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (indexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb.append((java.lang.CharSequence) str, i2, indexOf);
            sb.append(zzb(objArr[i]));
            i2 = indexOf + 2;
            i++;
        }
        sb.append((java.lang.CharSequence) str, i2, str.length());
        if (i < length) {
            java.lang.String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(zzb(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        }
        return sb.toString();
    }

    private static java.lang.String zzb(java.lang.Object obj) {
        if (obj == null) {
            return kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL;
        }
        try {
            return obj.toString();
        } catch (java.lang.Exception e) {
            java.lang.String str = obj.getClass().getName() + "@" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(obj));
            java.util.logging.Logger.getLogger("com.google.common.base.Strings").logp(java.util.logging.Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str), (java.lang.Throwable) e);
            return "<" + str + " threw " + e.getClass().getName() + ">";
        }
    }
}
