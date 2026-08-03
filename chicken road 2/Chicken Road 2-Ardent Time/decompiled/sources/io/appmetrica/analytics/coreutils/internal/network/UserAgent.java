package io.appmetrica.analytics.coreutils.internal.network;

/* loaded from: classes.dex */
public final class UserAgent {
    public static final io.appmetrica.analytics.coreutils.internal.network.UserAgent INSTANCE = new io.appmetrica.analytics.coreutils.internal.network.UserAgent();

    private UserAgent() {
    }

    public static final java.lang.String getFor(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append('/');
        sb.append(str2);
        sb.append('.');
        sb.append(str3);
        sb.append(" (");
        INSTANCE.getClass();
        java.lang.String str4 = android.os.Build.MODEL;
        java.lang.String str5 = android.os.Build.MANUFACTURER;
        if (!y1.o.K(str4, str5, false)) {
            str4 = str5 + ' ' + str4;
        }
        sb.append(io.appmetrica.analytics.coreutils.internal.StringExtensionsKt.replaceFirstCharWithTitleCase(str4));
        sb.append("; Android ");
        sb.append(android.os.Build.VERSION.RELEASE);
        sb.append(')');
        return sb.toString();
    }
}
