package com.fyber.inneractive.sdk.network;

/* loaded from: classes4.dex */
public final class g0 {
    public static final g0 c = new g0();

    /* renamed from: a, reason: collision with root package name */
    public final k f5493a = new k();
    public p1 b;

    public final h a() {
        String str;
        if (this.b == null) {
            try {
                str = System.getProperty("fyber.marketplace.http_executor_stack_name");
            } catch (Throwable unused) {
                str = "hurl";
            }
            if (str != null && str.equals("okhttp")) {
                try {
                    Class.forName("okhttp3.OkHttpClient");
                    this.b = new p1();
                } catch (ClassNotFoundException unused2) {
                }
            }
        }
        p1 p1Var = this.b;
        return p1Var != null ? p1Var : this.f5493a;
    }
}
