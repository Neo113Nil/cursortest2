package com.fyber.inneractive.sdk.web;

/* loaded from: classes3.dex */
public final class o0 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f4347a;
    public final /* synthetic */ com.fyber.inneractive.sdk.web.v0 b;

    public o0(com.fyber.inneractive.sdk.web.v0 v0Var, java.lang.String str) {
        this.b = v0Var;
        this.f4347a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.util.IAlog.a("injecting JS: %s", this.f4347a);
        try {
            java.lang.String str = this.f4347a;
            if (str != null) {
                com.fyber.inneractive.sdk.util.q0.a(this.b.f4361a, str);
            }
        } catch (java.lang.Exception unused) {
            com.fyber.inneractive.sdk.util.IAlog.a("Failed to inject JS", new java.lang.Object[0]);
        }
    }
}
