package io.appmetrica.analytics.coreutils.internal;

/* loaded from: classes.dex */
public final class StringExtensionsKt {
    public static final java.lang.String replaceFirstCharWithTitleCase(java.lang.String str) {
        return replaceFirstCharWithTitleCase(str, java.util.Locale.US);
    }

    public static final java.lang.String replaceFirstCharWithTitleCase(java.lang.String str, java.util.Locale locale) {
        java.lang.String valueOf;
        if (str.length() <= 0) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        char charAt = str.charAt(0);
        if (java.lang.Character.isLowerCase(charAt)) {
            kotlin.jvm.internal.i.e(locale, "locale");
            java.lang.String valueOf2 = java.lang.String.valueOf(charAt);
            kotlin.jvm.internal.i.c(valueOf2, "null cannot be cast to non-null type java.lang.String");
            valueOf = valueOf2.toUpperCase(locale);
            kotlin.jvm.internal.i.d(valueOf, "toUpperCase(...)");
            if (valueOf.length() <= 1) {
                java.lang.String valueOf3 = java.lang.String.valueOf(charAt);
                kotlin.jvm.internal.i.c(valueOf3, "null cannot be cast to non-null type java.lang.String");
                java.lang.String upperCase = valueOf3.toUpperCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.i.d(upperCase, "toUpperCase(...)");
                if (valueOf.equals(upperCase)) {
                    valueOf = java.lang.String.valueOf(java.lang.Character.toTitleCase(charAt));
                }
            } else if (charAt != 329) {
                char charAt2 = valueOf.charAt(0);
                java.lang.String substring = valueOf.substring(1);
                kotlin.jvm.internal.i.d(substring, "substring(...)");
                java.lang.String lowerCase = substring.toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.i.d(lowerCase, "toLowerCase(...)");
                valueOf = charAt2 + lowerCase;
            }
        } else {
            valueOf = java.lang.String.valueOf(charAt);
        }
        sb.append((java.lang.Object) valueOf);
        sb.append(str.substring(1));
        return sb.toString();
    }
}
