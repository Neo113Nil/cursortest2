package com.fyber.inneractive.sdk.flow;

/* loaded from: classes4.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f5329a;

    public c(d dVar) {
        this.f5329a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.util.r.b.post(this.f5329a.c);
    }
}
