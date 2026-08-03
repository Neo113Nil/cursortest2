package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Og extends io.appmetrica.analytics.impl.Rg {
    public Og(io.appmetrica.analytics.impl.X4 x4) {
        super(x4);
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(io.appmetrica.analytics.impl.P5 p5) {
        java.lang.String value = p5.getValue();
        if (android.text.TextUtils.isEmpty(value)) {
            return false;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(value);
            if (!"open".equals(jSONObject.optString("type"))) {
                return false;
            }
            io.appmetrica.analytics.impl.C0833xo c0833xo = this.f4907a.t;
            synchronized (c0833xo) {
                c0833xo.c(c0833xo.b() + 1);
            }
            if (!a(jSONObject.optString("link"))) {
                return false;
            }
            p5.f4826n = java.lang.Boolean.TRUE;
            b();
            return false;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public final void b() {
        io.appmetrica.analytics.impl.C0833xo c0833xo = this.f4907a.t;
        synchronized (c0833xo) {
            c0833xo.a(c0833xo.a() + 1);
        }
        this.f4907a.z();
        io.appmetrica.analytics.impl.M8 m8 = this.f4907a.f5266l;
        if (m8.f4652c == null) {
            m8.a();
        }
        io.appmetrica.analytics.impl.O8 o8 = m8.f4652c;
        o8.getClass();
        o8.f4765b = new java.util.HashSet();
        o8.f4767d = 0;
        io.appmetrica.analytics.impl.O8 o82 = m8.f4652c;
        o82.f4764a = true;
        io.appmetrica.analytics.impl.R8 r8 = m8.f4651b;
        io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper iBinaryDataHelper = r8.f4899c;
        io.appmetrica.analytics.impl.Q8 q8 = r8.f4898b;
        r8.f4897a.getClass();
        iBinaryDataHelper.insert("event_hashes", q8.toByteArray((io.appmetrica.analytics.impl.Q8) io.appmetrica.analytics.impl.P8.a(o82)));
    }

    public final boolean a(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            try {
                java.lang.String queryParameter = android.net.Uri.parse(str).getQueryParameter("referrer");
                if (!android.text.TextUtils.isEmpty(queryParameter)) {
                    io.appmetrica.analytics.impl.C0526m2 c0526m2 = this.f4907a.t().f5934y;
                    for (java.lang.String str2 : android.net.Uri.decode(queryParameter).split("&")) {
                        java.lang.String decode = android.net.Uri.decode(str2);
                        int indexOf = decode.indexOf("=");
                        if (indexOf >= 0 && a(android.net.Uri.decode(decode.substring(0, indexOf)), android.net.Uri.decode(decode.substring(indexOf + 1)), c0526m2)) {
                            return true;
                        }
                    }
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        return false;
    }

    public static boolean a(java.lang.String str, java.lang.String str2, io.appmetrica.analytics.impl.C0526m2 c0526m2) {
        java.lang.Object obj;
        if ("reattribution".equals(str) && "1".equals(str2)) {
            return true;
        }
        if (c0526m2 == null) {
            return false;
        }
        for (android.util.Pair pair : c0526m2.f6383a) {
            if (io.appmetrica.analytics.impl.AbstractC0522lo.a(pair.first, str) && ((obj = pair.second) == null || ((io.appmetrica.analytics.impl.C0500l2) obj).f6321a.equals(str2))) {
                return true;
            }
        }
        return false;
    }
}
