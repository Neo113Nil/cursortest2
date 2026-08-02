package com.plaid.internal;

/* renamed from: com.plaid.internal.s0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0635s0 implements com.plaid.internal.InterfaceC0571k7 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.plaid.internal.C0680x0 f6563a;

    @Override // com.plaid.internal.InterfaceC0571k7
    public final com.plaid.internal.C0536h a(java.lang.Object obj, com.plaid.internal.C0608p c0608p) {
        try {
            return com.plaid.internal.C0536h.a(a((com.plaid.internal.InterfaceC0643t) obj, c0608p));
        } catch (java.lang.Exception e) {
            return com.plaid.internal.C0536h.a(e);
        }
    }

    static {
        com.plaid.internal.W3 w3 = com.plaid.internal.Z3.f5986a;
        f6563a = new com.plaid.internal.C0680x0("auth");
    }

    public static java.lang.String a(com.plaid.internal.InterfaceC0643t interfaceC0643t, com.plaid.internal.C0608p c0608p) {
        com.plaid.internal.InterfaceC0529g1 c0547i1;
        long j;
        java.lang.String b = interfaceC0643t.b();
        java.util.LinkedHashMap b2 = com.plaid.internal.AbstractC0663v1.b(b);
        if (b2.containsKey("testVfp")) {
            java.util.LinkedHashMap b3 = com.plaid.internal.AbstractC0663v1.b(b);
            try {
                j = java.lang.Long.parseLong((java.lang.String) b3.get("delay"));
            } catch (java.lang.Exception unused) {
                j = 0;
            }
            java.lang.String str = (java.lang.String) b3.get("testVfp");
            java.lang.String str2 = (java.lang.String) com.plaid.internal.AbstractC0663v1.b(b).get("cid");
            if (str2 == null) {
                java.util.LinkedHashMap b4 = com.plaid.internal.AbstractC0663v1.b(b);
                str2 = (java.lang.String) b4.get("vfp");
                if (str2 == null) {
                    str2 = (java.lang.String) b4.get(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY);
                }
            }
            c0547i1 = new com.plaid.internal.C0538h1(j, str, str2);
        } else if (androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D.equals((java.lang.String) b2.get("pfflow"))) {
            f6563a.a(com.plaid.internal.W3.INFO, "flow v2 detected", new java.lang.Object[0]);
            c0547i1 = com.plaid.internal.C0556j1.a(b);
        } else {
            f6563a.a(com.plaid.internal.W3.INFO, "flow v1 detected", new java.lang.Object[0]);
            com.plaid.internal.C0680x0 c0680x0 = com.plaid.internal.C0547i1.b;
            if (!"f".equals(com.plaid.internal.AbstractC0663v1.b(b).get("r"))) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(b);
                sb.append(b.indexOf(63) == -1 ? com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION : "&");
                sb.append("r=f");
                b = sb.toString();
            }
            try {
                new java.net.URL(b);
                c0547i1 = new com.plaid.internal.C0547i1(b);
            } catch (java.net.MalformedURLException unused2) {
                throw new com.plaid.internal.C0617q(com.plaid.internal.T0.AUTH_MALFORMED_INPUT_DATA, "Malformed url ".concat(java.lang.String.valueOf(b)));
            }
        }
        return c0547i1.a(interfaceC0643t.a(), c0608p);
    }
}
