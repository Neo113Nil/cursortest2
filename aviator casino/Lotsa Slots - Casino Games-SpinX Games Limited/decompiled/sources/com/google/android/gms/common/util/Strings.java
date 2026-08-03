package com.google.android.gms.common.util;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes3.dex */
public class Strings {
    private static final java.util.regex.Pattern zza = java.util.regex.Pattern.compile("\\$\\{(.*?)\\}");

    private Strings() {
    }

    public static java.lang.String emptyToNull(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    public static boolean isEmptyOrWhitespace(java.lang.String str) {
        return str == null || str.trim().isEmpty();
    }
}
