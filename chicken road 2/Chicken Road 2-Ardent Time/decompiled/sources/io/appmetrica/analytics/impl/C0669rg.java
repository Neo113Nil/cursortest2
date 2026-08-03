package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.rg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0669rg {
    public static io.appmetrica.analytics.impl.J7 a(java.lang.String str) {
        java.util.HashMap hashMap;
        java.util.HashMap b2 = b(str);
        if (b2.isEmpty()) {
            b2 = b(android.net.Uri.decode(str));
        }
        java.lang.String decode = android.net.Uri.decode((java.lang.String) b2.get("appmetrica_deep_link"));
        if (android.text.TextUtils.isEmpty(decode)) {
            hashMap = null;
        } else {
            java.util.HashMap b3 = b(decode);
            hashMap = new java.util.HashMap(b3.size());
            for (java.util.Map.Entry entry : b3.entrySet()) {
                hashMap.put(android.net.Uri.decode((java.lang.String) entry.getKey()), android.net.Uri.decode((java.lang.String) entry.getValue()));
            }
        }
        return new io.appmetrica.analytics.impl.J7(decode, hashMap, str);
    }

    public static java.util.HashMap b(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (str != null) {
            int lastIndexOf = str.lastIndexOf(63);
            if (lastIndexOf >= 0) {
                str = str.substring(lastIndexOf + 1);
            }
            if (str.contains("=")) {
                for (java.lang.String str2 : str.split("&")) {
                    int indexOf = str2.indexOf("=");
                    if (indexOf >= 0) {
                        hashMap.put(str2.substring(0, indexOf), str2.substring(indexOf + 1));
                    } else {
                        hashMap.put(str2, "");
                    }
                }
            }
        }
        return hashMap;
    }
}
