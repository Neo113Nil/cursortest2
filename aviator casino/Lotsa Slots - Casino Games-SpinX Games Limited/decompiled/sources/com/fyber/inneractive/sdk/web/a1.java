package com.fyber.inneractive.sdk.web;

/* loaded from: classes3.dex */
public final class a1 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.web.b1 f4325a;

    public a1(com.fyber.inneractive.sdk.web.b1 b1Var) {
        this.f4325a = b1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f4325a.f4326a.evictAll();
        } catch (java.lang.Throwable unused) {
        }
    }
}
