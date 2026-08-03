package com.google.android.gms.common.util;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes3.dex */
final class zzf {
    private static final java.util.regex.Pattern zza = java.util.regex.Pattern.compile("\\\\u[0-9a-fA-F]{4}");

    public static java.lang.String zza(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return str;
        }
        java.util.regex.Matcher matcher = zza.matcher(str);
        java.lang.StringBuilder sb = null;
        int i = 0;
        while (matcher.find()) {
            if (sb == null) {
                sb = new java.lang.StringBuilder();
            }
            int start = matcher.start();
            int i2 = start;
            while (i2 >= 0 && str.charAt(i2) == '\\') {
                i2--;
            }
            if ((start - i2) % 2 != 0) {
                int parseInt = java.lang.Integer.parseInt(matcher.group().substring(2), 16);
                sb.append((java.lang.CharSequence) str, i, matcher.start());
                if (parseInt == 92) {
                    sb.append("\\\\");
                } else {
                    sb.append(java.lang.Character.toChars(parseInt));
                }
                i = matcher.end();
            }
        }
        if (sb == null) {
            return str;
        }
        if (i < matcher.regionEnd()) {
            sb.append((java.lang.CharSequence) str, i, matcher.regionEnd());
        }
        return sb.toString();
    }
}
