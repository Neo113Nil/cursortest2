package com.ironsource;

/* renamed from: com.ironsource.xb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3366xb {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.C3366xb.a f6835a;
    protected long b;

    /* renamed from: com.ironsource.xb$a */
    private class a extends java.lang.Thread {

        /* renamed from: a, reason: collision with root package name */
        private android.os.Handler f6836a;

        private a() {
        }

        public android.os.Handler a() {
            return this.f6836a;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            android.os.Looper.prepare();
            this.f6836a = new android.os.Handler();
            android.os.Looper.loop();
        }
    }

    public C3366xb() {
        com.ironsource.C3366xb.a aVar = new com.ironsource.C3366xb.a();
        this.f6835a = aVar;
        aVar.start();
        this.b = new java.util.Date().getTime();
    }

    protected boolean a(java.lang.Object obj) {
        return (obj == null || this.f6835a == null) ? false : true;
    }

    protected void a(java.lang.Runnable runnable) {
        android.os.Handler a2;
        com.ironsource.C3366xb.a aVar = this.f6835a;
        if (aVar == null || (a2 = aVar.a()) == null) {
            return;
        }
        a2.post(runnable);
    }
}
