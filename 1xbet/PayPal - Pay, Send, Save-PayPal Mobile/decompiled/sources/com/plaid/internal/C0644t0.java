package com.plaid.internal;

/* renamed from: com.plaid.internal.t0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0644t0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.C0680x0 f6571a;
    public final java.lang.String b;
    public final int c;

    public C0644t0() {
        com.plaid.internal.W3 w3 = com.plaid.internal.Z3.f5986a;
        this.f6571a = new com.plaid.internal.C0680x0("connectivity-validator");
        this.b = "https://clients3.google.com/generate_204";
        this.c = 10000;
    }

    public final boolean a(com.plaid.internal.C0455b c0455b) {
        boolean z;
        int i;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        while (true) {
            z = false;
            try {
                com.plaid.internal.InterfaceC0627r1.b a2 = c0455b.a(new com.plaid.internal.InterfaceC0627r1.a(this.b, false, null, -1));
                com.plaid.internal.C0680x0 c0680x0 = this.f6571a;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("response status ");
                sb.append(a2.b);
                c0680x0.a(com.plaid.internal.W3.TRACE, sb.toString(), new java.lang.Object[0]);
                int i2 = a2.b;
                if (i2 >= 200 && i2 < 300) {
                    z = true;
                }
            } catch (java.io.IOException e) {
                this.f6571a.a(e, "cannot reach test endpoint");
            }
            if (z || ((i = this.c) > 0 && i + currentTimeMillis <= java.lang.System.currentTimeMillis())) {
                break;
            }
        }
        this.f6571a.a(com.plaid.internal.W3.TRACE, "httpclient %s", z ? androidx.browser.customtabs.CustomTabsCallback.ONLINE_EXTRAS_KEY : "offline");
        return z;
    }
}
