package com.google.android.gms.internal.p000authapi;

/* loaded from: classes8.dex */
public final class zbbe {
    public static java.lang.String zba(java.lang.String str, java.lang.Object... objArr) {
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
            sb.append(zbb(objArr[i]));
            i2 = indexOf + 2;
            i++;
        }
        sb.append((java.lang.CharSequence) str, i2, str.length());
        if (i < length) {
            java.lang.String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(zbb(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        }
        return sb.toString();
    }

    private static java.lang.String zbb(java.lang.Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (java.lang.Exception e) {
            java.lang.String name2 = obj.getClass().getName();
            java.lang.String hexString = java.lang.Integer.toHexString(java.lang.System.identityHashCode(obj));
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(name2).length() + 1 + java.lang.String.valueOf(hexString).length());
            sb.append(name2);
            sb.append("@");
            sb.append(hexString);
            java.lang.String sb2 = sb.toString();
            java.util.logging.Logger.getLogger("com.google.common.base.Strings").logp(java.util.logging.Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(sb2), (java.lang.Throwable) e);
            java.lang.String name3 = e.getClass().getName();
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(sb2.length() + 8 + java.lang.String.valueOf(name3).length() + 1);
            sb3.append("<");
            sb3.append(sb2);
            sb3.append(" threw ");
            sb3.append(name3);
            sb3.append(">");
            return sb3.toString();
        }
    }
}
