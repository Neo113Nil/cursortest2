package com.google.android.gms.internal.tapandpay;

/* loaded from: classes8.dex */
public final class zzbs {
    public static java.lang.String zza(java.lang.String str, java.lang.Object... objArr) {
        int length;
        int length2;
        int indexOf;
        java.lang.String sb;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            java.lang.Object obj = objArr[i2];
            if (obj == null) {
                sb = "null";
            } else {
                try {
                    sb = obj.toString();
                } catch (java.lang.Exception e) {
                    java.lang.String name2 = obj.getClass().getName();
                    java.lang.String hexString = java.lang.Integer.toHexString(java.lang.System.identityHashCode(obj));
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(name2).length() + 1 + java.lang.String.valueOf(hexString).length());
                    sb2.append(name2);
                    sb2.append("@");
                    sb2.append(hexString);
                    java.lang.String sb3 = sb2.toString();
                    java.util.logging.Logger.getLogger("com.google.common.base.Strings").logp(java.util.logging.Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(sb3), (java.lang.Throwable) e);
                    java.lang.String name3 = e.getClass().getName();
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder(sb3.length() + 8 + java.lang.String.valueOf(name3).length() + 1);
                    sb4.append("<");
                    sb4.append(sb3);
                    sb4.append(" threw ");
                    sb4.append(name3);
                    sb4.append(">");
                    sb = sb4.toString();
                }
            }
            objArr[i2] = sb;
            i2++;
        }
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb5.append((java.lang.CharSequence) str, i3, indexOf);
            sb5.append(objArr[i]);
            i++;
            i3 = indexOf + 2;
        }
        sb5.append((java.lang.CharSequence) str, i3, str.length());
        if (i < length2) {
            sb5.append(" [");
            sb5.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb5.append(", ");
                sb5.append(objArr[i4]);
            }
            sb5.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        }
        return sb5.toString();
    }
}
