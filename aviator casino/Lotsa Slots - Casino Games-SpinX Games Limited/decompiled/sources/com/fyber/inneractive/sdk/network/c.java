package com.fyber.inneractive.sdk.network;

/* loaded from: classes3.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3833a;
    public final /* synthetic */ long b;
    public final /* synthetic */ com.fyber.inneractive.sdk.network.f c;

    public c(com.fyber.inneractive.sdk.network.f fVar, int i, long j) {
        this.c = fVar;
        this.f3833a = i;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.d.sendEmptyMessageDelayed(this.f3833a, this.b);
    }
}
