package com.ironsource;

/* renamed from: com.ironsource.zf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
class RunnableC3406zf implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final android.os.Handler f6864a;
    private final com.ironsource.C2966b5 b;

    RunnableC3406zf(com.ironsource.C2966b5 c2966b5, android.os.Handler handler) {
        this.b = c2966b5;
        this.f6864a = handler;
    }

    com.ironsource.X5 a(com.ironsource.C2966b5 c2966b5, java.lang.String str, long j) {
        return new com.ironsource.X5(c2966b5, str, j);
    }

    @Override // java.lang.Runnable
    public void run() {
        com.ironsource.C3381y8 c3381y8 = new com.ironsource.C3381y8(this.b.b().getParent(), this.b.b().getName());
        android.os.Message a2 = a();
        a2.obj = c3381y8;
        java.lang.String a3 = a(c3381y8.getParent());
        if (a3 == null) {
            a2.what = 1020;
            this.f6864a.sendMessage(a2);
        } else {
            com.ironsource.C2984c5 call = a(new com.ironsource.C2966b5(c3381y8, this.b.e(), this.b.a(), this.b.c(), this.b.f(), this.b.d()), a3, 3L).call();
            a2.what = call.b() == 200 ? 1016 : call.b();
            this.f6864a.sendMessage(a2);
        }
    }

    android.os.Message a() {
        return new android.os.Message();
    }

    java.lang.String a(java.lang.String str) {
        return com.ironsource.sdk.utils.IronSourceStorageUtils.makeDir(str);
    }
}
