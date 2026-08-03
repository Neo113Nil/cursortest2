package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class io {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.ir f2553;

    /* renamed from: ｋ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.ip f2554;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private android.content.Context f2555;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private java.lang.String f2556;

    public io(android.content.Context context, java.lang.String str, java.lang.String str2) {
        this.f2555 = context.getApplicationContext();
        this.f2556 = str2;
        this.f2553 = new com.ironsource.adqualitysdk.sdk.i.ir(this.f2555, str);
        this.f2554 = new com.ironsource.adqualitysdk.sdk.i.ip(com.ironsource.adqualitysdk.sdk.i.im.f2552, this.f2555.getPackageName(), com.ironsource.adqualitysdk.sdk.i.iq.m8090(this.f2555), this.f2556);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final int m8082(java.lang.String str) {
        try {
            return this.f2553.m8096(str);
        } catch (java.lang.Throwable unused) {
            return 0;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final java.util.HashMap<java.lang.String, java.lang.String> m8079(java.lang.String str, int i) {
        try {
            java.util.HashMap<java.lang.String, java.lang.String> m8099 = this.f2553.m8099(str, i);
            java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
            for (java.lang.String str2 : m8099.keySet()) {
                java.lang.String str3 = m8099.get(str2);
                if (str3 != null && !android.text.TextUtils.isEmpty(str3)) {
                    try {
                        hashMap.put(str2, this.f2554.m8087(str3));
                    } catch (com.ironsource.adqualitysdk.sdk.i.ip.d unused) {
                    }
                }
            }
            return hashMap;
        } catch (java.lang.Throwable unused2) {
            return null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final java.lang.String m8078(java.lang.String str) {
        try {
            java.lang.String m8100 = this.f2553.m8100(str);
            if (m8100 == null || android.text.TextUtils.isEmpty(m8100)) {
                return m8100;
            }
            try {
                return this.f2554.m8087(m8100);
            } catch (com.ironsource.adqualitysdk.sdk.i.ip.d unused) {
                return "";
            }
        } catch (java.lang.Throwable unused2) {
            return null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m8080(java.lang.String str) {
        try {
            this.f2553.m8098(str);
        } catch (java.lang.Throwable unused) {
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m8081(java.lang.String str, java.lang.String str2) {
        try {
            this.f2553.m8097(str, this.f2554.m8088(str2));
        } catch (java.lang.Throwable unused) {
        }
    }
}
