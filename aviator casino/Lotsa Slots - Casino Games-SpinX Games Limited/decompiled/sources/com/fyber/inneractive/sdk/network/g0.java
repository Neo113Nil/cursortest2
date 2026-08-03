package com.fyber.inneractive.sdk.network;

/* loaded from: classes3.dex */
public final class g0 {
    public static final com.fyber.inneractive.sdk.network.g0 c = new com.fyber.inneractive.sdk.network.g0();

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.network.k f3839a = new com.fyber.inneractive.sdk.network.k();
    public com.fyber.inneractive.sdk.network.p1 b;

    public final com.fyber.inneractive.sdk.network.h a() {
        java.lang.String str;
        if (this.b == null) {
            try {
                str = java.lang.System.getProperty("fyber.marketplace.http_executor_stack_name");
            } catch (java.lang.Throwable unused) {
                str = "hurl";
            }
            if (str != null && str.equals("okhttp")) {
                try {
                    java.lang.Class.forName("okhttp3.OkHttpClient");
                    this.b = new com.fyber.inneractive.sdk.network.p1();
                } catch (java.lang.ClassNotFoundException unused2) {
                }
            }
        }
        com.fyber.inneractive.sdk.network.p1 p1Var = this.b;
        return p1Var != null ? p1Var : this.f3839a;
    }
}
