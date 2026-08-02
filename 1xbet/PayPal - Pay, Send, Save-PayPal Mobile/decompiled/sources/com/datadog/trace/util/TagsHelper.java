package com.datadog.trace.util;

/* loaded from: classes8.dex */
public final class TagsHelper {
    public static java.lang.String sanitize(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.lang.String trim = str.toLowerCase(java.util.Locale.ROOT).trim();
        int min = java.lang.Math.min(trim.length(), 200);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(min);
        for (int i = 0; i < min; i++) {
            char charAt = trim.charAt(i);
            if ((charAt >= 'a' && charAt <= 'z') || ((charAt >= '0' && charAt <= '9') || charAt == '-' || charAt == '_' || charAt == '.' || charAt == '/' || charAt == ':')) {
                sb.append(charAt);
            } else {
                sb.append('_');
            }
        }
        return sb.toString();
    }

    public static java.lang.String concatTags(java.lang.String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.lang.String str : strArr) {
            sb.append(str);
            sb.append(",");
        }
        return sb.substring(0, sb.length() - 1);
    }
}
