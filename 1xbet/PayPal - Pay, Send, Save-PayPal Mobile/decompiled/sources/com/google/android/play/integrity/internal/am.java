package com.google.android.play.integrity.internal;

/* loaded from: classes9.dex */
public final class am {
    public static java.lang.String a(@javax.annotation.CheckForNull java.lang.String str, @javax.annotation.CheckForNull java.lang.Object... objArr) {
        int length;
        int length2;
        int indexOf;
        java.lang.String obj;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            java.lang.Object obj2 = objArr[i2];
            if (obj2 == null) {
                obj = "null";
            } else {
                try {
                    obj = obj2.toString();
                } catch (java.lang.Exception e) {
                    java.lang.String name2 = obj2.getClass().getName();
                    java.lang.String hexString = java.lang.Integer.toHexString(java.lang.System.identityHashCode(obj2));
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(name2);
                    sb.append("@");
                    sb.append(hexString);
                    java.lang.String obj3 = sb.toString();
                    java.util.logging.Logger.getLogger("com.google.common.base.Strings").logp(java.util.logging.Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(obj3), (java.lang.Throwable) e);
                    java.lang.String name3 = e.getClass().getName();
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("<");
                    sb2.append(obj3);
                    sb2.append(" threw ");
                    sb2.append(name3);
                    sb2.append(">");
                    obj = sb2.toString();
                }
            }
            objArr[i2] = obj;
            i2++;
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb3.append((java.lang.CharSequence) str, i3, indexOf);
            sb3.append(objArr[i]);
            i++;
            i3 = indexOf + 2;
        }
        sb3.append((java.lang.CharSequence) str, i3, str.length());
        if (i < length2) {
            sb3.append(" [");
            sb3.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb3.append(", ");
                sb3.append(objArr[i4]);
            }
            sb3.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        }
        return sb3.toString();
    }
}
