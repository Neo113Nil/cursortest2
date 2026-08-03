package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class D8 {
    public static java.util.HashMap a() {
        java.lang.String str;
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            hashMap.put("mk-version", com.inmobi.media.Yi.a());
            com.inmobi.media.C2764t1 c2764t1 = com.inmobi.media.Qk.f4922a;
            java.lang.Boolean bool = c2764t1 != null ? c2764t1.c : null;
            if (bool != null) {
                hashMap.put("u-id-adt", bool.booleanValue() ? "1" : "0");
            }
            hashMap.put("ts", java.lang.String.valueOf(java.util.Calendar.getInstance().getTimeInMillis()));
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            hashMap.put("tz", java.lang.String.valueOf(calendar.get(16) + calendar.get(15)));
            com.inmobi.media.C2386ej.f5183a.getClass();
            java.util.HashMap hashMap2 = new java.util.HashMap();
            if (com.inmobi.media.C2386ej.e && (str = com.inmobi.media.C2386ej.d) != null) {
                hashMap2.put("u-s-id", str);
            }
            hashMap.putAll(hashMap2);
            return hashMap;
        } catch (java.lang.Exception e) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("D8", "TAG");
            e.getMessage();
            return hashMap;
        }
    }
}
