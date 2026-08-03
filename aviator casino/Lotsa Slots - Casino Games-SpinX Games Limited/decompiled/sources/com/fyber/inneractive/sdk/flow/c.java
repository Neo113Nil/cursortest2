package com.fyber.inneractive.sdk.flow;

/* loaded from: classes3.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.flow.d f3676a;

    public c(com.fyber.inneractive.sdk.flow.d dVar) {
        this.f3676a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.util.r.b.post(this.f3676a.c);
    }
}
