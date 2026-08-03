package io.appmetrica.analytics.logger.common.impl;

/* loaded from: classes.dex */
public final class a {
    public static java.lang.String a(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(" ");
        if (str2 == null) {
            str2 = "";
        } else if (objArr != null && objArr.length != 0) {
            try {
                str2 = java.lang.String.format(java.util.Locale.US, str2, objArr);
            } catch (java.lang.Throwable th) {
                str2 = "Attention!!! Invalid log format. See exception details above. Message: " + str2 + "; arguments: " + java.util.Arrays.toString(objArr);
                android.util.Log.e("[LogMessageConstructor]", str2, th);
            }
        }
        java.util.Locale locale = java.util.Locale.US;
        sb.append("[" + java.lang.Thread.currentThread().getId() + "-" + java.lang.Thread.currentThread().getName() + "] " + str2);
        return sb.toString();
    }
}
