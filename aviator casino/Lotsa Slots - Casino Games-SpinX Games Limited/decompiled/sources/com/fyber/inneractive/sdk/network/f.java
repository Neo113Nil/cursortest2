package com.fyber.inneractive.sdk.network;

/* loaded from: classes3.dex */
public final class f implements com.fyber.inneractive.sdk.util.e1 {
    public com.fyber.inneractive.sdk.util.d1 d;
    public int e;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.LinkedBlockingQueue f3838a = new java.util.concurrent.LinkedBlockingQueue();
    public org.json.JSONArray b = new org.json.JSONArray();
    public boolean f = false;
    public boolean g = false;
    public final android.os.HandlerThread c = new android.os.HandlerThread("EventCollectorHandlerThread", 0);

    public final void a(android.app.Application application) {
        if (!this.g) {
            this.g = true;
            this.c.start();
            com.fyber.inneractive.sdk.util.d1 d1Var = new com.fyber.inneractive.sdk.util.d1(this.c.getLooper(), this);
            this.d = d1Var;
            this.f = true;
            this.e = 30;
            if (d1Var.hasMessages(12312329)) {
                this.d.removeMessages(12312329);
            }
            long j = this.e * 1000;
            com.fyber.inneractive.sdk.util.d1 d1Var2 = this.d;
            if (d1Var2 != null) {
                d1Var2.post(new com.fyber.inneractive.sdk.network.c(this, 12312329, j));
            }
        }
        application.registerActivityLifecycleCallbacks(new com.fyber.inneractive.sdk.network.d(this));
    }
}
