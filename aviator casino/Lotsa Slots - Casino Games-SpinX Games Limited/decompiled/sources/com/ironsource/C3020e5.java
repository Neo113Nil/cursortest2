package com.ironsource;

/* renamed from: com.ironsource.e5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3020e5 implements com.ironsource.InterfaceC3380y7 {
    private static final int e = 5;
    private static com.ironsource.C3020e5 f;

    /* renamed from: a, reason: collision with root package name */
    private com.ironsource.HandlerC3002d5 f6210a;
    private final org.json.JSONObject b;
    private java.lang.Thread c;
    private final java.lang.String d;

    private C3020e5(java.lang.String str, com.ironsource.Q7 q7, org.json.JSONObject jSONObject) {
        this.d = str;
        this.f6210a = new com.ironsource.HandlerC3002d5(q7.a());
        this.b = jSONObject;
        com.ironsource.sdk.utils.IronSourceStorageUtils.deleteFolder(b());
        com.ironsource.sdk.utils.IronSourceStorageUtils.makeDir(b());
    }

    public static synchronized com.ironsource.C3020e5 a(java.lang.String str, com.ironsource.Q7 q7, org.json.JSONObject jSONObject) {
        com.ironsource.C3020e5 c3020e5;
        synchronized (com.ironsource.C3020e5.class) {
            if (f == null) {
                f = new com.ironsource.C3020e5(str, q7, jSONObject);
            }
            c3020e5 = f;
        }
        return c3020e5;
    }

    private java.lang.Thread b(com.ironsource.C3381y8 c3381y8, java.lang.String str, int i, int i2, android.os.Handler handler) {
        if (i <= 0) {
            i = this.b.optInt("connectionTimeout", 5);
        }
        if (i2 <= 0) {
            i2 = this.b.optInt("readTimeout", 5);
        }
        boolean optBoolean = this.b.optBoolean(com.ironsource.Z3.H, false);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        return a(new com.ironsource.C2966b5(c3381y8, str, (int) timeUnit.toMillis(i), (int) timeUnit.toMillis(i2), optBoolean, b()), handler);
    }

    public boolean c() {
        java.lang.Thread thread = this.c;
        return thread != null && thread.isAlive();
    }

    public synchronized void d() {
        f = null;
        com.ironsource.HandlerC3002d5 handlerC3002d5 = this.f6210a;
        if (handlerC3002d5 != null) {
            handlerC3002d5.a();
            this.f6210a = null;
        }
    }

    @Override // com.ironsource.InterfaceC3380y7
    public void a(com.ironsource.Nc nc) {
        this.f6210a.a(nc);
    }

    private java.lang.Thread a(com.ironsource.C2966b5 c2966b5, android.os.Handler handler) {
        return new java.lang.Thread(new com.ironsource.RunnableC3406zf(c2966b5, handler));
    }

    @Override // com.ironsource.InterfaceC3380y7
    public void a(com.ironsource.C3381y8 c3381y8, java.lang.String str, int i, int i2, android.os.Handler handler) {
        b(c3381y8, str, i, i2, handler).start();
    }

    @Override // com.ironsource.InterfaceC3380y7
    public void a(com.ironsource.C3381y8 c3381y8, java.lang.String str, int i, int i2) {
        b(c3381y8, str, i, i2, this.f6210a).start();
    }

    @Override // com.ironsource.InterfaceC3380y7
    public void a(com.ironsource.C3381y8 c3381y8, java.lang.String str) {
        int optInt = this.b.optInt("connectionTimeout", 5);
        int optInt2 = this.b.optInt("readTimeout", 5);
        boolean optBoolean = this.b.optBoolean(com.ironsource.Z3.H, false);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        java.lang.Thread a2 = a(new com.ironsource.C2966b5(c3381y8, str, (int) timeUnit.toMillis(optInt), (int) timeUnit.toMillis(optInt2), optBoolean, b()), this.f6210a);
        this.c = a2;
        a2.start();
    }

    private java.lang.String b() {
        return com.ironsource.sdk.utils.IronSourceStorageUtils.buildAbsolutePathToDirInCache(this.d, com.ironsource.Z3.D);
    }

    public java.lang.String a() {
        return this.d;
    }
}
