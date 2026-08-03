package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public abstract class Fm {
    public static java.lang.String a(java.util.Map map) {
        if (io.appmetrica.analytics.impl.AbstractC0522lo.a(map)) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.util.Map.Entry entry : map.entrySet()) {
            sb.append((java.lang.String) entry.getKey());
            sb.append(io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb.append((java.lang.String) entry.getValue());
            sb.append(io.appmetrica.analytics.coreutils.internal.StringUtils.COMMA);
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }

    public static java.util.HashMap b(java.util.Map map) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (map != null) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                if (!android.text.TextUtils.isEmpty(str) && !str.contains(io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER) && !str.contains(io.appmetrica.analytics.coreutils.internal.StringUtils.COMMA) && !str.contains("&")) {
                    java.lang.String str2 = (java.lang.String) entry.getValue();
                    if (!android.text.TextUtils.isEmpty(str2) && io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils.parseLong(str2, -1L) != -1) {
                        hashMap.put((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
                    }
                }
            }
        }
        return hashMap;
    }

    public static java.util.HashMap a(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (!android.text.TextUtils.isEmpty(str)) {
            for (java.lang.String str2 : str.split(io.appmetrica.analytics.coreutils.internal.StringUtils.COMMA)) {
                int indexOf = str2.indexOf(io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER);
                if (indexOf != -1) {
                    hashMap.put(str2.substring(0, indexOf), str2.substring(indexOf + 1));
                }
            }
        }
        return hashMap;
    }

    public static boolean a(java.util.HashMap hashMap) {
        if (hashMap == null || hashMap.isEmpty()) {
            return false;
        }
        java.util.Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            try {
                java.lang.Integer.parseInt((java.lang.String) ((java.util.Map.Entry) it.next()).getValue());
            } catch (java.lang.Throwable unused) {
                return false;
            }
        }
        return true;
    }
}
