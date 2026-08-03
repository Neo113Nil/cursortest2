package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.fb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0354fb extends org.json.JSONObject {
    public C0354fb() {
    }

    public final java.lang.Long a(java.lang.String str) {
        try {
            return java.lang.Long.valueOf(getLong(str));
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public final java.lang.String b(java.lang.String str) {
        if (has(str)) {
            try {
                return getString(str);
            } catch (java.lang.Throwable unused) {
            }
        }
        return "";
    }

    public C0354fb(java.lang.String str) {
        super(str);
    }
}
