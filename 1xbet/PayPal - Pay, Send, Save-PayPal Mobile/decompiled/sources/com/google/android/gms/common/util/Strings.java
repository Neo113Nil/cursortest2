package com.google.android.gms.common.util;

/* loaded from: classes4.dex */
public class Strings {
    private static final java.util.regex.Pattern zza = java.util.regex.Pattern.compile("\\$\\{(.*?)\\}");

    public static java.lang.String emptyToNull(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    public static boolean isEmptyOrWhitespace(java.lang.String str) {
        return str == null || str.trim().isEmpty();
    }

    private Strings() {
    }
}
