package com.ironsource;

/* loaded from: classes5.dex */
public class L6 {
    public static java.lang.String a(java.lang.String str) {
        try {
            return new java.lang.String(android.util.Base64.decode(str, 0), "UTF-8");
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }

    static java.lang.String b(java.lang.String str) {
        return android.util.Base64.encodeToString(str.getBytes(), 10);
    }
}
