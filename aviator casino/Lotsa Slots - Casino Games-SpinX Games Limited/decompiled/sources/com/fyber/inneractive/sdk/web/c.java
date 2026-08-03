package com.fyber.inneractive.sdk.web;

/* loaded from: classes3.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.web.i f4327a;

    public c(com.fyber.inneractive.sdk.web.i1 i1Var) {
        this.f4327a = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.util.IAlog.e("Removing clicked state after timeout", new java.lang.Object[0]);
        this.f4327a.i();
    }
}
