package com.fyber.inneractive.sdk.web;

/* loaded from: classes3.dex */
public final class e {
    public com.fyber.inneractive.sdk.util.e c;
    public com.fyber.inneractive.sdk.util.d d;
    public final /* synthetic */ java.lang.String g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ java.lang.String i;
    public final /* synthetic */ java.lang.String j;
    public final /* synthetic */ java.lang.String k;
    public final /* synthetic */ com.fyber.inneractive.sdk.web.i l;
    public android.os.Handler b = null;
    public final java.lang.Object e = new java.lang.Object();
    public boolean f = false;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ExecutorService f4331a = java.util.concurrent.Executors.newSingleThreadExecutor(new com.fyber.inneractive.sdk.util.b());

    public e(com.fyber.inneractive.sdk.web.i1 i1Var, java.lang.String str, boolean z, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.l = i1Var;
        this.g = str;
        this.h = z;
        this.i = str2;
        this.j = str3;
        this.k = str4;
    }

    public final android.os.Handler a() {
        if (this.b == null) {
            synchronized (this.e) {
                this.b = new android.os.Handler(android.os.Looper.getMainLooper());
            }
        }
        return this.b;
    }
}
