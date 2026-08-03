package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class jd {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private long f2692;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private java.lang.String f2693;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.jd.d f2694;

    public jd(java.lang.String str, int i, java.lang.String str2, long j) {
        this.f2693 = str;
        this.f2692 = j;
        this.f2694 = new com.ironsource.adqualitysdk.sdk.i.jd.d(i, str2);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final java.lang.String m8127() {
        return this.f2693;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final org.json.JSONObject m8126() throws org.json.JSONException {
        if (!android.text.TextUtils.isEmpty(this.f2693)) {
            return new org.json.JSONObject(this.f2693);
        }
        return new org.json.JSONObject();
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final com.ironsource.adqualitysdk.sdk.i.jd.d m8125() {
        return this.f2694;
    }

    public static class d {

        /* renamed from: ﻐ, reason: contains not printable characters */
        private int f2695;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private java.lang.String f2696;

        public d(int i, java.lang.String str) {
            this.f2695 = i;
            this.f2696 = str;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        public final int m8128() {
            return this.f2695;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        public final java.lang.String m8129() {
            return this.f2696;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final long m8124() {
        return this.f2692;
    }
}
